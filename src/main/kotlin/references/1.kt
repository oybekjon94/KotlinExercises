package references

//member references
fun main(){
    val message = listOf(
        Message("kitty","hey", true),
        Message("kitty","where are you?", false))
    val unread =
        message.filterNot(Message::isRead)
    unread.size
    unread.single().text

}
data class Message(
    val sender: String,
    val text:String,
    val isRead: Boolean
)