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

public class PolicyRoutePreCheckReport extends AbstractModel {

    /**
    * 本次编排生成的下一跳数量
    */
    @SerializedName("NextHopCount")
    @Expose
    private Long NextHopCount;

    /**
    * 下一跳上限
    */
    @SerializedName("NextHopLimit")
    @Expose
    private Long NextHopLimit;

    /**
    * 本次编排生成的匹配规则数
    */
    @SerializedName("MatchRuleCount")
    @Expose
    private Long MatchRuleCount;

    /**
    * 匹配规则上限
    */
    @SerializedName("MatchRuleLimit")
    @Expose
    private Long MatchRuleLimit;

    /**
    * 云上已有匹配规则数（其他防火墙类型占用）
    */
    @SerializedName("CloudExistingRuleCount")
    @Expose
    private Long CloudExistingRuleCount;

    /**
    * 云上已有下一跳数（其他防火墙类型占用）
    */
    @SerializedName("CloudExistingNextHopCount")
    @Expose
    private Long CloudExistingNextHopCount;

    /**
    * 可用匹配规则配额 = MatchRuleLimit - CloudExistingRuleCount - MatchRuleCount
    */
    @SerializedName("AvailableRuleQuota")
    @Expose
    private Long AvailableRuleQuota;

    /**
    * 可用下一跳配额 = NextHopLimit - CloudExistingNextHopCount - NextHopCount
    */
    @SerializedName("AvailableNextHopQuota")
    @Expose
    private Long AvailableNextHopQuota;

    /**
     * Get 本次编排生成的下一跳数量 
     * @return NextHopCount 本次编排生成的下一跳数量
     */
    public Long getNextHopCount() {
        return this.NextHopCount;
    }

    /**
     * Set 本次编排生成的下一跳数量
     * @param NextHopCount 本次编排生成的下一跳数量
     */
    public void setNextHopCount(Long NextHopCount) {
        this.NextHopCount = NextHopCount;
    }

    /**
     * Get 下一跳上限 
     * @return NextHopLimit 下一跳上限
     */
    public Long getNextHopLimit() {
        return this.NextHopLimit;
    }

    /**
     * Set 下一跳上限
     * @param NextHopLimit 下一跳上限
     */
    public void setNextHopLimit(Long NextHopLimit) {
        this.NextHopLimit = NextHopLimit;
    }

    /**
     * Get 本次编排生成的匹配规则数 
     * @return MatchRuleCount 本次编排生成的匹配规则数
     */
    public Long getMatchRuleCount() {
        return this.MatchRuleCount;
    }

    /**
     * Set 本次编排生成的匹配规则数
     * @param MatchRuleCount 本次编排生成的匹配规则数
     */
    public void setMatchRuleCount(Long MatchRuleCount) {
        this.MatchRuleCount = MatchRuleCount;
    }

    /**
     * Get 匹配规则上限 
     * @return MatchRuleLimit 匹配规则上限
     */
    public Long getMatchRuleLimit() {
        return this.MatchRuleLimit;
    }

    /**
     * Set 匹配规则上限
     * @param MatchRuleLimit 匹配规则上限
     */
    public void setMatchRuleLimit(Long MatchRuleLimit) {
        this.MatchRuleLimit = MatchRuleLimit;
    }

    /**
     * Get 云上已有匹配规则数（其他防火墙类型占用） 
     * @return CloudExistingRuleCount 云上已有匹配规则数（其他防火墙类型占用）
     */
    public Long getCloudExistingRuleCount() {
        return this.CloudExistingRuleCount;
    }

    /**
     * Set 云上已有匹配规则数（其他防火墙类型占用）
     * @param CloudExistingRuleCount 云上已有匹配规则数（其他防火墙类型占用）
     */
    public void setCloudExistingRuleCount(Long CloudExistingRuleCount) {
        this.CloudExistingRuleCount = CloudExistingRuleCount;
    }

