fun main(args:Array<String>)
{
    C1("s1")
    C1(10)
    C1()
/////////////////////////////////////////////
    var a1=C2()
    a1.out()

    var a2=C3()
    println(a2.read_only_string)
    a2.rwInt = 20
}
class C1 (var s1:String)
{
    init
    {
        s1+=",String"
        println(s1)
        println("主构造器")
    }
    constructor(i2:Int):this("调用主构造器")
    {
        println(i2)
        println("第二构造器")
    }
    constructor():this(20)
    {
        println("通过另一个第二构造器调用主构造器")
    }
}
class C2
{
    var myint=2
    var mystring="String"
    fun out()
    {
        println("$myint : $mystring")
    }
}
class C3
{
    val read_only_string:String
        get() = "bige"

    var rwInt:Int = 0
        get() = field
        set(rwInt)
        {
            field = rwInt
            println("Set:$rwInt")
        }
}
