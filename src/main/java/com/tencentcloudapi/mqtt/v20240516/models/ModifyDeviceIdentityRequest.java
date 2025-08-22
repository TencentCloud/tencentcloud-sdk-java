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

public class ModifyDeviceIdentityRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
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
    * 1:ENABLED-可用
2:DISABLE-不可用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 主要签名key，需要Base64编码。
    */
    @SerializedName("PrimaryKey")
    @Expose
    private String PrimaryKey;

    /**
    * 次要签名key，需要Base64编码。
    */
    @SerializedName("SecondaryKey")
    @Expose
    private String SecondaryKey;

    /**
    * 该设备id的传播属性设置	
    */
    @SerializedName("PropagatingProperties")
    @Expose
    private PropagatingProperty [] PropagatingProperties;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
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
     * Get 1:ENABLED-可用
2:DISABLE-不可用 
     * @return Status 1:ENABLED-可用
2:DISABLE-不可用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 1:ENABLED-可用
2:DISABLE-不可用
     * @param Status 1:ENABLED-可用
2:DISABLE-不可用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 主要签名key，需要Base64编码。 
     * @return PrimaryKey 主要签名key，需要Base64编码。
     */
    public String getPrimaryKey() {
        return this.PrimaryKey;
    }

    /**
     * Set 主要签名key，需要Base64编码。
     * @param PrimaryKey 主要签名key，需要Base64编码。
     */
    public void setPrimaryKey(String PrimaryKey) {
        this.PrimaryKey = PrimaryKey;
    }

    /**
     * Get 次要签名key，需要Base64编码。 
     * @return SecondaryKey 次要签名key，需要Base64编码。
     */
    public String getSecondaryKey() {
        return this.SecondaryKey;
    }

    /**
     * Set 次要签名key，需要Base64编码。
     * @param SecondaryKey 次要签名key，需要Base64编码。
     */
    public void setSecondaryKey(String SecondaryKey) {
        this.SecondaryKey = SecondaryKey;
    }

    /**
     * Get 该设备id的传播属性设置	 
     * @return PropagatingProperties 该设备id的传播属性设置	
     */
    public PropagatingProperty [] getPropagatingProperties() {
        return this.PropagatingProperties;
    }

    /**
     * Set 该设备id的传播属性设置	
     * @param PropagatingProperties 该设备id的传播属性设置	
     */
    public void setPropagatingProperties(PropagatingProperty [] PropagatingProperties) {
        this.PropagatingProperties = PropagatingProperties;
    }

    public ModifyDeviceIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceIdentityRequest(ModifyDeviceIdentityRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PrimaryKey != null) {
            this.PrimaryKey = new String(source.PrimaryKey);
        }
        if (source.SecondaryKey != null) {
            this.SecondaryKey = new String(source.SecondaryKey);
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
        this.setParamArrayObj(map, prefix + "PropagatingProperties.", this.PropagatingProperties);

    }
}

