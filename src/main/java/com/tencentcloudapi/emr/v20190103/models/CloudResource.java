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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudResource extends AbstractModel {

    /**
    * 组件角色名
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * pod请求数量
    */
    @SerializedName("PodNumber")
    @Expose
    private Long PodNumber;

    /**
    * Cpu请求数量最大值
    */
    @SerializedName("LimitCpu")
    @Expose
    private Long LimitCpu;

    /**
    * 内存请求数量最大值
    */
    @SerializedName("LimitMemory")
    @Expose
    private Long LimitMemory;

    /**
    * 服务名称，如HIVE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 数据卷目录设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeDir")
    @Expose
    private VolumeSetting VolumeDir;

    /**
    * 组件外部访问设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalAccess")
    @Expose
    private ExternalAccess ExternalAccess;

    /**
    * 节点亲和性设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Affinity")
    @Expose
    private NodeAffinity Affinity;

    /**
    * 所选数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disks")
    @Expose
    private Disk [] Disks;

    /**
     * Get 组件角色名 
     * @return ComponentName 组件角色名
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 组件角色名
     * @param ComponentName 组件角色名
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get pod请求数量 
     * @return PodNumber pod请求数量
     */
    public Long getPodNumber() {
        return this.PodNumber;
    }

    /**
     * Set pod请求数量
     * @param PodNumber pod请求数量
     */
    public void setPodNumber(Long PodNumber) {
        this.PodNumber = PodNumber;
    }

    /**
     * Get Cpu请求数量最大值 
     * @return LimitCpu Cpu请求数量最大值
     */
    public Long getLimitCpu() {
        return this.LimitCpu;
    }

    /**
     * Set Cpu请求数量最大值
     * @param LimitCpu Cpu请求数量最大值
     */
    public void setLimitCpu(Long LimitCpu) {
        this.LimitCpu = LimitCpu;
    }

    /**
     * Get 内存请求数量最大值 
     * @return LimitMemory 内存请求数量最大值
     */
    public Long getLimitMemory() {
        return this.LimitMemory;
    }

    /**
     * Set 内存请求数量最大值
     * @param LimitMemory 内存请求数量最大值
     */
    public void setLimitMemory(Long LimitMemory) {
        this.LimitMemory = LimitMemory;
    }

    /**
     * Get 服务名称，如HIVE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 服务名称，如HIVE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务名称，如HIVE
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 服务名称，如HIVE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 数据卷目录设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeDir 数据卷目录设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeSetting getVolumeDir() {
        return this.VolumeDir;
    }

    /**
     * Set 数据卷目录设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeDir 数据卷目录设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeDir(VolumeSetting VolumeDir) {
        this.VolumeDir = VolumeDir;
    }

    /**
     * Get 组件外部访问设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalAccess 组件外部访问设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalAccess getExternalAccess() {
        return this.ExternalAccess;
    }

    /**
     * Set 组件外部访问设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalAccess 组件外部访问设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalAccess(ExternalAccess ExternalAccess) {
        this.ExternalAccess = ExternalAccess;
    }

    /**
     * Get 节点亲和性设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Affinity 节点亲和性设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeAffinity getAffinity() {
        return this.Affinity;
    }

    /**
     * Set 节点亲和性设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Affinity 节点亲和性设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffinity(NodeAffinity Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get 所选数据盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disks 所选数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Disk [] getDisks() {
        return this.Disks;
    }

    /**
     * Set 所选数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disks 所选数据盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisks(Disk [] Disks) {
        this.Disks = Disks;
    }

    public CloudResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudResource(CloudResource source) {
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.PodNumber != null) {
            this.PodNumber = new Long(source.PodNumber);
        }
        if (source.LimitCpu != null) {
            this.LimitCpu = new Long(source.LimitCpu);
        }
        if (source.LimitMemory != null) {
            this.LimitMemory = new Long(source.LimitMemory);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.VolumeDir != null) {
            this.VolumeDir = new VolumeSetting(source.VolumeDir);
        }
        if (source.ExternalAccess != null) {
            this.ExternalAccess = new ExternalAccess(source.ExternalAccess);
        }
        if (source.Affinity != null) {
            this.Affinity = new NodeAffinity(source.Affinity);
        }
        if (source.Disks != null) {
            this.Disks = new Disk[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new Disk(source.Disks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "PodNumber", this.PodNumber);
        this.setParamSimple(map, prefix + "LimitCpu", this.LimitCpu);
        this.setParamSimple(map, prefix + "LimitMemory", this.LimitMemory);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamObj(map, prefix + "VolumeDir.", this.VolumeDir);
        this.setParamObj(map, prefix + "ExternalAccess.", this.ExternalAccess);
        this.setParamObj(map, prefix + "Affinity.", this.Affinity);
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);

    }
}

