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

public class UpdateOrganizationMemberRequest extends AbstractModel{

    /**
    * 成员Uin。
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
    * 备注。最大长度为40个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 关系策略类型。PolicyType不为空，PermissionIds不能为空。取值：Financial
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 成员财务权限ID列表。PermissionIds不为空，PolicyType不能为空。
取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析，如果有值，1、2 默认必须
    */
    @SerializedName("PermissionIds")
    @Expose
    private Long [] PermissionIds;

    /**
    * 是否允许成员退出组织。取值：Allow-允许、Denied-不允许
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * 代付者Uin。成员财务权限有代付费时需要，取值为成员对应主体的主体管理员Uin
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
     * Get 成员Uin。 
     * @return MemberUin 成员Uin。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员Uin。
     * @param MemberUin 成员Uin。
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
     * Get 备注。最大长度为40个字符 
     * @return Remark 备注。最大长度为40个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。最大长度为40个字符
     * @param Remark 备注。最大长度为40个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 关系策略类型。PolicyType不为空，PermissionIds不能为空。取值：Financial 
     * @return PolicyType 关系策略类型。PolicyType不为空，PermissionIds不能为空。取值：Financial
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 关系策略类型。PolicyType不为空，PermissionIds不能为空。取值：Financial
     * @param PolicyType 关系策略类型。PolicyType不为空，PermissionIds不能为空。取值：Financial
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 成员财务权限ID列表。PermissionIds不为空，PolicyType不能为空。
取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析，如果有值，1、2 默认必须 
     * @return PermissionIds 成员财务权限ID列表。PermissionIds不为空，PolicyType不能为空。
取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析，如果有值，1、2 默认必须
     */
    public Long [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set 成员财务权限ID列表。PermissionIds不为空，PolicyType不能为空。
取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析，如果有值，1、2 默认必须
     * @param PermissionIds 成员财务权限ID列表。PermissionIds不为空，PolicyType不能为空。
取值：1-查看账单、2-查看余额、3-资金划拨、4-合并出账、5-开票、6-优惠继承、7-代付费、8-成本分析，如果有值，1、2 默认必须
     */
    public void setPermissionIds(Long [] PermissionIds) {
        this.PermissionIds = PermissionIds;
    }

    /**
     * Get 是否允许成员退出组织。取值：Allow-允许、Denied-不允许 
     * @return IsAllowQuit 是否允许成员退出组织。取值：Allow-允许、Denied-不允许
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set 是否允许成员退出组织。取值：Allow-允许、Denied-不允许
     * @param IsAllowQuit 是否允许成员退出组织。取值：Allow-允许、Denied-不允许
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get 代付者Uin。成员财务权限有代付费时需要，取值为成员对应主体的主体管理员Uin 
     * @return PayUin 代付者Uin。成员财务权限有代付费时需要，取值为成员对应主体的主体管理员Uin
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set 代付者Uin。成员财务权限有代付费时需要，取值为成员对应主体的主体管理员Uin
     * @param PayUin 代付者Uin。成员财务权限有代付费时需要，取值为成员对应主体的主体管理员Uin
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    public UpdateOrganizationMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrganizationMemberRequest(UpdateOrganizationMemberRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        if (source.IsAllowQuit != null) {
            this.IsAllowQuit = new String(source.IsAllowQuit);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);

    }
}

