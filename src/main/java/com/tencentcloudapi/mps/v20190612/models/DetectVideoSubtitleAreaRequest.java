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

public class DetectVideoSubtitleAreaRequest extends AbstractModel {

    /**
    * <p>输入信息，当前仅支持 URL、COS</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>视频的语言，如果明确知道视频的语言可以填写，提高识别准确率。</p><p>枚举值：</p><ul><li>zh_en： 中英</li><li>en： 英语</li><li>ja： 日语</li><li>ko： 韩语</li></ul>
    */
    @SerializedName("VideoLanguage")
    @Expose
    private String VideoLanguage;

    /**
    * <p>扩展参数，默认不填</p>
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
     * Get <p>输入信息，当前仅支持 URL、COS</p> 
     * @return InputInfo <p>输入信息，当前仅支持 URL、COS</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>输入信息，当前仅支持 URL、COS</p>
     * @param InputInfo <p>输入信息，当前仅支持 URL、COS</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>视频的语言，如果明确知道视频的语言可以填写，提高识别准确率。</p><p>枚举值：</p><ul><li>zh_en： 中英</li><li>en： 英语</li><li>ja： 日语</li><li>ko： 韩语</li></ul> 
     * @return VideoLanguage <p>视频的语言，如果明确知道视频的语言可以填写，提高识别准确率。</p><p>枚举值：</p><ul><li>zh_en： 中英</li><li>en： 英语</li><li>ja： 日语</li><li>ko： 韩语</li></ul>
     */
    public String getVideoLanguage() {
        return this.VideoLanguage;
    }

    /**
     * Set <p>视频的语言，如果明确知道视频的语言可以填写，提高识别准确率。</p><p>枚举值：</p><ul><li>zh_en： 中英</li><li>en： 英语</li><li>ja： 日语</li><li>ko： 韩语</li></ul>
     * @param VideoLanguage <p>视频的语言，如果明确知道视频的语言可以填写，提高识别准确率。</p><p>枚举值：</p><ul><li>zh_en： 中英</li><li>en： 英语</li><li>ja： 日语</li><li>ko： 韩语</li></ul>
     */
    public void setVideoLanguage(String VideoLanguage) {
        this.VideoLanguage = VideoLanguage;
    }

    /**
     * Get <p>扩展参数，默认不填</p> 
     * @return UserExtPara <p>扩展参数，默认不填</p>
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set <p>扩展参数，默认不填</p>
     * @param UserExtPara <p>扩展参数，默认不填</p>
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    public DetectVideoSubtitleAreaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectVideoSubtitleAreaRequest(DetectVideoSubtitleAreaRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.VideoLanguage != null) {
            this.VideoLanguage = new String(source.VideoLanguage);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "VideoLanguage", this.VideoLanguage);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);

    }
}

