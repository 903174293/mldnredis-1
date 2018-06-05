package cn.mldn.red.service;

public interface IRedEvelopeService {
	/**
	 * 进行红包的创建，该创建红包操作里面需要进行红包数据的拆分与检验，检验合格之后进行红包数据的保存
	 * 在进行数据保存的时候，List数据的key的格式为：“envelope-用户名-时间戳”
	 * @param userid 发送红包的用户（微信ID）
	 * @param amount 红包的数量
	 * @param money 红包的总金额
	 * @return 如果红包创建成功返回一个自定义的key
	 */
	public String add(String userid, int amount, double money);
}
