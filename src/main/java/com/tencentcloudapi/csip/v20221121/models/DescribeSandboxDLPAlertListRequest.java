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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSandboxDLPAlertListRequest extends AbstractModel {

    /**
    * <p>偏移量，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，默认 10，上限 200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件<br>支持的过滤项：<br>ID：按告警记录 ID 查询单条<br>BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）<br>RuleName：按命中规则名称搜索<br>RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）<br>InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）<br>InstanceName：按资产实例名模糊搜索，多个值之间为&quot;或&quot;关系<br>Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>偏移量，默认 0</p> 
     * @return Offset <p>偏移量，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认 0</p>
     * @param Offset <p>偏移量，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，默认 10，上限 200</p> 
     * @return Limit <p>每页数量，默认 10，上限 200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认 10，上限 200</p>
     * @param Limit <p>每页数量，默认 10，上限 200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件<br>支持的过滤项：<br>ID：按告警记录 ID 查询单条<br>BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）<br>RuleName：按命中规则名称搜索<br>RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）<br>InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）<br>InstanceName：按资产实例名模糊搜索，多个值之间为&quot;或&quot;关系<br>Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）</p> 
     * @return Filters <p>过滤条件<br>支持的过滤项：<br>ID：按告警记录 ID 查询单条<br>BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）<br>RuleName：按命中规则名称搜索<br>RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）<br>InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）<br>InstanceName：按资产实例名模糊搜索，多个值之间为&quot;或&quot;关系<br>Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>支持的过滤项：<br>ID：按告警记录 ID 查询单条<br>BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）<br>RuleName：按命中规则名称搜索<br>RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）<br>InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）<br>InstanceName：按资产实例名模糊搜索，多个值之间为&quot;或&quot;关系<br>Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）</p>
     * @param Filters <p>过滤条件<br>支持的过滤项：<br>ID：按告警记录 ID 查询单条<br>BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）<br>RuleName：按命中规则名称搜索<br>RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）<br>InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）<br>InstanceName：按资产实例名模糊搜索，多个值之间为&quot;或&quot;关系<br>Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeSandboxDLPAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSandboxDLPAlertListRequest(DescribeSandboxDLPAlertListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

