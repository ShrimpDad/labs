package lab08_2;

public class Skill {
	public String skillName;
	public int skillLevel;

	Skill(String skillName, int skillLevel) {
		setSkillName(skillName);
		setSkillLevel(skillLevel);
	}

	public String getSkillName() {
		return skillName;
	}

	private void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	private void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
}
