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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetLoadBalancerStartStatusRequest extends AbstractModel {

    /**
    * 操作类型。Start：启动实例，Stop：停止实例。
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器ID。如果该字段为空，则表示操作负载均衡实例，如果不为空，则表示操作监听器。
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
     * Get 操作类型。Start：启动实例，Stop：停止实例。 
     * @return OperationType 操作类型。Start：启动实例，Stop：停止实例。
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型。Start：启动实例，Stop：停止实例。
     * @param OperationType 操作类型。Start：启动实例，Stop：停止实例。
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。 
     * @return LoadBalancerId 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
     * @param LoadBalancerId 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 监听器ID。如果该字段为空，则表示操作负载均衡实例，如果不为空，则表示操作监听器。 
     * @return ListenerIds 监听器ID。如果该字段为空，则表示操作负载均衡实例，如果不为空，则表示操作监听器。
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 监听器ID。如果该字段为空，则表示操作负载均衡实例，如果不为空，则表示操作监听器。
     * @param ListenerIds 监听器ID。如果该字段为空，则表示操作负载均衡实例，如果不为空，则表示操作监听器。
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    public SetLoadBalancerStartStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetLoadBalancerStartStatusRequest(SetLoadBalancerStartStatusRequest source) {
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);

    }
}

