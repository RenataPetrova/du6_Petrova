import java.time.LocalDate;

public class Plant implements Comparable<Plant>{
    private String name;
    private String notes;
    private LocalDate planted;  //datum vysadby
    private LocalDate watering; //datum posledne zalivky
    private long frequencyOfWatering;   //jak casto zalevat(dny)

    public Plant(String name,String notes,LocalDate planted,LocalDate watering,long frequencyOfWatering){
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
    }
    public Plant(String name,LocalDate planted,long frequencyOfWatering){
        this(name,"",planted,LocalDate.now(),frequencyOfWatering);
    }
    public Plant(String name){
        this(name,LocalDate.now(),7);
    }

    public void getWateringInfo(){
        System.out.println("Jmeno kvetiny: " + getName()
                + "; Datum posledni zalivky: "+ getWatering()
                + "; Doporucena dalsi zalivka: " + nextWatering());
    }
    private LocalDate nextWatering(){
        return watering.plusDays(frequencyOfWatering);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) {
        this.watering = watering;
    }

    public long getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) {
        this.frequencyOfWatering = frequencyOfWatering;
    }

    @Override
    public int compareTo(Plant second) {
        return this.name.compareTo(second.name);
    }


}
