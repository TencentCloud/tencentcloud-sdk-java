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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldOption extends AbstractModel {

    /**
    * 字段展示值
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 字段存储值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 字段展示值 
     * @return Text 字段展示值
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 字段展示值
     * @param Text 字段展示值
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 字段存储值 
     * @return Value 字段存储值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 字段存储值
     * @param Value 字段存储值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public FieldOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldOption(FieldOption source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

