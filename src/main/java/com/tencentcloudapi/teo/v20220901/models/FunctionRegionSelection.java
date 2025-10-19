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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionRegionSelection extends AbstractModel {

    /**
    * 函数 ID 。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：[国家/地区及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get 函数 ID 。 
     * @return FunctionId 函数 ID 。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID 。
     * @param FunctionId 函数 ID 。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：[国家/地区及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。 
     * @return Regions 国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：[国家/地区及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：[国家/地区及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
     * @param Regions 国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：[国家/地区及对应代码枚举](https://cloud.tencent.com/document/product/1552/112542)。
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    public FunctionRegionSelection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionRegionSelection(FunctionRegionSelection source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

