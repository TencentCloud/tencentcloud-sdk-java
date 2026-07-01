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

public class DescribeClientListRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 客户端数量限制,最大1024，默认1024
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 0:查询在线和离线客户端（默认值）
1:查询在线客户端
2:查询离线客户端
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 在线连接：表示最后的连接时间
离线连接：表示最后的断开连接时间
    */
    @SerializedName("MaxTimestamp")
    @Expose
    private Long MaxTimestamp;

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
     * Get 客户端ID 
     * @return ClientId 客户端ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
     * @param ClientId 客户端ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 客户端数量限制,最大1024，默认1024 
     * @return Number 客户端数量限制,最大1024，默认1024
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 客户端数量限制,最大1024，默认1024
     * @param Number 客户端数量限制,最大1024，默认1024
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 0:查询在线和离线客户端（默认值）
1:查询在线客户端
2:查询离线客户端 
     * @return OnlineStatus 0:查询在线和离线客户端（默认值）
1:查询在线客户端
2:查询离线客户端
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 0:查询在线和离线客户端（默认值）
1:查询在线客户端
2:查询离线客户端
     * @param OnlineStatus 0:查询在线和离线客户端（默认值）
1:查询在线客户端
2:查询离线客户端
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 在线连接：表示最后的连接时间
离线连接：表示最后的断开连接时间 
     * @return MaxTimestamp 在线连接：表示最后的连接时间
离线连接：表示最后的断开连接时间
     */
    public Long getMaxTimestamp() {
        return this.MaxTimestamp;
    }

    /**
     * Set 在线连接：表示最后的连接时间
离线连接：表示最后的断开连接时间
     * @param MaxTimestamp 在线连接：表示最后的连接时间
离线连接：表示最后的断开连接时间
     */
    public void setMaxTimestamp(Long MaxTimestamp) {
        this.MaxTimestamp = MaxTimestamp;
    }

    public DescribeClientListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientListRequest(DescribeClientListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.MaxTimestamp != null) {
            this.MaxTimestamp = new Long(source.MaxTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamSimple(map, prefix + "MaxTimestamp", this.MaxTimestamp);

    }
}

