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
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>客户端ID</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>客户端数量限制,最大1024，默认1024</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>0:查询在线和离线客户端（默认值）<br>1:查询在线客户端<br>2:查询离线客户端</p>
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * <p>在线连接：表示最后的连接时间<br>离线连接：表示最后的断开连接时间</p>
    */
    @SerializedName("MaxTimestamp")
    @Expose
    private Long MaxTimestamp;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>客户端ID</p> 
     * @return ClientId <p>客户端ID</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>客户端ID</p>
     * @param ClientId <p>客户端ID</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>客户端数量限制,最大1024，默认1024</p> 
     * @return Number <p>客户端数量限制,最大1024，默认1024</p>
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>客户端数量限制,最大1024，默认1024</p>
     * @param Number <p>客户端数量限制,最大1024，默认1024</p>
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>0:查询在线和离线客户端（默认值）<br>1:查询在线客户端<br>2:查询离线客户端</p> 
     * @return OnlineStatus <p>0:查询在线和离线客户端（默认值）<br>1:查询在线客户端<br>2:查询离线客户端</p>
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set <p>0:查询在线和离线客户端（默认值）<br>1:查询在线客户端<br>2:查询离线客户端</p>
     * @param OnlineStatus <p>0:查询在线和离线客户端（默认值）<br>1:查询在线客户端<br>2:查询离线客户端</p>
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get <p>在线连接：表示最后的连接时间<br>离线连接：表示最后的断开连接时间</p> 
     * @return MaxTimestamp <p>在线连接：表示最后的连接时间<br>离线连接：表示最后的断开连接时间</p>
     */
    public Long getMaxTimestamp() {
        return this.MaxTimestamp;
    }

    /**
     * Set <p>在线连接：表示最后的连接时间<br>离线连接：表示最后的断开连接时间</p>
     * @param MaxTimestamp <p>在线连接：表示最后的连接时间<br>离线连接：表示最后的断开连接时间</p>
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

