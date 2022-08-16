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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableMapping extends AbstractModel{

    /**
    * 库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 表名，多个表,（逗号）隔开
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Topic名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get 库名 
     * @return Database 库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 库名
     * @param Database 库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 表名，多个表,（逗号）隔开 
     * @return Table 表名，多个表,（逗号）隔开
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名，多个表,（逗号）隔开
     * @param Table 表名，多个表,（逗号）隔开
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Topic名称 
     * @return Topic Topic名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic名称
     * @param Topic Topic名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public TableMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableMapping(TableMapping source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

