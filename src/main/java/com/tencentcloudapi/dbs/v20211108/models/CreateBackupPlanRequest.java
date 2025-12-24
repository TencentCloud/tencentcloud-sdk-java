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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupPlanRequest extends AbstractModel {

    /**
    * 源端数据库类型。当前支持值为: ["mysql","cynosdbmysql","percona","mariadb","tdsqlmysql"]。
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * 备份方式。当前仅支持"logical"，即逻辑备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 规格。当前支持值为: ["micro","small","medium","large","xlarge"]。默认为"small"。
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 购买时长，单位为月，默认值为1。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 计费模式。当前仅支持"prepay"，即包年包月。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 购买数量。取值范围为[1, 10]，默认值为1。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 自动续费标识。1 - 开启自动续费；0 - 不开启自动续费。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 标签值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 源端数据库类型。当前支持值为: ["mysql","cynosdbmysql","percona","mariadb","tdsqlmysql"]。 
     * @return DatabaseType 源端数据库类型。当前支持值为: ["mysql","cynosdbmysql","percona","mariadb","tdsqlmysql"]。
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 源端数据库类型。当前支持值为: ["mysql","cynosdbmysql","percona","mariadb","tdsqlmysql"]。
     * @param DatabaseType 源端数据库类型。当前支持值为: ["mysql","cynosdbmysql","percona","mariadb","tdsqlmysql"]。
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 备份方式。当前仅支持"logical"，即逻辑备份。 
     * @return BackupMethod 备份方式。当前仅支持"logical"，即逻辑备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式。当前仅支持"logical"，即逻辑备份。
     * @param BackupMethod 备份方式。当前仅支持"logical"，即逻辑备份。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 规格。当前支持值为: ["micro","small","medium","large","xlarge"]。默认为"small"。 
     * @return InstanceClass 规格。当前支持值为: ["micro","small","medium","large","xlarge"]。默认为"small"。
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set 规格。当前支持值为: ["micro","small","medium","large","xlarge"]。默认为"small"。
     * @param InstanceClass 规格。当前支持值为: ["micro","small","medium","large","xlarge"]。默认为"small"。
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get 购买时长，单位为月，默认值为1。 
     * @return Period 购买时长，单位为月，默认值为1。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位为月，默认值为1。
     * @param Period 购买时长，单位为月，默认值为1。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 计费模式。当前仅支持"prepay"，即包年包月。 
     * @return PayType 计费模式。当前仅支持"prepay"，即包年包月。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 计费模式。当前仅支持"prepay"，即包年包月。
     * @param PayType 计费模式。当前仅支持"prepay"，即包年包月。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 购买数量。取值范围为[1, 10]，默认值为1。 
     * @return Count 购买数量。取值范围为[1, 10]，默认值为1。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买数量。取值范围为[1, 10]，默认值为1。
     * @param Count 购买数量。取值范围为[1, 10]，默认值为1。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 自动续费标识。1 - 开启自动续费；0 - 不开启自动续费。 
     * @return AutoRenew 自动续费标识。1 - 开启自动续费；0 - 不开启自动续费。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标识。1 - 开启自动续费；0 - 不开启自动续费。
     * @param AutoRenew 自动续费标识。1 - 开启自动续费；0 - 不开启自动续费。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 标签值。 
     * @return Tags 标签值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签值。
     * @param Tags 标签值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupPlanRequest(CreateBackupPlanRequest source) {
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

