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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanBaselineRequest extends AbstractModel {

    /**
    * 策略id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
    */
    @SerializedName("StrategyIdList")
    @Expose
    private Long [] StrategyIdList;

    /**
    * 基线id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
    */
    @SerializedName("CategoryIdList")
    @Expose
    private Long [] CategoryIdList;

    /**
    * 检测项id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
    */
    @SerializedName("RuleIdList")
    @Expose
    private Long [] RuleIdList;

    /**
    * 选择StrategyIdList时，不需要填写，其他情况必填
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * 主机Uuid数组
    */
    @SerializedName("UuidList")
    @Expose
    private String [] UuidList;

    /**
     * Get 策略id数组(StrategyIdList与CategoryIdList和RuleIdList三选一) 
     * @return StrategyIdList 策略id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     */
    public Long [] getStrategyIdList() {
        return this.StrategyIdList;
    }

    /**
     * Set 策略id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     * @param StrategyIdList 策略id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     */
    public void setStrategyIdList(Long [] StrategyIdList) {
        this.StrategyIdList = StrategyIdList;
    }

    /**
     * Get 基线id数组(StrategyIdList与CategoryIdList和RuleIdList三选一) 
     * @return CategoryIdList 基线id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     */
    public Long [] getCategoryIdList() {
        return this.CategoryIdList;
    }

    /**
     * Set 基线id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     * @param CategoryIdList 基线id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     */
    public void setCategoryIdList(Long [] CategoryIdList) {
        this.CategoryIdList = CategoryIdList;
    }

    /**
     * Get 检测项id数组(StrategyIdList与CategoryIdList和RuleIdList三选一) 
     * @return RuleIdList 检测项id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     */
    public Long [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 检测项id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     * @param RuleIdList 检测项id数组(StrategyIdList与CategoryIdList和RuleIdList三选一)
     */
    public void setRuleIdList(Long [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get 选择StrategyIdList时，不需要填写，其他情况必填 
     * @return QuuidList 选择StrategyIdList时，不需要填写，其他情况必填
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set 选择StrategyIdList时，不需要填写，其他情况必填
     * @param QuuidList 选择StrategyIdList时，不需要填写，其他情况必填
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get 主机Uuid数组 
     * @return UuidList 主机Uuid数组
     */
    public String [] getUuidList() {
        return this.UuidList;
    }

    /**
     * Set 主机Uuid数组
     * @param UuidList 主机Uuid数组
     */
    public void setUuidList(String [] UuidList) {
        this.UuidList = UuidList;
    }

    public ScanBaselineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanBaselineRequest(ScanBaselineRequest source) {
        if (source.StrategyIdList != null) {
            this.StrategyIdList = new Long[source.StrategyIdList.length];
            for (int i = 0; i < source.StrategyIdList.length; i++) {
                this.StrategyIdList[i] = new Long(source.StrategyIdList[i]);
            }
        }
        if (source.CategoryIdList != null) {
            this.CategoryIdList = new Long[source.CategoryIdList.length];
            for (int i = 0; i < source.CategoryIdList.length; i++) {
                this.CategoryIdList[i] = new Long(source.CategoryIdList[i]);
            }
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new Long[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new Long(source.RuleIdList[i]);
            }
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "StrategyIdList.", this.StrategyIdList);
        this.setParamArraySimple(map, prefix + "CategoryIdList.", this.CategoryIdList);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamArraySimple(map, prefix + "UuidList.", this.UuidList);

    }
}

