package mDev2

//high order func
fun main(){
    val myButton = Button()

    myButton.setOnClickListener {
        println("I am clicked")
    }

    myButton.click()
    println("dfv")
    myButton.click()
}
class Button{
    //private lateinit var listener: OnClickListener
    private lateinit var onClickListener:() -> Unit //unit hech narsa


    fun setOnClickListener(listener: ()-> Unit){
        this.onClickListener = listener
    }
    fun click(){
        onClickListener()
    }
}

//interface OnClickListener{
//    fun onClick()
//}