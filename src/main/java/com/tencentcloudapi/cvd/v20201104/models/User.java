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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel {

    /**
    * <p>用户ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>名字。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>显示名字。</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>邮箱。</p>
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * <p>手机号。</p>
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * <p>状态。<br>ACTIVE:启用<br>PENDING_ACTIVATE:待激活<br>PENDING_ONBOARD:待启用<br>SUSPENDED:已停用<br>INACTIVE:已离职<br>PASSWORD_RESET:重置密码<br>LOCKED_OUT:锁定</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>部门ID。</p>
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * <p>策略ID。</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * <p>策略名称。</p>
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <p>当前用户是否绑定桌面，true：绑定，false：未绑定任何桌面</p>
    */
    @SerializedName("BindStatus")
    @Expose
    private Boolean BindStatus;

    /**
     * Get <p>用户ID。</p> 
     * @return Id <p>用户ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>用户ID。</p>
     * @param Id <p>用户ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>名字。</p> 
     * @return Name <p>名字。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名字。</p>
     * @param Name <p>名字。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>显示名字。</p> 
     * @return DisplayName <p>显示名字。</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>显示名字。</p>
     * @param DisplayName <p>显示名字。</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>邮箱。</p> 
     * @return Mail <p>邮箱。</p>
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set <p>邮箱。</p>
     * @param Mail <p>邮箱。</p>
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get <p>手机号。</p> 
     * @return PhoneNum <p>手机号。</p>
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set <p>手机号。</p>
     * @param PhoneNum <p>手机号。</p>
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get <p>状态。<br>ACTIVE:启用<br>PENDING_ACTIVATE:待激活<br>PENDING_ONBOARD:待启用<br>SUSPENDED:已停用<br>INACTIVE:已离职<br>PASSWORD_RESET:重置密码<br>LOCKED_OUT:锁定</p> 
     * @return Status <p>状态。<br>ACTIVE:启用<br>PENDING_ACTIVATE:待激活<br>PENDING_ONBOARD:待启用<br>SUSPENDED:已停用<br>INACTIVE:已离职<br>PASSWORD_RESET:重置密码<br>LOCKED_OUT:锁定</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。<br>ACTIVE:启用<br>PENDING_ACTIVATE:待激活<br>PENDING_ONBOARD:待启用<br>SUSPENDED:已停用<br>INACTIVE:已离职<br>PASSWORD_RESET:重置密码<br>LOCKED_OUT:锁定</p>
     * @param Status <p>状态。<br>ACTIVE:启用<br>PENDING_ACTIVATE:待激活<br>PENDING_ONBOARD:待启用<br>SUSPENDED:已停用<br>INACTIVE:已离职<br>PASSWORD_RESET:重置密码<br>LOCKED_OUT:锁定</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>部门ID。</p> 
     * @return DepartmentId <p>部门ID。</p>
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set <p>部门ID。</p>
     * @param DepartmentId <p>部门ID。</p>
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get <p>策略ID。</p> 
     * @return StrategyId <p>策略ID。</p>
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>策略ID。</p>
     * @param StrategyId <p>策略ID。</p>
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get <p>策略名称。</p> 
     * @return StrategyName <p>策略名称。</p>
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set <p>策略名称。</p>
     * @param StrategyName <p>策略名称。</p>
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <p>当前用户是否绑定桌面，true：绑定，false：未绑定任何桌面</p> 
     * @return BindStatus <p>当前用户是否绑定桌面，true：绑定，false：未绑定任何桌面</p>
     */
    public Boolean getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set <p>当前用户是否绑定桌面，true：绑定，false：未绑定任何桌面</p>
     * @param BindStatus <p>当前用户是否绑定桌面，true：绑定，false：未绑定任何桌面</p>
     */
    public void setBindStatus(Boolean BindStatus) {
        this.BindStatus = BindStatus;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Boolean(source.BindStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);

    }
}

