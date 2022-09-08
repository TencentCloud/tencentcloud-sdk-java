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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbZoneDataResult extends AbstractModel{

    /**
    * 售卖规格所有集合
    */
    @SerializedName("Configs")
    @Expose
    private CdbSellConfig [] Configs;

    /**
    * 售卖地域可用区集合
    */
    @SerializedName("Regions")
    @Expose
    private CdbRegionSellConf [] Regions;

    /**
     * Get 售卖规格所有集合 
     * @return Configs 售卖规格所有集合
     */
    public CdbSellConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set 售卖规格所有集合
     * @param Configs 售卖规格所有集合
     */
    public void setConfigs(CdbSellConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get 售卖地域可用区集合 
     * @return Regions 售卖地域可用区集合
     */
    public CdbRegionSellConf [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 售卖地域可用区集合
     * @param Regions 售卖地域可用区集合
     */
    public void setRegions(CdbRegionSellConf [] Regions) {
        this.Regions = Regions;
    }

    public CdbZoneDataResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbZoneDataResult(CdbZoneDataResult source) {
        if (source.Configs != null) {
            this.Configs = new CdbSellConfig[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new CdbSellConfig(source.Configs[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new CdbRegionSellConf[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new CdbRegionSellConf(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);

    }
}

