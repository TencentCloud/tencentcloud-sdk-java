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

public class ForwardLoadBalancer extends AbstractModel {

    /**
    * 负载均衡器ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器 ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 目标规则属性列表。作为入参时，该参数必填。
    */
    @SerializedName("TargetAttributes")
    @Expose
    private TargetAttribute [] TargetAttributes;

    /**
    * 转发规则ID，注意：针对七层监听器此参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 负载均衡实例所属地域，默认取AS服务所在地域。格式与公共参数Region相同，如："ap-guangzhou"。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 负载均衡器ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。 
     * @return LoadBalancerId 负载均衡器ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡器ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     * @param LoadBalancerId 负载均衡器ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器 ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。 
     * @return ListenerId 负载均衡监听器 ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     * @param ListenerId 负载均衡监听器 ID。作为入参时，该参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 目标规则属性列表。作为入参时，该参数必填。 
     * @return TargetAttributes 目标规则属性列表。作为入参时，该参数必填。
     */
    public TargetAttribute [] getTargetAttributes() {
        return this.TargetAttributes;
    }

    /**
     * Set 目标规则属性列表。作为入参时，该参数必填。
     * @param TargetAttributes 目标规则属性列表。作为入参时，该参数必填。
     */
    public void setTargetAttributes(TargetAttribute [] TargetAttributes) {
        this.TargetAttributes = TargetAttributes;
    }

    /**
     * Get 转发规则ID，注意：针对七层监听器此参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。 
     * @return LocationId 转发规则ID，注意：针对七层监听器此参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则ID，注意：针对七层监听器此参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     * @param LocationId 转发规则ID，注意：针对七层监听器此参数必填。可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 负载均衡实例所属地域，默认取AS服务所在地域。格式与公共参数Region相同，如："ap-guangzhou"。 
     * @return Region 负载均衡实例所属地域，默认取AS服务所在地域。格式与公共参数Region相同，如："ap-guangzhou"。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 负载均衡实例所属地域，默认取AS服务所在地域。格式与公共参数Region相同，如："ap-guangzhou"。
     * @param Region 负载均衡实例所属地域，默认取AS服务所在地域。格式与公共参数Region相同，如："ap-guangzhou"。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ForwardLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardLoadBalancer(ForwardLoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.TargetAttributes != null) {
            this.TargetAttributes = new TargetAttribute[source.TargetAttributes.length];
            for (int i = 0; i < source.TargetAttributes.length; i++) {
                this.TargetAttributes[i] = new TargetAttribute(source.TargetAttributes[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "TargetAttributes.", this.TargetAttributes);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

