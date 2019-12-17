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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateJobRequest extends AbstractModel{

    /**
    * 任务 Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务更新动作，支持：Cancel
    */
    @SerializedName("JobAction")
    @Expose
    private String JobAction;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 任务 Id 
     * @return JobId 任务 Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务 Id
     * @param JobId 任务 Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务更新动作，支持：Cancel 
     * @return JobAction 任务更新动作，支持：Cancel
     */
    public String getJobAction() {
        return this.JobAction;
    }

    /**
     * Set 任务更新动作，支持：Cancel
     * @param JobAction 任务更新动作，支持：Cancel
     */
    public void setJobAction(String JobAction) {
        this.JobAction = JobAction;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobAction", this.JobAction);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

