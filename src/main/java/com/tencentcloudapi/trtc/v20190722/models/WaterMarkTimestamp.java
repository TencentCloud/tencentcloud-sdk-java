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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterMarkTimestamp extends AbstractModel {

    /**
    * 时间戳的位置，取值范围0-6，分别代表上左，上右，下左，下右，上居中，下居中，居中
    */
    @SerializedName("Pos")
    @Expose
    private Long Pos;

    /**
    * 显示时间戳的时区，默认东八区
    */
    @SerializedName("TimeZone")
    @Expose
    private Long TimeZone;

    /**
    * 文字水印的字体，支持设置以下值：
1. Tencent （默认）
2. SourceHanSans
    */
    @SerializedName("Font")
    @Expose
    private String Font;

    /**
     * Get 时间戳的位置，取值范围0-6，分别代表上左，上右，下左，下右，上居中，下居中，居中 
     * @return Pos 时间戳的位置，取值范围0-6，分别代表上左，上右，下左，下右，上居中，下居中，居中
     */
    public Long getPos() {
        return this.Pos;
    }

    /**
     * Set 时间戳的位置，取值范围0-6，分别代表上左，上右，下左，下右，上居中，下居中，居中
     * @param Pos 时间戳的位置，取值范围0-6，分别代表上左，上右，下左，下右，上居中，下居中，居中
     */
    public void setPos(Long Pos) {
        this.Pos = Pos;
    }

    /**
     * Get 显示时间戳的时区，默认东八区 
     * @return TimeZone 显示时间戳的时区，默认东八区
     */
    public Long getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 显示时间戳的时区，默认东八区
     * @param TimeZone 显示时间戳的时区，默认东八区
     */
    public void setTimeZone(Long TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 文字水印的字体，支持设置以下值：
1. Tencent （默认）
2. SourceHanSans 
     * @return Font 文字水印的字体，支持设置以下值：
1. Tencent （默认）
2. SourceHanSans
     */
    public String getFont() {
        return this.Font;
    }

    /**
     * Set 文字水印的字体，支持设置以下值：
1. Tencent （默认）
2. SourceHanSans
     * @param Font 文字水印的字体，支持设置以下值：
1. Tencent （默认）
2. SourceHanSans
     */
    public void setFont(String Font) {
        this.Font = Font;
    }

    public WaterMarkTimestamp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkTimestamp(WaterMarkTimestamp source) {
        if (source.Pos != null) {
            this.Pos = new Long(source.Pos);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new Long(source.TimeZone);
        }
        if (source.Font != null) {
            this.Font = new String(source.Font);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pos", this.Pos);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "Font", this.Font);

    }
}

