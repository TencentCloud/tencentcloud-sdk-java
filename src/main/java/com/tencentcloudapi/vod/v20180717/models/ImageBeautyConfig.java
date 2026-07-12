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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageBeautyConfig extends AbstractModel {

    /**
    * <p>美颜效果项。</p>
    */
    @SerializedName("BeautyEffectItems")
    @Expose
    private BeautyEffectItem [] BeautyEffectItems;

    /**
    * <p>美颜滤镜项。</p>
    */
    @SerializedName("BeautyFilterItems")
    @Expose
    private BeautyFilterItem [] BeautyFilterItems;

    /**
     * Get <p>美颜效果项。</p> 
     * @return BeautyEffectItems <p>美颜效果项。</p>
     */
    public BeautyEffectItem [] getBeautyEffectItems() {
        return this.BeautyEffectItems;
    }

    /**
     * Set <p>美颜效果项。</p>
     * @param BeautyEffectItems <p>美颜效果项。</p>
     */
    public void setBeautyEffectItems(BeautyEffectItem [] BeautyEffectItems) {
        this.BeautyEffectItems = BeautyEffectItems;
    }

    /**
     * Get <p>美颜滤镜项。</p> 
     * @return BeautyFilterItems <p>美颜滤镜项。</p>
     */
    public BeautyFilterItem [] getBeautyFilterItems() {
        return this.BeautyFilterItems;
    }

    /**
     * Set <p>美颜滤镜项。</p>
     * @param BeautyFilterItems <p>美颜滤镜项。</p>
     */
    public void setBeautyFilterItems(BeautyFilterItem [] BeautyFilterItems) {
        this.BeautyFilterItems = BeautyFilterItems;
    }

    public ImageBeautyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageBeautyConfig(ImageBeautyConfig source) {
        if (source.BeautyEffectItems != null) {
            this.BeautyEffectItems = new BeautyEffectItem[source.BeautyEffectItems.length];
            for (int i = 0; i < source.BeautyEffectItems.length; i++) {
                this.BeautyEffectItems[i] = new BeautyEffectItem(source.BeautyEffectItems[i]);
            }
        }
        if (source.BeautyFilterItems != null) {
            this.BeautyFilterItems = new BeautyFilterItem[source.BeautyFilterItems.length];
            for (int i = 0; i < source.BeautyFilterItems.length; i++) {
                this.BeautyFilterItems[i] = new BeautyFilterItem(source.BeautyFilterItems[i]);
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

