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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessDBInstance extends AbstractModel {

    /**
    * 实例id，唯一标识符
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例名称
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * 实例状态
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 字符集
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * 数据库版本
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例网络信息
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private ServerlessDBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * 实例账户信息
    */
    @SerializedName("DBAccountSet")
    @Expose
    private ServerlessDBAccount [] DBAccountSet;

    /**
    * 实例下的db信息
    */
    @SerializedName("DBDatabaseList")
    @Expose
    private String [] DBDatabaseList;

    /**
    * 实例绑定的标签数组
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * 数据库内核版本
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * 数据库主要版本
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
     * Get 实例id，唯一标识符 
     * @return DBInstanceId 实例id，唯一标识符
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例id，唯一标识符
     * @param DBInstanceId 实例id，唯一标识符
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例名称 
     * @return DBInstanceName 实例名称
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set 实例名称
     * @param DBInstanceName 实例名称
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get 实例状态 
     * @return DBInstanceStatus 实例状态
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set 实例状态
     * @param DBInstanceStatus 实例状态
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 私有网络Id 
     * @return VpcId 私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络Id
     * @param VpcId 私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 字符集 
     * @return DBCharset 字符集
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set 字符集
     * @param DBCharset 字符集
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get 数据库版本 
     * @return DBVersion 数据库版本
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 数据库版本
     * @param DBVersion 数据库版本
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
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
     * Get 实例网络信息 
     * @return DBInstanceNetInfo 实例网络信息
     */
    public ServerlessDBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set 实例网络信息
     * @param DBInstanceNetInfo 实例网络信息
     */
    public void setDBInstanceNetInfo(ServerlessDBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get 实例账户信息 
     * @return DBAccountSet 实例账户信息
     */
    public ServerlessDBAccount [] getDBAccountSet() {
        return this.DBAccountSet;
    }

    /**
     * Set 实例账户信息
     * @param DBAccountSet 实例账户信息
     */
    public void setDBAccountSet(ServerlessDBAccount [] DBAccountSet) {
        this.DBAccountSet = DBAccountSet;
    }

    /**
     * Get 实例下的db信息 
     * @return DBDatabaseList 实例下的db信息
     */
    public String [] getDBDatabaseList() {
        return this.DBDatabaseList;
    }

    /**
     * Set 实例下的db信息
     * @param DBDatabaseList 实例下的db信息
     */
    public void setDBDatabaseList(String [] DBDatabaseList) {
        this.DBDatabaseList = DBDatabaseList;
    }

    /**
     * Get 实例绑定的标签数组 
     * @return TagList 实例绑定的标签数组
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 实例绑定的标签数组
     * @param TagList 实例绑定的标签数组
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 数据库内核版本 
     * @return DBKernelVersion 数据库内核版本
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set 数据库内核版本
     * @param DBKernelVersion 数据库内核版本
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get 数据库主要版本 
     * @return DBMajorVersion 数据库主要版本
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set 数据库主要版本
     * @param DBMajorVersion 数据库主要版本
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    public ServerlessDBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessDBInstance(ServerlessDBInstance source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBInstanceStatus != null) {
            this.DBInstanceStatus = new String(source.DBInstanceStatus);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new ServerlessDBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new ServerlessDBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.DBAccountSet != null) {
            this.DBAccountSet = new ServerlessDBAccount[source.DBAccountSet.length];
            for (int i = 0; i < source.DBAccountSet.length; i++) {
                this.DBAccountSet[i] = new ServerlessDBAccount(source.DBAccountSet[i]);
            }
        }
        if (source.DBDatabaseList != null) {
            this.DBDatabaseList = new String[source.DBDatabaseList.length];
            for (int i = 0; i < source.DBDatabaseList.length; i++) {
                this.DBDatabaseList[i] = new String(source.DBDatabaseList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
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
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);

    }
}

