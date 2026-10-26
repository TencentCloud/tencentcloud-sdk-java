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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayConsumerRequest extends AbstractModel {

    /**
    * <p>网关实例id</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>消费者名称，最长 60 字符。同一网关下唯一。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>消费者优先级，默认medium</p><p>枚举值：</p><ul><li>Low： 低优先级</li><li>Medium： 中优先级</li><li>High： 高优先级</li></ul>
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * <p>消费者描述。最长 200 字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>密钥关联方式，三选一枚举。不传时兼容老逻辑（等价于 None 或 Existing，取决于是否传 SecretKeyId）。</p><p>枚举值：</p><ul><li>Existing： 选择已有密钥</li><li>AutoGenerate： 自动生成并关联密钥</li><li>None： 暂不关联密钥</li></ul><p>默认值：None</p>
    */
    @SerializedName("SecretBindType")
    @Expose
    private String SecretBindType;

    /**
    * <p>自动生成密钥的参数体。仅当 SecretBindType=&quot;AutoGenerate&quot; 时必填，其他分支禁止携带，否则返回 InvalidParameterValue.CreateError。</p>
    */
    @SerializedName("AutoSecretKey")
    @Expose
    private AutoSecretKey AutoSecretKey;

    /**
    * <p>调用业务来源，可选 Legacy 或 CustomOrganization；省略或空串按 Legacy。Legacy 保持原行为，CustomOrganization 用于自定义组织架构。该字段不替代鉴权，不改变资源归属，不覆盖 RequestSource。来源保存在操作记录请求内容中。</p>
    */
    @SerializedName("OperationSource")
    @Expose
    private String OperationSource;

    /**
    * <p>仅 CustomOrganization 使用 Active 或 Disabled，默认 Active。Legacy 不新增状态行为。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>网关实例id</p> 
     * @return GatewayId <p>网关实例id</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例id</p>
     * @param GatewayId <p>网关实例id</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>消费者名称，最长 60 字符。同一网关下唯一。</p> 
     * @return Name <p>消费者名称，最长 60 字符。同一网关下唯一。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>消费者名称，最长 60 字符。同一网关下唯一。</p>
     * @param Name <p>消费者名称，最长 60 字符。同一网关下唯一。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>消费者优先级，默认medium</p><p>枚举值：</p><ul><li>Low： 低优先级</li><li>Medium： 中优先级</li><li>High： 高优先级</li></ul> 
     * @return Priority <p>消费者优先级，默认medium</p><p>枚举值：</p><ul><li>Low： 低优先级</li><li>Medium： 中优先级</li><li>High： 高优先级</li></ul>
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>消费者优先级，默认medium</p><p>枚举值：</p><ul><li>Low： 低优先级</li><li>Medium： 中优先级</li><li>High： 高优先级</li></ul>
     * @param Priority <p>消费者优先级，默认medium</p><p>枚举值：</p><ul><li>Low： 低优先级</li><li>Medium： 中优先级</li><li>High： 高优先级</li></ul>
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>消费者描述。最长 200 字符。</p> 
     * @return Description <p>消费者描述。最长 200 字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>消费者描述。最长 200 字符。</p>
     * @param Description <p>消费者描述。最长 200 字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>密钥关联方式，三选一枚举。不传时兼容老逻辑（等价于 None 或 Existing，取决于是否传 SecretKeyId）。</p><p>枚举值：</p><ul><li>Existing： 选择已有密钥</li><li>AutoGenerate： 自动生成并关联密钥</li><li>None： 暂不关联密钥</li></ul><p>默认值：None</p> 
     * @return SecretBindType <p>密钥关联方式，三选一枚举。不传时兼容老逻辑（等价于 None 或 Existing，取决于是否传 SecretKeyId）。</p><p>枚举值：</p><ul><li>Existing： 选择已有密钥</li><li>AutoGenerate： 自动生成并关联密钥</li><li>None： 暂不关联密钥</li></ul><p>默认值：None</p>
     */
    public String getSecretBindType() {
        return this.SecretBindType;
    }

    /**
     * Set <p>密钥关联方式，三选一枚举。不传时兼容老逻辑（等价于 None 或 Existing，取决于是否传 SecretKeyId）。</p><p>枚举值：</p><ul><li>Existing： 选择已有密钥</li><li>AutoGenerate： 自动生成并关联密钥</li><li>None： 暂不关联密钥</li></ul><p>默认值：None</p>
     * @param SecretBindType <p>密钥关联方式，三选一枚举。不传时兼容老逻辑（等价于 None 或 Existing，取决于是否传 SecretKeyId）。</p><p>枚举值：</p><ul><li>Existing： 选择已有密钥</li><li>AutoGenerate： 自动生成并关联密钥</li><li>None： 暂不关联密钥</li></ul><p>默认值：None</p>
     */
    public void setSecretBindType(String SecretBindType) {
        this.SecretBindType = SecretBindType;
    }

    /**
     * Get <p>自动生成密钥的参数体。仅当 SecretBindType=&quot;AutoGenerate&quot; 时必填，其他分支禁止携带，否则返回 InvalidParameterValue.CreateError。</p> 
     * @return AutoSecretKey <p>自动生成密钥的参数体。仅当 SecretBindType=&quot;AutoGenerate&quot; 时必填，其他分支禁止携带，否则返回 InvalidParameterValue.CreateError。</p>
     */
    public AutoSecretKey getAutoSecretKey() {
        return this.AutoSecretKey;
    }

    /**
     * Set <p>自动生成密钥的参数体。仅当 SecretBindType=&quot;AutoGenerate&quot; 时必填，其他分支禁止携带，否则返回 InvalidParameterValue.CreateError。</p>
     * @param AutoSecretKey <p>自动生成密钥的参数体。仅当 SecretBindType=&quot;AutoGenerate&quot; 时必填，其他分支禁止携带，否则返回 InvalidParameterValue.CreateError。</p>
     */
    public void setAutoSecretKey(AutoSecretKey AutoSecretKey) {
        this.AutoSecretKey = AutoSecretKey;
    }

    /**
     * Get <p>调用业务来源，可选 Legacy 或 CustomOrganization；省略或空串按 Legacy。Legacy 保持原行为，CustomOrganization 用于自定义组织架构。该字段不替代鉴权，不改变资源归属，不覆盖 RequestSource。来源保存在操作记录请求内容中。</p> 
     * @return OperationSource <p>调用业务来源，可选 Legacy 或 CustomOrganization；省略或空串按 Legacy。Legacy 保持原行为，CustomOrganization 用于自定义组织架构。该字段不替代鉴权，不改变资源归属，不覆盖 RequestSource。来源保存在操作记录请求内容中。</p>
     */
    public String getOperationSource() {
        return this.OperationSource;
    }

    /**
     * Set <p>调用业务来源，可选 Legacy 或 CustomOrganization；省略或空串按 Legacy。Legacy 保持原行为，CustomOrganization 用于自定义组织架构。该字段不替代鉴权，不改变资源归属，不覆盖 RequestSource。来源保存在操作记录请求内容中。</p>
     * @param OperationSource <p>调用业务来源，可选 Legacy 或 CustomOrganization；省略或空串按 Legacy。Legacy 保持原行为，CustomOrganization 用于自定义组织架构。该字段不替代鉴权，不改变资源归属，不覆盖 RequestSource。来源保存在操作记录请求内容中。</p>
     */
    public void setOperationSource(String OperationSource) {
        this.OperationSource = OperationSource;
    }

    /**
     * Get <p>仅 CustomOrganization 使用 Active 或 Disabled，默认 Active。Legacy 不新增状态行为。</p> 
     * @return Status <p>仅 CustomOrganization 使用 Active 或 Disabled，默认 Active。Legacy 不新增状态行为。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>仅 CustomOrganization 使用 Active 或 Disabled，默认 Active。Legacy 不新增状态行为。</p>
     * @param Status <p>仅 CustomOrganization 使用 Active 或 Disabled，默认 Active。Legacy 不新增状态行为。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CreateCloudNativeAPIGatewayConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayConsumerRequest(CreateCloudNativeAPIGatewayConsumerRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SecretBindType != null) {
            this.SecretBindType = new String(source.SecretBindType);
        }
        if (source.AutoSecretKey != null) {
            this.AutoSecretKey = new AutoSecretKey(source.AutoSecretKey);
        }
        if (source.OperationSource != null) {
            this.OperationSource = new String(source.OperationSource);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SecretBindType", this.SecretBindType);
        this.setParamObj(map, prefix + "AutoSecretKey.", this.AutoSecretKey);
        this.setParamSimple(map, prefix + "OperationSource", this.OperationSource);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

