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

public class ModifyIndexRequest extends AbstractModel{

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 默认不生效
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 索引规则
    */
    @SerializedName("Rule")
    @Expose
    private RuleInfo Rule;

    /**
    * 内置保留字段（`__FILENAME__`，`__HOSTNAME__`及`__SOURCE__`）是否包含至全文索引，默认为false，推荐设置为true
* false:不包含
* true:包含
    */
    @SerializedName("IncludeInternalFields")
    @Expose
    private Boolean IncludeInternalFields;

    /**
    * 元数据字段（前缀为`__TAG__`的字段）是否包含至全文索引，默认为0，推荐设置为1
* 0:仅包含开启键值索引的元数据字段
* 1:包含所有元数据字段
* 2:不包含任何元数据字段
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
     * Get 默认不生效 
     * @return Status 默认不生效
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 默认不生效
     * @param Status 默认不生效
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
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
     * Get 内置保留字段（`__FILENAME__`，`__HOSTNAME__`及`__SOURCE__`）是否包含至全文索引，默认为false，推荐设置为true
* false:不包含
* true:包含 
     * @return IncludeInternalFields 内置保留字段（`__FILENAME__`，`__HOSTNAME__`及`__SOURCE__`）是否包含至全文索引，默认为false，推荐设置为true
* false:不包含
* true:包含
     */
    public Boolean getIncludeInternalFields() {
        return this.IncludeInternalFields;
    }

    /**
     * Set 内置保留字段（`__FILENAME__`，`__HOSTNAME__`及`__SOURCE__`）是否包含至全文索引，默认为false，推荐设置为true
* false:不包含
* true:包含
     * @param IncludeInternalFields 内置保留字段（`__FILENAME__`，`__HOSTNAME__`及`__SOURCE__`）是否包含至全文索引，默认为false，推荐设置为true
* false:不包含
* true:包含
     */
    public void setIncludeInternalFields(Boolean IncludeInternalFields) {
        this.IncludeInternalFields = IncludeInternalFields;
    }

    /**
     * Get 元数据字段（前缀为`__TAG__`的字段）是否包含至全文索引，默认为0，推荐设置为1
* 0:仅包含开启键值索引的元数据字段
* 1:包含所有元数据字段
* 2:不包含任何元数据字段 
     * @return MetadataFlag 元数据字段（前缀为`__TAG__`的字段）是否包含至全文索引，默认为0，推荐设置为1
* 0:仅包含开启键值索引的元数据字段
* 1:包含所有元数据字段
* 2:不包含任何元数据字段
     */
    public Long getMetadataFlag() {
        return this.MetadataFlag;
    }

    /**
     * Set 元数据字段（前缀为`__TAG__`的字段）是否包含至全文索引，默认为0，推荐设置为1
* 0:仅包含开启键值索引的元数据字段
* 1:包含所有元数据字段
* 2:不包含任何元数据字段
     * @param MetadataFlag 元数据字段（前缀为`__TAG__`的字段）是否包含至全文索引，默认为0，推荐设置为1
* 0:仅包含开启键值索引的元数据字段
* 1:包含所有元数据字段
* 2:不包含任何元数据字段
     */
    public void setMetadataFlag(Long MetadataFlag) {
        this.MetadataFlag = MetadataFlag;
    }

    public ModifyIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIndexRequest(ModifyIndexRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Rule != null) {
            this.Rule = new RuleInfo(source.Rule);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "IncludeInternalFields", this.IncludeInternalFields);
        this.setParamSimple(map, prefix + "MetadataFlag", this.MetadataFlag);

    }
}

