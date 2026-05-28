/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbuseReport extends AbstractModel {

    /**
    * <p>发送时间</p>
    */
    @SerializedName("DeliverTime")
    @Expose
    private String DeliverTime;

    /**
    * <p>发信地址</p>
    */
    @SerializedName("OriginalMailFrom")
    @Expose
    private String OriginalMailFrom;

    /**
    * <p>收信地址</p>
    */
    @SerializedName("OriginalRcptTo")
    @Expose
    private String OriginalRcptTo;

    /**
    * <p>发信域名</p>
    */
    @SerializedName("FromDomain")
    @Expose
    private String FromDomain;

    /**
    * <p>投诉时间</p>
    */
    @SerializedName("ComplainTime")
    @Expose
    private String ComplainTime;

    /**
    * <p>收信域名</p>
    */
    @SerializedName("Mta")
    @Expose
    private String Mta;

    /**
    * <p>来源ip</p>
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * <p>数据时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>模板ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>bulkId</p>
    */
    @SerializedName("BulkId")
    @Expose
    private String BulkId;

    /**
    * <p>邮件Message-Id</p>
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * <p>投诉时间</p>
    */
    @SerializedName("AbuseTime")
    @Expose
    private String AbuseTime;

    /**
    * <p>邮件主题</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
     * Get <p>发送时间</p> 
     * @return DeliverTime <p>发送时间</p>
     */
    public String getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * Set <p>发送时间</p>
     * @param DeliverTime <p>发送时间</p>
     */
    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * Get <p>发信地址</p> 
     * @return OriginalMailFrom <p>发信地址</p>
     */
    public String getOriginalMailFrom() {
        return this.OriginalMailFrom;
    }

    /**
     * Set <p>发信地址</p>
     * @param OriginalMailFrom <p>发信地址</p>
     */
    public void setOriginalMailFrom(String OriginalMailFrom) {
        this.OriginalMailFrom = OriginalMailFrom;
    }

    /**
     * Get <p>收信地址</p> 
     * @return OriginalRcptTo <p>收信地址</p>
     */
    public String getOriginalRcptTo() {
        return this.OriginalRcptTo;
    }

    /**
     * Set <p>收信地址</p>
     * @param OriginalRcptTo <p>收信地址</p>
     */
    public void setOriginalRcptTo(String OriginalRcptTo) {
        this.OriginalRcptTo = OriginalRcptTo;
    }

    /**
     * Get <p>发信域名</p> 
     * @return FromDomain <p>发信域名</p>
     */
    public String getFromDomain() {
        return this.FromDomain;
    }

    /**
     * Set <p>发信域名</p>
     * @param FromDomain <p>发信域名</p>
     */
    public void setFromDomain(String FromDomain) {
        this.FromDomain = FromDomain;
    }

    /**
     * Get <p>投诉时间</p> 
     * @return ComplainTime <p>投诉时间</p>
     */
    public String getComplainTime() {
        return this.ComplainTime;
    }

    /**
     * Set <p>投诉时间</p>
     * @param ComplainTime <p>投诉时间</p>
     */
    public void setComplainTime(String ComplainTime) {
        this.ComplainTime = ComplainTime;
    }

    /**
     * Get <p>收信域名</p> 
     * @return Mta <p>收信域名</p>
     */
    public String getMta() {
        return this.Mta;
    }

    /**
     * Set <p>收信域名</p>
     * @param Mta <p>收信域名</p>
     */
    public void setMta(String Mta) {
        this.Mta = Mta;
    }

    /**
     * Get <p>来源ip</p> 
     * @return SourceIp <p>来源ip</p>
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set <p>来源ip</p>
     * @param SourceIp <p>来源ip</p>
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get <p>数据时间</p> 
     * @return InsertTime <p>数据时间</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>数据时间</p>
     * @param InsertTime <p>数据时间</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>模板ID</p> 
     * @return TemplateId <p>模板ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板ID</p>
     * @param TemplateId <p>模板ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>bulkId</p> 
     * @return BulkId <p>bulkId</p>
     */
    public String getBulkId() {
        return this.BulkId;
    }

    /**
     * Set <p>bulkId</p>
     * @param BulkId <p>bulkId</p>
     */
    public void setBulkId(String BulkId) {
        this.BulkId = BulkId;
    }

    /**
     * Get <p>邮件Message-Id</p> 
     * @return MessageId <p>邮件Message-Id</p>
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set <p>邮件Message-Id</p>
     * @param MessageId <p>邮件Message-Id</p>
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get <p>投诉时间</p> 
     * @return AbuseTime <p>投诉时间</p>
     */
    public String getAbuseTime() {
        return this.AbuseTime;
    }

    /**
     * Set <p>投诉时间</p>
     * @param AbuseTime <p>投诉时间</p>
     */
    public void setAbuseTime(String AbuseTime) {
        this.AbuseTime = AbuseTime;
    }

    /**
     * Get <p>邮件主题</p> 
     * @return Subject <p>邮件主题</p>
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set <p>邮件主题</p>
     * @param Subject <p>邮件主题</p>
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public AbuseReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbuseReport(AbuseReport source) {
        if (source.DeliverTime != null) {
            this.DeliverTime = new String(source.DeliverTime);
        }
        if (source.OriginalMailFrom != null) {
            this.OriginalMailFrom = new String(source.OriginalMailFrom);
        }
        if (source.OriginalRcptTo != null) {
            this.OriginalRcptTo = new String(source.OriginalRcptTo);
        }
        if (source.FromDomain != null) {
            this.FromDomain = new String(source.FromDomain);
        }
        if (source.ComplainTime != null) {
            this.ComplainTime = new String(source.ComplainTime);
        }
        if (source.Mta != null) {
            this.Mta = new String(source.Mta);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.BulkId != null) {
            this.BulkId = new String(source.BulkId);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.AbuseTime != null) {
            this.AbuseTime = new String(source.AbuseTime);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliverTime", this.DeliverTime);
        this.setParamSimple(map, prefix + "OriginalMailFrom", this.OriginalMailFrom);
        this.setParamSimple(map, prefix + "OriginalRcptTo", this.OriginalRcptTo);
        this.setParamSimple(map, prefix + "FromDomain", this.FromDomain);
        this.setParamSimple(map, prefix + "ComplainTime", this.ComplainTime);
        this.setParamSimple(map, prefix + "Mta", this.Mta);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "BulkId", this.BulkId);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "AbuseTime", this.AbuseTime);
        this.setParamSimple(map, prefix + "Subject", this.Subject);

    }
}

