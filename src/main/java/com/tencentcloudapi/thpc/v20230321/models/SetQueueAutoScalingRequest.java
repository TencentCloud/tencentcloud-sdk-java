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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetQueueAutoScalingRequest extends AbstractModel {

    /**
    * 集群 ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 队列名称。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>伸缩容量策略，用于设置目标容量及容量单位。单独传入时仅更新容量相关配置，未传字段保持原值。</p>
    */
    @SerializedName("ScalingPolicy")
    @Expose
    private ScalingPolicy ScalingPolicy;

    /**
    * <p>扩容策略，用于配置启动模板、机型族、GPU 卡数、规格优先级和多可用区等扩容方式。单独传入时仅更新扩容相关配置，未传字段保持原值。</p>
    */
    @SerializedName("ExpansionPolicy")
    @Expose
    private ExpansionPolicy ExpansionPolicy;

    /**
     * Get 集群 ID。 
     * @return ClusterId 集群 ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID。
     * @param ClusterId 集群 ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 队列名称。 
     * @return QueueName 队列名称。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称。
     * @param QueueName 队列名称。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>伸缩容量策略，用于设置目标容量及容量单位。单独传入时仅更新容量相关配置，未传字段保持原值。</p> 
     * @return ScalingPolicy <p>伸缩容量策略，用于设置目标容量及容量单位。单独传入时仅更新容量相关配置，未传字段保持原值。</p>
     */
    public ScalingPolicy getScalingPolicy() {
        return this.ScalingPolicy;
    }

    /**
     * Set <p>伸缩容量策略，用于设置目标容量及容量单位。单独传入时仅更新容量相关配置，未传字段保持原值。</p>
     * @param ScalingPolicy <p>伸缩容量策略，用于设置目标容量及容量单位。单独传入时仅更新容量相关配置，未传字段保持原值。</p>
     */
    public void setScalingPolicy(ScalingPolicy ScalingPolicy) {
        this.ScalingPolicy = ScalingPolicy;
    }

    /**
     * Get <p>扩容策略，用于配置启动模板、机型族、GPU 卡数、规格优先级和多可用区等扩容方式。单独传入时仅更新扩容相关配置，未传字段保持原值。</p> 
     * @return ExpansionPolicy <p>扩容策略，用于配置启动模板、机型族、GPU 卡数、规格优先级和多可用区等扩容方式。单独传入时仅更新扩容相关配置，未传字段保持原值。</p>
     */
    public ExpansionPolicy getExpansionPolicy() {
        return this.ExpansionPolicy;
    }

    /**
     * Set <p>扩容策略，用于配置启动模板、机型族、GPU 卡数、规格优先级和多可用区等扩容方式。单独传入时仅更新扩容相关配置，未传字段保持原值。</p>
     * @param ExpansionPolicy <p>扩容策略，用于配置启动模板、机型族、GPU 卡数、规格优先级和多可用区等扩容方式。单独传入时仅更新扩容相关配置，未传字段保持原值。</p>
     */
    public void setExpansionPolicy(ExpansionPolicy ExpansionPolicy) {
        this.ExpansionPolicy = ExpansionPolicy;
    }

    public SetQueueAutoScalingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetQueueAutoScalingRequest(SetQueueAutoScalingRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ScalingPolicy != null) {
            this.ScalingPolicy = new ScalingPolicy(source.ScalingPolicy);
        }
        if (source.ExpansionPolicy != null) {
            this.ExpansionPolicy = new ExpansionPolicy(source.ExpansionPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamObj(map, prefix + "ScalingPolicy.", this.ScalingPolicy);
        this.setParamObj(map, prefix + "ExpansionPolicy.", this.ExpansionPolicy);

    }
}

