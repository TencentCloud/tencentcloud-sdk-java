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

public class ExportBaselineEffectHostListRequest extends AbstractModel{

    /**
    * 基线id
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * 筛选条件
<li>AliasName- String- 主机别名</li>
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
    * 基线名称
    */
    @SerializedName("BaselineName")
    @Expose
    private String BaselineName;

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
     * Get 筛选条件
<li>AliasName- String- 主机别名</li> 
     * @return Filters 筛选条件
<li>AliasName- String- 主机别名</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件
<li>AliasName- String- 主机别名</li>
     * @param Filters 筛选条件
<li>AliasName- String- 主机别名</li>
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

    /**
     * Get 基线名称 
     * @return BaselineName 基线名称
     */
    public String getBaselineName() {
        return this.BaselineName;
    }

    /**
     * Set 基线名称
     * @param BaselineName 基线名称
     */
    public void setBaselineName(String BaselineName) {
        this.BaselineName = BaselineName;
    }

    public ExportBaselineEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportBaselineEffectHostListRequest(ExportBaselineEffectHostListRequest source) {
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
        if (source.BaselineName != null) {
            this.BaselineName = new String(source.BaselineName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArraySimple(map, prefix + "UuidList.", this.UuidList);
        this.setParamSimple(map, prefix + "BaselineName", this.BaselineName);

    }
}

