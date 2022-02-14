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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationMemberRequest extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 关系策略  取值：Financial
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 关系权限 取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票 ，1、2 默认必须
    */
    @SerializedName("PermissionIds")
    @Expose
    private Long [] PermissionIds;

    /**
    * 成员所属部门的节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 账号名
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 重试创建传记录ID
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 代付者Uin
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * 管理身份
    */
    @SerializedName("IdentityRoleID")
    @Expose
    private Long [] IdentityRoleID;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 关系策略  取值：Financial 
     * @return PolicyType 关系策略  取值：Financial
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 关系策略  取值：Financial
     * @param PolicyType 关系策略  取值：Financial
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 关系权限 取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票 ，1、2 默认必须 
     * @return PermissionIds 关系权限 取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票 ，1、2 默认必须
     */
    public Long [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set 关系权限 取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票 ，1、2 默认必须
     * @param PermissionIds 关系权限 取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票 ，1、2 默认必须
     */
    public void setPermissionIds(Long [] PermissionIds) {
        this.PermissionIds = PermissionIds;
    }

    /**
     * Get 成员所属部门的节点ID 
     * @return NodeId 成员所属部门的节点ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 成员所属部门的节点ID
     * @param NodeId 成员所属部门的节点ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 账号名 
     * @return AccountName 账号名
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号名
     * @param AccountName 账号名
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
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

    /**
     * Get 重试创建传记录ID 
     * @return RecordId 重试创建传记录ID
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 重试创建传记录ID
     * @param RecordId 重试创建传记录ID
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 代付者Uin 
     * @return PayUin 代付者Uin
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set 代付者Uin
     * @param PayUin 代付者Uin
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get 管理身份 
     * @return IdentityRoleID 管理身份
     */
    public Long [] getIdentityRoleID() {
        return this.IdentityRoleID;
    }

    /**
     * Set 管理身份
     * @param IdentityRoleID 管理身份
     */
    public void setIdentityRoleID(Long [] IdentityRoleID) {
        this.IdentityRoleID = IdentityRoleID;
    }

    public CreateOrganizationMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationMemberRequest(CreateOrganizationMemberRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PermissionIds != null) {
            this.PermissionIds = new Long[source.PermissionIds.length];
            for (int i = 0; i < source.PermissionIds.length; i++) {
                this.PermissionIds[i] = new Long(source.PermissionIds[i]);
            }
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
        if (source.IdentityRoleID != null) {
            this.IdentityRoleID = new Long[source.IdentityRoleID.length];
            for (int i = 0; i < source.IdentityRoleID.length; i++) {
                this.IdentityRoleID[i] = new Long(source.IdentityRoleID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamArraySimple(map, prefix + "IdentityRoleID.", this.IdentityRoleID);

    }
}

