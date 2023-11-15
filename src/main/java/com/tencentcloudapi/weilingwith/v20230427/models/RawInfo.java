/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RawInfo extends AbstractModel {

    /**
    * 加密向量（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SM4Vector")
    @Expose
    private String SM4Vector;

    /**
    * 专线ip (非专线接入可忽略)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NATIP")
    @Expose
    private String NATIP;

    /**
    * 客户端握手鉴权参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamToken")
    @Expose
    private String StreamToken;

    /**
    * 拉流端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 视频流加密key,目前为AES128加密KEY（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamEnKey")
    @Expose
    private String StreamEnKey;

    /**
    * 拉流公网地址（非公网接入时，这个地址是内网地址）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 拉流内网地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerIP")
    @Expose
    private String InnerIP;

    /**
     * Get 加密向量（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SM4Vector 加密向量（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSM4Vector() {
        return this.SM4Vector;
    }

    /**
     * Set 加密向量（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SM4Vector 加密向量（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSM4Vector(String SM4Vector) {
        this.SM4Vector = SM4Vector;
    }

    /**
     * Get 专线ip (非专线接入可忽略)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NATIP 专线ip (非专线接入可忽略)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNATIP() {
        return this.NATIP;
    }

    /**
     * Set 专线ip (非专线接入可忽略)
注意：此字段可能返回 null，表示取不到有效值。
     * @param NATIP 专线ip (非专线接入可忽略)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNATIP(String NATIP) {
        this.NATIP = NATIP;
    }

    /**
     * Get 客户端握手鉴权参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamToken 客户端握手鉴权参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreamToken() {
        return this.StreamToken;
    }

    /**
     * Set 客户端握手鉴权参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamToken 客户端握手鉴权参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamToken(String StreamToken) {
        this.StreamToken = StreamToken;
    }

    /**
     * Get 拉流端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 拉流端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 拉流端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 拉流端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 视频流加密key,目前为AES128加密KEY（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamEnKey 视频流加密key,目前为AES128加密KEY（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreamEnKey() {
        return this.StreamEnKey;
    }

    /**
     * Set 视频流加密key,目前为AES128加密KEY（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamEnKey 视频流加密key,目前为AES128加密KEY（如果视频网关选择流为非加密传输这个参数可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamEnKey(String StreamEnKey) {
        this.StreamEnKey = StreamEnKey;
    }

    /**
     * Get 拉流公网地址（非公网接入时，这个地址是内网地址）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP 拉流公网地址（非公网接入时，这个地址是内网地址）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 拉流公网地址（非公网接入时，这个地址是内网地址）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP 拉流公网地址（非公网接入时，这个地址是内网地址）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 拉流内网地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerIP 拉流内网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInnerIP() {
        return this.InnerIP;
    }

    /**
     * Set 拉流内网地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerIP 拉流内网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerIP(String InnerIP) {
        this.InnerIP = InnerIP;
    }

    public RawInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawInfo(RawInfo source) {
        if (source.SM4Vector != null) {
            this.SM4Vector = new String(source.SM4Vector);
        }
        if (source.NATIP != null) {
            this.NATIP = new String(source.NATIP);
        }
        if (source.StreamToken != null) {
            this.StreamToken = new String(source.StreamToken);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.StreamEnKey != null) {
            this.StreamEnKey = new String(source.StreamEnKey);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.InnerIP != null) {
            this.InnerIP = new String(source.InnerIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SM4Vector", this.SM4Vector);
        this.setParamSimple(map, prefix + "NATIP", this.NATIP);
        this.setParamSimple(map, prefix + "StreamToken", this.StreamToken);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "StreamEnKey", this.StreamEnKey);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "InnerIP", this.InnerIP);

    }
}

