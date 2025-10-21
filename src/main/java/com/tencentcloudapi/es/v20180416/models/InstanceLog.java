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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLog extends AbstractModel {

    /**
    * 日志时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 日志级别
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 集群节点ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 日志内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 集群节点ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * 慢日志索引名
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 慢日志索引分片
    */
    @SerializedName("Shard")
    @Expose
    private String Shard;

    /**
    * 慢日志索引查询耗时
    */
    @SerializedName("QueryCost")
    @Expose
    private String QueryCost;

    /**
     * Get 日志时间 
     * @return Time 日志时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间
     * @param Time 日志时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 日志级别 
     * @return Level 日志级别
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志级别
     * @param Level 日志级别
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 集群节点ip 
     * @return Ip 集群节点ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 集群节点ip
     * @param Ip 集群节点ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 日志内容 
     * @return Message 日志内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 日志内容
     * @param Message 日志内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 集群节点ID 
     * @return NodeID 集群节点ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 集群节点ID
     * @param NodeID 集群节点ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get 慢日志索引名 
     * @return IndexName 慢日志索引名
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 慢日志索引名
     * @param IndexName 慢日志索引名
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 慢日志索引分片 
     * @return Shard 慢日志索引分片
     */
    public String getShard() {
        return this.Shard;
    }

    /**
     * Set 慢日志索引分片
     * @param Shard 慢日志索引分片
     */
    public void setShard(String Shard) {
        this.Shard = Shard;
    }

    /**
     * Get 慢日志索引查询耗时 
     * @return QueryCost 慢日志索引查询耗时
     */
    public String getQueryCost() {
        return this.QueryCost;
    }

    /**
     * Set 慢日志索引查询耗时
     * @param QueryCost 慢日志索引查询耗时
     */
    public void setQueryCost(String QueryCost) {
        this.QueryCost = QueryCost;
    }

    public InstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLog(InstanceLog source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.Shard != null) {
            this.Shard = new String(source.Shard);
        }
        if (source.QueryCost != null) {
            this.QueryCost = new String(source.QueryCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "Shard", this.Shard);
        this.setParamSimple(map, prefix + "QueryCost", this.QueryCost);

    }
}

