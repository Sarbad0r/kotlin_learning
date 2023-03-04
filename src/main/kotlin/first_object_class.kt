open class FirstObjectClassWithCons {
    var id: Int? = null;
    var name: String? = null;
    var product: Product? = null;

    constructor(id: Int, name: String, product: Product?) {
        this.id = id;
        this.name = name;
        this.product = product
    };

    companion object {
        fun from_json(json: Map<String, Any>): FirstObjectClassWithCons {
            return FirstObjectClassWithCons(
                json["id"] as Int,
                json["name"] as String,
                Product.from_json(json["product"] as Map<String, Any>)
            );
        };


    }

    fun to_json(): Map<String, Any> {
        return mapOf<String, Any>(
            "id" to id!!,
            "name" to name!!,
            "product" to this.product!!.to_json()
        );
    };

    fun printAll() {
        println("id - $id, name - $name")
    }
}

class Product(var id: Int?, var name: String?, var qty: Double?) {
    fun pri() {
        println("$id - $name - $qty");
    }

    //like static
    companion object {
        fun from_json(json: Map<String, Any>): Product {
            return Product(json["id"] as Int, json["name"] as String, json["qty"] as Double);
        };

    }

    fun to_json(): Map<String, Any> {
        return mapOf<String, Any>("id" to id!!, "name" to name!!, "qty" to qty!!);
    };

}