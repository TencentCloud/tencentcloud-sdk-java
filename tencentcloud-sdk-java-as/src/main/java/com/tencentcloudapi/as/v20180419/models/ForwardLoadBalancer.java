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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardLoadBalancer extends AbstractModel{

    /**
    * 负载均衡器ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 应用型负载均衡监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 目标规则属性列表
    */
    @SerializedName("TargetAttributes")
    @Expose
    private TargetAttribute [] TargetAttributes;

    /**
    * 转发规则ID，注意：针对七层监听器此参数必填
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
     * Get 负载均衡器ID 
     * @return LoadBalancerId 负载均衡器ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡器ID
     * @param LoadBalancerId 负载均衡器ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 应用型负载均衡监听器 ID 
     * @return ListenerId 应用型负载均衡监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 应用型负载均衡监听器 ID
     * @param ListenerId 应用型负载均衡监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 目标规则属性列表 
     * @return TargetAttributes 目标规则属性列表
     */
    public TargetAttribute [] getTargetAttributes() {
        return this.TargetAttributes;
    }

    /**
     * Set 目标规则属性列表
     * @param TargetAttributes 目标规则属性列表
     */
    public void setTargetAttributes(TargetAttribute [] TargetAttributes) {
        this.TargetAttributes = TargetAttributes;
    }

    /**
     * Get 转发规则ID，注意：针对七层监听器此参数必填 
     * @return LocationId 转发规则ID，注意：针对七层监听器此参数必填
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则ID，注意：针对七层监听器此参数必填
     * @param LocationId 转发规则ID，注意：针对七层监听器此参数必填
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

