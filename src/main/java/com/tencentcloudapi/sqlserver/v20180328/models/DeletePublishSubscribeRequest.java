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

public class DeletePublishSubscribeRequest extends AbstractModel{

    /**
    * 发布订阅ID，可通过DescribePublishSubscribe接口获得
    */
    @SerializedName("PublishSubscribeId")
    @Expose
    private Long PublishSubscribeId;

    /**
    * 待删除的数据库的订阅发布关系集合
    */
    @SerializedName("DatabaseTupleSet")
    @Expose
    private DatabaseTuple [] DatabaseTupleSet;

    /**
     * Get 发布订阅ID，可通过DescribePublishSubscribe接口获得 
     * @return PublishSubscribeId 发布订阅ID，可通过DescribePublishSubscribe接口获得
     */
    public Long getPublishSubscribeId() {
        return this.PublishSubscribeId;
    }

    /**
     * Set 发布订阅ID，可通过DescribePublishSubscribe接口获得
     * @param PublishSubscribeId 发布订阅ID，可通过DescribePublishSubscribe接口获得
     */
    public void setPublishSubscribeId(Long PublishSubscribeId) {
        this.PublishSubscribeId = PublishSubscribeId;
    }

    /**
     * Get 待删除的数据库的订阅发布关系集合 
     * @return DatabaseTupleSet 待删除的数据库的订阅发布关系集合
     */
    public DatabaseTuple [] getDatabaseTupleSet() {
        return this.DatabaseTupleSet;
    }

    /**
     * Set 待删除的数据库的订阅发布关系集合
     * @param DatabaseTupleSet 待删除的数据库的订阅发布关系集合
     */
    public void setDatabaseTupleSet(DatabaseTuple [] DatabaseTupleSet) {
        this.DatabaseTupleSet = DatabaseTupleSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishSubscribeId", this.PublishSubscribeId);
        this.setParamArrayObj(map, prefix + "DatabaseTupleSet.", this.DatabaseTupleSet);

    }
}

