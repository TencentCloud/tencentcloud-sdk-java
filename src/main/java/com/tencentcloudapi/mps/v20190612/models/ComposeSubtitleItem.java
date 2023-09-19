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

public class ComposeSubtitleItem extends AbstractModel{

    /**
    * 字幕样式，Styles 列表中对应的 Subtitle样式的 ID。
    */
    @SerializedName("StyleId")
    @Expose
    private String StyleId;

    /**
    * 字幕文本。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。	
    */
    @SerializedName("TrackTime")
    @Expose
    private ComposeTrackTime TrackTime;

    /**
     * Get 字幕样式，Styles 列表中对应的 Subtitle样式的 ID。 
     * @return StyleId 字幕样式，Styles 列表中对应的 Subtitle样式的 ID。
     */
    public String getStyleId() {
        return this.StyleId;
    }

    /**
     * Set 字幕样式，Styles 列表中对应的 Subtitle样式的 ID。
     * @param StyleId 字幕样式，Styles 列表中对应的 Subtitle样式的 ID。
     */
    public void setStyleId(String StyleId) {
        this.StyleId = StyleId;
    }

    /**
     * Get 字幕文本。 
     * @return Text 字幕文本。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 字幕文本。
     * @param Text 字幕文本。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。	 
     * @return TrackTime 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。	
     */
    public ComposeTrackTime getTrackTime() {
        return this.TrackTime;
    }

    /**
     * Set 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。	
     * @param TrackTime 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。	
     */
    public void setTrackTime(ComposeTrackTime TrackTime) {
        this.TrackTime = TrackTime;
    }

    public ComposeSubtitleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeSubtitleItem(ComposeSubtitleItem source) {
        if (source.StyleId != null) {
            this.StyleId = new String(source.StyleId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TrackTime != null) {
            this.TrackTime = new ComposeTrackTime(source.TrackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StyleId", this.StyleId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "TrackTime.", this.TrackTime);

    }
}

