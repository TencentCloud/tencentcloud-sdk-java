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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInfo extends AbstractModel {

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 主题名称
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
    * 主题是否开启索引（主题类型需为日志主题）
    */
    @SerializedName("Index")
    @Expose
    private Boolean Index;

    /**
    * 云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
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
    * 主题是否开启采集，true：开启采集；false：关闭采集。
创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。
控制台目前不支持修改此参数。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 主题绑定的标签信息
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 该主题是否开启自动分裂
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * 若开启自动分裂的话，该主题能够允许的最大分区数
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * 主题的存储类型

- hot: 标准存储
- cold: 低频存储
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
    */
    @SerializedName("SubAssumerName")
    @Expose
    private String SubAssumerName;

    /**
    * 主题描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * 开启日志沉降，标准存储的生命周期， hotPeriod < Period。
标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）
HotPeriod=0为没有开启日志沉降。
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * 主题类型。
- 0: 日志主题 
- 1: 指标主题
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * 日志主题扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

    /**
    * 异步迁移任务ID
    */
    @SerializedName("TopicAsyncTaskID")
    @Expose
    private String TopicAsyncTaskID;

    /**
    * 异步迁移状态
    */
    @SerializedName("MigrationStatus")
    @Expose
    private Long MigrationStatus;

    /**
    * 异步迁移完成后，预计生效日期
    */
    @SerializedName("EffectiveDate")
    @Expose
    private String EffectiveDate;

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
     * Get 主题是否开启索引（主题类型需为日志主题） 
     * @return Index 主题是否开启索引（主题类型需为日志主题）
     */
    public Boolean getIndex() {
        return this.Index;
    }

    /**
     * Set 主题是否开启索引（主题类型需为日志主题）
     * @param Index 主题是否开启索引（主题类型需为日志主题）
     */
    public void setIndex(Boolean Index) {
        this.Index = Index;
    }

    /**
     * Get 云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE 
     * @return AssumerName 云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set 云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
     * @param AssumerName 云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE
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
     * Get 主题是否开启采集，true：开启采集；false：关闭采集。
创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。
控制台目前不支持修改此参数。 
     * @return Status 主题是否开启采集，true：开启采集；false：关闭采集。
创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。
控制台目前不支持修改此参数。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 主题是否开启采集，true：开启采集；false：关闭采集。
创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。
控制台目前不支持修改此参数。
     * @param Status 主题是否开启采集，true：开启采集；false：关闭采集。
创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。
控制台目前不支持修改此参数。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 主题绑定的标签信息 
     * @return Tags 主题绑定的标签信息
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 主题绑定的标签信息
     * @param Tags 主题绑定的标签信息
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 该主题是否开启自动分裂 
     * @return AutoSplit 该主题是否开启自动分裂
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set 该主题是否开启自动分裂
     * @param AutoSplit 该主题是否开启自动分裂
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get 若开启自动分裂的话，该主题能够允许的最大分区数 
     * @return MaxSplitPartitions 若开启自动分裂的话，该主题能够允许的最大分区数
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set 若开启自动分裂的话，该主题能够允许的最大分区数
     * @param MaxSplitPartitions 若开启自动分裂的话，该主题能够允许的最大分区数
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get 主题的存储类型

- hot: 标准存储
- cold: 低频存储 
     * @return StorageType 主题的存储类型

- hot: 标准存储
- cold: 低频存储
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 主题的存储类型

- hot: 标准存储
- cold: 低频存储
     * @param StorageType 主题的存储类型

- hot: 标准存储
- cold: 低频存储
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存 
     * @return Period 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
     * @param Period 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。 
     * @return SubAssumerName 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
     */
    public String getSubAssumerName() {
        return this.SubAssumerName;
    }

    /**
     * Set 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
     * @param SubAssumerName 云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。
     */
    public void setSubAssumerName(String SubAssumerName) {
        this.SubAssumerName = SubAssumerName;
    }

    /**
     * Get 主题描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describes 主题描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set 主题描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describes 主题描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get 开启日志沉降，标准存储的生命周期， hotPeriod < Period。
标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）
HotPeriod=0为没有开启日志沉降。 
     * @return HotPeriod 开启日志沉降，标准存储的生命周期， hotPeriod < Period。
标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）
HotPeriod=0为没有开启日志沉降。
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set 开启日志沉降，标准存储的生命周期， hotPeriod < Period。
标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）
HotPeriod=0为没有开启日志沉降。
     * @param HotPeriod 开启日志沉降，标准存储的生命周期， hotPeriod < Period。
标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）
HotPeriod=0为没有开启日志沉降。
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get 主题类型。
- 0: 日志主题 
- 1: 指标主题 
     * @return BizType 主题类型。
- 0: 日志主题 
- 1: 指标主题
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 主题类型。
- 0: 日志主题 
- 1: 指标主题
     * @param BizType 主题类型。
- 0: 日志主题 
- 1: 指标主题
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。 
     * @return IsWebTracking 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
     * @param IsWebTracking 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get 日志主题扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extends 日志主题扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set 日志主题扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extends 日志主题扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
    }

    /**
     * Get 异步迁移任务ID 
     * @return TopicAsyncTaskID 异步迁移任务ID
     */
    public String getTopicAsyncTaskID() {
        return this.TopicAsyncTaskID;
    }

    /**
     * Set 异步迁移任务ID
     * @param TopicAsyncTaskID 异步迁移任务ID
     */
    public void setTopicAsyncTaskID(String TopicAsyncTaskID) {
        this.TopicAsyncTaskID = TopicAsyncTaskID;
    }

    /**
     * Get 异步迁移状态 
     * @return MigrationStatus 异步迁移状态
     */
    public Long getMigrationStatus() {
        return this.MigrationStatus;
    }

    /**
     * Set 异步迁移状态
     * @param MigrationStatus 异步迁移状态
     */
    public void setMigrationStatus(Long MigrationStatus) {
        this.MigrationStatus = MigrationStatus;
    }

    /**
     * Get 异步迁移完成后，预计生效日期 
     * @return EffectiveDate 异步迁移完成后，预计生效日期
     */
    public String getEffectiveDate() {
        return this.EffectiveDate;
    }

    /**
     * Set 异步迁移完成后，预计生效日期
     * @param EffectiveDate 异步迁移完成后，预计生效日期
     */
    public void setEffectiveDate(String EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
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
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
        }
        if (source.TopicAsyncTaskID != null) {
            this.TopicAsyncTaskID = new String(source.TopicAsyncTaskID);
        }
        if (source.MigrationStatus != null) {
            this.MigrationStatus = new Long(source.MigrationStatus);
        }
        if (source.EffectiveDate != null) {
            this.EffectiveDate = new String(source.EffectiveDate);
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "TopicAsyncTaskID", this.TopicAsyncTaskID);
        this.setParamSimple(map, prefix + "MigrationStatus", this.MigrationStatus);
        this.setParamSimple(map, prefix + "EffectiveDate", this.EffectiveDate);

    }
}

