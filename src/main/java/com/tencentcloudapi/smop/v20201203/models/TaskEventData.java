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
package com.tencentcloudapi.smop.v20201203.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskEventData extends AbstractModel {

    /**
    * 状态码，0为成功，-1为失败
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 提示信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 当前完成或正在完成的安心用户运营平台的任务订单ID
    */
    @SerializedName("TaskOrderId")
    @Expose
    private String TaskOrderId;

    /**
    * 当前任务订单状态码。1代表未完成；2代表已完成但未提交任务；3表示已完成，且已提交获得积分任务；4表示过期任务，提交后不获得积分。
    */
    @SerializedName("TaskCode")
    @Expose
    private Long TaskCode;

    /**
    * 获得积分数
    */
    @SerializedName("TaskCoinNumber")
    @Expose
    private Long TaskCoinNumber;

    /**
    * 任务类型后台代码
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 用户的当前积分
    */
    @SerializedName("TotalCoin")
    @Expose
    private Long TotalCoin;

    /**
    * 用户透传的附加数据
    */
    @SerializedName("Attach")
    @Expose
    private String Attach;

    /**
    * 计次任务当前完成次数
    */
    @SerializedName("DoneTimes")
    @Expose
    private Long DoneTimes;

    /**
    * 计次任务当前所需完成次数
    */
    @SerializedName("TotalTimes")
    @Expose
    private Long TotalTimes;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 用户当前成长值
    */
    @SerializedName("GrowScore")
    @Expose
    private Long GrowScore;

    /**
     * Get 状态码，0为成功，-1为失败 
     * @return Code 状态码，0为成功，-1为失败
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码，0为成功，-1为失败
     * @param Code 状态码，0为成功，-1为失败
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 提示信息 
     * @return Message 提示信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 提示信息
     * @param Message 提示信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 当前完成或正在完成的安心用户运营平台的任务订单ID 
     * @return TaskOrderId 当前完成或正在完成的安心用户运营平台的任务订单ID
     */
    public String getTaskOrderId() {
        return this.TaskOrderId;
    }

    /**
     * Set 当前完成或正在完成的安心用户运营平台的任务订单ID
     * @param TaskOrderId 当前完成或正在完成的安心用户运营平台的任务订单ID
     */
    public void setTaskOrderId(String TaskOrderId) {
        this.TaskOrderId = TaskOrderId;
    }

    /**
     * Get 当前任务订单状态码。1代表未完成；2代表已完成但未提交任务；3表示已完成，且已提交获得积分任务；4表示过期任务，提交后不获得积分。 
     * @return TaskCode 当前任务订单状态码。1代表未完成；2代表已完成但未提交任务；3表示已完成，且已提交获得积分任务；4表示过期任务，提交后不获得积分。
     */
    public Long getTaskCode() {
        return this.TaskCode;
    }

    /**
     * Set 当前任务订单状态码。1代表未完成；2代表已完成但未提交任务；3表示已完成，且已提交获得积分任务；4表示过期任务，提交后不获得积分。
     * @param TaskCode 当前任务订单状态码。1代表未完成；2代表已完成但未提交任务；3表示已完成，且已提交获得积分任务；4表示过期任务，提交后不获得积分。
     */
    public void setTaskCode(Long TaskCode) {
        this.TaskCode = TaskCode;
    }

    /**
     * Get 获得积分数 
     * @return TaskCoinNumber 获得积分数
     */
    public Long getTaskCoinNumber() {
        return this.TaskCoinNumber;
    }

    /**
     * Set 获得积分数
     * @param TaskCoinNumber 获得积分数
     */
    public void setTaskCoinNumber(Long TaskCoinNumber) {
        this.TaskCoinNumber = TaskCoinNumber;
    }

    /**
     * Get 任务类型后台代码 
     * @return TaskType 任务类型后台代码
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型后台代码
     * @param TaskType 任务类型后台代码
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 用户的当前积分 
     * @return TotalCoin 用户的当前积分
     */
    public Long getTotalCoin() {
        return this.TotalCoin;
    }

    /**
     * Set 用户的当前积分
     * @param TotalCoin 用户的当前积分
     */
    public void setTotalCoin(Long TotalCoin) {
        this.TotalCoin = TotalCoin;
    }

    /**
     * Get 用户透传的附加数据 
     * @return Attach 用户透传的附加数据
     */
    public String getAttach() {
        return this.Attach;
    }

    /**
     * Set 用户透传的附加数据
     * @param Attach 用户透传的附加数据
     */
    public void setAttach(String Attach) {
        this.Attach = Attach;
    }

    /**
     * Get 计次任务当前完成次数 
     * @return DoneTimes 计次任务当前完成次数
     */
    public Long getDoneTimes() {
        return this.DoneTimes;
    }

    /**
     * Set 计次任务当前完成次数
     * @param DoneTimes 计次任务当前完成次数
     */
    public void setDoneTimes(Long DoneTimes) {
        this.DoneTimes = DoneTimes;
    }

    /**
     * Get 计次任务当前所需完成次数 
     * @return TotalTimes 计次任务当前所需完成次数
     */
    public Long getTotalTimes() {
        return this.TotalTimes;
    }

    /**
     * Set 计次任务当前所需完成次数
     * @param TotalTimes 计次任务当前所需完成次数
     */
    public void setTotalTimes(Long TotalTimes) {
        this.TotalTimes = TotalTimes;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 用户当前成长值 
     * @return GrowScore 用户当前成长值
     */
    public Long getGrowScore() {
        return this.GrowScore;
    }

    /**
     * Set 用户当前成长值
     * @param GrowScore 用户当前成长值
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

