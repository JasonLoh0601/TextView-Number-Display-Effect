# TextView-Number-Display-Effect
The effect to show the number. I will show the sample in this repository. Hope can help everyone.

![](numberDisplayEffect.gif)


First Step

Copy the three java file in MainController to your current project, becasue these three file will implement the animation effect function.

Second Step

Need to copy this: 

    <declare-styleable name="NumberRunningTextView">
        <attr name="duration" format="integer" />
        <attr name="minNum" format="integer" />
        <attr name="minMoney" format="float" />
        <!--内容的格式-->
        <!--Format of content-->
        <attr name="textType">
            <enum name="money" value="0" />
            <enum name="num" value="1" />
        </attr>
        <!--是否使用每三位数字一个逗号-->
        <!--Whether to use a comma for every three digits-->
        <attr name="useCommaFormat" format="boolean" />
        <!--是否当内容改变的时候使用动画，不改变则不使用动画-->
        <!--Whether to use animation when the content changes or not-->
        <attr name="runWhenChange" format="boolean" />
    </declare-styleable>
    
into your styles xml so that the value can be set on EffectTextView from xml.

Three Step

The excample of NumberRunningTextView code into xml:

    <com.example.textview_number_display_effect.MainController.NumberRunningTextView
        android:layout_gravity="center"
        android:id="@+id/test"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="30dp"
        app:duration="800"
        app:minMoney="800"
        app:minNum="1"
        app:textType="money"
        app:useCommaFormat="true"
        app:runWhenChange="true"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

duration = Set the speed of animation effect.

minNum = set the minimun number, the animation effect only running when the value more then the value. 

minMoney = set the minimun money value, the animation effect only running when the value more then the value. 

textType = set the type you want. (Money or Number)

useCommaFormat = whether show comma between every three digits or not.

runWhenChange: whether implement the animation efect when the value change.
