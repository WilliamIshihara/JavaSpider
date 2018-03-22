package dao;

import java.util.List;

import bean.HotQA;

public interface Dao {
	
	void save(HotQA qa,int child_topic_id);
	
	HotQA get(int answer_id);
	
	//通过child_topic_id来查询一个子话题的热门内容
	List<HotQA> list(int child_topic_id);

}
