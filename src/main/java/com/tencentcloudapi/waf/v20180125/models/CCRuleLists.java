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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCRuleLists extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 规则
    */
    @SerializedName("Res")
    @Expose
    private CCRuleItems [] Res;

    /**
    * 规则限制总数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 规则剩余多少可用
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 规则 
     * @return Res 规则
     */
    public CCRuleItems [] getRes() {
        return this.Res;
    }

    /**
     * Set 规则
     * @param Res 规则
     */
    public void setRes(CCRuleItems [] Res) {
        this.Res = Res;
    }

    /**
     * Get 规则限制总数 
     * @return Limit 规则限制总数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 规则限制总数
     * @param Limit 规则限制总数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 规则剩余多少可用 
     * @return Available 规则剩余多少可用
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 规则剩余多少可用
     * @param Available 规则剩余多少可用
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    public CCRuleLists() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCRuleLists(CCRuleLists source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Res != null) {
            this.Res = new CCRuleItems[source.Res.length];
            for (int i = 0; i < source.Res.length; i++) {
                this.Res[i] = new CCRuleItems(source.Res[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Res.", this.Res);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

