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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCNReplicaStatus extends AbstractModel{

    /**
    * DCN 的运行状态，START为正常运行，STOP为暂停，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前延迟情况，取备实例的 master 节点的 delay 值
    */
    @SerializedName("Delay")
    @Expose
    private Long Delay;

    /**
     * Get DCN 的运行状态，START为正常运行，STOP为暂停，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status DCN 的运行状态，START为正常运行，STOP为暂停，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DCN 的运行状态，START为正常运行，STOP为暂停，
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status DCN 的运行状态，START为正常运行，STOP为暂停，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前延迟情况，取备实例的 master 节点的 delay 值 
     * @return Delay 当前延迟情况，取备实例的 master 节点的 delay 值
     */
    public Long getDelay() {
        return this.Delay;
    }

    /**
     * Set 当前延迟情况，取备实例的 master 节点的 delay 值
     * @param Delay 当前延迟情况，取备实例的 master 节点的 delay 值
     */
    public void setDelay(Long Delay) {
        this.Delay = Delay;
    }

    public DCNReplicaStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DCNReplicaStatus(DCNReplicaStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Delay != null) {
            this.Delay = new Long(source.Delay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Delay", this.Delay);

    }
}

