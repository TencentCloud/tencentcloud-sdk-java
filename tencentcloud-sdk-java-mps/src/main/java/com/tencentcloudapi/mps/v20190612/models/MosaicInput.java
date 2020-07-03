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

public class MosaicInput extends AbstractModel{

    /**
    * 原点位置，目前仅支持：
<li>TopLeft：表示坐标原点位于视频图像左上角，马赛克原点为图片或文字的左上角。</li>
默认值：TopLeft。
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * 马赛克原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 马赛克原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 马赛克的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
默认值：10%。
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 马赛克的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Height 单位为像素，如 100px 表示 Height 为 100 像素。</li>
默认值：10%。
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 马赛克的起始时间偏移，单位：秒。不填或填0，表示马赛克从画面出现时开始显现。
<li>不填或填0，表示马赛克从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示马赛克从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示马赛克从离画面结束 n 秒前开始出现。</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 马赛克的结束时间偏移，单位：秒。
<li>不填或填0，表示马赛克持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示马赛克持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示马赛克持续到离画面结束 n 秒前消失。</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get 原点位置，目前仅支持：
<li>TopLeft：表示坐标原点位于视频图像左上角，马赛克原点为图片或文字的左上角。</li>
默认值：TopLeft。 
     * @return CoordinateOrigin 原点位置，目前仅支持：
<li>TopLeft：表示坐标原点位于视频图像左上角，马赛克原点为图片或文字的左上角。</li>
默认值：TopLeft。
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set 原点位置，目前仅支持：
<li>TopLeft：表示坐标原点位于视频图像左上角，马赛克原点为图片或文字的左上角。</li>
默认值：TopLeft。
     * @param CoordinateOrigin 原点位置，目前仅支持：
<li>TopLeft：表示坐标原点位于视频图像左上角，马赛克原点为图片或文字的左上角。</li>
默认值：TopLeft。
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get 马赛克原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。 
     * @return XPos 马赛克原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 马赛克原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
     * @param XPos 马赛克原点距离视频图像坐标原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 XPos 为指定像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get 马赛克原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。 
     * @return YPos 马赛克原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 马赛克原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
     * @param YPos 马赛克原点距离视频图像坐标原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 YPos 为指定像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get 马赛克的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
默认值：10%。 
     * @return Width 马赛克的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
默认值：10%。
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 马赛克的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
默认值：10%。
     * @param Width 马赛克的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
默认值：10%。
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get 马赛克的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Height 单位为像素，如 100px 表示 Height 为 100 像素。</li>
默认值：10%。 
     * @return Height 马赛克的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Height 单位为像素，如 100px 表示 Height 为 100 像素。</li>
默认值：10%。
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 马赛克的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Height 单位为像素，如 100px 表示 Height 为 100 像素。</li>
默认值：10%。
     * @param Height 马赛克的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示马赛克 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示马赛克 Height 单位为像素，如 100px 表示 Height 为 100 像素。</li>
默认值：10%。
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 马赛克的起始时间偏移，单位：秒。不填或填0，表示马赛克从画面出现时开始显现。
<li>不填或填0，表示马赛克从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示马赛克从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示马赛克从离画面结束 n 秒前开始出现。</li> 
     * @return StartTimeOffset 马赛克的起始时间偏移，单位：秒。不填或填0，表示马赛克从画面出现时开始显现。
<li>不填或填0，表示马赛克从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示马赛克从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示马赛克从离画面结束 n 秒前开始出现。</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 马赛克的起始时间偏移，单位：秒。不填或填0，表示马赛克从画面出现时开始显现。
<li>不填或填0，表示马赛克从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示马赛克从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示马赛克从离画面结束 n 秒前开始出现。</li>
     * @param StartTimeOffset 马赛克的起始时间偏移，单位：秒。不填或填0，表示马赛克从画面出现时开始显现。
<li>不填或填0，表示马赛克从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示马赛克从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示马赛克从离画面结束 n 秒前开始出现。</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 马赛克的结束时间偏移，单位：秒。
<li>不填或填0，表示马赛克持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示马赛克持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示马赛克持续到离画面结束 n 秒前消失。</li> 
     * @return EndTimeOffset 马赛克的结束时间偏移，单位：秒。
<li>不填或填0，表示马赛克持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示马赛克持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示马赛克持续到离画面结束 n 秒前消失。</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 马赛克的结束时间偏移，单位：秒。
<li>不填或填0，表示马赛克持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示马赛克持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示马赛克持续到离画面结束 n 秒前消失。</li>
     * @param EndTimeOffset 马赛克的结束时间偏移，单位：秒。
<li>不填或填0，表示马赛克持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示马赛克持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示马赛克持续到离画面结束 n 秒前消失。</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

