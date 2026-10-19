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
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主题名称</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>主题类型<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * <p>队列数量</p>
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>4.x的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIdV4")
    @Expose
    private String ClusterIdV4;

    /**
    * <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * <p>4.x的主题名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicV4")
    @Expose
    private String TopicV4;

    /**
    * <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * <p>消息保留时长</p>
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * <p>绑定的标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>LITE 类型 Topic 专用：是否开启自动过期删除</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoExpireDelete")
    @Expose
    private Boolean AutoExpireDelete;

    /**
    * <p>LITE 类型 Topic 专用：自动过期时间</p><p>单位：分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoExpireTime")
    @Expose
    private Long AutoExpireTime;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主题名称</p> 
     * @return Topic <p>主题名称</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题名称</p>
     * @param Topic <p>主题名称</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>主题类型<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p> 
     * @return TopicType <p>主题类型<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set <p>主题类型<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
     * @param TopicType <p>主题类型<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get <p>队列数量</p> 
     * @return QueueNum <p>队列数量</p>
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set <p>队列数量</p>
     * @param QueueNum <p>队列数量</p>
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remark <p>备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remark <p>备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>4.x的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIdV4 <p>4.x的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterIdV4() {
        return this.ClusterIdV4;
    }

    /**
     * Set <p>4.x的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIdV4 <p>4.x的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIdV4(String ClusterIdV4) {
        this.ClusterIdV4 = ClusterIdV4;
    }

    /**
     * Get <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceV4 <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceV4 <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get <p>4.x的主题名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicV4 <p>4.x的主题名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicV4() {
        return this.TopicV4;
    }

    /**
     * Set <p>4.x的主题名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicV4 <p>4.x的主题名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicV4(String TopicV4) {
        this.TopicV4 = TopicV4;
    }

    /**
     * Get <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullNamespaceV4 <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullNamespaceV4 <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get <p>消息保留时长</p> 
     * @return MsgTTL <p>消息保留时长</p>
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set <p>消息保留时长</p>
     * @param MsgTTL <p>消息保留时长</p>
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get <p>绑定的标签列表</p> 
     * @return TagList <p>绑定的标签列表</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>绑定的标签列表</p>
     * @param TagList <p>绑定的标签列表</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>LITE 类型 Topic 专用：是否开启自动过期删除</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoExpireDelete <p>LITE 类型 Topic 专用：是否开启自动过期删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoExpireDelete() {
        return this.AutoExpireDelete;
    }

    /**
     * Set <p>LITE 类型 Topic 专用：是否开启自动过期删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoExpireDelete <p>LITE 类型 Topic 专用：是否开启自动过期删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoExpireDelete(Boolean AutoExpireDelete) {
        this.AutoExpireDelete = AutoExpireDelete;
    }

    /**
     * Get <p>LITE 类型 Topic 专用：自动过期时间</p><p>单位：分钟</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoExpireTime <p>LITE 类型 Topic 专用：自动过期时间</p><p>单位：分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoExpireTime() {
        return this.AutoExpireTime;
    }

    /**
     * Set <p>LITE 类型 Topic 专用：自动过期时间</p><p>单位：分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoExpireTime <p>LITE 类型 Topic 专用：自动过期时间</p><p>单位：分钟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoExpireTime(Long AutoExpireTime) {
        this.AutoExpireTime = AutoExpireTime;
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
        if (source.AutoExpireDelete != null) {
            this.AutoExpireDelete = new Boolean(source.AutoExpireDelete);
        }
        if (source.AutoExpireTime != null) {
            this.AutoExpireTime = new Long(source.AutoExpireTime);
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
        this.setParamSimple(map, prefix + "AutoExpireDelete", this.AutoExpireDelete);
        this.setParamSimple(map, prefix + "AutoExpireTime", this.AutoExpireTime);

    }
}

