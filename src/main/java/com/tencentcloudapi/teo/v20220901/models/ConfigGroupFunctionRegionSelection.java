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

public class ConfigGroupFunctionRegionSelection extends AbstractModel {

    /**
    * <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * <p>国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：<a href="https://cloud.tencent.com/document/product/1552/112542">国家/地区及对应代码枚举</a>。</p>
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p> 
     * @return Function <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     * @param Function <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get <p>国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：<a href="https://cloud.tencent.com/document/product/1552/112542">国家/地区及对应代码枚举</a>。</p> 
     * @return Regions <p>国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：<a href="https://cloud.tencent.com/document/product/1552/112542">国家/地区及对应代码枚举</a>。</p>
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：<a href="https://cloud.tencent.com/document/product/1552/112542">国家/地区及对应代码枚举</a>。</p>
     * @param Regions <p>国家/地区列表。示例值：CN：中国，CN.GD：中国广东。取值请参考：<a href="https://cloud.tencent.com/document/product/1552/112542">国家/地区及对应代码枚举</a>。</p>
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    public ConfigGroupFunctionRegionSelection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupFunctionRegionSelection(ConfigGroupFunctionRegionSelection source) {
        if (source.Function != null) {
            this.Function = new String(source.Function);
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
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

