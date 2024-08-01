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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseAuditResourceResponse extends AbstractModel {

    /**
    * 数据库列表
    */
    @SerializedName("Databases")
    @Expose
    private String [] Databases;

    /**
    * 用户列表
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * sql类型列表
    */
    @SerializedName("SqlTypes")
    @Expose
    private String [] SqlTypes;

    /**
    * catalog字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalogs")
    @Expose
    private String [] Catalogs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据库列表 
     * @return Databases 数据库列表
     */
    public String [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set 数据库列表
     * @param Databases 数据库列表
     */
    public void setDatabases(String [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get 用户列表 
     * @return Users 用户列表
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 用户列表
     * @param Users 用户列表
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get sql类型列表 
     * @return SqlTypes sql类型列表
     */
    public String [] getSqlTypes() {
        return this.SqlTypes;
    }

    /**
     * Set sql类型列表
     * @param SqlTypes sql类型列表
     */
    public void setSqlTypes(String [] SqlTypes) {
        this.SqlTypes = SqlTypes;
    }

    /**
     * Get catalog字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalogs catalog字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set catalog字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalogs catalog字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogs(String [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDatabaseAuditResourceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseAuditResourceResponse(DescribeDatabaseAuditResourceResponse source) {
        if (source.Databases != null) {
            this.Databases = new String[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new String(source.Databases[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.SqlTypes != null) {
            this.SqlTypes = new String[source.SqlTypes.length];
            for (int i = 0; i < source.SqlTypes.length; i++) {
                this.SqlTypes[i] = new String(source.SqlTypes[i]);
            }
        }
        if (source.Catalogs != null) {
            this.Catalogs = new String[source.Catalogs.length];
            for (int i = 0; i < source.Catalogs.length; i++) {
                this.Catalogs[i] = new String(source.Catalogs[i]);
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
        this.setParamArraySimple(map, prefix + "Databases.", this.Databases);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "SqlTypes.", this.SqlTypes);
        this.setParamArraySimple(map, prefix + "Catalogs.", this.Catalogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

