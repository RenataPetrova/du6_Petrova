import java.time.LocalDate;
import java.util.*;

import static java.lang.Long.parseLong;

public class Main {
static Plants plants;
    public static void main(String[] args) {
        ArrayList<Plant>list = new ArrayList<>();
        plants = new Plants(list);
            try{
                plants.proceedFile(list);
            //    plants.getWateringInfoForWholeList(list);   //vypis zalivky pro vsechny kvetiny
                Plant firstAddedPlant = new Plant("Bazalka v kuchyni","",LocalDate.of(2021,9,4),
                        LocalDate.of(2021,9,4),3);
                Plant secondAddedPlant = new Plant("Tymian","",LocalDate.of(2021,9,4),
                        LocalDate.of(2021,9,4),3);
                plants.addPlant(firstAddedPlant);
                plants.addPlant(secondAddedPlant);
            //    plants.getWateringInfoForWholeList(list); //kontrolny vypis
                plants.removePlant(secondAddedPlant);
            //    plants.getWateringInfoForWholeList(list); //kontrolny vypis
                plants.writeNewData(list);

                //sortovani
                System.out.println("Puvodny seznam: ");
                plants.getWateringInfoForWholeList(list);   //kontrolny vypis
                plants.sortingByName(list); //sortovani dle jmena rostliny
                plants.getLastWateringsForWholeList(list);  //vypis dni kdy byla zalita alespon jedna kytka
                plants.sortingByLastWatering(list);         //sortovani dle datumu posledni zalivky



            }catch(Exception ex){
                System.err.println(ex.getLocalizedMessage());
            }

    }
}

