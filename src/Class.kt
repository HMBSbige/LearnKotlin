fun main(args:Array<String>)
{
	C1("s1")
	C1(i2 = 10) //用命名参数传递参数值
	C1()
	/////////////////////////////////////////////
	var a1 = C2()
	a1.out()

	var a2 = C3()
	println(a2.read_only_string)
	a2.rwInt = 20
	println(a2.rwInt)
	/////////////////////////////////////////////
	outputInts(198, 112, 1619, 6126, 5)
}

class C1(var s1:String)
{
	init
	{
		s1 += ",String"
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
	var myint = 2
	var mystring = "String"
	fun out()
	{
		println("$myint : $mystring")
	}
}

class C3
{
	val read_only_string:String
		get() = "bige" //函数体只有一行可以像这样单行表达

	var rwInt:Int = 0
		get() = 2 * field
		set(rwInt)
		{
			field = rwInt
			println("Set:$rwInt")
		}
}

fun outputInts(vararg a:Int) //可变参
{
	fun output(array:Array<Int>) //嵌套函数
	{
		for(i in array)
		{
			print("$i,")
		}
		print("\b\n")
	}

	output(a.toTypedArray()) //a 原来是 IntArray,转成 Array
}
