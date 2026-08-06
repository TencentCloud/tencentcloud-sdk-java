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

public class AigcVideoTaskUsage extends AbstractModel {

    /**
    * <p>输入 Token 数目。</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>思考产生的 Token 数目。</p>
    */
    @SerializedName("ThoughtTokens")
    @Expose
    private Long ThoughtTokens;

    /**
    * <p>输入图片数目。</p>
    */
    @SerializedName("InputImageCount")
    @Expose
    private Long InputImageCount;

    /**
    * <p>输入视频的时长。</p><p>单位：秒。</p>
    */
    @SerializedName("InputSeconds")
    @Expose
    private Long InputSeconds;

    /**
    * <p>输出视频时长。</p><p>单位：秒。</p>
    */
    @SerializedName("OutputSeconds")
    @Expose
    private Long OutputSeconds;

    /**
    * <p>输入输出总时长。</p><p>默认值：秒。</p>
    */
    @SerializedName("TotalSeconds")
    @Expose
    private Long TotalSeconds;

    /**
     * Get <p>输入 Token 数目。</p> 
     * @return InputTokens <p>输入 Token 数目。</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入 Token 数目。</p>
     * @param InputTokens <p>输入 Token 数目。</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>思考产生的 Token 数目。</p> 
     * @return ThoughtTokens <p>思考产生的 Token 数目。</p>
     */
    public Long getThoughtTokens() {
        return this.ThoughtTokens;
    }

    /**
     * Set <p>思考产生的 Token 数目。</p>
     * @param ThoughtTokens <p>思考产生的 Token 数目。</p>
     */
    public void setThoughtTokens(Long ThoughtTokens) {
        this.ThoughtTokens = ThoughtTokens;
    }

    /**
     * Get <p>输入图片数目。</p> 
     * @return InputImageCount <p>输入图片数目。</p>
     */
    public Long getInputImageCount() {
        return this.InputImageCount;
    }

    /**
     * Set <p>输入图片数目。</p>
     * @param InputImageCount <p>输入图片数目。</p>
     */
    public void setInputImageCount(Long InputImageCount) {
        this.InputImageCount = InputImageCount;
    }

    /**
     * Get <p>输入视频的时长。</p><p>单位：秒。</p> 
     * @return InputSeconds <p>输入视频的时长。</p><p>单位：秒。</p>
     */
    public Long getInputSeconds() {
        return this.InputSeconds;
    }

    /**
     * Set <p>输入视频的时长。</p><p>单位：秒。</p>
     * @param InputSeconds <p>输入视频的时长。</p><p>单位：秒。</p>
     */
    public void setInputSeconds(Long InputSeconds) {
        this.InputSeconds = InputSeconds;
    }

    /**
     * Get <p>输出视频时长。</p><p>单位：秒。</p> 
     * @return OutputSeconds <p>输出视频时长。</p><p>单位：秒。</p>
     */
    public Long getOutputSeconds() {
        return this.OutputSeconds;
    }

    /**
     * Set <p>输出视频时长。</p><p>单位：秒。</p>
     * @param OutputSeconds <p>输出视频时长。</p><p>单位：秒。</p>
     */
    public void setOutputSeconds(Long OutputSeconds) {
        this.OutputSeconds = OutputSeconds;
    }

    /**
     * Get <p>输入输出总时长。</p><p>默认值：秒。</p> 
     * @return TotalSeconds <p>输入输出总时长。</p><p>默认值：秒。</p>
     */
    public Long getTotalSeconds() {
        return this.TotalSeconds;
    }

    /**
     * Set <p>输入输出总时长。</p><p>默认值：秒。</p>
     * @param TotalSeconds <p>输入输出总时长。</p><p>默认值：秒。</p>
     */
    public void setTotalSeconds(Long TotalSeconds) {
        this.TotalSeconds = TotalSeconds;
    }

    public AigcVideoTaskUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskUsage(AigcVideoTaskUsage source) {
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.ThoughtTokens != null) {
            this.ThoughtTokens = new Long(source.ThoughtTokens);
        }
        if (source.InputImageCount != null) {
            this.InputImageCount = new Long(source.InputImageCount);
        }
        if (source.InputSeconds != null) {
            this.InputSeconds = new Long(source.InputSeconds);
        }
        if (source.OutputSeconds != null) {
            this.OutputSeconds = new Long(source.OutputSeconds);
        }
        if (source.TotalSeconds != null) {
            this.TotalSeconds = new Long(source.TotalSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "ThoughtTokens", this.ThoughtTokens);
        this.setParamSimple(map, prefix + "InputImageCount", this.InputImageCount);
        this.setParamSimple(map, prefix + "InputSeconds", this.InputSeconds);
        this.setParamSimple(map, prefix + "OutputSeconds", this.OutputSeconds);
        this.setParamSimple(map, prefix + "TotalSeconds", this.TotalSeconds);

    }
}

