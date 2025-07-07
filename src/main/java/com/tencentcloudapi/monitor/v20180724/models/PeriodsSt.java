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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeriodsSt extends AbstractModel {

    /**
    * 周期
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 统计方式
    */
    @SerializedName("StatType")
    @Expose
    private String [] StatType;

    /**
     * Get 周期 
     * @return Period 周期
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 周期
     * @param Period 周期
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 统计方式 
     * @return StatType 统计方式
     */
    public String [] getStatType() {
        return this.StatType;
    }

    /**
     * Set 统计方式
     * @param StatType 统计方式
     */
    public void setStatType(String [] StatType) {
        this.StatType = StatType;
    }

    public PeriodsSt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeriodsSt(PeriodsSt source) {
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.StatType != null) {
            this.StatType = new String[source.StatType.length];
            for (int i = 0; i < source.StatType.length; i++) {
                this.StatType[i] = new String(source.StatType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "StatType.", this.StatType);

    }
}

