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

public class RoleResource extends AbstractModel {

    /**
    * <p>是否集群级资源</p>
    */
    @SerializedName("Cluster")
    @Expose
    private Boolean Cluster;

    /**
    * <p>db名</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>collection名</p>
    */
    @SerializedName("Collection")
    @Expose
    private String Collection;

    /**
     * Get <p>是否集群级资源</p> 
     * @return Cluster <p>是否集群级资源</p>
     */
    public Boolean getCluster() {
        return this.Cluster;
    }

    /**
     * Set <p>是否集群级资源</p>
     * @param Cluster <p>是否集群级资源</p>
     */
    public void setCluster(Boolean Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get <p>db名</p> 
     * @return Database <p>db名</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>db名</p>
     * @param Database <p>db名</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>collection名</p> 
     * @return Collection <p>collection名</p>
     */
    public String getCollection() {
        return this.Collection;
    }

    /**
     * Set <p>collection名</p>
     * @param Collection <p>collection名</p>
     */
    public void setCollection(String Collection) {
        this.Collection = Collection;
    }

    public RoleResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleResource(RoleResource source) {
        if (source.Cluster != null) {
            this.Cluster = new Boolean(source.Cluster);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Collection != null) {
            this.Collection = new String(source.Collection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Collection", this.Collection);

    }
}

