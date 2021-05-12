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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicPodSpec extends AbstractModel{

    /**
    * 需求最小cpu核数
    */
    @SerializedName("RequestCpu")
    @Expose
    private Float RequestCpu;

    /**
    * 需求最大cpu核数
    */
    @SerializedName("LimitCpu")
    @Expose
    private Float LimitCpu;

    /**
    * 需求最小memory，单位MB
    */
    @SerializedName("RequestMemory")
    @Expose
    private Float RequestMemory;

    /**
    * 需求最大memory，单位MB
    */
    @SerializedName("LimitMemory")
    @Expose
    private Float LimitMemory;

    /**
     * Get 需求最小cpu核数 
     * @return RequestCpu 需求最小cpu核数
     */
    public Float getRequestCpu() {
        return this.RequestCpu;
    }

    /**
     * Set 需求最小cpu核数
     * @param RequestCpu 需求最小cpu核数
     */
    public void setRequestCpu(Float RequestCpu) {
        this.RequestCpu = RequestCpu;
    }

    /**
     * Get 需求最大cpu核数 
     * @return LimitCpu 需求最大cpu核数
     */
    public Float getLimitCpu() {
        return this.LimitCpu;
    }

    /**
     * Set 需求最大cpu核数
     * @param LimitCpu 需求最大cpu核数
     */
    public void setLimitCpu(Float LimitCpu) {
        this.LimitCpu = LimitCpu;
    }

    /**
     * Get 需求最小memory，单位MB 
     * @return RequestMemory 需求最小memory，单位MB
     */
    public Float getRequestMemory() {
        return this.RequestMemory;
    }

    /**
     * Set 需求最小memory，单位MB
     * @param RequestMemory 需求最小memory，单位MB
     */
    public void setRequestMemory(Float RequestMemory) {
        this.RequestMemory = RequestMemory;
    }

    /**
     * Get 需求最大memory，单位MB 
     * @return LimitMemory 需求最大memory，单位MB
     */
    public Float getLimitMemory() {
        return this.LimitMemory;
    }

    /**
     * Set 需求最大memory，单位MB
     * @param LimitMemory 需求最大memory，单位MB
     */
    public void setLimitMemory(Float LimitMemory) {
        this.LimitMemory = LimitMemory;
    }

    public DynamicPodSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicPodSpec(DynamicPodSpec source) {
        if (source.RequestCpu != null) {
            this.RequestCpu = new Float(source.RequestCpu);
        }
        if (source.LimitCpu != null) {
            this.LimitCpu = new Float(source.LimitCpu);
        }
        if (source.RequestMemory != null) {
            this.RequestMemory = new Float(source.RequestMemory);
        }
        if (source.LimitMemory != null) {
            this.LimitMemory = new Float(source.LimitMemory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestCpu", this.RequestCpu);
        this.setParamSimple(map, prefix + "LimitCpu", this.LimitCpu);
        this.setParamSimple(map, prefix + "RequestMemory", this.RequestMemory);
        this.setParamSimple(map, prefix + "LimitMemory", this.LimitMemory);

    }
}

