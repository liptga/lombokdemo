package at.liptakg.lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true, exclude="name")
@AllArgsConstructor
public class WrongEntityExample extends POJO{
	private String foo;
	private int bar;
	private String name;
}
