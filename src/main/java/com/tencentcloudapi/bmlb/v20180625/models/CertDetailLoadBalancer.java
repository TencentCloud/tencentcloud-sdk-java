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

public class CertDetailLoadBalancer  extends AbstractModel{

    /**
    * 黑石负载均衡实例ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 黑石负载均衡实例名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 该黑石负载均衡所在的VpcId。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 该黑石负载均衡所在的regionId。
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
     * 获取黑石负载均衡实例ID。
     * @return LoadBalancerId 黑石负载均衡实例ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置黑石负载均衡实例ID。
     * @param LoadBalancerId 黑石负载均衡实例ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取黑石负载均衡实例名称。
     * @return LoadBalancerName 黑石负载均衡实例名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * 设置黑石负载均衡实例名称。
     * @param LoadBalancerName 黑石负载均衡实例名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * 获取该黑石负载均衡所在的VpcId。
     * @return VpcId 该黑石负载均衡所在的VpcId。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置该黑石负载均衡所在的VpcId。
     * @param VpcId 该黑石负载均衡所在的VpcId。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取该黑石负载均衡所在的regionId。
     * @return RegionId 该黑石负载均衡所在的regionId。
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置该黑石负载均衡所在的regionId。
     * @param RegionId 该黑石负载均衡所在的regionId。
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

