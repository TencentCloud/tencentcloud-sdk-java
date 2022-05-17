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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedSupportedZonesRequest extends AbstractModel{

    /**
    * 传入region列表
    */
    @SerializedName("Regions")
    @Expose
    private Long [] Regions;

    /**
     * Get 传入region列表 
     * @return Regions 传入region列表
     */
    public Long [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 传入region列表
     * @param Regions 传入region列表
     */
    public void setRegions(Long [] Regions) {
        this.Regions = Regions;
    }

    public DescribeDedicatedSupportedZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedSupportedZonesRequest(DescribeDedicatedSupportedZonesRequest source) {
        if (source.Regions != null) {
            this.Regions = new Long[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new Long(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

