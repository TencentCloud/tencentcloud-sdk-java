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
    * HOST
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * 端口
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * 后端提供字典：域类型，1、腾讯云，2、本地
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 驱动
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库编码
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * 用户名
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * 密码
    */
    @SerializedName("DbPwd")
    @Expose
    private String DbPwd;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 数据库别名
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 数据源id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * catalog值
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 第三方数据源标识
    */
    @SerializedName("DataOrigin")
    @Expose
    private String DataOrigin;

    /**
    * 第三方项目id
    */
    @SerializedName("DataOriginProjectId")
    @Expose
    private String DataOriginProjectId;

    /**
    * 第三方数据源id
    */
    @SerializedName("DataOriginDatasourceId")
    @Expose
    private String DataOriginDatasourceId;

    /**
    * 扩展参数
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * 腾讯云私有网络统一标识
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 私有网络端口
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * 腾讯云私有网络标识
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 开启vpc	
    */
    @SerializedName("UseVPC")
    @Expose
    private Boolean UseVPC;

    /**
    * 地域
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 数据库schema
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
     * Get HOST 
     * @return DbHost HOST
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set HOST
     * @param DbHost HOST
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get 端口 
     * @return DbPort 端口
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set 端口
     * @param DbPort 端口
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get 后端提供字典：域类型，1、腾讯云，2、本地 
     * @return ServiceType 后端提供字典：域类型，1、腾讯云，2、本地
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 后端提供字典：域类型，1、腾讯云，2、本地
     * @param ServiceType 后端提供字典：域类型，1、腾讯云，2、本地
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 驱动 
     * @return DbType 驱动
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 驱动
     * @param DbType 驱动
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 数据库编码 
     * @return Charset 数据库编码
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 数据库编码
     * @param Charset 数据库编码
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get 用户名 
     * @return DbUser 用户名
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set 用户名
     * @param DbUser 用户名
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get 密码 
     * @return DbPwd 密码
     */
    public String getDbPwd() {
        return this.DbPwd;
    }

    /**
     * Set 密码
     * @param DbPwd 密码
     */
    public void setDbPwd(String DbPwd) {
        this.DbPwd = DbPwd;
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
     * Get 数据库别名 
     * @return SourceName 数据库别名
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 数据库别名
     * @param SourceName 数据库别名
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 数据源id 
     * @return Id 数据源id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据源id
     * @param Id 数据源id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get catalog值 
     * @return Catalog catalog值
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog值
     * @param Catalog catalog值
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 第三方数据源标识 
     * @return DataOrigin 第三方数据源标识
     */
    public String getDataOrigin() {
        return this.DataOrigin;
    }

    /**
     * Set 第三方数据源标识
     * @param DataOrigin 第三方数据源标识
     */
    public void setDataOrigin(String DataOrigin) {
        this.DataOrigin = DataOrigin;
    }

    /**
     * Get 第三方项目id 
     * @return DataOriginProjectId 第三方项目id
     */
    public String getDataOriginProjectId() {
        return this.DataOriginProjectId;
    }

    /**
     * Set 第三方项目id
     * @param DataOriginProjectId 第三方项目id
     */
    public void setDataOriginProjectId(String DataOriginProjectId) {
        this.DataOriginProjectId = DataOriginProjectId;
    }

    /**
     * Get 第三方数据源id 
     * @return DataOriginDatasourceId 第三方数据源id
     */
    public String getDataOriginDatasourceId() {
        return this.DataOriginDatasourceId;
    }

    /**
     * Set 第三方数据源id
     * @param DataOriginDatasourceId 第三方数据源id
     */
    public void setDataOriginDatasourceId(String DataOriginDatasourceId) {
        this.DataOriginDatasourceId = DataOriginDatasourceId;
    }

    /**
     * Get 扩展参数 
     * @return ExtraParam 扩展参数
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 扩展参数
     * @param ExtraParam 扩展参数
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get 腾讯云私有网络统一标识 
     * @return UniqVpcId 腾讯云私有网络统一标识
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 腾讯云私有网络统一标识
     * @param UniqVpcId 腾讯云私有网络统一标识
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有网络ip 
     * @return Vip 私有网络ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 私有网络ip
     * @param Vip 私有网络ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 私有网络端口 
     * @return Vport 私有网络端口
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set 私有网络端口
     * @param Vport 私有网络端口
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 腾讯云私有网络标识 
     * @return VpcId 腾讯云私有网络标识
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 腾讯云私有网络标识
     * @param VpcId 腾讯云私有网络标识
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 开启vpc	 
     * @return UseVPC 开启vpc	
     */
    public Boolean getUseVPC() {
        return this.UseVPC;
    }

    /**
     * Set 开启vpc	
     * @param UseVPC 开启vpc	
     */
    public void setUseVPC(Boolean UseVPC) {
        this.UseVPC = UseVPC;
    }

    /**
     * Get 地域 
     * @return RegionId 地域
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域
     * @param RegionId 地域
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 数据库schema 
     * @return Schema 数据库schema
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据库schema
     * @param Schema 数据库schema
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 数据库版本 
     * @return DbVersion 数据库版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本
     * @param DbVersion 数据库版本
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

