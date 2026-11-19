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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyEndPointsRequest extends AbstractModel {

    /**
    * <p>集群 ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>proxyEndPoint的参数配置</p>
    */
    @SerializedName("ProxyEndPointItems")
    @Expose
    private ProxyEndPointItem [] ProxyEndPointItems;

    /**
     * Get <p>集群 ID。</p> 
     * @return ClusterId <p>集群 ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。</p>
     * @param ClusterId <p>集群 ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>proxyEndPoint的参数配置</p> 
     * @return ProxyEndPointItems <p>proxyEndPoint的参数配置</p>
     */
    public ProxyEndPointItem [] getProxyEndPointItems() {
        return this.ProxyEndPointItems;
    }

    /**
     * Set <p>proxyEndPoint的参数配置</p>
     * @param ProxyEndPointItems <p>proxyEndPoint的参数配置</p>
     */
    public void setProxyEndPointItems(ProxyEndPointItem [] ProxyEndPointItems) {
        this.ProxyEndPointItems = ProxyEndPointItems;
    }

    public CreateProxyEndPointsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyEndPointsRequest(CreateProxyEndPointsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ProxyEndPointItems != null) {
            this.ProxyEndPointItems = new ProxyEndPointItem[source.ProxyEndPointItems.length];
            for (int i = 0; i < source.ProxyEndPointItems.length; i++) {
                this.ProxyEndPointItems[i] = new ProxyEndPointItem(source.ProxyEndPointItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ProxyEndPointItems.", this.ProxyEndPointItems);

    }
}

