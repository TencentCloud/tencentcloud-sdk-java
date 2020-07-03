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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindListenerRealServersRequest extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 待绑定源站列表。如果该监听器的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
    */
    @SerializedName("RealServerBindSet")
    @Expose
    private RealServerBindSetReq [] RealServerBindSet;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 待绑定源站列表。如果该监听器的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。 
     * @return RealServerBindSet 待绑定源站列表。如果该监听器的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
     */
    public RealServerBindSetReq [] getRealServerBindSet() {
        return this.RealServerBindSet;
    }

    /**
     * Set 待绑定源站列表。如果该监听器的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
     * @param RealServerBindSet 待绑定源站列表。如果该监听器的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
     */
    public void setRealServerBindSet(RealServerBindSetReq [] RealServerBindSet) {
        this.RealServerBindSet = RealServerBindSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "RealServerBindSet.", this.RealServerBindSet);

    }
}

