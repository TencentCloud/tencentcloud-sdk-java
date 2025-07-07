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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShieldPlanInfo extends AbstractModel {

    /**
    * 加固策略数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 加固策略具体信息数组
    */
    @SerializedName("PlanSet")
    @Expose
    private PlanDetailInfo [] PlanSet;

    /**
     * Get 加固策略数量 
     * @return TotalCount 加固策略数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 加固策略数量
     * @param TotalCount 加固策略数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 加固策略具体信息数组 
     * @return PlanSet 加固策略具体信息数组
     */
    public PlanDetailInfo [] getPlanSet() {
        return this.PlanSet;
    }

    /**
     * Set 加固策略具体信息数组
     * @param PlanSet 加固策略具体信息数组
     */
    public void setPlanSet(PlanDetailInfo [] PlanSet) {
        this.PlanSet = PlanSet;
    }

    public ShieldPlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShieldPlanInfo(ShieldPlanInfo source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PlanSet != null) {
            this.PlanSet = new PlanDetailInfo[source.PlanSet.length];
            for (int i = 0; i < source.PlanSet.length; i++) {
                this.PlanSet[i] = new PlanDetailInfo(source.PlanSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PlanSet.", this.PlanSet);

    }
}

