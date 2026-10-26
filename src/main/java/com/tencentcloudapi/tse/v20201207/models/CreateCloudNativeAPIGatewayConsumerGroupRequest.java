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

public class CreateCloudNativeAPIGatewayConsumerGroupRequest extends AbstractModel {

    /**
    * 网关实例id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>消费者组名称，最长 60 字符。同一网关下唯一。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>启用状态。</p><p>枚举值：</p><ul><li>Enable：启用</li><li>Disable：禁用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>消费者组描述。最长 200 字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>调用业务来源，可选 Legacy 或 CustomOrganization；省略或空串按 Legacy。Legacy 保持原行为，CustomOrganization 用于自定义组织架构。该字段不替代鉴权，不改变资源归属，不覆盖 RequestSource。来源保存在操作记录请求内容中。</p>
    */
    @SerializedName("OperationSource")
    @Expose
    private String OperationSource;

    /**
    * <p>仅 CustomOrganization 使用。1–32 个当前网关自定义父部门 UUID，完整保留多父关系；省略时挂自定义根，空数组非法。不得使用同步部门或未归属组。Legacy 不使用此字段。</p>
    */
    @SerializedName("ParentConsumerGroupIds")
    @Expose
    private String [] ParentConsumerGroupIds;

    /**
     * Get 网关实例id 
     * @return GatewayId 网关实例id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例id
     * @param GatewayId 网关实例id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>消费者组名称，最长 60 字符。同一网关下唯一。</p> 
     * @return Name <p>消费者组名称，最长 60 字符。同一网关下唯一。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>消费者组名称，最长 60 字符。同一网关下唯一。</p>
     * @param Name <p>消费者组名称，最长 60 字符。同一网关下唯一。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>启用状态。</p><p>枚举值：</p><ul><li>Enable：启用</li><li>Disable：禁用</li></ul> 
     * @return Status <p>启用状态。</p><p>枚举值：</p><ul><li>Enable：启用</li><li>Disable：禁用</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>启用状态。</p><p>枚举值：</p><ul><li>Enable：启用</li><li>Disable：禁用</li></ul>
     * @param Status <p>启用状态。</p><p>枚举值：</p><ul><li>Enable：启用</li><li>Disable：禁用</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>消费者组描述。最长 200 字符。</p> 
     * @return Description <p>消费者组描述。最长 200 字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>消费者组描述。最长 200 字符。</p>
     * @param Description <p>消费者组描述。最长 200 字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>仅 CustomOrganization 使用。1–32 个当前网关自定义父部门 UUID，完整保留多父关系；省略时挂自定义根，空数组非法。不得使用同步部门或未归属组。Legacy 不使用此字段。</p> 
     * @return ParentConsumerGroupIds <p>仅 CustomOrganization 使用。1–32 个当前网关自定义父部门 UUID，完整保留多父关系；省略时挂自定义根，空数组非法。不得使用同步部门或未归属组。Legacy 不使用此字段。</p>
     */
    public String [] getParentConsumerGroupIds() {
        return this.ParentConsumerGroupIds;
    }

    /**
     * Set <p>仅 CustomOrganization 使用。1–32 个当前网关自定义父部门 UUID，完整保留多父关系；省略时挂自定义根，空数组非法。不得使用同步部门或未归属组。Legacy 不使用此字段。</p>
     * @param ParentConsumerGroupIds <p>仅 CustomOrganization 使用。1–32 个当前网关自定义父部门 UUID，完整保留多父关系；省略时挂自定义根，空数组非法。不得使用同步部门或未归属组。Legacy 不使用此字段。</p>
     */
    public void setParentConsumerGroupIds(String [] ParentConsumerGroupIds) {
        this.ParentConsumerGroupIds = ParentConsumerGroupIds;
    }

    public CreateCloudNativeAPIGatewayConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayConsumerGroupRequest(CreateCloudNativeAPIGatewayConsumerGroupRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OperationSource != null) {
            this.OperationSource = new String(source.OperationSource);
        }
        if (source.ParentConsumerGroupIds != null) {
            this.ParentConsumerGroupIds = new String[source.ParentConsumerGroupIds.length];
            for (int i = 0; i < source.ParentConsumerGroupIds.length; i++) {
                this.ParentConsumerGroupIds[i] = new String(source.ParentConsumerGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OperationSource", this.OperationSource);
        this.setParamArraySimple(map, prefix + "ParentConsumerGroupIds.", this.ParentConsumerGroupIds);

    }
}

