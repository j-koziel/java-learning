package accessModifiers.package2;

public class C {
    //    Default access modifiers
    // The default access modifier only has scope to the same package.
    String defaultMessage = "This is the default";

//    Public access modifiers
//    These can be seen by other packages
    public String publicMessage = "This is public";

//    The protected access modifier
//    Available to classes in another package as long as that class is a subclass where the protected field/method is
//    declared.
    protected String protectedMessage = "This is protected";

//    The private access modifier
//    Only visible to the class that declares it
    private String privateMessage = "This is private";
}
