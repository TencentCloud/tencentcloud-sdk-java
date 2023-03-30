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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterActivity extends AbstractModel{

    /**
    * 集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群活动ID。
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 集群活动类型。取值范围：<br><li>CreateAndAddNodes：创建实例并添加进集群<br><li>RemoveNodesFromCluster：从集群移除实例<br><li>TerminateNodes：销毁实例<br><li>MountStorageOption：增加挂载选项并进行挂载<br><li>UmountStorageOption：删除集群挂载存储选项并解挂载

    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 集群活动状态。取值范围：<br><li>PENDING：等待运行<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>PARTIALLY_SUCCESSFUL：活动部分成功<br><li>FAILED：活动失败
    */
    @SerializedName("ActivityStatus")
    @Expose
    private String ActivityStatus;

    /**
    * 集群活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityStatusCode")
    @Expose
    private String ActivityStatusCode;

    /**
    * 集群活动结果详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultDetail")
    @Expose
    private String ResultDetail;

    /**
    * 集群活动起因。
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * 集群活动描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 集群活动相关节点活动集合。
    */
    @SerializedName("RelatedNodeActivitySet")
    @Expose
    private NodeActivity [] RelatedNodeActivitySet;

    /**
    * 集群活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 集群活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 集群ID。 
     * @return ClusterId 集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID。
     * @param ClusterId 集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群活动ID。 
     * @return ActivityId 集群活动ID。
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 集群活动ID。
     * @param ActivityId 集群活动ID。
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 集群活动类型。取值范围：<br><li>CreateAndAddNodes：创建实例并添加进集群<br><li>RemoveNodesFromCluster：从集群移除实例<br><li>TerminateNodes：销毁实例<br><li>MountStorageOption：增加挂载选项并进行挂载<br><li>UmountStorageOption：删除集群挂载存储选项并解挂载
 
     * @return ActivityType 集群活动类型。取值范围：<br><li>CreateAndAddNodes：创建实例并添加进集群<br><li>RemoveNodesFromCluster：从集群移除实例<br><li>TerminateNodes：销毁实例<br><li>MountStorageOption：增加挂载选项并进行挂载<br><li>UmountStorageOption：删除集群挂载存储选项并解挂载

     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 集群活动类型。取值范围：<br><li>CreateAndAddNodes：创建实例并添加进集群<br><li>RemoveNodesFromCluster：从集群移除实例<br><li>TerminateNodes：销毁实例<br><li>MountStorageOption：增加挂载选项并进行挂载<br><li>UmountStorageOption：删除集群挂载存储选项并解挂载

     * @param ActivityType 集群活动类型。取值范围：<br><li>CreateAndAddNodes：创建实例并添加进集群<br><li>RemoveNodesFromCluster：从集群移除实例<br><li>TerminateNodes：销毁实例<br><li>MountStorageOption：增加挂载选项并进行挂载<br><li>UmountStorageOption：删除集群挂载存储选项并解挂载

     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 集群活动状态。取值范围：<br><li>PENDING：等待运行<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>PARTIALLY_SUCCESSFUL：活动部分成功<br><li>FAILED：活动失败 
     * @return ActivityStatus 集群活动状态。取值范围：<br><li>PENDING：等待运行<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>PARTIALLY_SUCCESSFUL：活动部分成功<br><li>FAILED：活动失败
     */
    public String getActivityStatus() {
        return this.ActivityStatus;
    }

    /**
     * Set 集群活动状态。取值范围：<br><li>PENDING：等待运行<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>PARTIALLY_SUCCESSFUL：活动部分成功<br><li>FAILED：活动失败
     * @param ActivityStatus 集群活动状态。取值范围：<br><li>PENDING：等待运行<br><li>RUNNING：运行中<br><li>SUCCESSFUL：活动成功<br><li>PARTIALLY_SUCCESSFUL：活动部分成功<br><li>FAILED：活动失败
     */
    public void setActivityStatus(String ActivityStatus) {
        this.ActivityStatus = ActivityStatus;
    }

    /**
     * Get 集群活动状态码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityStatusCode 集群活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityStatusCode() {
        return this.ActivityStatusCode;
    }

    /**
     * Set 集群活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityStatusCode 集群活动状态码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityStatusCode(String ActivityStatusCode) {
        this.ActivityStatusCode = ActivityStatusCode;
    }

    /**
     * Get 集群活动结果详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultDetail 集群活动结果详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultDetail() {
        return this.ResultDetail;
    }

    /**
     * Set 集群活动结果详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultDetail 集群活动结果详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultDetail(String ResultDetail) {
        this.ResultDetail = ResultDetail;
    }

    /**
     * Get 集群活动起因。 
     * @return Cause 集群活动起因。
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set 集群活动起因。
     * @param Cause 集群活动起因。
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get 集群活动描述。 
     * @return Description 集群活动描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 集群活动描述。
     * @param Description 集群活动描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 集群活动相关节点活动集合。 
     * @return RelatedNodeActivitySet 集群活动相关节点活动集合。
     */
    public NodeActivity [] getRelatedNodeActivitySet() {
        return this.RelatedNodeActivitySet;
    }

    /**
     * Set 集群活动相关节点活动集合。
     * @param RelatedNodeActivitySet 集群活动相关节点活动集合。
     */
    public void setRelatedNodeActivitySet(NodeActivity [] RelatedNodeActivitySet) {
        this.RelatedNodeActivitySet = RelatedNodeActivitySet;
    }

    /**
     * Get 集群活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 集群活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 集群活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 集群活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 集群活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 集群活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 集群活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 集群活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ClusterActivity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterActivity(ClusterActivity source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.ActivityStatus != null) {
            this.ActivityStatus = new String(source.ActivityStatus);
        }
        if (source.ActivityStatusCode != null) {
            this.ActivityStatusCode = new String(source.ActivityStatusCode);
        }
        if (source.ResultDetail != null) {
            this.ResultDetail = new String(source.ResultDetail);
        }
        if (source.Cause != null) {
            this.Cause = new String(source.Cause);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RelatedNodeActivitySet != null) {
            this.RelatedNodeActivitySet = new NodeActivity[source.RelatedNodeActivitySet.length];
            for (int i = 0; i < source.RelatedNodeActivitySet.length; i++) {
                this.RelatedNodeActivitySet[i] = new NodeActivity(source.RelatedNodeActivitySet[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "ActivityStatus", this.ActivityStatus);
        this.setParamSimple(map, prefix + "ActivityStatusCode", this.ActivityStatusCode);
        this.setParamSimple(map, prefix + "ResultDetail", this.ResultDetail);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "RelatedNodeActivitySet.", this.RelatedNodeActivitySet);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

