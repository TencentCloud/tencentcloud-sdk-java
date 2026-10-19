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

public class OverviewVpcRuleQuotaDetail extends AbstractModel {

    /**
    * <p>允许使用的规则总数。</p>
    */
    @SerializedName("AllowedNum")
    @Expose
    private Long AllowedNum;

    /**
    * <p>已使用规则数量。</p>
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * <p>剩余规则配额数量。</p>
    */
    @SerializedName("RemainQuota")
    @Expose
    private Long RemainQuota;

    /**
    * <p>剩余扩容规则数量。</p>
    */
    @SerializedName("RemainExtensionNum")
    @Expose
    private Long RemainExtensionNum;

    /**
    * <p>全局规则总数。</p>
    */
    @SerializedName("GlobalRuleNum")
    @Expose
    private Long GlobalRuleNum;

    /**
    * <p>当前已启用的全局规则条目。</p>
    */
    @SerializedName("GlobalEnableRuleNum")
    @Expose
    private Long GlobalEnableRuleNum;

    /**
    * <p>边界规则总数。</p>
    */
    @SerializedName("EdgeRuleNum")
    @Expose
    private Long EdgeRuleNum;

    /**
    * <p>边界启用规则数。</p>
    */
    @SerializedName("EdgeEnableRuleNum")
    @Expose
    private Long EdgeEnableRuleNum;

    /**
    * <p>IPv4 规则总数。</p>
    */
    @SerializedName("V4RuleTotal")
    @Expose
    private Long V4RuleTotal;

    /**
    * <p>当前已启用的 IPv4 规则条目。</p>
    */
    @SerializedName("V4EnableRuleTotal")
    @Expose
    private Long V4EnableRuleTotal;

    /**
    * <p>IPv6 规则总数。</p>
    */
    @SerializedName("V6RuleTotal")
    @Expose
    private Long V6RuleTotal;

    /**
    * <p>当前已启用的 IPv6 规则条目。</p>
    */
    @SerializedName("V6EnableRuleTotal")
    @Expose
    private Long V6EnableRuleTotal;

    /**
    * <p>VPC 防火墙开关状态标识。</p>
    */
    @SerializedName("IsSwitchEnable")
    @Expose
    private Long IsSwitchEnable;

    /**
     * Get <p>允许使用的规则总数。</p> 
     * @return AllowedNum <p>允许使用的规则总数。</p>
     */
    public Long getAllowedNum() {
        return this.AllowedNum;
    }

    /**
     * Set <p>允许使用的规则总数。</p>
     * @param AllowedNum <p>允许使用的规则总数。</p>
     */
    public void setAllowedNum(Long AllowedNum) {
        this.AllowedNum = AllowedNum;
    }

    /**
     * Get <p>已使用规则数量。</p> 
     * @return UsedNum <p>已使用规则数量。</p>
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set <p>已使用规则数量。</p>
     * @param UsedNum <p>已使用规则数量。</p>
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get <p>剩余规则配额数量。</p> 
     * @return RemainQuota <p>剩余规则配额数量。</p>
     */
    public Long getRemainQuota() {
        return this.RemainQuota;
    }

    /**
     * Set <p>剩余规则配额数量。</p>
     * @param RemainQuota <p>剩余规则配额数量。</p>
     */
    public void setRemainQuota(Long RemainQuota) {
        this.RemainQuota = RemainQuota;
    }

    /**
     * Get <p>剩余扩容规则数量。</p> 
     * @return RemainExtensionNum <p>剩余扩容规则数量。</p>
     */
    public Long getRemainExtensionNum() {
        return this.RemainExtensionNum;
    }

    /**
     * Set <p>剩余扩容规则数量。</p>
     * @param RemainExtensionNum <p>剩余扩容规则数量。</p>
     */
    public void setRemainExtensionNum(Long RemainExtensionNum) {
        this.RemainExtensionNum = RemainExtensionNum;
    }

