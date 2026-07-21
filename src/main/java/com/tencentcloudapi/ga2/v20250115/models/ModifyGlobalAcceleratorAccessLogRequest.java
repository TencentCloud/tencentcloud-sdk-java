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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalAcceleratorAccessLogRequest extends AbstractModel {

    /**
    * <p>日志唯一Id</p>
    */
    @SerializedName("LogPushTaskId")
    @Expose
    private String LogPushTaskId;

    /**
    * <p>GA实例唯一Id</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>日志主题Id</p>
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * <p>日志集Id</p>
    */
    @SerializedName("CloudLogSetId")
    @Expose
    private String CloudLogSetId;

    /**
    * <p>用户可选日志监听字段</p><p>枚举值：</p><ul><li>session_time： 四层，会话持续时间</li><li>upstream_bytes_received： 四层、七层，从终端节点接收的字节数</li><li>upstream_bytes_sent： 四层、七层，发送给终端节点的字节数</li><li>request_method： 七层，GET/POST</li><li>scheme： 七层，http/https</li><li>request_uri： 七层，客户端原始请求的URI</li><li>uri： 七层，当前请求的URI</li><li>host： 七层，客户端访问域名（七层）</li><li>remote_user： 七层，基本认证时的用户名（未认证时为&quot;-&quot;）</li><li>http_user_agent： 七层，客户端浏览器标识</li><li>http_referer： 七层，请求来源URL（直接从地址栏访问时为&quot;-&quot;）</li><li>http_x_forwarded_for： 七层，记录客户端原始IP及经过的代理服务器IP链</li><li>content_type： 七层，content_type</li><li>body_bytes_sent： 七层，发送给客户端的http body大小，不包含header</li><li>request_time： 七层，从接收到客户端请求的第一个字节到发送完响应最后一个字节之间的总时间（单位：秒）</li><li>sent_http_content_type： 七层，响应内容类型</li><li>upstream_header_time： 七层，终端节点的响应头到达时间</li><li>upstream_response_length： 七层，终端节点返回的响应体长度</li><li>upstream_response_time： 七层，终端节点完整响应时间</li><li>upstream_status： 七层，终端节点返回的HTTP状态码</li></ul>
    */
    @SerializedName("FieldKeys")
    @Expose
    private String [] FieldKeys;

    /**
    * <p>日志描述</p>
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
     * Get <p>日志唯一Id</p> 
     * @return LogPushTaskId <p>日志唯一Id</p>
     */
    public String getLogPushTaskId() {
        return this.LogPushTaskId;
    }

    /**
     * Set <p>日志唯一Id</p>
     * @param LogPushTaskId <p>日志唯一Id</p>
     */
    public void setLogPushTaskId(String LogPushTaskId) {
        this.LogPushTaskId = LogPushTaskId;
    }

    /**
     * Get <p>GA实例唯一Id</p> 
     * @return GlobalAcceleratorId <p>GA实例唯一Id</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>GA实例唯一Id</p>
     * @param GlobalAcceleratorId <p>GA实例唯一Id</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>日志主题Id</p> 
     * @return CloudLogId <p>日志主题Id</p>
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set <p>日志主题Id</p>
     * @param CloudLogId <p>日志主题Id</p>
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get <p>日志集Id</p> 
     * @return CloudLogSetId <p>日志集Id</p>
     */
    public String getCloudLogSetId() {
        return this.CloudLogSetId;
    }

    /**
     * Set <p>日志集Id</p>
     * @param CloudLogSetId <p>日志集Id</p>
     */
    public void setCloudLogSetId(String CloudLogSetId) {
        this.CloudLogSetId = CloudLogSetId;
    }

    /**
     * Get <p>用户可选日志监听字段</p><p>枚举值：</p><ul><li>session_time： 四层，会话持续时间</li><li>upstream_bytes_received： 四层、七层，从终端节点接收的字节数</li><li>upstream_bytes_sent： 四层、七层，发送给终端节点的字节数</li><li>request_method： 七层，GET/POST</li><li>scheme： 七层，http/https</li><li>request_uri： 七层，客户端原始请求的URI</li><li>uri： 七层，当前请求的URI</li><li>host： 七层，客户端访问域名（七层）</li><li>remote_user： 七层，基本认证时的用户名（未认证时为&quot;-&quot;）</li><li>http_user_agent： 七层，客户端浏览器标识</li><li>http_referer： 七层，请求来源URL（直接从地址栏访问时为&quot;-&quot;）</li><li>http_x_forwarded_for： 七层，记录客户端原始IP及经过的代理服务器IP链</li><li>content_type： 七层，content_type</li><li>body_bytes_sent： 七层，发送给客户端的http body大小，不包含header</li><li>request_time： 七层，从接收到客户端请求的第一个字节到发送完响应最后一个字节之间的总时间（单位：秒）</li><li>sent_http_content_type： 七层，响应内容类型</li><li>upstream_header_time： 七层，终端节点的响应头到达时间</li><li>upstream_response_length： 七层，终端节点返回的响应体长度</li><li>upstream_response_time： 七层，终端节点完整响应时间</li><li>upstream_status： 七层，终端节点返回的HTTP状态码</li></ul> 
     * @return FieldKeys <p>用户可选日志监听字段</p><p>枚举值：</p><ul><li>session_time： 四层，会话持续时间</li><li>upstream_bytes_received： 四层、七层，从终端节点接收的字节数</li><li>upstream_bytes_sent： 四层、七层，发送给终端节点的字节数</li><li>request_method： 七层，GET/POST</li><li>scheme： 七层，http/https</li><li>request_uri： 七层，客户端原始请求的URI</li><li>uri： 七层，当前请求的URI</li><li>host： 七层，客户端访问域名（七层）</li><li>remote_user： 七层，基本认证时的用户名（未认证时为&quot;-&quot;）</li><li>http_user_agent： 七层，客户端浏览器标识</li><li>http_referer： 七层，请求来源URL（直接从地址栏访问时为&quot;-&quot;）</li><li>http_x_forwarded_for： 七层，记录客户端原始IP及经过的代理服务器IP链</li><li>content_type： 七层，content_type</li><li>body_bytes_sent： 七层，发送给客户端的http body大小，不包含header</li><li>request_time： 七层，从接收到客户端请求的第一个字节到发送完响应最后一个字节之间的总时间（单位：秒）</li><li>sent_http_content_type： 七层，响应内容类型</li><li>upstream_header_time： 七层，终端节点的响应头到达时间</li><li>upstream_response_length： 七层，终端节点返回的响应体长度</li><li>upstream_response_time： 七层，终端节点完整响应时间</li><li>upstream_status： 七层，终端节点返回的HTTP状态码</li></ul>
     */
    public String [] getFieldKeys() {
        return this.FieldKeys;
    }

    /**
     * Set <p>用户可选日志监听字段</p><p>枚举值：</p><ul><li>session_time： 四层，会话持续时间</li><li>upstream_bytes_received： 四层、七层，从终端节点接收的字节数</li><li>upstream_bytes_sent： 四层、七层，发送给终端节点的字节数</li><li>request_method： 七层，GET/POST</li><li>scheme： 七层，http/https</li><li>request_uri： 七层，客户端原始请求的URI</li><li>uri： 七层，当前请求的URI</li><li>host： 七层，客户端访问域名（七层）</li><li>remote_user： 七层，基本认证时的用户名（未认证时为&quot;-&quot;）</li><li>http_user_agent： 七层，客户端浏览器标识</li><li>http_referer： 七层，请求来源URL（直接从地址栏访问时为&quot;-&quot;）</li><li>http_x_forwarded_for： 七层，记录客户端原始IP及经过的代理服务器IP链</li><li>content_type： 七层，content_type</li><li>body_bytes_sent： 七层，发送给客户端的http body大小，不包含header</li><li>request_time： 七层，从接收到客户端请求的第一个字节到发送完响应最后一个字节之间的总时间（单位：秒）</li><li>sent_http_content_type： 七层，响应内容类型</li><li>upstream_header_time： 七层，终端节点的响应头到达时间</li><li>upstream_response_length： 七层，终端节点返回的响应体长度</li><li>upstream_response_time： 七层，终端节点完整响应时间</li><li>upstream_status： 七层，终端节点返回的HTTP状态码</li></ul>
     * @param FieldKeys <p>用户可选日志监听字段</p><p>枚举值：</p><ul><li>session_time： 四层，会话持续时间</li><li>upstream_bytes_received： 四层、七层，从终端节点接收的字节数</li><li>upstream_bytes_sent： 四层、七层，发送给终端节点的字节数</li><li>request_method： 七层，GET/POST</li><li>scheme： 七层，http/https</li><li>request_uri： 七层，客户端原始请求的URI</li><li>uri： 七层，当前请求的URI</li><li>host： 七层，客户端访问域名（七层）</li><li>remote_user： 七层，基本认证时的用户名（未认证时为&quot;-&quot;）</li><li>http_user_agent： 七层，客户端浏览器标识</li><li>http_referer： 七层，请求来源URL（直接从地址栏访问时为&quot;-&quot;）</li><li>http_x_forwarded_for： 七层，记录客户端原始IP及经过的代理服务器IP链</li><li>content_type： 七层，content_type</li><li>body_bytes_sent： 七层，发送给客户端的http body大小，不包含header</li><li>request_time： 七层，从接收到客户端请求的第一个字节到发送完响应最后一个字节之间的总时间（单位：秒）</li><li>sent_http_content_type： 七层，响应内容类型</li><li>upstream_header_time： 七层，终端节点的响应头到达时间</li><li>upstream_response_length： 七层，终端节点返回的响应体长度</li><li>upstream_response_time： 七层，终端节点完整响应时间</li><li>upstream_status： 七层，终端节点返回的HTTP状态码</li></ul>
     */
    public void setFieldKeys(String [] FieldKeys) {
        this.FieldKeys = FieldKeys;
    }

    /**
     * Get <p>日志描述</p> 
     * @return FlowLogDescription <p>日志描述</p>
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set <p>日志描述</p>
     * @param FlowLogDescription <p>日志描述</p>
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    public ModifyGlobalAcceleratorAccessLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalAcceleratorAccessLogRequest(ModifyGlobalAcceleratorAccessLogRequest source) {
        if (source.LogPushTaskId != null) {
            this.LogPushTaskId = new String(source.LogPushTaskId);
        }
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.CloudLogSetId != null) {
            this.CloudLogSetId = new String(source.CloudLogSetId);
        }
        if (source.FieldKeys != null) {
            this.FieldKeys = new String[source.FieldKeys.length];
            for (int i = 0; i < source.FieldKeys.length; i++) {
                this.FieldKeys[i] = new String(source.FieldKeys[i]);
            }
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogPushTaskId", this.LogPushTaskId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogSetId", this.CloudLogSetId);
        this.setParamArraySimple(map, prefix + "FieldKeys.", this.FieldKeys);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);

    }
}

