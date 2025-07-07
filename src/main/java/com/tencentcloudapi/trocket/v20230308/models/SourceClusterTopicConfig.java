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

public class SourceClusterTopicConfig extends AbstractModel {

    /**
    * 主题名称，可在[DescribeMigratingTopicList](https://cloud.tencent.com/document/api/1493/118007)接口返回的[MigratingTopic](https://cloud.tencent.com/document/api/1493/96031#MigratingTopic)数据结构中获得。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题类型，
5.x版本
UNSPECIFIED 未指定
NORMAL 普通消息
FIFO 顺序消息
DELAY 延迟消息
TRANSACTION 事务消息

4.x版本
Normal 普通消息
PartitionedOrder 分区顺序消息
Transaction 事务消息
DelayScheduled 延时消息

    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * 队列数
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
    * 是否已导入，作为入参时无效
    */
    @SerializedName("Imported")
    @Expose
    private Boolean Imported;

    /**
    * 命名空间，仅4.x集群有效
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 导入状态，
Unknown 未知，
AlreadyExists 已存在，
Success 成功，
Failure 失败

仅作为出参可用
    */
    @SerializedName("ImportStatus")
    @Expose
    private String ImportStatus;

    /**
    * 4.x的命名空间，出参使用
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * 4.x的主题名，出参使用
    */
    @SerializedName("TopicNameV4")
    @Expose
    private String TopicNameV4;

    /**
    * 4.x的完整命名空间，出参使用
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
     * Get 主题名称，可在[DescribeMigratingTopicList](https://cloud.tencent.com/document/api/1493/118007)接口返回的[MigratingTopic](https://cloud.tencent.com/document/api/1493/96031#MigratingTopic)数据结构中获得。 
     * @return TopicName 主题名称，可在[DescribeMigratingTopicList](https://cloud.tencent.com/document/api/1493/118007)接口返回的[MigratingTopic](https://cloud.tencent.com/document/api/1493/96031#MigratingTopic)数据结构中获得。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称，可在[DescribeMigratingTopicList](https://cloud.tencent.com/document/api/1493/118007)接口返回的[MigratingTopic](https://cloud.tencent.com/document/api/1493/96031#MigratingTopic)数据结构中获得。
     * @param TopicName 主题名称，可在[DescribeMigratingTopicList](https://cloud.tencent.com/document/api/1493/118007)接口返回的[MigratingTopic](https://cloud.tencent.com/document/api/1493/96031#MigratingTopic)数据结构中获得。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题类型，
5.x版本
UNSPECIFIED 未指定
NORMAL 普通消息
FIFO 顺序消息
DELAY 延迟消息
TRANSACTION 事务消息

4.x版本
Normal 普通消息
PartitionedOrder 分区顺序消息
Transaction 事务消息
DelayScheduled 延时消息
 
     * @return TopicType 主题类型，
5.x版本
UNSPECIFIED 未指定
NORMAL 普通消息
FIFO 顺序消息
DELAY 延迟消息
TRANSACTION 事务消息

4.x版本
Normal 普通消息
PartitionedOrder 分区顺序消息
Transaction 事务消息
DelayScheduled 延时消息

     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 主题类型，
5.x版本
UNSPECIFIED 未指定
NORMAL 普通消息
FIFO 顺序消息
DELAY 延迟消息
TRANSACTION 事务消息

4.x版本
Normal 普通消息
PartitionedOrder 分区顺序消息
Transaction 事务消息
DelayScheduled 延时消息

     * @param TopicType 主题类型，
5.x版本
UNSPECIFIED 未指定
NORMAL 普通消息
FIFO 顺序消息
DELAY 延迟消息
TRANSACTION 事务消息

4.x版本
Normal 普通消息
PartitionedOrder 分区顺序消息
Transaction 事务消息
DelayScheduled 延时消息

     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 队列数 
     * @return QueueNum 队列数
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set 队列数
     * @param QueueNum 队列数
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
     * Get 是否已导入，作为入参时无效 
     * @return Imported 是否已导入，作为入参时无效
     */
    public Boolean getImported() {
        return this.Imported;
    }

    /**
     * Set 是否已导入，作为入参时无效
     * @param Imported 是否已导入，作为入参时无效
     */
    public void setImported(Boolean Imported) {
        this.Imported = Imported;
    }

    /**
     * Get 命名空间，仅4.x集群有效 
     * @return Namespace 命名空间，仅4.x集群有效
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，仅4.x集群有效
     * @param Namespace 命名空间，仅4.x集群有效
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 导入状态，
Unknown 未知，
AlreadyExists 已存在，
Success 成功，
Failure 失败

仅作为出参可用 
     * @return ImportStatus 导入状态，
Unknown 未知，
AlreadyExists 已存在，
Success 成功，
Failure 失败

仅作为出参可用
     */
    public String getImportStatus() {
        return this.ImportStatus;
    }

    /**
     * Set 导入状态，
Unknown 未知，
AlreadyExists 已存在，
Success 成功，
Failure 失败

仅作为出参可用
     * @param ImportStatus 导入状态，
Unknown 未知，
AlreadyExists 已存在，
Success 成功，
Failure 失败

仅作为出参可用
     */
    public void setImportStatus(String ImportStatus) {
        this.ImportStatus = ImportStatus;
    }

    /**
     * Get 4.x的命名空间，出参使用 
     * @return NamespaceV4 4.x的命名空间，出参使用
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set 4.x的命名空间，出参使用
     * @param NamespaceV4 4.x的命名空间，出参使用
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get 4.x的主题名，出参使用 
     * @return TopicNameV4 4.x的主题名，出参使用
     */
    public String getTopicNameV4() {
        return this.TopicNameV4;
    }

    /**
     * Set 4.x的主题名，出参使用
     * @param TopicNameV4 4.x的主题名，出参使用
     */
    public void setTopicNameV4(String TopicNameV4) {
        this.TopicNameV4 = TopicNameV4;
    }

    /**
     * Get 4.x的完整命名空间，出参使用 
     * @return FullNamespaceV4 4.x的完整命名空间，出参使用
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set 4.x的完整命名空间，出参使用
     * @param FullNamespaceV4 4.x的完整命名空间，出参使用
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    public SourceClusterTopicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceClusterTopicConfig(SourceClusterTopicConfig source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
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
        if (source.Imported != null) {
            this.Imported = new Boolean(source.Imported);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ImportStatus != null) {
            this.ImportStatus = new String(source.ImportStatus);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.TopicNameV4 != null) {
            this.TopicNameV4 = new String(source.TopicNameV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Imported", this.Imported);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ImportStatus", this.ImportStatus);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "TopicNameV4", this.TopicNameV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);

    }
}

