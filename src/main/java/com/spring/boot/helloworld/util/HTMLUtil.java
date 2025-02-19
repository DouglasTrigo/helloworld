package com.spring.boot.helloworld.util;

public class HTMLUtil {

    private HTMLUtil(){

    }

    public static String getHelloWorldHTML(){
        return """
                <!DOCTYPE html>
                <head>
                    <title>HTML and CSS "Hello World"</title>
                    <style>
                        body {
                            background-color: #2D2D2D;
                        }
                        
                        h1 {
                            color: #C26356;
                            font-size: 30px;
                            font-family: Menlo, Monaco, fixed-width;
                        }
                        
                        p {
                            color: white;
                            font-family: "Source Code Pro", Menlo, Monaco, fixed-width;
                        }
                    </style>
                </head>
                <body>
                    <h1>Hello World Example</h1>
                </body>
                </html>
            """;
    }

}
