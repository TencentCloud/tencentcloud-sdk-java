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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranslationConfig extends AbstractModel {

    /**
    * 翻译的目标语言，目标语种列表（ISO 639-1）

    */
    @SerializedName("TargetLanguages")
    @Expose
    private String [] TargetLanguages;

    /**
    *  1： 仅文字翻译，  2： 语音同传

    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 语音同传配置，开启同传时，需要传递
    */
    @SerializedName("TTSConfig")
    @Expose
    private TTSConfig TTSConfig;

    /**
    * 翻译术语集合
    */
    @SerializedName("Terminology")
    @Expose
    private Terminology [] Terminology;

    /**
     * Get 翻译的目标语言，目标语种列表（ISO 639-1）
 
     * @return TargetLanguages 翻译的目标语言，目标语种列表（ISO 639-1）

     */
    public String [] getTargetLanguages() {
        return this.TargetLanguages;
    }

    /**
     * Set 翻译的目标语言，目标语种列表（ISO 639-1）

     * @param TargetLanguages 翻译的目标语言，目标语种列表（ISO 639-1）

     */
    public void setTargetLanguages(String [] TargetLanguages) {
        this.TargetLanguages = TargetLanguages;
    }

    /**
     * Get  1： 仅文字翻译，  2： 语音同传
 
     * @return Mode  1： 仅文字翻译，  2： 语音同传

     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set  1： 仅文字翻译，  2： 语音同传

     * @param Mode  1： 仅文字翻译，  2： 语音同传

     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 语音同传配置，开启同传时，需要传递 
     * @return TTSConfig 语音同传配置，开启同传时，需要传递
     */
    public TTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set 语音同传配置，开启同传时，需要传递
     * @param TTSConfig 语音同传配置，开启同传时，需要传递
     */
    public void setTTSConfig(TTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get 翻译术语集合 
     * @return Terminology 翻译术语集合
     */
    public Terminology [] getTerminology() {
        return this.Terminology;
    }

    /**
     * Set 翻译术语集合
     * @param Terminology 翻译术语集合
     */
    public void setTerminology(Terminology [] Terminology) {
        this.Terminology = Terminology;
    }

    public TranslationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationConfig(TranslationConfig source) {
        if (source.TargetLanguages != null) {
            this.TargetLanguages = new String[source.TargetLanguages.length];
            for (int i = 0; i < source.TargetLanguages.length; i++) {
                this.TargetLanguages[i] = new String(source.TargetLanguages[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new TTSConfig(source.TTSConfig);
        }
        if (source.Terminology != null) {
            this.Terminology = new Terminology[source.Terminology.length];
            for (int i = 0; i < source.Terminology.length; i++) {
                this.Terminology[i] = new Terminology(source.Terminology[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetLanguages.", this.TargetLanguages);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamArrayObj(map, prefix + "Terminology.", this.Terminology);

    }
}

