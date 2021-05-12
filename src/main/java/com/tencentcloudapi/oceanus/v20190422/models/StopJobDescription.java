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

public class StopJobDescription extends AbstractModel{

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 停止类型，1 停止 2 暂停
    */
    @SerializedName("StopType")
    @Expose
    private Long StopType;

    /**
     * Get 作业Id 
     * @return JobId 作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
     * @param JobId 作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 停止类型，1 停止 2 暂停 
     * @return StopType 停止类型，1 停止 2 暂停
     */
    public Long getStopType() {
        return this.StopType;
    }

    /**
     * Set 停止类型，1 停止 2 暂停
     * @param StopType 停止类型，1 停止 2 暂停
     */
    public void setStopType(Long StopType) {
        this.StopType = StopType;
    }

    public StopJobDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopJobDescription(StopJobDescription source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StopType != null) {
            this.StopType = new Long(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

