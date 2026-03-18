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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransDetail extends AbstractModel {

    /**
    * <p>当前行的原文本</p>
    */
    @SerializedName("SourceLineText")
    @Expose
    private String SourceLineText;

    /**
    * <p>当前行的译文</p>
    */
    @SerializedName("TargetLineText")
    @Expose
    private String TargetLineText;

    /**
    * <p>段落文本框位置</p>
    */
    @SerializedName("BoundingBox")
    @Expose
    private BoundingBox BoundingBox;

    /**
    * <p>行数</p>
    */
    @SerializedName("LinesCount")
    @Expose
    private Long LinesCount;

    /**
    * <p>行高</p><p>单位：px</p>
    */
    @SerializedName("LineHeight")
    @Expose
    private Long LineHeight;

    /**
    * <p>正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。</p>
    */
    @SerializedName("SpamCode")
    @Expose
    private Long SpamCode;

    /**
    * <p>段落文本旋转信息，只在valid为true时表示坐标有效</p>
    */
    @SerializedName("RotateParagraphRect")
    @Expose
    private RotateParagraphRect RotateParagraphRect;

    /**
     * Get <p>当前行的原文本</p> 
     * @return SourceLineText <p>当前行的原文本</p>
     */
    public String getSourceLineText() {
        return this.SourceLineText;
    }

    /**
     * Set <p>当前行的原文本</p>
     * @param SourceLineText <p>当前行的原文本</p>
     */
    public void setSourceLineText(String SourceLineText) {
        this.SourceLineText = SourceLineText;
    }

    /**
     * Get <p>当前行的译文</p> 
     * @return TargetLineText <p>当前行的译文</p>
     */
    public String getTargetLineText() {
        return this.TargetLineText;
    }

    /**
     * Set <p>当前行的译文</p>
     * @param TargetLineText <p>当前行的译文</p>
     */
    public void setTargetLineText(String TargetLineText) {
        this.TargetLineText = TargetLineText;
    }

    /**
     * Get <p>段落文本框位置</p> 
     * @return BoundingBox <p>段落文本框位置</p>
     */
    public BoundingBox getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set <p>段落文本框位置</p>
     * @param BoundingBox <p>段落文本框位置</p>
     */
    public void setBoundingBox(BoundingBox BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get <p>行数</p> 
     * @return LinesCount <p>行数</p>
     */
    public Long getLinesCount() {
        return this.LinesCount;
    }

    /**
     * Set <p>行数</p>
     * @param LinesCount <p>行数</p>
     */
    public void setLinesCount(Long LinesCount) {
        this.LinesCount = LinesCount;
    }

    /**
     * Get <p>行高</p><p>单位：px</p> 
     * @return LineHeight <p>行高</p><p>单位：px</p>
     */
    public Long getLineHeight() {
        return this.LineHeight;
    }

    /**
     * Set <p>行高</p><p>单位：px</p>
     * @param LineHeight <p>行高</p><p>单位：px</p>
     */
    public void setLineHeight(Long LineHeight) {
        this.LineHeight = LineHeight;
    }

    /**
     * Get <p>正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。</p> 
     * @return SpamCode <p>正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。</p>
     */
    public Long getSpamCode() {
        return this.SpamCode;
    }

    /**
     * Set <p>正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。</p>
     * @param SpamCode <p>正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。</p>
     */
    public void setSpamCode(Long SpamCode) {
        this.SpamCode = SpamCode;
    }

    /**
     * Get <p>段落文本旋转信息，只在valid为true时表示坐标有效</p> 
     * @return RotateParagraphRect <p>段落文本旋转信息，只在valid为true时表示坐标有效</p>
     */
    public RotateParagraphRect getRotateParagraphRect() {
        return this.RotateParagraphRect;
    }

    /**
     * Set <p>段落文本旋转信息，只在valid为true时表示坐标有效</p>
     * @param RotateParagraphRect <p>段落文本旋转信息，只在valid为true时表示坐标有效</p>
     */
    public void setRotateParagraphRect(RotateParagraphRect RotateParagraphRect) {
        this.RotateParagraphRect = RotateParagraphRect;
    }

    public TransDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransDetail(TransDetail source) {
        if (source.SourceLineText != null) {
            this.SourceLineText = new String(source.SourceLineText);
        }
        if (source.TargetLineText != null) {
            this.TargetLineText = new String(source.TargetLineText);
        }
        if (source.BoundingBox != null) {
            this.BoundingBox = new BoundingBox(source.BoundingBox);
        }
        if (source.LinesCount != null) {
            this.LinesCount = new Long(source.LinesCount);
        }
        if (source.LineHeight != null) {
            this.LineHeight = new Long(source.LineHeight);
        }
        if (source.SpamCode != null) {
            this.SpamCode = new Long(source.SpamCode);
        }
        if (source.RotateParagraphRect != null) {
            this.RotateParagraphRect = new RotateParagraphRect(source.RotateParagraphRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceLineText", this.SourceLineText);
        this.setParamSimple(map, prefix + "TargetLineText", this.TargetLineText);
        this.setParamObj(map, prefix + "BoundingBox.", this.BoundingBox);
        this.setParamSimple(map, prefix + "LinesCount", this.LinesCount);
        this.setParamSimple(map, prefix + "LineHeight", this.LineHeight);
        this.setParamSimple(map, prefix + "SpamCode", this.SpamCode);
        this.setParamObj(map, prefix + "RotateParagraphRect.", this.RotateParagraphRect);

    }
}

