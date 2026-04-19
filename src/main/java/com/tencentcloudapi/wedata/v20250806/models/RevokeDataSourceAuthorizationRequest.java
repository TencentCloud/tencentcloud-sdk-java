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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RevokeDataSourceAuthorizationRequest extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 回收的项目id，与RevokeUser参数只能选填一个，或者都不传当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）
    */
    @SerializedName("RevokeProjectId")
    @Expose
    private String RevokeProjectId;

    /**
    * 回收项目下用户列表，格式为：项目id_用户id
与RevokeProjectId参数只能选填一个，或者都不传
当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（
数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）


    */
    @SerializedName("RevokeUser")
    @Expose
    private String RevokeUser;

    /**
     * Get 数据源id 
     * @return DataSourceId 数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
     * @param DataSourceId 数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 回收的项目id，与RevokeUser参数只能选填一个，或者都不传当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限） 
     * @return RevokeProjectId 回收的项目id，与RevokeUser参数只能选填一个，或者都不传当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）
     */
    public String getRevokeProjectId() {
        return this.RevokeProjectId;
    }

    /**
     * Set 回收的项目id，与RevokeUser参数只能选填一个，或者都不传当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）
     * @param RevokeProjectId 回收的项目id，与RevokeUser参数只能选填一个，或者都不传当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）
     */
    public void setRevokeProjectId(String RevokeProjectId) {
        this.RevokeProjectId = RevokeProjectId;
    }

    /**
     * Get 回收项目下用户列表，格式为：项目id_用户id
与RevokeProjectId参数只能选填一个，或者都不传
当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（
数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）

 
     * @return RevokeUser 回收项目下用户列表，格式为：项目id_用户id
与RevokeProjectId参数只能选填一个，或者都不传
当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（
数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）


     */
    public String getRevokeUser() {
        return this.RevokeUser;
    }

    /**
     * Set 回收项目下用户列表，格式为：项目id_用户id
与RevokeProjectId参数只能选填一个，或者都不传
当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（
数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）


     * @param RevokeUser 回收项目下用户列表，格式为：项目id_用户id
与RevokeProjectId参数只能选填一个，或者都不传
当RevokeProjectId与RevokeUser都不传时，表示回收当前数据源所有权限（
数据源为项目共享时，不回收当前数据源创建项目下所有用户对该数据源的权限，当数据源为个人和项目管理员共享时，不回收当前数据源创建项目下数据源创建用户和管理员的权限）


     */
    public void setRevokeUser(String RevokeUser) {
        this.RevokeUser = RevokeUser;
    }

    public RevokeDataSourceAuthorizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokeDataSourceAuthorizationRequest(RevokeDataSourceAuthorizationRequest source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.RevokeProjectId != null) {
            this.RevokeProjectId = new String(source.RevokeProjectId);
        }
        if (source.RevokeUser != null) {
            this.RevokeUser = new String(source.RevokeUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "RevokeProjectId", this.RevokeProjectId);
        this.setParamSimple(map, prefix + "RevokeUser", this.RevokeUser);

    }
}

