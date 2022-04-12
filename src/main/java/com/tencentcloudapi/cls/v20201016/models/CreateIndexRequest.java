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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIndexRequest extends AbstractModel{

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 索引规则
    */
    @SerializedName("Rule")
    @Expose
    private RuleInfo Rule;

    /**
    * 是否生效，默认为true
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 全文索引系统预置字段标记，默认false。  false:不包含系统预置字段， true:包含系统预置字段
    */
    @SerializedName("IncludeInternalFields")
    @Expose
    private Boolean IncludeInternalFields;

    /**
    * 元数据相关标志位，默认为0。 0：全文索引包括开启键值索引的元数据字段， 1：全文索引包括所有元数据字段，2：全文索引不包括元数据字段。
    */
    @SerializedName("MetadataFlag")
    @Expose
    private Long MetadataFlag;

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 索引规则 
     * @return Rule 索引规则
     */
    public RuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set 索引规则
     * @param Rule 索引规则
     */
    public void setRule(RuleInfo Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 是否生效，默认为true 
     * @return Status 是否生效，默认为true
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 是否生效，默认为true
     * @param Status 是否生效，默认为true
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 全文索引系统预置字段标记，默认false。  false:不包含系统预置字段， true:包含系统预置字段 
     * @return IncludeInternalFields 全文索引系统预置字段标记，默认false。  false:不包含系统预置字段， true:包含系统预置字段
     */
    public Boolean getIncludeInternalFields() {
        return this.IncludeInternalFields;
    }

    /**
     * Set 全文索引系统预置字段标记，默认false。  false:不包含系统预置字段， true:包含系统预置字段
     * @param IncludeInternalFields 全文索引系统预置字段标记，默认false。  false:不包含系统预置字段， true:包含系统预置字段
     */
    public void setIncludeInternalFields(Boolean IncludeInternalFields) {
        this.IncludeInternalFields = IncludeInternalFields;
    }

    /**
     * Get 元数据相关标志位，默认为0。 0：全文索引包括开启键值索引的元数据字段， 1：全文索引包括所有元数据字段，2：全文索引不包括元数据字段。 
     * @return MetadataFlag 元数据相关标志位，默认为0。 0：全文索引包括开启键值索引的元数据字段， 1：全文索引包括所有元数据字段，2：全文索引不包括元数据字段。
     */
    public Long getMetadataFlag() {
        return this.MetadataFlag;
    }

    /**
     * Set 元数据相关标志位，默认为0。 0：全文索引包括开启键值索引的元数据字段， 1：全文索引包括所有元数据字段，2：全文索引不包括元数据字段。
     * @param MetadataFlag 元数据相关标志位，默认为0。 0：全文索引包括开启键值索引的元数据字段， 1：全文索引包括所有元数据字段，2：全文索引不包括元数据字段。
     */
    public void setMetadataFlag(Long MetadataFlag) {
        this.MetadataFlag = MetadataFlag;
    }

    public CreateIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIndexRequest(CreateIndexRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Rule != null) {
            this.Rule = new RuleInfo(source.Rule);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.IncludeInternalFields != null) {
            this.IncludeInternalFields = new Boolean(source.IncludeInternalFields);
        }
        if (source.MetadataFlag != null) {
            this.MetadataFlag = new Long(source.MetadataFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IncludeInternalFields", this.IncludeInternalFields);
        this.setParamSimple(map, prefix + "MetadataFlag", this.MetadataFlag);

    }
}

