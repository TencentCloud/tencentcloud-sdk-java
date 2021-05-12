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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDirectConnectTunnelResponse extends AbstractModel{

    /**
    * 专用通道ID
    */
    @SerializedName("DirectConnectTunnelIdSet")
    @Expose
    private String [] DirectConnectTunnelIdSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 专用通道ID 
     * @return DirectConnectTunnelIdSet 专用通道ID
     */
    public String [] getDirectConnectTunnelIdSet() {
        return this.DirectConnectTunnelIdSet;
    }

    /**
     * Set 专用通道ID
     * @param DirectConnectTunnelIdSet 专用通道ID
     */
    public void setDirectConnectTunnelIdSet(String [] DirectConnectTunnelIdSet) {
        this.DirectConnectTunnelIdSet = DirectConnectTunnelIdSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDirectConnectTunnelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDirectConnectTunnelResponse(CreateDirectConnectTunnelResponse source) {
        if (source.DirectConnectTunnelIdSet != null) {
            this.DirectConnectTunnelIdSet = new String[source.DirectConnectTunnelIdSet.length];
            for (int i = 0; i < source.DirectConnectTunnelIdSet.length; i++) {
                this.DirectConnectTunnelIdSet[i] = new String(source.DirectConnectTunnelIdSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DirectConnectTunnelIdSet.", this.DirectConnectTunnelIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

