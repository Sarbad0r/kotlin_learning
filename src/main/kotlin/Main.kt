fun main() {
    println(just_solve_res(5, 5));
    sorted_array(arrayOf(1, 6, 5, 5, 3));

    var nullSafety: String? = null;
    println(nullSafety);

    //
    var first_class = FirstObjectClassWithCons(1, "avaz", Product(1, "Rc Cola", 10.0));
    first_class.printAll()

    var from_json = FirstObjectClassWithCons.from_json(
        mapOf(
            "id" to 1, "name" to "First_obj_name", "product" to mapOf<String, Any>(
                "id" to 1,
                "name" to "Ice Cream",
                "qty" to 10.1
            )
        )
    );
    println("from json ${from_json.to_json()}");

    var listOFFirstOb =
        arrayListOf<FirstObjectClassWithCons>(FirstObjectClassWithCons(1, "name", Product(1, "ice cream", 15.5)));

    var list = listOFFirstOb.map { it.id == 2 }.toList();

    println(list.size)

    var map = mapOf<String, Any>("1" to "avaz", "2" to "some")
}

//just func
fun just_solve_res(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber;
}

//loop for
fun sorted_array(listOfArray: Array<Int>) {
    for (i in 0 until listOfArray.size) {
        for (j in i + 1 until listOfArray.size) {
            if (listOfArray[i] > listOfArray[j]) {
                var temp: Int = listOfArray[j];
                listOfArray[j] = listOfArray[i];
                listOfArray[i] = temp;
            }
        }
    }
    for (i in listOfArray) {
        print("$i ,");
    }
}

//null safety func
fun null_safety_string(res: String): String? {
    return null
}

