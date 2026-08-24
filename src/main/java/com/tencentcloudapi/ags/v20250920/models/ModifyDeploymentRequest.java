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

public class ModifyDeploymentRequest extends AbstractModel {

    /**
    * <p>待修改的 Deployment ID。</p>
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>完整替换伸缩配置；提供时必须包含全部三个成员。</p>
    */
    @SerializedName("ScalingConfiguration")
    @Expose
    private ScalingConfiguration ScalingConfiguration;

    /**
    * <p>完整替换生命周期配置；提供时必须包含全部两个成员。</p>
    */
    @SerializedName("LifecycleConfiguration")
    @Expose
    private LifecycleConfiguration LifecycleConfiguration;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>待修改的 Deployment ID。</p> 
     * @return DeploymentId <p>待修改的 Deployment ID。</p>
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>待修改的 Deployment ID。</p>
     * @param DeploymentId <p>待修改的 Deployment ID。</p>
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>完整替换伸缩配置；提供时必须包含全部三个成员。</p> 
     * @return ScalingConfiguration <p>完整替换伸缩配置；提供时必须包含全部三个成员。</p>
     */
    public ScalingConfiguration getScalingConfiguration() {
        return this.ScalingConfiguration;
    }

    /**
     * Set <p>完整替换伸缩配置；提供时必须包含全部三个成员。</p>
     * @param ScalingConfiguration <p>完整替换伸缩配置；提供时必须包含全部三个成员。</p>
     */
    public void setScalingConfiguration(ScalingConfiguration ScalingConfiguration) {
        this.ScalingConfiguration = ScalingConfiguration;
    }

    /**
     * Get <p>完整替换生命周期配置；提供时必须包含全部两个成员。</p> 
     * @return LifecycleConfiguration <p>完整替换生命周期配置；提供时必须包含全部两个成员。</p>
     */
    public LifecycleConfiguration getLifecycleConfiguration() {
        return this.LifecycleConfiguration;
    }

    /**
     * Set <p>完整替换生命周期配置；提供时必须包含全部两个成员。</p>
     * @param LifecycleConfiguration <p>完整替换生命周期配置；提供时必须包含全部两个成员。</p>
     */
    public void setLifecycleConfiguration(LifecycleConfiguration LifecycleConfiguration) {
        this.LifecycleConfiguration = LifecycleConfiguration;
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

    public ModifyDeploymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeploymentRequest(ModifyDeploymentRequest source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.ScalingConfiguration != null) {
            this.ScalingConfiguration = new ScalingConfiguration(source.ScalingConfiguration);
        }
        if (source.LifecycleConfiguration != null) {
            this.LifecycleConfiguration = new LifecycleConfiguration(source.LifecycleConfiguration);
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
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamObj(map, prefix + "ScalingConfiguration.", this.ScalingConfiguration);
        this.setParamObj(map, prefix + "LifecycleConfiguration.", this.LifecycleConfiguration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

