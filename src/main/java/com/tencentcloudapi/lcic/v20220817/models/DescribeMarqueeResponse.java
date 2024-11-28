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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMarqueeResponse extends AbstractModel {

    /**
    *  跑马灯类型：1为固定值，2为用户昵称，3为固定值+用户昵称，4为用户ID，5为originId+固定值，6为用户昵称（originId）
    */
    @SerializedName("MarqueeType")
    @Expose
    private Long MarqueeType;

    /**
    * 固定值内容（当MarqueeType=1或5，则展示固定值内容）
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 字体大小（数字，像素单位，范围：10到24）
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * 字体粗细：1为粗体，0为细体
    */
    @SerializedName("FontWeight")
    @Expose
    private Long FontWeight;

    /**
    * 字体颜色（十六进制颜色值）
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 字体透明度（数字，范围 0.0 到 1.0）
    */
    @SerializedName("FontOpacity")
    @Expose
    private Float FontOpacity;

    /**
    * 背景颜色（十六进制颜色值）
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
    * 背景透明度（数字，范围 0.0 到 1.0）
    */
    @SerializedName("BackgroundOpacity")
    @Expose
    private Float BackgroundOpacity;

    /**
    * 显示方式：1为滚动，2为闪烁
    */
    @SerializedName("DisplayMode")
    @Expose
    private Long DisplayMode;

    /**
    * 停留时长（秒，整数，范围 1～10）
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 跑马灯个数：目前仅支持1或2, 对应显示单排或双排
    */
    @SerializedName("MarqueeCount")
    @Expose
    private Long MarqueeCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get  跑马灯类型：1为固定值，2为用户昵称，3为固定值+用户昵称，4为用户ID，5为originId+固定值，6为用户昵称（originId） 
     * @return MarqueeType  跑马灯类型：1为固定值，2为用户昵称，3为固定值+用户昵称，4为用户ID，5为originId+固定值，6为用户昵称（originId）
     */
    public Long getMarqueeType() {
        return this.MarqueeType;
    }

    /**
     * Set  跑马灯类型：1为固定值，2为用户昵称，3为固定值+用户昵称，4为用户ID，5为originId+固定值，6为用户昵称（originId）
     * @param MarqueeType  跑马灯类型：1为固定值，2为用户昵称，3为固定值+用户昵称，4为用户ID，5为originId+固定值，6为用户昵称（originId）
     */
    public void setMarqueeType(Long MarqueeType) {
        this.MarqueeType = MarqueeType;
    }

    /**
     * Get 固定值内容（当MarqueeType=1或5，则展示固定值内容） 
     * @return Content 固定值内容（当MarqueeType=1或5，则展示固定值内容）
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 固定值内容（当MarqueeType=1或5，则展示固定值内容）
     * @param Content 固定值内容（当MarqueeType=1或5，则展示固定值内容）
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 字体大小（数字，像素单位，范围：10到24） 
     * @return FontSize 字体大小（数字，像素单位，范围：10到24）
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 字体大小（数字，像素单位，范围：10到24）
     * @param FontSize 字体大小（数字，像素单位，范围：10到24）
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get 字体粗细：1为粗体，0为细体 
     * @return FontWeight 字体粗细：1为粗体，0为细体
     */
    public Long getFontWeight() {
        return this.FontWeight;
    }

    /**
     * Set 字体粗细：1为粗体，0为细体
     * @param FontWeight 字体粗细：1为粗体，0为细体
     */
    public void setFontWeight(Long FontWeight) {
        this.FontWeight = FontWeight;
    }

    /**
     * Get 字体颜色（十六进制颜色值） 
     * @return FontColor 字体颜色（十六进制颜色值）
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 字体颜色（十六进制颜色值）
     * @param FontColor 字体颜色（十六进制颜色值）
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 字体透明度（数字，范围 0.0 到 1.0） 
     * @return FontOpacity 字体透明度（数字，范围 0.0 到 1.0）
     */
    public Float getFontOpacity() {
        return this.FontOpacity;
    }

    /**
     * Set 字体透明度（数字，范围 0.0 到 1.0）
     * @param FontOpacity 字体透明度（数字，范围 0.0 到 1.0）
     */
    public void setFontOpacity(Float FontOpacity) {
        this.FontOpacity = FontOpacity;
    }

    /**
     * Get 背景颜色（十六进制颜色值） 
     * @return BackgroundColor 背景颜色（十六进制颜色值）
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set 背景颜色（十六进制颜色值）
     * @param BackgroundColor 背景颜色（十六进制颜色值）
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Get 背景透明度（数字，范围 0.0 到 1.0） 
     * @return BackgroundOpacity 背景透明度（数字，范围 0.0 到 1.0）
     */
    public Float getBackgroundOpacity() {
        return this.BackgroundOpacity;
    }

    /**
     * Set 背景透明度（数字，范围 0.0 到 1.0）
     * @param BackgroundOpacity 背景透明度（数字，范围 0.0 到 1.0）
     */
    public void setBackgroundOpacity(Float BackgroundOpacity) {
        this.BackgroundOpacity = BackgroundOpacity;
    }

    /**
     * Get 显示方式：1为滚动，2为闪烁 
     * @return DisplayMode 显示方式：1为滚动，2为闪烁
     */
    public Long getDisplayMode() {
        return this.DisplayMode;
    }

    /**
     * Set 显示方式：1为滚动，2为闪烁
     * @param DisplayMode 显示方式：1为滚动，2为闪烁
     */
    public void setDisplayMode(Long DisplayMode) {
        this.DisplayMode = DisplayMode;
    }

    /**
     * Get 停留时长（秒，整数，范围 1～10） 
     * @return Duration 停留时长（秒，整数，范围 1～10）
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 停留时长（秒，整数，范围 1～10）
     * @param Duration 停留时长（秒，整数，范围 1～10）
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 跑马灯个数：目前仅支持1或2, 对应显示单排或双排 
     * @return MarqueeCount 跑马灯个数：目前仅支持1或2, 对应显示单排或双排
     */
    public Long getMarqueeCount() {
        return this.MarqueeCount;
    }

    /**
     * Set 跑马灯个数：目前仅支持1或2, 对应显示单排或双排
     * @param MarqueeCount 跑马灯个数：目前仅支持1或2, 对应显示单排或双排
     */
    public void setMarqueeCount(Long MarqueeCount) {
        this.MarqueeCount = MarqueeCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMarqueeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMarqueeResponse(DescribeMarqueeResponse source) {
        if (source.MarqueeType != null) {
            this.MarqueeType = new Long(source.MarqueeType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontWeight != null) {
            this.FontWeight = new Long(source.FontWeight);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontOpacity != null) {
            this.FontOpacity = new Float(source.FontOpacity);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new String(source.BackgroundColor);
        }
        if (source.BackgroundOpacity != null) {
            this.BackgroundOpacity = new Float(source.BackgroundOpacity);
        }
        if (source.DisplayMode != null) {
            this.DisplayMode = new Long(source.DisplayMode);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.MarqueeCount != null) {
            this.MarqueeCount = new Long(source.MarqueeCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarqueeType", this.MarqueeType);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontWeight", this.FontWeight);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontOpacity", this.FontOpacity);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);
        this.setParamSimple(map, prefix + "BackgroundOpacity", this.BackgroundOpacity);
        this.setParamSimple(map, prefix + "DisplayMode", this.DisplayMode);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "MarqueeCount", this.MarqueeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

