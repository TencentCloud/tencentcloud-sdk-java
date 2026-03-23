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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentAppResp extends AbstractModel {

    /**
    * 租户appID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 租户ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 应用ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 认证类型
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * apiKeys列表，脱敏
    */
    @SerializedName("ApiKeys")
    @Expose
    private String [] ApiKeys;

    /**
    * secretKey列表，脱敏
    */
    @SerializedName("SecretKeys")
    @Expose
    private AgentAppSecretKeyVO [] SecretKeys;

    /**
    * OAuth2 Resource Server ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OAuth2ResourceServerID")
    @Expose
    private String OAuth2ResourceServerID;

    /**
    * 绑定mcpServer数量
    */
    @SerializedName("McpServersNum")
    @Expose
    private Long McpServersNum;

    /**
    * 绑定的模型服务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelServicesNum")
    @Expose
    private Long ModelServicesNum;

    /**
     * Get 租户appID 
     * @return AppID 租户appID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 租户appID
     * @param AppID 租户appID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 租户ID 
     * @return Uin 租户ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 租户ID
     * @param Uin 租户ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 应用ID 
     * @return ID 应用ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 应用ID
     * @param ID 应用ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

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
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 认证类型 
     * @return AuthType 认证类型
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证类型
     * @param AuthType 认证类型
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get apiKeys列表，脱敏 
     * @return ApiKeys apiKeys列表，脱敏
     */
    public String [] getApiKeys() {
        return this.ApiKeys;
    }

    /**
     * Set apiKeys列表，脱敏
     * @param ApiKeys apiKeys列表，脱敏
     */
    public void setApiKeys(String [] ApiKeys) {
        this.ApiKeys = ApiKeys;
    }

    /**
     * Get secretKey列表，脱敏 
     * @return SecretKeys secretKey列表，脱敏
     */
    public AgentAppSecretKeyVO [] getSecretKeys() {
        return this.SecretKeys;
    }

    /**
     * Set secretKey列表，脱敏
     * @param SecretKeys secretKey列表，脱敏
     */
    public void setSecretKeys(AgentAppSecretKeyVO [] SecretKeys) {
        this.SecretKeys = SecretKeys;
    }

    /**
     * Get OAuth2 Resource Server ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OAuth2ResourceServerID OAuth2 Resource Server ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOAuth2ResourceServerID() {
        return this.OAuth2ResourceServerID;
    }

    /**
     * Set OAuth2 Resource Server ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OAuth2ResourceServerID OAuth2 Resource Server ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOAuth2ResourceServerID(String OAuth2ResourceServerID) {
        this.OAuth2ResourceServerID = OAuth2ResourceServerID;
    }

    /**
     * Get 绑定mcpServer数量 
     * @return McpServersNum 绑定mcpServer数量
     */
    public Long getMcpServersNum() {
        return this.McpServersNum;
    }

    /**
     * Set 绑定mcpServer数量
     * @param McpServersNum 绑定mcpServer数量
     */
    public void setMcpServersNum(Long McpServersNum) {
        this.McpServersNum = McpServersNum;
    }

    /**
     * Get 绑定的模型服务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelServicesNum 绑定的模型服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModelServicesNum() {
        return this.ModelServicesNum;
    }

    /**
     * Set 绑定的模型服务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelServicesNum 绑定的模型服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelServicesNum(Long ModelServicesNum) {
        this.ModelServicesNum = ModelServicesNum;
    }

    public DescribeAgentAppResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentAppResp(DescribeAgentAppResp source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.ApiKeys != null) {
            this.ApiKeys = new String[source.ApiKeys.length];
            for (int i = 0; i < source.ApiKeys.length; i++) {
                this.ApiKeys[i] = new String(source.ApiKeys[i]);
            }
        }
        if (source.SecretKeys != null) {
            this.SecretKeys = new AgentAppSecretKeyVO[source.SecretKeys.length];
            for (int i = 0; i < source.SecretKeys.length; i++) {
                this.SecretKeys[i] = new AgentAppSecretKeyVO(source.SecretKeys[i]);
            }
        }
        if (source.OAuth2ResourceServerID != null) {
            this.OAuth2ResourceServerID = new String(source.OAuth2ResourceServerID);
        }
        if (source.McpServersNum != null) {
            this.McpServersNum = new Long(source.McpServersNum);
        }
        if (source.ModelServicesNum != null) {
            this.ModelServicesNum = new Long(source.ModelServicesNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamArraySimple(map, prefix + "ApiKeys.", this.ApiKeys);
        this.setParamArrayObj(map, prefix + "SecretKeys.", this.SecretKeys);
        this.setParamSimple(map, prefix + "OAuth2ResourceServerID", this.OAuth2ResourceServerID);
        this.setParamSimple(map, prefix + "McpServersNum", this.McpServersNum);
        this.setParamSimple(map, prefix + "ModelServicesNum", this.ModelServicesNum);

    }
}

