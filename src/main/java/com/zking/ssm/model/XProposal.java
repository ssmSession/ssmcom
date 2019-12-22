package com.zking.ssm.model;

import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@ToString
public class XProposal {
    private Integer proid;
    private String protype;//提案类型
    private String proany;//案由
    private String protar;//第一提案人
    private String promc;//名次
    private String prodp;//党派
    private String prowyzh;//委员证号
    private String protel;//联系电话
    private String prodwjzw;//单位及职务
    private String proemail;//email
    private String protxdz;//通讯地址
    private String protanr;//提案内容
    private Timestamp prodate;
    private String fileid;
    private String proxgqk;
    private String procbdw;
    private String prolxrxm;
    private String prolxrdw;
    private String prolxrdh;
    private String joinid;
    private Integer protps;
    private String propj;
    private String period;
    private String next;
    private String mark;
    private String postcode;
    private String procategory;
    private String prostate;
    private String procase;
    private String prouserid;
    private String fy;

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }

    public String getProany() {
        return proany;
    }

    public void setProany(String proany) {
        this.proany = proany;
    }

    public String getProtar() {
        return protar;
    }

    public void setProtar(String protar) {
        this.protar = protar;
    }

    public String getPromc() {
        return promc;
    }

    public void setPromc(String promc) {
        this.promc = promc;
    }

    public String getProdp() {
        return prodp;
    }

    public void setProdp(String prodp) {
        this.prodp = prodp;
    }

    public String getProwyzh() {
        return prowyzh;
    }

    public void setProwyzh(String prowyzh) {
        this.prowyzh = prowyzh;
    }

    public String getProtel() {
        return protel;
    }

    public void setProtel(String protel) {
        this.protel = protel;
    }

    public String getProdwjzw() {
        return prodwjzw;
    }

    public void setProdwjzw(String prodwjzw) {
        this.prodwjzw = prodwjzw;
    }

    public String getProemail() {
        return proemail;
    }

    public void setProemail(String proemail) {
        this.proemail = proemail;
    }

    public String getProtxdz() {
        return protxdz;
    }

    public void setProtxdz(String protxdz) {
        this.protxdz = protxdz;
    }

    public String getProtanr() {
        return protanr;
    }

    public void setProtanr(String protanr) {
        this.protanr = protanr;
    }

    public Timestamp getProdate() {
        return prodate;
    }

    public void setProdate(Timestamp prodate) {
        this.prodate = prodate;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getProxgqk() {
        return proxgqk;
    }

    public void setProxgqk(String proxgqk) {
        this.proxgqk = proxgqk;
    }

    public String getProcbdw() {
        return procbdw;
    }

    public void setProcbdw(String procbdw) {
        this.procbdw = procbdw;
    }

    public String getProlxrxm() {
        return prolxrxm;
    }

    public void setProlxrxm(String prolxrxm) {
        this.prolxrxm = prolxrxm;
    }

    public String getProlxrdw() {
        return prolxrdw;
    }

    public void setProlxrdw(String prolxrdw) {
        this.prolxrdw = prolxrdw;
    }

    public String getProlxrdh() {
        return prolxrdh;
    }

    public void setProlxrdh(String prolxrdh) {
        this.prolxrdh = prolxrdh;
    }

    public String getJoinid() {
        return joinid;
    }

    public void setJoinid(String joinid) {
        this.joinid = joinid;
    }

    public Integer getProtps() {
        return protps;
    }

    public void setProtps(Integer protps) {
        this.protps = protps;
    }

    public String getPropj() {
        return propj;
    }

    public void setPropj(String propj) {
        this.propj = propj;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProcategory() {
        return procategory;
    }

    public void setProcategory(String procategory) {
        this.procategory = procategory;
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

    public String getProcase() {
        return procase;
    }

    public void setProcase(String procase) {
        this.procase = procase;
    }

    public String getProuserid() {
        return prouserid;
    }

    public void setProuserid(String prouserid) {
        this.prouserid = prouserid;
    }

    public String getFy() {
        return fy;
    }

    public void setFy(String fy) {
        this.fy = fy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XProposal xProposal = (XProposal) o;
        return Objects.equals(proid, xProposal.proid) &&
                Objects.equals(protype, xProposal.protype) &&
                Objects.equals(proany, xProposal.proany) &&
                Objects.equals(protar, xProposal.protar) &&
                Objects.equals(promc, xProposal.promc) &&
                Objects.equals(prodp, xProposal.prodp) &&
                Objects.equals(prowyzh, xProposal.prowyzh) &&
                Objects.equals(protel, xProposal.protel) &&
                Objects.equals(prodwjzw, xProposal.prodwjzw) &&
                Objects.equals(proemail, xProposal.proemail) &&
                Objects.equals(protxdz, xProposal.protxdz) &&
                Objects.equals(protanr, xProposal.protanr) &&
                Objects.equals(prodate, xProposal.prodate) &&
                Objects.equals(fileid, xProposal.fileid) &&
                Objects.equals(proxgqk, xProposal.proxgqk) &&
                Objects.equals(procbdw, xProposal.procbdw) &&
                Objects.equals(prolxrxm, xProposal.prolxrxm) &&
                Objects.equals(prolxrdw, xProposal.prolxrdw) &&
                Objects.equals(prolxrdh, xProposal.prolxrdh) &&
                Objects.equals(joinid, xProposal.joinid) &&
                Objects.equals(protps, xProposal.protps) &&
                Objects.equals(propj, xProposal.propj) &&
                Objects.equals(period, xProposal.period) &&
                Objects.equals(next, xProposal.next) &&
                Objects.equals(mark, xProposal.mark) &&
                Objects.equals(postcode, xProposal.postcode) &&
                Objects.equals(procategory, xProposal.procategory) &&
                Objects.equals(prostate, xProposal.prostate) &&
                Objects.equals(procase, xProposal.procase) &&
                Objects.equals(prouserid, xProposal.prouserid) &&
                Objects.equals(fy, xProposal.fy);
    }

    @Override
    public int hashCode() {

        return Objects.hash(proid, protype, proany, protar, promc, prodp, prowyzh, protel, prodwjzw, proemail, protxdz, protanr, prodate, fileid, proxgqk, procbdw, prolxrxm, prolxrdw, prolxrdh, joinid, protps, propj, period, next, mark, postcode, procategory, prostate, procase, prouserid, fy);
    }
}
