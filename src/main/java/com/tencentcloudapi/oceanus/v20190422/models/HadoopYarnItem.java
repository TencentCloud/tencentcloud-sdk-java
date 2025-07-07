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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HadoopYarnItem extends AbstractModel {

    /**
    * ClusterGroupSerialId
    */
    @SerializedName("ClusterGroupSerialId")
    @Expose
    private String ClusterGroupSerialId;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * cpu
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * mem
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 配置文件内容
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * CreatorUin
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
     * Get ClusterGroupSerialId 
     * @return ClusterGroupSerialId ClusterGroupSerialId
     */
    public String getClusterGroupSerialId() {
        return this.ClusterGroupSerialId;
    }

    /**
     * Set ClusterGroupSerialId
     * @param ClusterGroupSerialId ClusterGroupSerialId
     */
    public void setClusterGroupSerialId(String ClusterGroupSerialId) {
        this.ClusterGroupSerialId = ClusterGroupSerialId;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get cpu
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get mem 
     * @return Mem mem
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set mem
     * @param Mem mem
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 配置文件内容 
     * @return Config 配置文件内容
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置文件内容
     * @param Config 配置文件内容
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get CreatorUin 
     * @return CreatorUin CreatorUin
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set CreatorUin
     * @param CreatorUin CreatorUin
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    public HadoopYarnItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HadoopYarnItem(HadoopYarnItem source) {
        if (source.ClusterGroupSerialId != null) {
            this.ClusterGroupSerialId = new String(source.ClusterGroupSerialId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterGroupSerialId", this.ClusterGroupSerialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);

    }
}

