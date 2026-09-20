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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckRechargeKafkaServerResponse extends AbstractModel {

    /**
    * <p>Kafka集群可访问状态。</p><ul><li>0：可正常访问 </li><li>-1：broker 连接失败</li><li>-2：sasl 鉴权失败</li><li>-3：ckafka 角色未授权</li><li>-4：topic 列表不存在</li><li>-5：topic 内暂无数据</li><li>-6：用户没有 ckafka 权限</li><li>-7：消费组已经存在</li><li>-8：kafka 实例不存在或已销毁</li><li>-9：Broker 列表为空</li><li>-10：Broker 地址格式不正确</li><li>-11：Broker 端口非整型</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Kafka集群可访问状态。</p><ul><li>0：可正常访问 </li><li>-1：broker 连接失败</li><li>-2：sasl 鉴权失败</li><li>-3：ckafka 角色未授权</li><li>-4：topic 列表不存在</li><li>-5：topic 内暂无数据</li><li>-6：用户没有 ckafka 权限</li><li>-7：消费组已经存在</li><li>-8：kafka 实例不存在或已销毁</li><li>-9：Broker 列表为空</li><li>-10：Broker 地址格式不正确</li><li>-11：Broker 端口非整型</li></ul> 
     * @return Status <p>Kafka集群可访问状态。</p><ul><li>0：可正常访问 </li><li>-1：broker 连接失败</li><li>-2：sasl 鉴权失败</li><li>-3：ckafka 角色未授权</li><li>-4：topic 列表不存在</li><li>-5：topic 内暂无数据</li><li>-6：用户没有 ckafka 权限</li><li>-7：消费组已经存在</li><li>-8：kafka 实例不存在或已销毁</li><li>-9：Broker 列表为空</li><li>-10：Broker 地址格式不正确</li><li>-11：Broker 端口非整型</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Kafka集群可访问状态。</p><ul><li>0：可正常访问 </li><li>-1：broker 连接失败</li><li>-2：sasl 鉴权失败</li><li>-3：ckafka 角色未授权</li><li>-4：topic 列表不存在</li><li>-5：topic 内暂无数据</li><li>-6：用户没有 ckafka 权限</li><li>-7：消费组已经存在</li><li>-8：kafka 实例不存在或已销毁</li><li>-9：Broker 列表为空</li><li>-10：Broker 地址格式不正确</li><li>-11：Broker 端口非整型</li></ul>
     * @param Status <p>Kafka集群可访问状态。</p><ul><li>0：可正常访问 </li><li>-1：broker 连接失败</li><li>-2：sasl 鉴权失败</li><li>-3：ckafka 角色未授权</li><li>-4：topic 列表不存在</li><li>-5：topic 内暂无数据</li><li>-6：用户没有 ckafka 权限</li><li>-7：消费组已经存在</li><li>-8：kafka 实例不存在或已销毁</li><li>-9：Broker 列表为空</li><li>-10：Broker 地址格式不正确</li><li>-11：Broker 端口非整型</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public CheckRechargeKafkaServerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckRechargeKafkaServerResponse(CheckRechargeKafkaServerResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

