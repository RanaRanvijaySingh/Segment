# Segment - Android

##Introduction
Segment is a library similar to Iphone UI component - Segment.  
No need to customize layout or button.  
No need to create separate drawable file or selectors.  
This library will do it for you.  

###Features
Library provide 4 simple attributes in XML file :

1. **count**               : Number of segment buttons you want.
2. **segmentColor**        : Theme color for the segment.
3. **textColor**           : Second theme color or text color that will appear in clicked box.
4. **textSize**            : For giving text size.
5. **text**                : Texts that you want to give in the segment buttons.  
                                    - Text will saperated by comma ",".  
                                    - Texts will be of same count as of count value.  
                                     eg. 
``` 
app:count="3"
app:text="Android,IPhone,Sencha"
```

###Instructions 

1. Download or clone this repo.
2. Import *Segment* library in your IDE.
3. Right click on your **project** >>> select **Properties** >>> **Android** >>> inside Library section >>> click **Add** >>> and select **Segment**.
4. Once *Segment* library is added you can start coding.

###Sample
In your xml file you need to add `xmlns:custom="http://schemas.android.com/apk/res/com.segment"` with parent layout.  
```
    <com.segment.Segment
        android:id="@+id/segment"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:count="4"
        app:segmentColor="@color/blue"
        app:text="Android,iphone,sencha,me"
        app:textColor="@color/white" />
```
Now to get the call back in your java code, you have `OnClickSegmentButton` interface.  
You need to implement this interface in your class.  
**OnClickSegmentButton** interface provides one function `onButtonSelected`.  
The Parameters are   
         * view - View object       : Individual button that you have clicked.  
         * position - int           : Position of the button in the segment that is clicked.  

```
public class MainActivity extends Activity implements OnClickSegmentButton{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		Segment segment = (Segment)findViewById(R.id.segment);
		segment.setOnClickSegmentButton(this);
	}

	@Override
	public void onButtonSelected(View view, int position) {
		Log.i("MainActivity", "onButtonSelected"+position+"");
	}
}
```

### Version
1.0
