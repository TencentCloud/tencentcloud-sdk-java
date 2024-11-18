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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentClientElem extends AbstractModel {

    /**
    * 代理商账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 代客账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 代客申请时间戳
    */
    @SerializedName("ApplyTime")
    @Expose
    private Long ApplyTime;

    /**
    * 代客类型，可能值为a/b/c/other
    */
    @SerializedName("ClientFlag")
    @Expose
    private String ClientFlag;

    /**
    * 代客邮箱，打码显示
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 代客手机，打码显示
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 0表示不欠费，1表示欠费
    */
    @SerializedName("HasOverdueBill")
    @Expose
    private Long HasOverdueBill;

    /**
    * 1:待代理商审核;2:待腾讯云审核4:待腾讯云渠道审批
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 业务员ID
    */
    @SerializedName("SalesUin")
    @Expose
    private String SalesUin;

    /**
    * 业务员姓名
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 客户名称，此字段和控制台返回一致。
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
     * Get 代理商账号ID 
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 代客账号ID 
     * @return ClientUin 代客账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 代客账号ID
     * @param ClientUin 代客账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 代客申请时间戳 
     * @return ApplyTime 代客申请时间戳
     */
    public Long getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 代客申请时间戳
     * @param ApplyTime 代客申请时间戳
     */
    public void setApplyTime(Long ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 代客类型，可能值为a/b/c/other 
     * @return ClientFlag 代客类型，可能值为a/b/c/other
     */
    public String getClientFlag() {
        return this.ClientFlag;
    }

    /**
     * Set 代客类型，可能值为a/b/c/other
     * @param ClientFlag 代客类型，可能值为a/b/c/other
     */
    public void setClientFlag(String ClientFlag) {
        this.ClientFlag = ClientFlag;
    }

    /**
     * Get 代客邮箱，打码显示 
     * @return Mail 代客邮箱，打码显示
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 代客邮箱，打码显示
     * @param Mail 代客邮箱，打码显示
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 代客手机，打码显示 
     * @return Phone 代客手机，打码显示
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 代客手机，打码显示
     * @param Phone 代客手机，打码显示
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 0表示不欠费，1表示欠费 
     * @return HasOverdueBill 0表示不欠费，1表示欠费
     */
    public Long getHasOverdueBill() {
        return this.HasOverdueBill;
    }

    /**
     * Set 0表示不欠费，1表示欠费
     * @param HasOverdueBill 0表示不欠费，1表示欠费
     */
    public void setHasOverdueBill(Long HasOverdueBill) {
        this.HasOverdueBill = HasOverdueBill;
    }

    /**
     * Get 1:待代理商审核;2:待腾讯云审核4:待腾讯云渠道审批 
     * @return Status 1:待代理商审核;2:待腾讯云审核4:待腾讯云渠道审批
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1:待代理商审核;2:待腾讯云审核4:待腾讯云渠道审批
     * @param Status 1:待代理商审核;2:待腾讯云审核4:待腾讯云渠道审批
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 业务员ID 
     * @return SalesUin 业务员ID
     */
    public String getSalesUin() {
        return this.SalesUin;
    }

    /**
     * Set 业务员ID
     * @param SalesUin 业务员ID
     */
    public void setSalesUin(String SalesUin) {
        this.SalesUin = SalesUin;
    }

    /**
     * Get 业务员姓名 
     * @return SalesName 业务员姓名
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 业务员姓名
     * @param SalesName 业务员姓名
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 客户名称，此字段和控制台返回一致。 
     * @return ClientName 客户名称，此字段和控制台返回一致。
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set 客户名称，此字段和控制台返回一致。
     * @param ClientName 客户名称，此字段和控制台返回一致。
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public AgentClientElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentClientElem(AgentClientElem source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new String(source.ClientUin);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new Long(source.ApplyTime);
        }
        if (source.ClientFlag != null) {
            this.ClientFlag = new String(source.ClientFlag);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.HasOverdueBill != null) {
            this.HasOverdueBill = new Long(source.HasOverdueBill);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SalesUin != null) {
            this.SalesUin = new String(source.SalesUin);
        }
        if (source.SalesName != null) {
            this.SalesName = new String(source.SalesName);
        }
        if (source.ClientName != null) {
            this.ClientName = new String(source.ClientName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ClientFlag", this.ClientFlag);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "HasOverdueBill", this.HasOverdueBill);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SalesUin", this.SalesUin);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);

    }
}