    /**
     * Get 云上已有下一跳数（其他防火墙类型占用） 
     * @return CloudExistingNextHopCount 云上已有下一跳数（其他防火墙类型占用）
     */
    public Long getCloudExistingNextHopCount() {
        return this.CloudExistingNextHopCount;
    }

    /**
     * Set 云上已有下一跳数（其他防火墙类型占用）
     * @param CloudExistingNextHopCount 云上已有下一跳数（其他防火墙类型占用）
     */
    public void setCloudExistingNextHopCount(Long CloudExistingNextHopCount) {
        this.CloudExistingNextHopCount = CloudExistingNextHopCount;
    }

    /**
     * Get 可用匹配规则配额 = MatchRuleLimit - CloudExistingRuleCount - MatchRuleCount 
     * @return AvailableRuleQuota 可用匹配规则配额 = MatchRuleLimit - CloudExistingRuleCount - MatchRuleCount
     */
    public Long getAvailableRuleQuota() {
        return this.AvailableRuleQuota;
    }

    /**
     * Set 可用匹配规则配额 = MatchRuleLimit - CloudExistingRuleCount - MatchRuleCount
     * @param AvailableRuleQuota 可用匹配规则配额 = MatchRuleLimit - CloudExistingRuleCount - MatchRuleCount
     */
    public void setAvailableRuleQuota(Long AvailableRuleQuota) {
        this.AvailableRuleQuota = AvailableRuleQuota;
    }

    /**
     * Get 可用下一跳配额 = NextHopLimit - CloudExistingNextHopCount - NextHopCount 
     * @return AvailableNextHopQuota 可用下一跳配额 = NextHopLimit - CloudExistingNextHopCount - NextHopCount
     */
    public Long getAvailableNextHopQuota() {
        return this.AvailableNextHopQuota;
    }

    /**
     * Set 可用下一跳配额 = NextHopLimit - CloudExistingNextHopCount - NextHopCount
     * @param AvailableNextHopQuota 可用下一跳配额 = NextHopLimit - CloudExistingNextHopCount - NextHopCount
     */
    public void setAvailableNextHopQuota(Long AvailableNextHopQuota) {
        this.AvailableNextHopQuota = AvailableNextHopQuota;
    }

    public PolicyRoutePreCheckReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRoutePreCheckReport(PolicyRoutePreCheckReport source) {
        if (source.NextHopCount != null) {
            this.NextHopCount = new Long(source.NextHopCount);
        }
        if (source.NextHopLimit != null) {
            this.NextHopLimit = new Long(source.NextHopLimit);
        }
        if (source.MatchRuleCount != null) {
            this.MatchRuleCount = new Long(source.MatchRuleCount);
        }
        if (source.MatchRuleLimit != null) {
            this.MatchRuleLimit = new Long(source.MatchRuleLimit);
        }
        if (source.CloudExistingRuleCount != null) {
            this.CloudExistingRuleCount = new Long(source.CloudExistingRuleCount);
        }
        if (source.CloudExistingNextHopCount != null) {
            this.CloudExistingNextHopCount = new Long(source.CloudExistingNextHopCount);
        }
        if (source.AvailableRuleQuota != null) {
            this.AvailableRuleQuota = new Long(source.AvailableRuleQuota);
        }
        if (source.AvailableNextHopQuota != null) {
            this.AvailableNextHopQuota = new Long(source.AvailableNextHopQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NextHopCount", this.NextHopCount);
        this.setParamSimple(map, prefix + "NextHopLimit", this.NextHopLimit);
        this.setParamSimple(map, prefix + "MatchRuleCount", this.MatchRuleCount);
        this.setParamSimple(map, prefix + "MatchRuleLimit", this.MatchRuleLimit);
        this.setParamSimple(map, prefix + "CloudExistingRuleCount", this.CloudExistingRuleCount);
        this.setParamSimple(map, prefix + "CloudExistingNextHopCount", this.CloudExistingNextHopCount);
        this.setParamSimple(map, prefix + "AvailableRuleQuota", this.AvailableRuleQuota);
        this.setParamSimple(map, prefix + "AvailableNextHopQuota", this.AvailableNextHopQuota);

    }
}

