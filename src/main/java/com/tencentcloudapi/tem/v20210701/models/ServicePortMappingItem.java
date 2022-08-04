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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServicePortMappingItem extends AbstractModel{

    /**
    * 应用访问端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 应用监听端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
    * 协议类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 应用访问端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 应用访问端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 应用访问端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 应用访问端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 应用监听端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetPort 应用监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set 应用监听端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetPort 应用监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * Get 协议类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public ServicePortMappingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServicePortMappingItem(ServicePortMappingItem source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.TargetPort != null) {
            this.TargetPort = new Long(source.TargetPort);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

