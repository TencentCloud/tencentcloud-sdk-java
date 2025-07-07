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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL7ListenerInfoRequest extends AbstractModel {

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 查找的键值，可用于模糊查找有该转发域名的监听器。
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
    * 是否获取转发规则下的主机信息。默认为0，不获取。
    */
    @SerializedName("IfGetBackendInfo")
    @Expose
    private Long IfGetBackendInfo;

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
     * Get 查找的键值，可用于模糊查找有该转发域名的监听器。 
     * @return SearchKey 查找的键值，可用于模糊查找有该转发域名的监听器。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 查找的键值，可用于模糊查找有该转发域名的监听器。
     * @param SearchKey 查找的键值，可用于模糊查找有该转发域名的监听器。
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
     * Get 是否获取转发规则下的主机信息。默认为0，不获取。 
     * @return IfGetBackendInfo 是否获取转发规则下的主机信息。默认为0，不获取。
     */
    public Long getIfGetBackendInfo() {
        return this.IfGetBackendInfo;
    }

    /**
     * Set 是否获取转发规则下的主机信息。默认为0，不获取。
     * @param IfGetBackendInfo 是否获取转发规则下的主机信息。默认为0，不获取。
     */
    public void setIfGetBackendInfo(Long IfGetBackendInfo) {
        this.IfGetBackendInfo = IfGetBackendInfo;
    }

    public DescribeL7ListenerInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL7ListenerInfoRequest(DescribeL7ListenerInfoRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.IfGetBackendInfo != null) {
            this.IfGetBackendInfo = new Long(source.IfGetBackendInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "IfGetBackendInfo", this.IfGetBackendInfo);

    }
}

