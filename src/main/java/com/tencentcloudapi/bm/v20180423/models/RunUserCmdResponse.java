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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunUserCmdResponse extends AbstractModel{

    /**
    * 运行成功的任务信息列表
    */
    @SerializedName("SuccessTaskInfoSet")
    @Expose
    private SuccessTaskInfo [] SuccessTaskInfoSet;

    /**
    * 运行失败的任务信息列表
    */
    @SerializedName("FailedTaskInfoSet")
    @Expose
    private FailedTaskInfo [] FailedTaskInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 运行成功的任务信息列表 
     * @return SuccessTaskInfoSet 运行成功的任务信息列表
     */
    public SuccessTaskInfo [] getSuccessTaskInfoSet() {
        return this.SuccessTaskInfoSet;
    }

    /**
     * Set 运行成功的任务信息列表
     * @param SuccessTaskInfoSet 运行成功的任务信息列表
     */
    public void setSuccessTaskInfoSet(SuccessTaskInfo [] SuccessTaskInfoSet) {
        this.SuccessTaskInfoSet = SuccessTaskInfoSet;
    }

    /**
     * Get 运行失败的任务信息列表 
     * @return FailedTaskInfoSet 运行失败的任务信息列表
     */
    public FailedTaskInfo [] getFailedTaskInfoSet() {
        return this.FailedTaskInfoSet;
    }

    /**
     * Set 运行失败的任务信息列表
     * @param FailedTaskInfoSet 运行失败的任务信息列表
     */
    public void setFailedTaskInfoSet(FailedTaskInfo [] FailedTaskInfoSet) {
        this.FailedTaskInfoSet = FailedTaskInfoSet;
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
        this.setParamArrayObj(map, prefix + "SuccessTaskInfoSet.", this.SuccessTaskInfoSet);
        this.setParamArrayObj(map, prefix + "FailedTaskInfoSet.", this.FailedTaskInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

