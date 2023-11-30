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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFlowPackagesRequest extends AbstractModel {

    /**
    * 页码，从1开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页个数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 流量包的唯一资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 流量包绑定的设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 流量包状态，0：未生效，1：有效期内，2：已过期

    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 页码，从1开始 
     * @return PageNumber 页码，从1开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，从1开始
     * @param PageNumber 页码，从1开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页个数 
     * @return PageSize 每页个数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页个数
     * @param PageSize 每页个数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 流量包的唯一资源ID 
     * @return ResourceId 流量包的唯一资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 流量包的唯一资源ID
     * @param ResourceId 流量包的唯一资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 流量包绑定的设备ID 
     * @return DeviceId 流量包绑定的设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 流量包绑定的设备ID
     * @param DeviceId 流量包绑定的设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 流量包状态，0：未生效，1：有效期内，2：已过期
 
     * @return Status 流量包状态，0：未生效，1：有效期内，2：已过期

     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 流量包状态，0：未生效，1：有效期内，2：已过期

     * @param Status 流量包状态，0：未生效，1：有效期内，2：已过期

     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GetFlowPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowPackagesRequest(GetFlowPackagesRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

