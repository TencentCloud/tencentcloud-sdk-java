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
package com.tencentcloudapi.tsw.v20200924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentShell extends AbstractModel{

    /**
    * 鉴权token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 数据接收Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EtlIp")
    @Expose
    private String EtlIp;

    /**
    * 数据接收port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EtlPort")
    @Expose
    private String EtlPort;

    /**
    * 手动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ByHandAccess")
    @Expose
    private String ByHandAccess;

    /**
    * 自动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ByShellAccess")
    @Expose
    private String ByShellAccess;

    /**
    * SkyWalking数据接收port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkyWalkingPort")
    @Expose
    private String SkyWalkingPort;

    /**
    * Zipkin数据接收port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZipkinPort")
    @Expose
    private String ZipkinPort;

    /**
    * Jaeger数据接收port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JaegerPort")
    @Expose
    private String JaegerPort;

    /**
     * Get 鉴权token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token 鉴权token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 鉴权token
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token 鉴权token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 数据接收Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EtlIp 数据接收Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEtlIp() {
        return this.EtlIp;
    }

    /**
     * Set 数据接收Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param EtlIp 数据接收Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEtlIp(String EtlIp) {
        this.EtlIp = EtlIp;
    }

    /**
     * Get 数据接收port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EtlPort 数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEtlPort() {
        return this.EtlPort;
    }

    /**
     * Set 数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     * @param EtlPort 数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEtlPort(String EtlPort) {
        this.EtlPort = EtlPort;
    }

    /**
     * Get 手动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ByHandAccess 手动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getByHandAccess() {
        return this.ByHandAccess;
    }

    /**
     * Set 手动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ByHandAccess 手动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setByHandAccess(String ByHandAccess) {
        this.ByHandAccess = ByHandAccess;
    }

    /**
     * Get 自动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ByShellAccess 自动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getByShellAccess() {
        return this.ByShellAccess;
    }

    /**
     * Set 自动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ByShellAccess 自动接入脚本串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setByShellAccess(String ByShellAccess) {
        this.ByShellAccess = ByShellAccess;
    }

    /**
     * Get SkyWalking数据接收port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkyWalkingPort SkyWalking数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkyWalkingPort() {
        return this.SkyWalkingPort;
    }

    /**
     * Set SkyWalking数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkyWalkingPort SkyWalking数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkyWalkingPort(String SkyWalkingPort) {
        this.SkyWalkingPort = SkyWalkingPort;
    }

    /**
     * Get Zipkin数据接收port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZipkinPort Zipkin数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZipkinPort() {
        return this.ZipkinPort;
    }

    /**
     * Set Zipkin数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZipkinPort Zipkin数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZipkinPort(String ZipkinPort) {
        this.ZipkinPort = ZipkinPort;
    }

    /**
     * Get Jaeger数据接收port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JaegerPort Jaeger数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJaegerPort() {
        return this.JaegerPort;
    }

    /**
     * Set Jaeger数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     * @param JaegerPort Jaeger数据接收port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJaegerPort(String JaegerPort) {
        this.JaegerPort = JaegerPort;
    }

    public AgentShell() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentShell(AgentShell source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.EtlIp != null) {
            this.EtlIp = new String(source.EtlIp);
        }
        if (source.EtlPort != null) {
            this.EtlPort = new String(source.EtlPort);
        }
        if (source.ByHandAccess != null) {
            this.ByHandAccess = new String(source.ByHandAccess);
        }
        if (source.ByShellAccess != null) {
            this.ByShellAccess = new String(source.ByShellAccess);
        }
        if (source.SkyWalkingPort != null) {
            this.SkyWalkingPort = new String(source.SkyWalkingPort);
        }
        if (source.ZipkinPort != null) {
            this.ZipkinPort = new String(source.ZipkinPort);
        }
        if (source.JaegerPort != null) {
            this.JaegerPort = new String(source.JaegerPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "EtlIp", this.EtlIp);
        this.setParamSimple(map, prefix + "EtlPort", this.EtlPort);
        this.setParamSimple(map, prefix + "ByHandAccess", this.ByHandAccess);
        this.setParamSimple(map, prefix + "ByShellAccess", this.ByShellAccess);
        this.setParamSimple(map, prefix + "SkyWalkingPort", this.SkyWalkingPort);
        this.setParamSimple(map, prefix + "ZipkinPort", this.ZipkinPort);
        this.setParamSimple(map, prefix + "JaegerPort", this.JaegerPort);

    }
}

