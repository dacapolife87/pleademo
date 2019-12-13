package kr.plea.pleademo.domain;

public class PushReportVO {
    private String pushId;
    private String senderMsgId;
    private String recvDtm;
    private String recvConfDtm;
    private String msgStatTpCd;
    private String rsltCd;
    private String recvConfYn;

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getSenderMsgId() {
        return senderMsgId;
    }

    public void setSenderMsgId(String senderMsgId) {
        this.senderMsgId = senderMsgId;
    }

    public String getRecvDtm() {
        return recvDtm;
    }

    public void setRecvDtm(String recvDtm) {
        this.recvDtm = recvDtm;
    }

    public String getRecvConfDtm() {
        return recvConfDtm;
    }

    public void setRecvConfDtm(String recvConfDtm) {
        this.recvConfDtm = recvConfDtm;
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

    public String getRecvConfYn() {
        return recvConfYn;
    }

    public void setRecvConfYn(String recvConfYn) {
        this.recvConfYn = recvConfYn;
    }

    @Override
    public String toString() {
        return "PushReportVO{" +
                "pushId='" + pushId + '\'' +
                ", senderMsgId='" + senderMsgId + '\'' +
                ", recvDtm='" + recvDtm + '\'' +
                ", recvConfDtm='" + recvConfDtm + '\'' +
                ", msgStatTpCd='" + msgStatTpCd + '\'' +
                ", rsltCd='" + rsltCd + '\'' +
                ", recvConfYn='" + recvConfYn + '\'' +
                '}';
    }
}
