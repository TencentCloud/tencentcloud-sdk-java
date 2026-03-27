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
    * <p>ClusterGroupSerialId</p>
    */
    @SerializedName("ClusterGroupSerialId")
    @Expose
    private String ClusterGroupSerialId;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>1： 停止</li><li>2： 开启中</li><li>3： 启动</li><li>4： 开启失败</li><li>5： 停止中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * <p>mem</p>
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>配置文件内容</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>CreatorUin</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
     * Get <p>ClusterGroupSerialId</p> 
     * @return ClusterGroupSerialId <p>ClusterGroupSerialId</p>
     */
    public String getClusterGroupSerialId() {
        return this.ClusterGroupSerialId;
    }

    /**
     * Set <p>ClusterGroupSerialId</p>
     * @param ClusterGroupSerialId <p>ClusterGroupSerialId</p>
     */
    public void setClusterGroupSerialId(String ClusterGroupSerialId) {
        this.ClusterGroupSerialId = ClusterGroupSerialId;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>1： 停止</li><li>2： 开启中</li><li>3： 启动</li><li>4： 开启失败</li><li>5： 停止中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>1： 停止</li><li>2： 开启中</li><li>3： 启动</li><li>4： 开启失败</li><li>5： 停止中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>1： 停止</li><li>2： 开启中</li><li>3： 启动</li><li>4： 开启失败</li><li>5： 停止中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>1： 停止</li><li>2： 开启中</li><li>3： 启动</li><li>4： 开启失败</li><li>5： 停止中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu <p>cpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>mem</p> 
     * @return Mem <p>mem</p>
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set <p>mem</p>
     * @param Mem <p>mem</p>
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>配置文件内容</p> 
     * @return Config <p>配置文件内容</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>配置文件内容</p>
     * @param Config <p>配置文件内容</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>CreatorUin</p> 
     * @return CreatorUin <p>CreatorUin</p>
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>CreatorUin</p>
     * @param CreatorUin <p>CreatorUin</p>
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

