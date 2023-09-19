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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeStyles extends AbstractModel{

    /**
    * 样式 Id，用于和轨道元素中的样式关联。
注意：允许字母、数字、-、_ 组合，最长 32 字符。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 样式类型，取值有：
<li>Subtitle：字幕样式。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字幕样式信息，当 Type = Subtitle 时有效。
    */
    @SerializedName("Subtitle")
    @Expose
    private ComposeSubtitleStyle Subtitle;

    /**
     * Get 样式 Id，用于和轨道元素中的样式关联。
注意：允许字母、数字、-、_ 组合，最长 32 字符。 
     * @return Id 样式 Id，用于和轨道元素中的样式关联。
注意：允许字母、数字、-、_ 组合，最长 32 字符。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 样式 Id，用于和轨道元素中的样式关联。
注意：允许字母、数字、-、_ 组合，最长 32 字符。
     * @param Id 样式 Id，用于和轨道元素中的样式关联。
注意：允许字母、数字、-、_ 组合，最长 32 字符。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 样式类型，取值有：
<li>Subtitle：字幕样式。</li> 
     * @return Type 样式类型，取值有：
<li>Subtitle：字幕样式。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 样式类型，取值有：
<li>Subtitle：字幕样式。</li>
     * @param Type 样式类型，取值有：
<li>Subtitle：字幕样式。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字幕样式信息，当 Type = Subtitle 时有效。 
     * @return Subtitle 字幕样式信息，当 Type = Subtitle 时有效。
     */
    public ComposeSubtitleStyle getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set 字幕样式信息，当 Type = Subtitle 时有效。
     * @param Subtitle 字幕样式信息，当 Type = Subtitle 时有效。
     */
    public void setSubtitle(ComposeSubtitleStyle Subtitle) {
        this.Subtitle = Subtitle;
    }

    public ComposeStyles() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeStyles(ComposeStyles source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new ComposeSubtitleStyle(source.Subtitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);

    }
}

