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

public class AiAnalysisTaskVideoComprehensionOutput extends AbstractModel {

    /**
    * 视频（音频）理解内容详情
    */
    @SerializedName("VideoComprehensionAnalysisResult")
    @Expose
    private String VideoComprehensionAnalysisResult;

    /**
    * 视频（音频）理解扩展信息
    */
    @SerializedName("VideoComprehensionExtInfo")
    @Expose
    private String VideoComprehensionExtInfo;

    /**
    * 视频分镜理解结果
    */
    @SerializedName("VideoComprehensionResultList")
    @Expose
    private VideoComprehensionResultItem [] VideoComprehensionResultList;

    /**
     * Get 视频（音频）理解内容详情 
     * @return VideoComprehensionAnalysisResult 视频（音频）理解内容详情
     */
    public String getVideoComprehensionAnalysisResult() {
        return this.VideoComprehensionAnalysisResult;
    }

    /**
     * Set 视频（音频）理解内容详情
     * @param VideoComprehensionAnalysisResult 视频（音频）理解内容详情
     */
    public void setVideoComprehensionAnalysisResult(String VideoComprehensionAnalysisResult) {
        this.VideoComprehensionAnalysisResult = VideoComprehensionAnalysisResult;
    }

    /**
     * Get 视频（音频）理解扩展信息 
     * @return VideoComprehensionExtInfo 视频（音频）理解扩展信息
     */
    public String getVideoComprehensionExtInfo() {
        return this.VideoComprehensionExtInfo;
    }

    /**
     * Set 视频（音频）理解扩展信息
     * @param VideoComprehensionExtInfo 视频（音频）理解扩展信息
     */
    public void setVideoComprehensionExtInfo(String VideoComprehensionExtInfo) {
        this.VideoComprehensionExtInfo = VideoComprehensionExtInfo;
    }

    /**
     * Get 视频分镜理解结果 
     * @return VideoComprehensionResultList 视频分镜理解结果
     */
    public VideoComprehensionResultItem [] getVideoComprehensionResultList() {
        return this.VideoComprehensionResultList;
    }

    /**
     * Set 视频分镜理解结果
     * @param VideoComprehensionResultList 视频分镜理解结果
     */
    public void setVideoComprehensionResultList(VideoComprehensionResultItem [] VideoComprehensionResultList) {
        this.VideoComprehensionResultList = VideoComprehensionResultList;
    }

    public AiAnalysisTaskVideoComprehensionOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskVideoComprehensionOutput(AiAnalysisTaskVideoComprehensionOutput source) {
        if (source.VideoComprehensionAnalysisResult != null) {
            this.VideoComprehensionAnalysisResult = new String(source.VideoComprehensionAnalysisResult);
        }
        if (source.VideoComprehensionExtInfo != null) {
            this.VideoComprehensionExtInfo = new String(source.VideoComprehensionExtInfo);
        }
        if (source.VideoComprehensionResultList != null) {
            this.VideoComprehensionResultList = new VideoComprehensionResultItem[source.VideoComprehensionResultList.length];
            for (int i = 0; i < source.VideoComprehensionResultList.length; i++) {
                this.VideoComprehensionResultList[i] = new VideoComprehensionResultItem(source.VideoComprehensionResultList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoComprehensionAnalysisResult", this.VideoComprehensionAnalysisResult);
        this.setParamSimple(map, prefix + "VideoComprehensionExtInfo", this.VideoComprehensionExtInfo);
        this.setParamArrayObj(map, prefix + "VideoComprehensionResultList.", this.VideoComprehensionResultList);

    }
}

