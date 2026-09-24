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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirtualAccountsData extends AbstractModel {

    /**
    * <p>Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>用户账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>账户分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * <p>账户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>关联服务器名称(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountId")
    @Expose
    private Long AccountId;

    /**
    * <p>账户源(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>账户namepath</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * <p>账户扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
    * <p>多OU组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroups")
    @Expose
    private DescribeAccountAccountGroupsData [] AccountGroups;

    /**
    * <p>绑定PC端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PcBindNum")
    @Expose
    private Long PcBindNum;

    /**
    * <p>绑定移动端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MobileBindNum")
    @Expose
    private Long MobileBindNum;

    /**
     * Get <p>Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>用户账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId <p>用户账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId <p>用户账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>账户分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupId <p>账户分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>账户分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupId <p>账户分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>账户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName <p>账户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>账户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName <p>账户组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>关联服务器名称(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountId <p>关联服务器名称(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountId() {
        return this.AccountId;
    }

    /**
     * Set <p>关联服务器名称(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountId <p>关联服务器名称(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountId(Long AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get <p>账户源(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source <p>账户源(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>账户源(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source <p>账户源(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>账户namepath</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamePath <p>账户namepath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set <p>账户namepath</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamePath <p>账户namepath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get <p>账户扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo <p>账户扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>账户扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo <p>账户扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Itime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Itime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Utime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Utime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    /**
     * Get <p>多OU组信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroups <p>多OU组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeAccountAccountGroupsData [] getAccountGroups() {
        return this.AccountGroups;
    }

    /**
     * Set <p>多OU组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroups <p>多OU组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroups(DescribeAccountAccountGroupsData [] AccountGroups) {
        this.AccountGroups = AccountGroups;
    }

    /**
     * Get <p>绑定PC端数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PcBindNum <p>绑定PC端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPcBindNum() {
        return this.PcBindNum;
    }

    /**
     * Set <p>绑定PC端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PcBindNum <p>绑定PC端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPcBindNum(Long PcBindNum) {
        this.PcBindNum = PcBindNum;
    }

    /**
     * Get <p>绑定移动端数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MobileBindNum <p>绑定移动端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMobileBindNum() {
        return this.MobileBindNum;
    }

    /**
     * Set <p>绑定移动端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MobileBindNum <p>绑定移动端数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobileBindNum(Long MobileBindNum) {
        this.MobileBindNum = MobileBindNum;
    }

    public DescribeVirtualAccountsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirtualAccountsData(DescribeVirtualAccountsData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new Long(source.AccountGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.AccountId != null) {
            this.AccountId = new Long(source.AccountId);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NamePath != null) {
            this.NamePath = new String(source.NamePath);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.Itime != null) {
            this.Itime = new String(source.Itime);
        }
        if (source.Utime != null) {
            this.Utime = new String(source.Utime);
        }
        if (source.AccountGroups != null) {
            this.AccountGroups = new DescribeAccountAccountGroupsData[source.AccountGroups.length];
            for (int i = 0; i < source.AccountGroups.length; i++) {
                this.AccountGroups[i] = new DescribeAccountAccountGroupsData(source.AccountGroups[i]);
            }
        }
        if (source.PcBindNum != null) {
            this.PcBindNum = new Long(source.PcBindNum);
        }
        if (source.MobileBindNum != null) {
            this.MobileBindNum = new Long(source.MobileBindNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NamePath", this.NamePath);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "Itime", this.Itime);
        this.setParamSimple(map, prefix + "Utime", this.Utime);
        this.setParamArrayObj(map, prefix + "AccountGroups.", this.AccountGroups);
        this.setParamSimple(map, prefix + "PcBindNum", this.PcBindNum);
        this.setParamSimple(map, prefix + "MobileBindNum", this.MobileBindNum);

    }
}

