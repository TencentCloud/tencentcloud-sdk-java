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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeNodeInfo extends AbstractModel{

    /**
    * IECP边缘节点ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点状态 （1健康｜2异常｜3离线｜4未激活）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private EdgeNodeResourceInfo Resource;

    /**
    * CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuArchitecture")
    @Expose
    private String CpuArchitecture;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 操作系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatingSystem")
    @Expose
    private String OperatingSystem;

    /**
    * 节点所属的NodeUnit
key：NodeUnit模版ID，Value：NodeUnit模版名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeUnits")
    @Expose
    private KeyValueObj NodeUnits;

    /**
     * Get IECP边缘节点ID 
     * @return Id IECP边缘节点ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set IECP边缘节点ID
     * @param Id IECP边缘节点ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 节点名称 
     * @return Name 节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名称
     * @param Name 节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点状态 （1健康｜2异常｜3离线｜4未激活） 
     * @return Status 节点状态 （1健康｜2异常｜3离线｜4未激活）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态 （1健康｜2异常｜3离线｜4未激活）
     * @param Status 节点状态 （1健康｜2异常｜3离线｜4未激活）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeNodeResourceInfo getResource() {
        return this.Resource;
    }

    /**
     * Set 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 节点资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(EdgeNodeResourceInfo Resource) {
        this.Resource = Resource;
    }

    /**
     * Get CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuArchitecture CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuArchitecture() {
        return this.CpuArchitecture;
    }

    /**
     * Set CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuArchitecture CPU体系结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuArchitecture(String CpuArchitecture) {
        this.CpuArchitecture = CpuArchitecture;
    }

    /**
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 操作系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatingSystem 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatingSystem() {
        return this.OperatingSystem;
    }

    /**
     * Set 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatingSystem 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    /**
     * Get 节点所属的NodeUnit
key：NodeUnit模版ID，Value：NodeUnit模版名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeUnits 节点所属的NodeUnit
key：NodeUnit模版ID，Value：NodeUnit模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueObj getNodeUnits() {
        return this.NodeUnits;
    }

    /**
     * Set 节点所属的NodeUnit
key：NodeUnit模版ID，Value：NodeUnit模版名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeUnits 节点所属的NodeUnit
key：NodeUnit模版ID，Value：NodeUnit模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeUnits(KeyValueObj NodeUnits) {
        this.NodeUnits = NodeUnits;
    }

    public EdgeNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeNodeInfo(EdgeNodeInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Resource != null) {
            this.Resource = new EdgeNodeResourceInfo(source.Resource);
        }
        if (source.CpuArchitecture != null) {
            this.CpuArchitecture = new String(source.CpuArchitecture);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.OperatingSystem != null) {
            this.OperatingSystem = new String(source.OperatingSystem);
        }
        if (source.NodeUnits != null) {
            this.NodeUnits = new KeyValueObj(source.NodeUnits);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "CpuArchitecture", this.CpuArchitecture);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "OperatingSystem", this.OperatingSystem);
        this.setParamObj(map, prefix + "NodeUnits.", this.NodeUnits);

    }
}

