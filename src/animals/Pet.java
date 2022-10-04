package animals;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pet extends Object{
    private String name;
    private int birthYear;

    private String address;
    private String phon;

    public Pet(String name) {
        this(name, 0);
    }

    public Pet(String name, int age) {
        setName(name);

        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public void talk() {
        System.out.println("Меня зовут " + getName());
    }

    public abstract void eat();


    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Anonimus";
        }
    }
    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return birthYear == pet.birthYear && Objects.equals(getName(), pet.getName()) && Objects.equals(getAddress(), pet.getAddress()) && Objects.equals(getPhon(), pet.getPhon());
    }
    //
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Pet)) return false;
//        Pet pet = (Pet) o;
//        return birthYear == pet.birthYear && getName().equals(pet.getName()) && getAddress().equals(pet.getAddress()) && getPhon().equals(pet.getPhon());
//    }



    @Override
    public int hashCode() {
        return Objects.hash(getName(), birthYear, getAddress(), getPhon());
    }




    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", address='" + address + '\'' +
                ", phon='" + phon + '\'' +
                '}';
    }
}
