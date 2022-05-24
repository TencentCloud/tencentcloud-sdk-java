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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoCalloutTaskInfo extends AbstractModel{

    /**
    * 任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 被叫数量
    */
    @SerializedName("CalleeCount")
    @Expose
    private Long CalleeCount;

    /**
    * 主叫号码列表
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 起始时间戳
    */
    @SerializedName("NotBefore")
    @Expose
    private Long NotBefore;

    /**
    * 结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotAfter")
    @Expose
    private Long NotAfter;

    /**
    * 任务使用的IvrId
    */
    @SerializedName("IvrId")
    @Expose
    private Long IvrId;

    /**
    * 任务状态0初始 1运行中 2已完成 3结束中 4已结束
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 任务名 
     * @return Name 任务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名
     * @param Name 任务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 被叫数量 
     * @return CalleeCount 被叫数量
     */
    public Long getCalleeCount() {
        return this.CalleeCount;
    }

    /**
     * Set 被叫数量
     * @param CalleeCount 被叫数量
     */
    public void setCalleeCount(Long CalleeCount) {
        this.CalleeCount = CalleeCount;
    }

    /**
     * Get 主叫号码列表 
     * @return Callers 主叫号码列表
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫号码列表
     * @param Callers 主叫号码列表
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 起始时间戳 
     * @return NotBefore 起始时间戳
     */
    public Long getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set 起始时间戳
     * @param NotBefore 起始时间戳
     */
    public void setNotBefore(Long NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get 结束时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotAfter 结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set 结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotAfter 结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotAfter(Long NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get 任务使用的IvrId 
     * @return IvrId 任务使用的IvrId
     */
    public Long getIvrId() {
        return this.IvrId;
    }

    /**
     * Set 任务使用的IvrId
     * @param IvrId 任务使用的IvrId
     */
    public void setIvrId(Long IvrId) {
        this.IvrId = IvrId;
    }

    /**
     * Get 任务状态0初始 1运行中 2已完成 3结束中 4已结束 
     * @return State 任务状态0初始 1运行中 2已完成 3结束中 4已结束
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态0初始 1运行中 2已完成 3结束中 4已结束
     * @param State 任务状态0初始 1运行中 2已完成 3结束中 4已结束
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public AutoCalloutTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoCalloutTaskInfo(AutoCalloutTaskInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CalleeCount != null) {
            this.CalleeCount = new Long(source.CalleeCount);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.NotBefore != null) {
            this.NotBefore = new Long(source.NotBefore);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new Long(source.NotAfter);
        }
        if (source.IvrId != null) {
            this.IvrId = new Long(source.IvrId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CalleeCount", this.CalleeCount);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "IvrId", this.IvrId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

