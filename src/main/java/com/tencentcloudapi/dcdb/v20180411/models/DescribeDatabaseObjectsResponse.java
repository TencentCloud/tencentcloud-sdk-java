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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseObjectsResponse  extends AbstractModel{

    /**
    * 透传入参。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名称。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 表列表。
    */
    @SerializedName("Tables")
    @Expose
    private DatabaseTable [] Tables;

    /**
    * 视图列表。
    */
    @SerializedName("Views")
    @Expose
    private DatabaseView [] Views;

    /**
    * 存储过程列表。
    */
    @SerializedName("Procs")
    @Expose
    private DatabaseProcedure [] Procs;

    /**
    * 函数列表。
    */
    @SerializedName("Funcs")
    @Expose
    private DatabaseFunction [] Funcs;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取透传入参。
     * @return InstanceId 透传入参。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置透传入参。
     * @param InstanceId 透传入参。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取数据库名称。
     * @return DbName 数据库名称。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * 设置数据库名称。
     * @param DbName 数据库名称。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * 获取表列表。
     * @return Tables 表列表。
     */
    public DatabaseTable [] getTables() {
        return this.Tables;
    }

    /**
     * 设置表列表。
     * @param Tables 表列表。
     */
    public void setTables(DatabaseTable [] Tables) {
        this.Tables = Tables;
    }

    /**
     * 获取视图列表。
     * @return Views 视图列表。
     */
    public DatabaseView [] getViews() {
        return this.Views;
    }

    /**
     * 设置视图列表。
     * @param Views 视图列表。
     */
    public void setViews(DatabaseView [] Views) {
        this.Views = Views;
    }

    /**
     * 获取存储过程列表。
     * @return Procs 存储过程列表。
     */
    public DatabaseProcedure [] getProcs() {
        return this.Procs;
    }

    /**
     * 设置存储过程列表。
     * @param Procs 存储过程列表。
     */
    public void setProcs(DatabaseProcedure [] Procs) {
        this.Procs = Procs;
    }

    /**
     * 获取函数列表。
     * @return Funcs 函数列表。
     */
    public DatabaseFunction [] getFuncs() {
        return this.Funcs;
    }

    /**
     * 设置函数列表。
     * @param Funcs 函数列表。
     */
    public void setFuncs(DatabaseFunction [] Funcs) {
        this.Funcs = Funcs;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);
        this.setParamArrayObj(map, prefix + "Views.", this.Views);
        this.setParamArrayObj(map, prefix + "Procs.", this.Procs);
        this.setParamArrayObj(map, prefix + "Funcs.", this.Funcs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

