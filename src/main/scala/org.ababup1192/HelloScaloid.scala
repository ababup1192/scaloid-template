package org.ababup1192

import org.scaloid.common._
import android.graphics.Color

class HelloScaloid extends SActivity {

  onCreate {
    contentView = new SVerticalLayout {
      style {
        case b: SButton => b.textColor(Color.RED).onClick(toast("Bang!"))
        case t: STextView =>
          t textSize 10.dip
          t.setTextColor(Color.WHITE)
          t
        case v => v.backgroundColor(Color.YELLOW)
      } backgroundColor Color.MAGENTA

      STextView("I am 10 dip tall")
      STextView("Me too")
      STextView("I am taller than you") textSize 15.dip
      // overriding
      val editText = SEditText("Yellow input field")
      SButton(R.string.red)

    } padding 20.dip
  }

}
