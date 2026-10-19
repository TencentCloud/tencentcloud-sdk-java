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

public class OverviewCommonRuleQuotaDetail extends AbstractModel {

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
    * <p>入方向规则总数。</p>
    */
    @SerializedName("InTotal")
    @Expose
    private Long InTotal;

    /**
    * <p>入方向启用规则数。</p>
    */
    @SerializedName("InEnableNum")
    @Expose
    private Long InEnableNum;

    /**
    * <p>出方向规则总数。</p>
    */
    @SerializedName("OutTotal")
    @Expose
    private Long OutTotal;

    /**
    * <p>出方向启用规则数。</p>
    */
    @SerializedName("OutEnableNum")
    @Expose
    private Long OutEnableNum;

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
     * Get <p>入方向规则总数。</p> 
     * @return InTotal <p>入方向规则总数。</p>
     */
    public Long getInTotal() {
        return this.InTotal;
    }

    /**
     * Set <p>入方向规则总数。</p>
     * @param InTotal <p>入方向规则总数。</p>
     */
    public void setInTotal(Long InTotal) {
        this.InTotal = InTotal;
    }

    /**
     * Get <p>入方向启用规则数。</p> 
     * @return InEnableNum <p>入方向启用规则数。</p>
     */
    public Long getInEnableNum() {
        return this.InEnableNum;
    }

    /**
     * Set <p>入方向启用规则数。</p>
     * @param InEnableNum <p>入方向启用规则数。</p>
     */
    public void setInEnableNum(Long InEnableNum) {
        this.InEnableNum = InEnableNum;
    }

    /**
     * Get <p>出方向规则总数。</p> 
     * @return OutTotal <p>出方向规则总数。</p>
     */
    public Long getOutTotal() {
        return this.OutTotal;
    }

    /**
     * Set <p>出方向规则总数。</p>
     * @param OutTotal <p>出方向规则总数。</p>
     */
    public void setOutTotal(Long OutTotal) {
        this.OutTotal = OutTotal;
    }

    /**
     * Get <p>出方向启用规则数。</p> 
     * @return OutEnableNum <p>出方向启用规则数。</p>
     */
    public Long getOutEnableNum() {
        return this.OutEnableNum;
    }

    /**
     * Set <p>出方向启用规则数。</p>
     * @param OutEnableNum <p>出方向启用规则数。</p>
     */
    public void setOutEnableNum(Long OutEnableNum) {
        this.OutEnableNum = OutEnableNum;
    }

    public OverviewCommonRuleQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewCommonRuleQuotaDetail(OverviewCommonRuleQuotaDetail source) {
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
        if (source.InTotal != null) {
            this.InTotal = new Long(source.InTotal);
        }
        if (source.InEnableNum != null) {
            this.InEnableNum = new Long(source.InEnableNum);
        }
        if (source.OutTotal != null) {
            this.OutTotal = new Long(source.OutTotal);
        }
        if (source.OutEnableNum != null) {
            this.OutEnableNum = new Long(source.OutEnableNum);
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
        this.setParamSimple(map, prefix + "InTotal", this.InTotal);
        this.setParamSimple(map, prefix + "InEnableNum", this.InEnableNum);
        this.setParamSimple(map, prefix + "OutTotal", this.OutTotal);
        this.setParamSimple(map, prefix + "OutEnableNum", this.OutEnableNum);

    }
}

