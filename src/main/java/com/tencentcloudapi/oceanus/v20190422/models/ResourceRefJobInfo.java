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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceRefJobInfo extends AbstractModel{

    /**
    * Job id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Job配置版本
    */
    @SerializedName("JobConfigVersion")
    @Expose
    private Long JobConfigVersion;

    /**
    * 资源版本
    */
    @SerializedName("ResourceVersion")
    @Expose
    private Long ResourceVersion;

    /**
     * Get Job id 
     * @return JobId Job id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job id
     * @param JobId Job id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Job配置版本 
     * @return JobConfigVersion Job配置版本
     */
    public Long getJobConfigVersion() {
        return this.JobConfigVersion;
    }

    /**
     * Set Job配置版本
     * @param JobConfigVersion Job配置版本
     */
    public void setJobConfigVersion(Long JobConfigVersion) {
        this.JobConfigVersion = JobConfigVersion;
    }

    /**
     * Get 资源版本 
     * @return ResourceVersion 资源版本
     */
    public Long getResourceVersion() {
        return this.ResourceVersion;
    }

    /**
     * Set 资源版本
     * @param ResourceVersion 资源版本
     */
    public void setResourceVersion(Long ResourceVersion) {
        this.ResourceVersion = ResourceVersion;
    }

    public ResourceRefJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceRefJobInfo(ResourceRefJobInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobConfigVersion != null) {
            this.JobConfigVersion = new Long(source.JobConfigVersion);
        }
        if (source.ResourceVersion != null) {
            this.ResourceVersion = new Long(source.ResourceVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobConfigVersion", this.JobConfigVersion);
        this.setParamSimple(map, prefix + "ResourceVersion", this.ResourceVersion);

    }
}

