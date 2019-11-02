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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EduPaperOCRResponse  extends AbstractModel{

    /**
    * 检测到的文本信息，具体内容请点击左侧链接。
    */
    @SerializedName("EduPaperInfos")
    @Expose
    private TextEduPaper [] EduPaperInfos;

    /**
    * 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
    */
    @SerializedName("Angle")
    @Expose
    private Integer Angle;

    /**
    * 结构化方式输出，具体内容请点击左侧链接。
    */
    @SerializedName("QuestionBlockInfos")
    @Expose
    private QuestionBlockObj [] QuestionBlockInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取检测到的文本信息，具体内容请点击左侧链接。
     * @return EduPaperInfos 检测到的文本信息，具体内容请点击左侧链接。
     */
    public TextEduPaper [] getEduPaperInfos() {
        return this.EduPaperInfos;
    }

    /**
     * 设置检测到的文本信息，具体内容请点击左侧链接。
     * @param EduPaperInfos 检测到的文本信息，具体内容请点击左侧链接。
     */
    public void setEduPaperInfos(TextEduPaper [] EduPaperInfos) {
        this.EduPaperInfos = EduPaperInfos;
    }

    /**
     * 获取图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
     * @return Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
     */
    public Integer getAngle() {
        return this.Angle;
    }

    /**
     * 设置图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
     * @param Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
     */
    public void setAngle(Integer Angle) {
        this.Angle = Angle;
    }

    /**
     * 获取结构化方式输出，具体内容请点击左侧链接。
     * @return QuestionBlockInfos 结构化方式输出，具体内容请点击左侧链接。
     */
    public QuestionBlockObj [] getQuestionBlockInfos() {
        return this.QuestionBlockInfos;
    }

    /**
     * 设置结构化方式输出，具体内容请点击左侧链接。
     * @param QuestionBlockInfos 结构化方式输出，具体内容请点击左侧链接。
     */
    public void setQuestionBlockInfos(QuestionBlockObj [] QuestionBlockInfos) {
        this.QuestionBlockInfos = QuestionBlockInfos;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EduPaperInfos.", this.EduPaperInfos);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "QuestionBlockInfos.", this.QuestionBlockInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

