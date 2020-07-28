Stage 2_1
-----------

Activity
-----------
* 각각의 Activity는 interface layout파일이 존재한다.

* AndroidManifest.xml파일에서 Activity 클래스를 선언해야 한다.

* Activity는 부모/자식 관계를 지정할 수 있다.
  
Intent
---------
* Activity간에 작업을 요청할 수 있게 도와준다.

* 액티비티 이동과 동시에 값을 넘기려면 putExtra함수를 사용한다.
 
 * putExtra함수는 key, value값으로 이루어져 있다. 이동된 activity에서 key값을 불러오면 해당 value값을 불러온다.
 

Stage 2_2
-----------

Life Cycle(생명주기)
-------------------

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
  
상태 저장
-------------
![스크린샷 2020-07-28 오후 9 23 48](https://user-images.githubusercontent.com/22341452/88664829-a2dc7a80-d118-11ea-8ad9-151d8d9ad636.png)

* onSaveInstanceState()

  * OnPause() 와 OnStop()사이에서 호출된다.
  
  * 상태정보를 저장하는 함수이다.
  
  * 회전 시, Pause, Stop, Destory, create, start, resume 단계로 다시 어플이 이루어지는데, 이 때 정보를 저장해두어 create에서 저장된 정보를 불러와 유지한다.
