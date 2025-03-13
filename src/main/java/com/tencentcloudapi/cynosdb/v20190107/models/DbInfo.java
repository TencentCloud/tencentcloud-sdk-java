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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbInfo extends AbstractModel {

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 字符集类型
    */
    @SerializedName("CharacterSet")
    @Expose
    private String CharacterSet;

    /**
    * 数据库状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 排序规则
    */
    @SerializedName("CollateRule")
    @Expose
    private String CollateRule;

    /**
    * 数据库备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户权限
    */
    @SerializedName("UserHostPrivileges")
    @Expose
    private UserHostPrivilege [] UserHostPrivileges;

    /**
    * 数据库ID
    */
    @SerializedName("DbId")
    @Expose
    private Long DbId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 字符集类型 
     * @return CharacterSet 字符集类型
     */
    public String getCharacterSet() {
        return this.CharacterSet;
    }

    /**
     * Set 字符集类型
     * @param CharacterSet 字符集类型
     */
    public void setCharacterSet(String CharacterSet) {
        this.CharacterSet = CharacterSet;
    }

    /**
     * Get 数据库状态 
     * @return Status 数据库状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库状态
     * @param Status 数据库状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 排序规则 
     * @return CollateRule 排序规则
     */
    public String getCollateRule() {
        return this.CollateRule;
    }

    /**
     * Set 排序规则
     * @param CollateRule 排序规则
     */
    public void setCollateRule(String CollateRule) {
        this.CollateRule = CollateRule;
    }

    /**
     * Get 数据库备注 
     * @return Description 数据库备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据库备注
     * @param Description 数据库备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户权限 
     * @return UserHostPrivileges 用户权限
     */
    public UserHostPrivilege [] getUserHostPrivileges() {
        return this.UserHostPrivileges;
    }

    /**
     * Set 用户权限
     * @param UserHostPrivileges 用户权限
     */
    public void setUserHostPrivileges(UserHostPrivilege [] UserHostPrivileges) {
        this.UserHostPrivileges = UserHostPrivileges;
    }

    /**
     * Get 数据库ID 
     * @return DbId 数据库ID
     */
    public Long getDbId() {
        return this.DbId;
    }

    /**
     * Set 数据库ID
     * @param DbId 数据库ID
     */
    public void setDbId(Long DbId) {
        this.DbId = DbId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbInfo(DbInfo source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.CharacterSet != null) {
            this.CharacterSet = new String(source.CharacterSet);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CollateRule != null) {
            this.CollateRule = new String(source.CollateRule);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserHostPrivileges != null) {
            this.UserHostPrivileges = new UserHostPrivilege[source.UserHostPrivileges.length];
            for (int i = 0; i < source.UserHostPrivileges.length; i++) {
                this.UserHostPrivileges[i] = new UserHostPrivilege(source.UserHostPrivileges[i]);
            }
        }
        if (source.DbId != null) {
            this.DbId = new Long(source.DbId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "CharacterSet", this.CharacterSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CollateRule", this.CollateRule);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "UserHostPrivileges.", this.UserHostPrivileges);
        this.setParamSimple(map, prefix + "DbId", this.DbId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

