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

public class ListInfo extends AbstractModel {

    /**
    * <p>推理任务的完整提示词。注：仅当QueryType=1/2/3时有效，否则返回为null。</p>
    */
    @SerializedName("QueryInfo")
    @Expose
    private String QueryInfo;

    /**
    * <p>根据QueryType对应任务的返回内容。注：仅当QueryType=1/2/3时有效，其他情况为null。</p>
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * <p>结构化提取结果。注：仅当QueryType=4时有效，否则返回null。</p>
    */
    @SerializedName("ExtractFields")
    @Expose
    private FieldsInfo [] ExtractFields;

    /**
    * <p>检测到的文本信息，包括内容、坐标以及旋转纠正后的坐标等，具体内容请参见 TextDetection。注：仅当QueryType=0时TextDetections不为空，否则返回null。</p>
    */
    @SerializedName("TextDetections")
    @Expose
    private TextDetection [] TextDetections;

    /**
     * Get <p>推理任务的完整提示词。注：仅当QueryType=1/2/3时有效，否则返回为null。</p> 
     * @return QueryInfo <p>推理任务的完整提示词。注：仅当QueryType=1/2/3时有效，否则返回为null。</p>
     */
    public String getQueryInfo() {
        return this.QueryInfo;
    }

    /**
     * Set <p>推理任务的完整提示词。注：仅当QueryType=1/2/3时有效，否则返回为null。</p>
     * @param QueryInfo <p>推理任务的完整提示词。注：仅当QueryType=1/2/3时有效，否则返回为null。</p>
     */
    public void setQueryInfo(String QueryInfo) {
        this.QueryInfo = QueryInfo;
    }

    /**
     * Get <p>根据QueryType对应任务的返回内容。注：仅当QueryType=1/2/3时有效，其他情况为null。</p> 
     * @return Answer <p>根据QueryType对应任务的返回内容。注：仅当QueryType=1/2/3时有效，其他情况为null。</p>
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>根据QueryType对应任务的返回内容。注：仅当QueryType=1/2/3时有效，其他情况为null。</p>
     * @param Answer <p>根据QueryType对应任务的返回内容。注：仅当QueryType=1/2/3时有效，其他情况为null。</p>
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>结构化提取结果。注：仅当QueryType=4时有效，否则返回null。</p> 
     * @return ExtractFields <p>结构化提取结果。注：仅当QueryType=4时有效，否则返回null。</p>
     */
    public FieldsInfo [] getExtractFields() {
        return this.ExtractFields;
    }

    /**
     * Set <p>结构化提取结果。注：仅当QueryType=4时有效，否则返回null。</p>
     * @param ExtractFields <p>结构化提取结果。注：仅当QueryType=4时有效，否则返回null。</p>
     */
    public void setExtractFields(FieldsInfo [] ExtractFields) {
        this.ExtractFields = ExtractFields;
    }

    /**
     * Get <p>检测到的文本信息，包括内容、坐标以及旋转纠正后的坐标等，具体内容请参见 TextDetection。注：仅当QueryType=0时TextDetections不为空，否则返回null。</p> 
     * @return TextDetections <p>检测到的文本信息，包括内容、坐标以及旋转纠正后的坐标等，具体内容请参见 TextDetection。注：仅当QueryType=0时TextDetections不为空，否则返回null。</p>
     */
    public TextDetection [] getTextDetections() {
        return this.TextDetections;
    }

    /**
     * Set <p>检测到的文本信息，包括内容、坐标以及旋转纠正后的坐标等，具体内容请参见 TextDetection。注：仅当QueryType=0时TextDetections不为空，否则返回null。</p>
     * @param TextDetections <p>检测到的文本信息，包括内容、坐标以及旋转纠正后的坐标等，具体内容请参见 TextDetection。注：仅当QueryType=0时TextDetections不为空，否则返回null。</p>
     */
    public void setTextDetections(TextDetection [] TextDetections) {
        this.TextDetections = TextDetections;
    }

    public ListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListInfo(ListInfo source) {
        if (source.QueryInfo != null) {
            this.QueryInfo = new String(source.QueryInfo);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.ExtractFields != null) {
            this.ExtractFields = new FieldsInfo[source.ExtractFields.length];
            for (int i = 0; i < source.ExtractFields.length; i++) {
                this.ExtractFields[i] = new FieldsInfo(source.ExtractFields[i]);
            }
        }
        if (source.TextDetections != null) {
            this.TextDetections = new TextDetection[source.TextDetections.length];
            for (int i = 0; i < source.TextDetections.length; i++) {
                this.TextDetections[i] = new TextDetection(source.TextDetections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryInfo", this.QueryInfo);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamArrayObj(map, prefix + "ExtractFields.", this.ExtractFields);
        this.setParamArrayObj(map, prefix + "TextDetections.", this.TextDetections);

    }
}

