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

public class PornResult extends AbstractModel{

    /**
    * 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败。
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
    * 算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 预留字段，后期用于展示更多识别信息。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 取值'LABEL‘，LABEL表示结论和置信度来自标签分类。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败。 
     * @return Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败。
     * @param Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败。
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
     * Get 算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。 
     * @return Confidence 算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
     * @param Confidence 算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 预留字段，后期用于展示更多识别信息。 
     * @return AdvancedInfo 预留字段，后期用于展示更多识别信息。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 预留字段，后期用于展示更多识别信息。
     * @param AdvancedInfo 预留字段，后期用于展示更多识别信息。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 取值'LABEL‘，LABEL表示结论和置信度来自标签分类。 
     * @return Type 取值'LABEL‘，LABEL表示结论和置信度来自标签分类。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 取值'LABEL‘，LABEL表示结论和置信度来自标签分类。
     * @param Type 取值'LABEL‘，LABEL表示结论和置信度来自标签分类。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

