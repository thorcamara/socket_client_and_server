/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author User
 */
import java.net.*;
import java.io.*;
import javax.swing.*;
public class Principal {
public static void main(String args[]) {
try{
Socket servidor = new Socket("localhost",4444);//endereco e porta
PrintWriter out = new PrintWriter(
servidor.getOutputStream(),true);
String mensagem="";
while(!mensagem.equals("fim")) {
mensagem = JOptionPane.
showInputDialog("Digite a Mensagem ou fim para sair");
out.println(mensagem); //escreve a mensagem
}
} catch(IOException io) {
System.err.println("Problemas de IO");
}
}
}
