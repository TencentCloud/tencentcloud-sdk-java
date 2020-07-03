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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisgustResult extends AbstractModel{

    /**
    * 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 错误码描述信息。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 图像恶心的分数，0-100之间，分数越高恶心几率越大。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
     * Get 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误。 
     * @return Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误。
     * @param Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 错误码描述信息。 
     * @return Msg 错误码描述信息。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 错误码描述信息。
     * @param Msg 错误码描述信息。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规 
     * @return Suggestion 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
     * @param Suggestion 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 图像恶心的分数，0-100之间，分数越高恶心几率越大。 
     * @return Confidence 图像恶心的分数，0-100之间，分数越高恶心几率越大。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 图像恶心的分数，0-100之间，分数越高恶心几率越大。
     * @param Confidence 图像恶心的分数，0-100之间，分数越高恶心几率越大。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

