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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicItem extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 主题类型
NORMAL:普通消息,
FIFO:顺序消息,
DELAY:延时消息,
TRANSACTION:事务消息
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * 队列数量
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 4.x的集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIdV4")
    @Expose
    private String ClusterIdV4;

    /**
    * 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicV4")
    @Expose
    private String TopicV4;

    /**
    * 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * 消息保留时长
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 绑定的标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 主题类型
NORMAL:普通消息,
FIFO:顺序消息,
DELAY:延时消息,
TRANSACTION:事务消息 
     * @return TopicType 主题类型
NORMAL:普通消息,
FIFO:顺序消息,
DELAY:延时消息,
TRANSACTION:事务消息
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 主题类型
NORMAL:普通消息,
FIFO:顺序消息,
DELAY:延时消息,
TRANSACTION:事务消息
     * @param TopicType 主题类型
NORMAL:普通消息,
FIFO:顺序消息,
DELAY:延时消息,
TRANSACTION:事务消息
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 队列数量 
     * @return QueueNum 队列数量
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set 队列数量
     * @param QueueNum 队列数量
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 4.x的集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIdV4 4.x的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterIdV4() {
        return this.ClusterIdV4;
    }

    /**
     * Set 4.x的集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIdV4 4.x的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIdV4(String ClusterIdV4) {
        this.ClusterIdV4 = ClusterIdV4;
    }

    /**
     * Get 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceV4 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceV4 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicV4 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicV4() {
        return this.TopicV4;
    }

    /**
     * Set 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicV4 4.x的主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicV4(String TopicV4) {
        this.TopicV4 = TopicV4;
    }

    /**
     * Get 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullNamespaceV4 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullNamespaceV4 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get 消息保留时长 
     * @return MsgTTL 消息保留时长
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 消息保留时长
     * @param MsgTTL 消息保留时长
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 绑定的标签列表 
     * @return TagList 绑定的标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 绑定的标签列表
     * @param TagList 绑定的标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public TopicItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicItem(TopicItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.QueueNum != null) {
            this.QueueNum = new Long(source.QueueNum);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterIdV4 != null) {
            this.ClusterIdV4 = new String(source.ClusterIdV4);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.TopicV4 != null) {
            this.TopicV4 = new String(source.TopicV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterIdV4", this.ClusterIdV4);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "TopicV4", this.TopicV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

