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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillOpsMakePlanInstancesRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 补录计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 是否异步模式
    */
    @SerializedName("AsyncMode")
    @Expose
    private Boolean AsyncMode;

    /**
    * 补录计划名
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 补录计划ID 
     * @return PlanId 补录计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 补录计划ID
     * @param PlanId 补录计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 是否异步模式 
     * @return AsyncMode 是否异步模式
     */
    public Boolean getAsyncMode() {
        return this.AsyncMode;
    }

    /**
     * Set 是否异步模式
     * @param AsyncMode 是否异步模式
     */
    public void setAsyncMode(Boolean AsyncMode) {
        this.AsyncMode = AsyncMode;
    }

    /**
     * Get 补录计划名 
     * @return PlanName 补录计划名
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 补录计划名
     * @param PlanName 补录计划名
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    public KillOpsMakePlanInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillOpsMakePlanInstancesRequest(KillOpsMakePlanInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.AsyncMode != null) {
            this.AsyncMode = new Boolean(source.AsyncMode);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "AsyncMode", this.AsyncMode);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);

    }
}

