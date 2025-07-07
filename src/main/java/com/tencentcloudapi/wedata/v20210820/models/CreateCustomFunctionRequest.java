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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomFunctionRequest extends AbstractModel {

    /**
    * 枚举值：HIVE、SPARK、DLC
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 枚举值：ANALYSIS(函数)、ENCRYPTION(加密函数)、AGGREGATE(聚合函数)、LOGIC(逻辑函数)、DATE_AND_TIME(日期与时间函数)、MATH(数学函数)、CONVERSION(转换函数)、STRING(字符串函数)、IP_AND_DOMAIN(IP和域名函数)、WINDOW(窗口函数)、OTHER(其他函数)
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 函数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集群实例引擎 ID
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 函数资源文件类型
    */
    @SerializedName("FunctionResourceFileType")
    @Expose
    private String FunctionResourceFileType;

    /**
     * Get 枚举值：HIVE、SPARK、DLC 
     * @return Type 枚举值：HIVE、SPARK、DLC
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 枚举值：HIVE、SPARK、DLC
     * @param Type 枚举值：HIVE、SPARK、DLC
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 枚举值：ANALYSIS(函数)、ENCRYPTION(加密函数)、AGGREGATE(聚合函数)、LOGIC(逻辑函数)、DATE_AND_TIME(日期与时间函数)、MATH(数学函数)、CONVERSION(转换函数)、STRING(字符串函数)、IP_AND_DOMAIN(IP和域名函数)、WINDOW(窗口函数)、OTHER(其他函数) 
     * @return Kind 枚举值：ANALYSIS(函数)、ENCRYPTION(加密函数)、AGGREGATE(聚合函数)、LOGIC(逻辑函数)、DATE_AND_TIME(日期与时间函数)、MATH(数学函数)、CONVERSION(转换函数)、STRING(字符串函数)、IP_AND_DOMAIN(IP和域名函数)、WINDOW(窗口函数)、OTHER(其他函数)
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 枚举值：ANALYSIS(函数)、ENCRYPTION(加密函数)、AGGREGATE(聚合函数)、LOGIC(逻辑函数)、DATE_AND_TIME(日期与时间函数)、MATH(数学函数)、CONVERSION(转换函数)、STRING(字符串函数)、IP_AND_DOMAIN(IP和域名函数)、WINDOW(窗口函数)、OTHER(其他函数)
     * @param Kind 枚举值：ANALYSIS(函数)、ENCRYPTION(加密函数)、AGGREGATE(聚合函数)、LOGIC(逻辑函数)、DATE_AND_TIME(日期与时间函数)、MATH(数学函数)、CONVERSION(转换函数)、STRING(字符串函数)、IP_AND_DOMAIN(IP和域名函数)、WINDOW(窗口函数)、OTHER(其他函数)
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 函数名称 
     * @return Name 函数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 函数名称
     * @param Name 函数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集群实例引擎 ID 
     * @return ClusterIdentifier 集群实例引擎 ID
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set 集群实例引擎 ID
     * @param ClusterIdentifier 集群实例引擎 ID
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

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
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 函数资源文件类型 
     * @return FunctionResourceFileType 函数资源文件类型
     */
    public String getFunctionResourceFileType() {
        return this.FunctionResourceFileType;
    }

    /**
     * Set 函数资源文件类型
     * @param FunctionResourceFileType 函数资源文件类型
     */
    public void setFunctionResourceFileType(String FunctionResourceFileType) {
        this.FunctionResourceFileType = FunctionResourceFileType;
    }

    public CreateCustomFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomFunctionRequest(CreateCustomFunctionRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FunctionResourceFileType != null) {
            this.FunctionResourceFileType = new String(source.FunctionResourceFileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FunctionResourceFileType", this.FunctionResourceFileType);

    }
}

