class SUtil {
  // should be public?
  static Object[] replaceSingleNull(Object[] array, Object element) {
    boolean successful = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        array[i] = element;
        successful = true;
      }
    }
    // probly a better way to do this :\ 
    if (successful) {
      return array;
    } else {
      return null;
    }
  }

  // replace this function name with "pop" plz
  // it sounds better and it has the same 
  public static Object[] popElement(Object[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        // why is otherArray an int array?
        int[] otherArray = new Object[arr.length];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            // can you even do that
            otherArray[k++] = arr[i];
        }
        return otherArray;
    }
}
