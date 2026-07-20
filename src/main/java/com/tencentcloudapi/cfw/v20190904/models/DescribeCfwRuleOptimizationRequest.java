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
    * <p>防火墙规则类型。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组。</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>要执行的优化维度白名单。可选，例如 D1、D2、D8；不传默认执行全部支持维度。</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private String [] Dimensions;

    /**
    * <p>长期零命中规则阈值天数。可选，默认 180。</p>
    */
    @SerializedName("IdleDays")
    @Expose
    private Long IdleDays;

    /**
    * <p>单 IP 离散过多聚合建议的最小数量。可选，默认 10。</p>
    */
    @SerializedName("IpAggMin")
    @Expose
    private Long IpAggMin;

    /**
    * <p>可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，默认 50。</p>
    */
    @SerializedName("IocSample")
    @Expose
    private Long IocSample;

    /**
     * Get <p>防火墙规则类型。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组。</p> 
     * @return RuleType <p>防火墙规则类型。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组。</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>防火墙规则类型。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组。</p>
     * @param RuleType <p>防火墙规则类型。必填。枚举：border 互联网边界；nat NAT 边界；vpc VPC 间；enterprise_sg 企业安全组。</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>要执行的优化维度白名单。可选，例如 D1、D2、D8；不传默认执行全部支持维度。</p> 
     * @return Dimensions <p>要执行的优化维度白名单。可选，例如 D1、D2、D8；不传默认执行全部支持维度。</p>
     */
    public String [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>要执行的优化维度白名单。可选，例如 D1、D2、D8；不传默认执行全部支持维度。</p>
     * @param Dimensions <p>要执行的优化维度白名单。可选，例如 D1、D2、D8；不传默认执行全部支持维度。</p>
     */
    public void setDimensions(String [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>长期零命中规则阈值天数。可选，默认 180。</p> 
     * @return IdleDays <p>长期零命中规则阈值天数。可选，默认 180。</p>
     */
    public Long getIdleDays() {
        return this.IdleDays;
    }

    /**
     * Set <p>长期零命中规则阈值天数。可选，默认 180。</p>
     * @param IdleDays <p>长期零命中规则阈值天数。可选，默认 180。</p>
     */
    public void setIdleDays(Long IdleDays) {
        this.IdleDays = IdleDays;
    }

    /**
     * Get <p>单 IP 离散过多聚合建议的最小数量。可选，默认 10。</p> 
     * @return IpAggMin <p>单 IP 离散过多聚合建议的最小数量。可选，默认 10。</p>
     */
    public Long getIpAggMin() {
        return this.IpAggMin;
    }

    /**
     * Set <p>单 IP 离散过多聚合建议的最小数量。可选，默认 10。</p>
     * @param IpAggMin <p>单 IP 离散过多聚合建议的最小数量。可选，默认 10。</p>
     */
    public void setIpAggMin(Long IpAggMin) {
        this.IpAggMin = IpAggMin;
    }

    /**
     * Get <p>可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，默认 50。</p> 
     * @return IocSample <p>可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，默认 50。</p>
     */
    public Long getIocSample() {
        return this.IocSample;
    }

    /**
     * Set <p>可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，默认 50。</p>
     * @param IocSample <p>可迁移 IOC 建议中返回的样例 IOC 数量上限。可选，默认 50。</p>
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
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new String(source.Dimensions[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "IdleDays", this.IdleDays);
        this.setParamSimple(map, prefix + "IpAggMin", this.IpAggMin);
        this.setParamSimple(map, prefix + "IocSample", this.IocSample);

    }
}

