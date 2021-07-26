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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanAssetRequest extends AbstractModel{

    /**
    * 资产指纹类型id列表
    */
    @SerializedName("AssetTypeIds")
    @Expose
    private Long [] AssetTypeIds;

    /**
    * Quuid列表
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 资产指纹类型id列表 
     * @return AssetTypeIds 资产指纹类型id列表
     */
    public Long [] getAssetTypeIds() {
        return this.AssetTypeIds;
    }

    /**
     * Set 资产指纹类型id列表
     * @param AssetTypeIds 资产指纹类型id列表
     */
    public void setAssetTypeIds(Long [] AssetTypeIds) {
        this.AssetTypeIds = AssetTypeIds;
    }

    /**
     * Get Quuid列表 
     * @return Quuids Quuid列表
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Quuid列表
     * @param Quuids Quuid列表
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public ScanAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanAssetRequest(ScanAssetRequest source) {
        if (source.AssetTypeIds != null) {
            this.AssetTypeIds = new Long[source.AssetTypeIds.length];
            for (int i = 0; i < source.AssetTypeIds.length; i++) {
                this.AssetTypeIds[i] = new Long(source.AssetTypeIds[i]);
            }
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetTypeIds.", this.AssetTypeIds);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

