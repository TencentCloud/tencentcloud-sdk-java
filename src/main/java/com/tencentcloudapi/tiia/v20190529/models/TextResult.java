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

public class TextResult  extends AbstractModel{

    /**
    * 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
-1402表示图片文件太大。
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

Suggestion由Type决定：
Type为 NOTEXT/NORMAL 时，Suggestion为PASS；
Type为 POLITICS/PORN/TERRORISM/ADS 时，Suggestion为BLOCK；
其他情况下Suggestion为REVIEW。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 算法对于识别结果的置信度，0-100之间，值越高，表示对于结论越确定。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 识别到的关键词数组
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 图片中是否包含敏感文本内容。
包含：
NOTEXT：无文本
NORMAL：内容正常
ADS：广告推广
POLITICS：政治
PORN：色情
DRUGS：涉毒
CURSE：谩骂
TERRORISM：暴恐
OTHERS：其他
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 预留字段，后期用于展示更多识别信息。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
     * 获取该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
-1402表示图片文件太大。
     * @return Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
-1402表示图片文件太大。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * 设置该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
-1402表示图片文件太大。
     * @param Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
-1402表示图片文件太大。
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

Suggestion由Type决定：
Type为 NOTEXT/NORMAL 时，Suggestion为PASS；
Type为 POLITICS/PORN/TERRORISM/ADS 时，Suggestion为BLOCK；
其他情况下Suggestion为REVIEW。
     * @return Suggestion 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规

Suggestion由Type决定：
Type为 NOTEXT/NORMAL 时，Suggestion为PASS；
Type为 POLITICS/PORN/TERRORISM/ADS 时，Suggestion为BLOCK；
其他情况下Suggestion为REVIEW。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * 设置识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规

Suggestion由Type决定：
Type为 NOTEXT/NORMAL 时，Suggestion为PASS；
Type为 POLITICS/PORN/TERRORISM/ADS 时，Suggestion为BLOCK；
其他情况下Suggestion为REVIEW。
     * @param Suggestion 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规

Suggestion由Type决定：
Type为 NOTEXT/NORMAL 时，Suggestion为PASS；
Type为 POLITICS/PORN/TERRORISM/ADS 时，Suggestion为BLOCK；
其他情况下Suggestion为REVIEW。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * 获取算法对于识别结果的置信度，0-100之间，值越高，表示对于结论越确定。
     * @return Confidence 算法对于识别结果的置信度，0-100之间，值越高，表示对于结论越确定。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置算法对于识别结果的置信度，0-100之间，值越高，表示对于结论越确定。
     * @param Confidence 算法对于识别结果的置信度，0-100之间，值越高，表示对于结论越确定。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取识别到的关键词数组
     * @return Keywords 识别到的关键词数组
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * 设置识别到的关键词数组
     * @param Keywords 识别到的关键词数组
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * 获取图片中是否包含敏感文本内容。
包含：
NOTEXT：无文本
NORMAL：内容正常
ADS：广告推广
POLITICS：政治
PORN：色情
DRUGS：涉毒
CURSE：谩骂
TERRORISM：暴恐
OTHERS：其他
     * @return Type 图片中是否包含敏感文本内容。
包含：
NOTEXT：无文本
NORMAL：内容正常
ADS：广告推广
POLITICS：政治
PORN：色情
DRUGS：涉毒
CURSE：谩骂
TERRORISM：暴恐
OTHERS：其他
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置图片中是否包含敏感文本内容。
包含：
NOTEXT：无文本
NORMAL：内容正常
ADS：广告推广
POLITICS：政治
PORN：色情
DRUGS：涉毒
CURSE：谩骂
TERRORISM：暴恐
OTHERS：其他
     * @param Type 图片中是否包含敏感文本内容。
包含：
NOTEXT：无文本
NORMAL：内容正常
ADS：广告推广
POLITICS：政治
PORN：色情
DRUGS：涉毒
CURSE：谩骂
TERRORISM：暴恐
OTHERS：其他
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);

    }
}

