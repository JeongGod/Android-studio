Android Studio Practice
========================
Stage 1_2
----------
* ### toast
  * toast : 하단에 잠시동안 메시지를 띄워준다.

    * option : Toast.LENGTH_SHORT (2초), Toast.LENGTH_LONG (3.5초)
    * usage : toast.show()

* ### findViewById

  * findViewById : "activity_main.xml"파일에서 찾고싶은 id를 찾아준다.

    * "View"형으로 return을 하기때문에 필요하다면 형변환을 해줘야 한다.

* ### Layout

  * ConstraintLayout : 개체마다 구속을 걸어 만드는 layout. 

  * LinearLayout : 세로 또는 가로로 배열하는 layout.

    * orientaion옵션을 주어 세로,가로를 선택 할 수 있다.

  * RelativeLayout : 상대적인 위치로 배열하는 layout.

    * below, above등으로 상대적인 위치를 지정한다.



Stage 1_3
-----------

* ### ScrollView

  * 스크롤 뷰를 이용하여 스크롤을 생성한다.

    * 스크롤 뷰안에 View또는 Viewgroup을 이용하기 때문에 LinearLayout을 생성하여야 한다.

* ### Autolink

  * 텍스트에 있는 링크를 인식하여 자동으로 하이퍼링크를 걸어준다.


Stage 2_1
-----------

* ### Activity

  * 각각의 Activity는 interface layout파일이 존재한다.

  * AndroidManifest.xml파일에서 Activity 클래스를 선언해야 한다.

  * Activity는 부모/자식 관계를 지정할 수 있다.

* ### Intent

  * Activity간에 작업을 요청할 수 있게 도와준다.

  * 액티비티 이동과 동시에 값을 넘기려면 putExtra함수를 사용한다.

   * putExtra함수는 key, value값으로 이루어져 있다. 이동된 activity에서 key값을 불러오면 해당 value값을 불러온다.
