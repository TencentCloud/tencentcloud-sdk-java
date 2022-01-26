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

public class DescribeOrganizationResponse extends AbstractModel{

    /**
    * 企业组织ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 企业组织类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * 组织管理员：true，组织成员：false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsManager")
    @Expose
    private Boolean IsManager;

    /**
    * 策略类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgPolicyType")
    @Expose
    private String OrgPolicyType;

    /**
    * 策略名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgPolicyName")
    @Expose
    private String OrgPolicyName;

    /**
    * 策略权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgPermission")
    @Expose
    private OrgPermission [] OrgPermission;

    /**
    * 根节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootNodeId")
    @Expose
    private Long RootNodeId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 成员加入时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
    * 是否允许退出。允许：Allow，不允许：Denied。
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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 企业组织ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgId 企业组织ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 企业组织ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgId 企业组织ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostUin 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * Set 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostUin 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * Get 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 企业组织类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgType 企业组织类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set 企业组织类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgType 企业组织类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * Get 组织管理员：true，组织成员：false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsManager 组织管理员：true，组织成员：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsManager() {
        return this.IsManager;
    }

    /**
     * Set 组织管理员：true，组织成员：false
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsManager 组织管理员：true，组织成员：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsManager(Boolean IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get 策略类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgPolicyType 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgPolicyType() {
        return this.OrgPolicyType;
    }

    /**
     * Set 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgPolicyType 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgPolicyType(String OrgPolicyType) {
        this.OrgPolicyType = OrgPolicyType;
    }

    /**
     * Get 策略名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgPolicyName 策略名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgPolicyName() {
        return this.OrgPolicyName;
    }

    /**
     * Set 策略名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgPolicyName 策略名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgPolicyName(String OrgPolicyName) {
        this.OrgPolicyName = OrgPolicyName;
    }

    /**
     * Get 策略权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgPermission 策略权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrgPermission [] getOrgPermission() {
        return this.OrgPermission;
    }

    /**
     * Set 策略权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgPermission 策略权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgPermission(OrgPermission [] OrgPermission) {
        this.OrgPermission = OrgPermission;
    }

    /**
     * Get 根节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootNodeId 根节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRootNodeId() {
        return this.RootNodeId;
    }

    /**
     * Set 根节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootNodeId 根节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootNodeId(Long RootNodeId) {
        this.RootNodeId = RootNodeId;
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
     * Get 成员加入时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinTime 成员加入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set 成员加入时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinTime 成员加入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Get 是否允许退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowQuit 是否允许退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set 是否允许退出。允许：Allow，不允许：Denied。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowQuit 是否允许退出。允许：Allow，不允许：Denied。
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

