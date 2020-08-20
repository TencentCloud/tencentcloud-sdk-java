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

public class CreateServerlessDBInstanceRequest extends AbstractModel{

    /**
    * 可用区ID。公测阶段仅支持ap-shanghai-2、ap-beijing-1,ap-guangzhou-2.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * DB实例名称，同一个账号下该值必须唯一。
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * PostgreSQL内核版本，目前只支持：10.4。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * PostgreSQL数据库字符集，目前支持UTF8。
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例需要绑定的标签数组信息
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 可用区ID。公测阶段仅支持ap-shanghai-2、ap-beijing-1,ap-guangzhou-2. 
     * @return Zone 可用区ID。公测阶段仅支持ap-shanghai-2、ap-beijing-1,ap-guangzhou-2.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区ID。公测阶段仅支持ap-shanghai-2、ap-beijing-1,ap-guangzhou-2.
     * @param Zone 可用区ID。公测阶段仅支持ap-shanghai-2、ap-beijing-1,ap-guangzhou-2.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get DB实例名称，同一个账号下该值必须唯一。 
     * @return DBInstanceName DB实例名称，同一个账号下该值必须唯一。
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set DB实例名称，同一个账号下该值必须唯一。
     * @param DBInstanceName DB实例名称，同一个账号下该值必须唯一。
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get PostgreSQL内核版本，目前只支持：10.4。 
     * @return DBVersion PostgreSQL内核版本，目前只支持：10.4。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set PostgreSQL内核版本，目前只支持：10.4。
     * @param DBVersion PostgreSQL内核版本，目前只支持：10.4。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get PostgreSQL数据库字符集，目前支持UTF8。 
     * @return DBCharset PostgreSQL数据库字符集，目前支持UTF8。
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set PostgreSQL数据库字符集，目前支持UTF8。
     * @param DBCharset PostgreSQL数据库字符集，目前支持UTF8。
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 私有网络ID。 
     * @return VpcId 私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID。
     * @param VpcId 私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络子网ID。 
     * @return SubnetId 私有网络子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络子网ID。
     * @param SubnetId 私有网络子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例需要绑定的标签数组信息 
     * @return TagList 实例需要绑定的标签数组信息
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 实例需要绑定的标签数组信息
     * @param TagList 实例需要绑定的标签数组信息
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

