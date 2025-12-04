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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableZoneAffinityInfo extends AbstractModel {

    /**
    * 是否开启可用区转发亲和。true：开启可用区转发亲和；false：开启可用区转发亲和。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 可用区转发亲和失效阈值，当可用区内后端服务健康比例小于该阈值时，负载均衡会退出可用区转发亲和，转为全可用区转发。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExitRatio")
    @Expose
    private Long ExitRatio;

    /**
    * 可用区转发亲和的重新生效阈值，当处于全可用区转发，且负载均衡可用区内的后端服务健康比例大于等于该阈值时，负载均衡会重新进入可用区转发亲和。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReentryRatio")
    @Expose
    private Long ReentryRatio;

    /**
     * Get 是否开启可用区转发亲和。true：开启可用区转发亲和；false：开启可用区转发亲和。 
     * @return Enable 是否开启可用区转发亲和。true：开启可用区转发亲和；false：开启可用区转发亲和。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启可用区转发亲和。true：开启可用区转发亲和；false：开启可用区转发亲和。
     * @param Enable 是否开启可用区转发亲和。true：开启可用区转发亲和；false：开启可用区转发亲和。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 可用区转发亲和失效阈值，当可用区内后端服务健康比例小于该阈值时，负载均衡会退出可用区转发亲和，转为全可用区转发。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExitRatio 可用区转发亲和失效阈值，当可用区内后端服务健康比例小于该阈值时，负载均衡会退出可用区转发亲和，转为全可用区转发。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExitRatio() {
        return this.ExitRatio;
    }

    /**
     * Set 可用区转发亲和失效阈值，当可用区内后端服务健康比例小于该阈值时，负载均衡会退出可用区转发亲和，转为全可用区转发。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExitRatio 可用区转发亲和失效阈值，当可用区内后端服务健康比例小于该阈值时，负载均衡会退出可用区转发亲和，转为全可用区转发。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExitRatio(Long ExitRatio) {
        this.ExitRatio = ExitRatio;
    }

    /**
     * Get 可用区转发亲和的重新生效阈值，当处于全可用区转发，且负载均衡可用区内的后端服务健康比例大于等于该阈值时，负载均衡会重新进入可用区转发亲和。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReentryRatio 可用区转发亲和的重新生效阈值，当处于全可用区转发，且负载均衡可用区内的后端服务健康比例大于等于该阈值时，负载均衡会重新进入可用区转发亲和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReentryRatio() {
        return this.ReentryRatio;
    }

    /**
     * Set 可用区转发亲和的重新生效阈值，当处于全可用区转发，且负载均衡可用区内的后端服务健康比例大于等于该阈值时，负载均衡会重新进入可用区转发亲和。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReentryRatio 可用区转发亲和的重新生效阈值，当处于全可用区转发，且负载均衡可用区内的后端服务健康比例大于等于该阈值时，负载均衡会重新进入可用区转发亲和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReentryRatio(Long ReentryRatio) {
        this.ReentryRatio = ReentryRatio;
    }

    public AvailableZoneAffinityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableZoneAffinityInfo(AvailableZoneAffinityInfo source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ExitRatio != null) {
            this.ExitRatio = new Long(source.ExitRatio);
        }
        if (source.ReentryRatio != null) {
            this.ReentryRatio = new Long(source.ReentryRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ExitRatio", this.ExitRatio);
        this.setParamSimple(map, prefix + "ReentryRatio", this.ReentryRatio);

    }
}

