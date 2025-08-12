// 1. 

// public class OOPS {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();

//         p1.setColor("Red");
//         System.out.println(p1.color);
//         p1.color = "Blue";
//         System.out.println(p1.color);
//         p1.tip = 5;
//         System.out.println(p1.tip);
//     }
// }

// class Pen {
//     String color;
//     int tip;

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setColor(int newTip) {
//         tip = newTip;
//     }
// }


// 2. Access Modifiers

// public class OOPS {
//     public static void main(String[] args) {
//         BankAccount b1 = new BankAccount();
//         b1.setPassword("rohitarer");

//     }
// }

// class BankAccount {
//     public String name;
//     private String password;

//     public void setPassword(String pwd) {
//         password = pwd;
//     }
// }


// 3. Getters & Setters

// public class OOPS {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();

//         p1.setColor("Red");
//         System.out.println(p1.getColor());
        
//         p1.setTip(5);;
//         System.out.println(p1.getTip());
//     }
// }

// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String newColor) {
//         this.color = newColor;
//     }

//     void setTip(int newTip) {
//         this.tip = newTip;
//     }
// }


// 4. Constructors

// public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student("Rohit");
//         System.out.println(s1.name);

//         Pen p1 = new Pen();
//     }
// }

// class Student {
//     String name;
//     int roll;

//     Student(String name) {
//         this.name = name;
//     }
// }

// class Pen {
//     String color;
//     int tip;

//     Pen() {
//         System.out.println("Add your stuff");
//     }
// }


// 5. Copy Constructor

// public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.setName("Rohit");
//         s1.setRoll(44);
//         System.out.println(s1.name);
//         s1.password = "abcd";
//         s1.marks[0] = 53;
//         s1.marks[1] = 74;
//         s1.marks[2] = 74;

//         Student s2 = new Student(s1);
//         System.out.println(s2.name);
//         s2.password = "xyz";
//         s2.marks[1] = 75;
//         System.out.println(s2.password);
//         for(int i=0; i<s2.marks.length; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // Copy constructor
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//     }

//     Student() {
//         System.out.println("This is basic constructor...");
//         marks = new int[3];
//     }

//     String getName() {
//         return this.name;
//     }

//     int getRoll() {
//         return this.roll;
//     }

//     void setName(String name) {
//         this.name = name;
//         // marks = new int[3];
//     }

//     void setRoll(int roll) {
//         this.roll = roll;
//         // marks = new int[3];
//     }
// }



// 6. Deep Constructor

// public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.setName("Rohit");
//         s1.setRoll(44);
//         System.out.println(s1.name);
//         s1.password = "abcd";
//         s1.marks[0] = 53;
//         s1.marks[1] = 74;
//         s1.marks[2] = 74;

//         Student s2 = new Student(s1);
//         System.out.println(s2.name);
//         s2.password = "xyz";
//         s1.marks[1] = 75;
//         System.out.println(s2.password);
//         for(int i=0; i<s2.marks.length; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

        // deep constructor
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i=0; i<marks.length; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     Student() {
//         System.out.println("This is basic constructor...");
//         marks = new int[3];
//     }

//     String getName() {
//         return this.name;
//     }

//     int getRoll() {
//         return this.roll;
//     }

//     void setName(String name) {
//         this.name = name;
//     }

//     void setRoll(int roll) {
//         this.roll = roll;
//     }
// }


// 7. Inheritance

// Single level Inheritance
// public class OOPS {
//         public static void main(String[] args) {
//                 Fish shark = new Fish();
//                 shark.eat();
//                 shark.swim();
//         }
// }

// class Animal {
//         String color;

//         void eat() {
//                 System.out.println("eats");
//         }

//         void breath() {
//                 System.out.println("breaths");
//         }
// }

// class Fish extends Animal {
//         int fins;

//         void swim() {
//                 System.out.println("swims");
//         }
// }



// 8. Multi-Level Inheritance

// public class OOPS {
//         public static void main(String[] args) {
//                 Dog bobby = new Dog();
//                 bobby.legs = 4;
//                 System.out.println(bobby.legs);
//         }
// }

// class Animal {
//         String color;

//         void eat() {
//                 System.out.println("eats");
//         }

//         void breath() {
//                 System.out.println("breaths");
//         }
// }

// class Mammal extends Animal {
//         int legs;
// }

// class Dog extends Mammal {
//         String breed;
// }


// 9. Hirarchical Level Inheritance

// public class OOPS {
//         public static void main(String[] args) {
//                 Fish shark = new Fish();
//                 shark.swim();
//                 Bird peacock = new Bird();
//                 peacock.fly();
//         }
// }

// class Animal {
//         String color;

//         void eat() {
//                 System.out.println("eats");
//         }

//         void breath() {
//                 System.out.println("breaths");
//         }
// }

// class Mammal extends Animal {
//         void walk() {
//                 System.out.println("walks");
//         }
// }

// class Fish extends Animal {
//         void swim() {
//                 System.out.println("swim");
//         }
// }

// class Bird extends Animal {
//         void fly() {
//                 System.out.println("fly");
//         }
// }

// 10. Hybrid Level Inheritance

// Combination of all levels


// 11. Method overloading

// public class OOPS {
//         public static void main(String[] args) {
//                 Calculator c = new Calculator();
//                 System.out.println(c.sum(3,6));
//                 System.out.println(c.sum((float)3.4, (float)6.3));
//                 System.out.println(c.sum(3, 6, 1));
//         }
// }

// class Calculator {
//         int sum(int a, int b) {
//                 return a+b;
//         }

//         float sum(float a, float b) {
//                 return a+b;
//         }

//         int sum(int a, int b, int c) {
//                 return a+b+c;
//         }
// }



// 12. Method overriding

// public class OOPS {
//         public static void main(String[] args) {
//                 Deer d = new Deer();
//                 d.eat();
//         }
// }

// class Animal {
//         void eat() {
//                 System.out.println("eats anything");
//         }
// }

// class Deer extends Animal {
//         void eat() {
//                 System.out.println("eats grass");
//         }
// }


// 13. Abstract classes

// public class OOPS {
//         public static void main(String[] args) {
//                 Dog d = new Dog();
//                 d.walk();
//                 System.out.println(d.color);
//                 System.out.println(d.changeColor());
//                 Chicken c = new Chicken();
//                 c.walk();

//                 Puppy p = new Puppy();
//         }
// }

// abstract class Animal {
//         String color;

//         Animal() {
//                 color = "brown";
//                 System.out.println("Animal constructor is called...");
//         }


//         void eat() {
//                 System.out.println("Animal must eat");
//         }

//         abstract void walk();
// }

// class Dog extends Animal {

//         Dog() {
//                 System.out.println("Dog constructor is called...");
//         }

//         String changeColor() {
//                 color = "black";
//                 return color;
//         }
//         void walk() {
//                 System.out.println("Dog walks with 4 legs");
//         }
// }

// class Puppy extends Dog {

//         Puppy() {
//                 System.out.println("Puppy constructor is called...");
//         }

// }

// class Chicken extends Animal {
//         void walk() {
//                 System.out.println("Chicken walks with 2 legs");
//         }
// }


// 14. Interfaces

// public class OOPS {
//         public static void main(String[] args) {
//                 Queen q1 = new Queen();
//                 q1.moves();
//         }
// }

// interface ChessPlayer {
//         void moves();
// }

// class Queen implements ChessPlayer {
//         public void moves() {
//                 System.out.println("Up, down, left, right, diagonal(in all 4 directions)");
//         }
// }

// class King implements ChessPlayer {
//         public void moves() {
//                 System.out.println("Up, down, left, right(in all 4 directions with 1 step)");
//         }
// }

// class Rook implements ChessPlayer {
//         public void moves() {
//                 System.out.println("Up, down, left, right(in all 4 direactions)");
//         }
// }



// 15. Multiple Inheritance

public class OOPS {
        public static void main(String[] args) {
                Bear b = new Bear();
                b.eatChicken();
                b.eatGrass();
        }
}

interface Carnivorous {
        void eatChicken();
}

interface Harbivorous {
        void eatGrass();
}

class Bear implements Carnivorous, Harbivorous {
        public void eatChicken() {
                System.out.println("I eat chicken");
        }

        public void eatGrass() {
                System.out.println("I eat grass");
        }
}


// Questions

//1 

// public class OOPS {
//         public static void main(String[] args) {
//                 Complex a = new Complex(4, 5);
//                 Complex b = new Complex(2, 3);

//                 Complex c = Complex.add(a, b);
//                 Complex d = Complex.difference(a, b);
//                 Complex e = Complex.product(a, b);

//                 c.printComplex();
//                 d.printComplex();
//                 e.printComplex();

//         }
// }

// class Complex {
//         int real;
//         int imag;

//         public Complex(int r, int i) {
//                 real = r;
//                 imag = i;
//         }

//         public static Complex add(Complex a, Complex b) {
//                 return new Complex((a.real + b.real), (a.imag + b.imag));
//         }

//         public static Complex difference(Complex a, Complex b) {
//                 return new Complex((a.real - b.real), (a.imag - b.imag));
//         }

//         public static Complex product(Complex a, Complex b) {
//                 return new Complex((a.real * b.real), (a.imag * b.imag));
//         }

//         public void printComplex() {
//                 if(real == 0 && imag != 0) {
//                         System.out.println(imag);
//                 } else if (real !=0 && imag ==0) {
//                         System.out.println(real);
//                 } else {
//                         System.out.println(real + " " +imag);
//                 }
//         }
// }