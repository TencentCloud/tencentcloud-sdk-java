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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationMemberRequest extends AbstractModel {

    /**
    * <p>成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>关系策略。取值：Financial</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨（若需要开启资金划拨权限，请联系您的商务经理内部开通。）、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析、9-预算管理、10-信用额度设置（若需要开启信用额度设置权限，请联系您的商务经理内部开通。），1、2 默认必须</p>
    */
    @SerializedName("PermissionIds")
    @Expose
    private Long [] PermissionIds;

    /**
    * <p>成员所属部门的节点ID。可以通过<a href="https://cloud.tencent.com/document/product/850/82926">DescribeOrganizationNodes</a>获取</p>
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * <p>账号名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>备注。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>成员创建记录ID。创建异常重试时需要</p>
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * <p>代付者Uin。成员代付费时需要</p>
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * <p>成员访问身份ID列表。可以调用ListOrganizationIdentity获取，1默认支持</p>
    */
    @SerializedName("IdentityRoleID")
    @Expose
    private Long [] IdentityRoleID;

    /**
    * <p>认证主体关系ID。给不同主体创建成员时需要，可以调用DescribeOrganizationAuthNode获取</p>
    */
    @SerializedName("AuthRelationId")
    @Expose
    private Long AuthRelationId;

    /**
    * <p>成员标签列表。最大10个</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p> 
     * @return Name <p>成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
     * @param Name <p>成员名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>关系策略。取值：Financial</p> 
     * @return PolicyType <p>关系策略。取值：Financial</p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>关系策略。取值：Financial</p>
     * @param PolicyType <p>关系策略。取值：Financial</p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨（若需要开启资金划拨权限，请联系您的商务经理内部开通。）、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析、9-预算管理、10-信用额度设置（若需要开启信用额度设置权限，请联系您的商务经理内部开通。），1、2 默认必须</p> 
     * @return PermissionIds <p>成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨（若需要开启资金划拨权限，请联系您的商务经理内部开通。）、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析、9-预算管理、10-信用额度设置（若需要开启信用额度设置权限，请联系您的商务经理内部开通。），1、2 默认必须</p>
     */
    public Long [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set <p>成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨（若需要开启资金划拨权限，请联系您的商务经理内部开通。）、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析、9-预算管理、10-信用额度设置（若需要开启信用额度设置权限，请联系您的商务经理内部开通。），1、2 默认必须</p>
     * @param PermissionIds <p>成员财务权限ID列表。取值：1-查看账单、2-查看余额、3-资金划拨（若需要开启资金划拨权限，请联系您的商务经理内部开通。）、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析、9-预算管理、10-信用额度设置（若需要开启信用额度设置权限，请联系您的商务经理内部开通。），1、2 默认必须</p>
     */
    public void setPermissionIds(Long [] PermissionIds) {
        this.PermissionIds = PermissionIds;
    }

    /**
     * Get <p>成员所属部门的节点ID。可以通过<a href="https://cloud.tencent.com/document/product/850/82926">DescribeOrganizationNodes</a>获取</p> 
     * @return NodeId <p>成员所属部门的节点ID。可以通过<a href="https://cloud.tencent.com/document/product/850/82926">DescribeOrganizationNodes</a>获取</p>
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>成员所属部门的节点ID。可以通过<a href="https://cloud.tencent.com/document/product/850/82926">DescribeOrganizationNodes</a>获取</p>
     * @param NodeId <p>成员所属部门的节点ID。可以通过<a href="https://cloud.tencent.com/document/product/850/82926">DescribeOrganizationNodes</a>获取</p>
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>账号名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p> 
     * @return AccountName <p>账号名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>账号名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
     * @param AccountName <p>账号名称。最大长度为25个字符，支持英文字母、数字、汉字、符号+@、&amp;._[]-:,</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>备注。</p> 
     * @return Remark <p>备注。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注。</p>
     * @param Remark <p>备注。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>成员创建记录ID。创建异常重试时需要</p> 
     * @return RecordId <p>成员创建记录ID。创建异常重试时需要</p>
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>成员创建记录ID。创建异常重试时需要</p>
     * @param RecordId <p>成员创建记录ID。创建异常重试时需要</p>
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>代付者Uin。成员代付费时需要</p> 
     * @return PayUin <p>代付者Uin。成员代付费时需要</p>
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set <p>代付者Uin。成员代付费时需要</p>
     * @param PayUin <p>代付者Uin。成员代付费时需要</p>
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get <p>成员访问身份ID列表。可以调用ListOrganizationIdentity获取，1默认支持</p> 
     * @return IdentityRoleID <p>成员访问身份ID列表。可以调用ListOrganizationIdentity获取，1默认支持</p>
     */
    public Long [] getIdentityRoleID() {
        return this.IdentityRoleID;
    }

    /**
     * Set <p>成员访问身份ID列表。可以调用ListOrganizationIdentity获取，1默认支持</p>
     * @param IdentityRoleID <p>成员访问身份ID列表。可以调用ListOrganizationIdentity获取，1默认支持</p>
     */
    public void setIdentityRoleID(Long [] IdentityRoleID) {
        this.IdentityRoleID = IdentityRoleID;
    }

    /**
     * Get <p>认证主体关系ID。给不同主体创建成员时需要，可以调用DescribeOrganizationAuthNode获取</p> 
     * @return AuthRelationId <p>认证主体关系ID。给不同主体创建成员时需要，可以调用DescribeOrganizationAuthNode获取</p>
     */
    public Long getAuthRelationId() {
        return this.AuthRelationId;
    }

    /**
     * Set <p>认证主体关系ID。给不同主体创建成员时需要，可以调用DescribeOrganizationAuthNode获取</p>
     * @param AuthRelationId <p>认证主体关系ID。给不同主体创建成员时需要，可以调用DescribeOrganizationAuthNode获取</p>
     */
    public void setAuthRelationId(Long AuthRelationId) {
        this.AuthRelationId = AuthRelationId;
    }

    /**
     * Get <p>成员标签列表。最大10个</p> 
     * @return Tags <p>成员标签列表。最大10个</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>成员标签列表。最大10个</p>
     * @param Tags <p>成员标签列表。最大10个</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
        if (source.AuthRelationId != null) {
            this.AuthRelationId = new Long(source.AuthRelationId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamArraySimple(map, prefix + "IdentityRoleID.", this.IdentityRoleID);
        this.setParamSimple(map, prefix + "AuthRelationId", this.AuthRelationId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

