class SUtil {
  static Object[] replaceSingleNull(Object[] array, Object element) {
    boolean successful = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        array[i] = element;
        successful = true;
      }
    }
    if (successful) {
      return array;
    } else {
      return null;
    }
  }

  public static Object[] popElement(Object[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] otherArray = new Object[arr.length];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            otherArray[k++] = arr[i];
        }
        return otherArray;
    }
}
