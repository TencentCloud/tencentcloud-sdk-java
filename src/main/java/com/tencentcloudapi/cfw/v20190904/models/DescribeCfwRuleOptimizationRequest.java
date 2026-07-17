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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwRuleOptimizationRequest extends AbstractModel {

    /**
    * 长期零命中规则阈值天数。可选，必须为正整数，默认 180。
    */
    @SerializedName("IdleDays")
    @Expose
    private Long IdleDays;

    /**
    * 单 IP 离散过多聚合建议的最小数量。可选，最小为 2，默认 10。
    */
    @SerializedName("IpAggMin")
    @Expose
    private Long IpAggMin;

    /**
    * 可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，必须为正整数，默认 50。
    */
    @SerializedName("IocSample")
    @Expose
    private Long IocSample;

    /**
     * Get 长期零命中规则阈值天数。可选，必须为正整数，默认 180。 
     * @return IdleDays 长期零命中规则阈值天数。可选，必须为正整数，默认 180。
     */
    public Long getIdleDays() {
        return this.IdleDays;
    }

    /**
     * Set 长期零命中规则阈值天数。可选，必须为正整数，默认 180。
     * @param IdleDays 长期零命中规则阈值天数。可选，必须为正整数，默认 180。
     */
    public void setIdleDays(Long IdleDays) {
        this.IdleDays = IdleDays;
    }

    /**
     * Get 单 IP 离散过多聚合建议的最小数量。可选，最小为 2，默认 10。 
     * @return IpAggMin 单 IP 离散过多聚合建议的最小数量。可选，最小为 2，默认 10。
     */
    public Long getIpAggMin() {
        return this.IpAggMin;
    }

    /**
     * Set 单 IP 离散过多聚合建议的最小数量。可选，最小为 2，默认 10。
     * @param IpAggMin 单 IP 离散过多聚合建议的最小数量。可选，最小为 2，默认 10。
     */
    public void setIpAggMin(Long IpAggMin) {
        this.IpAggMin = IpAggMin;
    }

    /**
     * Get 可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，必须为正整数，默认 50。 
     * @return IocSample 可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，必须为正整数，默认 50。
     */
    public Long getIocSample() {
        return this.IocSample;
    }

    /**
     * Set 可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，必须为正整数，默认 50。
     * @param IocSample 可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，必须为正整数，默认 50。
     */
    public void setIocSample(Long IocSample) {
        this.IocSample = IocSample;
    }

    public DescribeCfwRuleOptimizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwRuleOptimizationRequest(DescribeCfwRuleOptimizationRequest source) {
        if (source.IdleDays != null) {
            this.IdleDays = new Long(source.IdleDays);
        }
        if (source.IpAggMin != null) {
            this.IpAggMin = new Long(source.IpAggMin);
        }
        if (source.IocSample != null) {
            this.IocSample = new Long(source.IocSample);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdleDays", this.IdleDays);
        this.setParamSimple(map, prefix + "IpAggMin", this.IpAggMin);
        this.setParamSimple(map, prefix + "IocSample", this.IocSample);

    }
}

