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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineEffectHostListRequest extends AbstractModel{

    /**
    * 分页参数 最大100条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 基线id
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * 过滤条件。
<li>AliasName- String- 主机别名</li>
<li>Status- Uint- 1已通过  0未通过 5检测中</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 主机uuid数组
    */
    @SerializedName("UuidList")
    @Expose
    private String [] UuidList;

    /**
     * Get 分页参数 最大100条 
     * @return Limit 分页参数 最大100条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数 最大100条
     * @param Limit 分页参数 最大100条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 基线id 
     * @return BaselineId 基线id
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set 基线id
     * @param BaselineId 基线id
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
    }

    /**
     * Get 过滤条件。
<li>AliasName- String- 主机别名</li>
<li>Status- Uint- 1已通过  0未通过 5检测中</li> 
     * @return Filters 过滤条件。
<li>AliasName- String- 主机别名</li>
<li>Status- Uint- 1已通过  0未通过 5检测中</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>AliasName- String- 主机别名</li>
<li>Status- Uint- 1已通过  0未通过 5检测中</li>
     * @param Filters 过滤条件。
<li>AliasName- String- 主机别名</li>
<li>Status- Uint- 1已通过  0未通过 5检测中</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 主机uuid数组 
     * @return UuidList 主机uuid数组
     */
    public String [] getUuidList() {
        return this.UuidList;
    }

    /**
     * Set 主机uuid数组
     * @param UuidList 主机uuid数组
     */
    public void setUuidList(String [] UuidList) {
        this.UuidList = UuidList;
    }

    public DescribeBaselineEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineEffectHostListRequest(DescribeBaselineEffectHostListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.UuidList != null) {
            this.UuidList = new String[source.UuidList.length];
            for (int i = 0; i < source.UuidList.length; i++) {
                this.UuidList[i] = new String(source.UuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArraySimple(map, prefix + "UuidList.", this.UuidList);

    }
}

