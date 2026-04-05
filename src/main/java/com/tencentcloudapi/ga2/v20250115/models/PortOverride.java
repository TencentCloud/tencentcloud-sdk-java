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

public class PortOverride extends AbstractModel {

    /**
    * 监听端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * 映射端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointPort")
    @Expose
    private Long EndpointPort;

    /**
     * Get 监听端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerPort 监听端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set 监听端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerPort 监听端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get 映射端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointPort 映射端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndpointPort() {
        return this.EndpointPort;
    }

    /**
     * Set 映射端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointPort 映射端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointPort(Long EndpointPort) {
        this.EndpointPort = EndpointPort;
    }

    public PortOverride() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortOverride(PortOverride source) {
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.EndpointPort != null) {
            this.EndpointPort = new Long(source.EndpointPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "EndpointPort", this.EndpointPort);

    }
}

