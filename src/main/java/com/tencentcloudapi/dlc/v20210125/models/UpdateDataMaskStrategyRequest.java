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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDataMaskStrategyRequest extends AbstractModel {

    /**
    * 数据脱敏策略详情
    */
    @SerializedName("Strategy")
    @Expose
    private DataMaskStrategyInfo Strategy;

    /**
     * Get 数据脱敏策略详情 
     * @return Strategy 数据脱敏策略详情
     */
    public DataMaskStrategyInfo getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 数据脱敏策略详情
     * @param Strategy 数据脱敏策略详情
     */
    public void setStrategy(DataMaskStrategyInfo Strategy) {
        this.Strategy = Strategy;
    }

    public UpdateDataMaskStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataMaskStrategyRequest(UpdateDataMaskStrategyRequest source) {
        if (source.Strategy != null) {
            this.Strategy = new DataMaskStrategyInfo(source.Strategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Strategy.", this.Strategy);

    }
}

