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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayInstanceSchemeAndPorts extends AbstractModel{

    /**
    * 端口协议，可选HTTP、HTTPS、TCP和UDP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 端口列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortList")
    @Expose
    private Long [] PortList;

    /**
     * Get 端口协议，可选HTTP、HTTPS、TCP和UDP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme 端口协议，可选HTTP、HTTPS、TCP和UDP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 端口协议，可选HTTP、HTTPS、TCP和UDP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme 端口协议，可选HTTP、HTTPS、TCP和UDP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 端口列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortList 端口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPortList() {
        return this.PortList;
    }

    /**
     * Set 端口列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortList 端口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortList(Long [] PortList) {
        this.PortList = PortList;
    }

    public GatewayInstanceSchemeAndPorts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayInstanceSchemeAndPorts(GatewayInstanceSchemeAndPorts source) {
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.PortList != null) {
            this.PortList = new Long[source.PortList.length];
            for (int i = 0; i < source.PortList.length; i++) {
                this.PortList[i] = new Long(source.PortList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamArraySimple(map, prefix + "PortList.", this.PortList);

    }
}

