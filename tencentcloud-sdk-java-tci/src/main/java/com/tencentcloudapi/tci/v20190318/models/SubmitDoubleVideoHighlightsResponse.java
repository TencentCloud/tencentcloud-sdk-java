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

public class SubmitDoubleVideoHighlightsResponse extends AbstractModel{

    /**
    * 视频拆条任务ID，用来唯一标识视频拆条任务。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 未注册的人员ID列表。若出现此项，代表评估出现了问题，输入的PersonId中有不在库中的人员ID。
    */
    @SerializedName("NotRegistered")
    @Expose
    private String [] NotRegistered;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 视频拆条任务ID，用来唯一标识视频拆条任务。 
     * @return JobId 视频拆条任务ID，用来唯一标识视频拆条任务。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 视频拆条任务ID，用来唯一标识视频拆条任务。
     * @param JobId 视频拆条任务ID，用来唯一标识视频拆条任务。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 未注册的人员ID列表。若出现此项，代表评估出现了问题，输入的PersonId中有不在库中的人员ID。 
     * @return NotRegistered 未注册的人员ID列表。若出现此项，代表评估出现了问题，输入的PersonId中有不在库中的人员ID。
     */
    public String [] getNotRegistered() {
        return this.NotRegistered;
    }

    /**
     * Set 未注册的人员ID列表。若出现此项，代表评估出现了问题，输入的PersonId中有不在库中的人员ID。
     * @param NotRegistered 未注册的人员ID列表。若出现此项，代表评估出现了问题，输入的PersonId中有不在库中的人员ID。
     */
    public void setNotRegistered(String [] NotRegistered) {
        this.NotRegistered = NotRegistered;
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
        this.setParamArraySimple(map, prefix + "NotRegistered.", this.NotRegistered);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

