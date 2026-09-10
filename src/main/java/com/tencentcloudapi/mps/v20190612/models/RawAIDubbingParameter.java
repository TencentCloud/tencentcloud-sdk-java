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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RawAIDubbingParameter extends AbstractModel {

    /**
    * <p>翻译配置信息。</p>
    */
    @SerializedName("TranslateConfig")
    @Expose
    private DubbingTranslateConfig TranslateConfig;

    /**
    * <p>字幕配置信息。</p>
    */
    @SerializedName("SubtitleConfig")
    @Expose
    private DubbingSubtitleConfig SubtitleConfig;

    /**
    * <p>配音配置信息。</p>
    */
    @SerializedName("DubbingConfig")
    @Expose
    private DubbingConfig DubbingConfig;

    /**
    * <p>输出配置信息。</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private DubbingOutputConfig OutputConfig;

    /**
     * Get <p>翻译配置信息。</p> 
     * @return TranslateConfig <p>翻译配置信息。</p>
     */
    public DubbingTranslateConfig getTranslateConfig() {
        return this.TranslateConfig;
    }

    /**
     * Set <p>翻译配置信息。</p>
     * @param TranslateConfig <p>翻译配置信息。</p>
     */
    public void setTranslateConfig(DubbingTranslateConfig TranslateConfig) {
        this.TranslateConfig = TranslateConfig;
    }

    /**
     * Get <p>字幕配置信息。</p> 
     * @return SubtitleConfig <p>字幕配置信息。</p>
     */
    public DubbingSubtitleConfig getSubtitleConfig() {
        return this.SubtitleConfig;
    }

    /**
     * Set <p>字幕配置信息。</p>
     * @param SubtitleConfig <p>字幕配置信息。</p>
     */
    public void setSubtitleConfig(DubbingSubtitleConfig SubtitleConfig) {
        this.SubtitleConfig = SubtitleConfig;
    }

    /**
     * Get <p>配音配置信息。</p> 
     * @return DubbingConfig <p>配音配置信息。</p>
     */
    public DubbingConfig getDubbingConfig() {
        return this.DubbingConfig;
    }

    /**
     * Set <p>配音配置信息。</p>
     * @param DubbingConfig <p>配音配置信息。</p>
     */
    public void setDubbingConfig(DubbingConfig DubbingConfig) {
        this.DubbingConfig = DubbingConfig;
    }

    /**
     * Get <p>输出配置信息。</p> 
     * @return OutputConfig <p>输出配置信息。</p>
     */
    public DubbingOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>输出配置信息。</p>
     * @param OutputConfig <p>输出配置信息。</p>
     */
    public void setOutputConfig(DubbingOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public RawAIDubbingParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawAIDubbingParameter(RawAIDubbingParameter source) {
        if (source.TranslateConfig != null) {
            this.TranslateConfig = new DubbingTranslateConfig(source.TranslateConfig);
        }
        if (source.SubtitleConfig != null) {
            this.SubtitleConfig = new DubbingSubtitleConfig(source.SubtitleConfig);
        }
        if (source.DubbingConfig != null) {
            this.DubbingConfig = new DubbingConfig(source.DubbingConfig);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new DubbingOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TranslateConfig.", this.TranslateConfig);
        this.setParamObj(map, prefix + "SubtitleConfig.", this.SubtitleConfig);
        this.setParamObj(map, prefix + "DubbingConfig.", this.DubbingConfig);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

