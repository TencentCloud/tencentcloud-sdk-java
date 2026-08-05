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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThrottleRuleResult extends AbstractModel {

    /**
    * 总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 规则列表
    */
    @SerializedName("ThrottleRuleList")
    @Expose
    private ThrottleRuleDetail [] ThrottleRuleList;

    /**
     * Get 总数量 
     * @return TotalCount 总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
     * @param TotalCount 总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 规则列表 
     * @return ThrottleRuleList 规则列表
     */
    public ThrottleRuleDetail [] getThrottleRuleList() {
        return this.ThrottleRuleList;
    }

    /**
     * Set 规则列表
     * @param ThrottleRuleList 规则列表
     */
    public void setThrottleRuleList(ThrottleRuleDetail [] ThrottleRuleList) {
        this.ThrottleRuleList = ThrottleRuleList;
    }

    public ThrottleRuleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThrottleRuleResult(ThrottleRuleResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ThrottleRuleList != null) {
            this.ThrottleRuleList = new ThrottleRuleDetail[source.ThrottleRuleList.length];
            for (int i = 0; i < source.ThrottleRuleList.length; i++) {
                this.ThrottleRuleList[i] = new ThrottleRuleDetail(source.ThrottleRuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ThrottleRuleList.", this.ThrottleRuleList);

    }
}

