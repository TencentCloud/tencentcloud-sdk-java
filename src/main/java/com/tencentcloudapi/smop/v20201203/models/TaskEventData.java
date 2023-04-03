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
package com.tencentcloudapi.smop.v20201203.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskEventData extends AbstractModel{

    /**
    * 状态码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 当前完成或正在完成的任务订单ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskOrderId")
    @Expose
    private String TaskOrderId;

    /**
    * 当前任务订单状态码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCode")
    @Expose
    private Long TaskCode;

    /**
    * 获得积分数/成长值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCoinNumber")
    @Expose
    private Long TaskCoinNumber;

    /**
    * 任务类型后台代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 当前积分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCoin")
    @Expose
    private Long TotalCoin;

    /**
    * 用户透传的代码块
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attach")
    @Expose
    private String Attach;

    /**
    * 计次任务当前完成次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoneTimes")
    @Expose
    private Long DoneTimes;

    /**
    * 计次任务当前所需完成次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTimes")
    @Expose
    private Long TotalTimes;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 当前成长值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrowScore")
    @Expose
    private Long GrowScore;

    /**
     * Get 状态码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 当前完成或正在完成的任务订单ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskOrderId 当前完成或正在完成的任务订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskOrderId() {
        return this.TaskOrderId;
    }

    /**
     * Set 当前完成或正在完成的任务订单ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskOrderId 当前完成或正在完成的任务订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskOrderId(String TaskOrderId) {
        this.TaskOrderId = TaskOrderId;
    }

    /**
     * Get 当前任务订单状态码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCode 当前任务订单状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCode() {
        return this.TaskCode;
    }

    /**
     * Set 当前任务订单状态码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCode 当前任务订单状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCode(Long TaskCode) {
        this.TaskCode = TaskCode;
    }

    /**
     * Get 获得积分数/成长值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCoinNumber 获得积分数/成长值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCoinNumber() {
        return this.TaskCoinNumber;
    }

    /**
     * Set 获得积分数/成长值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCoinNumber 获得积分数/成长值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCoinNumber(Long TaskCoinNumber) {
        this.TaskCoinNumber = TaskCoinNumber;
    }

    /**
     * Get 任务类型后台代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型后台代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型后台代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型后台代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 当前积分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCoin 当前积分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCoin() {
        return this.TotalCoin;
    }

    /**
     * Set 当前积分
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCoin 当前积分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCoin(Long TotalCoin) {
        this.TotalCoin = TotalCoin;
    }

    /**
     * Get 用户透传的代码块
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attach 用户透传的代码块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttach() {
        return this.Attach;
    }

    /**
     * Set 用户透传的代码块
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attach 用户透传的代码块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttach(String Attach) {
        this.Attach = Attach;
    }

    /**
     * Get 计次任务当前完成次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoneTimes 计次任务当前完成次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDoneTimes() {
        return this.DoneTimes;
    }

    /**
     * Set 计次任务当前完成次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoneTimes 计次任务当前完成次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoneTimes(Long DoneTimes) {
        this.DoneTimes = DoneTimes;
    }

    /**
     * Get 计次任务当前所需完成次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTimes 计次任务当前所需完成次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTimes() {
        return this.TotalTimes;
    }

    /**
     * Set 计次任务当前所需完成次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTimes 计次任务当前所需完成次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTimes(Long TotalTimes) {
        this.TotalTimes = TotalTimes;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 当前成长值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrowScore 当前成长值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGrowScore() {
        return this.GrowScore;
    }

    /**
     * Set 当前成长值
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrowScore 当前成长值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrowScore(Long GrowScore) {
        this.GrowScore = GrowScore;
    }

    public TaskEventData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskEventData(TaskEventData source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskOrderId != null) {
            this.TaskOrderId = new String(source.TaskOrderId);
        }
        if (source.TaskCode != null) {
            this.TaskCode = new Long(source.TaskCode);
        }
        if (source.TaskCoinNumber != null) {
            this.TaskCoinNumber = new Long(source.TaskCoinNumber);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TotalCoin != null) {
            this.TotalCoin = new Long(source.TotalCoin);
        }
        if (source.Attach != null) {
            this.Attach = new String(source.Attach);
        }
        if (source.DoneTimes != null) {
            this.DoneTimes = new Long(source.DoneTimes);
        }
        if (source.TotalTimes != null) {
            this.TotalTimes = new Long(source.TotalTimes);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.GrowScore != null) {
            this.GrowScore = new Long(source.GrowScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskOrderId", this.TaskOrderId);
        this.setParamSimple(map, prefix + "TaskCode", this.TaskCode);
        this.setParamSimple(map, prefix + "TaskCoinNumber", this.TaskCoinNumber);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TotalCoin", this.TotalCoin);
        this.setParamSimple(map, prefix + "Attach", this.Attach);
        this.setParamSimple(map, prefix + "DoneTimes", this.DoneTimes);
        this.setParamSimple(map, prefix + "TotalTimes", this.TotalTimes);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "GrowScore", this.GrowScore);

    }
}

