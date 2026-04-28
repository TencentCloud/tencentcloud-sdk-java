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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelValue extends AbstractModel {

    /**
    * 标签名称
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 标签的颜色
    */
    @SerializedName("LabelColor")
    @Expose
    private String LabelColor;

    /**
     * Get 标签名称 
     * @return LabelName 标签名称
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称
     * @param LabelName 标签名称
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 标签的颜色 
     * @return LabelColor 标签的颜色
     */
    public String getLabelColor() {
        return this.LabelColor;
    }

    /**
     * Set 标签的颜色
     * @param LabelColor 标签的颜色
     */
    public void setLabelColor(String LabelColor) {
        this.LabelColor = LabelColor;
    }

    public LabelValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelValue(LabelValue source) {
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelColor != null) {
            this.LabelColor = new String(source.LabelColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelColor", this.LabelColor);

    }
}

