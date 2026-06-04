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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelBadge extends AbstractModel {

    /**
    * 展示文案
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 样式主题。1-信息（蓝色）, 2-成功（绿色）, 3-警告（橙色）, 4-危险（红色）
    */
    @SerializedName("Theme")
    @Expose
    private Long Theme;

    /**
    * tooltip文案，为空则不展示
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * 徽章类型。1-限时免费, 2-即将下线, 3-新模型, 4-热门
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 展示文案 
     * @return Text 展示文案
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 展示文案
     * @param Text 展示文案
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 样式主题。1-信息（蓝色）, 2-成功（绿色）, 3-警告（橙色）, 4-危险（红色） 
     * @return Theme 样式主题。1-信息（蓝色）, 2-成功（绿色）, 3-警告（橙色）, 4-危险（红色）
     */
    public Long getTheme() {
        return this.Theme;
    }

    /**
     * Set 样式主题。1-信息（蓝色）, 2-成功（绿色）, 3-警告（橙色）, 4-危险（红色）
     * @param Theme 样式主题。1-信息（蓝色）, 2-成功（绿色）, 3-警告（橙色）, 4-危险（红色）
     */
    public void setTheme(Long Theme) {
        this.Theme = Theme;
    }

    /**
     * Get tooltip文案，为空则不展示 
     * @return Tips tooltip文案，为空则不展示
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set tooltip文案，为空则不展示
     * @param Tips tooltip文案，为空则不展示
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get 徽章类型。1-限时免费, 2-即将下线, 3-新模型, 4-热门 
     * @return Type 徽章类型。1-限时免费, 2-即将下线, 3-新模型, 4-热门
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 徽章类型。1-限时免费, 2-即将下线, 3-新模型, 4-热门
     * @param Type 徽章类型。1-限时免费, 2-即将下线, 3-新模型, 4-热门
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModelBadge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelBadge(ModelBadge source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Theme != null) {
            this.Theme = new Long(source.Theme);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Theme", this.Theme);
        this.setParamSimple(map, prefix + "Tips", this.Tips);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

