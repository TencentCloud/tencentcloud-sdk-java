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
    * 企业组织ID。
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * 创建者UIN。
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * 创建者昵称。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 企业组织类型。
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * 是否组织管理员。是：true ，否：false
    */
    @SerializedName("IsManager")
    @Expose
    private Boolean IsManager;

    /**
    * 策略类型。财务管理：Financial
    */
    @SerializedName("OrgPolicyType")
    @Expose
    private String OrgPolicyType;

    /**
    * 策略名。
    */
    @SerializedName("OrgPolicyName")
    @Expose
    private String OrgPolicyName;

    /**
    * 成员财务权限列表。
    */
    @SerializedName("OrgPermission")
    @Expose
    private OrgPermission [] OrgPermission;

    /**
    * 组织根节点ID。
    */
    @SerializedName("RootNodeId")
    @Expose
    private Long RootNodeId;

    /**
    * 组织创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 成员加入时间。
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
    * 成员是否允许退出。允许：Allow，不允许：Denied
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * 代付者Uin。
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * 代付者名称。
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * 是否可信服务管理员。是：true，否：false
    */
    @SerializedName("IsAssignManager")
    @Expose
    private Boolean IsAssignManager;

    /**
    * 是否实名主体管理员。是：true，否：false
    */
    @SerializedName("IsAuthManager")
    @Expose
    private Boolean IsAuthManager;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 企业组织ID。 
     * @return OrgId 企业组织ID。
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 企业组织ID。
     * @param OrgId 企业组织ID。
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 创建者UIN。 
     * @return HostUin 创建者UIN。
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * Set 创建者UIN。
     * @param HostUin 创建者UIN。
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * Get 创建者昵称。 
     * @return NickName 创建者昵称。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 创建者昵称。
     * @param NickName 创建者昵称。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 企业组织类型。 
     * @return OrgType 企业组织类型。
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set 企业组织类型。
     * @param OrgType 企业组织类型。
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * Get 是否组织管理员。是：true ，否：false 
     * @return IsManager 是否组织管理员。是：true ，否：false
     */
    public Boolean getIsManager() {
        return this.IsManager;
    }

    /**
     * Set 是否组织管理员。是：true ，否：false
     * @param IsManager 是否组织管理员。是：true ，否：false
     */
    public void setIsManager(Boolean IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get 策略类型。财务管理：Financial 
     * @return OrgPolicyType 策略类型。财务管理：Financial
     */
    public String getOrgPolicyType() {
        return this.OrgPolicyType;
    }

    /**
     * Set 策略类型。财务管理：Financial
     * @param OrgPolicyType 策略类型。财务管理：Financial
     */
    public void setOrgPolicyType(String OrgPolicyType) {
        this.OrgPolicyType = OrgPolicyType;
    }

    /**
     * Get 策略名。 
     * @return OrgPolicyName 策略名。
     */
    public String getOrgPolicyName() {
        return this.OrgPolicyName;
    }

    /**
     * Set 策略名。
     * @param OrgPolicyName 策略名。
     */
    public void setOrgPolicyName(String OrgPolicyName) {
        this.OrgPolicyName = OrgPolicyName;
    }

    /**
     * Get 成员财务权限列表。 
     * @return OrgPermission 成员财务权限列表。
     */
    public OrgPermission [] getOrgPermission() {
        return this.OrgPermission;
    }

    /**
     * Set 成员财务权限列表。
     * @param OrgPermission 成员财务权限列表。
     */
    public void setOrgPermission(OrgPermission [] OrgPermission) {
        this.OrgPermission = OrgPermission;
    }

    /**
     * Get 组织根节点ID。 
     * @return RootNodeId 组织根节点ID。
     */
    public Long getRootNodeId() {
        return this.RootNodeId;
    }

    /**
     * Set 组织根节点ID。
     * @param RootNodeId 组织根节点ID。
     */
    public void setRootNodeId(Long RootNodeId) {
        this.RootNodeId = RootNodeId;
    }

    /**
     * Get 组织创建时间。 
     * @return CreateTime 组织创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 组织创建时间。
     * @param CreateTime 组织创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 成员加入时间。 
     * @return JoinTime 成员加入时间。
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set 成员加入时间。
     * @param JoinTime 成员加入时间。
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Get 成员是否允许退出。允许：Allow，不允许：Denied 
     * @return IsAllowQuit 成员是否允许退出。允许：Allow，不允许：Denied
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set 成员是否允许退出。允许：Allow，不允许：Denied
     * @param IsAllowQuit 成员是否允许退出。允许：Allow，不允许：Denied
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get 代付者Uin。 
     * @return PayUin 代付者Uin。
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set 代付者Uin。
     * @param PayUin 代付者Uin。
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get 代付者名称。 
     * @return PayName 代付者名称。
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set 代付者名称。
     * @param PayName 代付者名称。
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get 是否可信服务管理员。是：true，否：false 
     * @return IsAssignManager 是否可信服务管理员。是：true，否：false
     */
    public Boolean getIsAssignManager() {
        return this.IsAssignManager;
    }

    /**
     * Set 是否可信服务管理员。是：true，否：false
     * @param IsAssignManager 是否可信服务管理员。是：true，否：false
     */
    public void setIsAssignManager(Boolean IsAssignManager) {
        this.IsAssignManager = IsAssignManager;
    }

    /**
     * Get 是否实名主体管理员。是：true，否：false 
     * @return IsAuthManager 是否实名主体管理员。是：true，否：false
     */
    public Boolean getIsAuthManager() {
        return this.IsAuthManager;
    }

    /**
     * Set 是否实名主体管理员。是：true，否：false
     * @param IsAuthManager 是否实名主体管理员。是：true，否：false
     */
    public void setIsAuthManager(Boolean IsAuthManager) {
        this.IsAuthManager = IsAuthManager;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

