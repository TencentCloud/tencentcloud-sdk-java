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

public class DCNReplicaConfig extends AbstractModel{

    /**
    * DCN 运行状态，START为正常运行，STOP为暂停
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoReplicationMode")
    @Expose
    private String RoReplicationMode;

    /**
    * 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayReplicationType")
    @Expose
    private String DelayReplicationType;

    /**
    * 延迟复制的指定时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DueTime")
    @Expose
    private String DueTime;

    /**
    * 延迟复制时的延迟秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicationDelay")
    @Expose
    private Long ReplicationDelay;

    /**
     * Get DCN 运行状态，START为正常运行，STOP为暂停
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoReplicationMode DCN 运行状态，START为正常运行，STOP为暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoReplicationMode() {
        return this.RoReplicationMode;
    }

    /**
     * Set DCN 运行状态，START为正常运行，STOP为暂停
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoReplicationMode DCN 运行状态，START为正常运行，STOP为暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoReplicationMode(String RoReplicationMode) {
        this.RoReplicationMode = RoReplicationMode;
    }

    /**
     * Get 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayReplicationType 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDelayReplicationType() {
        return this.DelayReplicationType;
    }

    /**
     * Set 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayReplicationType 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayReplicationType(String DelayReplicationType) {
        this.DelayReplicationType = DelayReplicationType;
    }

    /**
     * Get 延迟复制的指定时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DueTime 延迟复制的指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDueTime() {
        return this.DueTime;
    }

    /**
     * Set 延迟复制的指定时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DueTime 延迟复制的指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDueTime(String DueTime) {
        this.DueTime = DueTime;
    }

    /**
     * Get 延迟复制时的延迟秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicationDelay 延迟复制时的延迟秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicationDelay() {
        return this.ReplicationDelay;
    }

    /**
     * Set 延迟复制时的延迟秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicationDelay 延迟复制时的延迟秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicationDelay(Long ReplicationDelay) {
        this.ReplicationDelay = ReplicationDelay;
    }

    public DCNReplicaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DCNReplicaConfig(DCNReplicaConfig source) {
        if (source.RoReplicationMode != null) {
            this.RoReplicationMode = new String(source.RoReplicationMode);
        }
        if (source.DelayReplicationType != null) {
            this.DelayReplicationType = new String(source.DelayReplicationType);
        }
        if (source.DueTime != null) {
            this.DueTime = new String(source.DueTime);
        }
        if (source.ReplicationDelay != null) {
            this.ReplicationDelay = new Long(source.ReplicationDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoReplicationMode", this.RoReplicationMode);
        this.setParamSimple(map, prefix + "DelayReplicationType", this.DelayReplicationType);
        this.setParamSimple(map, prefix + "DueTime", this.DueTime);
        this.setParamSimple(map, prefix + "ReplicationDelay", this.ReplicationDelay);

    }
}

