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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClustersZone extends AbstractModel{

    /**
    * 集群所在的主可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterZone")
    @Expose
    private String [] MasterZone;

    /**
    * 集群所在的备可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveZone")
    @Expose
    private String [] SlaveZone;

    /**
     * Get 集群所在的主可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterZone 集群所在的主可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 集群所在的主可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterZone 集群所在的主可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterZone(String [] MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 集群所在的备可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveZone 集群所在的备可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 集群所在的备可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveZone 集群所在的备可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveZone(String [] SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    public ClustersZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClustersZone(ClustersZone source) {
        if (source.MasterZone != null) {
            this.MasterZone = new String[source.MasterZone.length];
            for (int i = 0; i < source.MasterZone.length; i++) {
                this.MasterZone[i] = new String(source.MasterZone[i]);
            }
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String[source.SlaveZone.length];
            for (int i = 0; i < source.SlaveZone.length; i++) {
                this.SlaveZone[i] = new String(source.SlaveZone[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MasterZone.", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZone.", this.SlaveZone);

    }
}

