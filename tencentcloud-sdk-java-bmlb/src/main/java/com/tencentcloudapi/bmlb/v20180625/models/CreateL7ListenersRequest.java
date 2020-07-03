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

public class CreateL7ListenersRequest extends AbstractModel{

    /**
    * 负载均衡实例ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 七层监听器信息数组，可以创建多个七层监听器。目前一个负载均衡下面最多允许创建50个七层监听器。
    */
    @SerializedName("ListenerSet")
    @Expose
    private CreateL7Listener [] ListenerSet;

    /**
     * Get 负载均衡实例ID 
     * @return LoadBalancerId 负载均衡实例ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID
     * @param LoadBalancerId 负载均衡实例ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 七层监听器信息数组，可以创建多个七层监听器。目前一个负载均衡下面最多允许创建50个七层监听器。 
     * @return ListenerSet 七层监听器信息数组，可以创建多个七层监听器。目前一个负载均衡下面最多允许创建50个七层监听器。
     */
    public CreateL7Listener [] getListenerSet() {
        return this.ListenerSet;
    }

    /**
     * Set 七层监听器信息数组，可以创建多个七层监听器。目前一个负载均衡下面最多允许创建50个七层监听器。
     * @param ListenerSet 七层监听器信息数组，可以创建多个七层监听器。目前一个负载均衡下面最多允许创建50个七层监听器。
     */
    public void setListenerSet(CreateL7Listener [] ListenerSet) {
        this.ListenerSet = ListenerSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "ListenerSet.", this.ListenerSet);

    }
}

