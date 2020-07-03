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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HLFunction extends AbstractModel{

    /**
    * 是否开启人脸检测
    */
    @SerializedName("EnableFaceDetect")
    @Expose
    private Boolean EnableFaceDetect;

    /**
    * 是否开启表情识别
    */
    @SerializedName("EnableFaceExpression")
    @Expose
    private Boolean EnableFaceExpression;

    /**
    * 是否开启人脸检索
    */
    @SerializedName("EnableFaceIdent")
    @Expose
    private Boolean EnableFaceIdent;

    /**
    * 是否开启视频集锦-老师关键字识别
    */
    @SerializedName("EnableKeywordWonderfulTime")
    @Expose
    private Boolean EnableKeywordWonderfulTime;

    /**
    * 是否开启视频集锦-微笑识别
    */
    @SerializedName("EnableSmileWonderfulTime")
    @Expose
    private Boolean EnableSmileWonderfulTime;

    /**
     * Get 是否开启人脸检测 
     * @return EnableFaceDetect 是否开启人脸检测
     */
    public Boolean getEnableFaceDetect() {
        return this.EnableFaceDetect;
    }

    /**
     * Set 是否开启人脸检测
     * @param EnableFaceDetect 是否开启人脸检测
     */
    public void setEnableFaceDetect(Boolean EnableFaceDetect) {
        this.EnableFaceDetect = EnableFaceDetect;
    }

    /**
     * Get 是否开启表情识别 
     * @return EnableFaceExpression 是否开启表情识别
     */
    public Boolean getEnableFaceExpression() {
        return this.EnableFaceExpression;
    }

    /**
     * Set 是否开启表情识别
     * @param EnableFaceExpression 是否开启表情识别
     */
    public void setEnableFaceExpression(Boolean EnableFaceExpression) {
        this.EnableFaceExpression = EnableFaceExpression;
    }

    /**
     * Get 是否开启人脸检索 
     * @return EnableFaceIdent 是否开启人脸检索
     */
    public Boolean getEnableFaceIdent() {
        return this.EnableFaceIdent;
    }

    /**
     * Set 是否开启人脸检索
     * @param EnableFaceIdent 是否开启人脸检索
     */
    public void setEnableFaceIdent(Boolean EnableFaceIdent) {
        this.EnableFaceIdent = EnableFaceIdent;
    }

    /**
     * Get 是否开启视频集锦-老师关键字识别 
     * @return EnableKeywordWonderfulTime 是否开启视频集锦-老师关键字识别
     */
    public Boolean getEnableKeywordWonderfulTime() {
        return this.EnableKeywordWonderfulTime;
    }

    /**
     * Set 是否开启视频集锦-老师关键字识别
     * @param EnableKeywordWonderfulTime 是否开启视频集锦-老师关键字识别
     */
    public void setEnableKeywordWonderfulTime(Boolean EnableKeywordWonderfulTime) {
        this.EnableKeywordWonderfulTime = EnableKeywordWonderfulTime;
    }

    /**
     * Get 是否开启视频集锦-微笑识别 
     * @return EnableSmileWonderfulTime 是否开启视频集锦-微笑识别
     */
    public Boolean getEnableSmileWonderfulTime() {
        return this.EnableSmileWonderfulTime;
    }

    /**
     * Set 是否开启视频集锦-微笑识别
     * @param EnableSmileWonderfulTime 是否开启视频集锦-微笑识别
     */
    public void setEnableSmileWonderfulTime(Boolean EnableSmileWonderfulTime) {
        this.EnableSmileWonderfulTime = EnableSmileWonderfulTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableFaceDetect", this.EnableFaceDetect);
        this.setParamSimple(map, prefix + "EnableFaceExpression", this.EnableFaceExpression);
        this.setParamSimple(map, prefix + "EnableFaceIdent", this.EnableFaceIdent);
        this.setParamSimple(map, prefix + "EnableKeywordWonderfulTime", this.EnableKeywordWonderfulTime);
        this.setParamSimple(map, prefix + "EnableSmileWonderfulTime", this.EnableSmileWonderfulTime);

    }
}

