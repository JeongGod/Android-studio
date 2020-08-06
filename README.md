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
  
Stage 4.5
----------

![스크린샷 2020-08-03 오후 6 25 49](https://user-images.githubusercontent.com/22341452/89167750-c2f7b800-d5b6-11ea-88cd-a60e05f5401a.png)

* ### ListView
  * ListView는 ArrayAdapter를 활용하여 간단하고 빠르게 만들 수 있다.
  * 다양한 item이 필요할 시 복잡한 커스터마이징이 필요하다.
  * 애니매이션 사용이 어렵다.
  * ViewHolder를 강제적으로 사용하지 않아 findViewById, inflate함수가 매번 호출될 수 있다.(리소스 비용이 올라간다.)

* ### RecyclerView

  * ListView에서 더 확장성을 가진 View이다.
  * 강제적인 ViewHolder사용으로 View를 재사용가능하다.
    
    * onCreateViewHolder(ViewGroup parent, int viewType) : 뷰 홀더를 생성하고 뷰를 붙여주는 부분이다.
    * onBindViewHolder(CustomViewHolder holder, int position) : 재활용 되는 뷰가 호출하여 실행되는 메소드, 뷰 홀더를 전달하고 어댑터는 position의 데이터를 결합시킨다.
    * getItemCount() : 데이터의 개수 반환
    
  * 참고 https://woovictory.github.io/2019/01/03/Android-Diff-of-ListView-and-RecyclerView/
  
Stage 5.1
-----------

* ### style.xml
  * layout에서 공통되는 style이 있다면 style.xml에 지정해 코드를 간결하게 나타낼 수 있다.
```
<style name="ScoreButtons" parent="Widget.AppCompat.Button">
    <item name="android:tint">@color/colorPrimary</item>
    <item name="android:background">@drawable/button_background</item>
</style>
```

* ### ShapeDrawable
  * XML파일에 제공되는 기본도형이다.
```
<shape
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval">
        <stroke
            android:width="2dp"
            android:color="@color/colorPrimary"
            />
</shape>
```
* ### android:theme
  * AndroidMenifest.xml파일에 존재한다.
  * APP테마의 디자인을 나타낸다.

* ### AppCompatDelegate
  * APP테마 및 디자인을 DarkMode 또는 DayMode로 전환이 가능하다.
  * 아래 코드는 NightMode -> DayMode , DayMode -> NightMode로 사용자 설정에 따라 바뀌는 코드이다.

```
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        int nightMode = AppCompatDelegate.getDefaultNightMode();
        if(nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
            menu.findItem(R.id.night_mode).setTitle(R.string.day_mode);
        } else {
            menu.findItem(R.id.night_mode).setTitle(R.string.night_mode);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.night_mode){
            int nightMode = AppCompatDelegate.getDefaultNightMode();
            if(nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
            recreate();
        }
        return true;
    }
```

Stage 5.2
-----------

* ### CardView

  * 이미지와 텍스트를 Card형식으로 띄워주는 View이다.
  * Android 지원 라이브러리에 존재한다.
  ```
  implementation "androidx.cardview:cardview:1.0.0"
  ```
* ### Glide
  
  * 이미지를 띄우는데 직접 로드하면 Memory Resource를 낭비하게 된다.
  * Glide라이브러리를 이용하여 이미지를 효율적으로 로드한다.
  ```
  implementation 'com.github.bumptech.glide:glide:3.7.0'
  ```
* ### ItemTouchHelper

  * Tab, Swipe, Drag and Drop등 이벤트를 처리할 수 있게 하는 함수이다.
  ```
  ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT
      | ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
      @Override
      public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
          int from = viewHolder.getAdapterPosition();
          int to = target.getAdapterPosition();
          Collections.swap(mSportData,from,to);
          mAdapter.notifyItemMoved(from, to);
          return true;
      }

      @Override
      public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
          mSportData.remove(viewHolder.getAdapterPosition());
          mAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
      }
  });
  helper.attachToRecyclerView(mRecyclerView);
  ```
Stage 5.3
----------

* ### 가로모드 지원
  * New Resource File을 만들 때 orientaiton을 선택한 뒤 "land"를 고른 뒤 values를 지정하면 해당 모드에서 변경되도록 한다.
  * GridLayoutManager 함수를 통해 2차원 스크롤 목록을 처리할 수 있다.
  
* ### 태블릿 모드 지원
  * New Resource File을 만들 때 Smallest Screen Width를 선택한 뒤 숫자를 입력하면 values를 지정하면 태블릿에서의 디자인을 지정할 수 있다.

* ### 다른 국가 언어 지원
  * New Resource File을 만들 때 Locale을 선택한 뒤 국가를 선택하면 해당 국가에 맞는 언어를 지정할 수 있다.

Stage 7.1
----------

* ### AsyncTask
  * AsyncTask의 동작 과정
    
    ![스크린샷 2020-08-06 오후 4 00 53](https://user-images.githubusercontent.com/22341452/89501261-0001bb80-d7fe-11ea-9a1d-a478db95dad9.png)
    ![스크린샷 2020-08-06 오후 4 04 16](https://user-images.githubusercontent.com/22341452/89501548-79011300-d7fe-11ea-80c1-310abae1c213.png)

    
    * onPreExecute(): AsyncTask를 사용하기 위해 실행하는 메소드, UI메소드에서 실행이 된다.
    * doInBackground(): 별도의 스레드에서 수행 할 작업을 실행하기위한 코드를 구현하는 위치, 중간 진행 상태를 UI에 업데이트 하려면 publishProgress() 메소드 호출.
    * onProgressUpdate(): publishProgress()메소드가 호출되면 호출되는 메소드,UI 스레드에서 호출되며 진행률 표시 줄을 채우는 등 UI의 진행률을 업데이트하는 데 사용됩니다.
    * onPostExecute(): doInBackground()의 return값을 파라미터로 받고, AsyncTask가 끝났을 경우 동작 구현. 

  * AsyncTask의 파라미터
  ```
  public class MyAsyncTask extends AsyncTask <String, Integer, Bitmap>{}
  ```
    * String은 doInBackground()의 파라미터로 쓰인다.
    * Integer은 onProgressUpdate()의 파라미터로 쓰인다.
    * Bitmap은 doInBackground()의 return값으로, onPostExecute()의 파라미터로 쓰인다.
