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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransDetail extends AbstractModel {

    /**
    * 当前行的原文本
    */
    @SerializedName("SourceLineText")
    @Expose
    private String SourceLineText;

    /**
    * 当前行的译文
    */
    @SerializedName("TargetLineText")
    @Expose
    private String TargetLineText;

    /**
    * 段落文本框位置
    */
    @SerializedName("BoundingBox")
    @Expose
    private BoundingBox BoundingBox;

    /**
    * 行数
    */
    @SerializedName("LinesCount")
    @Expose
    private Long LinesCount;

    /**
    * 行高
    */
    @SerializedName("LineHeight")
    @Expose
    private Long LineHeight;

    /**
    * 正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。
    */
    @SerializedName("SpamCode")
    @Expose
    private Long SpamCode;

    /**
     * Get 当前行的原文本 
     * @return SourceLineText 当前行的原文本
     */
    public String getSourceLineText() {
        return this.SourceLineText;
    }

    /**
     * Set 当前行的原文本
     * @param SourceLineText 当前行的原文本
     */
    public void setSourceLineText(String SourceLineText) {
        this.SourceLineText = SourceLineText;
    }

    /**
     * Get 当前行的译文 
     * @return TargetLineText 当前行的译文
     */
    public String getTargetLineText() {
        return this.TargetLineText;
    }

    /**
     * Set 当前行的译文
     * @param TargetLineText 当前行的译文
     */
    public void setTargetLineText(String TargetLineText) {
        this.TargetLineText = TargetLineText;
    }

    /**
     * Get 段落文本框位置 
     * @return BoundingBox 段落文本框位置
     */
    public BoundingBox getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set 段落文本框位置
     * @param BoundingBox 段落文本框位置
     */
    public void setBoundingBox(BoundingBox BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get 行数 
     * @return LinesCount 行数
     */
    public Long getLinesCount() {
        return this.LinesCount;
    }

    /**
     * Set 行数
     * @param LinesCount 行数
     */
    public void setLinesCount(Long LinesCount) {
        this.LinesCount = LinesCount;
    }

    /**
     * Get 行高 
     * @return LineHeight 行高
     */
    public Long getLineHeight() {
        return this.LineHeight;
    }

    /**
     * Set 行高
     * @param LineHeight 行高
     */
    public void setLineHeight(Long LineHeight) {
        this.LineHeight = LineHeight;
    }

    /**
     * Get 正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。 
     * @return SpamCode 正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。
     */
    public Long getSpamCode() {
        return this.SpamCode;
    }

    /**
     * Set 正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。
     * @param SpamCode 正常段落spam_code字段为0；如果存在spam_code字段且值大于0（1: 命中垃圾检查；2: 命中安全策略；3: 其他。），则命中安全检查被过滤。
     */
    public void setSpamCode(Long SpamCode) {
        this.SpamCode = SpamCode;
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

    }
}

