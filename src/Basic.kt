import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>) {
    var n:Int=30//定义后初始化

    var k=100//自动推导变量类型

    var ok:Int//先定义
    ok =123//后赋值

    val m:Int =20//常量

    println(add(m,n))
    square(ok)
    square(k)
//////////////////////////////////////////////////////////////
    var mychar='a'
    var myshort:Short=2
    var mybyte:Byte=1

    var myint=4
    var mylong=8L
    var mylong2=922_3372_0368_5477_5807//可以用_分隔，便于观察
    mylong=myint.toLong()//类型转换

    var mydouble=8.0
    var myfloat=4.0f

    var mybinary=0b10101011
    var myhex=0xFF_FE_C5_BA

    var mybool=true
//////////////////////////////////////////////////////////////
    val a1 = arrayOf(1,2.0,3,'a',"abc")
    println(a1[4])

    val a2 = arrayOfNulls<Int>(10)
    println(a2.size)

    val a3 = Array(10,{i ->  (i*i).toString()})
    println(a3[3])

    val a4 = intArrayOf(1,2,3,4,5,6)
    println(a4[2])
//////////////////////////////////////////////////////////////
    val s1="""raw string
无视转义，如 \n
跟 C# 里的@""一样"""
    println(s1)

    val s2="abc"
    println("$s2 的长度是 ${s2.length}")//字符串摸板
}
fun add(m:Int,n:Int):Int
{
    return m+n;
}
fun square(m:Int):Unit
{
    /*
    Unit 表示返回类型为空
    /* 当然也可以省略 ":Unit" */
    块注释也可以嵌套
    */
    println(m*m)
}
