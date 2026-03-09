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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModifyTypeRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>升配后的带宽，单位mb</p>
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <p>升配后的磁盘，单位G</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>磁盘类型，例如 CLOUD_PREMIUM</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>分区数量</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>topic数量</p>
    */
    @SerializedName("Topic")
    @Expose
    private Long Topic;

    /**
    * <p>实例类型例如 sp_ckafka_profession</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>变配入口</p>
    */
    @SerializedName("ModifyEntry")
    @Expose
    private String ModifyEntry;

    /**
    * <p>是否可用区变更  false: 非可用区变更  true: 可用区变更  默认false</p>
    */
    @SerializedName("ModifyZone")
    @Expose
    private Boolean ModifyZone;

    /**
     * Get <p>ckafka集群实例Id</p> 
     * @return InstanceId <p>ckafka集群实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p>
     * @param InstanceId <p>ckafka集群实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>升配后的带宽，单位mb</p> 
     * @return BandWidth <p>升配后的带宽，单位mb</p>
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>升配后的带宽，单位mb</p>
     * @param BandWidth <p>升配后的带宽，单位mb</p>
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <p>升配后的磁盘，单位G</p> 
     * @return DiskSize <p>升配后的磁盘，单位G</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>升配后的磁盘，单位G</p>
     * @param DiskSize <p>升配后的磁盘，单位G</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>磁盘类型，例如 CLOUD_PREMIUM</p> 
     * @return DiskType <p>磁盘类型，例如 CLOUD_PREMIUM</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>磁盘类型，例如 CLOUD_PREMIUM</p>
     * @param DiskType <p>磁盘类型，例如 CLOUD_PREMIUM</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>分区数量</p> 
     * @return Partition <p>分区数量</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>分区数量</p>
     * @param Partition <p>分区数量</p>
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>topic数量</p> 
     * @return Topic <p>topic数量</p>
     */
    public Long getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>topic数量</p>
     * @param Topic <p>topic数量</p>
     */
    public void setTopic(Long Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>实例类型例如 sp_ckafka_profession</p> 
     * @return Type <p>实例类型例如 sp_ckafka_profession</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型例如 sp_ckafka_profession</p>
     * @param Type <p>实例类型例如 sp_ckafka_profession</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>变配入口</p> 
     * @return ModifyEntry <p>变配入口</p>
     */
    public String getModifyEntry() {
        return this.ModifyEntry;
    }

    /**
     * Set <p>变配入口</p>
     * @param ModifyEntry <p>变配入口</p>
     */
    public void setModifyEntry(String ModifyEntry) {
        this.ModifyEntry = ModifyEntry;
    }

    /**
     * Get <p>是否可用区变更  false: 非可用区变更  true: 可用区变更  默认false</p> 
     * @return ModifyZone <p>是否可用区变更  false: 非可用区变更  true: 可用区变更  默认false</p>
     */
    public Boolean getModifyZone() {
        return this.ModifyZone;
    }

    /**
     * Set <p>是否可用区变更  false: 非可用区变更  true: 可用区变更  默认false</p>
     * @param ModifyZone <p>是否可用区变更  false: 非可用区变更  true: 可用区变更  默认false</p>
     */
    public void setModifyZone(Boolean ModifyZone) {
        this.ModifyZone = ModifyZone;
    }

    public DescribeModifyTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModifyTypeRequest(DescribeModifyTypeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Topic != null) {
            this.Topic = new Long(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ModifyEntry != null) {
            this.ModifyEntry = new String(source.ModifyEntry);
        }
        if (source.ModifyZone != null) {
            this.ModifyZone = new Boolean(source.ModifyZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ModifyEntry", this.ModifyEntry);
        this.setParamSimple(map, prefix + "ModifyZone", this.ModifyZone);

    }
}

