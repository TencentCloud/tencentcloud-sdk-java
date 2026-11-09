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

public class DescribeExtractDocAgentJobResponse extends AbstractModel {

    /**
    * <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。</p>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * <p>配置结构化文本信息。AgentType为0按照这个结构返回</p>
    */
    @SerializedName("StructuralList")
    @Expose
    private GroupInfo [] StructuralList;

    /**
    * <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * <p>思考过程</p>
    */
    @SerializedName("ThoughtContent")
    @Expose
    private String ThoughtContent;

    /**
    * <p>定制的json结构字符串，主要用于快速定制输出的agent输出结构。推荐用于POC场景</p>
    */
    @SerializedName("AgentResultJson")
    @Expose
    private String AgentResultJson;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。</p> 
     * @return Angle <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。</p>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。</p>
     * @param Angle <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。</p>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get <p>配置结构化文本信息。AgentType为0按照这个结构返回</p> 
     * @return StructuralList <p>配置结构化文本信息。AgentType为0按照这个结构返回</p>
     */
    public GroupInfo [] getStructuralList() {
        return this.StructuralList;
    }

    /**
     * Set <p>配置结构化文本信息。AgentType为0按照这个结构返回</p>
     * @param StructuralList <p>配置结构化文本信息。AgentType为0按照这个结构返回</p>
     */
    public void setStructuralList(GroupInfo [] StructuralList) {
        this.StructuralList = StructuralList;
    }

    /**
     * Get <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p> 
     * @return ErrorCode <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     * @param ErrorCode <p>任务执行错误码。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p> 
     * @return ErrorMessage <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     * @param ErrorMessage <p>任务执行错误信息。当任务状态不为 FAIL 时，该值为&quot;&quot;。</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p> 
     * @return JobStatus <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     * @param JobStatus <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get <p>思考过程</p> 
     * @return ThoughtContent <p>思考过程</p>
     */
    public String getThoughtContent() {
        return this.ThoughtContent;
    }

    /**
     * Set <p>思考过程</p>
     * @param ThoughtContent <p>思考过程</p>
     */
    public void setThoughtContent(String ThoughtContent) {
        this.ThoughtContent = ThoughtContent;
    }

    /**
     * Get <p>定制的json结构字符串，主要用于快速定制输出的agent输出结构。推荐用于POC场景</p> 
     * @return AgentResultJson <p>定制的json结构字符串，主要用于快速定制输出的agent输出结构。推荐用于POC场景</p>
     */
    public String getAgentResultJson() {
        return this.AgentResultJson;
    }

    /**
     * Set <p>定制的json结构字符串，主要用于快速定制输出的agent输出结构。推荐用于POC场景</p>
     * @param AgentResultJson <p>定制的json结构字符串，主要用于快速定制输出的agent输出结构。推荐用于POC场景</p>
     */
    public void setAgentResultJson(String AgentResultJson) {
        this.AgentResultJson = AgentResultJson;
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

    public DescribeExtractDocAgentJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtractDocAgentJobResponse(DescribeExtractDocAgentJobResponse source) {
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.StructuralList != null) {
            this.StructuralList = new GroupInfo[source.StructuralList.length];
            for (int i = 0; i < source.StructuralList.length; i++) {
                this.StructuralList[i] = new GroupInfo(source.StructuralList[i]);
            }
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.ThoughtContent != null) {
            this.ThoughtContent = new String(source.ThoughtContent);
        }
        if (source.AgentResultJson != null) {
            this.AgentResultJson = new String(source.AgentResultJson);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "StructuralList.", this.StructuralList);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "ThoughtContent", this.ThoughtContent);
        this.setParamSimple(map, prefix + "AgentResultJson", this.AgentResultJson);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

