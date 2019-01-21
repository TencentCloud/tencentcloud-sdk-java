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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentClientElem  extends AbstractModel{

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
    private Integer ApplyTime;

    /**
    * 代客类型，可能值为a/b/c
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
    private Integer HasOverdueBill;

    /**
    * 1:待代理商审核;2:待腾讯云审核
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
     * 获取代理商账号ID
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取代客账号ID
     * @return ClientUin 代客账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * 设置代客账号ID
     * @param ClientUin 代客账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * 获取代客申请时间戳
     * @return ApplyTime 代客申请时间戳
     */
    public Integer getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * 设置代客申请时间戳
     * @param ApplyTime 代客申请时间戳
     */
    public void setApplyTime(Integer ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * 获取代客类型，可能值为a/b/c
     * @return ClientFlag 代客类型，可能值为a/b/c
     */
    public String getClientFlag() {
        return this.ClientFlag;
    }

    /**
     * 设置代客类型，可能值为a/b/c
     * @param ClientFlag 代客类型，可能值为a/b/c
     */
    public void setClientFlag(String ClientFlag) {
        this.ClientFlag = ClientFlag;
    }

    /**
     * 获取代客邮箱，打码显示
     * @return Mail 代客邮箱，打码显示
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * 设置代客邮箱，打码显示
     * @param Mail 代客邮箱，打码显示
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * 获取代客手机，打码显示
     * @return Phone 代客手机，打码显示
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * 设置代客手机，打码显示
     * @param Phone 代客手机，打码显示
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * 获取0表示不欠费，1表示欠费
     * @return HasOverdueBill 0表示不欠费，1表示欠费
     */
    public Integer getHasOverdueBill() {
        return this.HasOverdueBill;
    }

    /**
     * 设置0表示不欠费，1表示欠费
     * @param HasOverdueBill 0表示不欠费，1表示欠费
     */
    public void setHasOverdueBill(Integer HasOverdueBill) {
        this.HasOverdueBill = HasOverdueBill;
    }

    /**
     * 获取1:待代理商审核;2:待腾讯云审核
     * @return Status 1:待代理商审核;2:待腾讯云审核
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置1:待代理商审核;2:待腾讯云审核
     * @param Status 1:待代理商审核;2:待腾讯云审核
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

