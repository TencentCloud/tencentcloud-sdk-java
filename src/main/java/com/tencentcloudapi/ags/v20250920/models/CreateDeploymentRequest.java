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

public class CreateDeploymentRequest extends AbstractModel {

    /**
    * <p>唯一的 Deployment 名称，必须符合 DNS-1123 命名规范，创建后不可修改。</p>
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>伸缩配置；省略的成员由服务端补全默认值。</p>
    */
    @SerializedName("ScalingConfiguration")
    @Expose
    private ScalingConfiguration ScalingConfiguration;

    /**
    * <p>空闲生命周期配置；省略的成员由服务端补全默认值。</p>
    */
    @SerializedName("LifecycleConfiguration")
    @Expose
    private LifecycleConfiguration LifecycleConfiguration;

    /**
    * <p>Affinity 配置；省略或空 Mode 表示不启用。</p>
    */
    @SerializedName("AffinityConfiguration")
    @Expose
    private AffinityConfiguration AffinityConfiguration;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>唯一的 Deployment 名称，必须符合 DNS-1123 命名规范，创建后不可修改。</p> 
     * @return DeploymentName <p>唯一的 Deployment 名称，必须符合 DNS-1123 命名规范，创建后不可修改。</p>
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>唯一的 Deployment 名称，必须符合 DNS-1123 命名规范，创建后不可修改。</p>
     * @param DeploymentName <p>唯一的 Deployment 名称，必须符合 DNS-1123 命名规范，创建后不可修改。</p>
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
    }

    /**
     * Get <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p> 
     * @return ToolId <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
     * @param ToolId <p>用于关联 Sandbox Tool 的标识，格式为 sdt- 加 8 位小写 base36 字符。</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>伸缩配置；省略的成员由服务端补全默认值。</p> 
     * @return ScalingConfiguration <p>伸缩配置；省略的成员由服务端补全默认值。</p>
     */
    public ScalingConfiguration getScalingConfiguration() {
        return this.ScalingConfiguration;
    }

    /**
     * Set <p>伸缩配置；省略的成员由服务端补全默认值。</p>
     * @param ScalingConfiguration <p>伸缩配置；省略的成员由服务端补全默认值。</p>
     */
    public void setScalingConfiguration(ScalingConfiguration ScalingConfiguration) {
        this.ScalingConfiguration = ScalingConfiguration;
    }

    /**
     * Get <p>空闲生命周期配置；省略的成员由服务端补全默认值。</p> 
     * @return LifecycleConfiguration <p>空闲生命周期配置；省略的成员由服务端补全默认值。</p>
     */
    public LifecycleConfiguration getLifecycleConfiguration() {
        return this.LifecycleConfiguration;
    }

    /**
     * Set <p>空闲生命周期配置；省略的成员由服务端补全默认值。</p>
     * @param LifecycleConfiguration <p>空闲生命周期配置；省略的成员由服务端补全默认值。</p>
     */
    public void setLifecycleConfiguration(LifecycleConfiguration LifecycleConfiguration) {
        this.LifecycleConfiguration = LifecycleConfiguration;
    }

    /**
     * Get <p>Affinity 配置；省略或空 Mode 表示不启用。</p> 
     * @return AffinityConfiguration <p>Affinity 配置；省略或空 Mode 表示不启用。</p>
     */
    public AffinityConfiguration getAffinityConfiguration() {
        return this.AffinityConfiguration;
    }

    /**
     * Set <p>Affinity 配置；省略或空 Mode 表示不启用。</p>
     * @param AffinityConfiguration <p>Affinity 配置；省略或空 Mode 表示不启用。</p>
     */
    public void setAffinityConfiguration(AffinityConfiguration AffinityConfiguration) {
        this.AffinityConfiguration = AffinityConfiguration;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDeploymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeploymentRequest(CreateDeploymentRequest source) {
        if (source.DeploymentName != null) {
            this.DeploymentName = new String(source.DeploymentName);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ScalingConfiguration != null) {
            this.ScalingConfiguration = new ScalingConfiguration(source.ScalingConfiguration);
        }
        if (source.LifecycleConfiguration != null) {
            this.LifecycleConfiguration = new LifecycleConfiguration(source.LifecycleConfiguration);
        }
        if (source.AffinityConfiguration != null) {
            this.AffinityConfiguration = new AffinityConfiguration(source.AffinityConfiguration);
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
        this.setParamSimple(map, prefix + "DeploymentName", this.DeploymentName);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamObj(map, prefix + "ScalingConfiguration.", this.ScalingConfiguration);
        this.setParamObj(map, prefix + "LifecycleConfiguration.", this.LifecycleConfiguration);
        this.setParamObj(map, prefix + "AffinityConfiguration.", this.AffinityConfiguration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

