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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseMetaRequest extends AbstractModel {

    /**
    * 数据源唯一Id
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
     * Get 数据源唯一Id 
     * @return DatabaseId 数据源唯一Id
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据源唯一Id
     * @param DatabaseId 数据源唯一Id
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    public DescribeDatabaseMetaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseMetaRequest(DescribeDatabaseMetaRequest source) {
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);

    }
}

