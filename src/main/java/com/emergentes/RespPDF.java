package com.emergentes;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        OutputStream out=response.getOutputStream();
        try {
            Document documento=new Document();
            PdfWriter.getInstance(documento,out);
            documento.open();
            documento.add(new Paragraph("German miranda"));
            documento.add(new Paragraph("--------------------------------------- "));
            documento.add(new Paragraph("Reporte de ventas"));
            documento.add(new Paragraph("--------------------------------------- "));
            
            documento.close();
        } catch (Exception ex) {
            ex.getMessage();
        } 
        finally{
        }
    }
    
    
    
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    
    }

}
