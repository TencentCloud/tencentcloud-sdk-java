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

public class DescribeCloudStorageEventsByTWeSeePersonRequest extends AbstractModel {

    /**
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>人员 ID</p>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>分页拉取数量，取值范围为 1-100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页拉取偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>人员 ID</p> 
     * @return PersonId <p>人员 ID</p>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>人员 ID</p>
     * @param PersonId <p>人员 ID</p>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>分页拉取数量，取值范围为 1-100</p> 
     * @return Limit <p>分页拉取数量，取值范围为 1-100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页拉取数量，取值范围为 1-100</p>
     * @param Limit <p>分页拉取数量，取值范围为 1-100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页拉取偏移</p> 
     * @return Offset <p>分页拉取偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页拉取偏移</p>
     * @param Offset <p>分页拉取偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p> 
     * @return ChannelId <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
     * @param ChannelId <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DescribeCloudStorageEventsByTWeSeePersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageEventsByTWeSeePersonRequest(DescribeCloudStorageEventsByTWeSeePersonRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

