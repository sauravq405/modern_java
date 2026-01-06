package org.example;

public class FeatureFive {
    //FEATURE FOUR: MULTI LINE STRING
    //Multi Line String introduced in Java 15
    //
    static void main() {
        //old way
        String s = "<html>" +
                "" +
                "" +
                "" +
                "" +
                "</html>";

        String html = """
                
                <html>
                
                <head> 
                
                </head>
                
                <body>
                
                "";
                
                </body>
                
                </html>
                
                
                
                """;

        System.out.println(html);



    }
}
