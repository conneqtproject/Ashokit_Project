package com.conneqt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CO_NOTICES")
public class CoNotice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private Long noticeId;

    @Column(name = "case_num")
    private Long caseNum;

    @Column(name = "ed_trace_id")
    private Long edTraceId;

    @Lob
    @Column(name = "co_pdf")
    private byte[] coPdf;

    @Column(name = "print_date")
    private Date printDate;

    @Column(name = "notice_status", columnDefinition = "char(1) default 'P'")
    private char noticeStatus = 'P';

    @Column(name = "created_date")
    private Date createdDate;

   

    public CoNotice() {
        
    }

    

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Long getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Long caseNum) {
        this.caseNum = caseNum;
    }

    public Long getEdTraceId() {
        return edTraceId;
    }

    public void setEdTraceId(Long edTraceId) {
        this.edTraceId = edTraceId;
    }

    public byte[] getCoPdf() {
        return coPdf;
    }

    public void setCoPdf(byte[] coPdf) {
        this.coPdf = coPdf;
    }

    public Date getPrintDate() {
        return printDate;
    }

    public void setPrintDate(Date printDate) {
        this.printDate = printDate;
    }

    public char getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(char noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
