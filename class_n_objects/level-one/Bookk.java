class Bookk{
    public String title;
    public String author;
    public int price; 

    public Bookk(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displaybook(){
        System.out.println("Book details: ");
        System.out.println("Title of the book: "+title);
        System.out.println("Name of the author: "+author);
        System.out.println("Price of the book: "+price+"/-");
    }
    public static void main(String[] args) {
        Bookk b= new Bookk("Who moved my cheese", "Dr.Spencer Johnson", 349);
        b.displaybook();
    }
}
