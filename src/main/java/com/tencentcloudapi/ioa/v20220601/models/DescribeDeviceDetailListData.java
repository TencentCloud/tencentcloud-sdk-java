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
    * <p>账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>计算机名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputerName")
    @Expose
    private String ComputerName;

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用户组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupIdPath")
    @Expose
    private String AccountGroupIdPath;

    /**
    * <p>用户组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * <p>终端组名path</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * <p>Ip地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>用户组名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * <p>终端组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupIdPath")
    @Expose
    private String GroupIdPath;

    /**
    * <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * <p>IOA账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoaUserName")
    @Expose
    private String IoaUserName;

    /**
    * <p>所在分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>所在分组Name</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>Mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>用户组名Path</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupNamePath")
    @Expose
    private String AccountGroupNamePath;

    /**
    * <p>列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get <p>账号名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>计算机名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputerName <p>计算机名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputerName() {
        return this.ComputerName;
    }

    /**
     * Set <p>计算机名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputerName <p>计算机名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputerName(String ComputerName) {
        this.ComputerName = ComputerName;
    }

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用户组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupIdPath <p>用户组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupIdPath() {
        return this.AccountGroupIdPath;
    }

    /**
     * Set <p>用户组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupIdPath <p>用户组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupIdPath(String AccountGroupIdPath) {
        this.AccountGroupIdPath = AccountGroupIdPath;
    }

    /**
     * Get <p>用户组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupId <p>用户组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>用户组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupId <p>用户组id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>终端组名path</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNamePath <p>终端组名path</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set <p>终端组名path</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNamePath <p>终端组名path</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get <p>Ip地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip <p>Ip地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Ip地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip <p>Ip地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>用户组名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupName <p>用户组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set <p>用户组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupName <p>用户组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get <p>终端组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupIdPath <p>终端组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupIdPath() {
        return this.GroupIdPath;
    }

    /**
     * Set <p>终端组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupIdPath <p>终端组IdPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupIdPath(String GroupIdPath) {
        this.GroupIdPath = GroupIdPath;
    }

    /**
     * Get <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mid <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mid <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get <p>IOA账号名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoaUserName <p>IOA账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIoaUserName() {
        return this.IoaUserName;
    }

    /**
     * Set <p>IOA账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoaUserName <p>IOA账号名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoaUserName(String IoaUserName) {
        this.IoaUserName = IoaUserName;
    }

    /**
     * Get <p>所在分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId <p>所在分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>所在分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId <p>所在分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>所在分组Name</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName <p>所在分组Name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>所在分组Name</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName <p>所在分组Name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>Mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mac <p>Mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set <p>Mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mac <p>Mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>软件版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>用户组名Path</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupNamePath <p>用户组名Path</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupNamePath() {
        return this.AccountGroupNamePath;
    }

    /**
     * Set <p>用户组名Path</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupNamePath <p>用户组名Path</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupNamePath(String AccountGroupNamePath) {
        this.AccountGroupNamePath = AccountGroupNamePath;
    }

    /**
     * Get <p>列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>列表Id(只支持32位)</p>
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

