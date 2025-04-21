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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcceptDirectConnectTunnelRequest extends AbstractModel {

    /**
    * 专用通道ID。可以通过[DescribeDirectConnectTunnel](https://cloud.tencent.com/document/product/216/19819)接口获取。
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
     * Get 专用通道ID。可以通过[DescribeDirectConnectTunnel](https://cloud.tencent.com/document/product/216/19819)接口获取。 
     * @return DirectConnectTunnelId 专用通道ID。可以通过[DescribeDirectConnectTunnel](https://cloud.tencent.com/document/product/216/19819)接口获取。
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * Set 专用通道ID。可以通过[DescribeDirectConnectTunnel](https://cloud.tencent.com/document/product/216/19819)接口获取。
     * @param DirectConnectTunnelId 专用通道ID。可以通过[DescribeDirectConnectTunnel](https://cloud.tencent.com/document/product/216/19819)接口获取。
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    public AcceptDirectConnectTunnelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcceptDirectConnectTunnelRequest(AcceptDirectConnectTunnelRequest source) {
        if (source.DirectConnectTunnelId != null) {
            this.DirectConnectTunnelId = new String(source.DirectConnectTunnelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);

    }
}

