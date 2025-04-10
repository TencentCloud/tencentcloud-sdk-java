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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationTask extends AbstractModel {

    /**
    * 运维任务主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 运维任务ID
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 运维任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建用户
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 运维人员姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 任务类型，1 - 手工执行任务， 2 - 周期性任务
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 周期性任务执行间隔，单位天
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 执行账户
    */
    @SerializedName("NextTime")
    @Expose
    private String NextTime;

    /**
    * 下一次执行时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
     * Get 运维任务主键ID 
     * @return Id 运维任务主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 运维任务主键ID
     * @param Id 运维任务主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 运维任务ID 
     * @return OperationId 运维任务ID
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 运维任务ID
     * @param OperationId 运维任务ID
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 运维任务名称 
     * @return Name 运维任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 运维任务名称
     * @param Name 运维任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建用户 
     * @return UserName 创建用户
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 创建用户
     * @param UserName 创建用户
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 运维人员姓名 
     * @return RealName 运维人员姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 运维人员姓名
     * @param RealName 运维人员姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 任务类型，1 - 手工执行任务， 2 - 周期性任务 
     * @return Type 任务类型，1 - 手工执行任务， 2 - 周期性任务
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务类型，1 - 手工执行任务， 2 - 周期性任务
     * @param Type 任务类型，1 - 手工执行任务， 2 - 周期性任务
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 周期性任务执行间隔，单位天 
     * @return Period 周期性任务执行间隔，单位天
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 周期性任务执行间隔，单位天
     * @param Period 周期性任务执行间隔，单位天
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 执行账户 
     * @return NextTime 执行账户
     */
    public String getNextTime() {
        return this.NextTime;
    }

    /**
     * Set 执行账户
     * @param NextTime 执行账户
     */
    public void setNextTime(String NextTime) {
        this.NextTime = NextTime;
    }

    /**
     * Get 下一次执行时间 
     * @return FirstTime 下一次执行时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 下一次执行时间
     * @param FirstTime 下一次执行时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    public OperationTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationTask(OperationTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.NextTime != null) {
            this.NextTime = new String(source.NextTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "NextTime", this.NextTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);

    }
}

