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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQAResponse extends AbstractModel {

    /**
    * <p>分片高亮信息</p>
    */
    @SerializedName("HighlightList")
    @Expose
    private QASegmentHighlight [] HighlightList;

    /**
    * <p>分片内容</p>
    */
    @SerializedName("PageContent")
    @Expose
    private String PageContent;

    /**
    * <p>问题描述</p>
    */
    @SerializedName("QuestionDescription")
    @Expose
    private String QuestionDescription;

    /**
    * <p>相似问列表</p>
    */
    @SerializedName("SimilarQuestionList")
    @Expose
    private SimilarQuestion [] SimilarQuestionList;

    /**
    * <p>基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private QASummary Summary;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>分片高亮信息</p> 
     * @return HighlightList <p>分片高亮信息</p>
     */
    public QASegmentHighlight [] getHighlightList() {
        return this.HighlightList;
    }

    /**
     * Set <p>分片高亮信息</p>
     * @param HighlightList <p>分片高亮信息</p>
     */
    public void setHighlightList(QASegmentHighlight [] HighlightList) {
        this.HighlightList = HighlightList;
    }

    /**
     * Get <p>分片内容</p> 
     * @return PageContent <p>分片内容</p>
     */
    public String getPageContent() {
        return this.PageContent;
    }

    /**
     * Set <p>分片内容</p>
     * @param PageContent <p>分片内容</p>
     */
    public void setPageContent(String PageContent) {
        this.PageContent = PageContent;
    }

    /**
     * Get <p>问题描述</p> 
     * @return QuestionDescription <p>问题描述</p>
     */
    public String getQuestionDescription() {
        return this.QuestionDescription;
    }

    /**
     * Set <p>问题描述</p>
     * @param QuestionDescription <p>问题描述</p>
     */
    public void setQuestionDescription(String QuestionDescription) {
        this.QuestionDescription = QuestionDescription;
    }

    /**
     * Get <p>相似问列表</p> 
     * @return SimilarQuestionList <p>相似问列表</p>
     */
    public SimilarQuestion [] getSimilarQuestionList() {
        return this.SimilarQuestionList;
    }

    /**
     * Set <p>相似问列表</p>
     * @param SimilarQuestionList <p>相似问列表</p>
     */
    public void setSimilarQuestionList(SimilarQuestion [] SimilarQuestionList) {
        this.SimilarQuestionList = SimilarQuestionList;
    }

    /**
     * Get <p>基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary <p>基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QASummary getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary <p>基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(QASummary Summary) {
        this.Summary = Summary;
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

    public DescribeQAResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQAResponse(DescribeQAResponse source) {
        if (source.HighlightList != null) {
            this.HighlightList = new QASegmentHighlight[source.HighlightList.length];
            for (int i = 0; i < source.HighlightList.length; i++) {
                this.HighlightList[i] = new QASegmentHighlight(source.HighlightList[i]);
            }
        }
        if (source.PageContent != null) {
            this.PageContent = new String(source.PageContent);
        }
        if (source.QuestionDescription != null) {
            this.QuestionDescription = new String(source.QuestionDescription);
        }
        if (source.SimilarQuestionList != null) {
            this.SimilarQuestionList = new SimilarQuestion[source.SimilarQuestionList.length];
            for (int i = 0; i < source.SimilarQuestionList.length; i++) {
                this.SimilarQuestionList[i] = new SimilarQuestion(source.SimilarQuestionList[i]);
            }
        }
        if (source.Summary != null) {
            this.Summary = new QASummary(source.Summary);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HighlightList.", this.HighlightList);
        this.setParamSimple(map, prefix + "PageContent", this.PageContent);
        this.setParamSimple(map, prefix + "QuestionDescription", this.QuestionDescription);
        this.setParamArrayObj(map, prefix + "SimilarQuestionList.", this.SimilarQuestionList);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

