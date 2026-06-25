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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaOption extends AbstractModel {

    /**
    * <p>投递到kafka的数据类型，如Avro,Json,canal-pb,canal-json,debezium</p>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * <p>同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)</p>
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * <p>用于存储ddl的topic</p>
    */
    @SerializedName("DDLTopicName")
    @Expose
    private String DDLTopicName;

    /**
    * <p>单topic和自定义topic的描述</p>
    */
    @SerializedName("TopicRules")
    @Expose
    private TopicRule [] TopicRules;

    /**
    * <p>其他附加信息，对于特定数据类型可设置额外参数。比如针对Canal兼容的功能支持：&quot;canalOfficialFormat&quot;:&quot;on&quot;表示打开Canal兼容功能，默认不带。针对大消息跳过的功能支持：&quot;skipLargeMessage&quot;:&quot;on&quot;表示开启跳过大消息，默认不带；开启时需同时设置&quot;maxMessageSizeMB&quot;为1~100的正整数字符串，表示最大消息大小阈值（MB），超过该大小的消息将被跳过，默认不带。</p>
    */
    @SerializedName("DataOption")
    @Expose
    private KeyValuePairOption [] DataOption;

    /**
     * Get <p>投递到kafka的数据类型，如Avro,Json,canal-pb,canal-json,debezium</p> 
     * @return DataType <p>投递到kafka的数据类型，如Avro,Json,canal-pb,canal-json,debezium</p>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set <p>投递到kafka的数据类型，如Avro,Json,canal-pb,canal-json,debezium</p>
     * @param DataType <p>投递到kafka的数据类型，如Avro,Json,canal-pb,canal-json,debezium</p>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get <p>同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)</p> 
     * @return TopicType <p>同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)</p>
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set <p>同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)</p>
     * @param TopicType <p>同步topic策略，如Single（集中投递到单topic）,Multi (自定义topic名称)</p>
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get <p>用于存储ddl的topic</p> 
     * @return DDLTopicName <p>用于存储ddl的topic</p>
     */
    public String getDDLTopicName() {
        return this.DDLTopicName;
    }

    /**
     * Set <p>用于存储ddl的topic</p>
     * @param DDLTopicName <p>用于存储ddl的topic</p>
     */
    public void setDDLTopicName(String DDLTopicName) {
        this.DDLTopicName = DDLTopicName;
    }

    /**
     * Get <p>单topic和自定义topic的描述</p> 
     * @return TopicRules <p>单topic和自定义topic的描述</p>
     */
    public TopicRule [] getTopicRules() {
        return this.TopicRules;
    }

    /**
     * Set <p>单topic和自定义topic的描述</p>
     * @param TopicRules <p>单topic和自定义topic的描述</p>
     */
    public void setTopicRules(TopicRule [] TopicRules) {
        this.TopicRules = TopicRules;
    }

    /**
     * Get <p>其他附加信息，对于特定数据类型可设置额外参数。比如针对Canal兼容的功能支持：&quot;canalOfficialFormat&quot;:&quot;on&quot;表示打开Canal兼容功能，默认不带。针对大消息跳过的功能支持：&quot;skipLargeMessage&quot;:&quot;on&quot;表示开启跳过大消息，默认不带；开启时需同时设置&quot;maxMessageSizeMB&quot;为1~100的正整数字符串，表示最大消息大小阈值（MB），超过该大小的消息将被跳过，默认不带。</p> 
     * @return DataOption <p>其他附加信息，对于特定数据类型可设置额外参数。比如针对Canal兼容的功能支持：&quot;canalOfficialFormat&quot;:&quot;on&quot;表示打开Canal兼容功能，默认不带。针对大消息跳过的功能支持：&quot;skipLargeMessage&quot;:&quot;on&quot;表示开启跳过大消息，默认不带；开启时需同时设置&quot;maxMessageSizeMB&quot;为1~100的正整数字符串，表示最大消息大小阈值（MB），超过该大小的消息将被跳过，默认不带。</p>
     */
    public KeyValuePairOption [] getDataOption() {
        return this.DataOption;
    }

    /**
     * Set <p>其他附加信息，对于特定数据类型可设置额外参数。比如针对Canal兼容的功能支持：&quot;canalOfficialFormat&quot;:&quot;on&quot;表示打开Canal兼容功能，默认不带。针对大消息跳过的功能支持：&quot;skipLargeMessage&quot;:&quot;on&quot;表示开启跳过大消息，默认不带；开启时需同时设置&quot;maxMessageSizeMB&quot;为1~100的正整数字符串，表示最大消息大小阈值（MB），超过该大小的消息将被跳过，默认不带。</p>
     * @param DataOption <p>其他附加信息，对于特定数据类型可设置额外参数。比如针对Canal兼容的功能支持：&quot;canalOfficialFormat&quot;:&quot;on&quot;表示打开Canal兼容功能，默认不带。针对大消息跳过的功能支持：&quot;skipLargeMessage&quot;:&quot;on&quot;表示开启跳过大消息，默认不带；开启时需同时设置&quot;maxMessageSizeMB&quot;为1~100的正整数字符串，表示最大消息大小阈值（MB），超过该大小的消息将被跳过，默认不带。</p>
     */
    public void setDataOption(KeyValuePairOption [] DataOption) {
        this.DataOption = DataOption;
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
        if (source.DataOption != null) {
            this.DataOption = new KeyValuePairOption[source.DataOption.length];
            for (int i = 0; i < source.DataOption.length; i++) {
                this.DataOption[i] = new KeyValuePairOption(source.DataOption[i]);
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
        this.setParamArrayObj(map, prefix + "DataOption.", this.DataOption);

    }
}

