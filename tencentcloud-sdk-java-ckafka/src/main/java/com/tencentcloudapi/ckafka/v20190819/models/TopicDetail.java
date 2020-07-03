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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicDetail extends AbstractModel{

    /**
    * 主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 分区数
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 副本数
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 是否开启ip鉴权白名单，true表示开启，false表示不开启
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Boolean EnableWhiteList;

    /**
    * ip白名单中ip个数
    */
    @SerializedName("IpWhiteListCount")
    @Expose
    private Long IpWhiteListCount;

    /**
    * 数据备份cos bucket: 转存到cos 的bucket地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForwardCosBucket")
    @Expose
    private String ForwardCosBucket;

    /**
    * 数据备份cos 状态： 1 不开启数据备份，0 开启数据备份
    */
    @SerializedName("ForwardStatus")
    @Expose
    private Long ForwardStatus;

    /**
    * 数据备份到cos的周期频率
    */
    @SerializedName("ForwardInterval")
    @Expose
    private Long ForwardInterval;

    /**
    * 高级配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private Config Config;

    /**
     * Get 主题名称 
     * @return TopicName 主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称
     * @param TopicName 主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题ID 
     * @return TopicId 主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题ID
     * @param TopicId 主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 分区数 
     * @return PartitionNum 分区数
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 分区数
     * @param PartitionNum 分区数
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get 副本数 
     * @return ReplicaNum 副本数
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 副本数
     * @param ReplicaNum 副本数
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Note 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Note 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否开启ip鉴权白名单，true表示开启，false表示不开启 
     * @return EnableWhiteList 是否开启ip鉴权白名单，true表示开启，false表示不开启
     */
    public Boolean getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set 是否开启ip鉴权白名单，true表示开启，false表示不开启
     * @param EnableWhiteList 是否开启ip鉴权白名单，true表示开启，false表示不开启
     */
    public void setEnableWhiteList(Boolean EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get ip白名单中ip个数 
     * @return IpWhiteListCount ip白名单中ip个数
     */
    public Long getIpWhiteListCount() {
        return this.IpWhiteListCount;
    }

    /**
     * Set ip白名单中ip个数
     * @param IpWhiteListCount ip白名单中ip个数
     */
    public void setIpWhiteListCount(Long IpWhiteListCount) {
        this.IpWhiteListCount = IpWhiteListCount;
    }

    /**
     * Get 数据备份cos bucket: 转存到cos 的bucket地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForwardCosBucket 数据备份cos bucket: 转存到cos 的bucket地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForwardCosBucket() {
        return this.ForwardCosBucket;
    }

    /**
     * Set 数据备份cos bucket: 转存到cos 的bucket地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForwardCosBucket 数据备份cos bucket: 转存到cos 的bucket地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForwardCosBucket(String ForwardCosBucket) {
        this.ForwardCosBucket = ForwardCosBucket;
    }

    /**
     * Get 数据备份cos 状态： 1 不开启数据备份，0 开启数据备份 
     * @return ForwardStatus 数据备份cos 状态： 1 不开启数据备份，0 开启数据备份
     */
    public Long getForwardStatus() {
        return this.ForwardStatus;
    }

    /**
     * Set 数据备份cos 状态： 1 不开启数据备份，0 开启数据备份
     * @param ForwardStatus 数据备份cos 状态： 1 不开启数据备份，0 开启数据备份
     */
    public void setForwardStatus(Long ForwardStatus) {
        this.ForwardStatus = ForwardStatus;
    }

    /**
     * Get 数据备份到cos的周期频率 
     * @return ForwardInterval 数据备份到cos的周期频率
     */
    public Long getForwardInterval() {
        return this.ForwardInterval;
    }

    /**
     * Set 数据备份到cos的周期频率
     * @param ForwardInterval 数据备份到cos的周期频率
     */
    public void setForwardInterval(Long ForwardInterval) {
        this.ForwardInterval = ForwardInterval;
    }

    /**
     * Get 高级配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 高级配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Config getConfig() {
        return this.Config;
    }

    /**
     * Set 高级配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 高级配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(Config Config) {
        this.Config = Config;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamSimple(map, prefix + "IpWhiteListCount", this.IpWhiteListCount);
        this.setParamSimple(map, prefix + "ForwardCosBucket", this.ForwardCosBucket);
        this.setParamSimple(map, prefix + "ForwardStatus", this.ForwardStatus);
        this.setParamSimple(map, prefix + "ForwardInterval", this.ForwardInterval);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

