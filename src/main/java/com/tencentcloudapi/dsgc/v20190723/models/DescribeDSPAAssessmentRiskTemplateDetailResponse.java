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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentRiskTemplateDetailResponse extends AbstractModel {

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板的描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevelId")
    @Expose
    private Long RiskLevelId;

    /**
    * 风险等级名称
    */
    @SerializedName("RiskLevelName")
    @Expose
    private String RiskLevelName;

    /**
    * 脆弱项配置列表
    */
    @SerializedName("RiskItemList")
    @Expose
    private AssessmentRiskItem [] RiskItemList;

    /**
    * 脆弱项配置条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 被任务引用次数
    */
    @SerializedName("TaskCitations")
    @Expose
    private Long TaskCitations;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称 
     * @return TemplateName 模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
     * @param TemplateName 模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板的描述 
     * @return TemplateDescription 模板的描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 模板的描述
     * @param TemplateDescription 模板的描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 风险等级 
     * @return RiskLevelId 风险等级
     */
    public Long getRiskLevelId() {
        return this.RiskLevelId;
    }

    /**
     * Set 风险等级
     * @param RiskLevelId 风险等级
     */
    public void setRiskLevelId(Long RiskLevelId) {
        this.RiskLevelId = RiskLevelId;
    }

    /**
     * Get 风险等级名称 
     * @return RiskLevelName 风险等级名称
     */
    public String getRiskLevelName() {
        return this.RiskLevelName;
    }

    /**
     * Set 风险等级名称
     * @param RiskLevelName 风险等级名称
     */
    public void setRiskLevelName(String RiskLevelName) {
        this.RiskLevelName = RiskLevelName;
    }

    /**
     * Get 脆弱项配置列表 
     * @return RiskItemList 脆弱项配置列表
     */
    public AssessmentRiskItem [] getRiskItemList() {
        return this.RiskItemList;
    }

    /**
     * Set 脆弱项配置列表
     * @param RiskItemList 脆弱项配置列表
     */
    public void setRiskItemList(AssessmentRiskItem [] RiskItemList) {
        this.RiskItemList = RiskItemList;
    }

    /**
     * Get 脆弱项配置条数 
     * @return TotalCount 脆弱项配置条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 脆弱项配置条数
     * @param TotalCount 脆弱项配置条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 被任务引用次数 
     * @return TaskCitations 被任务引用次数
     */
    public Long getTaskCitations() {
        return this.TaskCitations;
    }

    /**
     * Set 被任务引用次数
     * @param TaskCitations 被任务引用次数
     */
    public void setTaskCitations(Long TaskCitations) {
        this.TaskCitations = TaskCitations;
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

    public DescribeDSPAAssessmentRiskTemplateDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentRiskTemplateDetailResponse(DescribeDSPAAssessmentRiskTemplateDetailResponse source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.RiskLevelId != null) {
            this.RiskLevelId = new Long(source.RiskLevelId);
        }
        if (source.RiskLevelName != null) {
            this.RiskLevelName = new String(source.RiskLevelName);
        }
        if (source.RiskItemList != null) {
            this.RiskItemList = new AssessmentRiskItem[source.RiskItemList.length];
            for (int i = 0; i < source.RiskItemList.length; i++) {
                this.RiskItemList[i] = new AssessmentRiskItem(source.RiskItemList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TaskCitations != null) {
            this.TaskCitations = new Long(source.TaskCitations);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "RiskLevelId", this.RiskLevelId);
        this.setParamSimple(map, prefix + "RiskLevelName", this.RiskLevelName);
        this.setParamArrayObj(map, prefix + "RiskItemList.", this.RiskItemList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TaskCitations", this.TaskCitations);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

