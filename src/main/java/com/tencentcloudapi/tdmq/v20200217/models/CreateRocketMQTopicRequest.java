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

public class CreateRocketMQTopicRequest extends AbstractModel{

    /**
    * 主题名称，3-64个字符，只能包含字母、数字、“-”及“_”
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 主题所在的命名空间，目前支持在单个命名空间下创建主题
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * 主题类型，可选值为Normal, GlobalOrder, PartitionedOrder
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 主题说明，最大128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 分区数，全局顺序无效
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
     * Get 主题名称，3-64个字符，只能包含字母、数字、“-”及“_” 
     * @return Topic 主题名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称，3-64个字符，只能包含字母、数字、“-”及“_”
     * @param Topic 主题名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 主题所在的命名空间，目前支持在单个命名空间下创建主题 
     * @return Namespaces 主题所在的命名空间，目前支持在单个命名空间下创建主题
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set 主题所在的命名空间，目前支持在单个命名空间下创建主题
     * @param Namespaces 主题所在的命名空间，目前支持在单个命名空间下创建主题
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get 主题类型，可选值为Normal, GlobalOrder, PartitionedOrder 
     * @return Type 主题类型，可选值为Normal, GlobalOrder, PartitionedOrder
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 主题类型，可选值为Normal, GlobalOrder, PartitionedOrder
     * @param Type 主题类型，可选值为Normal, GlobalOrder, PartitionedOrder
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 主题说明，最大128个字符 
     * @return Remark 主题说明，最大128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 主题说明，最大128个字符
     * @param Remark 主题说明，最大128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 分区数，全局顺序无效 
     * @return PartitionNum 分区数，全局顺序无效
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 分区数，全局顺序无效
     * @param PartitionNum 分区数，全局顺序无效
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    public CreateRocketMQTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQTopicRequest(CreateRocketMQTopicRequest source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);

    }
}

