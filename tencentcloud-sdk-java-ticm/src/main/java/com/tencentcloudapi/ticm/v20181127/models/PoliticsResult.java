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

public class PoliticsResult extends AbstractModel{

    /**
    * 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
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
    * 图像涉政的分数，0-100之间，分数越高涉政几率越大。
Type为DNA时：
0到75，Suggestion建议为PASS
75到90，Suggestion建议为REVIEW
90到100，Suggestion建议为BLOCK
Type为FACE时：
0到55，Suggestion建议为PASS
55到60，Suggestion建议为REVIEW
60到100，Suggestion建议为BLOCK
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * Type取值为‘FACE’时，人脸识别的结果列表。基于图片中实际检测到的人脸数，返回数组最大值不超过5个。
    */
    @SerializedName("FaceResults")
    @Expose
    private FaceResult [] FaceResults;

    /**
    * 取值'DNA' 或‘FACE’。DNA表示结论和置信度来自图像指纹，FACE表示结论和置信度来自人脸识别。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 鉴政识别返回的详细标签后期开放。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
     * Get 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。 
     * @return Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
     * @param Code 该识别场景的错误码：
0表示成功，
-1表示系统错误，
-2表示引擎错误，
-1400表示图片解码失败，
-1401表示图片不符合规范。
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
     * Get 图像涉政的分数，0-100之间，分数越高涉政几率越大。
Type为DNA时：
0到75，Suggestion建议为PASS
75到90，Suggestion建议为REVIEW
90到100，Suggestion建议为BLOCK
Type为FACE时：
0到55，Suggestion建议为PASS
55到60，Suggestion建议为REVIEW
60到100，Suggestion建议为BLOCK 
     * @return Confidence 图像涉政的分数，0-100之间，分数越高涉政几率越大。
Type为DNA时：
0到75，Suggestion建议为PASS
75到90，Suggestion建议为REVIEW
90到100，Suggestion建议为BLOCK
Type为FACE时：
0到55，Suggestion建议为PASS
55到60，Suggestion建议为REVIEW
60到100，Suggestion建议为BLOCK
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 图像涉政的分数，0-100之间，分数越高涉政几率越大。
Type为DNA时：
0到75，Suggestion建议为PASS
75到90，Suggestion建议为REVIEW
90到100，Suggestion建议为BLOCK
Type为FACE时：
0到55，Suggestion建议为PASS
55到60，Suggestion建议为REVIEW
60到100，Suggestion建议为BLOCK
     * @param Confidence 图像涉政的分数，0-100之间，分数越高涉政几率越大。
Type为DNA时：
0到75，Suggestion建议为PASS
75到90，Suggestion建议为REVIEW
90到100，Suggestion建议为BLOCK
Type为FACE时：
0到55，Suggestion建议为PASS
55到60，Suggestion建议为REVIEW
60到100，Suggestion建议为BLOCK
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Type取值为‘FACE’时，人脸识别的结果列表。基于图片中实际检测到的人脸数，返回数组最大值不超过5个。 
     * @return FaceResults Type取值为‘FACE’时，人脸识别的结果列表。基于图片中实际检测到的人脸数，返回数组最大值不超过5个。
     */
    public FaceResult [] getFaceResults() {
        return this.FaceResults;
    }

    /**
     * Set Type取值为‘FACE’时，人脸识别的结果列表。基于图片中实际检测到的人脸数，返回数组最大值不超过5个。
     * @param FaceResults Type取值为‘FACE’时，人脸识别的结果列表。基于图片中实际检测到的人脸数，返回数组最大值不超过5个。
     */
    public void setFaceResults(FaceResult [] FaceResults) {
        this.FaceResults = FaceResults;
    }

    /**
     * Get 取值'DNA' 或‘FACE’。DNA表示结论和置信度来自图像指纹，FACE表示结论和置信度来自人脸识别。 
     * @return Type 取值'DNA' 或‘FACE’。DNA表示结论和置信度来自图像指纹，FACE表示结论和置信度来自人脸识别。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 取值'DNA' 或‘FACE’。DNA表示结论和置信度来自图像指纹，FACE表示结论和置信度来自人脸识别。
     * @param Type 取值'DNA' 或‘FACE’。DNA表示结论和置信度来自图像指纹，FACE表示结论和置信度来自人脸识别。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 鉴政识别返回的详细标签后期开放。 
     * @return AdvancedInfo 鉴政识别返回的详细标签后期开放。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 鉴政识别返回的详细标签后期开放。
     * @param AdvancedInfo 鉴政识别返回的详细标签后期开放。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "FaceResults.", this.FaceResults);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);

    }
}

