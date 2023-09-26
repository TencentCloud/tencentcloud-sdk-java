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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDatasourceCloudRequest extends AbstractModel{

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
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 住键
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公有云内网ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 公有云内网端口
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * vpc标识
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 统一vpc标识
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 区域标识（gz,bj)
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 扩展参数
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据源产品名
    */
    @SerializedName("ProdDbName")
    @Expose
    private String ProdDbName;

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
     * Get 住键 
     * @return Id 住键
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 住键
     * @param Id 住键
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公有云内网ip 
     * @return Vip 公有云内网ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 公有云内网ip
     * @param Vip 公有云内网ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 公有云内网端口 
     * @return Vport 公有云内网端口
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set 公有云内网端口
     * @param Vport 公有云内网端口
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get vpc标识 
     * @return VpcId vpc标识
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc标识
     * @param VpcId vpc标识
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 统一vpc标识 
     * @return UniqVpcId 统一vpc标识
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 统一vpc标识
     * @param UniqVpcId 统一vpc标识
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 区域标识（gz,bj) 
     * @return RegionId 区域标识（gz,bj)
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域标识（gz,bj)
     * @param RegionId 区域标识（gz,bj)
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
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
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据源产品名 
     * @return ProdDbName 数据源产品名
     */
    public String getProdDbName() {
        return this.ProdDbName;
    }

    /**
     * Set 数据源产品名
     * @param ProdDbName 数据源产品名
     */
    public void setProdDbName(String ProdDbName) {
        this.ProdDbName = ProdDbName;
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

    public ModifyDatasourceCloudRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatasourceCloudRequest(ModifyDatasourceCloudRequest source) {
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
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProdDbName != null) {
            this.ProdDbName = new String(source.ProdDbName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "DbPwd", this.DbPwd);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProdDbName", this.ProdDbName);
        this.setParamSimple(map, prefix + "DataOrigin", this.DataOrigin);
        this.setParamSimple(map, prefix + "DataOriginProjectId", this.DataOriginProjectId);
        this.setParamSimple(map, prefix + "DataOriginDatasourceId", this.DataOriginDatasourceId);

    }
}

