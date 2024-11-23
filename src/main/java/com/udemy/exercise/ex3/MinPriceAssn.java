package com.udemy.exercise.ex3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinPriceAssn {
    public static void main(String[] args) {
        String caseSub = "Veronica";
        TablePrice john = new TablePrice("John","iPad",81);
        TablePrice veronica = new TablePrice("Veronica","iPhone",77);
        TablePrice michael = new TablePrice("Michael","4KTV",901);
        TablePrice kate = new TablePrice("Kate","Macbook",408);
        TablePrice smith = new TablePrice("Smith","Amazon Echo",269);
        TablePrice lawrence = new TablePrice("Lawrence","Samsung Galazy",214);
        TablePrice rose = new TablePrice("Rose","Apple Watch",350);
        TablePrice sally = new TablePrice("Sally","XBox",694);
        TablePrice anderson = new TablePrice("Anderson","Playstation 4",308);
        List<TablePrice> tablePriceList = List.of(john,veronica,michael,kate,smith,lawrence,rose,sally,anderson);
        boolean status = calculateMinPriceAndReturnStatus(caseSub,tablePriceList);
        System.out.println(status);


    }

    private static boolean calculateMinPriceAndReturnStatus(String caseSub, List<TablePrice> tablePriceList) {
        Optional<TablePrice> optionalTablePrice = tablePriceList
                .stream()
                .min(Comparator.comparing(TablePrice::price));
        if(optionalTablePrice.isPresent()) {
            TablePrice tablePrice = optionalTablePrice.get();
            System.out.println(tablePrice.name());
            return tablePrice.name().equals(caseSub);
        }else{
            return false;
        }

    }
}
