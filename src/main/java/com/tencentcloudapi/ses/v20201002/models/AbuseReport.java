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
    * 发送时间
    */
    @SerializedName("DeliverTime")
    @Expose
    private String DeliverTime;

    /**
    * 发信地址
    */
    @SerializedName("OriginalMailFrom")
    @Expose
    private String OriginalMailFrom;

    /**
    * 收信地址
    */
    @SerializedName("OriginalRcptTo")
    @Expose
    private String OriginalRcptTo;

    /**
    * 发信域名
    */
    @SerializedName("FromDomain")
    @Expose
    private String FromDomain;

    /**
    * 投诉时间
    */
    @SerializedName("ComplainTime")
    @Expose
    private String ComplainTime;

    /**
    * 收信域名
    */
    @SerializedName("Mta")
    @Expose
    private String Mta;

    /**
    * 来源ip
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 数据时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * bulkId
    */
    @SerializedName("BulkId")
    @Expose
    private String BulkId;

    /**
    * 邮件Message-Id
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 投诉时间
    */
    @SerializedName("AbuseTime")
    @Expose
    private String AbuseTime;

    /**
    * 邮件主题
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
     * Get 发送时间 
     * @return DeliverTime 发送时间
     */
    public String getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * Set 发送时间
     * @param DeliverTime 发送时间
     */
    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * Get 发信地址 
     * @return OriginalMailFrom 发信地址
     */
    public String getOriginalMailFrom() {
        return this.OriginalMailFrom;
    }

    /**
     * Set 发信地址
     * @param OriginalMailFrom 发信地址
     */
    public void setOriginalMailFrom(String OriginalMailFrom) {
        this.OriginalMailFrom = OriginalMailFrom;
    }

    /**
     * Get 收信地址 
     * @return OriginalRcptTo 收信地址
     */
    public String getOriginalRcptTo() {
        return this.OriginalRcptTo;
    }

    /**
     * Set 收信地址
     * @param OriginalRcptTo 收信地址
     */
    public void setOriginalRcptTo(String OriginalRcptTo) {
        this.OriginalRcptTo = OriginalRcptTo;
    }

    /**
     * Get 发信域名 
     * @return FromDomain 发信域名
     */
    public String getFromDomain() {
        return this.FromDomain;
    }

    /**
     * Set 发信域名
     * @param FromDomain 发信域名
     */
    public void setFromDomain(String FromDomain) {
        this.FromDomain = FromDomain;
    }

    /**
     * Get 投诉时间 
     * @return ComplainTime 投诉时间
     */
    public String getComplainTime() {
        return this.ComplainTime;
    }

    /**
     * Set 投诉时间
     * @param ComplainTime 投诉时间
     */
    public void setComplainTime(String ComplainTime) {
        this.ComplainTime = ComplainTime;
    }

    /**
     * Get 收信域名 
     * @return Mta 收信域名
     */
    public String getMta() {
        return this.Mta;
    }

    /**
     * Set 收信域名
     * @param Mta 收信域名
     */
    public void setMta(String Mta) {
        this.Mta = Mta;
    }

    /**
     * Get 来源ip 
     * @return SourceIp 来源ip
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 来源ip
     * @param SourceIp 来源ip
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 数据时间 
     * @return InsertTime 数据时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 数据时间
     * @param InsertTime 数据时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get bulkId 
     * @return BulkId bulkId
     */
    public String getBulkId() {
        return this.BulkId;
    }

    /**
     * Set bulkId
     * @param BulkId bulkId
     */
    public void setBulkId(String BulkId) {
        this.BulkId = BulkId;
    }

    /**
     * Get 邮件Message-Id 
     * @return MessageId 邮件Message-Id
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 邮件Message-Id
     * @param MessageId 邮件Message-Id
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 投诉时间 
     * @return AbuseTime 投诉时间
     */
    public String getAbuseTime() {
        return this.AbuseTime;
    }

    /**
     * Set 投诉时间
     * @param AbuseTime 投诉时间
     */
    public void setAbuseTime(String AbuseTime) {
        this.AbuseTime = AbuseTime;
    }

    /**
     * Get 邮件主题 
     * @return Subject 邮件主题
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 邮件主题
     * @param Subject 邮件主题
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