    /**
     * Get <p>全局规则总数。</p> 
     * @return GlobalRuleNum <p>全局规则总数。</p>
     */
    public Long getGlobalRuleNum() {
        return this.GlobalRuleNum;
    }

    /**
     * Set <p>全局规则总数。</p>
     * @param GlobalRuleNum <p>全局规则总数。</p>
     */
    public void setGlobalRuleNum(Long GlobalRuleNum) {
        this.GlobalRuleNum = GlobalRuleNum;
    }

    /**
     * Get <p>当前已启用的全局规则条目。</p> 
     * @return GlobalEnableRuleNum <p>当前已启用的全局规则条目。</p>
     */
    public Long getGlobalEnableRuleNum() {
        return this.GlobalEnableRuleNum;
    }

    /**
     * Set <p>当前已启用的全局规则条目。</p>
     * @param GlobalEnableRuleNum <p>当前已启用的全局规则条目。</p>
     */
    public void setGlobalEnableRuleNum(Long GlobalEnableRuleNum) {
        this.GlobalEnableRuleNum = GlobalEnableRuleNum;
    }

    /**
     * Get <p>边界规则总数。</p> 
     * @return EdgeRuleNum <p>边界规则总数。</p>
     */
    public Long getEdgeRuleNum() {
        return this.EdgeRuleNum;
    }

    /**
     * Set <p>边界规则总数。</p>
     * @param EdgeRuleNum <p>边界规则总数。</p>
     */
    public void setEdgeRuleNum(Long EdgeRuleNum) {
        this.EdgeRuleNum = EdgeRuleNum;
    }

    /**
     * Get <p>边界启用规则数。</p> 
     * @return EdgeEnableRuleNum <p>边界启用规则数。</p>
     */
    public Long getEdgeEnableRuleNum() {
        return this.EdgeEnableRuleNum;
    }

    /**
     * Set <p>边界启用规则数。</p>
     * @param EdgeEnableRuleNum <p>边界启用规则数。</p>
     */
    public void setEdgeEnableRuleNum(Long EdgeEnableRuleNum) {
        this.EdgeEnableRuleNum = EdgeEnableRuleNum;
    }

    /**
     * Get <p>IPv4 规则总数。</p> 
     * @return V4RuleTotal <p>IPv4 规则总数。</p>
     */
    public Long getV4RuleTotal() {
        return this.V4RuleTotal;
    }

    /**
     * Set <p>IPv4 规则总数。</p>
     * @param V4RuleTotal <p>IPv4 规则总数。</p>
     */
    public void setV4RuleTotal(Long V4RuleTotal) {
        this.V4RuleTotal = V4RuleTotal;
    }

    /**
     * Get <p>当前已启用的 IPv4 规则条目。</p> 
     * @return V4EnableRuleTotal <p>当前已启用的 IPv4 规则条目。</p>
     */
    public Long getV4EnableRuleTotal() {
        return this.V4EnableRuleTotal;
    }

    /**
     * Set <p>当前已启用的 IPv4 规则条目。</p>
     * @param V4EnableRuleTotal <p>当前已启用的 IPv4 规则条目。</p>
     */
    public void setV4EnableRuleTotal(Long V4EnableRuleTotal) {
        this.V4EnableRuleTotal = V4EnableRuleTotal;
    }

    /**
     * Get <p>IPv6 规则总数。</p> 
     * @return V6RuleTotal <p>IPv6 规则总数。</p>
     */
    public Long getV6RuleTotal() {
        return this.V6RuleTotal;
    }

    /**
     * Set <p>IPv6 规则总数。</p>
     * @param V6RuleTotal <p>IPv6 规则总数。</p>
     */
    public void setV6RuleTotal(Long V6RuleTotal) {
        this.V6RuleTotal = V6RuleTotal;
    }

