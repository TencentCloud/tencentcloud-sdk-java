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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeTaskInput extends AbstractModel{

    /**
    * 视频转码模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 水印列表，支持多张图片或文字水印，最大可支持 10 张。
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * 马赛克列表，最大可支持 10 张。
    */
    @SerializedName("MosaicSet")
    @Expose
    private MosaicInput [] MosaicSet;

    /**
    * 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get 视频转码模板 ID。 
     * @return Definition 视频转码模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 视频转码模板 ID。
     * @param Definition 视频转码模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 水印列表，支持多张图片或文字水印，最大可支持 10 张。 
     * @return WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set 水印列表，支持多张图片或文字水印，最大可支持 10 张。
     * @param WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get 马赛克列表，最大可支持 10 张。 
     * @return MosaicSet 马赛克列表，最大可支持 10 张。
     */
    public MosaicInput [] getMosaicSet() {
        return this.MosaicSet;
    }

    /**
     * Set 马赛克列表，最大可支持 10 张。
     * @param MosaicSet 马赛克列表，最大可支持 10 张。
     */
    public void setMosaicSet(MosaicInput [] MosaicSet) {
        this.MosaicSet = MosaicSet;
    }

    /**
     * Get 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li> 
     * @return StartTimeOffset 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     * @param StartTimeOffset 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li> 
     * @return EndTimeOffset 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     * @param EndTimeOffset 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamArrayObj(map, prefix + "MosaicSet.", this.MosaicSet);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

