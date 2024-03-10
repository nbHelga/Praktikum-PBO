/* 
 * Penulis : Helga Nurul Bhaiti / 24060122130062
 */

public class Product {
    private String name;
    private int stock;
    private int price;

    public Product() {
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
    // TODO : Tambahkan kode untuk set atribut name dan
    //berikan asersi jika name yang dimasukkan berupa string kosong
        if(name!=null){
            this.name = name;
        }
        else{
            assert(name!=null): "Nama tidak boleh kosong!";
        // System.out.println("Nama kosong!");
        }
    }

    public void setStock(int stock) {
    // TODO : Tambahkan kode untuk set atribut stock dan
    /*berikan asersi bahwa jumlah stock yang dimasukkan harus
    bilangan positif*/
        if(stock>0){
            this.stock = stock;
        }
        else{
            assert(stock>0):"Jumlah Stock yang dimasukkan harus bilangan positif";
        // System.out.println("Jumlah Stock yang dimasukkan harus bilangan positif");
        }
    }

    public void setPrice(int price) {
    // TODO : Tambahkan kode untuk set atribut price dan
    /*berikan asersi bahwa jumlah stok yang dimasukkan harus
    bilangan positif*/
        if(price>0){
            this.price=price;
        }
        else{
            assert(price>0):"Jumlah Price yang dimasukkan harus bilangan positif";
        }
    }

    public void purchaseProduct(int quantity) {
    /* TODO : Tambahkan kode untuk mengurangi stok produk jika dilakukan pembelian. 
    Berikan asersi dimana quantity yang dimasukkan harus bilangan positif dan 
    berikan juga asersi jika stok produk yang tersedia tidak mencukupi.*/
        if(quantity>=0){
            assert(quantity<=stock):"Stock produk yang tersedia tidak mencukupi";
            this.stock = this.stock - quantity;
            System.out.println("Jumlah stock setelah purchase adalah " + stock);
        }
        else{
            assert(quantity>=0):"Quantity yang dimasukkan harus bilangan positif";
        }
    }

    public void addStock(int quantity) {
    // TODO : Tambahkan kode untuk menambah stok produk.
    /*Berikan asersi dimana quantity yang dimasukkan harus bilangan
    positif*/
        this.stock = this.stock - quantity;
        assert(quantity >= 0): "Quantity yang dimasukkan harus bilangan positif";
        }
    }