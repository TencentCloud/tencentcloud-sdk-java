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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationSyncConfig extends AbstractModel {

    /**
    * 同步任务的目标地域
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
    * HsmClusterId为空表示公有云共享版，如果不为空表示地域下独享版集群。
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
     * Get 同步任务的目标地域 
     * @return DestinationRegion 同步任务的目标地域
     */
    public String getDestinationRegion() {
        return this.DestinationRegion;
    }

    /**
     * Set 同步任务的目标地域
     * @param DestinationRegion 同步任务的目标地域
     */
    public void setDestinationRegion(String DestinationRegion) {
        this.DestinationRegion = DestinationRegion;
    }

    /**
     * Get HsmClusterId为空表示公有云共享版，如果不为空表示地域下独享版集群。 
     * @return HsmClusterId HsmClusterId为空表示公有云共享版，如果不为空表示地域下独享版集群。
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HsmClusterId为空表示公有云共享版，如果不为空表示地域下独享版集群。
     * @param HsmClusterId HsmClusterId为空表示公有云共享版，如果不为空表示地域下独享版集群。
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    public DestinationSyncConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestinationSyncConfig(DestinationSyncConfig source) {
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);

    }
}

