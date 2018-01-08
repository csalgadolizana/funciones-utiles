private String justifyLargeText(String text) {
int maxLength = 60;
boolean passToSpaces = false , alif = false;
String data = text.trim(), dataFinal = "", dataTemp = "";
if (data.length() > maxLength) {
int total = 0;
String[] palabras = data.split(" ");
for (int i = 0; i < palabras.length; i++) {
total = total + (palabras[i].trim().length() + 1);
if (palabras.length - 1 >= i + 1) {
alif = false;
}
if (total > maxLength) {
 */
passToSpaces = true;
total = 0;
dataFinal += completeSpaces(dataTemp, maxLength) + saltoLinea;
//dataTemp = "";
dataTemp = "" + palabras[i];
} else {
passToSpaces = false;
//dataTemp += " " + palabras[i];
//if (i != 0) {
dataTemp +=(i==0) ? palabras[i] : " " + palabras[i];
//////dataTemp += " " + palabras[i];
/*} else {
 dataTemp += palabras[i] + " ";
 }*/
}
}
if (!passToSpaces) dataFinal +=  dataTemp;
return dataFinal;
}
return data;
}

private String completeSpaces(String text , int max){
String[] palabras = text.split(" ");
String data = "";
int numberC = text.trim().length();
float spacesAdd = 0;
spacesAdd = (max - numberC) / palabras.length;
long iPart = (long) spacesAdd;
//Log.d("Errrr-> " ,   " spacesAdd =" + spacesAdd + " numberC=" + numberC + " (numberC - max)=" + (numberC - max) + " iPart=" + iPart);
for (int i = 0; i < palabras.length; i++) {
String result = " ";
for (int j = 0; j < iPart; j++) {
result += result;
}
data += (i < 0) ? palabras[i] + result : palabras[i] + result;
//Log.d("Errrr-> ", " Result = |" + result + "| pq son " + iPart + " espacios que añadiran" );
}

//Log.d("Errrr-> " ,   " Llega         =" + text);
//Log.d("Errrr-> " ,   " Llega         =" + data);
return data;
}