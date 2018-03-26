fun main(args:Array<String>)
{
	var a = 10
	var b = 20
	val c = if(a == b)
	{
		"相等" //返回值
	}
	else if(a < b)
	{
		println(b)
		"b" //返回值
	}
	else
	{
		print(a)
		"a" //返回值
	}

	println(c) //语句块的最后一个表达式为 if 的返回值
	//////////////////////////////////////////////////////////////////////
	val d = when
	{
		a == b -> "相等" //返回值
		a < b ->
		{
			println(b)
			"b" //返回值
		}
		else ->
		{
			print(a)
			"a" //返回值
		}
	} //跟上面的 if 等效

	println(d) //when 类似于 switch

	var n = 23
	when(n)
	{
		in 1..10 -> println("1~10")
		in 11..20 -> println("11~20")
		!in 21..60 -> println("不在 21~60")
		else -> println("21~60")
	} //用范围表示条件
	//////////////////////////////////////////////////////////////////////
	val a1 = byteArrayOf(127, -127, 1, 0, 8)

	for(i in a1)
	{
		print("$i,")
	}
	print("\b\n") //范围 for 循环

	for(i in a1.indices)
	{
		println("a1[$i] = " + a1[i])
	} //a1.indices 表示以 a1 下标为范围

	for((index, value) in a1.withIndex())
	{
		println("a1[$index] = $value")
	} //同时使用下标和值
	//////////////////////////////////////////////////////////////////////
	var i = 0
	var sum = 0
	while(i++ < 10)
	{
		sum += i
	}

	do
	{
		if(i == 6)
		{
			continue
		}
		if(i == 5)
		{
			break
		}
		sum += i
	} while(--i > 0)

	println(sum) //100
}