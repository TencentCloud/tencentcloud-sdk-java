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

public class DescribeAutoCalloutTaskResponse extends AbstractModel{

    /**
    * 任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 任务起始时间戳
    */
    @SerializedName("NotBefore")
    @Expose
    private Long NotBefore;

    /**
    * 任务结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotAfter")
    @Expose
    private Long NotAfter;

    /**
    * 主叫列表
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 被叫信息列表
    */
    @SerializedName("Callees")
    @Expose
    private AutoCalloutTaskCalleeInfo [] Callees;

    /**
    * 任务使用的IvrId
    */
    @SerializedName("IvrId")
    @Expose
    private Long IvrId;

    /**
    * 任务状态 0初始 1运行中 2已完成 3结束中 4已终止
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 任务描述 
     * @return Description 任务描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
     * @param Description 任务描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 任务起始时间戳 
     * @return NotBefore 任务起始时间戳
     */
    public Long getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set 任务起始时间戳
     * @param NotBefore 任务起始时间戳
     */
    public void setNotBefore(Long NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get 任务结束时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotAfter 任务结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set 任务结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotAfter 任务结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotAfter(Long NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get 主叫列表 
     * @return Callers 主叫列表
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫列表
     * @param Callers 主叫列表
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 被叫信息列表 
     * @return Callees 被叫信息列表
     */
    public AutoCalloutTaskCalleeInfo [] getCallees() {
        return this.Callees;
    }

    /**
     * Set 被叫信息列表
     * @param Callees 被叫信息列表
     */
    public void setCallees(AutoCalloutTaskCalleeInfo [] Callees) {
        this.Callees = Callees;
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
     * Get 任务状态 0初始 1运行中 2已完成 3结束中 4已终止 
     * @return State 任务状态 0初始 1运行中 2已完成 3结束中 4已终止
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态 0初始 1运行中 2已完成 3结束中 4已终止
     * @param State 任务状态 0初始 1运行中 2已完成 3结束中 4已终止
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAutoCalloutTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoCalloutTaskResponse(DescribeAutoCalloutTaskResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NotBefore != null) {
            this.NotBefore = new Long(source.NotBefore);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new Long(source.NotAfter);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.Callees != null) {
            this.Callees = new AutoCalloutTaskCalleeInfo[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new AutoCalloutTaskCalleeInfo(source.Callees[i]);
            }
        }
        if (source.IvrId != null) {
            this.IvrId = new Long(source.IvrId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamArrayObj(map, prefix + "Callees.", this.Callees);
        this.setParamSimple(map, prefix + "IvrId", this.IvrId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

