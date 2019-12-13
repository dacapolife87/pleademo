package kr.plea.pleademo.domain;

public class PushMsgVO {
    private String batchId;
    private String appId;
    private String sndTpCd;
    private String rcvDvcId;
    private String rcvPublicToken;
    private String rcvOsCd;
    private String appPkg;
    private String osVer;
    private String appVer;
    private String notiMsg;
    private String notiMsgTitle;
    private String notiImgUrl;
    private String notiOptVal;
    private String dataContent;
    private String resvYn;
    private String resvSendDtm;
    private String senderId;
    private String msgExpireSec;
    private String msgType;
    private String smsSendYn;
    private String custIdNo;
    private String gubunCd;
    private String senderMsgId;

    // CustomIF Fail Case PushMsgLog
    private String pushId;
    private String inputDate;
    private int reqId;
    private String msgStatTpCd;
    private String rsltCd;

    public PushMsgVO() {
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSndTpCd() {
        return sndTpCd;
    }

    public void setSndTpCd(String sndTpCd) {
        this.sndTpCd = sndTpCd;
    }

    public String getRcvDvcId() {
        return rcvDvcId;
    }

    public void setRcvDvcId(String rcvDvcId) {
        this.rcvDvcId = rcvDvcId;
    }

    public String getRcvPublicToken() {
        return rcvPublicToken;
    }

    public void setRcvPublicToken(String rcvPublicToken) {
        this.rcvPublicToken = rcvPublicToken;
    }

    public String getRcvOsCd() {
        return rcvOsCd;
    }

    public void setRcvOsCd(String rcvOsCd) {
        this.rcvOsCd = rcvOsCd;
    }

    public String getAppPkg() {
        return appPkg;
    }

    public void setAppPkg(String appPkg) {
        this.appPkg = appPkg;
    }

    public String getOsVer() {
        return osVer;
    }

    public void setOsVer(String osVer) {
        this.osVer = osVer;
    }

    public String getAppVer() {
        return appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public String getNotiMsg() {
        return notiMsg;
    }

    public void setNotiMsg(String notiMsg) {
        this.notiMsg = notiMsg;
    }

    public String getNotiMsgTitle() {
        return notiMsgTitle;
    }

    public void setNotiMsgTitle(String notiMsgTitle) {
        this.notiMsgTitle = notiMsgTitle;
    }

    public String getNotiImgUrl() {
        return notiImgUrl;
    }

    public void setNotiImgUrl(String notiImgUrl) {
        this.notiImgUrl = notiImgUrl;
    }

    public String getNotiOptVal() {
        return notiOptVal;
    }

    public void setNotiOptVal(String notiOptVal) {
        this.notiOptVal = notiOptVal;
    }

    public String getDataContent() {
        return dataContent;
    }

    public void setDataContent(String dataContent) {
        this.dataContent = dataContent;
    }

    public String getResvYn() {
        return resvYn;
    }

    public void setResvYn(String resvYn) {
        this.resvYn = resvYn;
    }

    public String getResvSendDtm() {
        return resvSendDtm;
    }

    public void setResvSendDtm(String resvSendDtm) {
        this.resvSendDtm = resvSendDtm;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMsgExpireSec() {
        return msgExpireSec;
    }

    public void setMsgExpireSec(String msgExpireSec) {
        this.msgExpireSec = msgExpireSec;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getSmsSendYn() {
        return smsSendYn;
    }

    public void setSmsSendYn(String smsSendYn) {
        this.smsSendYn = smsSendYn;
    }

    public String getCustIdNo() {
        return custIdNo;
    }

    public void setCustIdNo(String custIdNo) {
        this.custIdNo = custIdNo;
    }

    public String getGubunCd() {
        return gubunCd;
    }

    public void setGubunCd(String gubunCd) {
        this.gubunCd = gubunCd;
    }

    public String getSenderMsgId() {
        return senderMsgId;
    }

    public void setSenderMsgId(String senderMsgId) {
        this.senderMsgId = senderMsgId;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getMsgStatTpCd() {
        return msgStatTpCd;
    }

    public void setMsgStatTpCd(String msgStatTpCd) {
        this.msgStatTpCd = msgStatTpCd;
    }

    public String getRsltCd() {
        return rsltCd;
    }

    public void setRsltCd(String rsltCd) {
        this.rsltCd = rsltCd;
    }

    @Override
    public String toString() {
        return "PushMsgVO{" +
                "batchId='" + batchId + '\'' +
                ", appId='" + appId + '\'' +
                ", sndTpCd='" + sndTpCd + '\'' +
                ", rcvDvcId='" + rcvDvcId + '\'' +
                ", rcvPublicToken='" + rcvPublicToken + '\'' +
                ", rcvOsCd='" + rcvOsCd + '\'' +
                ", appPkg='" + appPkg + '\'' +
                ", osVer='" + osVer + '\'' +
                ", appVer='" + appVer + '\'' +
                ", notiMsg='" + notiMsg + '\'' +
                ", notiMsgTitle='" + notiMsgTitle + '\'' +
                ", notiImgUrl='" + notiImgUrl + '\'' +
                ", notiOptVal='" + notiOptVal + '\'' +
                ", dataContent='" + dataContent + '\'' +
                ", resvYn='" + resvYn + '\'' +
                ", resvSendDtm='" + resvSendDtm + '\'' +
                ", senderId='" + senderId + '\'' +
                ", msgExpireSec='" + msgExpireSec + '\'' +
                ", msgType='" + msgType + '\'' +
                ", smsSendYn='" + smsSendYn + '\'' +
                ", custIdNo='" + custIdNo + '\'' +
                ", gubunCd='" + gubunCd + '\'' +
                ", senderMsgId='" + senderMsgId + '\'' +
                ", pushId='" + pushId + '\'' +
                ", inputDate='" + inputDate + '\'' +
                ", reqId=" + reqId +
                ", msgStatTpCd='" + msgStatTpCd + '\'' +
                ", rsltCd='" + rsltCd + '\'' +
                '}';
    }
}
