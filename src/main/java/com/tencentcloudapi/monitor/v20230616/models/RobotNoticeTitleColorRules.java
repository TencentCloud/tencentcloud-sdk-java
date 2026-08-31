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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RobotNoticeTitleColorRules extends AbstractModel {

    /**
    * <p>通知内容模版自定义颜色 Label 匹配的 Key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>通知内容模版自定义颜色 Label 匹配的 Value</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>通知内容模版自定义颜色</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
     * Get <p>通知内容模版自定义颜色 Label 匹配的 Key</p> 
     * @return Key <p>通知内容模版自定义颜色 Label 匹配的 Key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>通知内容模版自定义颜色 Label 匹配的 Key</p>
     * @param Key <p>通知内容模版自定义颜色 Label 匹配的 Key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>通知内容模版自定义颜色 Label 匹配的 Value</p> 
     * @return Value <p>通知内容模版自定义颜色 Label 匹配的 Value</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>通知内容模版自定义颜色 Label 匹配的 Value</p>
     * @param Value <p>通知内容模版自定义颜色 Label 匹配的 Value</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>通知内容模版自定义颜色</p> 
     * @return Color <p>通知内容模版自定义颜色</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>通知内容模版自定义颜色</p>
     * @param Color <p>通知内容模版自定义颜色</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    public RobotNoticeTitleColorRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RobotNoticeTitleColorRules(RobotNoticeTitleColorRules source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

