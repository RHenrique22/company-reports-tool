package br.edu.ifpb.companyreportstool.service;

public class HTMLReport implements ReportExport {

    @Override
    public String writerHeader(String title) {
        return String.format(
            "<header><h1>%s</h1></header>", 
            title
        );
    }

    @Override
    public String writerBody(String subtitle, String content) {

        String format = String.format(
            "<main><h2>%s</h2>", 
            subtitle
        );

        format += String.format(
            "<p>%s</p></main>",
            content
        );

        return format;
    }

    @Override
    public String writerFooter(String footer) {
        return String.format(
            "<footer>%s</footer>", 
            footer
        );
    }

}
