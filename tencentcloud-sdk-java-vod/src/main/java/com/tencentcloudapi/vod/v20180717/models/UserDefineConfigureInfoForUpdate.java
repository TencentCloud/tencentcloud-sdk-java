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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDefineConfigureInfoForUpdate extends AbstractModel{

    /**
    * 用户自定义人物审核控制参数。
    */
    @SerializedName("FaceReviewInfo")
    @Expose
    private UserDefineFaceReviewTemplateInfoForUpdate FaceReviewInfo;

    /**
    * 用户自定义语音审核控制参数。
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private UserDefineAsrTextReviewTemplateInfoForUpdate AsrReviewInfo;

    /**
    * 用户自定义文本审核控制参数。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private UserDefineOcrTextReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get 用户自定义人物审核控制参数。 
     * @return FaceReviewInfo 用户自定义人物审核控制参数。
     */
    public UserDefineFaceReviewTemplateInfoForUpdate getFaceReviewInfo() {
        return this.FaceReviewInfo;
    }

    /**
     * Set 用户自定义人物审核控制参数。
     * @param FaceReviewInfo 用户自定义人物审核控制参数。
     */
    public void setFaceReviewInfo(UserDefineFaceReviewTemplateInfoForUpdate FaceReviewInfo) {
        this.FaceReviewInfo = FaceReviewInfo;
    }

    /**
     * Get 用户自定义语音审核控制参数。 
     * @return AsrReviewInfo 用户自定义语音审核控制参数。
     */
    public UserDefineAsrTextReviewTemplateInfoForUpdate getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set 用户自定义语音审核控制参数。
     * @param AsrReviewInfo 用户自定义语音审核控制参数。
     */
    public void setAsrReviewInfo(UserDefineAsrTextReviewTemplateInfoForUpdate AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get 用户自定义文本审核控制参数。 
     * @return OcrReviewInfo 用户自定义文本审核控制参数。
     */
    public UserDefineOcrTextReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set 用户自定义文本审核控制参数。
     * @param OcrReviewInfo 用户自定义文本审核控制参数。
     */
    public void setOcrReviewInfo(UserDefineOcrTextReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FaceReviewInfo.", this.FaceReviewInfo);
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

