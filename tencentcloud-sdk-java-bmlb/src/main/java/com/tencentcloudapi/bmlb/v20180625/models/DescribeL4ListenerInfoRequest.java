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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL4ListenerInfoRequest extends AbstractModel{

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 查找的键值，可用于模糊查找该名称的监听器。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 主机ID或虚机IP列表，可用于获取绑定了该主机的监听器。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。 
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 查找的键值，可用于模糊查找该名称的监听器。 
     * @return SearchKey 查找的键值，可用于模糊查找该名称的监听器。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 查找的键值，可用于模糊查找该名称的监听器。
     * @param SearchKey 查找的键值，可用于模糊查找该名称的监听器。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 主机ID或虚机IP列表，可用于获取绑定了该主机的监听器。 
     * @return InstanceIds 主机ID或虚机IP列表，可用于获取绑定了该主机的监听器。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 主机ID或虚机IP列表，可用于获取绑定了该主机的监听器。
     * @param InstanceIds 主机ID或虚机IP列表，可用于获取绑定了该主机的监听器。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

