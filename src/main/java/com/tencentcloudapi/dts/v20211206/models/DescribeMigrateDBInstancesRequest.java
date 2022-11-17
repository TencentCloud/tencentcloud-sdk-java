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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrateDBInstancesRequest extends AbstractModel{

    /**
    * 数据库类型，如mysql
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * 实例作为迁移的源还是目标,src(表示源)，dst(表示目标)
    */
    @SerializedName("MigrateRole")
    @Expose
    private String MigrateRole;

    /**
    * 云数据库实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云数据库名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 返回数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * 临时密钥Id，若为跨账号资源此项必填
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥Key，若为跨账号资源此项必填
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 临时密钥Token，若为跨账号资源此项必填
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
     * Get 数据库类型，如mysql 
     * @return DatabaseType 数据库类型，如mysql
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 数据库类型，如mysql
     * @param DatabaseType 数据库类型，如mysql
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 实例作为迁移的源还是目标,src(表示源)，dst(表示目标) 
     * @return MigrateRole 实例作为迁移的源还是目标,src(表示源)，dst(表示目标)
     */
    public String getMigrateRole() {
        return this.MigrateRole;
    }

    /**
     * Set 实例作为迁移的源还是目标,src(表示源)，dst(表示目标)
     * @param MigrateRole 实例作为迁移的源还是目标,src(表示源)，dst(表示目标)
     */
    public void setMigrateRole(String MigrateRole) {
        this.MigrateRole = MigrateRole;
    }

    /**
     * Get 云数据库实例ID 
     * @return InstanceId 云数据库实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云数据库实例ID
     * @param InstanceId 云数据库实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云数据库名称 
     * @return InstanceName 云数据库名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 云数据库名称
     * @param InstanceName 云数据库名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 返回数量限制 
     * @return Limit 返回数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量限制
     * @param Limit 返回数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源) 
     * @return AccountMode 资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set 资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)
     * @param AccountMode 资源所属账号 为空值或self(表示本账号内资源)、other(表示其他账户资源)
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get 临时密钥Id，若为跨账号资源此项必填 
     * @return TmpSecretId 临时密钥Id，若为跨账号资源此项必填
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时密钥Id，若为跨账号资源此项必填
     * @param TmpSecretId 临时密钥Id，若为跨账号资源此项必填
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥Key，若为跨账号资源此项必填 
     * @return TmpSecretKey 临时密钥Key，若为跨账号资源此项必填
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥Key，若为跨账号资源此项必填
     * @param TmpSecretKey 临时密钥Key，若为跨账号资源此项必填
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 临时密钥Token，若为跨账号资源此项必填 
     * @return TmpToken 临时密钥Token，若为跨账号资源此项必填
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set 临时密钥Token，若为跨账号资源此项必填
     * @param TmpToken 临时密钥Token，若为跨账号资源此项必填
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

