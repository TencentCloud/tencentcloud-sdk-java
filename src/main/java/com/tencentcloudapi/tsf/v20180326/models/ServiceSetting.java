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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSetting extends AbstractModel{

    /**
    * 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort ProtocolPorts;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolPorts 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtocolPort getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolPorts 容器端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolPorts(ProtocolPort ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamObj(map, prefix + "ProtocolPorts.", this.ProtocolPorts);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

