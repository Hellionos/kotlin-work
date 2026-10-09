// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, redaction: String, replacement: Char = 'X'): String {
    //redaction.length
    var replacementString = ""
    for (char in redaction) {
        replacementString = "$replacement$replacementString"
    }
    var replaced = document.replace(redaction,replacementString)
    return replaced
}
   