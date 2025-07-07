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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EduPaperOCRResponse extends AbstractModel {

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
    private Long Angle;

    /**
    * 结构化方式输出，具体内容请点击左侧链接。
    */
    @SerializedName("QuestionBlockInfos")
    @Expose
    private QuestionBlockObj [] QuestionBlockInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测到的文本信息，具体内容请点击左侧链接。 
     * @return EduPaperInfos 检测到的文本信息，具体内容请点击左侧链接。
     */
    public TextEduPaper [] getEduPaperInfos() {
        return this.EduPaperInfos;
    }

    /**
     * Set 检测到的文本信息，具体内容请点击左侧链接。
     * @param EduPaperInfos 检测到的文本信息，具体内容请点击左侧链接。
     */
    public void setEduPaperInfos(TextEduPaper [] EduPaperInfos) {
        this.EduPaperInfos = EduPaperInfos;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。 
     * @return Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
     */
    public Long getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
     * @param Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。
     */
    public void setAngle(Long Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 结构化方式输出，具体内容请点击左侧链接。 
     * @return QuestionBlockInfos 结构化方式输出，具体内容请点击左侧链接。
     */
    public QuestionBlockObj [] getQuestionBlockInfos() {
        return this.QuestionBlockInfos;
    }

    /**
     * Set 结构化方式输出，具体内容请点击左侧链接。
     * @param QuestionBlockInfos 结构化方式输出，具体内容请点击左侧链接。
     */
    public void setQuestionBlockInfos(QuestionBlockObj [] QuestionBlockInfos) {
        this.QuestionBlockInfos = QuestionBlockInfos;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public EduPaperOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EduPaperOCRResponse(EduPaperOCRResponse source) {
        if (source.EduPaperInfos != null) {
            this.EduPaperInfos = new TextEduPaper[source.EduPaperInfos.length];
            for (int i = 0; i < source.EduPaperInfos.length; i++) {
                this.EduPaperInfos[i] = new TextEduPaper(source.EduPaperInfos[i]);
            }
        }
        if (source.Angle != null) {
            this.Angle = new Long(source.Angle);
        }
        if (source.QuestionBlockInfos != null) {
            this.QuestionBlockInfos = new QuestionBlockObj[source.QuestionBlockInfos.length];
            for (int i = 0; i < source.QuestionBlockInfos.length; i++) {
                this.QuestionBlockInfos[i] = new QuestionBlockObj(source.QuestionBlockInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EduPaperInfos.", this.EduPaperInfos);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "QuestionBlockInfos.", this.QuestionBlockInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

