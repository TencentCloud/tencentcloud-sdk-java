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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayBindDevicesRequest extends AbstractModel{

    /**
    * 网关设备的产品ID
    */
    @SerializedName("GatewayProductId")
    @Expose
    private String GatewayProductId;

    /**
    * 网关设备的设备名
    */
    @SerializedName("GatewayDeviceName")
    @Expose
    private String GatewayDeviceName;

    /**
    * 子产品的ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 分页的偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 网关设备的产品ID 
     * @return GatewayProductId 网关设备的产品ID
     */
    public String getGatewayProductId() {
        return this.GatewayProductId;
    }

    /**
     * Set 网关设备的产品ID
     * @param GatewayProductId 网关设备的产品ID
     */
    public void setGatewayProductId(String GatewayProductId) {
        this.GatewayProductId = GatewayProductId;
    }

    /**
     * Get 网关设备的设备名 
     * @return GatewayDeviceName 网关设备的设备名
     */
    public String getGatewayDeviceName() {
        return this.GatewayDeviceName;
    }

    /**
     * Set 网关设备的设备名
     * @param GatewayDeviceName 网关设备的设备名
     */
    public void setGatewayDeviceName(String GatewayDeviceName) {
        this.GatewayDeviceName = GatewayDeviceName;
    }

    /**
     * Get 子产品的ID 
     * @return ProductId 子产品的ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 子产品的ID
     * @param ProductId 子产品的ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 分页的偏移 
     * @return Offset 分页的偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移
     * @param Offset 分页的偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的页大小 
     * @return Limit 分页的页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的页大小
     * @param Limit 分页的页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGatewayBindDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayBindDevicesRequest(DescribeGatewayBindDevicesRequest source) {
        if (source.GatewayProductId != null) {
            this.GatewayProductId = new String(source.GatewayProductId);
        }
        if (source.GatewayDeviceName != null) {
            this.GatewayDeviceName = new String(source.GatewayDeviceName);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayProductId", this.GatewayProductId);
        this.setParamSimple(map, prefix + "GatewayDeviceName", this.GatewayDeviceName);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

