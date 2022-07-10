package HW2;

abstract class HogwartsStudents {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudents(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;

    }
       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public void printStudents(){
        System.out.println(this);
    }
    private int skills(){
        return magicPower + transgressionDistance;
    }
    public void compareHogwards(HogwartsStudents hogwartsStudents){
        int skills1 = this.skills();
        int skills2 = hogwartsStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getName() + " лучший ученик Хогварда чем " + hogwartsStudents.getName());
        } else if (skills2 > skills1){
            System.out.println(hogwartsStudents.getName() + " лучший ученик Хогварда чем " + getName());
        } else {
            System.out.println(hogwartsStudents.getName() + " такой же ученик Хогварда как " + getName());
        }
    }

    @Override
    public String toString() {
        return "Имя - " + getName() + ", сила магии - "
                + getMagicPower() + ", дальность трансгрессии - " + getTransgressionDistance();
    }


}
