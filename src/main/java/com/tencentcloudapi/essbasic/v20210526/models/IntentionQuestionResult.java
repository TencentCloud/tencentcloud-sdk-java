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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentionQuestionResult extends AbstractModel {

    /**
    * 视频base64（其中包含全程问题和回答音频，mp4格式）

注：`需进行base64解码获取视频文件`
    */
    @SerializedName("Video")
    @Expose
    private String Video;

    /**
    *  和答案匹配结果列表
    */
    @SerializedName("ResultCode")
    @Expose
    private String [] ResultCode;

    /**
    * 回答问题语音识别结果列表
    */
    @SerializedName("AsrResult")
    @Expose
    private String [] AsrResult;

    /**
     * Get 视频base64（其中包含全程问题和回答音频，mp4格式）

注：`需进行base64解码获取视频文件` 
     * @return Video 视频base64（其中包含全程问题和回答音频，mp4格式）

注：`需进行base64解码获取视频文件`
     */
    public String getVideo() {
        return this.Video;
    }

    /**
     * Set 视频base64（其中包含全程问题和回答音频，mp4格式）

注：`需进行base64解码获取视频文件`
     * @param Video 视频base64（其中包含全程问题和回答音频，mp4格式）

注：`需进行base64解码获取视频文件`
     */
    public void setVideo(String Video) {
        this.Video = Video;
    }

    /**
     * Get  和答案匹配结果列表 
     * @return ResultCode  和答案匹配结果列表
     */
    public String [] getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set  和答案匹配结果列表
     * @param ResultCode  和答案匹配结果列表
     */
    public void setResultCode(String [] ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 回答问题语音识别结果列表 
     * @return AsrResult 回答问题语音识别结果列表
     */
    public String [] getAsrResult() {
        return this.AsrResult;
    }

    /**
     * Set 回答问题语音识别结果列表
     * @param AsrResult 回答问题语音识别结果列表
     */
    public void setAsrResult(String [] AsrResult) {
        this.AsrResult = AsrResult;
    }

    public IntentionQuestionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionQuestionResult(IntentionQuestionResult source) {
        if (source.Video != null) {
            this.Video = new String(source.Video);
        }
        if (source.ResultCode != null) {
            this.ResultCode = new String[source.ResultCode.length];
            for (int i = 0; i < source.ResultCode.length; i++) {
                this.ResultCode[i] = new String(source.ResultCode[i]);
            }
        }
        if (source.AsrResult != null) {
            this.AsrResult = new String[source.AsrResult.length];
            for (int i = 0; i < source.AsrResult.length; i++) {
                this.AsrResult[i] = new String(source.AsrResult[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Video", this.Video);
        this.setParamArraySimple(map, prefix + "ResultCode.", this.ResultCode);
        this.setParamArraySimple(map, prefix + "AsrResult.", this.AsrResult);

    }
}

