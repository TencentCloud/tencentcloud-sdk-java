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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchProxyRequest extends AbstractModel {

    /**
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例 ProxyID，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。  
    */
    @SerializedName("ProxyID")
    @Expose
    private String ProxyID;

    /**
    * 实例 ProxyID列表，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。
    */
    @SerializedName("ProxyIDList")
    @Expose
    private String [] ProxyIDList;

    /**
     * Get 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例 ProxyID，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。   
     * @return ProxyID 实例 ProxyID，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。  
     */
    public String getProxyID() {
        return this.ProxyID;
    }

    /**
     * Set 实例 ProxyID，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。  
     * @param ProxyID 实例 ProxyID，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。  
     */
    public void setProxyID(String ProxyID) {
        this.ProxyID = ProxyID;
    }

    /**
     * Get 实例 ProxyID列表，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。 
     * @return ProxyIDList 实例 ProxyID列表，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。
     */
    public String [] getProxyIDList() {
        return this.ProxyIDList;
    }

    /**
     * Set 实例 ProxyID列表，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。
     * @param ProxyIDList 实例 ProxyID列表，请通过接口[DescribeInstanceNodeInfo](https://cloud.tencent.com/document/product/239/48603)的返回参数**Proxy**中的**NodeId**获取。
     */
    public void setProxyIDList(String [] ProxyIDList) {
        this.ProxyIDList = ProxyIDList;
    }

    public SwitchProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchProxyRequest(SwitchProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyID != null) {
            this.ProxyID = new String(source.ProxyID);
        }
        if (source.ProxyIDList != null) {
            this.ProxyIDList = new String[source.ProxyIDList.length];
            for (int i = 0; i < source.ProxyIDList.length; i++) {
                this.ProxyIDList[i] = new String(source.ProxyIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyID", this.ProxyID);
        this.setParamArraySimple(map, prefix + "ProxyIDList.", this.ProxyIDList);

    }
}

