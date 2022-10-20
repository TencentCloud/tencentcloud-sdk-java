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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogJoinObjectInfo extends AbstractModel{

    /**
    * 主机ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 主机名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 主机状态
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 接入状态(true:已接入  false:未接入)
    */
    @SerializedName("JoinState")
    @Expose
    private Boolean JoinState;

    /**
    * 集群版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群主节点地址
    */
    @SerializedName("ClusterMainAddress")
    @Expose
    private String ClusterMainAddress;

    /**
     * Get 主机ID 
     * @return HostID 主机ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set 主机ID
     * @param HostID 主机ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 主机名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIP 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIP 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 主机状态 
     * @return HostStatus 主机状态
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set 主机状态
     * @param HostStatus 主机状态
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterID 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterID 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 外网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIP 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIP 外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 接入状态(true:已接入  false:未接入) 
     * @return JoinState 接入状态(true:已接入  false:未接入)
     */
    public Boolean getJoinState() {
        return this.JoinState;
    }

    /**
     * Set 接入状态(true:已接入  false:未接入)
     * @param JoinState 接入状态(true:已接入  false:未接入)
     */
    public void setJoinState(Boolean JoinState) {
        this.JoinState = JoinState;
    }

    /**
     * Get 集群版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterVersion 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterVersion 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 集群主节点地址 
     * @return ClusterMainAddress 集群主节点地址
     */
    public String getClusterMainAddress() {
        return this.ClusterMainAddress;
    }

    /**
     * Set 集群主节点地址
     * @param ClusterMainAddress 集群主节点地址
     */
    public void setClusterMainAddress(String ClusterMainAddress) {
        this.ClusterMainAddress = ClusterMainAddress;
    }

    public SecLogJoinObjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogJoinObjectInfo(SecLogJoinObjectInfo source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.JoinState != null) {
            this.JoinState = new Boolean(source.JoinState);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterMainAddress != null) {
            this.ClusterMainAddress = new String(source.ClusterMainAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "JoinState", this.JoinState);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterMainAddress", this.ClusterMainAddress);

    }
}

