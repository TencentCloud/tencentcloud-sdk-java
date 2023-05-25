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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterDatabaseRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 数据库名
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
    * 排序规则
    */
    @SerializedName("CollateRule")
    @Expose
    private String CollateRule;

    /**
    * 授权用户主机权限
    */
    @SerializedName("UserHostPrivileges")
    @Expose
    private UserHostPrivilege [] UserHostPrivileges;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 数据库名 
     * @return DbName 数据库名
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名
     * @param DbName 数据库名
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
     * Get 授权用户主机权限 
     * @return UserHostPrivileges 授权用户主机权限
     */
    public UserHostPrivilege [] getUserHostPrivileges() {
        return this.UserHostPrivileges;
    }

    /**
     * Set 授权用户主机权限
     * @param UserHostPrivileges 授权用户主机权限
     */
    public void setUserHostPrivileges(UserHostPrivilege [] UserHostPrivileges) {
        this.UserHostPrivileges = UserHostPrivileges;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateClusterDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterDatabaseRequest(CreateClusterDatabaseRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.CharacterSet != null) {
            this.CharacterSet = new String(source.CharacterSet);
        }
        if (source.CollateRule != null) {
            this.CollateRule = new String(source.CollateRule);
        }
        if (source.UserHostPrivileges != null) {
            this.UserHostPrivileges = new UserHostPrivilege[source.UserHostPrivileges.length];
            for (int i = 0; i < source.UserHostPrivileges.length; i++) {
                this.UserHostPrivileges[i] = new UserHostPrivilege(source.UserHostPrivileges[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "CharacterSet", this.CharacterSet);
        this.setParamSimple(map, prefix + "CollateRule", this.CollateRule);
        this.setParamArrayObj(map, prefix + "UserHostPrivileges.", this.UserHostPrivileges);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

