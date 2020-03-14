package springexamples1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class QBMap 
{
	int qid;
	 String question;
	 Map<String,String> AnsMap;
	public QBMap(int qid, String question, Map<String, String> ansMap) {
		super();
		this.qid = qid;
		this.question = question;
		AnsMap = ansMap;
	}
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<String, String> getAnsMap() {
		return AnsMap;
	}

	public void setAnsMap(Map<String, String> ansMap) {
		AnsMap = ansMap;
	}

	public void showAnswers()
	{
		System.out.println("Qid:"+qid+" Question:"+question);
		System.out.println("The question is answered by following");
		Set  keys=AnsMap.entrySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
				Map.Entry e=(Map.Entry)itr.next();
				System.out.println(e.getKey()+"    "+e.getValue());
		}
	}
}
