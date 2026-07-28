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

public class DeviceIdentityBackupHistoryItem extends AbstractModel {

    /**
    * <p>设备id</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>1:ENABLED-可用2:DISABLE-不可用</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>主要签名key（Base64编码）</p>
    */
    @SerializedName("PrimaryKey")
    @Expose
    private String PrimaryKey;

    /**
    * <p>次要签名key（Base64编码）</p>
    */
    @SerializedName("SecondaryKey")
    @Expose
    private String SecondaryKey;

    /**
    * <p>传播属性列表</p>
    */
    @SerializedName("PropagatingProperties")
    @Expose
    private PropagatingProperty [] PropagatingProperties;

    /**
    * <p>数据来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>修改时间</p><p>单位：毫秒级时间戳</p>
    */
    @SerializedName("ModificationTime")
    @Expose
    private Long ModificationTime;

    /**
     * Get <p>设备id</p> 
     * @return DeviceId <p>设备id</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备id</p>
     * @param DeviceId <p>设备id</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>1:ENABLED-可用2:DISABLE-不可用</p> 
     * @return Status <p>1:ENABLED-可用2:DISABLE-不可用</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>1:ENABLED-可用2:DISABLE-不可用</p>
     * @param Status <p>1:ENABLED-可用2:DISABLE-不可用</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>主要签名key（Base64编码）</p> 
     * @return PrimaryKey <p>主要签名key（Base64编码）</p>
     */
    public String getPrimaryKey() {
        return this.PrimaryKey;
    }

    /**
     * Set <p>主要签名key（Base64编码）</p>
     * @param PrimaryKey <p>主要签名key（Base64编码）</p>
     */
    public void setPrimaryKey(String PrimaryKey) {
        this.PrimaryKey = PrimaryKey;
    }

    /**
     * Get <p>次要签名key（Base64编码）</p> 
     * @return SecondaryKey <p>次要签名key（Base64编码）</p>
     */
    public String getSecondaryKey() {
        return this.SecondaryKey;
    }

    /**
     * Set <p>次要签名key（Base64编码）</p>
     * @param SecondaryKey <p>次要签名key（Base64编码）</p>
     */
    public void setSecondaryKey(String SecondaryKey) {
        this.SecondaryKey = SecondaryKey;
    }

    /**
     * Get <p>传播属性列表</p> 
     * @return PropagatingProperties <p>传播属性列表</p>
     */
    public PropagatingProperty [] getPropagatingProperties() {
        return this.PropagatingProperties;
    }

    /**
     * Set <p>传播属性列表</p>
     * @param PropagatingProperties <p>传播属性列表</p>
     */
    public void setPropagatingProperties(PropagatingProperty [] PropagatingProperties) {
        this.PropagatingProperties = PropagatingProperties;
    }

    /**
     * Get <p>数据来源</p> 
     * @return Source <p>数据来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>数据来源</p>
     * @param Source <p>数据来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>修改时间</p><p>单位：毫秒级时间戳</p> 
     * @return ModificationTime <p>修改时间</p><p>单位：毫秒级时间戳</p>
     */
    public Long getModificationTime() {
        return this.ModificationTime;
    }

    /**
     * Set <p>修改时间</p><p>单位：毫秒级时间戳</p>
     * @param ModificationTime <p>修改时间</p><p>单位：毫秒级时间戳</p>
     */
    public void setModificationTime(Long ModificationTime) {
        this.ModificationTime = ModificationTime;
    }

    public DeviceIdentityBackupHistoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceIdentityBackupHistoryItem(DeviceIdentityBackupHistoryItem source) {
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
        if (source.PropagatingProperties != null) {
            this.PropagatingProperties = new PropagatingProperty[source.PropagatingProperties.length];
            for (int i = 0; i < source.PropagatingProperties.length; i++) {
                this.PropagatingProperties[i] = new PropagatingProperty(source.PropagatingProperties[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ModificationTime != null) {
            this.ModificationTime = new Long(source.ModificationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PrimaryKey", this.PrimaryKey);
        this.setParamSimple(map, prefix + "SecondaryKey", this.SecondaryKey);
        this.setParamArrayObj(map, prefix + "PropagatingProperties.", this.PropagatingProperties);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ModificationTime", this.ModificationTime);

    }
}

