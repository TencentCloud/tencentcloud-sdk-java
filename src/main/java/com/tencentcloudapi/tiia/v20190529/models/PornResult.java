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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PornResult  extends AbstractModel{

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
    * 色情识别类型：
PORN：色情
HOT：性感
NORMAL：正常
FAIL：识别失败
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * 获取该识别场景的错误码：
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
     * 设置该识别场景的错误码：
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
     * 获取错误码描述信息。
     * @return Msg 错误码描述信息。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * 设置错误码描述信息。
     * @param Msg 错误码描述信息。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * 获取识别场景的审核结论：
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
     * 设置识别场景的审核结论：
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
     * 获取算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
     * @return Confidence 算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
     * @param Confidence 算法对于Suggestion的置信度，0-100之间，值越高，表示对于Suggestion越确定。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取预留字段，后期用于展示更多识别信息。
     * @return AdvancedInfo 预留字段，后期用于展示更多识别信息。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * 设置预留字段，后期用于展示更多识别信息。
     * @param AdvancedInfo 预留字段，后期用于展示更多识别信息。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * 获取色情识别类型：
PORN：色情
HOT：性感
NORMAL：正常
FAIL：识别失败
     * @return Type 色情识别类型：
PORN：色情
HOT：性感
NORMAL：正常
FAIL：识别失败
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置色情识别类型：
PORN：色情
HOT：性感
NORMAL：正常
FAIL：识别失败
     * @param Type 色情识别类型：
PORN：色情
HOT：性感
NORMAL：正常
FAIL：识别失败
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 内部实现，用户禁止调用
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

