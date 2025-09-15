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

public class BeautyConfig extends AbstractModel {

    /**
    * 美颜效果
    */
    @SerializedName("BeautyEffectItems")
    @Expose
    private BeautyEffectItemConfig [] BeautyEffectItems;

    /**
    * 美颜滤镜
    */
    @SerializedName("BeautyFilterItems")
    @Expose
    private BeautyFilterItemConfig [] BeautyFilterItems;

    /**
     * Get 美颜效果 
     * @return BeautyEffectItems 美颜效果
     */
    public BeautyEffectItemConfig [] getBeautyEffectItems() {
        return this.BeautyEffectItems;
    }

    /**
     * Set 美颜效果
     * @param BeautyEffectItems 美颜效果
     */
    public void setBeautyEffectItems(BeautyEffectItemConfig [] BeautyEffectItems) {
        this.BeautyEffectItems = BeautyEffectItems;
    }

    /**
     * Get 美颜滤镜 
     * @return BeautyFilterItems 美颜滤镜
     */
    public BeautyFilterItemConfig [] getBeautyFilterItems() {
        return this.BeautyFilterItems;
    }

    /**
     * Set 美颜滤镜
     * @param BeautyFilterItems 美颜滤镜
     */
    public void setBeautyFilterItems(BeautyFilterItemConfig [] BeautyFilterItems) {
        this.BeautyFilterItems = BeautyFilterItems;
    }

    public BeautyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautyConfig(BeautyConfig source) {
        if (source.BeautyEffectItems != null) {
            this.BeautyEffectItems = new BeautyEffectItemConfig[source.BeautyEffectItems.length];
            for (int i = 0; i < source.BeautyEffectItems.length; i++) {
                this.BeautyEffectItems[i] = new BeautyEffectItemConfig(source.BeautyEffectItems[i]);
            }
        }
        if (source.BeautyFilterItems != null) {
            this.BeautyFilterItems = new BeautyFilterItemConfig[source.BeautyFilterItems.length];
            for (int i = 0; i < source.BeautyFilterItems.length; i++) {
                this.BeautyFilterItems[i] = new BeautyFilterItemConfig(source.BeautyFilterItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BeautyEffectItems.", this.BeautyEffectItems);
        this.setParamArrayObj(map, prefix + "BeautyFilterItems.", this.BeautyFilterItems);

    }
}

