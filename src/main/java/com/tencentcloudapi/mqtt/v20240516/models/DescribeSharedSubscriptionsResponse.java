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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSharedSubscriptionsResponse extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 共享组名
    */
    @SerializedName("SharedName")
    @Expose
    private String SharedName;

    /**
    * 共享组下的订阅表达式列表
    */
    @SerializedName("TopicFilter")
    @Expose
    private String [] TopicFilter;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 共享组名 
     * @return SharedName 共享组名
     */
    public String getSharedName() {
        return this.SharedName;
    }

    /**
     * Set 共享组名
     * @param SharedName 共享组名
     */
    public void setSharedName(String SharedName) {
        this.SharedName = SharedName;
    }

    /**
     * Get 共享组下的订阅表达式列表 
     * @return TopicFilter 共享组下的订阅表达式列表
     */
    public String [] getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set 共享组下的订阅表达式列表
     * @param TopicFilter 共享组下的订阅表达式列表
     */
    public void setTopicFilter(String [] TopicFilter) {
        this.TopicFilter = TopicFilter;
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

    public DescribeSharedSubscriptionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSharedSubscriptionsResponse(DescribeSharedSubscriptionsResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SharedName != null) {
            this.SharedName = new String(source.SharedName);
        }
        if (source.TopicFilter != null) {
            this.TopicFilter = new String[source.TopicFilter.length];
            for (int i = 0; i < source.TopicFilter.length; i++) {
                this.TopicFilter[i] = new String(source.TopicFilter[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SharedName", this.SharedName);
        this.setParamArraySimple(map, prefix + "TopicFilter.", this.TopicFilter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

