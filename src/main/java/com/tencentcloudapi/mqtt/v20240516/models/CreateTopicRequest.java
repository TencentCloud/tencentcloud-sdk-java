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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel {

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主题，不能为空，只能包含字母、数字、“-”及“_”，3-100 字符。</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>备注，最长 128 字符</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主题，不能为空，只能包含字母、数字、“-”及“_”，3-100 字符。</p> 
     * @return Topic <p>主题，不能为空，只能包含字母、数字、“-”及“_”，3-100 字符。</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题，不能为空，只能包含字母、数字、“-”及“_”，3-100 字符。</p>
     * @param Topic <p>主题，不能为空，只能包含字母、数字、“-”及“_”，3-100 字符。</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>备注，最长 128 字符</p> 
     * @return Remark <p>备注，最长 128 字符</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注，最长 128 字符</p>
     * @param Remark <p>备注，最长 128 字符</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

