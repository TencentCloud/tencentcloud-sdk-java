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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrateDBInstancesRequest extends AbstractModel {

    /**
    * <p>数据库类型，如mysql,percona,mariadb,tdsqlmysql,mariadb,postgresql,cynosdbmysql,redis,tendis,keewidb,tdstore,mongodb,clickhouse,sqlserver等。</p>
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * <p>实例作为迁移的源还是目标,src(表示源)，dst(表示目标)</p>
    */
    @SerializedName("MigrateRole")
    @Expose
    private String MigrateRole;

    /**
    * <p>云数据库实例ID，可通过对应业务实例列表获取实例信息。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>云数据库名称，可通过对应业务实例列表获取实例信息。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>返回数量限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)</p>
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
     * Get <p>数据库类型，如mysql,percona,mariadb,tdsqlmysql,mariadb,postgresql,cynosdbmysql,redis,tendis,keewidb,tdstore,mongodb,clickhouse,sqlserver等。</p> 
     * @return DatabaseType <p>数据库类型，如mysql,percona,mariadb,tdsqlmysql,mariadb,postgresql,cynosdbmysql,redis,tendis,keewidb,tdstore,mongodb,clickhouse,sqlserver等。</p>
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set <p>数据库类型，如mysql,percona,mariadb,tdsqlmysql,mariadb,postgresql,cynosdbmysql,redis,tendis,keewidb,tdstore,mongodb,clickhouse,sqlserver等。</p>
     * @param DatabaseType <p>数据库类型，如mysql,percona,mariadb,tdsqlmysql,mariadb,postgresql,cynosdbmysql,redis,tendis,keewidb,tdstore,mongodb,clickhouse,sqlserver等。</p>
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get <p>实例作为迁移的源还是目标,src(表示源)，dst(表示目标)</p> 
     * @return MigrateRole <p>实例作为迁移的源还是目标,src(表示源)，dst(表示目标)</p>
     */
    public String getMigrateRole() {
        return this.MigrateRole;
    }

    /**
     * Set <p>实例作为迁移的源还是目标,src(表示源)，dst(表示目标)</p>
     * @param MigrateRole <p>实例作为迁移的源还是目标,src(表示源)，dst(表示目标)</p>
     */
    public void setMigrateRole(String MigrateRole) {
        this.MigrateRole = MigrateRole;
    }

    /**
     * Get <p>云数据库实例ID，可通过对应业务实例列表获取实例信息。</p> 
     * @return InstanceId <p>云数据库实例ID，可通过对应业务实例列表获取实例信息。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云数据库实例ID，可通过对应业务实例列表获取实例信息。</p>
     * @param InstanceId <p>云数据库实例ID，可通过对应业务实例列表获取实例信息。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>云数据库名称，可通过对应业务实例列表获取实例信息。</p> 
     * @return InstanceName <p>云数据库名称，可通过对应业务实例列表获取实例信息。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>云数据库名称，可通过对应业务实例列表获取实例信息。</p>
     * @param InstanceName <p>云数据库名称，可通过对应业务实例列表获取实例信息。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>返回数量限制</p> 
     * @return Limit <p>返回数量限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量限制</p>
     * @param Limit <p>返回数量限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)</p> 
     * @return AccountMode <p>资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)</p>
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set <p>资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)</p>
     * @param AccountMode <p>资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)</p>
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p> 
     * @return TmpSecretId <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     * @param TmpSecretId <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p> 
     * @return TmpSecretKey <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     * @param TmpSecretKey <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p> 
     * @return TmpToken <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     * @param TmpToken <p>临时密钥Id，可通过申请扮演角色临时访问凭证获取临时密钥https://cloud.tencent.com/document/product/1312/48197，其中角色资源RoleArn的定义可参考DTS跨账号迁移文档(https://cloud.tencent.com/document/product/571/54117)第4节中关于角色的定义。</p>
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    public DescribeMigrateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrateDBInstancesRequest(DescribeMigrateDBInstancesRequest source) {
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.MigrateRole != null) {
            this.MigrateRole = new String(source.MigrateRole);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.TmpToken != null) {
            this.TmpToken = new String(source.TmpToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "MigrateRole", this.MigrateRole);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);

    }
}

