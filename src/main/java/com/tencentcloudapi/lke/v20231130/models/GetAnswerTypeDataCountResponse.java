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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAnswerTypeDataCountResponse extends AbstractModel {

    /**
    * 总消息数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 大模型直接回复总数
    */
    @SerializedName("ModelReplyCount")
    @Expose
    private Long ModelReplyCount;

    /**
    * 知识型回复总数
    */
    @SerializedName("KnowledgeCount")
    @Expose
    private Long KnowledgeCount;

    /**
    * 任务流回复总数
    */
    @SerializedName("TaskFlowCount")
    @Expose
    private Long TaskFlowCount;

    /**
    * 搜索引擎回复总数
    */
    @SerializedName("SearchEngineCount")
    @Expose
    private Long SearchEngineCount;

    /**
    * 图片理解回复总数
    */
    @SerializedName("ImageUnderstandingCount")
    @Expose
    private Long ImageUnderstandingCount;

    /**
    * 拒答回复总数
    */
    @SerializedName("RejectCount")
    @Expose
    private Long RejectCount;

    /**
    * 敏感回复总数
    */
    @SerializedName("SensitiveCount")
    @Expose
    private Long SensitiveCount;

    /**
    * 并发超限回复总数
    */
    @SerializedName("ConcurrentLimitCount")
    @Expose
    private Long ConcurrentLimitCount;

    /**
    * 未知问题回复总数
    */
    @SerializedName("UnknownIssuesCount")
    @Expose
    private Long UnknownIssuesCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总消息数 
     * @return Total 总消息数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总消息数
     * @param Total 总消息数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 大模型直接回复总数 
     * @return ModelReplyCount 大模型直接回复总数
     */
    public Long getModelReplyCount() {
        return this.ModelReplyCount;
    }

    /**
     * Set 大模型直接回复总数
     * @param ModelReplyCount 大模型直接回复总数
     */
    public void setModelReplyCount(Long ModelReplyCount) {
        this.ModelReplyCount = ModelReplyCount;
    }

    /**
     * Get 知识型回复总数 
     * @return KnowledgeCount 知识型回复总数
     */
    public Long getKnowledgeCount() {
        return this.KnowledgeCount;
    }

    /**
     * Set 知识型回复总数
     * @param KnowledgeCount 知识型回复总数
     */
    public void setKnowledgeCount(Long KnowledgeCount) {
        this.KnowledgeCount = KnowledgeCount;
    }

    /**
     * Get 任务流回复总数 
     * @return TaskFlowCount 任务流回复总数
     */
    public Long getTaskFlowCount() {
        return this.TaskFlowCount;
    }

    /**
     * Set 任务流回复总数
     * @param TaskFlowCount 任务流回复总数
     */
    public void setTaskFlowCount(Long TaskFlowCount) {
        this.TaskFlowCount = TaskFlowCount;
    }

    /**
     * Get 搜索引擎回复总数 
     * @return SearchEngineCount 搜索引擎回复总数
     */
    public Long getSearchEngineCount() {
        return this.SearchEngineCount;
    }

    /**
     * Set 搜索引擎回复总数
     * @param SearchEngineCount 搜索引擎回复总数
     */
    public void setSearchEngineCount(Long SearchEngineCount) {
        this.SearchEngineCount = SearchEngineCount;
    }

    /**
     * Get 图片理解回复总数 
     * @return ImageUnderstandingCount 图片理解回复总数
     */
    public Long getImageUnderstandingCount() {
        return this.ImageUnderstandingCount;
    }

    /**
     * Set 图片理解回复总数
     * @param ImageUnderstandingCount 图片理解回复总数
     */
    public void setImageUnderstandingCount(Long ImageUnderstandingCount) {
        this.ImageUnderstandingCount = ImageUnderstandingCount;
    }

    /**
     * Get 拒答回复总数 
     * @return RejectCount 拒答回复总数
     */
    public Long getRejectCount() {
        return this.RejectCount;
    }

    /**
     * Set 拒答回复总数
     * @param RejectCount 拒答回复总数
     */
    public void setRejectCount(Long RejectCount) {
        this.RejectCount = RejectCount;
    }

    /**
     * Get 敏感回复总数 
     * @return SensitiveCount 敏感回复总数
     */
    public Long getSensitiveCount() {
        return this.SensitiveCount;
    }

    /**
     * Set 敏感回复总数
     * @param SensitiveCount 敏感回复总数
     */
    public void setSensitiveCount(Long SensitiveCount) {
        this.SensitiveCount = SensitiveCount;
    }

    /**
     * Get 并发超限回复总数 
     * @return ConcurrentLimitCount 并发超限回复总数
     */
    public Long getConcurrentLimitCount() {
        return this.ConcurrentLimitCount;
    }

    /**
     * Set 并发超限回复总数
     * @param ConcurrentLimitCount 并发超限回复总数
     */
    public void setConcurrentLimitCount(Long ConcurrentLimitCount) {
        this.ConcurrentLimitCount = ConcurrentLimitCount;
    }

    /**
     * Get 未知问题回复总数 
     * @return UnknownIssuesCount 未知问题回复总数
     */
    public Long getUnknownIssuesCount() {
        return this.UnknownIssuesCount;
    }

    /**
     * Set 未知问题回复总数
     * @param UnknownIssuesCount 未知问题回复总数
     */
    public void setUnknownIssuesCount(Long UnknownIssuesCount) {
        this.UnknownIssuesCount = UnknownIssuesCount;
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

    public GetAnswerTypeDataCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAnswerTypeDataCountResponse(GetAnswerTypeDataCountResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ModelReplyCount != null) {
            this.ModelReplyCount = new Long(source.ModelReplyCount);
        }
        if (source.KnowledgeCount != null) {
            this.KnowledgeCount = new Long(source.KnowledgeCount);
        }
        if (source.TaskFlowCount != null) {
            this.TaskFlowCount = new Long(source.TaskFlowCount);
        }
        if (source.SearchEngineCount != null) {
            this.SearchEngineCount = new Long(source.SearchEngineCount);
        }
        if (source.ImageUnderstandingCount != null) {
            this.ImageUnderstandingCount = new Long(source.ImageUnderstandingCount);
        }
        if (source.RejectCount != null) {
            this.RejectCount = new Long(source.RejectCount);
        }
        if (source.SensitiveCount != null) {
            this.SensitiveCount = new Long(source.SensitiveCount);
        }
        if (source.ConcurrentLimitCount != null) {
            this.ConcurrentLimitCount = new Long(source.ConcurrentLimitCount);
        }
        if (source.UnknownIssuesCount != null) {
            this.UnknownIssuesCount = new Long(source.UnknownIssuesCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ModelReplyCount", this.ModelReplyCount);
        this.setParamSimple(map, prefix + "KnowledgeCount", this.KnowledgeCount);
        this.setParamSimple(map, prefix + "TaskFlowCount", this.TaskFlowCount);
        this.setParamSimple(map, prefix + "SearchEngineCount", this.SearchEngineCount);
        this.setParamSimple(map, prefix + "ImageUnderstandingCount", this.ImageUnderstandingCount);
        this.setParamSimple(map, prefix + "RejectCount", this.RejectCount);
        this.setParamSimple(map, prefix + "SensitiveCount", this.SensitiveCount);
        this.setParamSimple(map, prefix + "ConcurrentLimitCount", this.ConcurrentLimitCount);
        this.setParamSimple(map, prefix + "UnknownIssuesCount", this.UnknownIssuesCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

