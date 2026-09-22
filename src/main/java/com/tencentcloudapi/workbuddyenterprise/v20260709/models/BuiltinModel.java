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

public class BuiltinModel extends AbstractModel {

    /**
    * 模型唯一标识
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 供应商，如 TENCENT、OPENAI、ANTHROPIC、DEEPSEEK 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * 最大输出 Token 数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxOutputTokens")
    @Expose
    private Long MaxOutputTokens;

    /**
    * 最大输入 Token 数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxInputTokens")
    @Expose
    private Long MaxInputTokens;

    /**
    * 是否支持函数调用（Tool Call）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportsToolCall")
    @Expose
    private Boolean SupportsToolCall;

    /**
    * 是否支持视觉（图片输入）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportsImages")
    @Expose
    private Boolean SupportsImages;

    /**
    * 模型中文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptionZh")
    @Expose
    private String DescriptionZh;

    /**
    * 模型英文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptionEn")
    @Expose
    private String DescriptionEn;

    /**
    * 模型标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 支持的客户端列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clients")
    @Expose
    private String [] Clients;

    /**
    * 服务接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceEndpoint")
    @Expose
    private String ServiceEndpoint;

    /**
    * 状态：ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 本企业内绑定该模型的 Agent 数（过滤软删除 Agent/版本与调试 Agent）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentCount")
    @Expose
    private Long AgentCount;

    /**
     * Get 模型唯一标识 
     * @return ModelId 模型唯一标识
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型唯一标识
     * @param ModelId 模型唯一标识
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 供应商，如 TENCENT、OPENAI、ANTHROPIC、DEEPSEEK 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vendor 供应商，如 TENCENT、OPENAI、ANTHROPIC、DEEPSEEK 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set 供应商，如 TENCENT、OPENAI、ANTHROPIC、DEEPSEEK 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vendor 供应商，如 TENCENT、OPENAI、ANTHROPIC、DEEPSEEK 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 最大输出 Token 数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxOutputTokens 最大输出 Token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxOutputTokens() {
        return this.MaxOutputTokens;
    }

    /**
     * Set 最大输出 Token 数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxOutputTokens 最大输出 Token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxOutputTokens(Long MaxOutputTokens) {
        this.MaxOutputTokens = MaxOutputTokens;
    }

    /**
     * Get 最大输入 Token 数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxInputTokens 最大输入 Token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxInputTokens() {
        return this.MaxInputTokens;
    }

    /**
     * Set 最大输入 Token 数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxInputTokens 最大输入 Token 数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxInputTokens(Long MaxInputTokens) {
        this.MaxInputTokens = MaxInputTokens;
    }

    /**
     * Get 是否支持函数调用（Tool Call）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportsToolCall 是否支持函数调用（Tool Call）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportsToolCall() {
        return this.SupportsToolCall;
    }

    /**
     * Set 是否支持函数调用（Tool Call）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportsToolCall 是否支持函数调用（Tool Call）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportsToolCall(Boolean SupportsToolCall) {
        this.SupportsToolCall = SupportsToolCall;
    }

    /**
     * Get 是否支持视觉（图片输入）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportsImages 是否支持视觉（图片输入）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportsImages() {
        return this.SupportsImages;
    }

    /**
     * Set 是否支持视觉（图片输入）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportsImages 是否支持视觉（图片输入）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportsImages(Boolean SupportsImages) {
        this.SupportsImages = SupportsImages;
    }

    /**
     * Get 模型中文描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptionZh 模型中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptionZh() {
        return this.DescriptionZh;
    }

    /**
     * Set 模型中文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptionZh 模型中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptionZh(String DescriptionZh) {
        this.DescriptionZh = DescriptionZh;
    }

    /**
     * Get 模型英文描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptionEn 模型英文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptionEn() {
        return this.DescriptionEn;
    }

    /**
     * Set 模型英文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptionEn 模型英文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptionEn(String DescriptionEn) {
        this.DescriptionEn = DescriptionEn;
    }

    /**
     * Get 模型标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 模型标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 模型标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 模型标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 支持的客户端列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clients 支持的客户端列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClients() {
        return this.Clients;
    }

    /**
     * Set 支持的客户端列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clients 支持的客户端列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClients(String [] Clients) {
        this.Clients = Clients;
    }

    /**
     * Get 服务接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceEndpoint 服务接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceEndpoint() {
        return this.ServiceEndpoint;
    }

    /**
     * Set 服务接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceEndpoint 服务接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceEndpoint(String ServiceEndpoint) {
        this.ServiceEndpoint = ServiceEndpoint;
    }

    /**
     * Get 状态：ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态：ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态：ENABLED（已启用）/ DISABLED（已停用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 本企业内绑定该模型的 Agent 数（过滤软删除 Agent/版本与调试 Agent）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentCount 本企业内绑定该模型的 Agent 数（过滤软删除 Agent/版本与调试 Agent）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAgentCount() {
        return this.AgentCount;
    }

    /**
     * Set 本企业内绑定该模型的 Agent 数（过滤软删除 Agent/版本与调试 Agent）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentCount 本企业内绑定该模型的 Agent 数（过滤软删除 Agent/版本与调试 Agent）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentCount(Long AgentCount) {
        this.AgentCount = AgentCount;
    }

    public BuiltinModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuiltinModel(BuiltinModel source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.MaxOutputTokens != null) {
            this.MaxOutputTokens = new Long(source.MaxOutputTokens);
        }
        if (source.MaxInputTokens != null) {
            this.MaxInputTokens = new Long(source.MaxInputTokens);
        }
        if (source.SupportsToolCall != null) {
            this.SupportsToolCall = new Boolean(source.SupportsToolCall);
        }
        if (source.SupportsImages != null) {
            this.SupportsImages = new Boolean(source.SupportsImages);
        }
        if (source.DescriptionZh != null) {
            this.DescriptionZh = new String(source.DescriptionZh);
        }
        if (source.DescriptionEn != null) {
            this.DescriptionEn = new String(source.DescriptionEn);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Clients != null) {
            this.Clients = new String[source.Clients.length];
            for (int i = 0; i < source.Clients.length; i++) {
                this.Clients[i] = new String(source.Clients[i]);
            }
        }
        if (source.ServiceEndpoint != null) {
            this.ServiceEndpoint = new String(source.ServiceEndpoint);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AgentCount != null) {
            this.AgentCount = new Long(source.AgentCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "MaxOutputTokens", this.MaxOutputTokens);
        this.setParamSimple(map, prefix + "MaxInputTokens", this.MaxInputTokens);
        this.setParamSimple(map, prefix + "SupportsToolCall", this.SupportsToolCall);
        this.setParamSimple(map, prefix + "SupportsImages", this.SupportsImages);
        this.setParamSimple(map, prefix + "DescriptionZh", this.DescriptionZh);
        this.setParamSimple(map, prefix + "DescriptionEn", this.DescriptionEn);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Clients.", this.Clients);
        this.setParamSimple(map, prefix + "ServiceEndpoint", this.ServiceEndpoint);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AgentCount", this.AgentCount);

    }
}

