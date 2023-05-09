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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterDataObject extends AbstractModel{

    /**
    * 英文翻译
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 中文翻译
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 英文翻译 
     * @return Value 英文翻译
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 英文翻译
     * @param Value 英文翻译
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 中文翻译 
     * @return Text 中文翻译
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 中文翻译
     * @param Text 中文翻译
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public FilterDataObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterDataObject(FilterDataObject source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

