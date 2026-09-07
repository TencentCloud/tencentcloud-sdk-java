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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFlowPackagesRequest extends AbstractModel {

    /**
    * <p>页码，从1开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页个数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>流量包的唯一资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>流量包绑定的设备ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>流量包状态，0：未生效，1：有效期内，2：已过期</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>生效时间在此时间之后</p>
    */
    @SerializedName("ActiveTimeStart")
    @Expose
    private String ActiveTimeStart;

    /**
    * <p>生效时间在此时间之前</p>
    */
    @SerializedName("ActiveTimeEnd")
    @Expose
    private String ActiveTimeEnd;

    /**
     * Get <p>页码，从1开始</p> 
     * @return PageNumber <p>页码，从1开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从1开始</p>
     * @param PageNumber <p>页码，从1开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页个数</p> 
     * @return PageSize <p>每页个数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页个数</p>
     * @param PageSize <p>每页个数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>流量包的唯一资源ID</p> 
     * @return ResourceId <p>流量包的唯一资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>流量包的唯一资源ID</p>
     * @param ResourceId <p>流量包的唯一资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>流量包绑定的设备ID</p> 
     * @return DeviceId <p>流量包绑定的设备ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>流量包绑定的设备ID</p>
     * @param DeviceId <p>流量包绑定的设备ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>流量包状态，0：未生效，1：有效期内，2：已过期</p> 
     * @return Status <p>流量包状态，0：未生效，1：有效期内，2：已过期</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>流量包状态，0：未生效，1：有效期内，2：已过期</p>
     * @param Status <p>流量包状态，0：未生效，1：有效期内，2：已过期</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>生效时间在此时间之后</p> 
     * @return ActiveTimeStart <p>生效时间在此时间之后</p>
     */
    public String getActiveTimeStart() {
        return this.ActiveTimeStart;
    }

    /**
     * Set <p>生效时间在此时间之后</p>
     * @param ActiveTimeStart <p>生效时间在此时间之后</p>
     */
    public void setActiveTimeStart(String ActiveTimeStart) {
        this.ActiveTimeStart = ActiveTimeStart;
    }

    /**
     * Get <p>生效时间在此时间之前</p> 
     * @return ActiveTimeEnd <p>生效时间在此时间之前</p>
     */
    public String getActiveTimeEnd() {
        return this.ActiveTimeEnd;
    }

    /**
     * Set <p>生效时间在此时间之前</p>
     * @param ActiveTimeEnd <p>生效时间在此时间之前</p>
     */
    public void setActiveTimeEnd(String ActiveTimeEnd) {
        this.ActiveTimeEnd = ActiveTimeEnd;
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
        if (source.ActiveTimeStart != null) {
            this.ActiveTimeStart = new String(source.ActiveTimeStart);
        }
        if (source.ActiveTimeEnd != null) {
            this.ActiveTimeEnd = new String(source.ActiveTimeEnd);
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
        this.setParamSimple(map, prefix + "ActiveTimeStart", this.ActiveTimeStart);
        this.setParamSimple(map, prefix + "ActiveTimeEnd", this.ActiveTimeEnd);

    }
}

