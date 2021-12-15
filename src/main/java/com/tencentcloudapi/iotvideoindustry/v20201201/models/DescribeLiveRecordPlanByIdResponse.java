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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveRecordPlanByIdResponse extends AbstractModel{

    /**
    * 计划名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 存储时间
    */
    @SerializedName("RecordStorageTime")
    @Expose
    private Long RecordStorageTime;

    /**
    * 计划类型
    */
    @SerializedName("PlanType")
    @Expose
    private Long PlanType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 计划名称 
     * @return PlanName 计划名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 计划名称
     * @param PlanName 计划名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
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
     * Get 存储时间 
     * @return RecordStorageTime 存储时间
     */
    public Long getRecordStorageTime() {
        return this.RecordStorageTime;
    }

    /**
     * Set 存储时间
     * @param RecordStorageTime 存储时间
     */
    public void setRecordStorageTime(Long RecordStorageTime) {
        this.RecordStorageTime = RecordStorageTime;
    }

    /**
     * Get 计划类型 
     * @return PlanType 计划类型
     */
    public Long getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 计划类型
     * @param PlanType 计划类型
     */
    public void setPlanType(Long PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLiveRecordPlanByIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveRecordPlanByIdResponse(DescribeLiveRecordPlanByIdResponse source) {
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.RecordStorageTime != null) {
            this.RecordStorageTime = new Long(source.RecordStorageTime);
        }
        if (source.PlanType != null) {
            this.PlanType = new Long(source.PlanType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "RecordStorageTime", this.RecordStorageTime);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

