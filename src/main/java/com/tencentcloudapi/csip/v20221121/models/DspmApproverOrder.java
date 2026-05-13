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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmApproverOrder extends AbstractModel {

    /**
    * 对应申请单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 身份id。
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * 申请人账号uin
    */
    @SerializedName("ApplicantUin")
    @Expose
    private DspmUinUser ApplicantUin;

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产名
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 申请类型。0-关联身份 1-编辑身份 2-创建临时身份
    */
    @SerializedName("ApplyType")
    @Expose
    private Long ApplyType;

    /**
    * 申请权限
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * 从审批完成后开始计算的访问权限失效时间，临时账号有效。单位毫秒。
    */
    @SerializedName("ValidatePeriod")
    @Expose
    private Long ValidatePeriod;

    /**
    * 申请原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 管理类型。0-普通成员 1-管理员
    */
    @SerializedName("ManagerType")
    @Expose
    private Long ManagerType;

    /**
    * 个人用户信息
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * 云账号用户信息
    */
    @SerializedName("SubjectUser")
    @Expose
    private DspmUinUser SubjectUser;

    /**
    * 对应申请单创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 对应申请单id 
     * @return OrderId 对应申请单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 对应申请单id
     * @param OrderId 对应申请单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 身份id。 
     * @return IdentifyId 身份id。
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set 身份id。
     * @param IdentifyId 身份id。
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get 申请人账号uin 
     * @return ApplicantUin 申请人账号uin
     */
    public DspmUinUser getApplicantUin() {
        return this.ApplicantUin;
    }

    /**
     * Set 申请人账号uin
     * @param ApplicantUin 申请人账号uin
     */
    public void setApplicantUin(DspmUinUser ApplicantUin) {
        this.ApplicantUin = ApplicantUin;
    }

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产名 
     * @return AssetName 资产名
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
     * @param AssetName 资产名
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 申请类型。0-关联身份 1-编辑身份 2-创建临时身份 
     * @return ApplyType 申请类型。0-关联身份 1-编辑身份 2-创建临时身份
     */
    public Long getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set 申请类型。0-关联身份 1-编辑身份 2-创建临时身份
     * @param ApplyType 申请类型。0-关联身份 1-编辑身份 2-创建临时身份
     */
    public void setApplyType(Long ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get 申请权限 
     * @return Privilege 申请权限
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 申请权限
     * @param Privilege 申请权限
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 从审批完成后开始计算的访问权限失效时间，临时账号有效。单位毫秒。 
     * @return ValidatePeriod 从审批完成后开始计算的访问权限失效时间，临时账号有效。单位毫秒。
     */
    public Long getValidatePeriod() {
        return this.ValidatePeriod;
    }

    /**
     * Set 从审批完成后开始计算的访问权限失效时间，临时账号有效。单位毫秒。
     * @param ValidatePeriod 从审批完成后开始计算的访问权限失效时间，临时账号有效。单位毫秒。
     */
    public void setValidatePeriod(Long ValidatePeriod) {
        this.ValidatePeriod = ValidatePeriod;
    }

    /**
     * Get 申请原因 
     * @return Reason 申请原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 申请原因
     * @param Reason 申请原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 管理类型。0-普通成员 1-管理员 
     * @return ManagerType 管理类型。0-普通成员 1-管理员
     */
    public Long getManagerType() {
        return this.ManagerType;
    }

    /**
     * Set 管理类型。0-普通成员 1-管理员
     * @param ManagerType 管理类型。0-普通成员 1-管理员
     */
    public void setManagerType(Long ManagerType) {
        this.ManagerType = ManagerType;
    }

    /**
     * Get 个人用户信息 
     * @return Person 个人用户信息
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set 个人用户信息
     * @param Person 个人用户信息
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get 云账号用户信息 
     * @return SubjectUser 云账号用户信息
     */
    public DspmUinUser getSubjectUser() {
        return this.SubjectUser;
    }

    /**
     * Set 云账号用户信息
     * @param SubjectUser 云账号用户信息
     */
    public void setSubjectUser(DspmUinUser SubjectUser) {
        this.SubjectUser = SubjectUser;
    }

    /**
     * Get 对应申请单创建时间。 
     * @return CreateTime 对应申请单创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 对应申请单创建时间。
     * @param CreateTime 对应申请单创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DspmApproverOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmApproverOrder(DspmApproverOrder source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.ApplicantUin != null) {
            this.ApplicantUin = new DspmUinUser(source.ApplicantUin);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.ApplyType != null) {
            this.ApplyType = new Long(source.ApplyType);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.ValidatePeriod != null) {
            this.ValidatePeriod = new Long(source.ValidatePeriod);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ManagerType != null) {
            this.ManagerType = new Long(source.ManagerType);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.SubjectUser != null) {
            this.SubjectUser = new DspmUinUser(source.SubjectUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamObj(map, prefix + "ApplicantUin.", this.ApplicantUin);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "ValidatePeriod", this.ValidatePeriod);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ManagerType", this.ManagerType);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "SubjectUser.", this.SubjectUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

