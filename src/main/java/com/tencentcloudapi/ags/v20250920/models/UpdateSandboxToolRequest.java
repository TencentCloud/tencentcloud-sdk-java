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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSandboxToolRequest extends AbstractModel {

    /**
    * 沙箱工具ID
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * 沙箱工具描述，最大长度200字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 网络配置
    */
    @SerializedName("NetworkConfiguration")
    @Expose
    private NetworkConfiguration NetworkConfiguration;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 沙箱工具ID 
     * @return ToolId 沙箱工具ID
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set 沙箱工具ID
     * @param ToolId 沙箱工具ID
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get 沙箱工具描述，最大长度200字符 
     * @return Description 沙箱工具描述，最大长度200字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 沙箱工具描述，最大长度200字符
     * @param Description 沙箱工具描述，最大长度200字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 网络配置 
     * @return NetworkConfiguration 网络配置
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.NetworkConfiguration;
    }

    /**
     * Set 网络配置
     * @param NetworkConfiguration 网络配置
     */
    public void setNetworkConfiguration(NetworkConfiguration NetworkConfiguration) {
        this.NetworkConfiguration = NetworkConfiguration;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public UpdateSandboxToolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSandboxToolRequest(UpdateSandboxToolRequest source) {
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NetworkConfiguration != null) {
            this.NetworkConfiguration = new NetworkConfiguration(source.NetworkConfiguration);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "NetworkConfiguration.", this.NetworkConfiguration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

