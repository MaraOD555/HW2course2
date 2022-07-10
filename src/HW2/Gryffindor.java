package HW2;

class GryffindorStudents extends HogwartsStudents {

    private int noble;
    private int honest;
    private int brave;

    public GryffindorStudents(String name, int magicPower, int transgressionDistance, int noble, int honest, int brave) {
        super(name, magicPower, transgressionDistance);
        this.noble = noble;
        this.honest = honest;
        this.brave = brave;
    }

    public int getNoble() {
        return noble;
    }

    public void setNoble(int noble) {
        this.noble = noble;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getBrave() {
        return brave;
    }
    private int skills(){
        return noble + honest + brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }
    public void compareGryffindor(GryffindorStudents gryffindorStudents){
        int skills1 = this.skills();
        int skills2 = gryffindorStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getName() + " лучший Гриффиндорец чем " + gryffindorStudents.getName());
        } else if (skills2 > skills1){
            System.out.println(gryffindorStudents.getName() + " лучший Гриффиндорец чем " + getName());
        } else {
            System.out.println(gryffindorStudents.getName() + " такой же Гриффиндорец как " + getName());
        }
    }

    public String toString() {
       return super.toString() + ", благородство - " + getNoble() + ", честность - "
                + getHonest() + ", храбрость - " + getBrave();
    }
}


