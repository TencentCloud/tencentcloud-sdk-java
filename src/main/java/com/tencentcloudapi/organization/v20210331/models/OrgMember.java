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

public class OrgMember extends AbstractModel{

    /**
    * 成员Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 成员名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 成员类型，邀请：Invite， 创建：Create
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberType")
    @Expose
    private String MemberType;

    /**
    * 关系策略类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgPolicyType")
    @Expose
    private String OrgPolicyType;

    /**
    * 关系策略名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgPolicyName")
    @Expose
    private String OrgPolicyName;

    /**
    * 关系策略权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgPermission")
    @Expose
    private OrgPermission [] OrgPermission;

    /**
    * 所属节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 所属节点名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否允许成员退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * 代付者Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * 代付者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * 管理身份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgIdentity")
    @Expose
    private MemberIdentity [] OrgIdentity;

    /**
    * 安全信息绑定状态  未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
     * Get 成员Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberUin 成员Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberUin 成员Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 成员名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 成员名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 成员名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 成员名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 成员类型，邀请：Invite， 创建：Create
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberType 成员类型，邀请：Invite， 创建：Create
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberType() {
        return this.MemberType;
    }

    /**
     * Set 成员类型，邀请：Invite， 创建：Create
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberType 成员类型，邀请：Invite， 创建：Create
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberType(String MemberType) {
        this.MemberType = MemberType;
    }

    /**
     * Get 关系策略类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgPolicyType 关系策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgPolicyType() {
        return this.OrgPolicyType;
    }

    /**
     * Set 关系策略类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgPolicyType 关系策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgPolicyType(String OrgPolicyType) {
        this.OrgPolicyType = OrgPolicyType;
    }

    /**
     * Get 关系策略名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgPolicyName 关系策略名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgPolicyName() {
        return this.OrgPolicyName;
    }

    /**
     * Set 关系策略名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgPolicyName 关系策略名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgPolicyName(String OrgPolicyName) {
        this.OrgPolicyName = OrgPolicyName;
    }

    /**
     * Get 关系策略权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgPermission 关系策略权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrgPermission [] getOrgPermission() {
        return this.OrgPermission;
    }

    /**
     * Set 关系策略权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgPermission 关系策略权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgPermission(OrgPermission [] OrgPermission) {
        this.OrgPermission = OrgPermission;
    }

    /**
     * Get 所属节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 所属节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 所属节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 所属节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 所属节点名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 所属节点名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 所属节点名
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 所属节点名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否允许成员退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowQuit 是否允许成员退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set 是否允许成员退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowQuit 是否允许成员退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get 代付者Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayUin 代付者Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set 代付者Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayUin 代付者Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get 代付者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayName 代付者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set 代付者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayName 代付者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get 管理身份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgIdentity 管理身份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberIdentity [] getOrgIdentity() {
        return this.OrgIdentity;
    }

    /**
     * Set 管理身份
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgIdentity 管理身份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgIdentity(MemberIdentity [] OrgIdentity) {
        this.OrgIdentity = OrgIdentity;
    }

    /**
     * Get 安全信息绑定状态  未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindStatus 安全信息绑定状态  未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 安全信息绑定状态  未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindStatus 安全信息绑定状态  未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    public OrgMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMember(OrgMember source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberType != null) {
            this.MemberType = new String(source.MemberType);
        }
        if (source.OrgPolicyType != null) {
            this.OrgPolicyType = new String(source.OrgPolicyType);
        }
        if (source.OrgPolicyName != null) {
            this.OrgPolicyName = new String(source.OrgPolicyName);
        }
        if (source.OrgPermission != null) {
            this.OrgPermission = new OrgPermission[source.OrgPermission.length];
            for (int i = 0; i < source.OrgPermission.length; i++) {
                this.OrgPermission[i] = new OrgPermission(source.OrgPermission[i]);
            }
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsAllowQuit != null) {
            this.IsAllowQuit = new String(source.IsAllowQuit);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
        if (source.PayName != null) {
            this.PayName = new String(source.PayName);
        }
        if (source.OrgIdentity != null) {
            this.OrgIdentity = new MemberIdentity[source.OrgIdentity.length];
            for (int i = 0; i < source.OrgIdentity.length; i++) {
                this.OrgIdentity[i] = new MemberIdentity(source.OrgIdentity[i]);
            }
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MemberType", this.MemberType);
        this.setParamSimple(map, prefix + "OrgPolicyType", this.OrgPolicyType);
        this.setParamSimple(map, prefix + "OrgPolicyName", this.OrgPolicyName);
        this.setParamArrayObj(map, prefix + "OrgPermission.", this.OrgPermission);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamArrayObj(map, prefix + "OrgIdentity.", this.OrgIdentity);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);

    }
}

