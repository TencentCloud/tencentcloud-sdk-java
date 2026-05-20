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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInfo extends AbstractModel {

    /**
    * <p>日志集ID</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>主题名称</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>主题分区个数</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>主题是否开启索引（主题类型需为日志主题）</p>
    */
    @SerializedName("Index")
    @Expose
    private Boolean Index;

    /**
    * <p>AssumerUin非空则表示创建该日志主题的服务方Uin</p>
    */
    @SerializedName("AssumerUin")
    @Expose
    private Long AssumerUin;

    /**
    * <p>云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE</p>
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * <p>创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。<br>控制台目前不支持修改此参数。</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>主题绑定的标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>RoleName非空则表示创建该日志主题的服务方使用的角色</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>该主题是否开启自动分裂</p>
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * <p>若开启自动分裂的话，该主题能够允许的最大分区数</p>
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * <p>主题的存储类型</p><ul><li>hot: 标准存储</li><li>cold: 低频存储</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。</p>
    */
    @SerializedName("SubAssumerName")
    @Expose
    private String SubAssumerName;

    /**
    * <p>主题描述</p>
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * <p>开启日志沉降，标准存储的生命周期， hotPeriod &lt; Period。<br>标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）<br>HotPeriod=0为没有开启日志沉降。</p>
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * <p>kms-cls服务秘钥id</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>主题类型。</p><ul><li>0: 日志主题 </li><li>1: 指标主题</li></ul>
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * <p>免鉴权开关。 false：关闭； true：开启。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。</p>
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * <p>日志主题扩展信息</p>
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

    /**
    * <p>异步迁移任务ID</p>
    */
    @SerializedName("TopicAsyncTaskID")
    @Expose
    private String TopicAsyncTaskID;

    /**
    * <p>异步迁移状态</p><ul><li>1：进行中</li><li>2：已完成</li><li>3：失败</li><li>4：已取消</li></ul>
    */
    @SerializedName("MigrationStatus")
    @Expose
    private Long MigrationStatus;

    /**
    * <p>异步迁移完成后，预计生效日期<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("EffectiveDate")
    @Expose
    private String EffectiveDate;

    /**
    * <p>IsSourceFrom 开启记录公网来源ip和服务端接收时间</p>
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
    * <p>当前计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>如果有异步任务，任务成功后的新计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
    */
    @SerializedName("NewBillingMode")
    @Expose
    private Long NewBillingMode;

    /**
     * Get <p>日志集ID</p> 
     * @return LogsetId <p>日志集ID</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集ID</p>
     * @param LogsetId <p>日志集ID</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>主题ID</p> 
     * @return TopicId <p>主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>主题ID</p>
     * @param TopicId <p>主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>主题名称</p> 
     * @return TopicName <p>主题名称</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>主题名称</p>
     * @param TopicName <p>主题名称</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>主题分区个数</p> 
     * @return PartitionCount <p>主题分区个数</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>主题分区个数</p>
     * @param PartitionCount <p>主题分区个数</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>主题是否开启索引（主题类型需为日志主题）</p> 
     * @return Index <p>主题是否开启索引（主题类型需为日志主题）</p>
     */
    public Boolean getIndex() {
        return this.Index;
    }

    /**
     * Set <p>主题是否开启索引（主题类型需为日志主题）</p>
     * @param Index <p>主题是否开启索引（主题类型需为日志主题）</p>
     */
    public void setIndex(Boolean Index) {
        this.Index = Index;
    }

    /**
     * Get <p>AssumerUin非空则表示创建该日志主题的服务方Uin</p> 
     * @return AssumerUin <p>AssumerUin非空则表示创建该日志主题的服务方Uin</p>
     */
    public Long getAssumerUin() {
        return this.AssumerUin;
    }

    /**
     * Set <p>AssumerUin非空则表示创建该日志主题的服务方Uin</p>
     * @param AssumerUin <p>AssumerUin非空则表示创建该日志主题的服务方Uin</p>
     */
    public void setAssumerUin(Long AssumerUin) {
        this.AssumerUin = AssumerUin;
    }

    /**
     * Get <p>云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE</p> 
     * @return AssumerName <p>云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE</p>
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set <p>云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE</p>
     * @param AssumerName <p>云产品标识，主题由其它云产品创建时，该字段会显示云产品名称，例如CDN、TKE</p>
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get <p>创建时间。格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>创建时间。格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。<br>控制台目前不支持修改此参数。</p> 
     * @return Status <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。<br>控制台目前不支持修改此参数。</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。<br>控制台目前不支持修改此参数。</p>
     * @param Status <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>创建日志主题时默认开启，可通过SDK调用ModifyTopic修改此字段。<br>控制台目前不支持修改此参数。</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>主题绑定的标签信息</p> 
     * @return Tags <p>主题绑定的标签信息</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>主题绑定的标签信息</p>
     * @param Tags <p>主题绑定的标签信息</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>RoleName非空则表示创建该日志主题的服务方使用的角色</p> 
     * @return RoleName <p>RoleName非空则表示创建该日志主题的服务方使用的角色</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>RoleName非空则表示创建该日志主题的服务方使用的角色</p>
     * @param RoleName <p>RoleName非空则表示创建该日志主题的服务方使用的角色</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>该主题是否开启自动分裂</p> 
     * @return AutoSplit <p>该主题是否开启自动分裂</p>
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set <p>该主题是否开启自动分裂</p>
     * @param AutoSplit <p>该主题是否开启自动分裂</p>
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get <p>若开启自动分裂的话，该主题能够允许的最大分区数</p> 
     * @return MaxSplitPartitions <p>若开启自动分裂的话，该主题能够允许的最大分区数</p>
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set <p>若开启自动分裂的话，该主题能够允许的最大分区数</p>
     * @param MaxSplitPartitions <p>若开启自动分裂的话，该主题能够允许的最大分区数</p>
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get <p>主题的存储类型</p><ul><li>hot: 标准存储</li><li>cold: 低频存储</li></ul> 
     * @return StorageType <p>主题的存储类型</p><ul><li>hot: 标准存储</li><li>cold: 低频存储</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>主题的存储类型</p><ul><li>hot: 标准存储</li><li>cold: 低频存储</li></ul>
     * @param StorageType <p>主题的存储类型</p><ul><li>hot: 标准存储</li><li>cold: 低频存储</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存</p> 
     * @return Period <p>生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存</p>
     * @param Period <p>生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。</p> 
     * @return SubAssumerName <p>云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。</p>
     */
    public String getSubAssumerName() {
        return this.SubAssumerName;
    }

    /**
     * Set <p>云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。</p>
     * @param SubAssumerName <p>云产品二级标识，日志主题由其它云产品创建时，该字段会显示云产品名称及其日志类型的二级分类，例如TKE-Audit、TKE-Event。部分云产品仅有云产品标识(AssumerName)，无该字段。</p>
     */
    public void setSubAssumerName(String SubAssumerName) {
        this.SubAssumerName = SubAssumerName;
    }

    /**
     * Get <p>主题描述</p> 
     * @return Describes <p>主题描述</p>
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set <p>主题描述</p>
     * @param Describes <p>主题描述</p>
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get <p>开启日志沉降，标准存储的生命周期， hotPeriod &lt; Period。<br>标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）<br>HotPeriod=0为没有开启日志沉降。</p> 
     * @return HotPeriod <p>开启日志沉降，标准存储的生命周期， hotPeriod &lt; Period。<br>标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）<br>HotPeriod=0为没有开启日志沉降。</p>
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set <p>开启日志沉降，标准存储的生命周期， hotPeriod &lt; Period。<br>标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）<br>HotPeriod=0为没有开启日志沉降。</p>
     * @param HotPeriod <p>开启日志沉降，标准存储的生命周期， hotPeriod &lt; Period。<br>标准存储为 hotPeriod, 低频存储则为 Period-hotPeriod。（主题类型需为日志主题）<br>HotPeriod=0为没有开启日志沉降。</p>
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get <p>kms-cls服务秘钥id</p> 
     * @return KeyId <p>kms-cls服务秘钥id</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>kms-cls服务秘钥id</p>
     * @param KeyId <p>kms-cls服务秘钥id</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>主题类型。</p><ul><li>0: 日志主题 </li><li>1: 指标主题</li></ul> 
     * @return BizType <p>主题类型。</p><ul><li>0: 日志主题 </li><li>1: 指标主题</li></ul>
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>主题类型。</p><ul><li>0: 日志主题 </li><li>1: 指标主题</li></ul>
     * @param BizType <p>主题类型。</p><ul><li>0: 日志主题 </li><li>1: 指标主题</li></ul>
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>免鉴权开关。 false：关闭； true：开启。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。</p> 
     * @return IsWebTracking <p>免鉴权开关。 false：关闭； true：开启。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。</p>
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set <p>免鉴权开关。 false：关闭； true：开启。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。</p>
     * @param IsWebTracking <p>免鉴权开关。 false：关闭； true：开启。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。</p>
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get <p>日志主题扩展信息</p> 
     * @return Extends <p>日志主题扩展信息</p>
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set <p>日志主题扩展信息</p>
     * @param Extends <p>日志主题扩展信息</p>
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
    }

    /**
     * Get <p>异步迁移任务ID</p> 
     * @return TopicAsyncTaskID <p>异步迁移任务ID</p>
     */
    public String getTopicAsyncTaskID() {
        return this.TopicAsyncTaskID;
    }

    /**
     * Set <p>异步迁移任务ID</p>
     * @param TopicAsyncTaskID <p>异步迁移任务ID</p>
     */
    public void setTopicAsyncTaskID(String TopicAsyncTaskID) {
        this.TopicAsyncTaskID = TopicAsyncTaskID;
    }

    /**
     * Get <p>异步迁移状态</p><ul><li>1：进行中</li><li>2：已完成</li><li>3：失败</li><li>4：已取消</li></ul> 
     * @return MigrationStatus <p>异步迁移状态</p><ul><li>1：进行中</li><li>2：已完成</li><li>3：失败</li><li>4：已取消</li></ul>
     */
    public Long getMigrationStatus() {
        return this.MigrationStatus;
    }

    /**
     * Set <p>异步迁移状态</p><ul><li>1：进行中</li><li>2：已完成</li><li>3：失败</li><li>4：已取消</li></ul>
     * @param MigrationStatus <p>异步迁移状态</p><ul><li>1：进行中</li><li>2：已完成</li><li>3：失败</li><li>4：已取消</li></ul>
     */
    public void setMigrationStatus(Long MigrationStatus) {
        this.MigrationStatus = MigrationStatus;
    }

    /**
     * Get <p>异步迁移完成后，预计生效日期<br>时间格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return EffectiveDate <p>异步迁移完成后，预计生效日期<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getEffectiveDate() {
        return this.EffectiveDate;
    }

    /**
     * Set <p>异步迁移完成后，预计生效日期<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     * @param EffectiveDate <p>异步迁移完成后，预计生效日期<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setEffectiveDate(String EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }

    /**
     * Get <p>IsSourceFrom 开启记录公网来源ip和服务端接收时间</p> 
     * @return IsSourceFrom <p>IsSourceFrom 开启记录公网来源ip和服务端接收时间</p>
     */
    public Boolean getIsSourceFrom() {
        return this.IsSourceFrom;
    }

    /**
     * Set <p>IsSourceFrom 开启记录公网来源ip和服务端接收时间</p>
     * @param IsSourceFrom <p>IsSourceFrom 开启记录公网来源ip和服务端接收时间</p>
     */
    public void setIsSourceFrom(Boolean IsSourceFrom) {
        this.IsSourceFrom = IsSourceFrom;
    }

    /**
     * Get <p>当前计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul> 
     * @return BillingMode <p>当前计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>当前计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     * @param BillingMode <p>当前计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>如果有异步任务，任务成功后的新计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul> 
     * @return NewBillingMode <p>如果有异步任务，任务成功后的新计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     */
    public Long getNewBillingMode() {
        return this.NewBillingMode;
    }

    /**
     * Set <p>如果有异步任务，任务成功后的新计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     * @param NewBillingMode <p>如果有异步任务，任务成功后的新计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     */
    public void setNewBillingMode(Long NewBillingMode) {
        this.NewBillingMode = NewBillingMode;
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
        if (source.AssumerUin != null) {
            this.AssumerUin = new Long(source.AssumerUin);
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
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
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
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
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
        if (source.IsSourceFrom != null) {
            this.IsSourceFrom = new Boolean(source.IsSourceFrom);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.NewBillingMode != null) {
            this.NewBillingMode = new Long(source.NewBillingMode);
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
        this.setParamSimple(map, prefix + "AssumerUin", this.AssumerUin);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "SubAssumerName", this.SubAssumerName);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "TopicAsyncTaskID", this.TopicAsyncTaskID);
        this.setParamSimple(map, prefix + "MigrationStatus", this.MigrationStatus);
        this.setParamSimple(map, prefix + "EffectiveDate", this.EffectiveDate);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "NewBillingMode", this.NewBillingMode);

    }
}

