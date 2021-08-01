package com.example.qualina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class CationGroupViewer extends AppCompatActivity implements OnPageChangeListener, OnLoadCompleteListener {

    public static final String SAMPLE_FILE = "file_example_PDF_1MB.pdf";
    public static final String PDF_CATIONA = "pdf_cation_a.pdf";
    public static final String PDF_CATIONB = "pdf_cation_b.pdf";
    public static final String PDF_CATIONC = "pdf_cation_c.pdf";
    public static final String PDF_CATIOND = "pdf_cation_d.pdf";
    public static final String PDF_CATIONE = "pdf_cation_e.pdf";
    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName, pdffilefromextra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cation_group_viewer);

        pdfView= (PDFView)findViewById(R.id.pdfView);
        pdffilefromextra = getIntent().getStringExtra("Group Cations");
        if (pdffilefromextra.equals("Group A")) {
            displayFromAsset(PDF_CATIONA);
        } else if (pdffilefromextra.equals("Group B")) {
            displayFromAsset(PDF_CATIONB);
        } else if (pdffilefromextra.equals("Group C")) {
            displayFromAsset(PDF_CATIONC);
        } else if (pdffilefromextra.equals("Group D")) {
            displayFromAsset(PDF_CATIOND);
        } else if (pdffilefromextra.equals("Group E")) {
            displayFromAsset(PDF_CATIONE);
        }else {
            Toast.makeText(this, "OOPS! Something went wrong.", Toast.LENGTH_SHORT).show();
        }

    }
    private void displayFromAsset(String assetFileName) {
        pdfFileName = assetFileName;

        pdfView.fromAsset(pdfFileName)
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        if (pdfFileName.equalsIgnoreCase("pdf_cation_a.pdf")) {
            setTitle(String.format("%s %s / %s", "General Flowchart - Group A", page + 1, pageCount));
        } else if (pdfFileName.equalsIgnoreCase("pdf_cation_b.pdf")) {
            setTitle(String.format("%s %s / %s", "General Flowchart - Group B", page + 1, pageCount));
        } else if (pdfFileName.equalsIgnoreCase("pdf_cation_c.pdf")) {
            setTitle(String.format("%s %s / %s", "General Flowchart - Group C", page + 1, pageCount));
        } else if (pdfFileName.equalsIgnoreCase("pdf_cation_d.pdf")) {
            setTitle(String.format("%s %s / %s", "General Flowchart - Group D", page + 1, pageCount));
        } else {
            setTitle(String.format("%s %s / %s", "General Flowchart - Group E", page + 1, pageCount));
        }
    }


    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");

    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            Log.e("PDF TAG", String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}