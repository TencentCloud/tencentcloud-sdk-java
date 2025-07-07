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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SavingPlanCoverageRate extends AbstractModel {

    /**
    * 聚合时间维度，按天聚合格式为yyyy-MM-dd，按月聚合格式为yyyy-MM
    */
    @SerializedName("DatePoint")
    @Expose
    private String DatePoint;

    /**
    * 覆盖率结果，取值[0, 100]
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
     * Get 聚合时间维度，按天聚合格式为yyyy-MM-dd，按月聚合格式为yyyy-MM 
     * @return DatePoint 聚合时间维度，按天聚合格式为yyyy-MM-dd，按月聚合格式为yyyy-MM
     */
    public String getDatePoint() {
        return this.DatePoint;
    }

    /**
     * Set 聚合时间维度，按天聚合格式为yyyy-MM-dd，按月聚合格式为yyyy-MM
     * @param DatePoint 聚合时间维度，按天聚合格式为yyyy-MM-dd，按月聚合格式为yyyy-MM
     */
    public void setDatePoint(String DatePoint) {
        this.DatePoint = DatePoint;
    }

    /**
     * Get 覆盖率结果，取值[0, 100] 
     * @return Rate 覆盖率结果，取值[0, 100]
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set 覆盖率结果，取值[0, 100]
     * @param Rate 覆盖率结果，取值[0, 100]
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    public SavingPlanCoverageRate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SavingPlanCoverageRate(SavingPlanCoverageRate source) {
        if (source.DatePoint != null) {
            this.DatePoint = new String(source.DatePoint);
        }
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatePoint", this.DatePoint);
        this.setParamSimple(map, prefix + "Rate", this.Rate);

    }
}

