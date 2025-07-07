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

public class DescribeDetailedSlowLogsRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 待查询慢日志的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 待慢日志的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 过滤执行时间大于此值的慢日志，单位ms，默认值100
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * 过滤慢日志的命令类型
    */
    @SerializedName("Commands")
    @Expose
    private String [] Commands;

    /**
    * 全文搜索关键字，多个关键字间为或关系
    */
    @SerializedName("Texts")
    @Expose
    private String [] Texts;

    /**
    * 根据节点名过滤
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * 根据queryHash过滤
    */
    @SerializedName("QueryHash")
    @Expose
    private String [] QueryHash;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序条件，只支持StartTime(按慢日志生成时间)和ExecTime(慢日志执行时间)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序。desc倒排，asc正排
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 待查询慢日志的开始时间 
     * @return StartTime 待查询慢日志的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 待查询慢日志的开始时间
     * @param StartTime 待查询慢日志的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 待慢日志的结束时间 
     * @return EndTime 待慢日志的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 待慢日志的结束时间
     * @param EndTime 待慢日志的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过滤执行时间大于此值的慢日志，单位ms，默认值100 
     * @return ExecTime 过滤执行时间大于此值的慢日志，单位ms，默认值100
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 过滤执行时间大于此值的慢日志，单位ms，默认值100
     * @param ExecTime 过滤执行时间大于此值的慢日志，单位ms，默认值100
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get 过滤慢日志的命令类型 
     * @return Commands 过滤慢日志的命令类型
     */
    public String [] getCommands() {
        return this.Commands;
    }

    /**
     * Set 过滤慢日志的命令类型
     * @param Commands 过滤慢日志的命令类型
     */
    public void setCommands(String [] Commands) {
        this.Commands = Commands;
    }

    /**
     * Get 全文搜索关键字，多个关键字间为或关系 
     * @return Texts 全文搜索关键字，多个关键字间为或关系
     */
    public String [] getTexts() {
        return this.Texts;
    }

    /**
     * Set 全文搜索关键字，多个关键字间为或关系
     * @param Texts 全文搜索关键字，多个关键字间为或关系
     */
    public void setTexts(String [] Texts) {
        this.Texts = Texts;
    }

    /**
     * Get 根据节点名过滤 
     * @return NodeNames 根据节点名过滤
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 根据节点名过滤
     * @param NodeNames 根据节点名过滤
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get 根据queryHash过滤 
     * @return QueryHash 根据queryHash过滤
     */
    public String [] getQueryHash() {
        return this.QueryHash;
    }

    /**
     * Set 根据queryHash过滤
     * @param QueryHash 根据queryHash过滤
     */
    public void setQueryHash(String [] QueryHash) {
        this.QueryHash = QueryHash;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回条数 
     * @return Limit 返回条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回条数
     * @param Limit 返回条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序条件，只支持StartTime(按慢日志生成时间)和ExecTime(慢日志执行时间) 
     * @return OrderBy 排序条件，只支持StartTime(按慢日志生成时间)和ExecTime(慢日志执行时间)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序条件，只支持StartTime(按慢日志生成时间)和ExecTime(慢日志执行时间)
     * @param OrderBy 排序条件，只支持StartTime(按慢日志生成时间)和ExecTime(慢日志执行时间)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序。desc倒排，asc正排 
     * @return OrderByType 排序。desc倒排，asc正排
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序。desc倒排，asc正排
     * @param OrderByType 排序。desc倒排，asc正排
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeDetailedSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDetailedSlowLogsRequest(DescribeDetailedSlowLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Commands != null) {
            this.Commands = new String[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new String(source.Commands[i]);
            }
        }
        if (source.Texts != null) {
            this.Texts = new String[source.Texts.length];
            for (int i = 0; i < source.Texts.length; i++) {
                this.Texts[i] = new String(source.Texts[i]);
            }
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.QueryHash != null) {
            this.QueryHash = new String[source.QueryHash.length];
            for (int i = 0; i < source.QueryHash.length; i++) {
                this.QueryHash[i] = new String(source.QueryHash[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamArraySimple(map, prefix + "Commands.", this.Commands);
        this.setParamArraySimple(map, prefix + "Texts.", this.Texts);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamArraySimple(map, prefix + "QueryHash.", this.QueryHash);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

