/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterGetter;

/**
 *
 * @author X1
 */
public class Maintugassettergetter {
    public static void main(String[] args) {
        Tugassettergetter customer = new Tugassettergetter();
        customer.SetNama("Ega June");
        customer.SetNo_Pelanggan("123789");
        
        System.out.println("Nama pelanggan : "+customer.GetNama());
        System.out.println("Nomor Pelanggan : "+customer.GetNo_Pelanggan());
    }
}