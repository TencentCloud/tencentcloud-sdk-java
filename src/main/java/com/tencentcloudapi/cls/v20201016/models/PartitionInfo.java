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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionInfo extends AbstractModel{

    /**
    * 分区ID
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
    * 分区的状态（readwrite或者是readonly）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 分区哈希键起始key
    */
    @SerializedName("InclusiveBeginKey")
    @Expose
    private String InclusiveBeginKey;

    /**
    * 分区哈希键结束key
    */
    @SerializedName("ExclusiveEndKey")
    @Expose
    private String ExclusiveEndKey;

    /**
    * 分区创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 只读分区数据停止写入时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastWriteTime")
    @Expose
    private String LastWriteTime;

    /**
     * Get 分区ID 
     * @return PartitionId 分区ID
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set 分区ID
     * @param PartitionId 分区ID
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get 分区的状态（readwrite或者是readonly） 
     * @return Status 分区的状态（readwrite或者是readonly）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 分区的状态（readwrite或者是readonly）
     * @param Status 分区的状态（readwrite或者是readonly）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 分区哈希键起始key 
     * @return InclusiveBeginKey 分区哈希键起始key
     */
    public String getInclusiveBeginKey() {
        return this.InclusiveBeginKey;
    }

    /**
     * Set 分区哈希键起始key
     * @param InclusiveBeginKey 分区哈希键起始key
     */
    public void setInclusiveBeginKey(String InclusiveBeginKey) {
        this.InclusiveBeginKey = InclusiveBeginKey;
    }

    /**
     * Get 分区哈希键结束key 
     * @return ExclusiveEndKey 分区哈希键结束key
     */
    public String getExclusiveEndKey() {
        return this.ExclusiveEndKey;
    }

    /**
     * Set 分区哈希键结束key
     * @param ExclusiveEndKey 分区哈希键结束key
     */
    public void setExclusiveEndKey(String ExclusiveEndKey) {
        this.ExclusiveEndKey = ExclusiveEndKey;
    }

    /**
     * Get 分区创建时间 
     * @return CreateTime 分区创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 分区创建时间
     * @param CreateTime 分区创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 只读分区数据停止写入时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastWriteTime 只读分区数据停止写入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastWriteTime() {
        return this.LastWriteTime;
    }

    /**
     * Set 只读分区数据停止写入时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastWriteTime 只读分区数据停止写入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastWriteTime(String LastWriteTime) {
        this.LastWriteTime = LastWriteTime;
    }

    public PartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionInfo(PartitionInfo source) {
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InclusiveBeginKey != null) {
            this.InclusiveBeginKey = new String(source.InclusiveBeginKey);
        }
        if (source.ExclusiveEndKey != null) {
            this.ExclusiveEndKey = new String(source.ExclusiveEndKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastWriteTime != null) {
            this.LastWriteTime = new String(source.LastWriteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InclusiveBeginKey", this.InclusiveBeginKey);
        this.setParamSimple(map, prefix + "ExclusiveEndKey", this.ExclusiveEndKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastWriteTime", this.LastWriteTime);

    }
}

