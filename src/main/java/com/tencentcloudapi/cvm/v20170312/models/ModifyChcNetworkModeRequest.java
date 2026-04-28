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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyChcNetworkModeRequest extends AbstractModel {

    /**
    * <p>CHC物理服务器id列表，如[&quot;chc-1a2b3c4d&quot;]</p>
    */
    @SerializedName("ChcIds")
    @Expose
    private String [] ChcIds;

    /**
    * <p>所要切换的网络模式</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
     * Get <p>CHC物理服务器id列表，如[&quot;chc-1a2b3c4d&quot;]</p> 
     * @return ChcIds <p>CHC物理服务器id列表，如[&quot;chc-1a2b3c4d&quot;]</p>
     */
    public String [] getChcIds() {
        return this.ChcIds;
    }

    /**
     * Set <p>CHC物理服务器id列表，如[&quot;chc-1a2b3c4d&quot;]</p>
     * @param ChcIds <p>CHC物理服务器id列表，如[&quot;chc-1a2b3c4d&quot;]</p>
     */
    public void setChcIds(String [] ChcIds) {
        this.ChcIds = ChcIds;
    }

    /**
     * Get <p>所要切换的网络模式</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul> 
     * @return NetworkMode <p>所要切换的网络模式</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set <p>所要切换的网络模式</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
     * @param NetworkMode <p>所要切换的网络模式</p><p>枚举值：</p><ul><li>DEPLOY： 部署网络模式</li><li>BUSINESS： 业务网络模式</li></ul>
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    public ModifyChcNetworkModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyChcNetworkModeRequest(ModifyChcNetworkModeRequest source) {
        if (source.ChcIds != null) {
            this.ChcIds = new String[source.ChcIds.length];
            for (int i = 0; i < source.ChcIds.length; i++) {
                this.ChcIds[i] = new String(source.ChcIds[i]);
            }
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChcIds.", this.ChcIds);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);

    }
}

