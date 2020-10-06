class SUtil {
  public static Object[] replaceSingleNull(Object[] array, Object element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        array[i] = element;
        return array;
      }
    }
    return null;
  }

  public static SObject[] replaceSingleNull(SObject[] array, SObject element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        array[i] = element;
        return array;
      }
    }
    return null;
  }

  public static Object[] pop(Object[] arr, int index) {
    if (arr == null || index < 0 || index >= arr.length) {
      return arr;
    }
    Object[] otherArray = new Object[arr.length];
    for (int i = 0, k = 0; i < arr.length; i++) {
      if (i == index) {
        continue;
      }
      otherArray[k++] = arr[i];
    }
    return otherArray;
  }

  public static String arrayToString(Object[] array) {
    String s = "[";
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        s += "null, ";
      } else {
        s += array[i].toString() + ", ";
      }
    }
    return s.substring(0, s.length() - 2) + "]";
  }

  public static SObject[] copyArray(SObject[] array) {
    SObject[] o = new SObject[array.length];
    for (int i = 0; i < o.length; i++) {
      SObject obj = array[i];
      if (obj == null) {
        o[i] = null;
      } else {
        o[i] = array[i];
      }
    }
    return o;
  }
}
