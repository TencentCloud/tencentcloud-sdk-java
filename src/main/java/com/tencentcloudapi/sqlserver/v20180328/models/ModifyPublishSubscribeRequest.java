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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPublishSubscribeRequest extends AbstractModel {

    /**
    * 实例ID，例如：mssql-dg32dcv
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 发布订阅ID
    */
    @SerializedName("PublishSubscribeId")
    @Expose
    private Long PublishSubscribeId;

    /**
    * 修改的数据库订阅发布关系集合
    */
    @SerializedName("DatabaseTupleSet")
    @Expose
    private ModifyDataBaseTuple [] DatabaseTupleSet;

    /**
     * Get 实例ID，例如：mssql-dg32dcv 
     * @return InstanceId 实例ID，例如：mssql-dg32dcv
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，例如：mssql-dg32dcv
     * @param InstanceId 实例ID，例如：mssql-dg32dcv
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 发布订阅ID 
     * @return PublishSubscribeId 发布订阅ID
     */
    public Long getPublishSubscribeId() {
        return this.PublishSubscribeId;
    }

    /**
     * Set 发布订阅ID
     * @param PublishSubscribeId 发布订阅ID
     */
    public void setPublishSubscribeId(Long PublishSubscribeId) {
        this.PublishSubscribeId = PublishSubscribeId;
    }

    /**
     * Get 修改的数据库订阅发布关系集合 
     * @return DatabaseTupleSet 修改的数据库订阅发布关系集合
     */
    public ModifyDataBaseTuple [] getDatabaseTupleSet() {
        return this.DatabaseTupleSet;
    }

    /**
     * Set 修改的数据库订阅发布关系集合
     * @param DatabaseTupleSet 修改的数据库订阅发布关系集合
     */
    public void setDatabaseTupleSet(ModifyDataBaseTuple [] DatabaseTupleSet) {
        this.DatabaseTupleSet = DatabaseTupleSet;
    }

    public ModifyPublishSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPublishSubscribeRequest(ModifyPublishSubscribeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PublishSubscribeId != null) {
            this.PublishSubscribeId = new Long(source.PublishSubscribeId);
        }
        if (source.DatabaseTupleSet != null) {
            this.DatabaseTupleSet = new ModifyDataBaseTuple[source.DatabaseTupleSet.length];
            for (int i = 0; i < source.DatabaseTupleSet.length; i++) {
                this.DatabaseTupleSet[i] = new ModifyDataBaseTuple(source.DatabaseTupleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PublishSubscribeId", this.PublishSubscribeId);
        this.setParamArrayObj(map, prefix + "DatabaseTupleSet.", this.DatabaseTupleSet);

    }
}

