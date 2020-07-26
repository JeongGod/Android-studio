Stage 1.2
=========

toast
------
* toast : 하단에 잠시동안 메시지를 띄워준다.

  * option : Toast.LENGTH_SHORT (2초), Toast.LENGTH_LONG (3.5초)
  * usage : toast.show()

findViewById
-------------
* findViewById : "activity_main.xml"파일에서 찾고싶은 id를 찾아준다.

  * "View"형으로 return을 하기때문에 필요하다면 형변환을 해줘야 한다.

Layout
---------
* ConstraintLayout : 개체마다 구속을 걸어 만드는 layout 
 
* LinearLayout : 세로 또는 가로로 배열하는 layout

  * orientaion옵션을 주어 세로,가로를 선택 할 수 있다.
  
* RelativeLayout : 상대적인 위치로 배열하는 layout

  * below, above등으로 상대적인 위치를 지정한다.
