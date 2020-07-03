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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubTaskDetail extends AbstractModel{

    /**
    * 子任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子任务结果
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 子任务错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 子任务类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 子任务状态，0处理中 1成功 -1失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 升级检查失败的索引名
    */
    @SerializedName("FailedIndices")
    @Expose
    private String [] FailedIndices;

    /**
    * 子任务结束时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 子任务等级，1警告 2失败
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 子任务名 
     * @return Name 子任务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子任务名
     * @param Name 子任务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子任务结果 
     * @return Result 子任务结果
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 子任务结果
     * @param Result 子任务结果
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 子任务错误信息 
     * @return ErrMsg 子任务错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 子任务错误信息
     * @param ErrMsg 子任务错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 子任务类型 
     * @return Type 子任务类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 子任务类型
     * @param Type 子任务类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 子任务状态，0处理中 1成功 -1失败 
     * @return Status 子任务状态，0处理中 1成功 -1失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 子任务状态，0处理中 1成功 -1失败
     * @param Status 子任务状态，0处理中 1成功 -1失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 升级检查失败的索引名 
     * @return FailedIndices 升级检查失败的索引名
     */
    public String [] getFailedIndices() {
        return this.FailedIndices;
    }

    /**
     * Set 升级检查失败的索引名
     * @param FailedIndices 升级检查失败的索引名
     */
    public void setFailedIndices(String [] FailedIndices) {
        this.FailedIndices = FailedIndices;
    }

    /**
     * Get 子任务结束时间 
     * @return FinishTime 子任务结束时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 子任务结束时间
     * @param FinishTime 子任务结束时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 子任务等级，1警告 2失败 
     * @return Level 子任务等级，1警告 2失败
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 子任务等级，1警告 2失败
     * @param Level 子任务等级，1警告 2失败
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "FailedIndices.", this.FailedIndices);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

