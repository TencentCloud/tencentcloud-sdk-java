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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsConfig extends AbstractModel{

    /**
    * 接入类型，可选项为free、customer
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自定义CLS的日志集ID，只有当Type为customer时生效
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 自定义CLS的日志主题ID，只有当Type为customer时生效
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get 接入类型，可选项为free、customer 
     * @return Type 接入类型，可选项为free、customer
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 接入类型，可选项为free、customer
     * @param Type 接入类型，可选项为free、customer
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自定义CLS的日志集ID，只有当Type为customer时生效 
     * @return LogSetId 自定义CLS的日志集ID，只有当Type为customer时生效
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 自定义CLS的日志集ID，只有当Type为customer时生效
     * @param LogSetId 自定义CLS的日志集ID，只有当Type为customer时生效
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 自定义CLS的日志主题ID，只有当Type为customer时生效 
     * @return TopicId 自定义CLS的日志主题ID，只有当Type为customer时生效
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 自定义CLS的日志主题ID，只有当Type为customer时生效
     * @param TopicId 自定义CLS的日志主题ID，只有当Type为customer时生效
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

