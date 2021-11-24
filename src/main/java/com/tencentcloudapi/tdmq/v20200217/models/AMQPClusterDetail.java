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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AMQPClusterDetail extends AbstractModel{

    /**
    * 集群基本信息
    */
    @SerializedName("Info")
    @Expose
    private AMQPClusterInfo Info;

    /**
    * 集群配置信息
    */
    @SerializedName("Config")
    @Expose
    private AMQPClusterConfig Config;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 集群基本信息 
     * @return Info 集群基本信息
     */
    public AMQPClusterInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 集群基本信息
     * @param Info 集群基本信息
     */
    public void setInfo(AMQPClusterInfo Info) {
        this.Info = Info;
    }

    /**
     * Get 集群配置信息 
     * @return Config 集群配置信息
     */
    public AMQPClusterConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 集群配置信息
     * @param Config 集群配置信息
     */
    public void setConfig(AMQPClusterConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public AMQPClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMQPClusterDetail(AMQPClusterDetail source) {
        if (source.Info != null) {
            this.Info = new AMQPClusterInfo(source.Info);
        }
        if (source.Config != null) {
            this.Config = new AMQPClusterConfig(source.Config);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

