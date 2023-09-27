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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongoDBIndex extends AbstractModel{

    /**
    * 实例id。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 表名。
    */
    @SerializedName("Collection")
    @Expose
    private String Collection;

    /**
    * 库名。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 优化级别，1-4，优先级从高到低。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 得分。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 推荐索引列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexesToBuild")
    @Expose
    private IndexesToBuild [] IndexesToBuild;

    /**
    * 无效索引列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexesToDrop")
    @Expose
    private IndexesToDrop [] IndexesToDrop;

    /**
     * Get 实例id。 
     * @return ClusterId 实例id。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 实例id。
     * @param ClusterId 实例id。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 表名。 
     * @return Collection 表名。
     */
    public String getCollection() {
        return this.Collection;
    }

    /**
     * Set 表名。
     * @param Collection 表名。
     */
    public void setCollection(String Collection) {
        this.Collection = Collection;
    }

    /**
     * Get 库名。 
     * @return Db 库名。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 库名。
     * @param Db 库名。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 优化级别，1-4，优先级从高到低。 
     * @return Level 优化级别，1-4，优先级从高到低。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 优化级别，1-4，优先级从高到低。
     * @param Level 优化级别，1-4，优先级从高到低。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 得分。 
     * @return Score 得分。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 得分。
     * @param Score 得分。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 推荐索引列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexesToBuild 推荐索引列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexesToBuild [] getIndexesToBuild() {
        return this.IndexesToBuild;
    }

    /**
     * Set 推荐索引列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexesToBuild 推荐索引列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexesToBuild(IndexesToBuild [] IndexesToBuild) {
        this.IndexesToBuild = IndexesToBuild;
    }

    /**
     * Get 无效索引列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexesToDrop 无效索引列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexesToDrop [] getIndexesToDrop() {
        return this.IndexesToDrop;
    }

    /**
     * Set 无效索引列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexesToDrop 无效索引列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexesToDrop(IndexesToDrop [] IndexesToDrop) {
        this.IndexesToDrop = IndexesToDrop;
    }

    public MongoDBIndex() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoDBIndex(MongoDBIndex source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Collection != null) {
            this.Collection = new String(source.Collection);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.IndexesToBuild != null) {
            this.IndexesToBuild = new IndexesToBuild[source.IndexesToBuild.length];
            for (int i = 0; i < source.IndexesToBuild.length; i++) {
                this.IndexesToBuild[i] = new IndexesToBuild(source.IndexesToBuild[i]);
            }
        }
        if (source.IndexesToDrop != null) {
            this.IndexesToDrop = new IndexesToDrop[source.IndexesToDrop.length];
            for (int i = 0; i < source.IndexesToDrop.length; i++) {
                this.IndexesToDrop[i] = new IndexesToDrop(source.IndexesToDrop[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Collection", this.Collection);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "IndexesToBuild.", this.IndexesToBuild);
        this.setParamArrayObj(map, prefix + "IndexesToDrop.", this.IndexesToDrop);

    }
}

