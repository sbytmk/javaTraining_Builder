public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("�����璋�ɂ�����");
		builder.makeItems(new String[] { "�������������܂�", "����ɂ���", });
		builder.makeString("���");
		builder.makeItems(new String[] { "����΂��", "���₷�݂Ȃ���", "���悤�Ȃ�", });
		builder.close();
	}
}
