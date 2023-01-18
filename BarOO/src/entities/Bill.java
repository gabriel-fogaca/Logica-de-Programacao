package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover(){
        double cover = 0;
        if(feeding() > 30){
            cover += 0;

        }
        else{
            cover += 4;
        }
        return cover;
    }
    public double feeding(){
        double feeding = 0;
        feeding += (beer * 5) + (softDrink * 3) + (barbecue * 7);

        return feeding;
    }

    public double ticket(){
        double ticket = 0;
        if( gender == 'M'){
            ticket += 10;
        }
        else{
            ticket += 8;
        }

        return ticket;
    }

    public double total(){
        return cover() + feeding() + ticket();


    }
}
