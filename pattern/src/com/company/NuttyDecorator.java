package com.company;

public class NuttyDecorator extends IcecreamDecorator{


    public NuttyDecorator(Icecream icecream) {
        super(icecream);
    }

    String makenuttyicecream(){
        return "with nut";
    }

    @Override
    public String makeIcecream(){
       return super.makeIcecream()+" "+ makenuttyicecream();

    }





}
