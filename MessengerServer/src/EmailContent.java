/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;


public interface EmailContent {
    
    String HEADER_WELCOME = "WELCOME! LET'S CHAT";
    
    String BODY_WELCOME = "<!DOCTYPE html>\n" +
                                        "<html>\n" +
                                        "<head>\n" +
                                        "</head>\n" +
                                        "<body>\n" +
                                        "<h2> <strong>HELLO!</strong></h2>\n" +
                                        "<p><h3> WELCOME TO <strong style=\"color:#ff794d\"><i>LET'S CHAT!</i></strong></h3></p>\n" +
                                        "<p>You have just joined the best <i>CHAT</i> to share your thoughts, ideas with <br/>\n" +
                                        "your family, friends and colleagues. We are glad you are here.</p>\n" +
                                        "\n" +
                                        "<br/>\n" +
                                        "<br/>\n" +
                                        "<p>Sincerely,</p>\n" +
                                        "<p><i style=\"color:#ff794d\">Let's Chat Team</i></p>\n" +
                                        "\n" +
                                        "<br/>\n" +
                                        "<hr>\n" +
                                        "<footer>Copyright &copy; Let's Chat, 2018</footer>\n" +
                                        "\n" +
                                        "</body>\n" +
                                        "</html>";
    
    

}
