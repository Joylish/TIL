package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	// ���� Ŭ���� ���ο��� persons ����
	void fillPersons(PersonEntity[] persons) {
		persons[0] = new PersonEntity("�̼�ȣ","7212121028102", "��õ ��籸", "032-392-2932");
		persons[1] = new PersonEntity("���ϴ�","7302132363217", "���� ������", "02-362-1932");
		persons[2] = new PersonEntity("�ڿ���","7503111233201", "���� ���ϱ�", "02-887-1542");
		persons[3] = new PersonEntity("���μ�","7312041038988", "���� ������", "032-384-2223");
		persons[4] = new PersonEntity("ȫ����","7606221021341", "���� ��õ��", "02-158-7333");
		persons[5] = new PersonEntity("�̹̼�","7502142021321", "���� ������", "02-323-1934");
		persons[6] = new PersonEntity("�ڼ���","7402061023101", "���� ���α�", "02-308-0932");
		persons[7] = new PersonEntity("������","7103282025101", "���� ����", "02-452-0939");
		persons[8] = new PersonEntity("Ȳ����","7806231031101", "��õ �߱�", "032-327-2202");
		persons[9] = new PersonEntity("��ö��","7601211025101", "��õ ��籸", "032-122-7832");
	}
	
	void showPerson(PersonEntity[] persons) {
		for(PersonEntity person: persons) {
			System.out.println( "[�̸�] "+
				person.getName() +
				"\t[����] "+
				person.getGender()+
				"\t\t[��ȭ��ȣ] "+
				person.getPhone()+
				"\t[�ּ�] "+
				person.getAddress()
			);
		}
	}

	void showPerson(PersonEntity[] persons, String name) {
		for(PersonEntity person:persons) {
			// string�� reference Ÿ���̱� ������ 
			// == �� ����ϸ� �޸� �ּҷ� �񱳵Ǿ� ������ �ٸ��ٴ� �����
			// ���´�.
			if(person.getName().equals(name)) {
				System.out.println(
						"[�̸�] "+
						person.getName() +
						"\n[����] "+
						person.getGender()+
						"\n[��ȭ��ȣ] "+
						person.getPhone()+
						"\n[�ּ�] "+
						person.getAddress()
						);
				break;
			}
		}
	}
	
	int findByPerson(PersonEntity[] persons, char gender) {
		int cnt = 0;
		for(PersonEntity person:persons) {
			if(person.getGender() == gender) {
				cnt += 1;
			}
		}
		return cnt;
	}
	
	void printTitle(String title){
		System.out.print('\n'+title+'\n');
	}
	
	void printTitleLine(){
		System.out.println("=".repeat(60));	}
	
	void printItemLine(){
		System.out.println("-".repeat(60));
	}
	
	public static void main(String[] args) {
		PersonManager pManager = new PersonManager();
		PersonEntity[] persons = new PersonEntity[10];
		
		pManager.fillPersons(persons);
		
		pManager.printTitle("@@@ �ι� ���� ��ȸ �ý��� @@@");
		pManager.printTitleLine();
		pManager.showPerson(persons);
		System.out.println("\n���� '�� '(��)�� "
				+pManager.findByPerson(persons, '��')
				+"�Դϴ�.");
		System.out.println("���� '�� '(��)�� "
				+pManager.findByPerson(persons, '��')
				+"�Դϴ�.");
		pManager.printTitleLine();
		pManager.printTitle("-- �̸�: '���ϴ�'(��)�� ã�� ����Դϴ�. --");
		pManager.printItemLine();
		pManager.showPerson(persons, "���ϴ�");
	}
}