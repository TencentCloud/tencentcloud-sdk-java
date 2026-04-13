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

public class RestoreDatabases extends AbstractModel {

    /**
    * DB名称。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 待回档的集合信息。
    */
    @SerializedName("Collections")
    @Expose
    private RestoreCollection [] Collections;

    /**
     * Get DB名称。 
     * @return Db DB名称。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set DB名称。
     * @param Db DB名称。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 待回档的集合信息。 
     * @return Collections 待回档的集合信息。
     */
    public RestoreCollection [] getCollections() {
        return this.Collections;
    }

    /**
     * Set 待回档的集合信息。
     * @param Collections 待回档的集合信息。
     */
    public void setCollections(RestoreCollection [] Collections) {
        this.Collections = Collections;
    }

    public RestoreDatabases() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreDatabases(RestoreDatabases source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Collections != null) {
            this.Collections = new RestoreCollection[source.Collections.length];
            for (int i = 0; i < source.Collections.length; i++) {
                this.Collections[i] = new RestoreCollection(source.Collections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamArrayObj(map, prefix + "Collections.", this.Collections);

    }
}

