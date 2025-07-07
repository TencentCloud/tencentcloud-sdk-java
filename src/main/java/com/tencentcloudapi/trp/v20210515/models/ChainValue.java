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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChainValue extends AbstractModel {

    /**
    * 标题名字
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 类型，文字："text"，图片："image"
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 值，文字类型："abc"，图片类型：""/images/img.png"
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 标题名字 
     * @return Label 标题名字
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标题名字
     * @param Label 标题名字
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 类型，文字："text"，图片："image" 
     * @return Type 类型，文字："text"，图片："image"
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，文字："text"，图片："image"
     * @param Type 类型，文字："text"，图片："image"
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 值，文字类型："abc"，图片类型：""/images/img.png" 
     * @return Value 值，文字类型："abc"，图片类型：""/images/img.png"
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值，文字类型："abc"，图片类型：""/images/img.png"
     * @param Value 值，文字类型："abc"，图片类型：""/images/img.png"
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ChainValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChainValue(ChainValue source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

