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
package com.tencentcloudapi.tccatalog.v20241024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TccConnection extends AbstractModel {

    /**
    * 终端节点服务Id
    */
    @SerializedName("EndpointServiceId")
    @Expose
    private String EndpointServiceId;

    /**
    * 元数据连接串
    */
    @SerializedName("MetaStoreUrl")
    @Expose
    private String MetaStoreUrl;

    /**
    * 	网络信息
    */
    @SerializedName("NetWork")
    @Expose
    private NetWork NetWork;

    /**
     * Get 终端节点服务Id 
     * @return EndpointServiceId 终端节点服务Id
     */
    public String getEndpointServiceId() {
        return this.EndpointServiceId;
    }

    /**
     * Set 终端节点服务Id
     * @param EndpointServiceId 终端节点服务Id
     */
    public void setEndpointServiceId(String EndpointServiceId) {
        this.EndpointServiceId = EndpointServiceId;
    }

    /**
     * Get 元数据连接串 
     * @return MetaStoreUrl 元数据连接串
     */
    public String getMetaStoreUrl() {
        return this.MetaStoreUrl;
    }

    /**
     * Set 元数据连接串
     * @param MetaStoreUrl 元数据连接串
     */
    public void setMetaStoreUrl(String MetaStoreUrl) {
        this.MetaStoreUrl = MetaStoreUrl;
    }

    /**
     * Get 	网络信息 
     * @return NetWork 	网络信息
     */
    public NetWork getNetWork() {
        return this.NetWork;
    }

    /**
     * Set 	网络信息
     * @param NetWork 	网络信息
     */
    public void setNetWork(NetWork NetWork) {
        this.NetWork = NetWork;
    }

    public TccConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TccConnection(TccConnection source) {
        if (source.EndpointServiceId != null) {
            this.EndpointServiceId = new String(source.EndpointServiceId);
        }
        if (source.MetaStoreUrl != null) {
            this.MetaStoreUrl = new String(source.MetaStoreUrl);
        }
        if (source.NetWork != null) {
            this.NetWork = new NetWork(source.NetWork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointServiceId", this.EndpointServiceId);
        this.setParamSimple(map, prefix + "MetaStoreUrl", this.MetaStoreUrl);
        this.setParamObj(map, prefix + "NetWork.", this.NetWork);

    }
}

