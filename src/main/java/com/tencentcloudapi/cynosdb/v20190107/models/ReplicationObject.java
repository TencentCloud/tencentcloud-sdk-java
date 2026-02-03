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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicationObject extends AbstractModel {

    /**
    * 源端实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInstanceType")
    @Expose
    private String SrcInstanceType;

    /**
    * 源端集群Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcClusterId")
    @Expose
    private String SrcClusterId;

    /**
    * 源端实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 复制任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicationJobId")
    @Expose
    private String ReplicationJobId;

    /**
    * 同步对象详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrateObjects")
    @Expose
    private MigrateOpt MigrateObjects;

    /**
     * Get 源端实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInstanceType 源端实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcInstanceType() {
        return this.SrcInstanceType;
    }

    /**
     * Set 源端实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInstanceType 源端实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInstanceType(String SrcInstanceType) {
        this.SrcInstanceType = SrcInstanceType;
    }

    /**
     * Get 源端集群Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcClusterId 源端集群Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcClusterId() {
        return this.SrcClusterId;
    }

    /**
     * Set 源端集群Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcClusterId 源端集群Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcClusterId(String SrcClusterId) {
        this.SrcClusterId = SrcClusterId;
    }

    /**
     * Get 源端实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInstanceId 源端实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源端实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInstanceId 源端实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 复制任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicationJobId 复制任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplicationJobId() {
        return this.ReplicationJobId;
    }

    /**
     * Set 复制任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicationJobId 复制任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicationJobId(String ReplicationJobId) {
        this.ReplicationJobId = ReplicationJobId;
    }

    /**
     * Get 同步对象详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrateObjects 同步对象详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MigrateOpt getMigrateObjects() {
        return this.MigrateObjects;
    }

    /**
     * Set 同步对象详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrateObjects 同步对象详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrateObjects(MigrateOpt MigrateObjects) {
        this.MigrateObjects = MigrateObjects;
    }

    public ReplicationObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationObject(ReplicationObject source) {
        if (source.SrcInstanceType != null) {
            this.SrcInstanceType = new String(source.SrcInstanceType);
        }
        if (source.SrcClusterId != null) {
            this.SrcClusterId = new String(source.SrcClusterId);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.ReplicationJobId != null) {
            this.ReplicationJobId = new String(source.ReplicationJobId);
        }
        if (source.MigrateObjects != null) {
            this.MigrateObjects = new MigrateOpt(source.MigrateObjects);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceType", this.SrcInstanceType);
        this.setParamSimple(map, prefix + "SrcClusterId", this.SrcClusterId);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "ReplicationJobId", this.ReplicationJobId);
        this.setParamObj(map, prefix + "MigrateObjects.", this.MigrateObjects);

    }
}

