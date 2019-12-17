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

public class SpotMarketOptions extends AbstractModel{

    /**
    * 竞价出价
    */
    @SerializedName("MaxPrice")
    @Expose
    private String MaxPrice;

    /**
    * 竞价请求类型，当前仅支持类型：one-time
    */
    @SerializedName("SpotInstanceType")
    @Expose
    private String SpotInstanceType;

    /**
     * Get 竞价出价 
     * @return MaxPrice 竞价出价
     */
    public String getMaxPrice() {
        return this.MaxPrice;
    }

    /**
     * Set 竞价出价
     * @param MaxPrice 竞价出价
     */
    public void setMaxPrice(String MaxPrice) {
        this.MaxPrice = MaxPrice;
    }

    /**
     * Get 竞价请求类型，当前仅支持类型：one-time 
     * @return SpotInstanceType 竞价请求类型，当前仅支持类型：one-time
     */
    public String getSpotInstanceType() {
        return this.SpotInstanceType;
    }

    /**
     * Set 竞价请求类型，当前仅支持类型：one-time
     * @param SpotInstanceType 竞价请求类型，当前仅支持类型：one-time
     */
    public void setSpotInstanceType(String SpotInstanceType) {
        this.SpotInstanceType = SpotInstanceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxPrice", this.MaxPrice);
        this.setParamSimple(map, prefix + "SpotInstanceType", this.SpotInstanceType);

    }
}

