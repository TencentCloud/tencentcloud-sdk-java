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

public class CreateDspmApplyOrderRequest extends AbstractModel {

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 申请类型。0-子账号授权 1-访客授权。
    */
    @SerializedName("ApplyType")
    @Expose
    private Long ApplyType;

    /**
    * 权限信息。
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * 主机地址。当前仅支持'%'。默认'%'。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 从审批完成后开始计算的访问权限失效时间，临时账号有效。单位毫秒。
    */
    @SerializedName("ValidatePeriod")
    @Expose
    private Long ValidatePeriod;

    /**
    * 审批人列表。为空使用资产全部管理员。
    */
    @SerializedName("ApproverUin")
    @Expose
    private String [] ApproverUin;

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
    * 被授权者。子账号授权时，传目标uin，为空时默认使用当前uin；访客授权时传访客身份id。
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

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
     * Get 申请类型。0-子账号授权 1-访客授权。 
     * @return ApplyType 申请类型。0-子账号授权 1-访客授权。
     */
    public Long getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set 申请类型。0-子账号授权 1-访客授权。
     * @param ApplyType 申请类型。0-子账号授权 1-访客授权。
     */
    public void setApplyType(Long ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get 权限信息。 
     * @return Privilege 权限信息。
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 权限信息。
     * @param Privilege 权限信息。
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 主机地址。当前仅支持'%'。默认'%'。 
     * @return Host 主机地址。当前仅支持'%'。默认'%'。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机地址。当前仅支持'%'。默认'%'。
     * @param Host 主机地址。当前仅支持'%'。默认'%'。
     */
    public void setHost(String Host) {
        this.Host = Host;
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
     * Get 审批人列表。为空使用资产全部管理员。 
     * @return ApproverUin 审批人列表。为空使用资产全部管理员。
     */
    public String [] getApproverUin() {
        return this.ApproverUin;
    }

    /**
     * Set 审批人列表。为空使用资产全部管理员。
     * @param ApproverUin 审批人列表。为空使用资产全部管理员。
     */
    public void setApproverUin(String [] ApproverUin) {
        this.ApproverUin = ApproverUin;
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
     * Get 被授权者。子账号授权时，传目标uin，为空时默认使用当前uin；访客授权时传访客身份id。 
     * @return Subject 被授权者。子账号授权时，传目标uin，为空时默认使用当前uin；访客授权时传访客身份id。
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 被授权者。子账号授权时，传目标uin，为空时默认使用当前uin；访客授权时传访客身份id。
     * @param Subject 被授权者。子账号授权时，传目标uin，为空时默认使用当前uin；访客授权时传访客身份id。
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public CreateDspmApplyOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmApplyOrderRequest(CreateDspmApplyOrderRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.ApplyType != null) {
            this.ApplyType = new Long(source.ApplyType);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ValidatePeriod != null) {
            this.ValidatePeriod = new Long(source.ValidatePeriod);
        }
        if (source.ApproverUin != null) {
            this.ApproverUin = new String[source.ApproverUin.length];
            for (int i = 0; i < source.ApproverUin.length; i++) {
                this.ApproverUin[i] = new String(source.ApproverUin[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ManagerType != null) {
            this.ManagerType = new Long(source.ManagerType);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ValidatePeriod", this.ValidatePeriod);
        this.setParamArraySimple(map, prefix + "ApproverUin.", this.ApproverUin);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ManagerType", this.ManagerType);
        this.setParamSimple(map, prefix + "Subject", this.Subject);

    }
}

