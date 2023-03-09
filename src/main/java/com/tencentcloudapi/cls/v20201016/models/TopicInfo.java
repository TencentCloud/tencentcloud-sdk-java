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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInfo extends AbstractModel{

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题分区个数
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 是否开启索引
    */
    @SerializedName("Index")
    @Expose
    private Boolean Index;

    /**
    * 云产品标识，日志主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 日主主题是否开启采集
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 日志主题绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 该主题是否开启自动分裂
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * 若开启自动分裂的话，该主题能够允许的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * 日主题的存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAssumerName")
    @Expose
    private String SubAssumerName;

    /**
    * 日志主题描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * 开启日志沉降，热存储的生命周期， hotPeriod < Period。
热存储为 hotPeriod, 冷存储则为 Period-hotPeriod。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志主题名称 
     * @return TopicName 日志主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题名称
     * @param TopicName 日志主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题分区个数 
     * @return PartitionCount 主题分区个数
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 主题分区个数
     * @param PartitionCount 主题分区个数
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 是否开启索引 
     * @return Index 是否开启索引
     */
    public Boolean getIndex() {
        return this.Index;
    }

    /**
     * Set 是否开启索引
     * @param Index 是否开启索引
     */
    public void setIndex(Boolean Index) {
        this.Index = Index;
    }

    /**
     * Get 云产品标识，日志主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssumerName 云产品标识，日志主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set 云产品标识，日志主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssumerName 云产品标识，日志主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 日主主题是否开启采集 
     * @return Status 日主主题是否开启采集
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 日主主题是否开启采集
     * @param Status 日主主题是否开启采集
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 日志主题绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 日志主题绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 日志主题绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 日志主题绑定的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 该主题是否开启自动分裂
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSplit 该主题是否开启自动分裂
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set 该主题是否开启自动分裂
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSplit 该主题是否开启自动分裂
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get 若开启自动分裂的话，该主题能够允许的最大分区数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSplitPartitions 若开启自动分裂的话，该主题能够允许的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set 若开启自动分裂的话，该主题能够允许的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSplitPartitions 若开启自动分裂的话，该主题能够允许的最大分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get 日主题的存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 日主题的存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 日主题的存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 日主题的存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAssumerName 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAssumerName() {
        return this.SubAssumerName;
    }

    /**
     * Set 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAssumerName 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAssumerName(String SubAssumerName) {
        this.SubAssumerName = SubAssumerName;
    }

    /**
     * Get 日志主题描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describes 日志主题描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set 日志主题描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describes 日志主题描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get 开启日志沉降，热存储的生命周期， hotPeriod < Period。
热存储为 hotPeriod, 冷存储则为 Period-hotPeriod。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HotPeriod 开启日志沉降，热存储的生命周期， hotPeriod < Period。
热存储为 hotPeriod, 冷存储则为 Period-hotPeriod。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set 开启日志沉降，热存储的生命周期， hotPeriod < Period。
热存储为 hotPeriod, 冷存储则为 Period-hotPeriod。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HotPeriod 开启日志沉降，热存储的生命周期， hotPeriod < Period。
热存储为 hotPeriod, 冷存储则为 Period-hotPeriod。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    public TopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicInfo(TopicInfo source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.Index != null) {
            this.Index = new Boolean(source.Index);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoSplit != null) {
            this.AutoSplit = new Boolean(source.AutoSplit);
        }
        if (source.MaxSplitPartitions != null) {
            this.MaxSplitPartitions = new Long(source.MaxSplitPartitions);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.SubAssumerName != null) {
            this.SubAssumerName = new String(source.SubAssumerName);
        }
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "SubAssumerName", this.SubAssumerName);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);

    }
}

