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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardLoadBalancerIdentification extends AbstractModel {

    /**
    * <p>负载均衡器ID</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>应用型负载均衡监听器 ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>转发规则ID，注意：针对七层监听器此参数必填</p>
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * <p>监听器或转发路径需解绑的端口号列表。</p><p>取值范围：[1, 65535]</p><p>不传递该参数时，默认解绑指定监听器或转发路径关联的所有端口。</p>
    */
    @SerializedName("PortList")
    @Expose
    private Long [] PortList;

    /**
     * Get <p>负载均衡器ID</p> 
     * @return LoadBalancerId <p>负载均衡器ID</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡器ID</p>
     * @param LoadBalancerId <p>负载均衡器ID</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>应用型负载均衡监听器 ID</p> 
     * @return ListenerId <p>应用型负载均衡监听器 ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>应用型负载均衡监听器 ID</p>
     * @param ListenerId <p>应用型负载均衡监听器 ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>转发规则ID，注意：针对七层监听器此参数必填</p> 
     * @return LocationId <p>转发规则ID，注意：针对七层监听器此参数必填</p>
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set <p>转发规则ID，注意：针对七层监听器此参数必填</p>
     * @param LocationId <p>转发规则ID，注意：针对七层监听器此参数必填</p>
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get <p>监听器或转发路径需解绑的端口号列表。</p><p>取值范围：[1, 65535]</p><p>不传递该参数时，默认解绑指定监听器或转发路径关联的所有端口。</p> 
     * @return PortList <p>监听器或转发路径需解绑的端口号列表。</p><p>取值范围：[1, 65535]</p><p>不传递该参数时，默认解绑指定监听器或转发路径关联的所有端口。</p>
     */
    public Long [] getPortList() {
        return this.PortList;
    }

    /**
     * Set <p>监听器或转发路径需解绑的端口号列表。</p><p>取值范围：[1, 65535]</p><p>不传递该参数时，默认解绑指定监听器或转发路径关联的所有端口。</p>
     * @param PortList <p>监听器或转发路径需解绑的端口号列表。</p><p>取值范围：[1, 65535]</p><p>不传递该参数时，默认解绑指定监听器或转发路径关联的所有端口。</p>
     */
    public void setPortList(Long [] PortList) {
        this.PortList = PortList;
    }

    public ForwardLoadBalancerIdentification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardLoadBalancerIdentification(ForwardLoadBalancerIdentification source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.PortList != null) {
            this.PortList = new Long[source.PortList.length];
            for (int i = 0; i < source.PortList.length; i++) {
                this.PortList[i] = new Long(source.PortList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamArraySimple(map, prefix + "PortList.", this.PortList);

    }
}

