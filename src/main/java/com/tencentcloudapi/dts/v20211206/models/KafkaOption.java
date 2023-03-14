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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaOption extends AbstractModel{

    /**
    * 投递到kafka的数据类型，如Avro,Json
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * 同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * 用于存储ddl的topic
    */
    @SerializedName("DDLTopicName")
    @Expose
    private String DDLTopicName;

    /**
    * 单topic和自定义topic的描述
    */
    @SerializedName("TopicRules")
    @Expose
    private TopicRule [] TopicRules;

    /**
     * Get 投递到kafka的数据类型，如Avro,Json 
     * @return DataType 投递到kafka的数据类型，如Avro,Json
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 投递到kafka的数据类型，如Avro,Json
     * @param DataType 投递到kafka的数据类型，如Avro,Json
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称) 
     * @return TopicType 同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)
     * @param TopicType 同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 用于存储ddl的topic 
     * @return DDLTopicName 用于存储ddl的topic
     */
    public String getDDLTopicName() {
        return this.DDLTopicName;
    }

    /**
     * Set 用于存储ddl的topic
     * @param DDLTopicName 用于存储ddl的topic
     */
    public void setDDLTopicName(String DDLTopicName) {
        this.DDLTopicName = DDLTopicName;
    }

    /**
     * Get 单topic和自定义topic的描述 
     * @return TopicRules 单topic和自定义topic的描述
     */
    public TopicRule [] getTopicRules() {
        return this.TopicRules;
    }

    /**
     * Set 单topic和自定义topic的描述
     * @param TopicRules 单topic和自定义topic的描述
     */
    public void setTopicRules(TopicRule [] TopicRules) {
        this.TopicRules = TopicRules;
    }

    public KafkaOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaOption(KafkaOption source) {
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.DDLTopicName != null) {
            this.DDLTopicName = new String(source.DDLTopicName);
        }
        if (source.TopicRules != null) {
            this.TopicRules = new TopicRule[source.TopicRules.length];
            for (int i = 0; i < source.TopicRules.length; i++) {
                this.TopicRules[i] = new TopicRule(source.TopicRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "DDLTopicName", this.DDLTopicName);
        this.setParamArrayObj(map, prefix + "TopicRules.", this.TopicRules);

    }
}