    /**
     * Get <p>当前已启用的 IPv6 规则条目。</p> 
     * @return V6EnableRuleTotal <p>当前已启用的 IPv6 规则条目。</p>
     */
    public Long getV6EnableRuleTotal() {
        return this.V6EnableRuleTotal;
    }

    /**
     * Set <p>当前已启用的 IPv6 规则条目。</p>
     * @param V6EnableRuleTotal <p>当前已启用的 IPv6 规则条目。</p>
     */
    public void setV6EnableRuleTotal(Long V6EnableRuleTotal) {
        this.V6EnableRuleTotal = V6EnableRuleTotal;
    }

    /**
     * Get <p>VPC 防火墙开关状态标识。</p> 
     * @return IsSwitchEnable <p>VPC 防火墙开关状态标识。</p>
     */
    public Long getIsSwitchEnable() {
        return this.IsSwitchEnable;
    }

    /**
     * Set <p>VPC 防火墙开关状态标识。</p>
     * @param IsSwitchEnable <p>VPC 防火墙开关状态标识。</p>
     */
    public void setIsSwitchEnable(Long IsSwitchEnable) {
        this.IsSwitchEnable = IsSwitchEnable;
    }

    public OverviewVpcRuleQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewVpcRuleQuotaDetail(OverviewVpcRuleQuotaDetail source) {
        if (source.AllowedNum != null) {
            this.AllowedNum = new Long(source.AllowedNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.RemainQuota != null) {
            this.RemainQuota = new Long(source.RemainQuota);
        }
        if (source.RemainExtensionNum != null) {
            this.RemainExtensionNum = new Long(source.RemainExtensionNum);
        }
        if (source.GlobalRuleNum != null) {
            this.GlobalRuleNum = new Long(source.GlobalRuleNum);
        }
        if (source.GlobalEnableRuleNum != null) {
            this.GlobalEnableRuleNum = new Long(source.GlobalEnableRuleNum);
        }
        if (source.EdgeRuleNum != null) {
            this.EdgeRuleNum = new Long(source.EdgeRuleNum);
        }
        if (source.EdgeEnableRuleNum != null) {
            this.EdgeEnableRuleNum = new Long(source.EdgeEnableRuleNum);
        }
        if (source.V4RuleTotal != null) {
            this.V4RuleTotal = new Long(source.V4RuleTotal);
        }
        if (source.V4EnableRuleTotal != null) {
            this.V4EnableRuleTotal = new Long(source.V4EnableRuleTotal);
        }
        if (source.V6RuleTotal != null) {
            this.V6RuleTotal = new Long(source.V6RuleTotal);
        }
        if (source.V6EnableRuleTotal != null) {
            this.V6EnableRuleTotal = new Long(source.V6EnableRuleTotal);
        }
        if (source.IsSwitchEnable != null) {
            this.IsSwitchEnable = new Long(source.IsSwitchEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllowedNum", this.AllowedNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamSimple(map, prefix + "RemainQuota", this.RemainQuota);
        this.setParamSimple(map, prefix + "RemainExtensionNum", this.RemainExtensionNum);
        this.setParamSimple(map, prefix + "GlobalRuleNum", this.GlobalRuleNum);
        this.setParamSimple(map, prefix + "GlobalEnableRuleNum", this.GlobalEnableRuleNum);
        this.setParamSimple(map, prefix + "EdgeRuleNum", this.EdgeRuleNum);
        this.setParamSimple(map, prefix + "EdgeEnableRuleNum", this.EdgeEnableRuleNum);
        this.setParamSimple(map, prefix + "V4RuleTotal", this.V4RuleTotal);
        this.setParamSimple(map, prefix + "V4EnableRuleTotal", this.V4EnableRuleTotal);
        this.setParamSimple(map, prefix + "V6RuleTotal", this.V6RuleTotal);
        this.setParamSimple(map, prefix + "V6EnableRuleTotal", this.V6EnableRuleTotal);
        this.setParamSimple(map, prefix + "IsSwitchEnable", this.IsSwitchEnable);

    }
}

