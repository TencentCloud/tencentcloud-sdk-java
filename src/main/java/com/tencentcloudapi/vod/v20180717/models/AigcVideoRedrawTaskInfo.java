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

public class AigcVideoRedrawTaskInfo extends AbstractModel {

    /**
    * <p>用于描述转绘风格。限制50字符。</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
     * Get <p>用于描述转绘风格。限制50字符。</p> 
     * @return Style <p>用于描述转绘风格。限制50字符。</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>用于描述转绘风格。限制50字符。</p>
     * @param Style <p>用于描述转绘风格。限制50字符。</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    public AigcVideoRedrawTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoRedrawTaskInfo(AigcVideoRedrawTaskInfo source) {
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

