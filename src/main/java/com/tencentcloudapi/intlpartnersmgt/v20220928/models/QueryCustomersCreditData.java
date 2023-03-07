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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCustomersCreditData extends AbstractModel{

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 电话
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 欠费标记
    */
    @SerializedName("Arrears")
    @Expose
    private String Arrears;

    /**
    * 绑定时间
    */
    @SerializedName("AssociationTime")
    @Expose
    private String AssociationTime;

    /**
    * 最近到期时间
    */
    @SerializedName("RecentExpiry")
    @Expose
    private String RecentExpiry;

    /**
    * 子客uin
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * 子客授信额度
    */
    @SerializedName("Credit")
    @Expose
    private Float Credit;

    /**
    * 子客剩余额度
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
    * 0：未实名 1: 个人实名 2：企业实名
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 客户备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 强制状态
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 电话 
     * @return Mobile 电话
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 电话
     * @param Mobile 电话
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 欠费标记 
     * @return Arrears 欠费标记
     */
    public String getArrears() {
        return this.Arrears;
    }

    /**
     * Set 欠费标记
     * @param Arrears 欠费标记
     */
    public void setArrears(String Arrears) {
        this.Arrears = Arrears;
    }

    /**
     * Get 绑定时间 
     * @return AssociationTime 绑定时间
     */
    public String getAssociationTime() {
        return this.AssociationTime;
    }

    /**
     * Set 绑定时间
     * @param AssociationTime 绑定时间
     */
    public void setAssociationTime(String AssociationTime) {
        this.AssociationTime = AssociationTime;
    }

    /**
     * Get 最近到期时间 
     * @return RecentExpiry 最近到期时间
     */
    public String getRecentExpiry() {
        return this.RecentExpiry;
    }

    /**
     * Set 最近到期时间
     * @param RecentExpiry 最近到期时间
     */
    public void setRecentExpiry(String RecentExpiry) {
        this.RecentExpiry = RecentExpiry;
    }

    /**
     * Get 子客uin 
     * @return ClientUin 子客uin
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 子客uin
     * @param ClientUin 子客uin
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 子客授信额度 
     * @return Credit 子客授信额度
     */
    public Float getCredit() {
        return this.Credit;
    }

    /**
     * Set 子客授信额度
     * @param Credit 子客授信额度
     */
    public void setCredit(Float Credit) {
        this.Credit = Credit;
    }

    /**
     * Get 子客剩余额度 
     * @return RemainingCredit 子客剩余额度
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set 子客剩余额度
     * @param RemainingCredit 子客剩余额度
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
    }

    /**
     * Get 0：未实名 1: 个人实名 2：企业实名 
     * @return IdentifyType 0：未实名 1: 个人实名 2：企业实名
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 0：未实名 1: 个人实名 2：企业实名
     * @param IdentifyType 0：未实名 1: 个人实名 2：企业实名
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get 客户备注 
     * @return Remark 客户备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 客户备注
     * @param Remark 客户备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 强制状态 
     * @return Force 强制状态
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set 强制状态
     * @param Force 强制状态
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    public QueryCustomersCreditData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCustomersCreditData(QueryCustomersCreditData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Arrears != null) {
            this.Arrears = new String(source.Arrears);
        }
        if (source.AssociationTime != null) {
            this.AssociationTime = new String(source.AssociationTime);
        }
        if (source.RecentExpiry != null) {
            this.RecentExpiry = new String(source.RecentExpiry);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.Credit != null) {
            this.Credit = new Float(source.Credit);
        }
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Arrears", this.Arrears);
        this.setParamSimple(map, prefix + "AssociationTime", this.AssociationTime);
        this.setParamSimple(map, prefix + "RecentExpiry", this.RecentExpiry);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "Credit", this.Credit);
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

