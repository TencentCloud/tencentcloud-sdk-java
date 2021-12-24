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

public class GridPodInfo extends AbstractModel{

    /**
    * Pod名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * 状态(Pending｜Running｜Succeeded｜Failed｜Unknown)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 节点名
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点IP
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
    * Pod的IP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * 启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运行时长（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunSec")
    @Expose
    private Long RunSec;

    /**
    * 重启次数
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 集群名称ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
     * Get Pod名称 
     * @return Name Pod名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pod名称
     * @param Name Pod名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间 
     * @return NameSpace 命名空间
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set 命名空间
     * @param NameSpace 命名空间
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get 状态(Pending｜Running｜Succeeded｜Failed｜Unknown) 
     * @return Status 状态(Pending｜Running｜Succeeded｜Failed｜Unknown)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态(Pending｜Running｜Succeeded｜Failed｜Unknown)
     * @param Status 状态(Pending｜Running｜Succeeded｜Failed｜Unknown)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 节点名 
     * @return NodeName 节点名
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名
     * @param NodeName 节点名
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点IP 
     * @return NodeIP 节点IP
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set 节点IP
     * @param NodeIP 节点IP
     */
    public void setNodeIP(String NodeIP) {
        this.NodeIP = NodeIP;
    }

    /**
     * Get Pod的IP 
     * @return PodIP Pod的IP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod的IP
     * @param PodIP Pod的IP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get 启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 运行时长（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunSec 运行时长（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunSec() {
        return this.RunSec;
    }

    /**
     * Set 运行时长（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunSec 运行时长（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunSec(Long RunSec) {
        this.RunSec = RunSec;
    }

    /**
     * Get 重启次数 
     * @return RestartCount 重启次数
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
     * @param RestartCount 重启次数
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 集群名称ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterID 集群名称ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群名称ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterID 集群名称ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    public GridPodInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GridPodInfo(GridPodInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeIP != null) {
            this.NodeIP = new String(source.NodeIP);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RunSec != null) {
            this.RunSec = new Long(source.RunSec);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeIP", this.NodeIP);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RunSec", this.RunSec);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);

    }
}

