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
    * 索引规则，Rule和Effective两个必须有一个参数存在
    */
    @SerializedName("Rule")
    @Expose
    private RuleInfo Rule;

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
     * Get 索引规则，Rule和Effective两个必须有一个参数存在 
     * @return Rule 索引规则，Rule和Effective两个必须有一个参数存在
     */
    public RuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set 索引规则，Rule和Effective两个必须有一个参数存在
     * @param Rule 索引规则，Rule和Effective两个必须有一个参数存在
     */
    public void setRule(RuleInfo Rule) {
        this.Rule = Rule;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Rule.", this.Rule);

    }
}

