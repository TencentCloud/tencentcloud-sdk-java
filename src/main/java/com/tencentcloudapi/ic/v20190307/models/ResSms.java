/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResSms extends AbstractModel{

    /**
    * 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 卡片号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msisdn")
    @Expose
    private String Msisdn;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SdkAppid")
    @Expose
    private Long SdkAppid;

    /**
    * 短信内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 短信类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmsType")
    @Expose
    private Long SmsType;

    /**
    * 发送时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendTime")
    @Expose
    private String SendTime;

    /**
    * 推送时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * SUCC：成功  FAIL 失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 回执状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 卡片ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Iccid 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Iccid 卡片ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 卡片号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msisdn 卡片号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsisdn() {
        return this.Msisdn;
    }

    /**
     * Set 卡片号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msisdn 卡片号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsisdn(String Msisdn) {
        this.Msisdn = Msisdn;
    }

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SdkAppid 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSdkAppid() {
        return this.SdkAppid;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SdkAppid 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSdkAppid(Long SdkAppid) {
        this.SdkAppid = SdkAppid;
    }

    /**
     * Get 短信内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 短信内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 短信内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 短信内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 短信类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmsType 短信类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSmsType() {
        return this.SmsType;
    }

    /**
     * Set 短信类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmsType 短信类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmsType(Long SmsType) {
        this.SmsType = SmsType;
    }

    /**
     * Get 发送时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendTime 发送时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendTime() {
        return this.SendTime;
    }

    /**
     * Set 发送时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendTime 发送时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendTime(String SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get 推送时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportTime 推送时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 推送时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportTime 推送时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get SUCC：成功  FAIL 失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark SUCC：成功  FAIL 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set SUCC：成功  FAIL 失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark SUCC：成功  FAIL 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 回执状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 回执状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 回执状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 回执状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ResSms() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResSms(ResSms source) {
        if (source.Iccid != null) {
            this.Iccid = new String(source.Iccid);
        }
        if (source.Msisdn != null) {
            this.Msisdn = new String(source.Msisdn);
        }
        if (source.SdkAppid != null) {
            this.SdkAppid = new Long(source.SdkAppid);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SmsType != null) {
            this.SmsType = new Long(source.SmsType);
        }
        if (source.SendTime != null) {
            this.SendTime = new String(source.SendTime);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Msisdn", this.Msisdn);
        this.setParamSimple(map, prefix + "SdkAppid", this.SdkAppid);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "SmsType", this.SmsType);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

