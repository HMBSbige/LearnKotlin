open class D{}
class D1:D(){}
class C{
    fun D.foo(){
        println("D.foo in C")
    }
    fun D1.foo(){
        println("D1.foo in C")
    }
    fun caller(d:D){
        d.foo()
    }
}
fun main(args: Array<String>) {
    C().caller(D1())
    /*输出：
    D.foo in C
    */
}
