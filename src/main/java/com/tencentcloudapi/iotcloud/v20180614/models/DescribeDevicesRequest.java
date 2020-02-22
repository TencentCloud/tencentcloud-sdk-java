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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesRequest extends AbstractModel{

    /**
    * 需要查看设备列表的产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 偏移量，Offset从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的大小，数值范围 10-250
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 设备固件版本号，若不带此参数会返回所有固件版本的设备
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
     * Get 需要查看设备列表的产品 ID 
     * @return ProductId 需要查看设备列表的产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 需要查看设备列表的产品 ID
     * @param ProductId 需要查看设备列表的产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 偏移量，Offset从0开始 
     * @return Offset 偏移量，Offset从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，Offset从0开始
     * @param Offset 偏移量，Offset从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的大小，数值范围 10-250 
     * @return Limit 分页的大小，数值范围 10-250
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的大小，数值范围 10-250
     * @param Limit 分页的大小，数值范围 10-250
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 设备固件版本号，若不带此参数会返回所有固件版本的设备 
     * @return FirmwareVersion 设备固件版本号，若不带此参数会返回所有固件版本的设备
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set 设备固件版本号，若不带此参数会返回所有固件版本的设备
     * @param FirmwareVersion 设备固件版本号，若不带此参数会返回所有固件版本的设备
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);

    }
}

