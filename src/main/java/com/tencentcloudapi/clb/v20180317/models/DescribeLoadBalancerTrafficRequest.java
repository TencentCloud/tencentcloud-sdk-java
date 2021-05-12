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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancerTrafficRequest extends AbstractModel{

    /**
    * 负载均衡所在地域，不传默认返回所有地域负载均衡。
    */
    @SerializedName("LoadBalancerRegion")
    @Expose
    private String LoadBalancerRegion;

    /**
     * Get 负载均衡所在地域，不传默认返回所有地域负载均衡。 
     * @return LoadBalancerRegion 负载均衡所在地域，不传默认返回所有地域负载均衡。
     */
    public String getLoadBalancerRegion() {
        return this.LoadBalancerRegion;
    }

    /**
     * Set 负载均衡所在地域，不传默认返回所有地域负载均衡。
     * @param LoadBalancerRegion 负载均衡所在地域，不传默认返回所有地域负载均衡。
     */
    public void setLoadBalancerRegion(String LoadBalancerRegion) {
        this.LoadBalancerRegion = LoadBalancerRegion;
    }

    public DescribeLoadBalancerTrafficRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancerTrafficRequest(DescribeLoadBalancerTrafficRequest source) {
        if (source.LoadBalancerRegion != null) {
            this.LoadBalancerRegion = new String(source.LoadBalancerRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerRegion", this.LoadBalancerRegion);

    }
}

