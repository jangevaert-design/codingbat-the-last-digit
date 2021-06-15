package edu.cnm.deepdive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheLastDigitTest {

  static final int[][] lastDigitParams = {
      {23, 19, 13},
      {23, 19, 12},
      {23, 19, 3},
      {23, 19, 39},
      {1, 2, 3},
      {1, 1, 2},
      {1, 2, 2},
      {14, 25, 43},
  };

  static final boolean[] lastDigitExpected = {true, false, true, true, false, true, true, false};

  @Test
  void lastDigit() {
    for (int i = 0; i < lastDigitParams.length; i++) {
      boolean actual = CodingBatTheLastDigit.lastDigit(lastDigitParams[i][0], lastDigitParams[i][1],
          lastDigitParams[i][2]);
      Assertions.assertEquals(lastDigitExpected[i], actual);

    }
  }



}