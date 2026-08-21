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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineSubTask extends AbstractModel {

    /**
    * <p>子任务 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>所属主任务 ID（对应 BaselineMainTask.ID）。</p>
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
    * <p>子任务执行结果。取值：</p><ul><li>SUCCESS：成功</li><li>FAILED：失败</li><li>USER_CANCELED：用户取消</li><li>CHECKING：检测中</li><li>UNKNOWN：未知状态</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>子任务所属租户 Appid。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>子任务开始执行时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>子任务结束时间，未结束时为空。</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>CheckAssetType=HOST 时返回的主机资产信息，CLUSTER 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostAsset")
    @Expose
    private BaselineHostAsset HostAsset;

    /**
    * <p>状态码：失败时返回失败码（如 AGENT_OFFLINE、SCAN_TIMEOUT、CLIENT_SCAN_FAILED 等），检测中时返回检测状态，成功或用户取消时为空。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>失败时的详细原因描述，成功、用户取消或检测中时为空。</p>
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * <p>失败时的解决方案建议，成功、用户取消或检测中时为空。</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>CheckAssetType=CLUSTER 时返回的集群资产信息，HOST 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterAsset")
    @Expose
    private BaselineClusterAsset ClusterAsset;

    /**
     * Get <p>子任务 ID。</p> 
     * @return ID <p>子任务 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>子任务 ID。</p>
     * @param ID <p>子任务 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>所属主任务 ID（对应 BaselineMainTask.ID）。</p> 
     * @return TaskID <p>所属主任务 ID（对应 BaselineMainTask.ID）。</p>
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set <p>所属主任务 ID（对应 BaselineMainTask.ID）。</p>
     * @param TaskID <p>所属主任务 ID（对应 BaselineMainTask.ID）。</p>
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get <p>子任务执行结果。取值：</p><ul><li>SUCCESS：成功</li><li>FAILED：失败</li><li>USER_CANCELED：用户取消</li><li>CHECKING：检测中</li><li>UNKNOWN：未知状态</li></ul> 
     * @return Status <p>子任务执行结果。取值：</p><ul><li>SUCCESS：成功</li><li>FAILED：失败</li><li>USER_CANCELED：用户取消</li><li>CHECKING：检测中</li><li>UNKNOWN：未知状态</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>子任务执行结果。取值：</p><ul><li>SUCCESS：成功</li><li>FAILED：失败</li><li>USER_CANCELED：用户取消</li><li>CHECKING：检测中</li><li>UNKNOWN：未知状态</li></ul>
     * @param Status <p>子任务执行结果。取值：</p><ul><li>SUCCESS：成功</li><li>FAILED：失败</li><li>USER_CANCELED：用户取消</li><li>CHECKING：检测中</li><li>UNKNOWN：未知状态</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>子任务所属租户 Appid。</p> 
     * @return Appid <p>子任务所属租户 Appid。</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>子任务所属租户 Appid。</p>
     * @param Appid <p>子任务所属租户 Appid。</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>子任务开始执行时间。</p> 
     * @return StartTime <p>子任务开始执行时间。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>子任务开始执行时间。</p>
     * @param StartTime <p>子任务开始执行时间。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>子任务结束时间，未结束时为空。</p> 
     * @return FinishTime <p>子任务结束时间，未结束时为空。</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>子任务结束时间，未结束时为空。</p>
     * @param FinishTime <p>子任务结束时间，未结束时为空。</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul> 
     * @return CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     * @param CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>CheckAssetType=HOST 时返回的主机资产信息，CLUSTER 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostAsset <p>CheckAssetType=HOST 时返回的主机资产信息，CLUSTER 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineHostAsset getHostAsset() {
        return this.HostAsset;
    }

    /**
     * Set <p>CheckAssetType=HOST 时返回的主机资产信息，CLUSTER 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostAsset <p>CheckAssetType=HOST 时返回的主机资产信息，CLUSTER 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostAsset(BaselineHostAsset HostAsset) {
        this.HostAsset = HostAsset;
    }

    /**
     * Get <p>状态码：失败时返回失败码（如 AGENT_OFFLINE、SCAN_TIMEOUT、CLIENT_SCAN_FAILED 等），检测中时返回检测状态，成功或用户取消时为空。</p> 
     * @return ErrCode <p>状态码：失败时返回失败码（如 AGENT_OFFLINE、SCAN_TIMEOUT、CLIENT_SCAN_FAILED 等），检测中时返回检测状态，成功或用户取消时为空。</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>状态码：失败时返回失败码（如 AGENT_OFFLINE、SCAN_TIMEOUT、CLIENT_SCAN_FAILED 等），检测中时返回检测状态，成功或用户取消时为空。</p>
     * @param ErrCode <p>状态码：失败时返回失败码（如 AGENT_OFFLINE、SCAN_TIMEOUT、CLIENT_SCAN_FAILED 等），检测中时返回检测状态，成功或用户取消时为空。</p>
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>失败时的详细原因描述，成功、用户取消或检测中时为空。</p> 
     * @return ErrMessage <p>失败时的详细原因描述，成功、用户取消或检测中时为空。</p>
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set <p>失败时的详细原因描述，成功、用户取消或检测中时为空。</p>
     * @param ErrMessage <p>失败时的详细原因描述，成功、用户取消或检测中时为空。</p>
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get <p>失败时的解决方案建议，成功、用户取消或检测中时为空。</p> 
     * @return Solution <p>失败时的解决方案建议，成功、用户取消或检测中时为空。</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>失败时的解决方案建议，成功、用户取消或检测中时为空。</p>
     * @param Solution <p>失败时的解决方案建议，成功、用户取消或检测中时为空。</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>CheckAssetType=CLUSTER 时返回的集群资产信息，HOST 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterAsset <p>CheckAssetType=CLUSTER 时返回的集群资产信息，HOST 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineClusterAsset getClusterAsset() {
        return this.ClusterAsset;
    }

    /**
     * Set <p>CheckAssetType=CLUSTER 时返回的集群资产信息，HOST 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterAsset <p>CheckAssetType=CLUSTER 时返回的集群资产信息，HOST 时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterAsset(BaselineClusterAsset ClusterAsset) {
        this.ClusterAsset = ClusterAsset;
    }

    public BaselineSubTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineSubTask(BaselineSubTask source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.HostAsset != null) {
            this.HostAsset = new BaselineHostAsset(source.HostAsset);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.ClusterAsset != null) {
            this.ClusterAsset = new BaselineClusterAsset(source.ClusterAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamObj(map, prefix + "HostAsset.", this.HostAsset);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamObj(map, prefix + "ClusterAsset.", this.ClusterAsset);

    }
}

