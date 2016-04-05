package pharmacy.logic;

/**
 *
 * @author CR
 */
public class Product {
    private long idProduct;
    private String nameProduct;
    private String typeProduct;
    private String photo;
    private String constainProduct;
    private String descriptionProduct;

    /**
     * Default constructor
     */
    public Product() 
    {
        this.idProduct = 0;
        this.nameProduct = "";
        this.typeProduct = "";
        this.photo = "";
        this.constainProduct = "";
        this.descriptionProduct = "";
    }
    
    /**
     * Constructor with parameters
     * @param idProduct Product id
     * @param nameProduct Product name
     * @param typeProduct Product type 
     * @param constainProduct Product constain
     * @param descriptionProduct Product description
     */
    public Product(long idProduct, String nameProduct, String typeProduct, String photo, String constainProduct, String descriptionProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.typeProduct = typeProduct;
        this.photo = photo;
        this.constainProduct = constainProduct;
        this.descriptionProduct = descriptionProduct;
    }
    
    /**
     * Get Product id
     * @return Product id
     */
    public long getIdProduct() {
        return idProduct;
    }
    
    /**
     * Set Product id
     * @param idProduct Product id
     */
    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }
    
    /**
     * Get Product Name
     * @return Product name
     */
    public String getNameProduct() {
        return nameProduct;
    }
    
    /**
     * Set Product Name
     * @param nameProduct Product name
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    
    /**
     * Get Product Type
     * @return Product type
     */
    public String getTypeProduct() {
        return typeProduct;
    }

    /**
     * Set Product Type
     * @param typeProduct Product type
     */
    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    /**
     * Get Product Constain
     * @return Product constain
     */
    public String getConstainProduct() {
        return constainProduct;
    }

    /**
     * Set Product Constain
     * @param constainProduct Product constain
     */
    public void setConstainProduct(String constainProduct) {
        this.constainProduct = constainProduct;
    }

    /**
     * Get Product Description
     * @return Product Description
     */
    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    /**
     * Set Product Description
     * @param descriptionProduct Product Description
     */
    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    /**
     * Get Product photo
     * @return Product photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Set Product photo
     * @param photo Product photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
}
