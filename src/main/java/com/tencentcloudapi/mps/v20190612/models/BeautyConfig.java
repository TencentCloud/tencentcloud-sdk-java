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
    * <p>美颜效果</p>
    */
    @SerializedName("BeautyEffectItems")
    @Expose
    private BeautyEffectItemConfig [] BeautyEffectItems;

    /**
    * <p>美颜滤镜</p>
    */
    @SerializedName("BeautyFilterItems")
    @Expose
    private BeautyFilterItemConfig [] BeautyFilterItems;

    /**
    * <p>美颜类型</p><p>枚举值：</p><ul><li>auto： 智能自动美颜</li></ul><p>传入美颜参数时，忽略该参数。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>美颜效果</p> 
     * @return BeautyEffectItems <p>美颜效果</p>
     */
    public BeautyEffectItemConfig [] getBeautyEffectItems() {
        return this.BeautyEffectItems;
    }

    /**
     * Set <p>美颜效果</p>
     * @param BeautyEffectItems <p>美颜效果</p>
     */
    public void setBeautyEffectItems(BeautyEffectItemConfig [] BeautyEffectItems) {
        this.BeautyEffectItems = BeautyEffectItems;
    }

    /**
     * Get <p>美颜滤镜</p> 
     * @return BeautyFilterItems <p>美颜滤镜</p>
     */
    public BeautyFilterItemConfig [] getBeautyFilterItems() {
        return this.BeautyFilterItems;
    }

    /**
     * Set <p>美颜滤镜</p>
     * @param BeautyFilterItems <p>美颜滤镜</p>
     */
    public void setBeautyFilterItems(BeautyFilterItemConfig [] BeautyFilterItems) {
        this.BeautyFilterItems = BeautyFilterItems;
    }

    /**
     * Get <p>美颜类型</p><p>枚举值：</p><ul><li>auto： 智能自动美颜</li></ul><p>传入美颜参数时，忽略该参数。</p> 
     * @return Type <p>美颜类型</p><p>枚举值：</p><ul><li>auto： 智能自动美颜</li></ul><p>传入美颜参数时，忽略该参数。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>美颜类型</p><p>枚举值：</p><ul><li>auto： 智能自动美颜</li></ul><p>传入美颜参数时，忽略该参数。</p>
     * @param Type <p>美颜类型</p><p>枚举值：</p><ul><li>auto： 智能自动美颜</li></ul><p>传入美颜参数时，忽略该参数。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BeautyEffectItems.", this.BeautyEffectItems);
        this.setParamArrayObj(map, prefix + "BeautyFilterItems.", this.BeautyFilterItems);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

