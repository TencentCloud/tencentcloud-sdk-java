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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDatasourceRequest extends AbstractModel {

    /**
    * <p>HOST</p>
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * <p>端口</p>
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * <p>后端提供字典：域类型，1、腾讯云，2、本地</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>驱动</p><p>枚举值：</p><ul><li>MYSQL： MySQL数据库</li><li>PRESTO： PRESTO数据库</li><li>POSTGRE： PostgreSQL数据库</li><li>DLC： DLC数据库</li><li>MSSQL： 微软SQL Server数据库</li></ul>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>数据库编码</p>
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * <p>用户名</p>
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * <p>密码</p>
    */
    @SerializedName("DbPwd")
    @Expose
    private String DbPwd;

    /**
    * <p>数据库名称</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>数据库别名</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>数据源id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>catalog值</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>第三方数据源标识</p>
    */
    @SerializedName("DataOrigin")
    @Expose
    private String DataOrigin;

    /**
    * <p>第三方项目id</p>
    */
    @SerializedName("DataOriginProjectId")
    @Expose
    private String DataOriginProjectId;

    /**
    * <p>第三方数据源id</p>
    */
    @SerializedName("DataOriginDatasourceId")
    @Expose
    private String DataOriginDatasourceId;

    /**
    * <p>扩展参数</p>
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * <p>腾讯云私有网络统一标识</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>私有网络ip</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>私有网络端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * <p>腾讯云私有网络标识</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>开启vpc</p>
    */
    @SerializedName("UseVPC")
    @Expose
    private Boolean UseVPC;

    /**
    * <p>地域</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>数据库schema</p>
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
     * Get <p>HOST</p> 
     * @return DbHost <p>HOST</p>
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set <p>HOST</p>
     * @param DbHost <p>HOST</p>
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get <p>端口</p> 
     * @return DbPort <p>端口</p>
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set <p>端口</p>
     * @param DbPort <p>端口</p>
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get <p>后端提供字典：域类型，1、腾讯云，2、本地</p> 
     * @return ServiceType <p>后端提供字典：域类型，1、腾讯云，2、本地</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>后端提供字典：域类型，1、腾讯云，2、本地</p>
     * @param ServiceType <p>后端提供字典：域类型，1、腾讯云，2、本地</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>驱动</p><p>枚举值：</p><ul><li>MYSQL： MySQL数据库</li><li>PRESTO： PRESTO数据库</li><li>POSTGRE： PostgreSQL数据库</li><li>DLC： DLC数据库</li><li>MSSQL： 微软SQL Server数据库</li></ul> 
     * @return DbType <p>驱动</p><p>枚举值：</p><ul><li>MYSQL： MySQL数据库</li><li>PRESTO： PRESTO数据库</li><li>POSTGRE： PostgreSQL数据库</li><li>DLC： DLC数据库</li><li>MSSQL： 微软SQL Server数据库</li></ul>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>驱动</p><p>枚举值：</p><ul><li>MYSQL： MySQL数据库</li><li>PRESTO： PRESTO数据库</li><li>POSTGRE： PostgreSQL数据库</li><li>DLC： DLC数据库</li><li>MSSQL： 微软SQL Server数据库</li></ul>
     * @param DbType <p>驱动</p><p>枚举值：</p><ul><li>MYSQL： MySQL数据库</li><li>PRESTO： PRESTO数据库</li><li>POSTGRE： PostgreSQL数据库</li><li>DLC： DLC数据库</li><li>MSSQL： 微软SQL Server数据库</li></ul>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>数据库编码</p> 
     * @return Charset <p>数据库编码</p>
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set <p>数据库编码</p>
     * @param Charset <p>数据库编码</p>
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get <p>用户名</p> 
     * @return DbUser <p>用户名</p>
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set <p>用户名</p>
     * @param DbUser <p>用户名</p>
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get <p>密码</p> 
     * @return DbPwd <p>密码</p>
     */
    public String getDbPwd() {
        return this.DbPwd;
    }

    /**
     * Set <p>密码</p>
     * @param DbPwd <p>密码</p>
     */
    public void setDbPwd(String DbPwd) {
        this.DbPwd = DbPwd;
    }

    /**
     * Get <p>数据库名称</p> 
     * @return DbName <p>数据库名称</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库名称</p>
     * @param DbName <p>数据库名称</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>数据库别名</p> 
     * @return SourceName <p>数据库别名</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>数据库别名</p>
     * @param SourceName <p>数据库别名</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>数据源id</p> 
     * @return Id <p>数据源id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数据源id</p>
     * @param Id <p>数据源id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>catalog值</p> 
     * @return Catalog <p>catalog值</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>catalog值</p>
     * @param Catalog <p>catalog值</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>第三方数据源标识</p> 
     * @return DataOrigin <p>第三方数据源标识</p>
     */
    public String getDataOrigin() {
        return this.DataOrigin;
    }

    /**
     * Set <p>第三方数据源标识</p>
     * @param DataOrigin <p>第三方数据源标识</p>
     */
    public void setDataOrigin(String DataOrigin) {
        this.DataOrigin = DataOrigin;
    }

    /**
     * Get <p>第三方项目id</p> 
     * @return DataOriginProjectId <p>第三方项目id</p>
     */
    public String getDataOriginProjectId() {
        return this.DataOriginProjectId;
    }

    /**
     * Set <p>第三方项目id</p>
     * @param DataOriginProjectId <p>第三方项目id</p>
     */
    public void setDataOriginProjectId(String DataOriginProjectId) {
        this.DataOriginProjectId = DataOriginProjectId;
    }

    /**
     * Get <p>第三方数据源id</p> 
     * @return DataOriginDatasourceId <p>第三方数据源id</p>
     */
    public String getDataOriginDatasourceId() {
        return this.DataOriginDatasourceId;
    }

    /**
     * Set <p>第三方数据源id</p>
     * @param DataOriginDatasourceId <p>第三方数据源id</p>
     */
    public void setDataOriginDatasourceId(String DataOriginDatasourceId) {
        this.DataOriginDatasourceId = DataOriginDatasourceId;
    }

    /**
     * Get <p>扩展参数</p> 
     * @return ExtraParam <p>扩展参数</p>
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set <p>扩展参数</p>
     * @param ExtraParam <p>扩展参数</p>
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get <p>腾讯云私有网络统一标识</p> 
     * @return UniqVpcId <p>腾讯云私有网络统一标识</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>腾讯云私有网络统一标识</p>
     * @param UniqVpcId <p>腾讯云私有网络统一标识</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>私有网络ip</p> 
     * @return Vip <p>私有网络ip</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>私有网络ip</p>
     * @param Vip <p>私有网络ip</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>私有网络端口</p> 
     * @return Vport <p>私有网络端口</p>
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set <p>私有网络端口</p>
     * @param Vport <p>私有网络端口</p>
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>腾讯云私有网络标识</p> 
     * @return VpcId <p>腾讯云私有网络标识</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>腾讯云私有网络标识</p>
     * @param VpcId <p>腾讯云私有网络标识</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>开启vpc</p> 
     * @return UseVPC <p>开启vpc</p>
     */
    public Boolean getUseVPC() {
        return this.UseVPC;
    }

    /**
     * Set <p>开启vpc</p>
     * @param UseVPC <p>开启vpc</p>
     */
    public void setUseVPC(Boolean UseVPC) {
        this.UseVPC = UseVPC;
    }

    /**
     * Get <p>地域</p> 
     * @return RegionId <p>地域</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域</p>
     * @param RegionId <p>地域</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>数据库schema</p> 
     * @return Schema <p>数据库schema</p>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>数据库schema</p>
     * @param Schema <p>数据库schema</p>
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get <p>数据库版本</p> 
     * @return DbVersion <p>数据库版本</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>数据库版本</p>
     * @param DbVersion <p>数据库版本</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    public ModifyDatasourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatasourceRequest(ModifyDatasourceRequest source) {
        if (source.DbHost != null) {
            this.DbHost = new String(source.DbHost);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.DbUser != null) {
            this.DbUser = new String(source.DbUser);
        }
        if (source.DbPwd != null) {
            this.DbPwd = new String(source.DbPwd);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.DataOrigin != null) {
            this.DataOrigin = new String(source.DataOrigin);
        }
        if (source.DataOriginProjectId != null) {
            this.DataOriginProjectId = new String(source.DataOriginProjectId);
        }
        if (source.DataOriginDatasourceId != null) {
            this.DataOriginDatasourceId = new String(source.DataOriginDatasourceId);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.UseVPC != null) {
            this.UseVPC = new Boolean(source.UseVPC);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbHost", this.DbHost);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "DbPwd", this.DbPwd);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "DataOrigin", this.DataOrigin);
        this.setParamSimple(map, prefix + "DataOriginProjectId", this.DataOriginProjectId);
        this.setParamSimple(map, prefix + "DataOriginDatasourceId", this.DataOriginDatasourceId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UseVPC", this.UseVPC);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);

    }
}

