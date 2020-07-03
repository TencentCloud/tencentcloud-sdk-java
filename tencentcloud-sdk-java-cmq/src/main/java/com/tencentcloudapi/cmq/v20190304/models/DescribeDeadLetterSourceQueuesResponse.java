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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeadLetterSourceQueuesResponse extends AbstractModel{

    /**
    * 满足本次条件的队列个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 死信队列源队列
    */
    @SerializedName("QueueSet")
    @Expose
    private DeadLetterSource [] QueueSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 满足本次条件的队列个数 
     * @return TotalCount 满足本次条件的队列个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足本次条件的队列个数
     * @param TotalCount 满足本次条件的队列个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 死信队列源队列 
     * @return QueueSet 死信队列源队列
     */
    public DeadLetterSource [] getQueueSet() {
        return this.QueueSet;
    }

    /**
     * Set 死信队列源队列
     * @param QueueSet 死信队列源队列
     */
    public void setQueueSet(DeadLetterSource [] QueueSet) {
        this.QueueSet = QueueSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "QueueSet.", this.QueueSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

