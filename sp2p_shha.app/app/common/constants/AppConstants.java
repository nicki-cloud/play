package common.constants;

/**
 * OPT常量
 *
 * @description
 *
 * @author yaoyi
 * @createDate 2016年3月30日
 */
public final class AppConstants {

	private AppConstants() {
	}
	
	/** 111:注册发送短信验证码 */
	public static final int APP_SEND_CODE = 111;
	/** 112:注册会员协议 */
	public static final int APP_REGISTER_PROTOCOL = 112;
	/** 113:会员注册 */
	public static final int APP_REGISTERING = 113;
	/** 114:资金存管开户 */
	public static final int APP_PAYACCOUNT_OPEN = 114;
	/** 115:注册准备 */
	public static final int APP_REGISTER_PRE = 115;
	/** 121:验证验证码 */
	public static final int APP_VERIFICATION_CODE = 121;
	/** 122:修改登录密码 */
	public static final int APP_UPDATE_PWD = 122;
	/** 123:登录 */
	public static final int APP_LOGIN = 123;
	/** 124:绑定邮箱准备 */
	public static final int APP_BIND_EMAIL_PRE = 124;
	/** 125:绑定邮箱*/
	public static final int APP_BIND_EMAIL = 125;
	/** 126:实名认证准备 */
	public static final int APP_RNAUTH_PRE = 126;
	/** 127:实名认证*/
	public static final int APP_RNAUTH = 127;
	/** 128:资金存管开户准备 */
	public static final int APP_PAYACCOUNT_OPEN_PRE = 128;
	/** 129:查询城市列表 */
	public static final int APP_QUERY_CITY = 129;
	
	/** 211:充值 */
	public static final int APP_RECHARGE = 211;
	/** 212:充值记录 */
	public static final int APP_RECHARGE_RECORDS = 212;
	/** 213:提现准备 */
	public static final int APP_WITHDRAWAL_PRE = 213;
	/** 214:提现 */
	public static final int APP_WITHDRAWAL = 214;
	/** 215:提现记录 */
	public static final int APP_WITHDRAWAL_RECORD = 215;
	/** 216:充值准备 */
	public static final int APP_RECHARGE_PRE = 216;

	/** 221:银行卡列表 */
	public static final int APP_USER_BANK_LIST = 221;
	/** 222:绑卡请求 */
	public static final int APP_BIND_CARD = 222;
	/** 223:设置默认卡 */
	public static final int APP_SET_DEFAULT_BANKCARD = 223;

	/** 231:我的投资列表 */
	public static final int APP_MYINVEST = 231;
	/** 232:投资账单 */
	public static final int APP_INVEST_BILL = 232;
	/** 237:投资账单详情 */
	public static final int APP_INVEST_BILL_INFO = 237;
	/** 233:我的借款列表 */
	public static final int APP_LOAN = 233;
	/** 234:借款账单 */
	public static final int APP_LOAN_BILL = 234;
	/** 238:借款账单详情 */
	public static final int APP_LOAN_BILL_INFO = 238;
	/** 235:还款 */
	public static final int APP_LOAN_REPAYMENT = 235;
	/** 236:查看合同 */
	public static final int APP_BID_PACT = 236;
	/** 239:我的受让/转让 */
	public static final int APP_DEBT = 239;
	/** 2312:转让协议 */
	public static final int APP_DEBT_PACT = 2312;
	/** 2313:债权转让申请准备 */
	public static final int APP_APPLAY_DEBT_PRE = 2313;
	/** 2314:债权转让申请 */
	public static final int APP_APPLAY_DEBT = 2314;
	
	/** 241:交易记录 */
	public static final int APP_USER_DEAL_RECORD = 241;
	/** 242:回款计划 */
	public static final int APP_RETUEN_MONEY_PLAN = 242;

	/** 251:个人基本信息 */
	public static final int APP_USER_INFO = 251;
	/** 252:消息列表 */
	public static final int APP_MESSAGE = 252;
	/** 253:获取会员信息详情 */
	public static final int APP_USER_INFO_DETAIL = 253;
	/** 254:保存会员信息详情 */
	public static final int APP_USER_INFO_UPDATE = 254;
	/** 255:修改会员头像 */
	public static final int APP_USER_PHOTO_UPDATE = 255;
	

	/** 261:安全中心 */
	public static final int APP_SECURITY = 261;
	/** 262:根据原密码修改密码 */
	public static final int APP_UPDATE_PWDBYOLD = 262;
	/** 263:修改邮箱 */
	public static final int APP_UPDATE_EMAIL = 263;
	
	
	/** 271:体验金账户信息 */
	public static final int APP_EXP_BID_MYACCOUNT = 271;
	/** 272:体验金投标记录 */
	public static final int APP_EXP_BID_MYINVEST = 272;
	/** 273:体验金领取 */
	public static final int APP_EXP_BID_GOLD_GET = 273;
	/** 274:体验金收益兑换*/
	public static final int APP_EXP_BID_INCOME_CONVERSION = 274;

