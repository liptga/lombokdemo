package at.liptakg.lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false, exclude="name")
@AllArgsConstructor
public class GoodEntityExample extends POJO{
	private String foo;
	private int bar;
	private String name;
}
