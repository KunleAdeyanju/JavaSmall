person1.name
person1.age
person1.sayHello()
person1.sayHello()
Person person1 = new Person("Alice",25);
Person person2 = new Person("Bob",30);
person1.sayHello()
person1.haveBirthday()
class Person {
        String name;
        int age;
        int height;
        String nationality;
        
        Person( String n, int a, int h, String e){
            name = n;
            age = a;
            height = h;
            nationality = e;
        }
        
        void sayHello(){
            System.out.println("Hello, I'm " + name + " its nice to meet you");
        }
        
        void elevatorPitch(){
            System.out.println("Hello, my name is " + name + ". I'm from " + nationality +
            " and I'm excited to meet you to talk about your amazing diverse experiences");
        }
        
        void ageHeight(){
	    height = height -  age/4; // measured in glorks, getting creative here
            System.out.println("When I was " + age + " I remeber being " + height + " glorks tall");
	}
}
Person person3 = new Person("Cindy", 33, 17, "Spanish");
Person person4 = new Person("Vinny", 13,4, "Gambian");
person3.ageHeight()
person4.name
person4.elevatorPitch()