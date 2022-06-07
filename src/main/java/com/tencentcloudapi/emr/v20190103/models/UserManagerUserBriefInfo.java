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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserManagerUserBriefInfo extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户所属的组
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * Manager表示管理员、NormalUser表示普通用户
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 用户创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义
    */
    @SerializedName("SupportDownLoadKeyTab")
    @Expose
    private Boolean SupportDownLoadKeyTab;

    /**
    * keytab文件的下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownLoadKeyTabUrl")
    @Expose
    private String DownLoadKeyTabUrl;

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户所属的组 
     * @return UserGroup 用户所属的组
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户所属的组
     * @param UserGroup 用户所属的组
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get Manager表示管理员、NormalUser表示普通用户 
     * @return UserType Manager表示管理员、NormalUser表示普通用户
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set Manager表示管理员、NormalUser表示普通用户
     * @param UserType Manager表示管理员、NormalUser表示普通用户
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 用户创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 用户创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 用户创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 用户创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义 
     * @return SupportDownLoadKeyTab 是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义
     */
    public Boolean getSupportDownLoadKeyTab() {
        return this.SupportDownLoadKeyTab;
    }

    /**
     * Set 是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义
     * @param SupportDownLoadKeyTab 是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义
     */
    public void setSupportDownLoadKeyTab(Boolean SupportDownLoadKeyTab) {
        this.SupportDownLoadKeyTab = SupportDownLoadKeyTab;
    }

    /**
     * Get keytab文件的下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownLoadKeyTabUrl keytab文件的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownLoadKeyTabUrl() {
        return this.DownLoadKeyTabUrl;
    }

    /**
     * Set keytab文件的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownLoadKeyTabUrl keytab文件的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownLoadKeyTabUrl(String DownLoadKeyTabUrl) {
        this.DownLoadKeyTabUrl = DownLoadKeyTabUrl;
    }

    public UserManagerUserBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserManagerUserBriefInfo(UserManagerUserBriefInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SupportDownLoadKeyTab != null) {
            this.SupportDownLoadKeyTab = new Boolean(source.SupportDownLoadKeyTab);
        }
        if (source.DownLoadKeyTabUrl != null) {
            this.DownLoadKeyTabUrl = new String(source.DownLoadKeyTabUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SupportDownLoadKeyTab", this.SupportDownLoadKeyTab);
        this.setParamSimple(map, prefix + "DownLoadKeyTabUrl", this.DownLoadKeyTabUrl);

    }
}

