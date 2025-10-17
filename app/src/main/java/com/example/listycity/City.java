package com.example.listycity;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
    /**
     * Two cities are equal if both their names and provinces match.
     * @param o
     * Another object to compare
     * @return
     * True if both city and province are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City cityO = (City) o;
        return city.equals(cityO.city) && province.equals(cityO.province);
    }
    /**
     * Returns a hash code for the city.
     * @return hash code
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}
