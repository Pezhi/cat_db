package utils

/**
 * Created by Pazhman
 * */


object Util {

  def getFileExt(filename: String): String = {
    val flds = filename.split('.')
    if(!flds.isEmpty){
      return flds.last;
    }
    return "";

  }

}
