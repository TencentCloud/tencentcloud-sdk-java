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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCorporationOrderRequest extends AbstractModel{

    /**
    * 企业名称
    */
    @SerializedName("CorpName")
    @Expose
    private String CorpName;

    /**
    * 所有者ID
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 溯源码额度
    */
    @SerializedName("CodeQuota")
    @Expose
    private Long CodeQuota;

    /**
    * 额度过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 金额
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 联系人
    */
    @SerializedName("ContactPerson")
    @Expose
    private String ContactPerson;

    /**
    * 联系电话
    */
    @SerializedName("ContactNumber")
    @Expose
    private String ContactNumber;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 企业名称 
     * @return CorpName 企业名称
     */
    public String getCorpName() {
        return this.CorpName;
    }

    /**
     * Set 企业名称
     * @param CorpName 企业名称
     */
    public void setCorpName(String CorpName) {
        this.CorpName = CorpName;
    }

    /**
     * Get 所有者ID 
     * @return Owner 所有者ID
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 所有者ID
     * @param Owner 所有者ID
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 溯源码额度 
     * @return CodeQuota 溯源码额度
     */
    public Long getCodeQuota() {
        return this.CodeQuota;
    }

    /**
     * Set 溯源码额度
     * @param CodeQuota 溯源码额度
     */
    public void setCodeQuota(Long CodeQuota) {
        this.CodeQuota = CodeQuota;
    }

    /**
     * Get 额度过期时间 
     * @return ExpireTime 额度过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 额度过期时间
     * @param ExpireTime 额度过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 金额 
     * @return Amount 金额
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 金额
     * @param Amount 金额
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 联系人 
     * @return ContactPerson 联系人
     */
    public String getContactPerson() {
        return this.ContactPerson;
    }

    /**
     * Set 联系人
     * @param ContactPerson 联系人
     */
    public void setContactPerson(String ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    /**
     * Get 联系电话 
     * @return ContactNumber 联系电话
     */
    public String getContactNumber() {
        return this.ContactNumber;
    }

    /**
     * Set 联系电话
     * @param ContactNumber 联系电话
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateCorporationOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCorporationOrderRequest(CreateCorporationOrderRequest source) {
        if (source.CorpName != null) {
            this.CorpName = new String(source.CorpName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.CodeQuota != null) {
            this.CodeQuota = new Long(source.CodeQuota);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.ContactPerson != null) {
            this.ContactPerson = new String(source.ContactPerson);
        }
        if (source.ContactNumber != null) {
            this.ContactNumber = new String(source.ContactNumber);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpName", this.CorpName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "CodeQuota", this.CodeQuota);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "ContactPerson", this.ContactPerson);
        this.setParamSimple(map, prefix + "ContactNumber", this.ContactNumber);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

