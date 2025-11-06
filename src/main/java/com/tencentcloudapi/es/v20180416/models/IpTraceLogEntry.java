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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpTraceLogEntry extends AbstractModel {

    /**
    * 时间
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 访问IP
    */
    @SerializedName("RemoteIp")
    @Expose
    private String RemoteIp;

    /**
    * 溯源类型rsp/req
    */
    @SerializedName("TraceType")
    @Expose
    private String TraceType;

    /**
    * 访问网络类型，公网/私网
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 原始消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 访问uri
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 请求类型或返回状态
    */
    @SerializedName("ReqTypeOrRspStatus")
    @Expose
    private String ReqTypeOrRspStatus;

    /**
    * 集群节点IP
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
     * Get 时间 
     * @return Timestamp 时间
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间
     * @param Timestamp 时间
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 访问IP 
     * @return RemoteIp 访问IP
     */
    public String getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set 访问IP
     * @param RemoteIp 访问IP
     */
    public void setRemoteIp(String RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    /**
     * Get 溯源类型rsp/req 
     * @return TraceType 溯源类型rsp/req
     */
    public String getTraceType() {
        return this.TraceType;
    }

    /**
     * Set 溯源类型rsp/req
     * @param TraceType 溯源类型rsp/req
     */
    public void setTraceType(String TraceType) {
        this.TraceType = TraceType;
    }

    /**
     * Get 访问网络类型，公网/私网 
     * @return NetType 访问网络类型，公网/私网
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 访问网络类型，公网/私网
     * @param NetType 访问网络类型，公网/私网
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 原始消息 
     * @return Message 原始消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 原始消息
     * @param Message 原始消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 访问uri 
     * @return Uri 访问uri
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set 访问uri
     * @param Uri 访问uri
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get 公网IP 
     * @return PublicIp 公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
     * @param PublicIp 公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 请求类型或返回状态 
     * @return ReqTypeOrRspStatus 请求类型或返回状态
     */
    public String getReqTypeOrRspStatus() {
        return this.ReqTypeOrRspStatus;
    }

    /**
     * Set 请求类型或返回状态
     * @param ReqTypeOrRspStatus 请求类型或返回状态
     */
    public void setReqTypeOrRspStatus(String ReqTypeOrRspStatus) {
        this.ReqTypeOrRspStatus = ReqTypeOrRspStatus;
    }

    /**
     * Get 集群节点IP 
     * @return NodeIp 集群节点IP
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 集群节点IP
     * @param NodeIp 集群节点IP
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    public IpTraceLogEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpTraceLogEntry(IpTraceLogEntry source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.RemoteIp != null) {
            this.RemoteIp = new String(source.RemoteIp);
        }
        if (source.TraceType != null) {
            this.TraceType = new String(source.TraceType);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.ReqTypeOrRspStatus != null) {
            this.ReqTypeOrRspStatus = new String(source.ReqTypeOrRspStatus);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RemoteIp", this.RemoteIp);
        this.setParamSimple(map, prefix + "TraceType", this.TraceType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "ReqTypeOrRspStatus", this.ReqTypeOrRspStatus);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);

    }
}

