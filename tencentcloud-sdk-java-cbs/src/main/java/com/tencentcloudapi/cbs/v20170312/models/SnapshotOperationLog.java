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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotOperationLog extends AbstractModel{

    /**
    * 操作者的UIN。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 操作类型。取值范围：
SNAP_OPERATION_DELETE：删除快照
SNAP_OPERATION_ROLLBACK：回滚快照
SNAP_OPERATION_MODIFY：修改快照属性
SNAP_OPERATION_CREATE：创建快照
SNAP_OPERATION_COPY：跨地域复制快照
ASP_OPERATION_CREATE_SNAP：由定期快照策略创建快照
ASP_OPERATION_DELETE_SNAP：由定期快照策略删除快照
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 操作的快照ID。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 操作的状态。取值范围：
SUCCESS :表示操作成功 
FAILED :表示操作失败 
PROCESSING :表示操作中。
    */
    @SerializedName("OperationState")
    @Expose
    private String OperationState;

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 操作者的UIN。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作者的UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的UIN。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作者的UIN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 操作类型。取值范围：
SNAP_OPERATION_DELETE：删除快照
SNAP_OPERATION_ROLLBACK：回滚快照
SNAP_OPERATION_MODIFY：修改快照属性
SNAP_OPERATION_CREATE：创建快照
SNAP_OPERATION_COPY：跨地域复制快照
ASP_OPERATION_CREATE_SNAP：由定期快照策略创建快照
ASP_OPERATION_DELETE_SNAP：由定期快照策略删除快照 
     * @return Operation 操作类型。取值范围：
SNAP_OPERATION_DELETE：删除快照
SNAP_OPERATION_ROLLBACK：回滚快照
SNAP_OPERATION_MODIFY：修改快照属性
SNAP_OPERATION_CREATE：创建快照
SNAP_OPERATION_COPY：跨地域复制快照
ASP_OPERATION_CREATE_SNAP：由定期快照策略创建快照
ASP_OPERATION_DELETE_SNAP：由定期快照策略删除快照
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型。取值范围：
SNAP_OPERATION_DELETE：删除快照
SNAP_OPERATION_ROLLBACK：回滚快照
SNAP_OPERATION_MODIFY：修改快照属性
SNAP_OPERATION_CREATE：创建快照
SNAP_OPERATION_COPY：跨地域复制快照
ASP_OPERATION_CREATE_SNAP：由定期快照策略创建快照
ASP_OPERATION_DELETE_SNAP：由定期快照策略删除快照
     * @param Operation 操作类型。取值范围：
SNAP_OPERATION_DELETE：删除快照
SNAP_OPERATION_ROLLBACK：回滚快照
SNAP_OPERATION_MODIFY：修改快照属性
SNAP_OPERATION_CREATE：创建快照
SNAP_OPERATION_COPY：跨地域复制快照
ASP_OPERATION_CREATE_SNAP：由定期快照策略创建快照
ASP_OPERATION_DELETE_SNAP：由定期快照策略删除快照
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 操作的快照ID。 
     * @return SnapshotId 操作的快照ID。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 操作的快照ID。
     * @param SnapshotId 操作的快照ID。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 操作的状态。取值范围：
SUCCESS :表示操作成功 
FAILED :表示操作失败 
PROCESSING :表示操作中。 
     * @return OperationState 操作的状态。取值范围：
SUCCESS :表示操作成功 
FAILED :表示操作失败 
PROCESSING :表示操作中。
     */
    public String getOperationState() {
        return this.OperationState;
    }

    /**
     * Set 操作的状态。取值范围：
SUCCESS :表示操作成功 
FAILED :表示操作失败 
PROCESSING :表示操作中。
     * @param OperationState 操作的状态。取值范围：
SUCCESS :表示操作成功 
FAILED :表示操作失败 
PROCESSING :表示操作中。
     */
    public void setOperationState(String OperationState) {
        this.OperationState = OperationState;
    }

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "OperationState", this.OperationState);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

