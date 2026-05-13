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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmDbAccountPrivilege extends AbstractModel {

    /**
    * 使用默认权限。0-未使用；1-只读权限，即SELECT权限；2-全部权限，即global级别全部权限。
    */
    @SerializedName("UseDefaultPrivilege")
    @Expose
    private Long UseDefaultPrivilege;

    /**
    * 全局权限数组。
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * 数据库权限数组。
    */
    @SerializedName("DatabasePrivilegesList")
    @Expose
    private DspmDatabasePrivilege [] DatabasePrivilegesList;

    /**
    * 数据库中的表权限数组。
    */
    @SerializedName("TablePrivileges")
    @Expose
    private DspmTablePrivilege [] TablePrivileges;

    /**
    * 数据库表中的列权限数组。
    */
    @SerializedName("ColumnPrivileges")
    @Expose
    private DspmColumnPrivilege [] ColumnPrivileges;

    /**
     * Get 使用默认权限。0-未使用；1-只读权限，即SELECT权限；2-全部权限，即global级别全部权限。 
     * @return UseDefaultPrivilege 使用默认权限。0-未使用；1-只读权限，即SELECT权限；2-全部权限，即global级别全部权限。
     */
    public Long getUseDefaultPrivilege() {
        return this.UseDefaultPrivilege;
    }

    /**
     * Set 使用默认权限。0-未使用；1-只读权限，即SELECT权限；2-全部权限，即global级别全部权限。
     * @param UseDefaultPrivilege 使用默认权限。0-未使用；1-只读权限，即SELECT权限；2-全部权限，即global级别全部权限。
     */
    public void setUseDefaultPrivilege(Long UseDefaultPrivilege) {
        this.UseDefaultPrivilege = UseDefaultPrivilege;
    }

    /**
     * Get 全局权限数组。 
     * @return GlobalPrivileges 全局权限数组。
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set 全局权限数组。
     * @param GlobalPrivileges 全局权限数组。
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get 数据库权限数组。 
     * @return DatabasePrivilegesList 数据库权限数组。
     */
    public DspmDatabasePrivilege [] getDatabasePrivilegesList() {
        return this.DatabasePrivilegesList;
    }

    /**
     * Set 数据库权限数组。
     * @param DatabasePrivilegesList 数据库权限数组。
     */
    public void setDatabasePrivilegesList(DspmDatabasePrivilege [] DatabasePrivilegesList) {
        this.DatabasePrivilegesList = DatabasePrivilegesList;
    }

    /**
     * Get 数据库中的表权限数组。 
     * @return TablePrivileges 数据库中的表权限数组。
     */
    public DspmTablePrivilege [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set 数据库中的表权限数组。
     * @param TablePrivileges 数据库中的表权限数组。
     */
    public void setTablePrivileges(DspmTablePrivilege [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get 数据库表中的列权限数组。 
     * @return ColumnPrivileges 数据库表中的列权限数组。
     */
    public DspmColumnPrivilege [] getColumnPrivileges() {
        return this.ColumnPrivileges;
    }

    /**
     * Set 数据库表中的列权限数组。
     * @param ColumnPrivileges 数据库表中的列权限数组。
     */
    public void setColumnPrivileges(DspmColumnPrivilege [] ColumnPrivileges) {
        this.ColumnPrivileges = ColumnPrivileges;
    }

    public DspmDbAccountPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmDbAccountPrivilege(DspmDbAccountPrivilege source) {
        if (source.UseDefaultPrivilege != null) {
            this.UseDefaultPrivilege = new Long(source.UseDefaultPrivilege);
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivilegesList != null) {
            this.DatabasePrivilegesList = new DspmDatabasePrivilege[source.DatabasePrivilegesList.length];
            for (int i = 0; i < source.DatabasePrivilegesList.length; i++) {
                this.DatabasePrivilegesList[i] = new DspmDatabasePrivilege(source.DatabasePrivilegesList[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new DspmTablePrivilege[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new DspmTablePrivilege(source.TablePrivileges[i]);
            }
        }
        if (source.ColumnPrivileges != null) {
            this.ColumnPrivileges = new DspmColumnPrivilege[source.ColumnPrivileges.length];
            for (int i = 0; i < source.ColumnPrivileges.length; i++) {
                this.ColumnPrivileges[i] = new DspmColumnPrivilege(source.ColumnPrivileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseDefaultPrivilege", this.UseDefaultPrivilege);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivilegesList.", this.DatabasePrivilegesList);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);
        this.setParamArrayObj(map, prefix + "ColumnPrivileges.", this.ColumnPrivileges);

    }
}

