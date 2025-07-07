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

public class PublishSubscribe extends AbstractModel {

    /**
    * 发布订阅ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 发布订阅名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 发布实例ID
    */
    @SerializedName("PublishInstanceId")
    @Expose
    private String PublishInstanceId;

    /**
    * 发布实例名称
    */
    @SerializedName("PublishInstanceName")
    @Expose
    private String PublishInstanceName;

    /**
    * 发布实例IP
    */
    @SerializedName("PublishInstanceIp")
    @Expose
    private String PublishInstanceIp;

    /**
    * 订阅实例ID
    */
    @SerializedName("SubscribeInstanceId")
    @Expose
    private String SubscribeInstanceId;

    /**
    * 订阅实例名称
    */
    @SerializedName("SubscribeInstanceName")
    @Expose
    private String SubscribeInstanceName;

    /**
    * 订阅实例IP
    */
    @SerializedName("SubscribeInstanceIp")
    @Expose
    private String SubscribeInstanceIp;

    /**
    * 数据库的订阅发布关系集合
    */
    @SerializedName("DatabaseTupleSet")
    @Expose
    private DatabaseTupleStatus [] DatabaseTupleSet;

    /**
     * Get 发布订阅ID 
     * @return Id 发布订阅ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 发布订阅ID
     * @param Id 发布订阅ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 发布订阅名称 
     * @return Name 发布订阅名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 发布订阅名称
     * @param Name 发布订阅名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 发布实例ID 
     * @return PublishInstanceId 发布实例ID
     */
    public String getPublishInstanceId() {
        return this.PublishInstanceId;
    }

    /**
     * Set 发布实例ID
     * @param PublishInstanceId 发布实例ID
     */
    public void setPublishInstanceId(String PublishInstanceId) {
        this.PublishInstanceId = PublishInstanceId;
    }

    /**
     * Get 发布实例名称 
     * @return PublishInstanceName 发布实例名称
     */
    public String getPublishInstanceName() {
        return this.PublishInstanceName;
    }

    /**
     * Set 发布实例名称
     * @param PublishInstanceName 发布实例名称
     */
    public void setPublishInstanceName(String PublishInstanceName) {
        this.PublishInstanceName = PublishInstanceName;
    }

    /**
     * Get 发布实例IP 
     * @return PublishInstanceIp 发布实例IP
     */
    public String getPublishInstanceIp() {
        return this.PublishInstanceIp;
    }

    /**
     * Set 发布实例IP
     * @param PublishInstanceIp 发布实例IP
     */
    public void setPublishInstanceIp(String PublishInstanceIp) {
        this.PublishInstanceIp = PublishInstanceIp;
    }

    /**
     * Get 订阅实例ID 
     * @return SubscribeInstanceId 订阅实例ID
     */
    public String getSubscribeInstanceId() {
        return this.SubscribeInstanceId;
    }

    /**
     * Set 订阅实例ID
     * @param SubscribeInstanceId 订阅实例ID
     */
    public void setSubscribeInstanceId(String SubscribeInstanceId) {
        this.SubscribeInstanceId = SubscribeInstanceId;
    }

    /**
     * Get 订阅实例名称 
     * @return SubscribeInstanceName 订阅实例名称
     */
    public String getSubscribeInstanceName() {
        return this.SubscribeInstanceName;
    }

    /**
     * Set 订阅实例名称
     * @param SubscribeInstanceName 订阅实例名称
     */
    public void setSubscribeInstanceName(String SubscribeInstanceName) {
        this.SubscribeInstanceName = SubscribeInstanceName;
    }

    /**
     * Get 订阅实例IP 
     * @return SubscribeInstanceIp 订阅实例IP
     */
    public String getSubscribeInstanceIp() {
        return this.SubscribeInstanceIp;
    }

    /**
     * Set 订阅实例IP
     * @param SubscribeInstanceIp 订阅实例IP
     */
    public void setSubscribeInstanceIp(String SubscribeInstanceIp) {
        this.SubscribeInstanceIp = SubscribeInstanceIp;
    }

    /**
     * Get 数据库的订阅发布关系集合 
     * @return DatabaseTupleSet 数据库的订阅发布关系集合
     */
    public DatabaseTupleStatus [] getDatabaseTupleSet() {
        return this.DatabaseTupleSet;
    }

    /**
     * Set 数据库的订阅发布关系集合
     * @param DatabaseTupleSet 数据库的订阅发布关系集合
     */
    public void setDatabaseTupleSet(DatabaseTupleStatus [] DatabaseTupleSet) {
        this.DatabaseTupleSet = DatabaseTupleSet;
    }

    public PublishSubscribe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishSubscribe(PublishSubscribe source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PublishInstanceId != null) {
            this.PublishInstanceId = new String(source.PublishInstanceId);
        }
        if (source.PublishInstanceName != null) {
            this.PublishInstanceName = new String(source.PublishInstanceName);
        }
        if (source.PublishInstanceIp != null) {
            this.PublishInstanceIp = new String(source.PublishInstanceIp);
        }
        if (source.SubscribeInstanceId != null) {
            this.SubscribeInstanceId = new String(source.SubscribeInstanceId);
        }
        if (source.SubscribeInstanceName != null) {
            this.SubscribeInstanceName = new String(source.SubscribeInstanceName);
        }
        if (source.SubscribeInstanceIp != null) {
            this.SubscribeInstanceIp = new String(source.SubscribeInstanceIp);
        }
        if (source.DatabaseTupleSet != null) {
            this.DatabaseTupleSet = new DatabaseTupleStatus[source.DatabaseTupleSet.length];
            for (int i = 0; i < source.DatabaseTupleSet.length; i++) {
                this.DatabaseTupleSet[i] = new DatabaseTupleStatus(source.DatabaseTupleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PublishInstanceId", this.PublishInstanceId);
        this.setParamSimple(map, prefix + "PublishInstanceName", this.PublishInstanceName);
        this.setParamSimple(map, prefix + "PublishInstanceIp", this.PublishInstanceIp);
        this.setParamSimple(map, prefix + "SubscribeInstanceId", this.SubscribeInstanceId);
        this.setParamSimple(map, prefix + "SubscribeInstanceName", this.SubscribeInstanceName);
        this.setParamSimple(map, prefix + "SubscribeInstanceIp", this.SubscribeInstanceIp);
        this.setParamArrayObj(map, prefix + "DatabaseTupleSet.", this.DatabaseTupleSet);

    }
}