	/** 311:理财产品列表接口 */
	public static final int APP_INVEST_BIDS = 311;
	/** 312:标详情 */
	public static final int APP_INVEST_BID_INFORMATION = 312;
	/** 321:投标 */
	public static final int APP_INVEST = 321;
	/** 322:借款标详情 */
	public static final int APP_INVEST_BIDS_DETAILS = 322;
	/** 323:回款计划 */
	public static final int APP_INVEST_BIDS_REPAYMENT_PLAN = 323;
	/** 324:投标记录 */
	public static final int APP_INVEST_BIDS_RECORDS = 324;
	/** 331:债权转让列表 */
	public static final int APP_DEBTS = 331;
	/** 332:债权转让信息 */
	public static final int APP_DEBT_DETAIL = 332;
	/** 333:债权回款计划查询 */
	public static final int APP_DEBT_BILLS = 333;
	/** 334:购买债权 */
	public static final int APP_BUY_DEBT = 334;
	
	/** 341:体验标信息 */
	public static final int APP_EXP_BID = 341;
	/** 342:体验标借款详情 */
	public static final int APP_EXP_BID_DETATIL = 342;
	/** 343:体验标投标记录*/
	public static final int APP_EXP_BID_INVEST_RECORD = 343;
	/** 344:体验标投标*/
	public static final int APP_EXP_BID_INVEST = 344;

	
	/** 411:公司介绍 */
	public static final int APP_COMPANY_INFO = 411;
	/** 421:联系我们 */
	public static final int APP_CONTACT_US = 421;
	/** 422:平台logo */
	public static final int APP_PLATFORM_ICON = 422;
	/** 423:app版本 */
	public static final int APP_VERSION = 423;
	/** 424:安全保障 */
	public static final int APP_GUARANTEE = 424;
	/** 425:新手指南 */
	public static final int APP_GUIDE = 425;
	/** 426:更多模块 */
	public static final int APP_ANDMORE = 426;
	/** 427:帮助中心 */
	public static final int APP_HELP = 427;
	/** 428:新手福利 */
	public static final int APP_NOVICE = 428;
	
	/** 511:app首页 */
	public static final int APP_INDEX = 511;
	/** 511:app首页签到 */
	public static final int APP_SIGNIN = 512;

	/** 611:积分商城 */
	public static final int APP_MALL = 611;
	/** 612:红包 */
	public static final int APP_REDPACKET = 612;
	/** 613:加息券 */
	public static final int APP_ADDRATE = 613;
	/** 614:现金券 */
	public static final int APP_CASH = 614;
	/** 621:查看地址列表 */
	public static final int APP_ADDRESSLIST = 621;
	/** 622:添加地址 */
	public static final int APP_ADDADDRESS = 622;
	/** 624:添加地址准备 */
	public static final int APP_ADDRESSLISTREADY = 624;
	/** 631:商品详情 */
	public static final int APP_SHOWMALLGOODS = 631;
	/** 632:商品兑换 */
	public static final int APP_EXCHANGEGOODS = 632;
	
	/* ------------------------- 存管 ------------------------- */
	/** 701:上海银行存管短信接口 */
	public static final int APP_HF_SENDSMSCODE = 701;
	
	/** 702:上海银行存管汇付用户名检查 */
	public static final int APP_CHECK_HF_NAME = 702;
	
	/** 703:上海银行存管账户激活 */
	public static final int APP_BOSACCTACTIVATE = 703;
	
	/** 704:上海银行存管换绑卡 */
	public static final int APP_QUICKBINDING = 704;

	/** 705:获取提现手续费 */
	public static final int APP_QUERY_SERVERFEE = 705;

	
	/** 800:首页公告*/
	public static final int APP_NOTICE = 800;
	/** 801:首页公告详情*/
	public static final int APP_NOTICE_INFO = 801;
	/** 802:首页公告列表*/
	public static final int APP_NOTICE_LIST = 802;
	
	/** 1101:领取体验金 */
	public static final int APP_REC_EXP_GOLD = 1101;
	
	/** 1102:查询体验金账户 */
	public static final int  APP_QUERY_EXP_GOLD_ACCOUNT= 1102;
	
	/** 1103:体验金账户转现 */
	public static final int  APP_SHOW_EXP_GOLD= 1103;
	/** 900:活动中心*/
	public static final int APP_ACTIVITY_CENTER = 900;
	
	/** 9001:常见问题*/
	public static final int APP_FREQUENTLY_ASKED_QUESTIONS = 901;
	
	/** 1000:发现-信息披露-运营报告 */
	public static final int APP_OPERATION_REPORT = 1000;
	
	/** 256:省级联动 : 省级*/
	public static final int APP_PROVINCE = 256;
	
	/** 257:省级联动 : 市级*/
	public static final int APP_AREA = 257;
	
	/** 1201:查询积分记录*/
	public static final int APP_SCORE_RECORD = 1201;
}