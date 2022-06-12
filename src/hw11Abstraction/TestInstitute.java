package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		System.out.println("\n******From regular class ColumbiaUniversity******");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.lawInfo();
		columbiaUniversity.commomRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.gymnasium(); // gymnasium() is the default method from University interface
		columbiaUniversity.caring();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.computerLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.dorm();
		columbiaUniversity.morgue();
		ColumbiaUniversity.Columbia();// columbia() is the static method from ColumbiaUniversity.
		/*
		 * columbiaUniversity.library ();f columbiaUniversity.studyRoom ();
		 * columbiaUniversity.pharmacy(); static method from University, college,
		 * hospital can not be called because these are from Interface. in order to call
		 * a static method either has to be called by the class name or an abstract name
		 * or an interface name.
		 */
		System.out.println("\n******University from Interface******");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library(); // library is a static method from university interface.
		university.commomRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		/*
		 * university.studyroom(); university.pharmacy(); we cannot call it because
		 * these static methods are from another interface
		 */
		System.out.println("\n******From Abstract class MedicalSchool******");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.anthropology();
		MedicalSchool.medical();// static method
	}

}