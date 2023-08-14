package anno_p.com.sub1;

// stereotype : 양방향통신(service controller도)
import org.springframework.stereotype.Component;

@Component
public class Mouse {
	String name = "매직마우스", type="블루투스";

	public Mouse() {

	}

	public Mouse(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", type=" + type + "]";
	}
}
