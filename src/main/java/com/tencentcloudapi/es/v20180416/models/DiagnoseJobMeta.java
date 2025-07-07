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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseJobMeta extends AbstractModel {

    /**
    * 智能运维诊断项英文名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 智能运维诊断项中文名
    */
    @SerializedName("JobZhName")
    @Expose
    private String JobZhName;

    /**
    * 智能运维诊断项描述
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
     * Get 智能运维诊断项英文名 
     * @return JobName 智能运维诊断项英文名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 智能运维诊断项英文名
     * @param JobName 智能运维诊断项英文名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 智能运维诊断项中文名 
     * @return JobZhName 智能运维诊断项中文名
     */
    public String getJobZhName() {
        return this.JobZhName;
    }

    /**
     * Set 智能运维诊断项中文名
     * @param JobZhName 智能运维诊断项中文名
     */
    public void setJobZhName(String JobZhName) {
        this.JobZhName = JobZhName;
    }

    /**
     * Get 智能运维诊断项描述 
     * @return JobDescription 智能运维诊断项描述
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set 智能运维诊断项描述
     * @param JobDescription 智能运维诊断项描述
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    public DiagnoseJobMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseJobMeta(DiagnoseJobMeta source) {
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobZhName != null) {
            this.JobZhName = new String(source.JobZhName);
        }
        if (source.JobDescription != null) {
            this.JobDescription = new String(source.JobDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobZhName", this.JobZhName);
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);

    }
}

