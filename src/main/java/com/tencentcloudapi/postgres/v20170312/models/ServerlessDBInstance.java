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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessDBInstance extends AbstractModel{

    /**
    * 实例id，唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 字符集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private ServerlessDBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * 实例账户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBAccountSet")
    @Expose
    private ServerlessDBAccount [] DBAccountSet;

    /**
    * 实例下的db信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBDatabaseList")
    @Expose
    private String [] DBDatabaseList;

    /**
    * 实例绑定的标签数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 实例id，唯一标识符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBInstanceId 实例id，唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例id，唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBInstanceId 实例id，唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBInstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBInstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBInstanceStatus 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBInstanceStatus 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 字符集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBCharset 字符集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set 字符集
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBCharset 字符集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get 数据库版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBVersion 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBVersion 数据库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBInstanceNetInfo 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerlessDBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBInstanceNetInfo 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBInstanceNetInfo(ServerlessDBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get 实例账户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBAccountSet 实例账户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerlessDBAccount [] getDBAccountSet() {
        return this.DBAccountSet;
    }

    /**
     * Set 实例账户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBAccountSet 实例账户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBAccountSet(ServerlessDBAccount [] DBAccountSet) {
        this.DBAccountSet = DBAccountSet;
    }

    /**
     * Get 实例下的db信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBDatabaseList 实例下的db信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDBDatabaseList() {
        return this.DBDatabaseList;
    }

    /**
     * Set 实例下的db信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBDatabaseList 实例下的db信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBDatabaseList(String [] DBDatabaseList) {
        this.DBDatabaseList = DBDatabaseList;
    }

    /**
     * Get 实例绑定的标签数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 实例绑定的标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 实例绑定的标签数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 实例绑定的标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceStatus", this.DBInstanceStatus);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamArrayObj(map, prefix + "DBAccountSet.", this.DBAccountSet);
        this.setParamArraySimple(map, prefix + "DBDatabaseList.", this.DBDatabaseList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

