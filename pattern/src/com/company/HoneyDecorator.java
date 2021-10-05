package com.company;

public class HoneyDecorator extends IcecreamDecorator{

    public HoneyDecorator(Icecream icecream) {
        super(icecream);
    }

    public String makehoneyicecram(){
        return "with honney";
    }

    @Override
    public String makeIcecream(){
        return super.makeIcecream()+" "+ makehoneyicecram();

    }




}
