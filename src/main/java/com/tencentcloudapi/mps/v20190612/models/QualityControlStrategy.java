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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlStrategy extends AbstractModel {

    /**
    * 策略类型。取值：
- TimeSpotCheck
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 根据时间的抽检策略。
    */
    @SerializedName("TimeSpotCheck")
    @Expose
    private TimeSpotCheck TimeSpotCheck;

    /**
     * Get 策略类型。取值：
- TimeSpotCheck 
     * @return StrategyType 策略类型。取值：
- TimeSpotCheck
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型。取值：
- TimeSpotCheck
     * @param StrategyType 策略类型。取值：
- TimeSpotCheck
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 根据时间的抽检策略。 
     * @return TimeSpotCheck 根据时间的抽检策略。
     */
    public TimeSpotCheck getTimeSpotCheck() {
        return this.TimeSpotCheck;
    }

    /**
     * Set 根据时间的抽检策略。
     * @param TimeSpotCheck 根据时间的抽检策略。
     */
    public void setTimeSpotCheck(TimeSpotCheck TimeSpotCheck) {
        this.TimeSpotCheck = TimeSpotCheck;
    }

    public QualityControlStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlStrategy(QualityControlStrategy source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.TimeSpotCheck != null) {
            this.TimeSpotCheck = new TimeSpotCheck(source.TimeSpotCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamObj(map, prefix + "TimeSpotCheck.", this.TimeSpotCheck);

    }
}

