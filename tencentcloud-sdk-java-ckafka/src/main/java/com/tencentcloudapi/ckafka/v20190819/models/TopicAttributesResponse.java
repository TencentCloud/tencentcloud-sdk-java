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

public class TopicAttributesResponse extends AbstractModel{

    /**
    * 主题 ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 主题备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 分区个数
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * IP 白名单开关，1：打开； 0：关闭
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * IP 白名单列表
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * topic 配置数组
    */
    @SerializedName("Config")
    @Expose
    private Config Config;

    /**
    * 分区详情
    */
    @SerializedName("Partitions")
    @Expose
    private TopicPartitionDO [] Partitions;

    /**
     * Get 主题 ID 
     * @return TopicId 主题 ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题 ID
     * @param TopicId 主题 ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
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
     * Get 主题备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Note 主题备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 主题备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Note 主题备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 分区个数 
     * @return PartitionNum 分区个数
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 分区个数
     * @param PartitionNum 分区个数
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get IP 白名单开关，1：打开； 0：关闭 
     * @return EnableWhiteList IP 白名单开关，1：打开； 0：关闭
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set IP 白名单开关，1：打开； 0：关闭
     * @param EnableWhiteList IP 白名单开关，1：打开； 0：关闭
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get IP 白名单列表 
     * @return IpWhiteList IP 白名单列表
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP 白名单列表
     * @param IpWhiteList IP 白名单列表
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get topic 配置数组 
     * @return Config topic 配置数组
     */
    public Config getConfig() {
        return this.Config;
    }

    /**
     * Set topic 配置数组
     * @param Config topic 配置数组
     */
    public void setConfig(Config Config) {
        this.Config = Config;
    }

    /**
     * Get 分区详情 
     * @return Partitions 分区详情
     */
    public TopicPartitionDO [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区详情
     * @param Partitions 分区详情
     */
    public void setPartitions(TopicPartitionDO [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);

    }
}

