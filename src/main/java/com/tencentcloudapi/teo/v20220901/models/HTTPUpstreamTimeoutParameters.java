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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPUpstreamTimeoutParameters extends AbstractModel {

    /**
    * <p>HTTP 应答超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>默认值：15</p><p>节点把请求发给源站后开始计时，在设定时间内没有收到源站返回的任何数据即判定超时；开始收到响应后，相邻两次收到数据的间隔超过设定值同样判定超时。节点向源站上传请求体时，相邻两次发送数据的间隔也受该值限制。该值不限制整个响应的总耗时，只要源站持续返回数据，大文件下载不会因此中断。<br>注意：该参数未设置时出参不返回。</p>
    */
    @SerializedName("ResponseTimeout")
    @Expose
    private Long ResponseTimeout;

    /**
    * <p>回源 TCP 建连超时时间。</p><p>取值范围：[5, 120]</p><p>单位：秒</p><p>默认值：5</p><p>节点向源站发起 TCP 连接后，如果源站在设定时间内没有完成应答，判定本次建连超时。该值只约束 TCP 建连本身；连接建立后等待源站响应的时间由 ResponseTimeout 控制。<br>注意：该参数未设置时出参不返回。</p>
    */
    @SerializedName("TCPConnectTimeout")
    @Expose
    private Long TCPConnectTimeout;

    /**
    * <p>回源长连接空闲超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>回源请求完成后，节点与源站之间的连接放回连接池进入空闲状态，如果在设定时间内没有新的回源请求复用这条连接，节点主动关闭连接。该参数只作用于直接连接源站的节点，EdgeOne 节点之间的内部连接不受影响；该参数只对 HTTP/1.x 连接生效，HTTP/2 与 HTTP/3（QUIC）连接不受影响。建议该值小于源站的长连接超时时间（例如 Nginx 的 keepalive_timeout 默认为 75 秒），否则节点可能复用一条已被源站关闭的连接，导致回源失败或重试。<br>注意：该参数未设置时出参不返回。</p>
    */
    @SerializedName("KeepaliveTimeout")
    @Expose
    private Long KeepaliveTimeout;

    /**
     * Get <p>HTTP 应答超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>默认值：15</p><p>节点把请求发给源站后开始计时，在设定时间内没有收到源站返回的任何数据即判定超时；开始收到响应后，相邻两次收到数据的间隔超过设定值同样判定超时。节点向源站上传请求体时，相邻两次发送数据的间隔也受该值限制。该值不限制整个响应的总耗时，只要源站持续返回数据，大文件下载不会因此中断。<br>注意：该参数未设置时出参不返回。</p> 
     * @return ResponseTimeout <p>HTTP 应答超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>默认值：15</p><p>节点把请求发给源站后开始计时，在设定时间内没有收到源站返回的任何数据即判定超时；开始收到响应后，相邻两次收到数据的间隔超过设定值同样判定超时。节点向源站上传请求体时，相邻两次发送数据的间隔也受该值限制。该值不限制整个响应的总耗时，只要源站持续返回数据，大文件下载不会因此中断。<br>注意：该参数未设置时出参不返回。</p>
     */
    public Long getResponseTimeout() {
        return this.ResponseTimeout;
    }

    /**
     * Set <p>HTTP 应答超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>默认值：15</p><p>节点把请求发给源站后开始计时，在设定时间内没有收到源站返回的任何数据即判定超时；开始收到响应后，相邻两次收到数据的间隔超过设定值同样判定超时。节点向源站上传请求体时，相邻两次发送数据的间隔也受该值限制。该值不限制整个响应的总耗时，只要源站持续返回数据，大文件下载不会因此中断。<br>注意：该参数未设置时出参不返回。</p>
     * @param ResponseTimeout <p>HTTP 应答超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>默认值：15</p><p>节点把请求发给源站后开始计时，在设定时间内没有收到源站返回的任何数据即判定超时；开始收到响应后，相邻两次收到数据的间隔超过设定值同样判定超时。节点向源站上传请求体时，相邻两次发送数据的间隔也受该值限制。该值不限制整个响应的总耗时，只要源站持续返回数据，大文件下载不会因此中断。<br>注意：该参数未设置时出参不返回。</p>
     */
    public void setResponseTimeout(Long ResponseTimeout) {
        this.ResponseTimeout = ResponseTimeout;
    }

    /**
     * Get <p>回源 TCP 建连超时时间。</p><p>取值范围：[5, 120]</p><p>单位：秒</p><p>默认值：5</p><p>节点向源站发起 TCP 连接后，如果源站在设定时间内没有完成应答，判定本次建连超时。该值只约束 TCP 建连本身；连接建立后等待源站响应的时间由 ResponseTimeout 控制。<br>注意：该参数未设置时出参不返回。</p> 
     * @return TCPConnectTimeout <p>回源 TCP 建连超时时间。</p><p>取值范围：[5, 120]</p><p>单位：秒</p><p>默认值：5</p><p>节点向源站发起 TCP 连接后，如果源站在设定时间内没有完成应答，判定本次建连超时。该值只约束 TCP 建连本身；连接建立后等待源站响应的时间由 ResponseTimeout 控制。<br>注意：该参数未设置时出参不返回。</p>
     */
    public Long getTCPConnectTimeout() {
        return this.TCPConnectTimeout;
    }

    /**
     * Set <p>回源 TCP 建连超时时间。</p><p>取值范围：[5, 120]</p><p>单位：秒</p><p>默认值：5</p><p>节点向源站发起 TCP 连接后，如果源站在设定时间内没有完成应答，判定本次建连超时。该值只约束 TCP 建连本身；连接建立后等待源站响应的时间由 ResponseTimeout 控制。<br>注意：该参数未设置时出参不返回。</p>
     * @param TCPConnectTimeout <p>回源 TCP 建连超时时间。</p><p>取值范围：[5, 120]</p><p>单位：秒</p><p>默认值：5</p><p>节点向源站发起 TCP 连接后，如果源站在设定时间内没有完成应答，判定本次建连超时。该值只约束 TCP 建连本身；连接建立后等待源站响应的时间由 ResponseTimeout 控制。<br>注意：该参数未设置时出参不返回。</p>
     */
    public void setTCPConnectTimeout(Long TCPConnectTimeout) {
        this.TCPConnectTimeout = TCPConnectTimeout;
    }

    /**
     * Get <p>回源长连接空闲超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>回源请求完成后，节点与源站之间的连接放回连接池进入空闲状态，如果在设定时间内没有新的回源请求复用这条连接，节点主动关闭连接。该参数只作用于直接连接源站的节点，EdgeOne 节点之间的内部连接不受影响；该参数只对 HTTP/1.x 连接生效，HTTP/2 与 HTTP/3（QUIC）连接不受影响。建议该值小于源站的长连接超时时间（例如 Nginx 的 keepalive_timeout 默认为 75 秒），否则节点可能复用一条已被源站关闭的连接，导致回源失败或重试。<br>注意：该参数未设置时出参不返回。</p> 
     * @return KeepaliveTimeout <p>回源长连接空闲超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>回源请求完成后，节点与源站之间的连接放回连接池进入空闲状态，如果在设定时间内没有新的回源请求复用这条连接，节点主动关闭连接。该参数只作用于直接连接源站的节点，EdgeOne 节点之间的内部连接不受影响；该参数只对 HTTP/1.x 连接生效，HTTP/2 与 HTTP/3（QUIC）连接不受影响。建议该值小于源站的长连接超时时间（例如 Nginx 的 keepalive_timeout 默认为 75 秒），否则节点可能复用一条已被源站关闭的连接，导致回源失败或重试。<br>注意：该参数未设置时出参不返回。</p>
     */
    public Long getKeepaliveTimeout() {
        return this.KeepaliveTimeout;
    }

    /**
     * Set <p>回源长连接空闲超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>回源请求完成后，节点与源站之间的连接放回连接池进入空闲状态，如果在设定时间内没有新的回源请求复用这条连接，节点主动关闭连接。该参数只作用于直接连接源站的节点，EdgeOne 节点之间的内部连接不受影响；该参数只对 HTTP/1.x 连接生效，HTTP/2 与 HTTP/3（QUIC）连接不受影响。建议该值小于源站的长连接超时时间（例如 Nginx 的 keepalive_timeout 默认为 75 秒），否则节点可能复用一条已被源站关闭的连接，导致回源失败或重试。<br>注意：该参数未设置时出参不返回。</p>
     * @param KeepaliveTimeout <p>回源长连接空闲超时时间。</p><p>取值范围：[5, 600]</p><p>单位：秒</p><p>回源请求完成后，节点与源站之间的连接放回连接池进入空闲状态，如果在设定时间内没有新的回源请求复用这条连接，节点主动关闭连接。该参数只作用于直接连接源站的节点，EdgeOne 节点之间的内部连接不受影响；该参数只对 HTTP/1.x 连接生效，HTTP/2 与 HTTP/3（QUIC）连接不受影响。建议该值小于源站的长连接超时时间（例如 Nginx 的 keepalive_timeout 默认为 75 秒），否则节点可能复用一条已被源站关闭的连接，导致回源失败或重试。<br>注意：该参数未设置时出参不返回。</p>
     */
    public void setKeepaliveTimeout(Long KeepaliveTimeout) {
        this.KeepaliveTimeout = KeepaliveTimeout;
    }

    public HTTPUpstreamTimeoutParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPUpstreamTimeoutParameters(HTTPUpstreamTimeoutParameters source) {
        if (source.ResponseTimeout != null) {
            this.ResponseTimeout = new Long(source.ResponseTimeout);
        }
        if (source.TCPConnectTimeout != null) {
            this.TCPConnectTimeout = new Long(source.TCPConnectTimeout);
        }
        if (source.KeepaliveTimeout != null) {
            this.KeepaliveTimeout = new Long(source.KeepaliveTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResponseTimeout", this.ResponseTimeout);
        this.setParamSimple(map, prefix + "TCPConnectTimeout", this.TCPConnectTimeout);
        this.setParamSimple(map, prefix + "KeepaliveTimeout", this.KeepaliveTimeout);

    }
}

