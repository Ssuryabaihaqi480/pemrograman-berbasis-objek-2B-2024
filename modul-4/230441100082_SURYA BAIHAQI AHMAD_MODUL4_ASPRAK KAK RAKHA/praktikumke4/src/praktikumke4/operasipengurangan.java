/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumke4;

///**
// *
// * @author H
// */
//public class operasipengurangan {
//    
//}
//package modul5;

class OperasiPengurangan extends BilanganAbs {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        this.c = a - b;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        return c;
    }

    @Override
    protected void tampil() {
        System.out.println("x P E N G U R A N G A N");
        System.out.println("x " + get_A() + " - " + get_B() + " = " + get_C());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
