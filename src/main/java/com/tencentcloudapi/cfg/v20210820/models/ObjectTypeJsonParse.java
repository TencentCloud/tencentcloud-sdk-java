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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTypeJsonParse extends AbstractModel {

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * 节点IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * 节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameSpace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameSpace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadName 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadName 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get 节点IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanIP 节点IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set 节点IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanIP 节点IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get 节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ObjectTypeJsonParse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectTypeJsonParse(ObjectTypeJsonParse source) {
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.LanIP != null) {
            this.LanIP = new String(source.LanIP);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

