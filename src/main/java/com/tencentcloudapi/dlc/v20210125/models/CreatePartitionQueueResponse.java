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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePartitionQueueResponse extends AbstractModel {

    /**
    * <p>新创建的资源队列ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>最终生效的队列编码（含系统生成场景），与 DescribePartitionQueues 出参的 QueueName 语义一致</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>队列别名（显示名）</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>新创建的资源队列ID</p> 
     * @return Id <p>新创建的资源队列ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>新创建的资源队列ID</p>
     * @param Id <p>新创建的资源队列ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>最终生效的队列编码（含系统生成场景），与 DescribePartitionQueues 出参的 QueueName 语义一致</p> 
     * @return QueueName <p>最终生效的队列编码（含系统生成场景），与 DescribePartitionQueues 出参的 QueueName 语义一致</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>最终生效的队列编码（含系统生成场景），与 DescribePartitionQueues 出参的 QueueName 语义一致</p>
     * @param QueueName <p>最终生效的队列编码（含系统生成场景），与 DescribePartitionQueues 出参的 QueueName 语义一致</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>队列别名（显示名）</p> 
     * @return Alias <p>队列别名（显示名）</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>队列别名（显示名）</p>
     * @param Alias <p>队列别名（显示名）</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreatePartitionQueueResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartitionQueueResponse(CreatePartitionQueueResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

