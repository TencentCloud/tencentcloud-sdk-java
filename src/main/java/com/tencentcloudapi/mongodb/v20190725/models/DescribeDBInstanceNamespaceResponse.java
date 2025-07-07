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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceNamespaceResponse extends AbstractModel {

    /**
    * 查询实例的数据库列表。若未使用 DbName 指定具体查询的数据库，则仅返回查询实例所有的数据库列表，而不返回 Collections 集合信息。
    */
    @SerializedName("Databases")
    @Expose
    private String [] Databases;

    /**
    * 查询的集合信息。指定 DbName 时，则仅返回该数据库下的集合列表。
    */
    @SerializedName("Collections")
    @Expose
    private String [] Collections;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询实例的数据库列表。若未使用 DbName 指定具体查询的数据库，则仅返回查询实例所有的数据库列表，而不返回 Collections 集合信息。 
     * @return Databases 查询实例的数据库列表。若未使用 DbName 指定具体查询的数据库，则仅返回查询实例所有的数据库列表，而不返回 Collections 集合信息。
     */
    public String [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set 查询实例的数据库列表。若未使用 DbName 指定具体查询的数据库，则仅返回查询实例所有的数据库列表，而不返回 Collections 集合信息。
     * @param Databases 查询实例的数据库列表。若未使用 DbName 指定具体查询的数据库，则仅返回查询实例所有的数据库列表，而不返回 Collections 集合信息。
     */
    public void setDatabases(String [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get 查询的集合信息。指定 DbName 时，则仅返回该数据库下的集合列表。 
     * @return Collections 查询的集合信息。指定 DbName 时，则仅返回该数据库下的集合列表。
     */
    public String [] getCollections() {
        return this.Collections;
    }

    /**
     * Set 查询的集合信息。指定 DbName 时，则仅返回该数据库下的集合列表。
     * @param Collections 查询的集合信息。指定 DbName 时，则仅返回该数据库下的集合列表。
     */
    public void setCollections(String [] Collections) {
        this.Collections = Collections;
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

    public DescribeDBInstanceNamespaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceNamespaceResponse(DescribeDBInstanceNamespaceResponse source) {
        if (source.Databases != null) {
            this.Databases = new String[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new String(source.Databases[i]);
            }
        }
        if (source.Collections != null) {
            this.Collections = new String[source.Collections.length];
            for (int i = 0; i < source.Collections.length; i++) {
                this.Collections[i] = new String(source.Collections[i]);
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
        this.setParamArraySimple(map, prefix + "Collections.", this.Collections);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

