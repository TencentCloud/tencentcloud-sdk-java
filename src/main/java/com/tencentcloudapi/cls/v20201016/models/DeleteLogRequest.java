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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLogRequest extends AbstractModel {

    /**
    * <p>日志主题id</p><p>仅在创建日志主题时，开启了日志修改/删除开关的主题，支持日志修改/删除。该功能暂时仅面向白名单内客户使用。</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>检索时间范围-开始时间</p><p>单位：ms</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>检索时间范围-结束时间</p><p>单位：ms</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行删除</p>
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
     * Get <p>日志主题id</p><p>仅在创建日志主题时，开启了日志修改/删除开关的主题，支持日志修改/删除。该功能暂时仅面向白名单内客户使用。</p> 
     * @return TopicId <p>日志主题id</p><p>仅在创建日志主题时，开启了日志修改/删除开关的主题，支持日志修改/删除。该功能暂时仅面向白名单内客户使用。</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p><p>仅在创建日志主题时，开启了日志修改/删除开关的主题，支持日志修改/删除。该功能暂时仅面向白名单内客户使用。</p>
     * @param TopicId <p>日志主题id</p><p>仅在创建日志主题时，开启了日志修改/删除开关的主题，支持日志修改/删除。该功能暂时仅面向白名单内客户使用。</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>检索时间范围-开始时间</p><p>单位：ms</p> 
     * @return From <p>检索时间范围-开始时间</p><p>单位：ms</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>检索时间范围-开始时间</p><p>单位：ms</p>
     * @param From <p>检索时间范围-开始时间</p><p>单位：ms</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>检索时间范围-结束时间</p><p>单位：ms</p> 
     * @return To <p>检索时间范围-结束时间</p><p>单位：ms</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>检索时间范围-结束时间</p><p>单位：ms</p>
     * @param To <p>检索时间范围-结束时间</p><p>单位：ms</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行删除</p> 
     * @return QueryString <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行删除</p>
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行删除</p>
     * @param QueryString <p>日志检索条件，仅支持 CQL 语法，不支持 Lucene 语法</p><p>对符合检索条件的日志进行删除</p>
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    public DeleteLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLogRequest(DeleteLogRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);

    }
}

