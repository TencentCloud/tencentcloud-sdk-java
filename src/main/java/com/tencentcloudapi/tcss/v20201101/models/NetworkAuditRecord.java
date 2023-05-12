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

public class NetworkAuditRecord extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 操作人
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 策略名
    */
    @SerializedName("NetworkPolicyName")
    @Expose
    private String NetworkPolicyName;

    /**
    * 操作时间
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * 操作人appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 操作人uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 策略id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名字 
     * @return ClusterName 集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
     * @param ClusterName 集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群区域 
     * @return Region 集群区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 集群区域
     * @param Region 集群区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 动作 
     * @return Action 动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作
     * @param Action 动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 操作人 
     * @return Operation 操作人
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作人
     * @param Operation 操作人
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 策略名 
     * @return NetworkPolicyName 策略名
     */
    public String getNetworkPolicyName() {
        return this.NetworkPolicyName;
    }

    /**
     * Set 策略名
     * @param NetworkPolicyName 策略名
     */
    public void setNetworkPolicyName(String NetworkPolicyName) {
        this.NetworkPolicyName = NetworkPolicyName;
    }

    /**
     * Get 操作时间 
     * @return OperationTime 操作时间
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 操作时间
     * @param OperationTime 操作时间
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    /**
     * Get 操作人appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 操作人appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 操作人appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 操作人appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 操作人uin 
     * @return Uin 操作人uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 操作人uin
     * @param Uin 操作人uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 策略id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId 策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId 策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public NetworkAuditRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAuditRecord(NetworkAuditRecord source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.NetworkPolicyName != null) {
            this.NetworkPolicyName = new String(source.NetworkPolicyName);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "NetworkPolicyName", this.NetworkPolicyName);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

