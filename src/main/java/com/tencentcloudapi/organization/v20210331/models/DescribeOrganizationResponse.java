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

public class DescribeOrganizationResponse extends AbstractModel {

    /**
    * <p>企业组织ID。</p>
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * <p>创建者UIN。</p>
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * <p>创建者昵称。</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>企业组织类型。</p>
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * <p>是否组织管理员。是：true ，否：false</p>
    */
    @SerializedName("IsManager")
    @Expose
    private Boolean IsManager;

    /**
    * <p>策略类型。财务管理：Financial</p>
    */
    @SerializedName("OrgPolicyType")
    @Expose
    private String OrgPolicyType;

    /**
    * <p>策略名。</p>
    */
    @SerializedName("OrgPolicyName")
    @Expose
    private String OrgPolicyName;

    /**
    * <p>成员财务权限列表。</p>
    */
    @SerializedName("OrgPermission")
    @Expose
    private OrgPermission [] OrgPermission;

    /**
    * <p>组织根节点ID。</p>
    */
    @SerializedName("RootNodeId")
    @Expose
    private Long RootNodeId;

    /**
    * <p>组织创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>成员加入时间。</p>
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
    * <p>成员是否允许退出。允许：Allow，不允许：Denied</p>
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * <p>代付者Uin。</p>
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * <p>代付者名称。</p>
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * <p>是否可信服务管理员。是：true，否：false</p>
    */
    @SerializedName("IsAssignManager")
    @Expose
    private Boolean IsAssignManager;

    /**
    * <p>是否实名主体管理员。是：true，否：false</p>
    */
    @SerializedName("IsAuthManager")
    @Expose
    private Boolean IsAuthManager;

    /**
    * <p>创建/邀请成员时可设置的财务权限列表</p>
    */
    @SerializedName("MemberPermissionOptions")
    @Expose
    private MemberPermissionOption [] MemberPermissionOptions;

    /**
    * <p>创建/邀请成员时的默认付费方式。</p><p>枚举值：</p><ul><li>SelfPay： 自付</li><li>BehalfPay： 代付</li></ul>
    */
    @SerializedName("DefaultPayType")
    @Expose
    private String DefaultPayType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>企业组织ID。</p> 
     * @return OrgId <p>企业组织ID。</p>
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set <p>企业组织ID。</p>
     * @param OrgId <p>企业组织ID。</p>
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get <p>创建者UIN。</p> 
     * @return HostUin <p>创建者UIN。</p>
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * Set <p>创建者UIN。</p>
     * @param HostUin <p>创建者UIN。</p>
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * Get <p>创建者昵称。</p> 
     * @return NickName <p>创建者昵称。</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>创建者昵称。</p>
     * @param NickName <p>创建者昵称。</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>企业组织类型。</p> 
     * @return OrgType <p>企业组织类型。</p>
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set <p>企业组织类型。</p>
     * @param OrgType <p>企业组织类型。</p>
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * Get <p>是否组织管理员。是：true ，否：false</p> 
     * @return IsManager <p>是否组织管理员。是：true ，否：false</p>
     */
    public Boolean getIsManager() {
        return this.IsManager;
    }

