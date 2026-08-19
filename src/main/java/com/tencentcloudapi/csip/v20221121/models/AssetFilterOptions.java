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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetFilterOptions extends AbstractModel {

    /**
    * <p>显示值</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>实际值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>样式</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
     * Get <p>显示值</p> 
     * @return Text <p>显示值</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>显示值</p>
     * @param Text <p>显示值</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>实际值</p> 
     * @return Value <p>实际值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>实际值</p>
     * @param Value <p>实际值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>样式</p> 
     * @return Style <p>样式</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>样式</p>
     * @param Style <p>样式</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    public AssetFilterOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetFilterOptions(AssetFilterOptions source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

