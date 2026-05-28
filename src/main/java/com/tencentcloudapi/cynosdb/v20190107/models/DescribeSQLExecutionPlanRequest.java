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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSQLExecutionPlanRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>SQL模板ID</p>
    */
    @SerializedName("TemplateID")
    @Expose
    private String TemplateID;

    /**
    * <p>计划详情序列号</p>
    */
    @SerializedName("PlanDetailId")
    @Expose
    private Long PlanDetailId;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>SQL模板ID</p> 
     * @return TemplateID <p>SQL模板ID</p>
     */
    public String getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set <p>SQL模板ID</p>
     * @param TemplateID <p>SQL模板ID</p>
     */
    public void setTemplateID(String TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get <p>计划详情序列号</p> 
     * @return PlanDetailId <p>计划详情序列号</p>
     */
    public Long getPlanDetailId() {
        return this.PlanDetailId;
    }

    /**
     * Set <p>计划详情序列号</p>
     * @param PlanDetailId <p>计划详情序列号</p>
     */
    public void setPlanDetailId(Long PlanDetailId) {
        this.PlanDetailId = PlanDetailId;
    }

    public DescribeSQLExecutionPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSQLExecutionPlanRequest(DescribeSQLExecutionPlanRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TemplateID != null) {
            this.TemplateID = new String(source.TemplateID);
        }
        if (source.PlanDetailId != null) {
            this.PlanDetailId = new Long(source.PlanDetailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "PlanDetailId", this.PlanDetailId);

    }
}

