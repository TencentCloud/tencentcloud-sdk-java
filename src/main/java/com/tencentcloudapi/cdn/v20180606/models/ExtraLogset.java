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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraLogset extends AbstractModel{

    /**
    * 日志集信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logset")
    @Expose
    private LogSetInfo Logset;

    /**
    * 日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topics")
    @Expose
    private TopicInfo [] Topics;

    /**
     * Get 日志集信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logset 日志集信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogSetInfo getLogset() {
        return this.Logset;
    }

    /**
     * Set 日志集信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logset 日志集信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogset(LogSetInfo Logset) {
        this.Logset = Logset;
    }

    /**
     * Get 日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topics 日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set 日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topics 日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopics(TopicInfo [] Topics) {
        this.Topics = Topics;
    }

    public ExtraLogset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraLogset(ExtraLogset source) {
        if (source.Logset != null) {
            this.Logset = new LogSetInfo(source.Logset);
        }
        if (source.Topics != null) {
            this.Topics = new TopicInfo[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new TopicInfo(source.Topics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Logset.", this.Logset);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);

    }
}

