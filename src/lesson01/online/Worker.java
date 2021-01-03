package lesson01.online;

public class Worker {
    private String family;
    private String post;
    private String telephone;
    private int pay;
    private int age;

    Worker(String family,String post, String telephone, int pay,int age) {
        this.family = family;
        this.post = post;
        this.telephone = telephone;
        this.pay = pay;
        this.age = age;
    }
    public String getFamily() { return family;}
    public String getPost() { return post;}
    public String getTelephone() {return telephone;}
    public int getPay() {return pay;}
    public int getAge() {return age;}
    }