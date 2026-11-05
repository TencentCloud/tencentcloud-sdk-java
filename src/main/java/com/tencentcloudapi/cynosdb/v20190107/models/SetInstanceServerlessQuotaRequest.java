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

public class SetInstanceServerlessQuotaRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例SLS规格配置</p>
    */
    @SerializedName("ServerlessQuotaConfigs")
    @Expose
    private ServerlessQuotaConfig [] ServerlessQuotaConfigs;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例SLS规格配置</p> 
     * @return ServerlessQuotaConfigs <p>实例SLS规格配置</p>
     */
    public ServerlessQuotaConfig [] getServerlessQuotaConfigs() {
        return this.ServerlessQuotaConfigs;
    }

    /**
     * Set <p>实例SLS规格配置</p>
     * @param ServerlessQuotaConfigs <p>实例SLS规格配置</p>
     */
    public void setServerlessQuotaConfigs(ServerlessQuotaConfig [] ServerlessQuotaConfigs) {
        this.ServerlessQuotaConfigs = ServerlessQuotaConfigs;
    }

    public SetInstanceServerlessQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetInstanceServerlessQuotaRequest(SetInstanceServerlessQuotaRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ServerlessQuotaConfigs != null) {
            this.ServerlessQuotaConfigs = new ServerlessQuotaConfig[source.ServerlessQuotaConfigs.length];
            for (int i = 0; i < source.ServerlessQuotaConfigs.length; i++) {
                this.ServerlessQuotaConfigs[i] = new ServerlessQuotaConfig(source.ServerlessQuotaConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ServerlessQuotaConfigs.", this.ServerlessQuotaConfigs);

    }
}

