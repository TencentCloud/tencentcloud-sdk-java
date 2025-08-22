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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceIdentityItem extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设备id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 1:ENABLED-可用2:DISABLE-不可用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 主要签名key，不传则由系统自动生成
    */
    @SerializedName("PrimaryKey")
    @Expose
    private String PrimaryKey;

    /**
    * 次要签名key，不传则由系统自动生成
    */
    @SerializedName("SecondaryKey")
    @Expose
    private String SecondaryKey;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 传播属性列表
    */
    @SerializedName("PropagatingProperties")
    @Expose
    private PropagatingProperty [] PropagatingProperties;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设备id 
     * @return DeviceId 设备id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id
     * @param DeviceId 设备id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 1:ENABLED-可用2:DISABLE-不可用 
     * @return Status 1:ENABLED-可用2:DISABLE-不可用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1:ENABLED-可用2:DISABLE-不可用
     * @param Status 1:ENABLED-可用2:DISABLE-不可用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 主要签名key，不传则由系统自动生成 
     * @return PrimaryKey 主要签名key，不传则由系统自动生成
     */
    public String getPrimaryKey() {
        return this.PrimaryKey;
    }

    /**
     * Set 主要签名key，不传则由系统自动生成
     * @param PrimaryKey 主要签名key，不传则由系统自动生成
     */
    public void setPrimaryKey(String PrimaryKey) {
        this.PrimaryKey = PrimaryKey;
    }

    /**
     * Get 次要签名key，不传则由系统自动生成 
     * @return SecondaryKey 次要签名key，不传则由系统自动生成
     */
    public String getSecondaryKey() {
        return this.SecondaryKey;
    }

    /**
     * Set 次要签名key，不传则由系统自动生成
     * @param SecondaryKey 次要签名key，不传则由系统自动生成
     */
    public void setSecondaryKey(String SecondaryKey) {
        this.SecondaryKey = SecondaryKey;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 传播属性列表 
     * @return PropagatingProperties 传播属性列表
     */
    public PropagatingProperty [] getPropagatingProperties() {
        return this.PropagatingProperties;
    }

    /**
     * Set 传播属性列表
     * @param PropagatingProperties 传播属性列表
     */
    public void setPropagatingProperties(PropagatingProperty [] PropagatingProperties) {
        this.PropagatingProperties = PropagatingProperties;
    }

    public DeviceIdentityItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceIdentityItem(DeviceIdentityItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PrimaryKey != null) {
            this.PrimaryKey = new String(source.PrimaryKey);
        }
        if (source.SecondaryKey != null) {
            this.SecondaryKey = new String(source.SecondaryKey);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.PropagatingProperties != null) {
            this.PropagatingProperties = new PropagatingProperty[source.PropagatingProperties.length];
            for (int i = 0; i < source.PropagatingProperties.length; i++) {
                this.PropagatingProperties[i] = new PropagatingProperty(source.PropagatingProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PrimaryKey", this.PrimaryKey);
        this.setParamSimple(map, prefix + "SecondaryKey", this.SecondaryKey);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "PropagatingProperties.", this.PropagatingProperties);

    }
}

