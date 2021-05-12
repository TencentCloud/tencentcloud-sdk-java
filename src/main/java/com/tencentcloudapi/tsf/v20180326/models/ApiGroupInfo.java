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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiGroupInfo extends AbstractModel{

    /**
    * Api Group Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Api Group 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组上下文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupContext")
    @Expose
    private String GroupContext;

    /**
    * 鉴权类型。 secret： 密钥鉴权； none:无鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 发布状态, drafted: 未发布。 released: 发布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 分组创建时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 分组更新时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * api分组已绑定的网关部署组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindedGatewayDeployGroups")
    @Expose
    private GatewayDeployGroup [] BindedGatewayDeployGroups;

    /**
    * api 个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiCount")
    @Expose
    private Long ApiCount;

    /**
    * 访问group的ACL类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclMode")
    @Expose
    private String AclMode;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分组类型。 ms： 微服务分组； external:外部Api分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 网关实例的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayInstanceType")
    @Expose
    private String GatewayInstanceType;

    /**
    * 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
     * Get Api Group Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId Api Group Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Api Group Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId Api Group Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Api Group 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName Api Group 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Api Group 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName Api Group 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 分组上下文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupContext 分组上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupContext() {
        return this.GroupContext;
    }

    /**
     * Set 分组上下文
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupContext 分组上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupContext(String GroupContext) {
        this.GroupContext = GroupContext;
    }

    /**
     * Get 鉴权类型。 secret： 密钥鉴权； none:无鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType 鉴权类型。 secret： 密钥鉴权； none:无鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 鉴权类型。 secret： 密钥鉴权； none:无鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType 鉴权类型。 secret： 密钥鉴权； none:无鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 发布状态, drafted: 未发布。 released: 发布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 发布状态, drafted: 未发布。 released: 发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态, drafted: 未发布。 released: 发布
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 发布状态, drafted: 未发布。 released: 发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 分组创建时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 分组创建时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 分组创建时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 分组创建时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 分组更新时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 分组更新时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 分组更新时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 分组更新时间 如:2019-06-20 15:51:28
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get api分组已绑定的网关部署组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindedGatewayDeployGroups api分组已绑定的网关部署组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayDeployGroup [] getBindedGatewayDeployGroups() {
        return this.BindedGatewayDeployGroups;
    }

    /**
     * Set api分组已绑定的网关部署组
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindedGatewayDeployGroups api分组已绑定的网关部署组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindedGatewayDeployGroups(GatewayDeployGroup [] BindedGatewayDeployGroups) {
        this.BindedGatewayDeployGroups = BindedGatewayDeployGroups;
    }

    /**
     * Get api 个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiCount api 个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApiCount() {
        return this.ApiCount;
    }

    /**
     * Set api 个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiCount api 个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiCount(Long ApiCount) {
        this.ApiCount = ApiCount;
    }

    /**
     * Get 访问group的ACL类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclMode 访问group的ACL类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAclMode() {
        return this.AclMode;
    }

    /**
     * Set 访问group的ACL类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclMode 访问group的ACL类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclMode(String AclMode) {
        this.AclMode = AclMode;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分组类型。 ms： 微服务分组； external:外部Api分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupType 分组类型。 ms： 微服务分组； external:外部Api分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 分组类型。 ms： 微服务分组； external:外部Api分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupType 分组类型。 ms： 微服务分组； external:外部Api分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 网关实例的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayInstanceType 网关实例的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayInstanceType() {
        return this.GatewayInstanceType;
    }

    /**
     * Set 网关实例的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayInstanceType 网关实例的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayInstanceType(String GatewayInstanceType) {
        this.GatewayInstanceType = GatewayInstanceType;
    }

    /**
     * Get 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayInstanceId 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayInstanceId 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    public ApiGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiGroupInfo(ApiGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupContext != null) {
            this.GroupContext = new String(source.GroupContext);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.BindedGatewayDeployGroups != null) {
            this.BindedGatewayDeployGroups = new GatewayDeployGroup[source.BindedGatewayDeployGroups.length];
            for (int i = 0; i < source.BindedGatewayDeployGroups.length; i++) {
                this.BindedGatewayDeployGroups[i] = new GatewayDeployGroup(source.BindedGatewayDeployGroups[i]);
            }
        }
        if (source.ApiCount != null) {
            this.ApiCount = new Long(source.ApiCount);
        }
        if (source.AclMode != null) {
            this.AclMode = new String(source.AclMode);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GatewayInstanceType != null) {
            this.GatewayInstanceType = new String(source.GatewayInstanceType);
        }
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupContext", this.GroupContext);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "BindedGatewayDeployGroups.", this.BindedGatewayDeployGroups);
        this.setParamSimple(map, prefix + "ApiCount", this.ApiCount);
        this.setParamSimple(map, prefix + "AclMode", this.AclMode);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GatewayInstanceType", this.GatewayInstanceType);
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);

    }
}

