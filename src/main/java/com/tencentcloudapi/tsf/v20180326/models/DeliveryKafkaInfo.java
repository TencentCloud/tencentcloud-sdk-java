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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliveryKafkaInfo extends AbstractModel{

    /**
    * 投递kafka的topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 采集日志的path
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String [] Path;

    /**
    * default，默认换行符分行
time，按时间分行
custom, 选了custom那么CustomRule就要填入具体的自定义值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineRule")
    @Expose
    private String LineRule;

    /**
    * 自定义的分行值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomRule")
    @Expose
    private String CustomRule;

    /**
     * Get 投递kafka的topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic 投递kafka的topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 投递kafka的topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic 投递kafka的topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 采集日志的path
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 采集日志的path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPath() {
        return this.Path;
    }

    /**
     * Set 采集日志的path
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 采集日志的path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String [] Path) {
        this.Path = Path;
    }

    /**
     * Get default，默认换行符分行
time，按时间分行
custom, 选了custom那么CustomRule就要填入具体的自定义值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineRule default，默认换行符分行
time，按时间分行
custom, 选了custom那么CustomRule就要填入具体的自定义值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLineRule() {
        return this.LineRule;
    }

    /**
     * Set default，默认换行符分行
time，按时间分行
custom, 选了custom那么CustomRule就要填入具体的自定义值
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineRule default，默认换行符分行
time，按时间分行
custom, 选了custom那么CustomRule就要填入具体的自定义值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineRule(String LineRule) {
        this.LineRule = LineRule;
    }

    /**
     * Get 自定义的分行值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomRule 自定义的分行值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 自定义的分行值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomRule 自定义的分行值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomRule(String CustomRule) {
        this.CustomRule = CustomRule;
    }

    public DeliveryKafkaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliveryKafkaInfo(DeliveryKafkaInfo source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Path != null) {
            this.Path = new String[source.Path.length];
            for (int i = 0; i < source.Path.length; i++) {
                this.Path[i] = new String(source.Path[i]);
            }
        }
        if (source.LineRule != null) {
            this.LineRule = new String(source.LineRule);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new String(source.CustomRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamArraySimple(map, prefix + "Path.", this.Path);
        this.setParamSimple(map, prefix + "LineRule", this.LineRule);
        this.setParamSimple(map, prefix + "CustomRule", this.CustomRule);

    }
}

