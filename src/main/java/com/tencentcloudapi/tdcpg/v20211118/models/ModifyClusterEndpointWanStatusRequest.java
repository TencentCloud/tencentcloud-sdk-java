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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterEndpointWanStatusRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 接入点ID
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * 取值为： 
 - OPEN：开启外网 
 - CLOSE：关闭外网
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 接入点ID 
     * @return EndpointId 接入点ID
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set 接入点ID
     * @param EndpointId 接入点ID
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get 取值为： 
 - OPEN：开启外网 
 - CLOSE：关闭外网 
     * @return WanStatus 取值为： 
 - OPEN：开启外网 
 - CLOSE：关闭外网
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 取值为： 
 - OPEN：开启外网 
 - CLOSE：关闭外网
     * @param WanStatus 取值为： 
 - OPEN：开启外网 
 - CLOSE：关闭外网
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    public ModifyClusterEndpointWanStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterEndpointWanStatusRequest(ModifyClusterEndpointWanStatusRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);

    }
}

