package com.company;

public class Cat {
    private String name;
    private int age;

    void Cat () {
    }
    void Cat ( String name ){
        this.name=name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void Cat (String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }
    public void setName ( String name){
        this.name=name;
    }


    public void eatFish() {

    }
    public void eat() {

    }
  protected void say (){

  }
  private void sleep (){

  }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
