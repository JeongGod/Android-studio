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
