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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitCheckAttendanceTaskResponse extends AbstractModel{

    /**
    * 任务标识符
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 没有注册的人的ID列表
    */
    @SerializedName("NotRegisteredSet")
    @Expose
    private String [] NotRegisteredSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务标识符 
     * @return JobId 任务标识符
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务标识符
     * @param JobId 任务标识符
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 没有注册的人的ID列表 
     * @return NotRegisteredSet 没有注册的人的ID列表
     */
    public String [] getNotRegisteredSet() {
        return this.NotRegisteredSet;
    }

    /**
     * Set 没有注册的人的ID列表
     * @param NotRegisteredSet 没有注册的人的ID列表
     */
    public void setNotRegisteredSet(String [] NotRegisteredSet) {
        this.NotRegisteredSet = NotRegisteredSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "NotRegisteredSet.", this.NotRegisteredSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

