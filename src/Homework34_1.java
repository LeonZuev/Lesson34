import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework34_1 {
  /*
  Напишите программу создания небольшого словаря сленговых программерских выражений,
  чтобы она потом по запросу возвращала значения из этого словаря.
  Формат входных данных
+ Файл dict.txt
  В первой строке задано одно целое число n — количество слов в словаре.
  В следующих n строках записаны слова и их определения, разделенные двоеточием и символом пробела.
  Ввод с клавиатуры
  В первой строке записано целое число m — количество поисковых слов,
  чье определение нужно вывести.
  В следующих m строках записаны сами слова, по одному на строке.
  Формат выходных данных
  Для каждого слова, независимо от регистра символов, если оно присутствует в словаре,
  необходимо вывести на экран его определение.
  Если слова в словаре нет, программа должна вывести "Не найдено", без кавычек.
  Пример входных данных
  5
  Змея: язык программирования Python
  Баг: от англ. bug — жучок, клоп, ошибка в программе
  Конфа: конференция
  Костыль: код, который нужен, чтобы исправить несовершенство ранее написанного кода
  Бета: бета-версия, приложение на стадии публичного тестирования
  3
  Змея
  Жаба
  костыль
  Пример выходных данных
  язык программирования Python
  Не найдено
  код, который нужен, чтобы исправить несовершенство ранее написанного кода
   */
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Map<String, String> slang = readSlang(bufferedReader);
    List<String> request = readRequest(bufferedReader);
    bufferedReader.close();
    printResponse(slang, request);

  }
  public static void printResponse(Map<String, String> slangWord, List<String> request) {
    for (String slang : request) {
      System.out.println(definition); // TODO connect 'request' and 'slangWord', finish 'print'
    }
  }


  //нужно прочитать запрос "ключа" !!!с клавиатуры!!!, для которого нужно найти определение
  public static List<String> readRequest(BufferedReader bufferedReader) throws IOException {
    List<String> request = new ArrayList<>();
    int n = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < n; ++i) {
      request.add(bufferedReader.readLine());
      System.out.println(request);
    }
    return request;
  }

  public static Map<String, String> readSlang(BufferedReader bufferedReader) throws IOException{
    Map<String, String> result = new HashMap<>();
    int n = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < n ; ++i) {
      String line = bufferedReader.readLine();
      int colon = line.indexOf(':');
      String slangWord = line.substring(0,colon);
      String definition = line.substring(colon + 1);

      System.out.println("for " + slangWord + " definition is " + definition);
      System.out.println();
    }
    return result;
  }

}
