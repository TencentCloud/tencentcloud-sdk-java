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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InviteOrganizationMemberRequest extends AbstractModel {

    /**
    * 被邀请账号Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&._[]-:,
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 关系策略。取值：Financial
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费，1、2 默认必须
    */
    @SerializedName("PermissionIds")
    @Expose
    private Long [] PermissionIds;

    /**
    * 成员所属部门的节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否允许成员退出。允许：Allow，不允许：Denied。
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * 代付者Uin。成员代付费时需要
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * 互信实名主体名称。
    */
    @SerializedName("RelationAuthName")
    @Expose
    private String RelationAuthName;

    /**
    * 互信主体证明文件列表。
    */
    @SerializedName("AuthFile")
    @Expose
    private AuthRelationFile [] AuthFile;

    /**
    * 成员标签列表。最大10个
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 被邀请账号Uin。 
     * @return MemberUin 被邀请账号Uin。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 被邀请账号Uin。
     * @param MemberUin 被邀请账号Uin。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&._[]-:, 
     * @return Name 成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&._[]-:,
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&._[]-:,
     * @param Name 成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&._[]-:,
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 关系策略。取值：Financial 
     * @return PolicyType 关系策略。取值：Financial
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 关系策略。取值：Financial
     * @param PolicyType 关系策略。取值：Financial
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费，1、2 默认必须 
     * @return PermissionIds 成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费，1、2 默认必须
     */
    public Long [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set 成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费，1、2 默认必须
     * @param PermissionIds 成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费，1、2 默认必须
     */
    public void setPermissionIds(Long [] PermissionIds) {
        this.PermissionIds = PermissionIds;
    }

    /**
     * Get 成员所属部门的节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取 
     * @return NodeId 成员所属部门的节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 成员所属部门的节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
     * @param NodeId 成员所属部门的节点ID。可以通过[DescribeOrganizationNodes](https://cloud.tencent.com/document/product/850/82926)获取
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否允许成员退出。允许：Allow，不允许：Denied。 
     * @return IsAllowQuit 是否允许成员退出。允许：Allow，不允许：Denied。
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set 是否允许成员退出。允许：Allow，不允许：Denied。
     * @param IsAllowQuit 是否允许成员退出。允许：Allow，不允许：Denied。
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get 代付者Uin。成员代付费时需要 
     * @return PayUin 代付者Uin。成员代付费时需要
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set 代付者Uin。成员代付费时需要
     * @param PayUin 代付者Uin。成员代付费时需要
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get 互信实名主体名称。 
     * @return RelationAuthName 互信实名主体名称。
     */
    public String getRelationAuthName() {
        return this.RelationAuthName;
    }

    /**
     * Set 互信实名主体名称。
     * @param RelationAuthName 互信实名主体名称。
     */
    public void setRelationAuthName(String RelationAuthName) {
        this.RelationAuthName = RelationAuthName;
    }

    /**
     * Get 互信主体证明文件列表。 
     * @return AuthFile 互信主体证明文件列表。
     */
    public AuthRelationFile [] getAuthFile() {
        return this.AuthFile;
    }

    /**
     * Set 互信主体证明文件列表。
     * @param AuthFile 互信主体证明文件列表。
     */
    public void setAuthFile(AuthRelationFile [] AuthFile) {
        this.AuthFile = AuthFile;
    }

    /**
     * Get 成员标签列表。最大10个 
     * @return Tags 成员标签列表。最大10个
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 成员标签列表。最大10个
     * @param Tags 成员标签列表。最大10个
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public InviteOrganizationMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InviteOrganizationMemberRequest(InviteOrganizationMemberRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsAllowQuit != null) {
            this.IsAllowQuit = new String(source.IsAllowQuit);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
        if (source.RelationAuthName != null) {
            this.RelationAuthName = new String(source.RelationAuthName);
        }
        if (source.AuthFile != null) {
            this.AuthFile = new AuthRelationFile[source.AuthFile.length];
            for (int i = 0; i < source.AuthFile.length; i++) {
                this.AuthFile[i] = new AuthRelationFile(source.AuthFile[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamSimple(map, prefix + "RelationAuthName", this.RelationAuthName);
        this.setParamArrayObj(map, prefix + "AuthFile.", this.AuthFile);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