    /**
     * Set <p>是否组织管理员。是：true ，否：false</p>
     * @param IsManager <p>是否组织管理员。是：true ，否：false</p>
     */
    public void setIsManager(Boolean IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get <p>策略类型。财务管理：Financial</p> 
     * @return OrgPolicyType <p>策略类型。财务管理：Financial</p>
     */
    public String getOrgPolicyType() {
        return this.OrgPolicyType;
    }

    /**
     * Set <p>策略类型。财务管理：Financial</p>
     * @param OrgPolicyType <p>策略类型。财务管理：Financial</p>
     */
    public void setOrgPolicyType(String OrgPolicyType) {
        this.OrgPolicyType = OrgPolicyType;
    }

    /**
     * Get <p>策略名。</p> 
     * @return OrgPolicyName <p>策略名。</p>
     */
    public String getOrgPolicyName() {
        return this.OrgPolicyName;
    }

    /**
     * Set <p>策略名。</p>
     * @param OrgPolicyName <p>策略名。</p>
     */
    public void setOrgPolicyName(String OrgPolicyName) {
        this.OrgPolicyName = OrgPolicyName;
    }

    /**
     * Get <p>成员财务权限列表。</p> 
     * @return OrgPermission <p>成员财务权限列表。</p>
     */
    public OrgPermission [] getOrgPermission() {
        return this.OrgPermission;
    }

    /**
     * Set <p>成员财务权限列表。</p>
     * @param OrgPermission <p>成员财务权限列表。</p>
     */
    public void setOrgPermission(OrgPermission [] OrgPermission) {
        this.OrgPermission = OrgPermission;
    }

    /**
     * Get <p>组织根节点ID。</p> 
     * @return RootNodeId <p>组织根节点ID。</p>
     */
    public Long getRootNodeId() {
        return this.RootNodeId;
    }

    /**
     * Set <p>组织根节点ID。</p>
     * @param RootNodeId <p>组织根节点ID。</p>
     */
    public void setRootNodeId(Long RootNodeId) {
        this.RootNodeId = RootNodeId;
    }

    /**
     * Get <p>组织创建时间。</p> 
     * @return CreateTime <p>组织创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>组织创建时间。</p>
     * @param CreateTime <p>组织创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>成员加入时间。</p> 
     * @return JoinTime <p>成员加入时间。</p>
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set <p>成员加入时间。</p>
     * @param JoinTime <p>成员加入时间。</p>
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Get <p>成员是否允许退出。允许：Allow，不允许：Denied</p> 
     * @return IsAllowQuit <p>成员是否允许退出。允许：Allow，不允许：Denied</p>
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set <p>成员是否允许退出。允许：Allow，不允许：Denied</p>
     * @param IsAllowQuit <p>成员是否允许退出。允许：Allow，不允许：Denied</p>
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get <p>代付者Uin。</p> 
     * @return PayUin <p>代付者Uin。</p>
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set <p>代付者Uin。</p>
     * @param PayUin <p>代付者Uin。</p>
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get <p>代付者名称。</p> 
     * @return PayName <p>代付者名称。</p>
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set <p>代付者名称。</p>
     * @param PayName <p>代付者名称。</p>
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get <p>是否可信服务管理员。是：true，否：false</p> 
     * @return IsAssignManager <p>是否可信服务管理员。是：true，否：false</p>
     */
    public Boolean getIsAssignManager() {
        return this.IsAssignManager;
    }

    /**
     * Set <p>是否可信服务管理员。是：true，否：false</p>
     * @param IsAssignManager <p>是否可信服务管理员。是：true，否：false</p>
     */
    public void setIsAssignManager(Boolean IsAssignManager) {
        this.IsAssignManager = IsAssignManager;
    }

    /**
     * Get <p>是否实名主体管理员。是：true，否：false</p> 
     * @return IsAuthManager <p>是否实名主体管理员。是：true，否：false</p>
     */
    public Boolean getIsAuthManager() {
        return this.IsAuthManager;
    }

    /**
     * Set <p>是否实名主体管理员。是：true，否：false</p>
     * @param IsAuthManager <p>是否实名主体管理员。是：true，否：false</p>
     */
    public void setIsAuthManager(Boolean IsAuthManager) {
        this.IsAuthManager = IsAuthManager;
    }

    /**
     * Get <p>创建/邀请成员时可设置的财务权限列表</p> 
     * @return MemberPermissionOptions <p>创建/邀请成员时可设置的财务权限列表</p>
     */
    public MemberPermissionOption [] getMemberPermissionOptions() {
        return this.MemberPermissionOptions;
    }

    /**
     * Set <p>创建/邀请成员时可设置的财务权限列表</p>
     * @param MemberPermissionOptions <p>创建/邀请成员时可设置的财务权限列表</p>
     */
    public void setMemberPermissionOptions(MemberPermissionOption [] MemberPermissionOptions) {
        this.MemberPermissionOptions = MemberPermissionOptions;
    }

    /**
     * Get <p>创建/邀请成员时的默认付费方式。</p><p>枚举值：</p><ul><li>SelfPay： 自付</li><li>BehalfPay： 代付</li></ul> 
     * @return DefaultPayType <p>创建/邀请成员时的默认付费方式。</p><p>枚举值：</p><ul><li>SelfPay： 自付</li><li>BehalfPay： 代付</li></ul>
     */
    public String getDefaultPayType() {
        return this.DefaultPayType;
    }

    /**
     * Set <p>创建/邀请成员时的默认付费方式。</p><p>枚举值：</p><ul><li>SelfPay： 自付</li><li>BehalfPay： 代付</li></ul>
     * @param DefaultPayType <p>创建/邀请成员时的默认付费方式。</p><p>枚举值：</p><ul><li>SelfPay： 自付</li><li>BehalfPay： 代付</li></ul>
     */
    public void setDefaultPayType(String DefaultPayType) {
        this.DefaultPayType = DefaultPayType;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOrganizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationResponse(DescribeOrganizationResponse source) {
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
        }
        if (source.HostUin != null) {
            this.HostUin = new Long(source.HostUin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.OrgType != null) {
            this.OrgType = new Long(source.OrgType);
        }
        if (source.IsManager != null) {
            this.IsManager = new Boolean(source.IsManager);
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
        if (source.RootNodeId != null) {
            this.RootNodeId = new Long(source.RootNodeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new String(source.JoinTime);
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
        if (source.IsAssignManager != null) {
            this.IsAssignManager = new Boolean(source.IsAssignManager);
        }
        if (source.IsAuthManager != null) {
            this.IsAuthManager = new Boolean(source.IsAuthManager);
        }
        if (source.MemberPermissionOptions != null) {
            this.MemberPermissionOptions = new MemberPermissionOption[source.MemberPermissionOptions.length];
            for (int i = 0; i < source.MemberPermissionOptions.length; i++) {
                this.MemberPermissionOptions[i] = new MemberPermissionOption(source.MemberPermissionOptions[i]);
            }
        }
        if (source.DefaultPayType != null) {
            this.DefaultPayType = new String(source.DefaultPayType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "HostUin", this.HostUin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "OrgType", this.OrgType);
        this.setParamSimple(map, prefix + "IsManager", this.IsManager);
        this.setParamSimple(map, prefix + "OrgPolicyType", this.OrgPolicyType);
        this.setParamSimple(map, prefix + "OrgPolicyName", this.OrgPolicyName);
        this.setParamArrayObj(map, prefix + "OrgPermission.", this.OrgPermission);
        this.setParamSimple(map, prefix + "RootNodeId", this.RootNodeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamSimple(map, prefix + "IsAssignManager", this.IsAssignManager);
        this.setParamSimple(map, prefix + "IsAuthManager", this.IsAuthManager);
        this.setParamArrayObj(map, prefix + "MemberPermissionOptions.", this.MemberPermissionOptions);
        this.setParamSimple(map, prefix + "DefaultPayType", this.DefaultPayType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

