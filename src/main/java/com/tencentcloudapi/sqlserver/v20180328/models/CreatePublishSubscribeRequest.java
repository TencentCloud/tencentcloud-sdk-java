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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePublishSubscribeRequest extends AbstractModel{

    /**
    * 发布实例ID，形如mssql-j8kv137v
    */
    @SerializedName("PublishInstanceId")
    @Expose
    private String PublishInstanceId;

    /**
    * 订阅实例ID，形如mssql-j8kv137v
    */
    @SerializedName("SubscribeInstanceId")
    @Expose
    private String SubscribeInstanceId;

    /**
    * 数据库的订阅发布关系集合
    */
    @SerializedName("DatabaseTupleSet")
    @Expose
    private DatabaseTuple [] DatabaseTupleSet;

    /**
    * 发布订阅的名称，默认值为：default_name
    */
    @SerializedName("PublishSubscribeName")
    @Expose
    private String PublishSubscribeName;

    /**
     * Get 发布实例ID，形如mssql-j8kv137v 
     * @return PublishInstanceId 发布实例ID，形如mssql-j8kv137v
     */
    public String getPublishInstanceId() {
        return this.PublishInstanceId;
    }

    /**
     * Set 发布实例ID，形如mssql-j8kv137v
     * @param PublishInstanceId 发布实例ID，形如mssql-j8kv137v
     */
    public void setPublishInstanceId(String PublishInstanceId) {
        this.PublishInstanceId = PublishInstanceId;
    }

    /**
     * Get 订阅实例ID，形如mssql-j8kv137v 
     * @return SubscribeInstanceId 订阅实例ID，形如mssql-j8kv137v
     */
    public String getSubscribeInstanceId() {
        return this.SubscribeInstanceId;
    }

    /**
     * Set 订阅实例ID，形如mssql-j8kv137v
     * @param SubscribeInstanceId 订阅实例ID，形如mssql-j8kv137v
     */
    public void setSubscribeInstanceId(String SubscribeInstanceId) {
        this.SubscribeInstanceId = SubscribeInstanceId;
    }

    /**
     * Get 数据库的订阅发布关系集合 
     * @return DatabaseTupleSet 数据库的订阅发布关系集合
     */
    public DatabaseTuple [] getDatabaseTupleSet() {
        return this.DatabaseTupleSet;
    }

    /**
     * Set 数据库的订阅发布关系集合
     * @param DatabaseTupleSet 数据库的订阅发布关系集合
     */
    public void setDatabaseTupleSet(DatabaseTuple [] DatabaseTupleSet) {
        this.DatabaseTupleSet = DatabaseTupleSet;
    }

    /**
     * Get 发布订阅的名称，默认值为：default_name 
     * @return PublishSubscribeName 发布订阅的名称，默认值为：default_name
     */
    public String getPublishSubscribeName() {
        return this.PublishSubscribeName;
    }

    /**
     * Set 发布订阅的名称，默认值为：default_name
     * @param PublishSubscribeName 发布订阅的名称，默认值为：default_name
     */
    public void setPublishSubscribeName(String PublishSubscribeName) {
        this.PublishSubscribeName = PublishSubscribeName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishInstanceId", this.PublishInstanceId);
        this.setParamSimple(map, prefix + "SubscribeInstanceId", this.SubscribeInstanceId);
        this.setParamArrayObj(map, prefix + "DatabaseTupleSet.", this.DatabaseTupleSet);
        this.setParamSimple(map, prefix + "PublishSubscribeName", this.PublishSubscribeName);

    }
}

