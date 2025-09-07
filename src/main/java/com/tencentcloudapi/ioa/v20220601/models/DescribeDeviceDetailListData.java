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

public class DescribeDeviceDetailListData extends AbstractModel {

    /**
    * 账号名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 计算机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputerName")
    @Expose
    private String ComputerName;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户组IdPath
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupIdPath")
    @Expose
    private String AccountGroupIdPath;

    /**
    * 用户组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * 终端组名path
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * Ip地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 用户组名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * 终端组IdPath
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupIdPath")
    @Expose
    private String GroupIdPath;

    /**
    * 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * IOA账号名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoaUserName")
    @Expose
    private String IoaUserName;

    /**
    * 所在分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 所在分组Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Mac地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * 软件版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 用户组名Path
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupNamePath")
    @Expose
    private String AccountGroupNamePath;

    /**
    * 列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 账号名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 账号名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账号名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 账号名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 计算机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputerName 计算机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputerName() {
        return this.ComputerName;
    }

    /**
     * Set 计算机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputerName 计算机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputerName(String ComputerName) {
        this.ComputerName = ComputerName;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户组IdPath
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupIdPath 用户组IdPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupIdPath() {
        return this.AccountGroupIdPath;
    }

    /**
     * Set 用户组IdPath
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupIdPath 用户组IdPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupIdPath(String AccountGroupIdPath) {
        this.AccountGroupIdPath = AccountGroupIdPath;
    }

    /**
     * Get 用户组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupId 用户组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 用户组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupId 用户组id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 终端组名path
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNamePath 终端组名path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set 终端组名path
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNamePath 终端组名path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get Ip地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip Ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip Ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 用户组名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupName 用户组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set 用户组名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupName 用户组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get 终端组IdPath
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupIdPath 终端组IdPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupIdPath() {
        return this.GroupIdPath;
    }

    /**
     * Set 终端组IdPath
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupIdPath 终端组IdPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupIdPath(String GroupIdPath) {
        this.GroupIdPath = GroupIdPath;
    }

    /**
     * Get 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mid 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mid 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get IOA账号名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoaUserName IOA账号名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIoaUserName() {
        return this.IoaUserName;
    }

    /**
     * Set IOA账号名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoaUserName IOA账号名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoaUserName(String IoaUserName) {
        this.IoaUserName = IoaUserName;
    }

    /**
     * Get 所在分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 所在分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 所在分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 所在分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 所在分组Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 所在分组Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 所在分组Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 所在分组Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Mac地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mac Mac地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set Mac地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mac Mac地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get 软件版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 软件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 用户组名Path
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupNamePath 用户组名Path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupNamePath() {
        return this.AccountGroupNamePath;
    }

    /**
     * Set 用户组名Path
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupNamePath 用户组名Path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupNamePath(String AccountGroupNamePath) {
        this.AccountGroupNamePath = AccountGroupNamePath;
    }

    /**
     * Get 列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public DescribeDeviceDetailListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceDetailListData(DescribeDeviceDetailListData source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ComputerName != null) {
            this.ComputerName = new String(source.ComputerName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AccountGroupIdPath != null) {
            this.AccountGroupIdPath = new String(source.AccountGroupIdPath);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new Long(source.AccountGroupId);
        }
        if (source.GroupNamePath != null) {
            this.GroupNamePath = new String(source.GroupNamePath);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.AccountGroupName != null) {
            this.AccountGroupName = new String(source.AccountGroupName);
        }
        if (source.GroupIdPath != null) {
            this.GroupIdPath = new String(source.GroupIdPath);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.IoaUserName != null) {
            this.IoaUserName = new String(source.IoaUserName);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.AccountGroupNamePath != null) {
            this.AccountGroupNamePath = new String(source.AccountGroupNamePath);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ComputerName", this.ComputerName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AccountGroupIdPath", this.AccountGroupIdPath);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "GroupNamePath", this.GroupNamePath);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "AccountGroupName", this.AccountGroupName);
        this.setParamSimple(map, prefix + "GroupIdPath", this.GroupIdPath);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamSimple(map, prefix + "IoaUserName", this.IoaUserName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "AccountGroupNamePath", this.AccountGroupNamePath);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

