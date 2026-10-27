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

public class Usage extends AbstractModel {

    /**
    * 桌面实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 桌面名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 桌面当前状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 桌面绑定的用户名，若未绑定，为空
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 桌面计费类型
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 桌面类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 桌面操作系统
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 桌面使用时长，h:m:s
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 桌面空闲时长，h:m:s
    */
    @SerializedName("IdleTime")
    @Expose
    private String IdleTime;

    /**
    * 是否匿名访问
    */
    @SerializedName("AnonymousAccess")
    @Expose
    private Boolean AnonymousAccess;

    /**
     * Get 桌面实例 ID 
     * @return InstanceId 桌面实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 桌面实例 ID
     * @param InstanceId 桌面实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 桌面名称 
     * @return Name 桌面名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 桌面名称
     * @param Name 桌面名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 桌面当前状态 
     * @return Status 桌面当前状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 桌面当前状态
     * @param Status 桌面当前状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 桌面绑定的用户名，若未绑定，为空 
     * @return UserName 桌面绑定的用户名，若未绑定，为空
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 桌面绑定的用户名，若未绑定，为空
     * @param UserName 桌面绑定的用户名，若未绑定，为空
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 桌面计费类型 
     * @return ChargeType 桌面计费类型
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 桌面计费类型
     * @param ChargeType 桌面计费类型
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 桌面类型 
     * @return InstanceType 桌面类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 桌面类型
     * @param InstanceType 桌面类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 桌面操作系统 
     * @return OsName 桌面操作系统
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 桌面操作系统
     * @param OsName 桌面操作系统
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 桌面使用时长，h:m:s 
     * @return ActiveTime 桌面使用时长，h:m:s
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 桌面使用时长，h:m:s
     * @param ActiveTime 桌面使用时长，h:m:s
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 桌面空闲时长，h:m:s 
     * @return IdleTime 桌面空闲时长，h:m:s
     */
    public String getIdleTime() {
        return this.IdleTime;
    }

    /**
     * Set 桌面空闲时长，h:m:s
     * @param IdleTime 桌面空闲时长，h:m:s
     */
    public void setIdleTime(String IdleTime) {
        this.IdleTime = IdleTime;
    }

    /**
     * Get 是否匿名访问 
     * @return AnonymousAccess 是否匿名访问
     */
    public Boolean getAnonymousAccess() {
        return this.AnonymousAccess;
    }

    /**
     * Set 是否匿名访问
     * @param AnonymousAccess 是否匿名访问
     */
    public void setAnonymousAccess(Boolean AnonymousAccess) {
        this.AnonymousAccess = AnonymousAccess;
    }

    public Usage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Usage(Usage source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.IdleTime != null) {
            this.IdleTime = new String(source.IdleTime);
        }
        if (source.AnonymousAccess != null) {
            this.AnonymousAccess = new Boolean(source.AnonymousAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "IdleTime", this.IdleTime);
        this.setParamSimple(map, prefix + "AnonymousAccess", this.AnonymousAccess);

    }
}

