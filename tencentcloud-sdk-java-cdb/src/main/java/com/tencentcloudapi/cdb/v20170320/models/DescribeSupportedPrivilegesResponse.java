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

public class DescribeSupportedPrivilegesResponse extends AbstractModel{

    /**
    * 实例支持的全局权限。
    */
    @SerializedName("GlobalSupportedPrivileges")
    @Expose
    private String [] GlobalSupportedPrivileges;

    /**
    * 实例支持的数据库权限。
    */
    @SerializedName("DatabaseSupportedPrivileges")
    @Expose
    private String [] DatabaseSupportedPrivileges;

    /**
    * 实例支持的数据库表权限。
    */
    @SerializedName("TableSupportedPrivileges")
    @Expose
    private String [] TableSupportedPrivileges;

    /**
    * 实例支持的数据库列权限。
    */
    @SerializedName("ColumnSupportedPrivileges")
    @Expose
    private String [] ColumnSupportedPrivileges;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例支持的全局权限。 
     * @return GlobalSupportedPrivileges 实例支持的全局权限。
     */
    public String [] getGlobalSupportedPrivileges() {
        return this.GlobalSupportedPrivileges;
    }

    /**
     * Set 实例支持的全局权限。
     * @param GlobalSupportedPrivileges 实例支持的全局权限。
     */
    public void setGlobalSupportedPrivileges(String [] GlobalSupportedPrivileges) {
        this.GlobalSupportedPrivileges = GlobalSupportedPrivileges;
    }

    /**
     * Get 实例支持的数据库权限。 
     * @return DatabaseSupportedPrivileges 实例支持的数据库权限。
     */
    public String [] getDatabaseSupportedPrivileges() {
        return this.DatabaseSupportedPrivileges;
    }

    /**
     * Set 实例支持的数据库权限。
     * @param DatabaseSupportedPrivileges 实例支持的数据库权限。
     */
    public void setDatabaseSupportedPrivileges(String [] DatabaseSupportedPrivileges) {
        this.DatabaseSupportedPrivileges = DatabaseSupportedPrivileges;
    }

    /**
     * Get 实例支持的数据库表权限。 
     * @return TableSupportedPrivileges 实例支持的数据库表权限。
     */
    public String [] getTableSupportedPrivileges() {
        return this.TableSupportedPrivileges;
    }

    /**
     * Set 实例支持的数据库表权限。
     * @param TableSupportedPrivileges 实例支持的数据库表权限。
     */
    public void setTableSupportedPrivileges(String [] TableSupportedPrivileges) {
        this.TableSupportedPrivileges = TableSupportedPrivileges;
    }

    /**
     * Get 实例支持的数据库列权限。 
     * @return ColumnSupportedPrivileges 实例支持的数据库列权限。
     */
    public String [] getColumnSupportedPrivileges() {
        return this.ColumnSupportedPrivileges;
    }

    /**
     * Set 实例支持的数据库列权限。
     * @param ColumnSupportedPrivileges 实例支持的数据库列权限。
     */
    public void setColumnSupportedPrivileges(String [] ColumnSupportedPrivileges) {
        this.ColumnSupportedPrivileges = ColumnSupportedPrivileges;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GlobalSupportedPrivileges.", this.GlobalSupportedPrivileges);
        this.setParamArraySimple(map, prefix + "DatabaseSupportedPrivileges.", this.DatabaseSupportedPrivileges);
        this.setParamArraySimple(map, prefix + "TableSupportedPrivileges.", this.TableSupportedPrivileges);
        this.setParamArraySimple(map, prefix + "ColumnSupportedPrivileges.", this.ColumnSupportedPrivileges);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

