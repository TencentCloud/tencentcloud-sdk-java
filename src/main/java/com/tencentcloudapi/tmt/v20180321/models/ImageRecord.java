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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRecord extends AbstractModel {

    /**
    * 图片翻译结果
    */
    @SerializedName("Value")
    @Expose
    private ItemValue [] Value;

    /**
     * Get 图片翻译结果 
     * @return Value 图片翻译结果
     */
    public ItemValue [] getValue() {
        return this.Value;
    }

    /**
     * Set 图片翻译结果
     * @param Value 图片翻译结果
     */
    public void setValue(ItemValue [] Value) {
        this.Value = Value;
    }

    public ImageRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRecord(ImageRecord source) {
        if (source.Value != null) {
            this.Value = new ItemValue[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new ItemValue(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Value.", this.Value);

    }
}

