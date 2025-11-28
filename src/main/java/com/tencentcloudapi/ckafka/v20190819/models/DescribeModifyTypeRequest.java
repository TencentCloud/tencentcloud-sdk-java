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
    * ckafka集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 升配后的带宽，单位mb
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 升配后的磁盘，单位G
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 磁盘类型，例如 CLOUD_PREMIUM
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 分区数量
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * topic数量
    */
    @SerializedName("Topic")
    @Expose
    private Long Topic;

    /**
    * 实例类型例如 sp_ckafka_profession
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 变配入口
    */
    @SerializedName("ModifyEntry")
    @Expose
    private String ModifyEntry;

    /**
     * Get ckafka集群实例Id 
     * @return InstanceId ckafka集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id
     * @param InstanceId ckafka集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 升配后的带宽，单位mb 
     * @return BandWidth 升配后的带宽，单位mb
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 升配后的带宽，单位mb
     * @param BandWidth 升配后的带宽，单位mb
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 升配后的磁盘，单位G 
     * @return DiskSize 升配后的磁盘，单位G
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 升配后的磁盘，单位G
     * @param DiskSize 升配后的磁盘，单位G
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 磁盘类型，例如 CLOUD_PREMIUM 
     * @return DiskType 磁盘类型，例如 CLOUD_PREMIUM
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型，例如 CLOUD_PREMIUM
     * @param DiskType 磁盘类型，例如 CLOUD_PREMIUM
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 分区数量 
     * @return Partition 分区数量
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区数量
     * @param Partition 分区数量
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get topic数量 
     * @return Topic topic数量
     */
    public Long getTopic() {
        return this.Topic;
    }

    /**
     * Set topic数量
     * @param Topic topic数量
     */
    public void setTopic(Long Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 实例类型例如 sp_ckafka_profession 
     * @return Type 实例类型例如 sp_ckafka_profession
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例类型例如 sp_ckafka_profession
     * @param Type 实例类型例如 sp_ckafka_profession
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 变配入口 
     * @return ModifyEntry 变配入口
     */
    public String getModifyEntry() {
        return this.ModifyEntry;
    }

    /**
     * Set 变配入口
     * @param ModifyEntry 变配入口
     */
    public void setModifyEntry(String ModifyEntry) {
        this.ModifyEntry = ModifyEntry;
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

    }
}

