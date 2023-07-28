package com.healpio.vo;

	import lombok.Data;

	@Data
	public class PageDto {

		private Criteria cri;	// ��������ȣ, �������� �Խù���
		private int total;		// �� �Խù��� ��
		
		private int startNo;	// ������ ����� ���۹�ȣ
		private int endNo;		// ������ ����� ����ȣ
		
		private boolean prev, next;	// ����, ���� ��ư Ȱ��(true)/��Ȱ��(false) 
		
		int realEnd;			// ������ ����ȣ
		
		public PageDto(Criteria cri, int total){
			this.cri = cri;
			this.total = total;
			
			// ������ ���� ����ȣ
			this.endNo = (int)(Math.ceil(cri.getPageNo()/5.0) * 5);
			// ������ ���� ���۹�ȣ
			this.startNo = this.endNo - 4;
			
			// �� �Խù��� ���� �������� �������� �Խù��� ���� ������ ���� �������� ��ȣ�� ����
			realEnd = (int)(Math.ceil((total*1.0)/cri.getAmount()));
			endNo = endNo>realEnd ? realEnd : endNo;
			
			prev = startNo>1 ? true: false;
			next = endNo==realEnd ? false: true;
		}
		
	}


