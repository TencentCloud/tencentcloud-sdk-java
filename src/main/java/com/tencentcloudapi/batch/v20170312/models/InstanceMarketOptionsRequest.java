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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceMarketOptionsRequest extends AbstractModel{

    /**
    * 竞价相关选项
    */
    @SerializedName("SpotOptions")
    @Expose
    private SpotMarketOptions SpotOptions;

    /**
    * 市场选项类型，当前只支持取值：spot
    */
    @SerializedName("MarketType")
    @Expose
    private String MarketType;

    /**
     * Get 竞价相关选项 
     * @return SpotOptions 竞价相关选项
     */
    public SpotMarketOptions getSpotOptions() {
        return this.SpotOptions;
    }

    /**
     * Set 竞价相关选项
     * @param SpotOptions 竞价相关选项
     */
    public void setSpotOptions(SpotMarketOptions SpotOptions) {
        this.SpotOptions = SpotOptions;
    }

    /**
     * Get 市场选项类型，当前只支持取值：spot 
     * @return MarketType 市场选项类型，当前只支持取值：spot
     */
    public String getMarketType() {
        return this.MarketType;
    }

    /**
     * Set 市场选项类型，当前只支持取值：spot
     * @param MarketType 市场选项类型，当前只支持取值：spot
     */
    public void setMarketType(String MarketType) {
        this.MarketType = MarketType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SpotOptions.", this.SpotOptions);
        this.setParamSimple(map, prefix + "MarketType", this.MarketType);

    }
}

