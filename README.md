Android Studio Practice
========================
Stage 1.2
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



Stage 1.3
-----------

* ### ScrollView

  * 스크롤 뷰를 이용하여 스크롤을 생성한다.

    * 스크롤 뷰안에 View또는 Viewgroup을 이용하기 때문에 LinearLayout을 생성하여야 한다.

* ### Autolink

  * 텍스트에 있는 링크를 인식하여 자동으로 하이퍼링크를 걸어준다.


Stage 2.1
-----------

* ### Activity

  * 각각의 Activity는 interface layout파일이 존재한다.

  * AndroidManifest.xml파일에서 Activity 클래스를 선언해야 한다.

  * Activity는 부모/자식 관계를 지정할 수 있다.

* ### Intent

  * Activity간에 작업을 요청할 수 있게 도와준다.

  * 액티비티 이동과 동시에 값을 넘기려면 putExtra함수를 사용한다.

   * putExtra함수는 key, value값으로 이루어져 있다. 이동된 activity에서 key값을 불러오면 해당 value값을 불러온다.

Stage 2.2
-----------

* ### Life Cycle(생명주기)

![스크린샷 2020-07-28 오후 9 10 08](https://user-images.githubusercontent.com/22341452/88663525-b8e93b80-d116-11ea-8181-99546c1a28f8.png)


 * OnCreate()

   * 최초로 앱을 실행하면 호출되는 함수
 * OnStart()

   * 이 시점부터 사용자가 액티비티를 볼 수 있다.
 * OnResume()

   * 사용자가 상호작용한 포그라운드에 위치한다면 호출, 여기서부터 액티비티가 실행된다고 볼 수 있다.
 * OnPause()

   * 상호작용이 불가능한 상태. MainActivity에서 Send버튼을 누르면 Pause가 된 후 Stop이 된다.
 * OnStop()

   * Activity가 더 이상 보이지 않을 때 호출. 이 시점에서는 MainActivity에서 SecondActivity로 넘어갔을 때 MainActivity는 OnStop상태가 된다.
 * OnDestory()

   * Activity가 종료 또는 앱 프로세스자체가 종료.
 * OnRestart()

   * OnStop에서 OnStart로 돌아가기 전 OnRestart가 실행된 후 실행이 된다.
  
* ### 상태 저장

![스크린샷 2020-07-28 오후 9 23 48](https://user-images.githubusercontent.com/22341452/88664829-a2dc7a80-d118-11ea-8ad9-151d8d9ad636.png)

 * onSaveInstanceState()

   * OnPause() 와 OnStop()사이에서 호출된다.

   * 상태정보를 저장하는 함수이다.

   * 회전 시, Pause, Stop, Destory, create, start, resume 단계로 다시 어플이 이루어지는데, 이 때 정보를 저장해두어 create에서 저장된 정보를 불러와 유지한다.

 * onRestoreInstanceState()

   * onCreate() 안에 onRestoreInstanceState()함수를 사용하여 복구한다.

Stage 2.3
-----------

* ### Implicit Intent(암시적 인텐트)

  * Activity간에는 Explicit Intent(명시적 인텐트)를 사용했다.
   하지만 별도의 APP에게 정보를 넘기려면 Implicit Intent를 사용한다.

  * Intent함수에서 작업으로는 ACTION_VIEW(보기), ACTION_EDIT(편집), ACTION_DIAL(전화)가 있다.

* ### URI(Uniform Resource Identifier)

  * 통합 지원 식별자로 이미지, 전화번호, 주소등 여러가지 데이터를 uri형태로 얻어올 수 있다.
 
* ### ShareCompat.IntentBuilder

  * 위 함수로 데이터를 공유가능 하다.

Stage 4.1
-----------

* ### drawable

![스크린샷 2020-07-31 오후 5 43 18](https://user-images.githubusercontent.com/22341452/89017479-529e2c00-d355-11ea-996c-a79c079c771c.png)  

  * drawable폴더에 원하는 이미지를 넣어 앱을 꾸밀 수 있다.

Stage 4.2
------------

* ### inputType

  * EditText를 사용 할 때 타입을 지정할 수 있다.
  * '|'를 이용하여 여러 옵션을 지정 가능하다.
  * Options
  
    * textAutoCorrect: 맞춤법 오류시 수정 제안.
    * textCapSentences: 첫 문자를 대문자로 시작.
    * textPersonName: 한 줄의 텍스트만 표시하고 완료.
    * textMultiLine: 여러 줄의 텍스트 입력 가능.
    * textPassword: 글자를 '*'로 숨김표시.
    * textEmailAddress: 표준 키보드가 아닌 이메일 키보드를 표시.
    * phone: 표준 키보드가 아닌 전화 키패드를 표시.

* ### RadioGroup
  
  * RadioGroup을 이용하여 여러개의 RadioButton을 묶을 수 있다.

  * android:checked를 이용하여 처음 화면부터 check를 할 수 있다.
  
* ### Spinner

  * Drop-down 메뉴를 제공한다.

  * ArrayAdapter를 사용하여 Spinner메뉴 항목으로 할당한다.
  
  * AdapterView.OnItemSelectedListener 인터페이스를 추가한다.
    * onItemSelected, onNothingSelected라는 Callback 메소드를 활용하여 사용한다.

Stage 4.3
----------

* ### AppBarLayout

  * LinearLayout과 같이 들어오는 순서로 수직구조를 이룬다.
  
  * ToolBar를 설정할 수 있다. MainActivity에서 setSupportToolBar()를 호출하여 ActionBar로 만들 수 있다.
  
* ### main_menu.xml

  * Basic Activity를 선택했을 때 생긴다.
  * main_menu.xml에서 Option을 추가할 수 있다.
  * android:orderInCategory 속성으로 순서를 지정할 수 있다.
  * app:showAsAction 속성으로 Toolbar에 띄울 지 안 띄울지 정할 수 있다.

* ### Alert
  
  * 대화상자를 띄워준다.

* ### DialogFragment

  * 위를 이용하여 시간/날짜 선택할 수 있는 Fragment를 띄울 수 있다.
  
Stage 4.4
----------

![스크린샷 2020-08-01 오후 11 18 27](https://user-images.githubusercontent.com/22341452/89103502-4f866700-d44d-11ea-8a8a-4bb9dd4abd1c.png)

* ### Activty간 부모/자식 설정

  * 일반적인 swipe/핸드폰 내에 뒤로가기를 사용하면 가장 최근에 사용했던 화면으로 돌아간다.
  * 부모/자식을 설정한 Activity는 App내에서 뒤로가기 버튼이 생긴다.
  * 자식 Activity에서 뒤로가기 버튼을 누르면 부모 Activity로 돌아간다.

* ### TabLayout

  * Android 라이브러리에 존재한다.
  * 형제간 이동에 용이하다.
  * Swipe/Tab 클릭으로 탭 이동이 가능하다.
