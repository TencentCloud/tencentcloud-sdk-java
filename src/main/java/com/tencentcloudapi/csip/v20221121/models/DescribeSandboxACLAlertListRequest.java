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

public class DescribeSandboxACLAlertListRequest extends AbstractModel {

    /**
    * 偏移量，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认 10，上限 200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件
支持的过滤项：
ID：按告警记录 ID 查询单条
BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）
RuleName：按命中规则名称搜索
RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）
InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）
InstanceName：按资产实例名模糊搜索，多个值之间为"或"关系
Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 偏移量，默认 0 
     * @return Offset 偏移量，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认 0
     * @param Offset 偏移量，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认 10，上限 200 
     * @return Limit 每页数量，默认 10，上限 200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认 10，上限 200
     * @param Limit 每页数量，默认 10，上限 200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件
支持的过滤项：
ID：按告警记录 ID 查询单条
BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）
RuleName：按命中规则名称搜索
RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）
InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）
InstanceName：按资产实例名模糊搜索，多个值之间为"或"关系
Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截） 
     * @return Filters 过滤条件
支持的过滤项：
ID：按告警记录 ID 查询单条
BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）
RuleName：按命中规则名称搜索
RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）
InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）
InstanceName：按资产实例名模糊搜索，多个值之间为"或"关系
Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
支持的过滤项：
ID：按告警记录 ID 查询单条
BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）
RuleName：按命中规则名称搜索
RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）
InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）
InstanceName：按资产实例名模糊搜索，多个值之间为"或"关系
Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）
     * @param Filters 过滤条件
支持的过滤项：
ID：按告警记录 ID 查询单条
BelongAssetType：归属资产类型，可选值：HOST（主机） / CONTAINER（容器）
RuleName：按命中规则名称搜索
RuleAction：命中动作，可选值：PASS（加白） / BLOCK（拦截并告警） / MONITOR（告警）
InstanceId：按资产实例 ID 精确过滤（用于资产详情页查看该资产的告警列表等场景）
InstanceName：按资产实例名模糊搜索，多个值之间为"或"关系
Status：处理状态，可选值：PENDING（未处理） / HANDLED（已处理） / IGNORE（已忽略） / PASS（已加白） / BLOCK（已拦截）
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSandboxACLAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSandboxACLAlertListRequest(DescribeSandboxACLAlertListRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

