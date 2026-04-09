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

public class AdaptiveDynamicStreamingTaskInput extends AbstractModel {

    /**
    * <p>转自适应码流模板 ID。</p>
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
    * <p>外挂字幕列表，元素为字幕 ID，支持多个字幕，最大可支持16个。</p>
    */
    @SerializedName("SubtitleSet")
    @Expose
    private String [] SubtitleSet;

    /**
    * <p>字幕压制信息列表。最大可支持 2 个。</p>
    */
    @SerializedName("SubtitleInfoSet")
    @Expose
    private SubtitleInfoInput [] SubtitleInfoSet;

    /**
     * Get <p>转自适应码流模板 ID。</p> 
     * @return Definition <p>转自适应码流模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>转自适应码流模板 ID。</p>
     * @param Definition <p>转自适应码流模板 ID。</p>
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
     * Get <p>外挂字幕列表，元素为字幕 ID，支持多个字幕，最大可支持16个。</p> 
     * @return SubtitleSet <p>外挂字幕列表，元素为字幕 ID，支持多个字幕，最大可支持16个。</p>
     */
    public String [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set <p>外挂字幕列表，元素为字幕 ID，支持多个字幕，最大可支持16个。</p>
     * @param SubtitleSet <p>外挂字幕列表，元素为字幕 ID，支持多个字幕，最大可支持16个。</p>
     */
    public void setSubtitleSet(String [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
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

    public AdaptiveDynamicStreamingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTaskInput(AdaptiveDynamicStreamingTaskInput source) {
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
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new String[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new String(source.SubtitleSet[i]);
            }
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
        this.setParamArraySimple(map, prefix + "SubtitleSet.", this.SubtitleSet);
        this.setParamArrayObj(map, prefix + "SubtitleInfoSet.", this.SubtitleInfoSet);

    }
}

