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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceBindGatewayResponse extends AbstractModel {

    /**
    * 网关产品ID
    */
    @SerializedName("GatewayProductId")
    @Expose
    private String GatewayProductId;

    /**
    * 网关设备名
    */
    @SerializedName("GatewayDeviceName")
    @Expose
    private String GatewayDeviceName;

    /**
    * 网关产品名称
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 设备对应产品所属的主账号名称
    */
    @SerializedName("GatewayProductOwnerName")
    @Expose
    private String GatewayProductOwnerName;

    /**
    * 设备对应产品所属的主账号 UIN
    */
    @SerializedName("GatewayProductOwnerUin")
    @Expose
    private String GatewayProductOwnerUin;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 网关产品ID 
     * @return GatewayProductId 网关产品ID
     */
    public String getGatewayProductId() {
        return this.GatewayProductId;
    }

    /**
     * Set 网关产品ID
     * @param GatewayProductId 网关产品ID
     */
    public void setGatewayProductId(String GatewayProductId) {
        this.GatewayProductId = GatewayProductId;
    }

    /**
     * Get 网关设备名 
     * @return GatewayDeviceName 网关设备名
     */
    public String getGatewayDeviceName() {
        return this.GatewayDeviceName;
    }

    /**
     * Set 网关设备名
     * @param GatewayDeviceName 网关设备名
     */
    public void setGatewayDeviceName(String GatewayDeviceName) {
        this.GatewayDeviceName = GatewayDeviceName;
    }

    /**
     * Get 网关产品名称 
     * @return GatewayName 网关产品名称
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 网关产品名称
     * @param GatewayName 网关产品名称
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 设备对应产品所属的主账号名称 
     * @return GatewayProductOwnerName 设备对应产品所属的主账号名称
     */
    public String getGatewayProductOwnerName() {
        return this.GatewayProductOwnerName;
    }

    /**
     * Set 设备对应产品所属的主账号名称
     * @param GatewayProductOwnerName 设备对应产品所属的主账号名称
     */
    public void setGatewayProductOwnerName(String GatewayProductOwnerName) {
        this.GatewayProductOwnerName = GatewayProductOwnerName;
    }

    /**
     * Get 设备对应产品所属的主账号 UIN 
     * @return GatewayProductOwnerUin 设备对应产品所属的主账号 UIN
     */
    public String getGatewayProductOwnerUin() {
        return this.GatewayProductOwnerUin;
    }

    /**
     * Set 设备对应产品所属的主账号 UIN
     * @param GatewayProductOwnerUin 设备对应产品所属的主账号 UIN
     */
    public void setGatewayProductOwnerUin(String GatewayProductOwnerUin) {
        this.GatewayProductOwnerUin = GatewayProductOwnerUin;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceBindGatewayResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceBindGatewayResponse(DescribeDeviceBindGatewayResponse source) {
        if (source.GatewayProductId != null) {
            this.GatewayProductId = new String(source.GatewayProductId);
        }
        if (source.GatewayDeviceName != null) {
            this.GatewayDeviceName = new String(source.GatewayDeviceName);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayProductOwnerName != null) {
            this.GatewayProductOwnerName = new String(source.GatewayProductOwnerName);
        }
        if (source.GatewayProductOwnerUin != null) {
            this.GatewayProductOwnerUin = new String(source.GatewayProductOwnerUin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayProductId", this.GatewayProductId);
        this.setParamSimple(map, prefix + "GatewayDeviceName", this.GatewayDeviceName);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayProductOwnerName", this.GatewayProductOwnerName);
        this.setParamSimple(map, prefix + "GatewayProductOwnerUin", this.GatewayProductOwnerUin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

