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
package com.tencentcloudapi.iotvideo.v20201215.models;

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
    * 分页的大小，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 需要过滤的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

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
     * Get 分页的大小，最大100 
     * @return Limit 分页的大小，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的大小，最大100
     * @param Limit 分页的大小，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 需要过滤的设备名称 
     * @return DeviceName 需要过滤的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 需要过滤的设备名称
     * @param DeviceName 需要过滤的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public DescribeDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDevicesRequest(DescribeDevicesRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

