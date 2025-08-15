package lab08_2;

import java.util.ArrayList;

public class SkilledWorker extends Employee {

	ArrayList<Skill> skills = new ArrayList<>();

	SkilledWorker(String jobTitle, String name) {
		super(jobTitle, name);
	}

	public void addSkill(String skillName, int skillLevel) {
		skills.add(new Skill(skillName, skillLevel));
	}

	public ArrayList<Skill> getSkills() {
		return skills;
	}

	@Override
	public String getInfo() {
		String returnString = "";
		returnString += super.toString() + " has skills:";

		for (Skill skill : getSkills()) {
			returnString += "\r + " + skill.getSkillName() + " (Level " + skill.getSkillLevel() + ")";
		}

		return returnString;
	}

}
