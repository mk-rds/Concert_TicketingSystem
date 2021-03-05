/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


/**
 *
 * @author User
 */
public class StockRemaining {
    public static double bp_cat1 = 100;
    public static double bp_cat2 = 100;
    public static double bp_cat3 = 100;
    public static double bp_cat4 = 100;
    public static double bp_cat5 = 100;
    
    public static double jay_cat1 = 100;
    public static double jay_cat2 = 100;
    public static double jay_cat3 = 100;
    public static double jay_cat4 = 100;
    public static double jay_cat5 = 100;
    
    public static double taylor_cat1 = 100;
    public static double taylor_cat2 = 100;
    public static double taylor_cat3 = 100;
    public static double taylor_cat4 = 100;
    public static double taylor_cat5 = 100;
    
    public static double merch_1 = 100;
    public static double merch_2 = 100;
    public static double merch_3 = 100;
    
    public static boolean ticketOrder = true;
    
    
    public static void BPstock_cat1(double quantity){
        bp_cat1=bp_cat1-quantity;
        double remaining;
        remaining = bp_cat1;
        
      
    }
    
    public static void BPstock_cat2(double quantity){
        bp_cat2=bp_cat2-quantity;
        double remaining;
        remaining = bp_cat2;
        
    }
    
    public static void BPstock_cat3(double quantity){
        bp_cat3=bp_cat3-quantity;
        double remaining;
        remaining = bp_cat3;
        
    }
    
    public static void BPstock_cat4(double quantity){
        bp_cat4=bp_cat4-quantity;
        double remaining;
        remaining = bp_cat4;
       
    }
    
    public static void BPstock_cat5(double quantity){
        bp_cat5=bp_cat5-quantity;
        double remaining;
        remaining = bp_cat5;
        
    }
    
    public static void Jaystock_cat1(double quantity){
        jay_cat1=jay_cat1-quantity;
        double remaining;
        remaining = jay_cat1;
        
    }
    
    public static void Jaystock_cat2(double quantity){
        jay_cat2=jay_cat2-quantity;
        double remaining;
        remaining = jay_cat2;
       
    }
    
    public static void Jaystock_cat3(double quantity){
        jay_cat3=jay_cat3-quantity;
        double remaining;
        remaining = jay_cat3;
        
    }
    
    public static void Jaystock_cat4(double quantity){
        jay_cat4=jay_cat4-quantity;
        double remaining;
        remaining = jay_cat4;
       
    }
    
    public static void Jaystock_cat5(double quantity){
        jay_cat5=jay_cat5-quantity;
        double remaining;
        remaining = jay_cat5;
        
    }
    
     public static void Taylorstock_cat1(double quantity){
        taylor_cat1=taylor_cat1-quantity;
        double remaining;
        remaining = taylor_cat1;
        
    }
     
     public static void Taylorstock_cat2(double quantity){
        taylor_cat2=taylor_cat2-quantity;
        double remaining;
        remaining = taylor_cat2;
        
    }
     
     public static void Taylorstock_cat3(double quantity){
        taylor_cat3=taylor_cat3-quantity;
        double remaining;
        remaining = taylor_cat3;
        
    }
     
     public static void Taylorstock_cat4(double quantity){
        taylor_cat4=taylor_cat4-quantity;
        double remaining;
        remaining = taylor_cat4;
        
    }
     
     public static void Taylorstock_cat5(double quantity){
        taylor_cat5=taylor_cat5-quantity;
        double remaining;
        remaining = taylor_cat5;
        
    }
    
    public static void MerchStock_1(double quantity) {
        if (quantity <= merch_1) {
            merch_1 = merch_1 - quantity;
            double remaining;
            remaining = merch_1;
        } else {
        }
    }
    public static void MerchStock_2(double quantity) {
        if (quantity <= merch_2) {
            merch_2 = merch_2 - quantity;
            double remaining;
            remaining = merch_2;
        } else {
        }
    }

    public static void MerchStock_3(double quantity) {
        if (quantity <= merch_3) {
            merch_3 = merch_3 - quantity;
            double remaining;
            remaining = merch_3;
        } else {
        }
    }

    public static void BPstock_cat1(){
        
        System.out.println("[1] CAT1:" + (int)bp_cat1 );
    }
    
     public static void BPstock_cat2(){
        
        System.out.println("[2] CAT2:" + (int)bp_cat2);
    }
     
      public static void BPstock_cat3(){
        
        System.out.println("[3] CAT3:" + (int)bp_cat3);
    }
      
       public static void BPstock_cat4(){
        
        System.out.println("[4] CAT4:" + (int)bp_cat4);
    }
       
        public static void BPstock_cat5(){
        
        System.out.println("[5] CAT5:" + (int)bp_cat5);
    }
        
     public static void Jaystock_cat1(){
        
        System.out.println("[1] CAT1:" + (int)jay_cat1 );
    }
    
     public static void Jaystock_cat2(){
        
        System.out.println("[2] CAT2:" + (int)jay_cat2);
    }
     
      public static void Jaystock_cat3(){
        
        System.out.println("[3] CAT3:" + (int)jay_cat3);
    }
      
       public static void Jaystock_cat4(){
        
        System.out.println("[4] CAT4:" + (int)jay_cat4);
    }
       
        public static void Jaystock_cat5(){
        
        System.out.println("[5] CAT5:" + (int)jay_cat5);
    }
        
    public static void Taylorstock_cat1(){
        
        System.out.println("[1] CAT1:" + (int)taylor_cat1 );
    }
    
     public static void Taylorstock_cat2(){
        
        System.out.println("[2] CAT2:" + (int)taylor_cat2);
    }
     
      public static void Taylorstock_cat3(){
        
        System.out.println("[3] CAT3:" + (int)taylor_cat3);
    }
      
       public static void Taylorstock_cat4(){
        
        System.out.println("[4] CAT4:" + (int)taylor_cat4);
    }
       
        public static void Taylorstock_cat5(){
        
        System.out.println("[5] CAT5:" + (int)taylor_cat5);
    }
    
    
    
    public static void displayBP_stock(){
        BPstock_cat1();
        BPstock_cat2();
        BPstock_cat3();
        BPstock_cat4();
        BPstock_cat5();
       
        
        
    }
    
    public static void displayJay_stock(){
        Jaystock_cat1();
        Jaystock_cat2();
        Jaystock_cat3();
        Jaystock_cat4();
        Jaystock_cat5();
       
        
        
    }
    
    public static void displayTaylor_stock(){
        Taylorstock_cat1();
        Taylorstock_cat2();
        Taylorstock_cat3();
        Taylorstock_cat4();
        Taylorstock_cat5();
       
        
        
    }
    
    
    
    
}
