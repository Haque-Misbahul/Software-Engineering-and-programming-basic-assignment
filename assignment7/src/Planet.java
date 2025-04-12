public enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    final double mass;   
    final double radius;
    final double G_constant = 6.67300E-11;
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    public double mass() 
    { 
        return mass; 
    }
    public double radius() 
    { 
        return radius; 
    } 
    TestPlanet test = new TestPlanet();    
    double surfaceGravity() 
    {       
       return test.surfaceGravity(this.mass, this.radius, this.G_constant);        
    }
    double surfaceWeight(double mass) 
    {        
        return test.surfaceWeight(mass, surfaceGravity());
    }

}