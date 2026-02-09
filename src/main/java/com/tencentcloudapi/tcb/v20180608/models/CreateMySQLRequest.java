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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMySQLRequest extends AbstractModel {

    /**
    * 云开发环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Db类型 1. FLEXDB 2.MYSQL
    */
    @SerializedName("DbInstanceType")
    @Expose
    private String DbInstanceType;

    /**
    * mysql版本
    */
    @SerializedName("MysqlVersion")
    @Expose
    private String MysqlVersion;

    /**
    * vpc Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 0 区分表名大小写；1 不区分表名大小写(默认)
    */
    @SerializedName("LowerCaseTableNames")
    @Expose
    private String LowerCaseTableNames;

    /**
     * Get 云开发环境ID 
     * @return EnvId 云开发环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境ID
     * @param EnvId 云开发环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Db类型 1. FLEXDB 2.MYSQL 
     * @return DbInstanceType Db类型 1. FLEXDB 2.MYSQL
     */
    public String getDbInstanceType() {
        return this.DbInstanceType;
    }

    /**
     * Set Db类型 1. FLEXDB 2.MYSQL
     * @param DbInstanceType Db类型 1. FLEXDB 2.MYSQL
     */
    public void setDbInstanceType(String DbInstanceType) {
        this.DbInstanceType = DbInstanceType;
    }

    /**
     * Get mysql版本 
     * @return MysqlVersion mysql版本
     */
    public String getMysqlVersion() {
        return this.MysqlVersion;
    }

    /**
     * Set mysql版本
     * @param MysqlVersion mysql版本
     */
    public void setMysqlVersion(String MysqlVersion) {
        this.MysqlVersion = MysqlVersion;
    }

    /**
     * Get vpc Id 
     * @return VpcId vpc Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc Id
     * @param VpcId vpc Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 0 区分表名大小写；1 不区分表名大小写(默认) 
     * @return LowerCaseTableNames 0 区分表名大小写；1 不区分表名大小写(默认)
     */
    public String getLowerCaseTableNames() {
        return this.LowerCaseTableNames;
    }

    /**
     * Set 0 区分表名大小写；1 不区分表名大小写(默认)
     * @param LowerCaseTableNames 0 区分表名大小写；1 不区分表名大小写(默认)
     */
    public void setLowerCaseTableNames(String LowerCaseTableNames) {
        this.LowerCaseTableNames = LowerCaseTableNames;
    }

    public CreateMySQLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMySQLRequest(CreateMySQLRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.DbInstanceType != null) {
            this.DbInstanceType = new String(source.DbInstanceType);
        }
        if (source.MysqlVersion != null) {
            this.MysqlVersion = new String(source.MysqlVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.LowerCaseTableNames != null) {
            this.LowerCaseTableNames = new String(source.LowerCaseTableNames);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "DbInstanceType", this.DbInstanceType);
        this.setParamSimple(map, prefix + "MysqlVersion", this.MysqlVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LowerCaseTableNames", this.LowerCaseTableNames);

    }
}

