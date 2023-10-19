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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartCpuExpandRequest extends AbstractModel {

    /**
    * 实例 ID 。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 扩容类型。可选值：auto：代表进行自动扩容
manual：代表进行手动扩容
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 手动扩容时，扩容的CPU核心数。Type 为 manual 时必传。
    */
    @SerializedName("ExpandCpu")
    @Expose
    private Long ExpandCpu;

    /**
    * 自动扩容策略。Type 为 auto 时必传。
    */
    @SerializedName("AutoStrategy")
    @Expose
    private AutoStrategy AutoStrategy;

    /**
     * Get 实例 ID 。 
     * @return InstanceId 实例 ID 。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID 。
     * @param InstanceId 实例 ID 。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 扩容类型。可选值：auto：代表进行自动扩容
manual：代表进行手动扩容 
     * @return Type 扩容类型。可选值：auto：代表进行自动扩容
manual：代表进行手动扩容
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 扩容类型。可选值：auto：代表进行自动扩容
manual：代表进行手动扩容
     * @param Type 扩容类型。可选值：auto：代表进行自动扩容
manual：代表进行手动扩容
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 手动扩容时，扩容的CPU核心数。Type 为 manual 时必传。 
     * @return ExpandCpu 手动扩容时，扩容的CPU核心数。Type 为 manual 时必传。
     */
    public Long getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set 手动扩容时，扩容的CPU核心数。Type 为 manual 时必传。
     * @param ExpandCpu 手动扩容时，扩容的CPU核心数。Type 为 manual 时必传。
     */
    public void setExpandCpu(Long ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get 自动扩容策略。Type 为 auto 时必传。 
     * @return AutoStrategy 自动扩容策略。Type 为 auto 时必传。
     */
    public AutoStrategy getAutoStrategy() {
        return this.AutoStrategy;
    }

    /**
     * Set 自动扩容策略。Type 为 auto 时必传。
     * @param AutoStrategy 自动扩容策略。Type 为 auto 时必传。
     */
    public void setAutoStrategy(AutoStrategy AutoStrategy) {
        this.AutoStrategy = AutoStrategy;
    }

    public StartCpuExpandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartCpuExpandRequest(StartCpuExpandRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new Long(source.ExpandCpu);
        }
        if (source.AutoStrategy != null) {
            this.AutoStrategy = new AutoStrategy(source.AutoStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamObj(map, prefix + "AutoStrategy.", this.AutoStrategy);

    }
}

