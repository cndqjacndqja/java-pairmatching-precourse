package pairmatching.domain;

import java.util.Arrays;

public enum Course {
	BACKEND("백엔드"),
	FRONTEND("프론트엔드");

	private String name;

	Course(String name) {
		this.name = name;
	}

	public static Course find(String name) {
		return Arrays.stream(values())
			.filter(course -> course.name.equals(name))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("올바르지 않은 코스 입력 값 입니다."));
	}

	@Override
	public String toString() {
		return "백엔드 | 프론트엔드";
	}
}