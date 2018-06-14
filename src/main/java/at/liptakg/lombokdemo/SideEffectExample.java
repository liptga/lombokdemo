package at.liptakg.lombokdemo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude="fooo")
public class SideEffectExample {
	private String bar;
	private String fooo;
	
	//these are added later:
	private String myInternalCalculationResult;
	
	private String thisIsSomeCachedValue;
}
