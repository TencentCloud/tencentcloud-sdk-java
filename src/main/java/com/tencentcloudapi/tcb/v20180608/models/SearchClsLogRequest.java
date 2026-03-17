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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchClsLogRequest extends AbstractModel {

    /**
    * 环境唯一ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 查询起始时间条件
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间条件
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询语句， 例如查询云函数：(src:app OR src:system) AND log:\"START RequestId*\"，  聚合云函数请求状态：* | select request_id, max(status_code) as status  where ((request_id='44738f94-16dd-11f1-****' AND retry_num=0) AND retry_num=0)) AND status_code!=202 group by request_id, retry_num 查询云数据库[文档型]：module:database， 查询云数据库[文档型]事件：module:database AND eventType:(MongoSlowQuery)，MongoSlowQuery为文档型数据库慢查询事件 查询云数据库[SQL型]：module:rdb， 查询云数据库[SQL型]事件：module:rdb AND eventType:(MysqlFreeze OR MysqlRecover OR MysqlSlowQuery)，MysqlFreeze为mysql数据库冻结事件、MysqlRecover为mysql数据库恢复事件、MysqlSlowQuery为mysql数据库慢查询事件 查询审批流：module:workflow， 查询模型：module:model， 查询用户权限：module:auth， 查询大模型：module:llm AND logType:llm-tracelog 查询网关服务调用：logType:accesslog 查询应用发布/删除事件：module:app AND eventType:(AppProdPub OR AppProdDel)，AppProdPub为应用发布事件，AppProdDel为应用删除事件 以上仅为示例语句，实际使用时请根据具体日志内容进行调整，查询语句需严格遵循CLS（Cloud Log Service）语法规范 详细的语法规则请参考官方档：https://cloud.tencent.com/document/product/614/47044
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * 单次要返回的日志条数，单次返回的最大条数为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 按时间排序 asc（升序）或者 desc（降序），默认为 desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 是否使用Lucene语法，默认为false
    */
    @SerializedName("UseLucene")
    @Expose
    private Boolean UseLucene;

    /**
     * Get 环境唯一ID 
     * @return EnvId 环境唯一ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境唯一ID
     * @param EnvId 环境唯一ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 查询起始时间条件 
     * @return StartTime 查询起始时间条件
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间条件
     * @param StartTime 查询起始时间条件
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间条件 
     * @return EndTime 查询结束时间条件
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间条件
     * @param EndTime 查询结束时间条件
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询语句， 例如查询云函数：(src:app OR src:system) AND log:\"START RequestId*\"，  聚合云函数请求状态：* | select request_id, max(status_code) as status  where ((request_id='44738f94-16dd-11f1-****' AND retry_num=0) AND retry_num=0)) AND status_code!=202 group by request_id, retry_num 查询云数据库[文档型]：module:database， 查询云数据库[文档型]事件：module:database AND eventType:(MongoSlowQuery)，MongoSlowQuery为文档型数据库慢查询事件 查询云数据库[SQL型]：module:rdb， 查询云数据库[SQL型]事件：module:rdb AND eventType:(MysqlFreeze OR MysqlRecover OR MysqlSlowQuery)，MysqlFreeze为mysql数据库冻结事件、MysqlRecover为mysql数据库恢复事件、MysqlSlowQuery为mysql数据库慢查询事件 查询审批流：module:workflow， 查询模型：module:model， 查询用户权限：module:auth， 查询大模型：module:llm AND logType:llm-tracelog 查询网关服务调用：logType:accesslog 查询应用发布/删除事件：module:app AND eventType:(AppProdPub OR AppProdDel)，AppProdPub为应用发布事件，AppProdDel为应用删除事件 以上仅为示例语句，实际使用时请根据具体日志内容进行调整，查询语句需严格遵循CLS（Cloud Log Service）语法规范 详细的语法规则请参考官方档：https://cloud.tencent.com/document/product/614/47044 
     * @return QueryString 查询语句， 例如查询云函数：(src:app OR src:system) AND log:\"START RequestId*\"，  聚合云函数请求状态：* | select request_id, max(status_code) as status  where ((request_id='44738f94-16dd-11f1-****' AND retry_num=0) AND retry_num=0)) AND status_code!=202 group by request_id, retry_num 查询云数据库[文档型]：module:database， 查询云数据库[文档型]事件：module:database AND eventType:(MongoSlowQuery)，MongoSlowQuery为文档型数据库慢查询事件 查询云数据库[SQL型]：module:rdb， 查询云数据库[SQL型]事件：module:rdb AND eventType:(MysqlFreeze OR MysqlRecover OR MysqlSlowQuery)，MysqlFreeze为mysql数据库冻结事件、MysqlRecover为mysql数据库恢复事件、MysqlSlowQuery为mysql数据库慢查询事件 查询审批流：module:workflow， 查询模型：module:model， 查询用户权限：module:auth， 查询大模型：module:llm AND logType:llm-tracelog 查询网关服务调用：logType:accesslog 查询应用发布/删除事件：module:app AND eventType:(AppProdPub OR AppProdDel)，AppProdPub为应用发布事件，AppProdDel为应用删除事件 以上仅为示例语句，实际使用时请根据具体日志内容进行调整，查询语句需严格遵循CLS（Cloud Log Service）语法规范 详细的语法规则请参考官方档：https://cloud.tencent.com/document/product/614/47044
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set 查询语句， 例如查询云函数：(src:app OR src:system) AND log:\"START RequestId*\"，  聚合云函数请求状态：* | select request_id, max(status_code) as status  where ((request_id='44738f94-16dd-11f1-****' AND retry_num=0) AND retry_num=0)) AND status_code!=202 group by request_id, retry_num 查询云数据库[文档型]：module:database， 查询云数据库[文档型]事件：module:database AND eventType:(MongoSlowQuery)，MongoSlowQuery为文档型数据库慢查询事件 查询云数据库[SQL型]：module:rdb， 查询云数据库[SQL型]事件：module:rdb AND eventType:(MysqlFreeze OR MysqlRecover OR MysqlSlowQuery)，MysqlFreeze为mysql数据库冻结事件、MysqlRecover为mysql数据库恢复事件、MysqlSlowQuery为mysql数据库慢查询事件 查询审批流：module:workflow， 查询模型：module:model， 查询用户权限：module:auth， 查询大模型：module:llm AND logType:llm-tracelog 查询网关服务调用：logType:accesslog 查询应用发布/删除事件：module:app AND eventType:(AppProdPub OR AppProdDel)，AppProdPub为应用发布事件，AppProdDel为应用删除事件 以上仅为示例语句，实际使用时请根据具体日志内容进行调整，查询语句需严格遵循CLS（Cloud Log Service）语法规范 详细的语法规则请参考官方档：https://cloud.tencent.com/document/product/614/47044
     * @param QueryString 查询语句， 例如查询云函数：(src:app OR src:system) AND log:\"START RequestId*\"，  聚合云函数请求状态：* | select request_id, max(status_code) as status  where ((request_id='44738f94-16dd-11f1-****' AND retry_num=0) AND retry_num=0)) AND status_code!=202 group by request_id, retry_num 查询云数据库[文档型]：module:database， 查询云数据库[文档型]事件：module:database AND eventType:(MongoSlowQuery)，MongoSlowQuery为文档型数据库慢查询事件 查询云数据库[SQL型]：module:rdb， 查询云数据库[SQL型]事件：module:rdb AND eventType:(MysqlFreeze OR MysqlRecover OR MysqlSlowQuery)，MysqlFreeze为mysql数据库冻结事件、MysqlRecover为mysql数据库恢复事件、MysqlSlowQuery为mysql数据库慢查询事件 查询审批流：module:workflow， 查询模型：module:model， 查询用户权限：module:auth， 查询大模型：module:llm AND logType:llm-tracelog 查询网关服务调用：logType:accesslog 查询应用发布/删除事件：module:app AND eventType:(AppProdPub OR AppProdDel)，AppProdPub为应用发布事件，AppProdDel为应用删除事件 以上仅为示例语句，实际使用时请根据具体日志内容进行调整，查询语句需严格遵循CLS（Cloud Log Service）语法规范 详细的语法规则请参考官方档：https://cloud.tencent.com/document/product/614/47044
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 单次要返回的日志条数，单次返回的最大条数为100 
     * @return Limit 单次要返回的日志条数，单次返回的最大条数为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次要返回的日志条数，单次返回的最大条数为100
     * @param Limit 单次要返回的日志条数，单次返回的最大条数为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围 
     * @return Context 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
     * @param Context 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 按时间排序 asc（升序）或者 desc（降序），默认为 desc 
     * @return Sort 按时间排序 asc（升序）或者 desc（降序），默认为 desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 按时间排序 asc（升序）或者 desc（降序），默认为 desc
     * @param Sort 按时间排序 asc（升序）或者 desc（降序），默认为 desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 是否使用Lucene语法，默认为false 
     * @return UseLucene 是否使用Lucene语法，默认为false
     */
    public Boolean getUseLucene() {
        return this.UseLucene;
    }

    /**
     * Set 是否使用Lucene语法，默认为false
     * @param UseLucene 是否使用Lucene语法，默认为false
     */
    public void setUseLucene(Boolean UseLucene) {
        this.UseLucene = UseLucene;
    }

    public SearchClsLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchClsLogRequest(SearchClsLogRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.UseLucene != null) {
            this.UseLucene = new Boolean(source.UseLucene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "UseLucene", this.UseLucene);

    }
}

