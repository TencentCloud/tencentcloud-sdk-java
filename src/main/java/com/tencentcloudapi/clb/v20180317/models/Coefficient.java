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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Coefficient extends AbstractModel {

    /**
    * <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
    */
    @SerializedName("InputCachedCoefficient")
    @Expose
    private Float InputCachedCoefficient;

    /**
    * <p>缓存创建积分系数</p>
    */
    @SerializedName("InputCacheCreationCoefficient")
    @Expose
    private Float InputCacheCreationCoefficient;

    /**
    * <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
    */
    @SerializedName("InputCoefficient")
    @Expose
    private Float InputCoefficient;

    /**
    * <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
    */
    @SerializedName("OutputCoefficient")
    @Expose
    private Float OutputCoefficient;

    /**
    * <p>输入图片系数</p>
    */
    @SerializedName("InputImageCoefficient")
    @Expose
    private Float InputImageCoefficient;

    /**
    * <p>输入视频每秒系数</p>
    */
    @SerializedName("InputVideoSecondCoefficient")
    @Expose
    private Float InputVideoSecondCoefficient;

    /**
    * <p>输出视频每秒系数</p>
    */
    @SerializedName("OutputVideoSecondCoefficient")
    @Expose
    private Float OutputVideoSecondCoefficient;

    /**
    * <p>输出图片系数</p>
    */
    @SerializedName("OutputImageCoefficient")
    @Expose
    private Float OutputImageCoefficient;

    /**
    * <p>Realtime 音频输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：80</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
    */
    @SerializedName("InputAudioTokenCoefficient")
    @Expose
    private Float InputAudioTokenCoefficient;

    /**
    * <p>Realtime 音频缓存命中输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
    */
    @SerializedName("InputCachedAudioTokenCoefficient")
    @Expose
    private Float InputCachedAudioTokenCoefficient;

    /**
    * <p>Realtime 图像输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：12.5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
    */
    @SerializedName("InputImageTokenCoefficient")
    @Expose
    private Float InputImageTokenCoefficient;

    /**
    * <p>Realtime 图像缓存命中输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
    */
    @SerializedName("InputCachedImageTokenCoefficient")
    @Expose
    private Float InputCachedImageTokenCoefficient;

    /**
    * <p>Realtime 音频输出积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：300</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
    */
    @SerializedName("OutputAudioTokenCoefficient")
    @Expose
    private Float OutputAudioTokenCoefficient;

    /**
     * Get <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p> 
     * @return InputCachedCoefficient <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
     */
    public Float getInputCachedCoefficient() {
        return this.InputCachedCoefficient;
    }

    /**
     * Set <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
     * @param InputCachedCoefficient <p>缓存命中输入积分系数。</p><p>用于 provider prompt cache 命中的输入 token。</p><p>取值范围：[0, 5000]</p><p>默认值：3</p>
     */
    public void setInputCachedCoefficient(Float InputCachedCoefficient) {
        this.InputCachedCoefficient = InputCachedCoefficient;
    }

    /**
     * Get <p>缓存创建积分系数</p> 
     * @return InputCacheCreationCoefficient <p>缓存创建积分系数</p>
     */
    public Float getInputCacheCreationCoefficient() {
        return this.InputCacheCreationCoefficient;
    }

    /**
     * Set <p>缓存创建积分系数</p>
     * @param InputCacheCreationCoefficient <p>缓存创建积分系数</p>
     */
    public void setInputCacheCreationCoefficient(Float InputCacheCreationCoefficient) {
        this.InputCacheCreationCoefficient = InputCacheCreationCoefficient;
    }

    /**
     * Get <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p> 
     * @return InputCoefficient <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
     */
    public Float getInputCoefficient() {
        return this.InputCoefficient;
    }

    /**
     * Set <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
     * @param InputCoefficient <p>输入积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：25</p>
     */
    public void setInputCoefficient(Float InputCoefficient) {
        this.InputCoefficient = InputCoefficient;
    }

    /**
     * Get <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p> 
     * @return OutputCoefficient <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
     */
    public Float getOutputCoefficient() {
        return this.OutputCoefficient;
    }

    /**
     * Set <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
     * @param OutputCoefficient <p>输出积分系数。</p><p>取值范围：[1, 5000]</p><p>默认值：100</p>
     */
    public void setOutputCoefficient(Float OutputCoefficient) {
        this.OutputCoefficient = OutputCoefficient;
    }

    /**
     * Get <p>输入图片系数</p> 
     * @return InputImageCoefficient <p>输入图片系数</p>
     */
    public Float getInputImageCoefficient() {
        return this.InputImageCoefficient;
    }

    /**
     * Set <p>输入图片系数</p>
     * @param InputImageCoefficient <p>输入图片系数</p>
     */
    public void setInputImageCoefficient(Float InputImageCoefficient) {
        this.InputImageCoefficient = InputImageCoefficient;
    }

    /**
     * Get <p>输入视频每秒系数</p> 
     * @return InputVideoSecondCoefficient <p>输入视频每秒系数</p>
     */
    public Float getInputVideoSecondCoefficient() {
        return this.InputVideoSecondCoefficient;
    }

    /**
     * Set <p>输入视频每秒系数</p>
     * @param InputVideoSecondCoefficient <p>输入视频每秒系数</p>
     */
    public void setInputVideoSecondCoefficient(Float InputVideoSecondCoefficient) {
        this.InputVideoSecondCoefficient = InputVideoSecondCoefficient;
    }

    /**
     * Get <p>输出视频每秒系数</p> 
     * @return OutputVideoSecondCoefficient <p>输出视频每秒系数</p>
     */
    public Float getOutputVideoSecondCoefficient() {
        return this.OutputVideoSecondCoefficient;
    }

    /**
     * Set <p>输出视频每秒系数</p>
     * @param OutputVideoSecondCoefficient <p>输出视频每秒系数</p>
     */
    public void setOutputVideoSecondCoefficient(Float OutputVideoSecondCoefficient) {
        this.OutputVideoSecondCoefficient = OutputVideoSecondCoefficient;
    }

    /**
     * Get <p>输出图片系数</p> 
     * @return OutputImageCoefficient <p>输出图片系数</p>
     */
    public Float getOutputImageCoefficient() {
        return this.OutputImageCoefficient;
    }

    /**
     * Set <p>输出图片系数</p>
     * @param OutputImageCoefficient <p>输出图片系数</p>
     */
    public void setOutputImageCoefficient(Float OutputImageCoefficient) {
        this.OutputImageCoefficient = OutputImageCoefficient;
    }

    /**
     * Get <p>Realtime 音频输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：80</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p> 
     * @return InputAudioTokenCoefficient <p>Realtime 音频输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：80</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public Float getInputAudioTokenCoefficient() {
        return this.InputAudioTokenCoefficient;
    }

    /**
     * Set <p>Realtime 音频输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：80</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     * @param InputAudioTokenCoefficient <p>Realtime 音频输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：80</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public void setInputAudioTokenCoefficient(Float InputAudioTokenCoefficient) {
        this.InputAudioTokenCoefficient = InputAudioTokenCoefficient;
    }

    /**
     * Get <p>Realtime 音频缓存命中输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p> 
     * @return InputCachedAudioTokenCoefficient <p>Realtime 音频缓存命中输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public Float getInputCachedAudioTokenCoefficient() {
        return this.InputCachedAudioTokenCoefficient;
    }

    /**
     * Set <p>Realtime 音频缓存命中输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     * @param InputCachedAudioTokenCoefficient <p>Realtime 音频缓存命中输入积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public void setInputCachedAudioTokenCoefficient(Float InputCachedAudioTokenCoefficient) {
        this.InputCachedAudioTokenCoefficient = InputCachedAudioTokenCoefficient;
    }

    /**
     * Get <p>Realtime 图像输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：12.5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p> 
     * @return InputImageTokenCoefficient <p>Realtime 图像输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：12.5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public Float getInputImageTokenCoefficient() {
        return this.InputImageTokenCoefficient;
    }

    /**
     * Set <p>Realtime 图像输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：12.5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     * @param InputImageTokenCoefficient <p>Realtime 图像输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：12.5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public void setInputImageTokenCoefficient(Float InputImageTokenCoefficient) {
        this.InputImageTokenCoefficient = InputImageTokenCoefficient;
    }

    /**
     * Get <p>Realtime 图像缓存命中输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p> 
     * @return InputCachedImageTokenCoefficient <p>Realtime 图像缓存命中输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public Float getInputCachedImageTokenCoefficient() {
        return this.InputCachedImageTokenCoefficient;
    }

    /**
     * Set <p>Realtime 图像缓存命中输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     * @param InputCachedImageTokenCoefficient <p>Realtime 图像缓存命中输入积分系数，单位为积分/百万图像 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：5</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public void setInputCachedImageTokenCoefficient(Float InputCachedImageTokenCoefficient) {
        this.InputCachedImageTokenCoefficient = InputCachedImageTokenCoefficient;
    }

    /**
     * Get <p>Realtime 音频输出积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：300</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p> 
     * @return OutputAudioTokenCoefficient <p>Realtime 音频输出积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：300</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public Float getOutputAudioTokenCoefficient() {
        return this.OutputAudioTokenCoefficient;
    }

    /**
     * Set <p>Realtime 音频输出积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：300</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     * @param OutputAudioTokenCoefficient <p>Realtime 音频输出积分系数，单位为积分/百万音频 Token。</p><p>取值范围：[0, 5000]</p><p>默认值：300</p><p>仅 Capability=realtime 支持，最多 6 位小数。修改时未提供此字段则保留旧值；0 表示零价，不接受 null。</p>
     */
    public void setOutputAudioTokenCoefficient(Float OutputAudioTokenCoefficient) {
        this.OutputAudioTokenCoefficient = OutputAudioTokenCoefficient;
    }

    public Coefficient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coefficient(Coefficient source) {
        if (source.InputCachedCoefficient != null) {
            this.InputCachedCoefficient = new Float(source.InputCachedCoefficient);
        }
        if (source.InputCacheCreationCoefficient != null) {
            this.InputCacheCreationCoefficient = new Float(source.InputCacheCreationCoefficient);
        }
        if (source.InputCoefficient != null) {
            this.InputCoefficient = new Float(source.InputCoefficient);
        }
        if (source.OutputCoefficient != null) {
            this.OutputCoefficient = new Float(source.OutputCoefficient);
        }
        if (source.InputImageCoefficient != null) {
            this.InputImageCoefficient = new Float(source.InputImageCoefficient);
        }
        if (source.InputVideoSecondCoefficient != null) {
            this.InputVideoSecondCoefficient = new Float(source.InputVideoSecondCoefficient);
        }
        if (source.OutputVideoSecondCoefficient != null) {
            this.OutputVideoSecondCoefficient = new Float(source.OutputVideoSecondCoefficient);
        }
        if (source.OutputImageCoefficient != null) {
            this.OutputImageCoefficient = new Float(source.OutputImageCoefficient);
        }
        if (source.InputAudioTokenCoefficient != null) {
            this.InputAudioTokenCoefficient = new Float(source.InputAudioTokenCoefficient);
        }
        if (source.InputCachedAudioTokenCoefficient != null) {
            this.InputCachedAudioTokenCoefficient = new Float(source.InputCachedAudioTokenCoefficient);
        }
        if (source.InputImageTokenCoefficient != null) {
            this.InputImageTokenCoefficient = new Float(source.InputImageTokenCoefficient);
        }
        if (source.InputCachedImageTokenCoefficient != null) {
            this.InputCachedImageTokenCoefficient = new Float(source.InputCachedImageTokenCoefficient);
        }
        if (source.OutputAudioTokenCoefficient != null) {
            this.OutputAudioTokenCoefficient = new Float(source.OutputAudioTokenCoefficient);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputCachedCoefficient", this.InputCachedCoefficient);
        this.setParamSimple(map, prefix + "InputCacheCreationCoefficient", this.InputCacheCreationCoefficient);
        this.setParamSimple(map, prefix + "InputCoefficient", this.InputCoefficient);
        this.setParamSimple(map, prefix + "OutputCoefficient", this.OutputCoefficient);
        this.setParamSimple(map, prefix + "InputImageCoefficient", this.InputImageCoefficient);
        this.setParamSimple(map, prefix + "InputVideoSecondCoefficient", this.InputVideoSecondCoefficient);
        this.setParamSimple(map, prefix + "OutputVideoSecondCoefficient", this.OutputVideoSecondCoefficient);
        this.setParamSimple(map, prefix + "OutputImageCoefficient", this.OutputImageCoefficient);
        this.setParamSimple(map, prefix + "InputAudioTokenCoefficient", this.InputAudioTokenCoefficient);
        this.setParamSimple(map, prefix + "InputCachedAudioTokenCoefficient", this.InputCachedAudioTokenCoefficient);
        this.setParamSimple(map, prefix + "InputImageTokenCoefficient", this.InputImageTokenCoefficient);
        this.setParamSimple(map, prefix + "InputCachedImageTokenCoefficient", this.InputCachedImageTokenCoefficient);
        this.setParamSimple(map, prefix + "OutputAudioTokenCoefficient", this.OutputAudioTokenCoefficient);

    }
}

