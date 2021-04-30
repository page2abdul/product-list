package com.list.products.models;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Rates {

	private Double aed;
	private Double afn;
	private Double all;
	private Double amd;
	private Double ang;
	private Double aoa;
	private Double ars;
	private Double aud;
	private Double awg;
	private Double azn;
	private Double bam;
	private Double bbd;
	private Double bdt;
	private Double bgn;
	private Double bhd;
	private Double bif;
	private Double bmd;
	private Double bnd;
	private Double bob;
	private Double brl;
	private Double bsd;
	private Double btc;
	private Double btn;
	private Double bwp;
	private Double byn;
	private Double byr;
	private Double bzd;
	private Double cad;
	private Double cdf;
	private Double chf;
	private Double clf;
	private Double clp;
	private Double cny;
	private Double cop;
	private Double crc;
	private Double cuc;
	private Double cup;
	private Double cve;
	private Double czk;
	private Double djf;
	private Double dkk;
	private Double dop;
	private Double dzd;
	private Double egp;
	private Double ern;
	private Double etb;
	private Integer eur;
	private Double fjd;
	private Double fkp;
	private Double gbp;
	private Double gel;
	private Double ggp;
	private Double ghs;
	private Double gip;
	private Double gmd;
	private Double gnf;
	private Double gtq;
	private Double gyd;
	private Double hkd;
	private Double hnl;
	private Double hrk;
	private Double htg;
	private Double huf;
	private Double idr;
	private Double ils;
	private Double imp;
	private Double inr;
	private Double iqd;
	private Double irr;
	private Double isk;
	private Double jep;
	private Double jmd;
	private Double jod;
	private Double jpy;
	private Double kes;
	private Double kgs;
	private Double khr;
	private Double kmf;
	private Double kpw;
	private Double krw;
	private Double kwd;
	private Double kyd;
	private Double kzt;
	private Double lak;
	private Double lbp;
	private Double lkr;
	private Double lrd;
	private Double lsl;
	private Double ltl;
	private Double lvl;
	private Double lyd;
	private Double mad;
	private Double mdl;
	private Double mga;
	private Double mkd;
	private Double mmk;
	private Double mnt;
	private Double mop;
	private Double mro;
	private Double mur;
	private Double mvr;
	private Double mwk;
	private Double mxn;
	private Double myr;
	private Double mzn;
	private Double nad;
	private Double ngn;
	private Double nio;
	private Double nok;
	private Double npr;
	private Double nzd;
	private Double omr;
	private Double pab;
	private Double pen;
	private Double pgk;
	private Double php;
	private Double pkr;
	private Double pln;
	private Double pyg;
	private Double qar;
	private Double ron;
	private Double rsd;
	private Double rub;
	private Double rwf;
	private Double sar;
	private Double sbd;
	private Double scr;
	private Double sdg;
	private Double sek;
	private Double sgd;
	private Double shp;
	private Double sll;
	private Double sos;
	private Double srd;
	private Double std;
	private Double svc;
	private Double syp;
	private Double szl;
	private Double thb;
	private Double tjs;
	private Double tmt;
	private Double tnd;
	private Double top;
	private Double _try;
	private Double ttd;
	private Double twd;
	private Double tzs;
	private Double uah;
	private Double ugx;
	private Double usd;
	private Double uyu;
	private Double uzs;
	private Double vef;
	private Double vnd;
	private Double vuv;
	private Double wst;
	private Double xaf;
	private Double xag;
	private Double xau;
	private Double xcd;
	private Double xdr;
	private Double xof;
	private Double xpf;
	private Double yer;
	private Double zar;
	private Double zmk;
	private Double zmw;
	private Double zwl;

	public Double getAed() {
		return aed;
	}

	public void setAed(Double aed) {
		this.aed = aed;
	}

	public Double getAfn() {
		return afn;
	}

	public void setAfn(Double afn) {
		this.afn = afn;
	}

	public Double getAll() {
		return all;
	}

	public void setAll(Double all) {
		this.all = all;
	}

	public Double getAmd() {
		return amd;
	}

	public void setAmd(Double amd) {
		this.amd = amd;
	}

	public Double getAng() {
		return ang;
	}

	public void setAng(Double ang) {
		this.ang = ang;
	}

	public Double getAoa() {
		return aoa;
	}

	public void setAoa(Double aoa) {
		this.aoa = aoa;
	}

	public Double getArs() {
		return ars;
	}

	public void setArs(Double ars) {
		this.ars = ars;
	}

	public Double getAud() {
		return aud;
	}

	public void setAud(Double aud) {
		this.aud = aud;
	}

	public Double getAwg() {
		return awg;
	}

	public void setAwg(Double awg) {
		this.awg = awg;
	}

	public Double getAzn() {
		return azn;
	}

	public void setAzn(Double azn) {
		this.azn = azn;
	}

	public Double getBam() {
		return bam;
	}

	public void setBam(Double bam) {
		this.bam = bam;
	}

	public Double getBbd() {
		return bbd;
	}

	public void setBbd(Double bbd) {
		this.bbd = bbd;
	}

	public Double getBdt() {
		return bdt;
	}

	public void setBdt(Double bdt) {
		this.bdt = bdt;
	}

	public Double getBgn() {
		return bgn;
	}

	public void setBgn(Double bgn) {
		this.bgn = bgn;
	}

	public Double getBhd() {
		return bhd;
	}

	public void setBhd(Double bhd) {
		this.bhd = bhd;
	}

	public Double getBif() {
		return bif;
	}

	public void setBif(Double bif) {
		this.bif = bif;
	}

	public Double getBmd() {
		return bmd;
	}

	public void setBmd(Double bmd) {
		this.bmd = bmd;
	}

	public Double getBnd() {
		return bnd;
	}

	public void setBnd(Double bnd) {
		this.bnd = bnd;
	}

	public Double getBob() {
		return bob;
	}

	public void setBob(Double bob) {
		this.bob = bob;
	}

	public Double getBrl() {
		return brl;
	}

	public void setBrl(Double brl) {
		this.brl = brl;
	}

	public Double getBsd() {
		return bsd;
	}

	public void setBsd(Double bsd) {
		this.bsd = bsd;
	}

	public Double getBtc() {
		return btc;
	}

	public void setBtc(Double btc) {
		this.btc = btc;
	}

	public Double getBtn() {
		return btn;
	}

	public void setBtn(Double btn) {
		this.btn = btn;
	}

	public Double getBwp() {
		return bwp;
	}

	public void setBwp(Double bwp) {
		this.bwp = bwp;
	}

	public Double getByn() {
		return byn;
	}

	public void setByn(Double byn) {
		this.byn = byn;
	}

	public Double getByr() {
		return byr;
	}

	public void setByr(Double byr) {
		this.byr = byr;
	}

	public Double getBzd() {
		return bzd;
	}

	public void setBzd(Double bzd) {
		this.bzd = bzd;
	}

	public Double getCad() {
		return cad;
	}

	public void setCad(Double cad) {
		this.cad = cad;
	}

	public Double getCdf() {
		return cdf;
	}

	public void setCdf(Double cdf) {
		this.cdf = cdf;
	}

	public Double getChf() {
		return chf;
	}

	public void setChf(Double chf) {
		this.chf = chf;
	}

	public Double getClf() {
		return clf;
	}

	public void setClf(Double clf) {
		this.clf = clf;
	}

	public Double getClp() {
		return clp;
	}

	public void setClp(Double clp) {
		this.clp = clp;
	}

	public Double getCny() {
		return cny;
	}

	public void setCny(Double cny) {
		this.cny = cny;
	}

	public Double getCop() {
		return cop;
	}

	public void setCop(Double cop) {
		this.cop = cop;
	}

	public Double getCrc() {
		return crc;
	}

	public void setCrc(Double crc) {
		this.crc = crc;
	}

	public Double getCuc() {
		return cuc;
	}

	public void setCuc(Double cuc) {
		this.cuc = cuc;
	}

	public Double getCup() {
		return cup;
	}

	public void setCup(Double cup) {
		this.cup = cup;
	}

	public Double getCve() {
		return cve;
	}

	public void setCve(Double cve) {
		this.cve = cve;
	}

	public Double getCzk() {
		return czk;
	}

	public void setCzk(Double czk) {
		this.czk = czk;
	}

	public Double getDjf() {
		return djf;
	}

	public void setDjf(Double djf) {
		this.djf = djf;
	}

	public Double getDkk() {
		return dkk;
	}

	public void setDkk(Double dkk) {
		this.dkk = dkk;
	}

	public Double getDop() {
		return dop;
	}

	public void setDop(Double dop) {
		this.dop = dop;
	}

	public Double getDzd() {
		return dzd;
	}

	public void setDzd(Double dzd) {
		this.dzd = dzd;
	}

	public Double getEgp() {
		return egp;
	}

	public void setEgp(Double egp) {
		this.egp = egp;
	}

	public Double getErn() {
		return ern;
	}

	public void setErn(Double ern) {
		this.ern = ern;
	}

	public Double getEtb() {
		return etb;
	}

	public void setEtb(Double etb) {
		this.etb = etb;
	}

	public Integer getEur() {
		return eur;
	}

	public void setEur(Integer eur) {
		this.eur = eur;
	}

	public Double getFjd() {
		return fjd;
	}

	public void setFjd(Double fjd) {
		this.fjd = fjd;
	}

	public Double getFkp() {
		return fkp;
	}

	public void setFkp(Double fkp) {
		this.fkp = fkp;
	}

	public Double getGbp() {
		return gbp;
	}

	public void setGbp(Double gbp) {
		this.gbp = gbp;
	}

	public Double getGel() {
		return gel;
	}

	public void setGel(Double gel) {
		this.gel = gel;
	}

	public Double getGgp() {
		return ggp;
	}

	public void setGgp(Double ggp) {
		this.ggp = ggp;
	}

	public Double getGhs() {
		return ghs;
	}

	public void setGhs(Double ghs) {
		this.ghs = ghs;
	}

	public Double getGip() {
		return gip;
	}

	public void setGip(Double gip) {
		this.gip = gip;
	}

	public Double getGmd() {
		return gmd;
	}

	public void setGmd(Double gmd) {
		this.gmd = gmd;
	}

	public Double getGnf() {
		return gnf;
	}

	public void setGnf(Double gnf) {
		this.gnf = gnf;
	}

	public Double getGtq() {
		return gtq;
	}

	public void setGtq(Double gtq) {
		this.gtq = gtq;
	}

	public Double getGyd() {
		return gyd;
	}

	public void setGyd(Double gyd) {
		this.gyd = gyd;
	}

	public Double getHkd() {
		return hkd;
	}

	public void setHkd(Double hkd) {
		this.hkd = hkd;
	}

	public Double getHnl() {
		return hnl;
	}

	public void setHnl(Double hnl) {
		this.hnl = hnl;
	}

	public Double getHrk() {
		return hrk;
	}

	public void setHrk(Double hrk) {
		this.hrk = hrk;
	}

	public Double getHtg() {
		return htg;
	}

	public void setHtg(Double htg) {
		this.htg = htg;
	}

	public Double getHuf() {
		return huf;
	}

	public void setHuf(Double huf) {
		this.huf = huf;
	}

	public Double getIdr() {
		return idr;
	}

	public void setIdr(Double idr) {
		this.idr = idr;
	}

	public Double getIls() {
		return ils;
	}

	public void setIls(Double ils) {
		this.ils = ils;
	}

	public Double getImp() {
		return imp;
	}

	public void setImp(Double imp) {
		this.imp = imp;
	}

	public Double getInr() {
		return inr;
	}

	public void setInr(Double inr) {
		this.inr = inr;
	}

	public Double getIqd() {
		return iqd;
	}

	public void setIqd(Double iqd) {
		this.iqd = iqd;
	}

	public Double getIrr() {
		return irr;
	}

	public void setIrr(Double irr) {
		this.irr = irr;
	}

	public Double getIsk() {
		return isk;
	}

	public void setIsk(Double isk) {
		this.isk = isk;
	}

	public Double getJep() {
		return jep;
	}

	public void setJep(Double jep) {
		this.jep = jep;
	}

	public Double getJmd() {
		return jmd;
	}

	public void setJmd(Double jmd) {
		this.jmd = jmd;
	}

	public Double getJod() {
		return jod;
	}

	public void setJod(Double jod) {
		this.jod = jod;
	}

	public Double getJpy() {
		return jpy;
	}

	public void setJpy(Double jpy) {
		this.jpy = jpy;
	}

	public Double getKes() {
		return kes;
	}

	public void setKes(Double kes) {
		this.kes = kes;
	}

	public Double getKgs() {
		return kgs;
	}

	public void setKgs(Double kgs) {
		this.kgs = kgs;
	}

	public Double getKhr() {
		return khr;
	}

	public void setKhr(Double khr) {
		this.khr = khr;
	}

	public Double getKmf() {
		return kmf;
	}

	public void setKmf(Double kmf) {
		this.kmf = kmf;
	}

	public Double getKpw() {
		return kpw;
	}

	public void setKpw(Double kpw) {
		this.kpw = kpw;
	}

	public Double getKrw() {
		return krw;
	}

	public void setKrw(Double krw) {
		this.krw = krw;
	}

	public Double getKwd() {
		return kwd;
	}

	public void setKwd(Double kwd) {
		this.kwd = kwd;
	}

	public Double getKyd() {
		return kyd;
	}

	public void setKyd(Double kyd) {
		this.kyd = kyd;
	}

	public Double getKzt() {
		return kzt;
	}

	public void setKzt(Double kzt) {
		this.kzt = kzt;
	}

	public Double getLak() {
		return lak;
	}

	public void setLak(Double lak) {
		this.lak = lak;
	}

	public Double getLbp() {
		return lbp;
	}

	public void setLbp(Double lbp) {
		this.lbp = lbp;
	}

	public Double getLkr() {
		return lkr;
	}

	public void setLkr(Double lkr) {
		this.lkr = lkr;
	}

	public Double getLrd() {
		return lrd;
	}

	public void setLrd(Double lrd) {
		this.lrd = lrd;
	}

	public Double getLsl() {
		return lsl;
	}

	public void setLsl(Double lsl) {
		this.lsl = lsl;
	}

	public Double getLtl() {
		return ltl;
	}

	public void setLtl(Double ltl) {
		this.ltl = ltl;
	}

	public Double getLvl() {
		return lvl;
	}

	public void setLvl(Double lvl) {
		this.lvl = lvl;
	}

	public Double getLyd() {
		return lyd;
	}

	public void setLyd(Double lyd) {
		this.lyd = lyd;
	}

	public Double getMad() {
		return mad;
	}

	public void setMad(Double mad) {
		this.mad = mad;
	}

	public Double getMdl() {
		return mdl;
	}

	public void setMdl(Double mdl) {
		this.mdl = mdl;
	}

	public Double getMga() {
		return mga;
	}

	public void setMga(Double mga) {
		this.mga = mga;
	}

	public Double getMkd() {
		return mkd;
	}

	public void setMkd(Double mkd) {
		this.mkd = mkd;
	}

	public Double getMmk() {
		return mmk;
	}

	public void setMmk(Double mmk) {
		this.mmk = mmk;
	}

	public Double getMnt() {
		return mnt;
	}

	public void setMnt(Double mnt) {
		this.mnt = mnt;
	}

	public Double getMop() {
		return mop;
	}

	public void setMop(Double mop) {
		this.mop = mop;
	}

	public Double getMro() {
		return mro;
	}

	public void setMro(Double mro) {
		this.mro = mro;
	}

	public Double getMur() {
		return mur;
	}

	public void setMur(Double mur) {
		this.mur = mur;
	}

	public Double getMvr() {
		return mvr;
	}

	public void setMvr(Double mvr) {
		this.mvr = mvr;
	}

	public Double getMwk() {
		return mwk;
	}

	public void setMwk(Double mwk) {
		this.mwk = mwk;
	}

	public Double getMxn() {
		return mxn;
	}

	public void setMxn(Double mxn) {
		this.mxn = mxn;
	}

	public Double getMyr() {
		return myr;
	}

	public void setMyr(Double myr) {
		this.myr = myr;
	}

	public Double getMzn() {
		return mzn;
	}

	public void setMzn(Double mzn) {
		this.mzn = mzn;
	}

	public Double getNad() {
		return nad;
	}

	public void setNad(Double nad) {
		this.nad = nad;
	}

	public Double getNgn() {
		return ngn;
	}

	public void setNgn(Double ngn) {
		this.ngn = ngn;
	}

	public Double getNio() {
		return nio;
	}

	public void setNio(Double nio) {
		this.nio = nio;
	}

	public Double getNok() {
		return nok;
	}

	public void setNok(Double nok) {
		this.nok = nok;
	}

	public Double getNpr() {
		return npr;
	}

	public void setNpr(Double npr) {
		this.npr = npr;
	}

	public Double getNzd() {
		return nzd;
	}

	public void setNzd(Double nzd) {
		this.nzd = nzd;
	}

	public Double getOmr() {
		return omr;
	}

	public void setOmr(Double omr) {
		this.omr = omr;
	}

	public Double getPab() {
		return pab;
	}

	public void setPab(Double pab) {
		this.pab = pab;
	}

	public Double getPen() {
		return pen;
	}

	public void setPen(Double pen) {
		this.pen = pen;
	}

	public Double getPgk() {
		return pgk;
	}

	public void setPgk(Double pgk) {
		this.pgk = pgk;
	}

	public Double getPhp() {
		return php;
	}

	public void setPhp(Double php) {
		this.php = php;
	}

	public Double getPkr() {
		return pkr;
	}

	public void setPkr(Double pkr) {
		this.pkr = pkr;
	}

	public Double getPln() {
		return pln;
	}

	public void setPln(Double pln) {
		this.pln = pln;
	}

	public Double getPyg() {
		return pyg;
	}

	public void setPyg(Double pyg) {
		this.pyg = pyg;
	}

	public Double getQar() {
		return qar;
	}

	public void setQar(Double qar) {
		this.qar = qar;
	}

	public Double getRon() {
		return ron;
	}

	public void setRon(Double ron) {
		this.ron = ron;
	}

	public Double getRsd() {
		return rsd;
	}

	public void setRsd(Double rsd) {
		this.rsd = rsd;
	}

	public Double getRub() {
		return rub;
	}

	public void setRub(Double rub) {
		this.rub = rub;
	}

	public Double getRwf() {
		return rwf;
	}

	public void setRwf(Double rwf) {
		this.rwf = rwf;
	}

	public Double getSar() {
		return sar;
	}

	public void setSar(Double sar) {
		this.sar = sar;
	}

	public Double getSbd() {
		return sbd;
	}

	public void setSbd(Double sbd) {
		this.sbd = sbd;
	}

	public Double getScr() {
		return scr;
	}

	public void setScr(Double scr) {
		this.scr = scr;
	}

	public Double getSdg() {
		return sdg;
	}

	public void setSdg(Double sdg) {
		this.sdg = sdg;
	}

	public Double getSek() {
		return sek;
	}

	public void setSek(Double sek) {
		this.sek = sek;
	}

	public Double getSgd() {
		return sgd;
	}

	public void setSgd(Double sgd) {
		this.sgd = sgd;
	}

	public Double getShp() {
		return shp;
	}

	public void setShp(Double shp) {
		this.shp = shp;
	}

	public Double getSll() {
		return sll;
	}

	public void setSll(Double sll) {
		this.sll = sll;
	}

	public Double getSos() {
		return sos;
	}

	public void setSos(Double sos) {
		this.sos = sos;
	}

	public Double getSrd() {
		return srd;
	}

	public void setSrd(Double srd) {
		this.srd = srd;
	}

	public Double getStd() {
		return std;
	}

	public void setStd(Double std) {
		this.std = std;
	}

	public Double getSvc() {
		return svc;
	}

	public void setSvc(Double svc) {
		this.svc = svc;
	}

	public Double getSyp() {
		return syp;
	}

	public void setSyp(Double syp) {
		this.syp = syp;
	}

	public Double getSzl() {
		return szl;
	}

	public void setSzl(Double szl) {
		this.szl = szl;
	}

	public Double getThb() {
		return thb;
	}

	public void setThb(Double thb) {
		this.thb = thb;
	}

	public Double getTjs() {
		return tjs;
	}

	public void setTjs(Double tjs) {
		this.tjs = tjs;
	}

	public Double getTmt() {
		return tmt;
	}

	public void setTmt(Double tmt) {
		this.tmt = tmt;
	}

	public Double getTnd() {
		return tnd;
	}

	public void setTnd(Double tnd) {
		this.tnd = tnd;
	}

	public Double getTop() {
		return top;
	}

	public void setTop(Double top) {
		this.top = top;
	}

	public Double getTry() {
		return _try;
	}

	public void setTry(Double _try) {
		this._try = _try;
	}

	public Double getTtd() {
		return ttd;
	}

	public void setTtd(Double ttd) {
		this.ttd = ttd;
	}

	public Double getTwd() {
		return twd;
	}

	public void setTwd(Double twd) {
		this.twd = twd;
	}

	public Double getTzs() {
		return tzs;
	}

	public void setTzs(Double tzs) {
		this.tzs = tzs;
	}

	public Double getUah() {
		return uah;
	}

	public void setUah(Double uah) {
		this.uah = uah;
	}

	public Double getUgx() {
		return ugx;
	}

	public void setUgx(Double ugx) {
		this.ugx = ugx;
	}

	public Double getUsd() {
		return usd;
	}

	public void setUsd(Double usd) {
		this.usd = usd;
	}

	public Double getUyu() {
		return uyu;
	}

	public void setUyu(Double uyu) {
		this.uyu = uyu;
	}

	public Double getUzs() {
		return uzs;
	}

	public void setUzs(Double uzs) {
		this.uzs = uzs;
	}

	public Double getVef() {
		return vef;
	}

	public void setVef(Double vef) {
		this.vef = vef;
	}

	public Double getVnd() {
		return vnd;
	}

	public void setVnd(Double vnd) {
		this.vnd = vnd;
	}

	public Double getVuv() {
		return vuv;
	}

	public void setVuv(Double vuv) {
		this.vuv = vuv;
	}

	public Double getWst() {
		return wst;
	}

	public void setWst(Double wst) {
		this.wst = wst;
	}

	public Double getXaf() {
		return xaf;
	}

	public void setXaf(Double xaf) {
		this.xaf = xaf;
	}

	public Double getXag() {
		return xag;
	}

	public void setXag(Double xag) {
		this.xag = xag;
	}

	public Double getXau() {
		return xau;
	}

	public void setXau(Double xau) {
		this.xau = xau;
	}

	public Double getXcd() {
		return xcd;
	}

	public void setXcd(Double xcd) {
		this.xcd = xcd;
	}

	public Double getXdr() {
		return xdr;
	}

	public void setXdr(Double xdr) {
		this.xdr = xdr;
	}

	public Double getXof() {
		return xof;
	}

	public void setXof(Double xof) {
		this.xof = xof;
	}

	public Double getXpf() {
		return xpf;
	}

	public void setXpf(Double xpf) {
		this.xpf = xpf;
	}

	public Double getYer() {
		return yer;
	}

	public void setYer(Double yer) {
		this.yer = yer;
	}

	public Double getZar() {
		return zar;
	}

	public void setZar(Double zar) {
		this.zar = zar;
	}

	public Double getZmk() {
		return zmk;
	}

	public void setZmk(Double zmk) {
		this.zmk = zmk;
	}

	public Double getZmw() {
		return zmw;
	}

	public void setZmw(Double zmw) {
		this.zmw = zmw;
	}

	public Double getZwl() {
		return zwl;
	}

	public void setZwl(Double zwl) {
		this.zwl = zwl;
	}
	
	
	
	@Override
	public String toString() {
		return "Rates [aed=" + aed + ", afn=" + afn + ", all=" + all + ", amd=" + amd + ", ang=" + ang + ", aoa=" + aoa
				+ ", ars=" + ars + ", aud=" + aud + ", awg=" + awg + ", azn=" + azn + ", bam=" + bam + ", bbd=" + bbd
				+ ", bdt=" + bdt + ", bgn=" + bgn + ", bhd=" + bhd + ", bif=" + bif + ", bmd=" + bmd + ", bnd=" + bnd
				+ ", bob=" + bob + ", brl=" + brl + ", bsd=" + bsd + ", btc=" + btc + ", btn=" + btn + ", bwp=" + bwp
				+ ", byn=" + byn + ", byr=" + byr + ", bzd=" + bzd + ", cad=" + cad + ", cdf=" + cdf + ", chf=" + chf
				+ ", clf=" + clf + ", clp=" + clp + ", cny=" + cny + ", cop=" + cop + ", crc=" + crc + ", cuc=" + cuc
				+ ", cup=" + cup + ", cve=" + cve + ", czk=" + czk + ", djf=" + djf + ", dkk=" + dkk + ", dop=" + dop
				+ ", dzd=" + dzd + ", egp=" + egp + ", ern=" + ern + ", etb=" + etb + ", eur=" + eur + ", fjd=" + fjd
				+ ", fkp=" + fkp + ", gbp=" + gbp + ", gel=" + gel + ", ggp=" + ggp + ", ghs=" + ghs + ", gip=" + gip
				+ ", gmd=" + gmd + ", gnf=" + gnf + ", gtq=" + gtq + ", gyd=" + gyd + ", hkd=" + hkd + ", hnl=" + hnl
				+ ", hrk=" + hrk + ", htg=" + htg + ", huf=" + huf + ", idr=" + idr + ", ils=" + ils + ", imp=" + imp
				+ ", inr=" + inr + ", iqd=" + iqd + ", irr=" + irr + ", isk=" + isk + ", jep=" + jep + ", jmd=" + jmd
				+ ", jod=" + jod + ", jpy=" + jpy + ", kes=" + kes + ", kgs=" + kgs + ", khr=" + khr + ", kmf=" + kmf
				+ ", kpw=" + kpw + ", krw=" + krw + ", kwd=" + kwd + ", kyd=" + kyd + ", kzt=" + kzt + ", lak=" + lak
				+ ", lbp=" + lbp + ", lkr=" + lkr + ", lrd=" + lrd + ", lsl=" + lsl + ", ltl=" + ltl + ", lvl=" + lvl
				+ ", lyd=" + lyd + ", mad=" + mad + ", mdl=" + mdl + ", mga=" + mga + ", mkd=" + mkd + ", mmk=" + mmk
				+ ", mnt=" + mnt + ", mop=" + mop + ", mro=" + mro + ", mur=" + mur + ", mvr=" + mvr + ", mwk=" + mwk
				+ ", mxn=" + mxn + ", myr=" + myr + ", mzn=" + mzn + ", nad=" + nad + ", ngn=" + ngn + ", nio=" + nio
				+ ", nok=" + nok + ", npr=" + npr + ", nzd=" + nzd + ", omr=" + omr + ", pab=" + pab + ", pen=" + pen
				+ ", pgk=" + pgk + ", php=" + php + ", pkr=" + pkr + ", pln=" + pln + ", pyg=" + pyg + ", qar=" + qar
				+ ", ron=" + ron + ", rsd=" + rsd + ", rub=" + rub + ", rwf=" + rwf + ", sar=" + sar + ", sbd=" + sbd
				+ ", scr=" + scr + ", sdg=" + sdg + ", sek=" + sek + ", sgd=" + sgd + ", shp=" + shp + ", sll=" + sll
				+ ", sos=" + sos + ", srd=" + srd + ", std=" + std + ", svc=" + svc + ", syp=" + syp + ", szl=" + szl
				+ ", thb=" + thb + ", tjs=" + tjs + ", tmt=" + tmt + ", tnd=" + tnd + ", top=" + top + ", _try=" + _try
				+ ", ttd=" + ttd + ", twd=" + twd + ", tzs=" + tzs + ", uah=" + uah + ", ugx=" + ugx + ", usd=" + usd
				+ ", uyu=" + uyu + ", uzs=" + uzs + ", vef=" + vef + ", vnd=" + vnd + ", vuv=" + vuv + ", wst=" + wst
				+ ", xaf=" + xaf + ", xag=" + xag + ", xau=" + xau + ", xcd=" + xcd + ", xdr=" + xdr + ", xof=" + xof
				+ ", xpf=" + xpf + ", yer=" + yer + ", zar=" + zar + ", zmk=" + zmk + ", zmw=" + zmw + ", zwl=" + zwl
				+ "]";
	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
    	RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> str = restTemplate.getForEntity("http://data.fixer.io/api/latest?access_key=9d355d5d9b18def3efdbdc35e99e7f5e",String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Root root = objectMapper.readValue(str.getBody().toLowerCase(), Root.class);
        
        System.out.println(root.getRates());
        
	}

}
