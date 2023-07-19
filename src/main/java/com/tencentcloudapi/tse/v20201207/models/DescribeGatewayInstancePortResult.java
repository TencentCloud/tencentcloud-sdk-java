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

public class DescribeGatewayInstancePortResult extends AbstractModel{

    /**
    * 云原生API网关ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关实例协议端口列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayInstancePortList")
    @Expose
    private GatewayInstanceSchemeAndPorts [] GatewayInstancePortList;

    /**
     * Get 云原生API网关ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 云原生API网关ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 云原生API网关ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关实例协议端口列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayInstancePortList 网关实例协议端口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayInstanceSchemeAndPorts [] getGatewayInstancePortList() {
        return this.GatewayInstancePortList;
    }

    /**
     * Set 网关实例协议端口列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayInstancePortList 网关实例协议端口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayInstancePortList(GatewayInstanceSchemeAndPorts [] GatewayInstancePortList) {
        this.GatewayInstancePortList = GatewayInstancePortList;
    }

    public DescribeGatewayInstancePortResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayInstancePortResult(DescribeGatewayInstancePortResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayInstancePortList != null) {
            this.GatewayInstancePortList = new GatewayInstanceSchemeAndPorts[source.GatewayInstancePortList.length];
            for (int i = 0; i < source.GatewayInstancePortList.length; i++) {
                this.GatewayInstancePortList[i] = new GatewayInstanceSchemeAndPorts(source.GatewayInstancePortList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArrayObj(map, prefix + "GatewayInstancePortList.", this.GatewayInstancePortList);

    }
}

