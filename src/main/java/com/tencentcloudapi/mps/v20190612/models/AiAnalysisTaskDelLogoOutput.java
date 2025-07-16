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

public class AiAnalysisTaskDelLogoOutput extends AbstractModel {

    /**
    * 擦除后文件的路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 擦除后文件的存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 基于画面提取的字幕文件路径。
    */
    @SerializedName("OriginSubtitlePath")
    @Expose
    private String OriginSubtitlePath;

    /**
    * 基于画面提取的字幕翻译文件路径。
    */
    @SerializedName("TranslateSubtitlePath")
    @Expose
    private String TranslateSubtitlePath;

    /**
     * Get 擦除后文件的路径。 
     * @return Path 擦除后文件的路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 擦除后文件的路径。
     * @param Path 擦除后文件的路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 擦除后文件的存储位置。 
     * @return OutputStorage 擦除后文件的存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 擦除后文件的存储位置。
     * @param OutputStorage 擦除后文件的存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 基于画面提取的字幕文件路径。 
     * @return OriginSubtitlePath 基于画面提取的字幕文件路径。
     */
    public String getOriginSubtitlePath() {
        return this.OriginSubtitlePath;
    }

    /**
     * Set 基于画面提取的字幕文件路径。
     * @param OriginSubtitlePath 基于画面提取的字幕文件路径。
     */
    public void setOriginSubtitlePath(String OriginSubtitlePath) {
        this.OriginSubtitlePath = OriginSubtitlePath;
    }

    /**
     * Get 基于画面提取的字幕翻译文件路径。 
     * @return TranslateSubtitlePath 基于画面提取的字幕翻译文件路径。
     */
    public String getTranslateSubtitlePath() {
        return this.TranslateSubtitlePath;
    }

    /**
     * Set 基于画面提取的字幕翻译文件路径。
     * @param TranslateSubtitlePath 基于画面提取的字幕翻译文件路径。
     */
    public void setTranslateSubtitlePath(String TranslateSubtitlePath) {
        this.TranslateSubtitlePath = TranslateSubtitlePath;
    }

    public AiAnalysisTaskDelLogoOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDelLogoOutput(AiAnalysisTaskDelLogoOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OriginSubtitlePath != null) {
            this.OriginSubtitlePath = new String(source.OriginSubtitlePath);
        }
        if (source.TranslateSubtitlePath != null) {
            this.TranslateSubtitlePath = new String(source.TranslateSubtitlePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OriginSubtitlePath", this.OriginSubtitlePath);
        this.setParamSimple(map, prefix + "TranslateSubtitlePath", this.TranslateSubtitlePath);

    }
}

