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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateDDoSEipLoadBalancerRequest extends AbstractModel{

    /**
    * 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资源实例ID对应的高防弹性公网IP。
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * 要绑定的负载均衡ID。负载均衡 ID 形如：lb-0000002i。可通过登录控制台查询，也可通过 DescribeLoadBalancers 接口返回值中的LoadBalancerId获取。
    */
    @SerializedName("LoadBalancerID")
    @Expose
    private String LoadBalancerID;

    /**
    * CLB所在地域，例如：ap-hongkong。
    */
    @SerializedName("LoadBalancerRegion")
    @Expose
    private String LoadBalancerRegion;

    /**
    * CLB内网IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。 
     * @return InstanceId 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
     * @param InstanceId 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资源实例ID对应的高防弹性公网IP。 
     * @return Eip 资源实例ID对应的高防弹性公网IP。
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 资源实例ID对应的高防弹性公网IP。
     * @param Eip 资源实例ID对应的高防弹性公网IP。
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get 要绑定的负载均衡ID。负载均衡 ID 形如：lb-0000002i。可通过登录控制台查询，也可通过 DescribeLoadBalancers 接口返回值中的LoadBalancerId获取。 
     * @return LoadBalancerID 要绑定的负载均衡ID。负载均衡 ID 形如：lb-0000002i。可通过登录控制台查询，也可通过 DescribeLoadBalancers 接口返回值中的LoadBalancerId获取。
     */
    public String getLoadBalancerID() {
        return this.LoadBalancerID;
    }

    /**
     * Set 要绑定的负载均衡ID。负载均衡 ID 形如：lb-0000002i。可通过登录控制台查询，也可通过 DescribeLoadBalancers 接口返回值中的LoadBalancerId获取。
     * @param LoadBalancerID 要绑定的负载均衡ID。负载均衡 ID 形如：lb-0000002i。可通过登录控制台查询，也可通过 DescribeLoadBalancers 接口返回值中的LoadBalancerId获取。
     */
    public void setLoadBalancerID(String LoadBalancerID) {
        this.LoadBalancerID = LoadBalancerID;
    }

    /**
     * Get CLB所在地域，例如：ap-hongkong。 
     * @return LoadBalancerRegion CLB所在地域，例如：ap-hongkong。
     */
    public String getLoadBalancerRegion() {
        return this.LoadBalancerRegion;
    }

    /**
     * Set CLB所在地域，例如：ap-hongkong。
     * @param LoadBalancerRegion CLB所在地域，例如：ap-hongkong。
     */
    public void setLoadBalancerRegion(String LoadBalancerRegion) {
        this.LoadBalancerRegion = LoadBalancerRegion;
    }

    /**
     * Get CLB内网IP 
     * @return Vip CLB内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set CLB内网IP
     * @param Vip CLB内网IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public AssociateDDoSEipLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateDDoSEipLoadBalancerRequest(AssociateDDoSEipLoadBalancerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
        if (source.LoadBalancerID != null) {
            this.LoadBalancerID = new String(source.LoadBalancerID);
        }
        if (source.LoadBalancerRegion != null) {
            this.LoadBalancerRegion = new String(source.LoadBalancerRegion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "LoadBalancerID", this.LoadBalancerID);
        this.setParamSimple(map, prefix + "LoadBalancerRegion", this.LoadBalancerRegion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

