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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkersInfoResponse extends AbstractModel{

    /**
    * 机器数量
    */
    @SerializedName("WorkerNum")
    @Expose
    private Long WorkerNum;

    /**
    * 机器详细信息
    */
    @SerializedName("WorkerDetail")
    @Expose
    private WorkerDetail [] WorkerDetail;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机器数量 
     * @return WorkerNum 机器数量
     */
    public Long getWorkerNum() {
        return this.WorkerNum;
    }

    /**
     * Set 机器数量
     * @param WorkerNum 机器数量
     */
    public void setWorkerNum(Long WorkerNum) {
        this.WorkerNum = WorkerNum;
    }

    /**
     * Get 机器详细信息 
     * @return WorkerDetail 机器详细信息
     */
    public WorkerDetail [] getWorkerDetail() {
        return this.WorkerDetail;
    }

    /**
     * Set 机器详细信息
     * @param WorkerDetail 机器详细信息
     */
    public void setWorkerDetail(WorkerDetail [] WorkerDetail) {
        this.WorkerDetail = WorkerDetail;
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
        this.setParamSimple(map, prefix + "WorkerNum", this.WorkerNum);
        this.setParamArrayObj(map, prefix + "WorkerDetail.", this.WorkerDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

