package com.example.codingtask_dedalus;

import java.util.HashMap;

/**
 * The program for calculating how many times letter in given sentence appears.
 * It gives numbers either for vowels or for consonants based on program input.
 * <p>
 * The first parameter can be 'vowels' or 'consonants'
 * The second parameter is the sentence to be analyzed.
 * <p>
 * Task: Refactor this code to be production ready and create appropriate unit tests.
 */

public class TextAnalyzer {

  public HashMap<String, Integer> analyzeVovels(String text){
    HashMap<String, Integer> vovels = new HashMap<>();

    int numA = 0;
    int numE = 0;
    int numI = 0;
    int numO = 0;
    int numU = 0;
    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'a' || chars[i] == 'A')
        numA++;
      if (chars[i] == 'e' || chars[i] == 'E')
        numE++;
      if (chars[i] == 'i' || chars[i] == 'I')
        numI++;
      if (chars[i] == 'o' || chars[i] == 'O')
        numO++;
      if (chars[i] == 'u' || chars[i] == 'U')
        numU++;
    }

    vovels.put("A", numA);
    vovels.put("E", numE);
    vovels.put("I", numI);
    vovels.put("O", numO);
    vovels.put("U", numU);

    return vovels;
  }

  public HashMap<String, Integer> analyzeConsonants(String text) {
    HashMap<String, Integer> consonants = new HashMap<>();
    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != 'a'
              && chars[i] != 'A'
              && chars[i] != 'e'
              && chars[i] != 'E'
              && chars[i] != 'i'
              && chars[i] != 'I'
              && chars[i] != 'o'
              && chars[i] != 'O'
              && chars[i] != 'u'
              && chars[i] != 'U'
              && chars[i] != ' '
      ) {
        String stringCharacter = String.valueOf(chars[i]).toUpperCase();
        if (consonants.containsKey(stringCharacter)) {
          Integer num = consonants.get(stringCharacter);
          num++;
          consonants.put(stringCharacter, num);
        } else {
          consonants.put(stringCharacter, 1);
        }
      }
    }

    return consonants;
  }
}
