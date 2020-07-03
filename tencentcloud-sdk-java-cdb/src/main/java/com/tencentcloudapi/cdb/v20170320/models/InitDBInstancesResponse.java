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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDBInstancesResponse extends AbstractModel{

    /**
    * 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
    */
    @SerializedName("AsyncRequestIds")
    @Expose
    private String [] AsyncRequestIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果 
     * @return AsyncRequestIds 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
     */
    public String [] getAsyncRequestIds() {
        return this.AsyncRequestIds;
    }

    /**
     * Set 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
     * @param AsyncRequestIds 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
     */
    public void setAsyncRequestIds(String [] AsyncRequestIds) {
        this.AsyncRequestIds = AsyncRequestIds;
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
        this.setParamArraySimple(map, prefix + "AsyncRequestIds.", this.AsyncRequestIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

