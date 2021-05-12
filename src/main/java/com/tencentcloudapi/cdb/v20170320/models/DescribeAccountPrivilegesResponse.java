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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegesResponse extends AbstractModel{

    /**
    * 全局权限数组。
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * 数据库权限数组。
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivilege [] DatabasePrivileges;

    /**
    * 数据库中的表权限数组。
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivilege [] TablePrivileges;

    /**
    * 数据库表中的列权限数组。
    */
    @SerializedName("ColumnPrivileges")
    @Expose
    private ColumnPrivilege [] ColumnPrivileges;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * @return DatabasePrivileges 数据库权限数组。
     */
    public DatabasePrivilege [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set 数据库权限数组。
     * @param DatabasePrivileges 数据库权限数组。
     */
    public void setDatabasePrivileges(DatabasePrivilege [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get 数据库中的表权限数组。 
     * @return TablePrivileges 数据库中的表权限数组。
     */
    public TablePrivilege [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set 数据库中的表权限数组。
     * @param TablePrivileges 数据库中的表权限数组。
     */
    public void setTablePrivileges(TablePrivilege [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get 数据库表中的列权限数组。 
     * @return ColumnPrivileges 数据库表中的列权限数组。
     */
    public ColumnPrivilege [] getColumnPrivileges() {
        return this.ColumnPrivileges;
    }

    /**
     * Set 数据库表中的列权限数组。
     * @param ColumnPrivileges 数据库表中的列权限数组。
     */
    public void setColumnPrivileges(ColumnPrivilege [] ColumnPrivileges) {
        this.ColumnPrivileges = ColumnPrivileges;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAccountPrivilegesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesResponse(DescribeAccountPrivilegesResponse source) {
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivileges != null) {
            this.DatabasePrivileges = new DatabasePrivilege[source.DatabasePrivileges.length];
            for (int i = 0; i < source.DatabasePrivileges.length; i++) {
                this.DatabasePrivileges[i] = new DatabasePrivilege(source.DatabasePrivileges[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new TablePrivilege[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new TablePrivilege(source.TablePrivileges[i]);
            }
        }
        if (source.ColumnPrivileges != null) {
            this.ColumnPrivileges = new ColumnPrivilege[source.ColumnPrivileges.length];
            for (int i = 0; i < source.ColumnPrivileges.length; i++) {
                this.ColumnPrivileges[i] = new ColumnPrivilege(source.ColumnPrivileges[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);
        this.setParamArrayObj(map, prefix + "ColumnPrivileges.", this.ColumnPrivileges);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

