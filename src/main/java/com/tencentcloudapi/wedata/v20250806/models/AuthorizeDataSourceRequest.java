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

public class AuthorizeDataSourceRequest extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 授权给的目标项目id
    */
    @SerializedName("AuthProjectId")
    @Expose
    private String AuthProjectId;

    /**
    * 授权项目下用户列表，格式为：项目id_用户id
与AuthProjectId参数只能选填一个
当授权给多个对象时，项目id必须一致
    */
    @SerializedName("AuthUsers")
    @Expose
    private String [] AuthUsers;

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 授权给的目标项目id 
     * @return AuthProjectId 授权给的目标项目id
     */
    public String getAuthProjectId() {
        return this.AuthProjectId;
    }

    /**
     * Set 授权给的目标项目id
     * @param AuthProjectId 授权给的目标项目id
     */
    public void setAuthProjectId(String AuthProjectId) {
        this.AuthProjectId = AuthProjectId;
    }

    /**
     * Get 授权项目下用户列表，格式为：项目id_用户id
与AuthProjectId参数只能选填一个
当授权给多个对象时，项目id必须一致 
     * @return AuthUsers 授权项目下用户列表，格式为：项目id_用户id
与AuthProjectId参数只能选填一个
当授权给多个对象时，项目id必须一致
     */
    public String [] getAuthUsers() {
        return this.AuthUsers;
    }

    /**
     * Set 授权项目下用户列表，格式为：项目id_用户id
与AuthProjectId参数只能选填一个
当授权给多个对象时，项目id必须一致
     * @param AuthUsers 授权项目下用户列表，格式为：项目id_用户id
与AuthProjectId参数只能选填一个
当授权给多个对象时，项目id必须一致
     */
    public void setAuthUsers(String [] AuthUsers) {
        this.AuthUsers = AuthUsers;
    }

    public AuthorizeDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizeDataSourceRequest(AuthorizeDataSourceRequest source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.AuthProjectId != null) {
            this.AuthProjectId = new String(source.AuthProjectId);
        }
        if (source.AuthUsers != null) {
            this.AuthUsers = new String[source.AuthUsers.length];
            for (int i = 0; i < source.AuthUsers.length; i++) {
                this.AuthUsers[i] = new String(source.AuthUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "AuthProjectId", this.AuthProjectId);
        this.setParamArraySimple(map, prefix + "AuthUsers.", this.AuthUsers);

    }
}

