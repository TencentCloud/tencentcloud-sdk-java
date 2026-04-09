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

public class TranscodeTaskInput extends AbstractModel {

    /**
    * <p>视频转码模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * <p>溯源水印。</p>
    */
    @SerializedName("TraceWatermark")
    @Expose
    private TraceWatermarkInput TraceWatermark;

    /**
    * <p>版权水印。</p>
    */
    @SerializedName("CopyRightWatermark")
    @Expose
    private CopyRightWatermarkInput CopyRightWatermark;

    /**
    * <p>数字水印。</p>
    */
    @SerializedName("BlindWatermark")
    @Expose
    private BlindWatermarkInput BlindWatermark;

    /**
    * <p>马赛克列表，最大可支持 10 张。</p>
    */
    @SerializedName("MosaicSet")
    @Expose
    private MosaicInput [] MosaicSet;

    /**
    * <p>片头片尾列表，支持多片头片尾，最大可支持 10 个。</p>
    */
    @SerializedName("HeadTailSet")
    @Expose
    private HeadTailTaskInput [] HeadTailSet;

    /**
    * <p>转码后的视频的起始时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li><li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li><li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>转码后视频的终止时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li><li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li><li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * <p>字幕压制信息列表。最大可支持 2 个。</p>
    */
    @SerializedName("SubtitleInfoSet")
    @Expose
    private SubtitleInfoInput [] SubtitleInfoSet;

    /**
     * Get <p>视频转码模板 ID。</p> 
     * @return Definition <p>视频转码模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>视频转码模板 ID。</p>
     * @param Definition <p>视频转码模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p> 
     * @return WatermarkSet <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     * @param WatermarkSet <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get <p>溯源水印。</p> 
     * @return TraceWatermark <p>溯源水印。</p>
     */
    public TraceWatermarkInput getTraceWatermark() {
        return this.TraceWatermark;
    }

    /**
     * Set <p>溯源水印。</p>
     * @param TraceWatermark <p>溯源水印。</p>
     */
    public void setTraceWatermark(TraceWatermarkInput TraceWatermark) {
        this.TraceWatermark = TraceWatermark;
    }

    /**
     * Get <p>版权水印。</p> 
     * @return CopyRightWatermark <p>版权水印。</p>
     */
    public CopyRightWatermarkInput getCopyRightWatermark() {
        return this.CopyRightWatermark;
    }

    /**
     * Set <p>版权水印。</p>
     * @param CopyRightWatermark <p>版权水印。</p>
     */
    public void setCopyRightWatermark(CopyRightWatermarkInput CopyRightWatermark) {
        this.CopyRightWatermark = CopyRightWatermark;
    }

    /**
     * Get <p>数字水印。</p> 
     * @return BlindWatermark <p>数字水印。</p>
     */
    public BlindWatermarkInput getBlindWatermark() {
        return this.BlindWatermark;
    }

    /**
     * Set <p>数字水印。</p>
     * @param BlindWatermark <p>数字水印。</p>
     */
    public void setBlindWatermark(BlindWatermarkInput BlindWatermark) {
        this.BlindWatermark = BlindWatermark;
    }

    /**
     * Get <p>马赛克列表，最大可支持 10 张。</p> 
     * @return MosaicSet <p>马赛克列表，最大可支持 10 张。</p>
     */
    public MosaicInput [] getMosaicSet() {
        return this.MosaicSet;
    }

    /**
     * Set <p>马赛克列表，最大可支持 10 张。</p>
     * @param MosaicSet <p>马赛克列表，最大可支持 10 张。</p>
     */
    public void setMosaicSet(MosaicInput [] MosaicSet) {
        this.MosaicSet = MosaicSet;
    }

    /**
     * Get <p>片头片尾列表，支持多片头片尾，最大可支持 10 个。</p> 
     * @return HeadTailSet <p>片头片尾列表，支持多片头片尾，最大可支持 10 个。</p>
     */
    public HeadTailTaskInput [] getHeadTailSet() {
        return this.HeadTailSet;
    }

    /**
     * Set <p>片头片尾列表，支持多片头片尾，最大可支持 10 个。</p>
     * @param HeadTailSet <p>片头片尾列表，支持多片头片尾，最大可支持 10 个。</p>
     */
    public void setHeadTailSet(HeadTailTaskInput [] HeadTailSet) {
        this.HeadTailSet = HeadTailSet;
    }

    /**
     * Get <p>转码后的视频的起始时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li><li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li><li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li> 
     * @return StartTimeOffset <p>转码后的视频的起始时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li><li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li><li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>转码后的视频的起始时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li><li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li><li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     * @param StartTimeOffset <p>转码后的视频的起始时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li><li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li><li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>转码后视频的终止时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li><li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li><li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li> 
     * @return EndTimeOffset <p>转码后视频的终止时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li><li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li><li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>转码后视频的终止时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li><li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li><li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     * @param EndTimeOffset <p>转码后视频的终止时间偏移，单位：秒。</p><li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li><li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li><li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get <p>字幕压制信息列表。最大可支持 2 个。</p> 
     * @return SubtitleInfoSet <p>字幕压制信息列表。最大可支持 2 个。</p>
     */
    public SubtitleInfoInput [] getSubtitleInfoSet() {
        return this.SubtitleInfoSet;
    }

    /**
     * Set <p>字幕压制信息列表。最大可支持 2 个。</p>
     * @param SubtitleInfoSet <p>字幕压制信息列表。最大可支持 2 个。</p>
     */
    public void setSubtitleInfoSet(SubtitleInfoInput [] SubtitleInfoSet) {
        this.SubtitleInfoSet = SubtitleInfoSet;
    }

    public TranscodeTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskInput(TranscodeTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.TraceWatermark != null) {
            this.TraceWatermark = new TraceWatermarkInput(source.TraceWatermark);
        }
        if (source.CopyRightWatermark != null) {
            this.CopyRightWatermark = new CopyRightWatermarkInput(source.CopyRightWatermark);
        }
        if (source.BlindWatermark != null) {
            this.BlindWatermark = new BlindWatermarkInput(source.BlindWatermark);
        }
        if (source.MosaicSet != null) {
            this.MosaicSet = new MosaicInput[source.MosaicSet.length];
            for (int i = 0; i < source.MosaicSet.length; i++) {
                this.MosaicSet[i] = new MosaicInput(source.MosaicSet[i]);
            }
        }
        if (source.HeadTailSet != null) {
            this.HeadTailSet = new HeadTailTaskInput[source.HeadTailSet.length];
            for (int i = 0; i < source.HeadTailSet.length; i++) {
                this.HeadTailSet[i] = new HeadTailTaskInput(source.HeadTailSet[i]);
            }
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.SubtitleInfoSet != null) {
            this.SubtitleInfoSet = new SubtitleInfoInput[source.SubtitleInfoSet.length];
            for (int i = 0; i < source.SubtitleInfoSet.length; i++) {
                this.SubtitleInfoSet[i] = new SubtitleInfoInput(source.SubtitleInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "TraceWatermark.", this.TraceWatermark);
        this.setParamObj(map, prefix + "CopyRightWatermark.", this.CopyRightWatermark);
        this.setParamObj(map, prefix + "BlindWatermark.", this.BlindWatermark);
        this.setParamArrayObj(map, prefix + "MosaicSet.", this.MosaicSet);
        this.setParamArrayObj(map, prefix + "HeadTailSet.", this.HeadTailSet);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArrayObj(map, prefix + "SubtitleInfoSet.", this.SubtitleInfoSet);

    }
}

