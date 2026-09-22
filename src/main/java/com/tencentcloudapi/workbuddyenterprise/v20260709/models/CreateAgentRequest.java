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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentRequest extends AbstractModel {

    /**
    * Agent 名称
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * Agent 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 头像 URL
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 模型标识
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Manifest v2.0 原文（JSON 字符串），作为 default 版本初始内容。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * 该 Agent 最终绑定的连接器集合（全量覆盖语义）：缺省 = 不绑定连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
    */
    @SerializedName("ConnectorSet")
    @Expose
    private ConnectorRefInput [] ConnectorSet;

    /**
    * 绑定的 OneID 企业账号 ID。非空时必须是当前主账号已在企业授权表（t_managed_agent_enterprise_authorization）中授权的租户，否则返回 UnauthorizedOperation.AccountNotAuthorized。绑定后不可修改。TrimSpace 后长度 1~64 字符
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * Get Agent 名称 
     * @return AgentName Agent 名称
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent 名称
     * @param AgentName Agent 名称
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get Agent 描述 
     * @return Description Agent 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Agent 描述
     * @param Description Agent 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 头像 URL 
     * @return AvatarUrl 头像 URL
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像 URL
     * @param AvatarUrl 头像 URL
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 模型标识 
     * @return Model 模型标识
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型标识
     * @param Model 模型标识
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Manifest v2.0 原文（JSON 字符串），作为 default 版本初始内容。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter 
     * @return Manifest Manifest v2.0 原文（JSON 字符串），作为 default 版本初始内容。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set Manifest v2.0 原文（JSON 字符串），作为 default 版本初始内容。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
     * @param Manifest Manifest v2.0 原文（JSON 字符串），作为 default 版本初始内容。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get 该 Agent 最终绑定的连接器集合（全量覆盖语义）：缺省 = 不绑定连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter 
     * @return ConnectorSet 该 Agent 最终绑定的连接器集合（全量覆盖语义）：缺省 = 不绑定连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
     */
    public ConnectorRefInput [] getConnectorSet() {
        return this.ConnectorSet;
    }

    /**
     * Set 该 Agent 最终绑定的连接器集合（全量覆盖语义）：缺省 = 不绑定连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
     * @param ConnectorSet 该 Agent 最终绑定的连接器集合（全量覆盖语义）：缺省 = 不绑定连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目。ConnectorSet 非空时 Manifest 不可为空，否则返回 InvalidParameter
     */
    public void setConnectorSet(ConnectorRefInput [] ConnectorSet) {
        this.ConnectorSet = ConnectorSet;
    }

    /**
     * Get 绑定的 OneID 企业账号 ID。非空时必须是当前主账号已在企业授权表（t_managed_agent_enterprise_authorization）中授权的租户，否则返回 UnauthorizedOperation.AccountNotAuthorized。绑定后不可修改。TrimSpace 后长度 1~64 字符 
     * @return AccountId 绑定的 OneID 企业账号 ID。非空时必须是当前主账号已在企业授权表（t_managed_agent_enterprise_authorization）中授权的租户，否则返回 UnauthorizedOperation.AccountNotAuthorized。绑定后不可修改。TrimSpace 后长度 1~64 字符
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 绑定的 OneID 企业账号 ID。非空时必须是当前主账号已在企业授权表（t_managed_agent_enterprise_authorization）中授权的租户，否则返回 UnauthorizedOperation.AccountNotAuthorized。绑定后不可修改。TrimSpace 后长度 1~64 字符
     * @param AccountId 绑定的 OneID 企业账号 ID。非空时必须是当前主账号已在企业授权表（t_managed_agent_enterprise_authorization）中授权的租户，否则返回 UnauthorizedOperation.AccountNotAuthorized。绑定后不可修改。TrimSpace 后长度 1~64 字符
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public CreateAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentRequest(CreateAgentRequest source) {
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AvatarUrl != null) {
            this.AvatarUrl = new String(source.AvatarUrl);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.ConnectorSet != null) {
            this.ConnectorSet = new ConnectorRefInput[source.ConnectorSet.length];
            for (int i = 0; i < source.ConnectorSet.length; i++) {
                this.ConnectorSet[i] = new ConnectorRefInput(source.ConnectorSet[i]);
            }
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamArrayObj(map, prefix + "ConnectorSet.", this.ConnectorSet);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);

    }
}

