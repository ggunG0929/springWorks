package anno_p.com;

import org.springframework.stereotype.Component;

// bbcc로 불러올 수 있게 됨
@Component("bbcc")
public class Bonche {
	String name="삼보트라이젠", cpu="1.33Ghz";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Bonche [name=" + name + ", cpu=" + cpu + "]";
	}
}
