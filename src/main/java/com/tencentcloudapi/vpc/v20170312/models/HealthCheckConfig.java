/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConfig extends AbstractModel {

    /**
    * 探测模式，默认值NQA，不可修改。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProbeType")
    @Expose
    private String ProbeType;

    /**
    * 探测间隔，腾讯云两次健康检查间隔时间，范围【1000-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProbeInterval")
    @Expose
    private Long ProbeInterval;

    /**
    * 探测次数，连续N次健康检查失败后执行路由切换，范围【3-8】，单位次。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProbeThreshold")
    @Expose
    private Long ProbeThreshold;

    /**
    * 探测超时时间，范围【10-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProbeTimeout")
    @Expose
    private Long ProbeTimeout;

    /**
     * Get 探测模式，默认值NQA，不可修改。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProbeType 探测模式，默认值NQA，不可修改。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProbeType() {
        return this.ProbeType;
    }

    /**
     * Set 探测模式，默认值NQA，不可修改。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProbeType 探测模式，默认值NQA，不可修改。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProbeType(String ProbeType) {
        this.ProbeType = ProbeType;
    }

    /**
     * Get 探测间隔，腾讯云两次健康检查间隔时间，范围【1000-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProbeInterval 探测间隔，腾讯云两次健康检查间隔时间，范围【1000-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProbeInterval() {
        return this.ProbeInterval;
    }

    /**
     * Set 探测间隔，腾讯云两次健康检查间隔时间，范围【1000-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProbeInterval 探测间隔，腾讯云两次健康检查间隔时间，范围【1000-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProbeInterval(Long ProbeInterval) {
        this.ProbeInterval = ProbeInterval;
    }

    /**
     * Get 探测次数，连续N次健康检查失败后执行路由切换，范围【3-8】，单位次。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProbeThreshold 探测次数，连续N次健康检查失败后执行路由切换，范围【3-8】，单位次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProbeThreshold() {
        return this.ProbeThreshold;
    }

    /**
     * Set 探测次数，连续N次健康检查失败后执行路由切换，范围【3-8】，单位次。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProbeThreshold 探测次数，连续N次健康检查失败后执行路由切换，范围【3-8】，单位次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProbeThreshold(Long ProbeThreshold) {
        this.ProbeThreshold = ProbeThreshold;
    }

    /**
     * Get 探测超时时间，范围【10-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProbeTimeout 探测超时时间，范围【10-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProbeTimeout() {
        return this.ProbeTimeout;
    }

    /**
     * Set 探测超时时间，范围【10-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProbeTimeout 探测超时时间，范围【10-5000】，单位ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProbeTimeout(Long ProbeTimeout) {
        this.ProbeTimeout = ProbeTimeout;
    }

    public HealthCheckConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConfig(HealthCheckConfig source) {
        if (source.ProbeType != null) {
            this.ProbeType = new String(source.ProbeType);
        }
        if (source.ProbeInterval != null) {
            this.ProbeInterval = new Long(source.ProbeInterval);
        }
        if (source.ProbeThreshold != null) {
            this.ProbeThreshold = new Long(source.ProbeThreshold);
        }
        if (source.ProbeTimeout != null) {
            this.ProbeTimeout = new Long(source.ProbeTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProbeType", this.ProbeType);
        this.setParamSimple(map, prefix + "ProbeInterval", this.ProbeInterval);
        this.setParamSimple(map, prefix + "ProbeThreshold", this.ProbeThreshold);
        this.setParamSimple(map, prefix + "ProbeTimeout", this.ProbeTimeout);

    }
}

