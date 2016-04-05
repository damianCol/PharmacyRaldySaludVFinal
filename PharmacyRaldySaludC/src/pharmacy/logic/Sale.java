/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy.logic;

import java.util.Date;

/**
 *
 * @author User
 */
public class Sale {
    private long idSale;                /** Sale id**/        
    private long idEmployee;            /** Employee id */
    private String firstname;           /** Employee firstname */
    private String lastname;            /** Employee lastname */
    private long idProduct;             /** Product id */
    private String nameProduct;         /** Product name */
    private Date sellDate;              /** Sale sell date */
    private int quantityProduct;        /** Product constain */

    public Sale() {
        this.idSale = 0;
        this.idEmployee = 0;
        this.firstname = "";
        this.lastname = "";
        this.idProduct = 0;
        this.nameProduct = "";
        this.sellDate = new Date();
        this.quantityProduct = 0;
    }

    /**
     * Constructor with parameters
     * @param idSale Sale id
     * @param idEmployee Employee id
     * @param firstname  Employee firstname
     * @param lastname Employee lastname
     * @param idProduct Product id
     * @param nameProduct Product name 
     * @param quantityProduct Product quantity
     */
    public Sale(long idSale, long idEmployee, String firstname, String lastname, long idProduct, String nameProduct, Date sellDate, int quantityProduct) {
        this.idSale = idSale;
        this.idEmployee = idEmployee;
        this.firstname = firstname;
        this.lastname = lastname;
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.sellDate = sellDate;
        this.quantityProduct = quantityProduct;
    }

    public long getIdSale() {
        return idSale;
    }

    public void setIdSale(long idSale) {
        this.idSale = idSale;
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
    
    
}
