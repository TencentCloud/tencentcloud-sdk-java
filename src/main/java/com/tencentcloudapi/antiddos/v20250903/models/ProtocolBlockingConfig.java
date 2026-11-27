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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolBlockingConfig extends AbstractModel {

    /**
    * <p>TCP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
    */
    @SerializedName("TCPProtocol")
    @Expose
    private String TCPProtocol;

    /**
    * <p>UDP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
    */
    @SerializedName("UDPProtocol")
    @Expose
    private String UDPProtocol;

    /**
    * <p>ICMP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
    */
    @SerializedName("ICMPProtocol")
    @Expose
    private String ICMPProtocol;

    /**
    * <p>其它协议封禁（除 TCP/UDP/ICMP 外的协议）。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
    */
    @SerializedName("OtherProtocol")
    @Expose
    private String OtherProtocol;

    /**
     * Get <p>TCP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul> 
     * @return TCPProtocol <p>TCP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public String getTCPProtocol() {
        return this.TCPProtocol;
    }

    /**
     * Set <p>TCP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     * @param TCPProtocol <p>TCP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public void setTCPProtocol(String TCPProtocol) {
        this.TCPProtocol = TCPProtocol;
    }

    /**
     * Get <p>UDP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul> 
     * @return UDPProtocol <p>UDP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public String getUDPProtocol() {
        return this.UDPProtocol;
    }

    /**
     * Set <p>UDP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     * @param UDPProtocol <p>UDP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public void setUDPProtocol(String UDPProtocol) {
        this.UDPProtocol = UDPProtocol;
    }

    /**
     * Get <p>ICMP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul> 
     * @return ICMPProtocol <p>ICMP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public String getICMPProtocol() {
        return this.ICMPProtocol;
    }

    /**
     * Set <p>ICMP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     * @param ICMPProtocol <p>ICMP 协议封禁。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public void setICMPProtocol(String ICMPProtocol) {
        this.ICMPProtocol = ICMPProtocol;
    }

    /**
     * Get <p>其它协议封禁（除 TCP/UDP/ICMP 外的协议）。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul> 
     * @return OtherProtocol <p>其它协议封禁（除 TCP/UDP/ICMP 外的协议）。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public String getOtherProtocol() {
        return this.OtherProtocol;
    }

    /**
     * Set <p>其它协议封禁（除 TCP/UDP/ICMP 外的协议）。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     * @param OtherProtocol <p>其它协议封禁（除 TCP/UDP/ICMP 外的协议）。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public void setOtherProtocol(String OtherProtocol) {
        this.OtherProtocol = OtherProtocol;
    }

    public ProtocolBlockingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtocolBlockingConfig(ProtocolBlockingConfig source) {
        if (source.TCPProtocol != null) {
            this.TCPProtocol = new String(source.TCPProtocol);
        }
        if (source.UDPProtocol != null) {
            this.UDPProtocol = new String(source.UDPProtocol);
        }
        if (source.ICMPProtocol != null) {
            this.ICMPProtocol = new String(source.ICMPProtocol);
        }
        if (source.OtherProtocol != null) {
            this.OtherProtocol = new String(source.OtherProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TCPProtocol", this.TCPProtocol);
        this.setParamSimple(map, prefix + "UDPProtocol", this.UDPProtocol);
        this.setParamSimple(map, prefix + "ICMPProtocol", this.ICMPProtocol);
        this.setParamSimple(map, prefix + "OtherProtocol", this.OtherProtocol);

    }
}

