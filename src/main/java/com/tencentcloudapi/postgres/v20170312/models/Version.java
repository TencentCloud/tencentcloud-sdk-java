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

public class Version extends AbstractModel{

    /**
    * 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * 数据库版本，例如：12.4
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 数据库主要版本，例如：12
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * 数据库内核版本，例如：v12.4_r1.3
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * 数据库内核支持的特性列表。例如，
TDE：支持数据加密。
    */
    @SerializedName("SupportedFeatureNames")
    @Expose
    private String [] SupportedFeatureNames;

    /**
    * 数据库版本状态，包括：
AVAILABLE：可用；
DEPRECATED：已弃用。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 该数据库版本（DBKernelVersion）可以升级到的版本号列表。
    */
    @SerializedName("AvailableUpgradeTarget")
    @Expose
    private String [] AvailableUpgradeTarget;

    /**
     * Get 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）； 
     * @return DBEngine 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
     * @param DBEngine 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get 数据库版本，例如：12.4 
     * @return DBVersion 数据库版本，例如：12.4
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 数据库版本，例如：12.4
     * @param DBVersion 数据库版本，例如：12.4
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 数据库主要版本，例如：12 
     * @return DBMajorVersion 数据库主要版本，例如：12
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set 数据库主要版本，例如：12
     * @param DBMajorVersion 数据库主要版本，例如：12
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get 数据库内核版本，例如：v12.4_r1.3 
     * @return DBKernelVersion 数据库内核版本，例如：v12.4_r1.3
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set 数据库内核版本，例如：v12.4_r1.3
     * @param DBKernelVersion 数据库内核版本，例如：v12.4_r1.3
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get 数据库内核支持的特性列表。例如，
TDE：支持数据加密。 
     * @return SupportedFeatureNames 数据库内核支持的特性列表。例如，
TDE：支持数据加密。
     */
    public String [] getSupportedFeatureNames() {
        return this.SupportedFeatureNames;
    }

    /**
     * Set 数据库内核支持的特性列表。例如，
TDE：支持数据加密。
     * @param SupportedFeatureNames 数据库内核支持的特性列表。例如，
TDE：支持数据加密。
     */
    public void setSupportedFeatureNames(String [] SupportedFeatureNames) {
        this.SupportedFeatureNames = SupportedFeatureNames;
    }

    /**
     * Get 数据库版本状态，包括：
AVAILABLE：可用；
DEPRECATED：已弃用。 
     * @return Status 数据库版本状态，包括：
AVAILABLE：可用；
DEPRECATED：已弃用。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库版本状态，包括：
AVAILABLE：可用；
DEPRECATED：已弃用。
     * @param Status 数据库版本状态，包括：
AVAILABLE：可用；
DEPRECATED：已弃用。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 该数据库版本（DBKernelVersion）可以升级到的版本号列表。 
     * @return AvailableUpgradeTarget 该数据库版本（DBKernelVersion）可以升级到的版本号列表。
     */
    public String [] getAvailableUpgradeTarget() {
        return this.AvailableUpgradeTarget;
    }

    /**
     * Set 该数据库版本（DBKernelVersion）可以升级到的版本号列表。
     * @param AvailableUpgradeTarget 该数据库版本（DBKernelVersion）可以升级到的版本号列表。
     */
    public void setAvailableUpgradeTarget(String [] AvailableUpgradeTarget) {
        this.AvailableUpgradeTarget = AvailableUpgradeTarget;
    }

    public Version() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Version(Version source) {
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.SupportedFeatureNames != null) {
            this.SupportedFeatureNames = new String[source.SupportedFeatureNames.length];
            for (int i = 0; i < source.SupportedFeatureNames.length; i++) {
                this.SupportedFeatureNames[i] = new String(source.SupportedFeatureNames[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AvailableUpgradeTarget != null) {
            this.AvailableUpgradeTarget = new String[source.AvailableUpgradeTarget.length];
            for (int i = 0; i < source.AvailableUpgradeTarget.length; i++) {
                this.AvailableUpgradeTarget[i] = new String(source.AvailableUpgradeTarget[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamArraySimple(map, prefix + "SupportedFeatureNames.", this.SupportedFeatureNames);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "AvailableUpgradeTarget.", this.AvailableUpgradeTarget);

    }
}

