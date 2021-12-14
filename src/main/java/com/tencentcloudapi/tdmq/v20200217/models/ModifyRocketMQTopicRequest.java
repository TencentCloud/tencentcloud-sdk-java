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

public class ModifyRocketMQTopicRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 说明信息，最大128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 分区数，全局类型无效，不可小于当前分区数
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

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
     * Get 命名空间名称 
     * @return NamespaceId 命名空间名称
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceId 命名空间名称
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 说明信息，最大128个字符 
     * @return Remark 说明信息，最大128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息，最大128个字符
     * @param Remark 说明信息，最大128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 分区数，全局类型无效，不可小于当前分区数 
     * @return PartitionNum 分区数，全局类型无效，不可小于当前分区数
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 分区数，全局类型无效，不可小于当前分区数
     * @param PartitionNum 分区数，全局类型无效，不可小于当前分区数
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    public ModifyRocketMQTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQTopicRequest(ModifyRocketMQTopicRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);

    }
}

