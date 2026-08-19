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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IcebergDatabaseInfo extends AbstractModel {

    /**
    * <p>数据库名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>表名称</p>
    */
    @SerializedName("Tables")
    @Expose
    private String [] Tables;

    /**
     * Get <p>数据库名</p> 
     * @return Name <p>数据库名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据库名</p>
     * @param Name <p>数据库名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>表名称</p> 
     * @return Tables <p>表名称</p>
     */
    public String [] getTables() {
        return this.Tables;
    }

    /**
     * Set <p>表名称</p>
     * @param Tables <p>表名称</p>
     */
    public void setTables(String [] Tables) {
        this.Tables = Tables;
    }

    public IcebergDatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IcebergDatabaseInfo(IcebergDatabaseInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tables != null) {
            this.Tables = new String[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new String(source.Tables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tables.", this.Tables);

    }
}

