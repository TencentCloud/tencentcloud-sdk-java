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

public class ToolConfigDTO extends AbstractModel {

    /**
    * 工具名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * 是否开启限流配置
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * 限流配置
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * 绑定安全规则
    */
    @SerializedName("McpSecurityRules")
    @Expose
    private BindMcpSecurityRuleDTO [] McpSecurityRules;

    /**
     * Get 工具名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolName 工具名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set 工具名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolName 工具名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get 是否开启限流配置 
     * @return InvokeLimitConfigStatus 是否开启限流配置
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set 是否开启限流配置
     * @param InvokeLimitConfigStatus 是否开启限流配置
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get 限流配置 
     * @return InvokeLimitConfig 限流配置
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set 限流配置
     * @param InvokeLimitConfig 限流配置
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get 绑定安全规则 
     * @return McpSecurityRules 绑定安全规则
     */
    public BindMcpSecurityRuleDTO [] getMcpSecurityRules() {
        return this.McpSecurityRules;
    }

    /**
     * Set 绑定安全规则
     * @param McpSecurityRules 绑定安全规则
     */
    public void setMcpSecurityRules(BindMcpSecurityRuleDTO [] McpSecurityRules) {
        this.McpSecurityRules = McpSecurityRules;
    }

    public ToolConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolConfigDTO(ToolConfigDTO source) {
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
        }
        if (source.McpSecurityRules != null) {
            this.McpSecurityRules = new BindMcpSecurityRuleDTO[source.McpSecurityRules.length];
            for (int i = 0; i < source.McpSecurityRules.length; i++) {
                this.McpSecurityRules[i] = new BindMcpSecurityRuleDTO(source.McpSecurityRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamArrayObj(map, prefix + "McpSecurityRules.", this.McpSecurityRules);

    }
}

