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

public class GatewayInfo extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>网关名称</p>
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * <p>创建时间，单位：秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>网关状态。0：正常，1：异常</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>网关实例数</p>
    */
    @SerializedName("InstanceSize")
    @Expose
    private Long InstanceSize;

    /**
     * Get <p>网关ID</p> 
     * @return GatewayId <p>网关ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID</p>
     * @param GatewayId <p>网关ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>网关名称</p> 
     * @return GatewayName <p>网关名称</p>
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set <p>网关名称</p>
     * @param GatewayName <p>网关名称</p>
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get <p>创建时间，单位：秒</p> 
     * @return CreateTime <p>创建时间，单位：秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，单位：秒</p>
     * @param CreateTime <p>创建时间，单位：秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>网关状态。0：正常，1：异常</p> 
     * @return Status <p>网关状态。0：正常，1：异常</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>网关状态。0：正常，1：异常</p>
     * @param Status <p>网关状态。0：正常，1：异常</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>网关实例数</p> 
     * @return InstanceSize <p>网关实例数</p>
     */
    public Long getInstanceSize() {
        return this.InstanceSize;
    }

    /**
     * Set <p>网关实例数</p>
     * @param InstanceSize <p>网关实例数</p>
     */
    public void setInstanceSize(Long InstanceSize) {
        this.InstanceSize = InstanceSize;
    }

    public GatewayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayInfo(GatewayInfo source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceSize != null) {
            this.InstanceSize = new Long(source.InstanceSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceSize", this.InstanceSize);

    }
}

