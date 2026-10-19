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
    * <p>展示文案（已渲染为最终文案）</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>样式主题</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_THEME_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_THEME_INFO</td><td>1</td><td>信息（蓝色）</td></tr><tr><td>MODEL_BADGE_THEME_SUCCESS</td><td>2</td><td>成功（绿色）</td></tr><tr><td>MODEL_BADGE_THEME_WARNING</td><td>3</td><td>警告（橙色）</td></tr><tr><td>MODEL_BADGE_THEME_DANGER</td><td>4</td><td>危险（红色）</td></tr></table>
    */
    @SerializedName("Theme")
    @Expose
    private Long Theme;

    /**
    * <p>tooltip 文案（已渲染为最终文案），为空则不展示</p>
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * <p>徽章类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_TYPE_FREE_TRIAL</td><td>1</td><td>限时免费</td></tr><tr><td>MODEL_BADGE_TYPE_DEPRECATING</td><td>2</td><td>即将下线</td></tr><tr><td>MODEL_BADGE_TYPE_NEW</td><td>3</td><td>新模型</td></tr><tr><td>MODEL_BADGE_TYPE_HOT</td><td>4</td><td>热门</td></tr></table>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>展示文案（已渲染为最终文案）</p> 
     * @return Text <p>展示文案（已渲染为最终文案）</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>展示文案（已渲染为最终文案）</p>
     * @param Text <p>展示文案（已渲染为最终文案）</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>样式主题</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_THEME_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_THEME_INFO</td><td>1</td><td>信息（蓝色）</td></tr><tr><td>MODEL_BADGE_THEME_SUCCESS</td><td>2</td><td>成功（绿色）</td></tr><tr><td>MODEL_BADGE_THEME_WARNING</td><td>3</td><td>警告（橙色）</td></tr><tr><td>MODEL_BADGE_THEME_DANGER</td><td>4</td><td>危险（红色）</td></tr></table> 
     * @return Theme <p>样式主题</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_THEME_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_THEME_INFO</td><td>1</td><td>信息（蓝色）</td></tr><tr><td>MODEL_BADGE_THEME_SUCCESS</td><td>2</td><td>成功（绿色）</td></tr><tr><td>MODEL_BADGE_THEME_WARNING</td><td>3</td><td>警告（橙色）</td></tr><tr><td>MODEL_BADGE_THEME_DANGER</td><td>4</td><td>危险（红色）</td></tr></table>
     */
    public Long getTheme() {
        return this.Theme;
    }

    /**
     * Set <p>样式主题</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_THEME_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_THEME_INFO</td><td>1</td><td>信息（蓝色）</td></tr><tr><td>MODEL_BADGE_THEME_SUCCESS</td><td>2</td><td>成功（绿色）</td></tr><tr><td>MODEL_BADGE_THEME_WARNING</td><td>3</td><td>警告（橙色）</td></tr><tr><td>MODEL_BADGE_THEME_DANGER</td><td>4</td><td>危险（红色）</td></tr></table>
     * @param Theme <p>样式主题</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_THEME_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_THEME_INFO</td><td>1</td><td>信息（蓝色）</td></tr><tr><td>MODEL_BADGE_THEME_SUCCESS</td><td>2</td><td>成功（绿色）</td></tr><tr><td>MODEL_BADGE_THEME_WARNING</td><td>3</td><td>警告（橙色）</td></tr><tr><td>MODEL_BADGE_THEME_DANGER</td><td>4</td><td>危险（红色）</td></tr></table>
     */
    public void setTheme(Long Theme) {
        this.Theme = Theme;
    }

    /**
     * Get <p>tooltip 文案（已渲染为最终文案），为空则不展示</p> 
     * @return Tips <p>tooltip 文案（已渲染为最终文案），为空则不展示</p>
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set <p>tooltip 文案（已渲染为最终文案），为空则不展示</p>
     * @param Tips <p>tooltip 文案（已渲染为最终文案），为空则不展示</p>
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get <p>徽章类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_TYPE_FREE_TRIAL</td><td>1</td><td>限时免费</td></tr><tr><td>MODEL_BADGE_TYPE_DEPRECATING</td><td>2</td><td>即将下线</td></tr><tr><td>MODEL_BADGE_TYPE_NEW</td><td>3</td><td>新模型</td></tr><tr><td>MODEL_BADGE_TYPE_HOT</td><td>4</td><td>热门</td></tr></table> 
     * @return Type <p>徽章类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_TYPE_FREE_TRIAL</td><td>1</td><td>限时免费</td></tr><tr><td>MODEL_BADGE_TYPE_DEPRECATING</td><td>2</td><td>即将下线</td></tr><tr><td>MODEL_BADGE_TYPE_NEW</td><td>3</td><td>新模型</td></tr><tr><td>MODEL_BADGE_TYPE_HOT</td><td>4</td><td>热门</td></tr></table>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>徽章类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_TYPE_FREE_TRIAL</td><td>1</td><td>限时免费</td></tr><tr><td>MODEL_BADGE_TYPE_DEPRECATING</td><td>2</td><td>即将下线</td></tr><tr><td>MODEL_BADGE_TYPE_NEW</td><td>3</td><td>新模型</td></tr><tr><td>MODEL_BADGE_TYPE_HOT</td><td>4</td><td>热门</td></tr></table>
     * @param Type <p>徽章类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_BADGE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_BADGE_TYPE_FREE_TRIAL</td><td>1</td><td>限时免费</td></tr><tr><td>MODEL_BADGE_TYPE_DEPRECATING</td><td>2</td><td>即将下线</td></tr><tr><td>MODEL_BADGE_TYPE_NEW</td><td>3</td><td>新模型</td></tr><tr><td>MODEL_BADGE_TYPE_HOT</td><td>4</td><td>热门</td></tr></table>
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

