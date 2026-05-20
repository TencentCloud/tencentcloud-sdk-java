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

public class ModifyTopicRequest extends AbstractModel {

    /**
    * <p>主题ID- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取主题列表</a>获取主题Id。</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>主题名称<br>输入限制：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，并且不能有重复的键值对。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>控制台目前不支持修改此参数。</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>是否开启自动分裂</p>
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * <p>若开启最大分裂，该主题能够允许的最大分区数；<br>默认为50；必须为正数</p>
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * <p>生命周期，单位天，标准存储取值范围1~3600，低频存储取值范围7~3600。取值为3640时代表永久保存</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>存储类型：cold 低频存储，hot 标准存储</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>主题描述</p>
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * <p>免鉴权开关。 false：关闭； true：开启。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。</p>
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * <p>主题扩展信息</p>
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

    /**
    * <p>主题分区数量。<br>默认为1；<br>取值范围及约束：</p><ul><li>当输入值&lt;=0，系统自动调整为1。</li><li>如果未传MaxSplitPartitions，需要PartitionCount&lt;=50；</li><li>如果传递了MaxSplitPartitions，需要PartitionCount&lt;=MaxSplitPartitions；</li></ul>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>取消切换存储任务的id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取取消切换存储任务的id【Topics中的TopicAsyncTaskID字段】。</li></ul>
    */
    @SerializedName("CancelTopicAsyncTaskID")
    @Expose
    private String CancelTopicAsyncTaskID;

    /**
    * <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>只支持传入1：kms-cls 云产品秘钥加密</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Long Encryption;

    /**
    * <p>开启记录公网来源ip和服务端接收时间</p>
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
    * <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul><p>默认值：0</p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
     * Get <p>主题ID- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取主题列表</a>获取主题Id。</p> 
     * @return TopicId <p>主题ID- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取主题列表</a>获取主题Id。</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>主题ID- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取主题列表</a>获取主题Id。</p>
     * @param TopicId <p>主题ID- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取主题列表</a>获取主题Id。</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>主题名称<br>输入限制：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul> 
     * @return TopicName <p>主题名称<br>输入限制：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>主题名称<br>输入限制：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     * @param TopicName <p>主题名称<br>输入限制：</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，并且不能有重复的键值对。</p> 
     * @return Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，并且不能有重复的键值对。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，并且不能有重复的键值对。</p>
     * @param Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，并且不能有重复的键值对。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>控制台目前不支持修改此参数。</p> 
     * @return Status <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>控制台目前不支持修改此参数。</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>控制台目前不支持修改此参数。</p>
     * @param Status <p>主题是否开启采集，true：开启采集；false：关闭采集。<br>控制台目前不支持修改此参数。</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否开启自动分裂</p> 
     * @return AutoSplit <p>是否开启自动分裂</p>
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set <p>是否开启自动分裂</p>
     * @param AutoSplit <p>是否开启自动分裂</p>
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get <p>若开启最大分裂，该主题能够允许的最大分区数；<br>默认为50；必须为正数</p> 
     * @return MaxSplitPartitions <p>若开启最大分裂，该主题能够允许的最大分区数；<br>默认为50；必须为正数</p>
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set <p>若开启最大分裂，该主题能够允许的最大分区数；<br>默认为50；必须为正数</p>
     * @param MaxSplitPartitions <p>若开启最大分裂，该主题能够允许的最大分区数；<br>默认为50；必须为正数</p>
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get <p>生命周期，单位天，标准存储取值范围1~3600，低频存储取值范围7~3600。取值为3640时代表永久保存</p> 
     * @return Period <p>生命周期，单位天，标准存储取值范围1~3600，低频存储取值范围7~3600。取值为3640时代表永久保存</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>生命周期，单位天，标准存储取值范围1~3600，低频存储取值范围7~3600。取值为3640时代表永久保存</p>
     * @param Period <p>生命周期，单位天，标准存储取值范围1~3600，低频存储取值范围7~3600。取值为3640时代表永久保存</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>存储类型：cold 低频存储，hot 标准存储</p> 
     * @return StorageType <p>存储类型：cold 低频存储，hot 标准存储</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型：cold 低频存储，hot 标准存储</p>
     * @param StorageType <p>存储类型：cold 低频存储，hot 标准存储</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
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
     * Get <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p> 
     * @return HotPeriod <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
     * @param HotPeriod <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
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
     * Get <p>主题扩展信息</p> 
     * @return Extends <p>主题扩展信息</p>
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set <p>主题扩展信息</p>
     * @param Extends <p>主题扩展信息</p>
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
    }

    /**
     * Get <p>主题分区数量。<br>默认为1；<br>取值范围及约束：</p><ul><li>当输入值&lt;=0，系统自动调整为1。</li><li>如果未传MaxSplitPartitions，需要PartitionCount&lt;=50；</li><li>如果传递了MaxSplitPartitions，需要PartitionCount&lt;=MaxSplitPartitions；</li></ul> 
     * @return PartitionCount <p>主题分区数量。<br>默认为1；<br>取值范围及约束：</p><ul><li>当输入值&lt;=0，系统自动调整为1。</li><li>如果未传MaxSplitPartitions，需要PartitionCount&lt;=50；</li><li>如果传递了MaxSplitPartitions，需要PartitionCount&lt;=MaxSplitPartitions；</li></ul>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>主题分区数量。<br>默认为1；<br>取值范围及约束：</p><ul><li>当输入值&lt;=0，系统自动调整为1。</li><li>如果未传MaxSplitPartitions，需要PartitionCount&lt;=50；</li><li>如果传递了MaxSplitPartitions，需要PartitionCount&lt;=MaxSplitPartitions；</li></ul>
     * @param PartitionCount <p>主题分区数量。<br>默认为1；<br>取值范围及约束：</p><ul><li>当输入值&lt;=0，系统自动调整为1。</li><li>如果未传MaxSplitPartitions，需要PartitionCount&lt;=50；</li><li>如果传递了MaxSplitPartitions，需要PartitionCount&lt;=MaxSplitPartitions；</li></ul>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>取消切换存储任务的id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取取消切换存储任务的id【Topics中的TopicAsyncTaskID字段】。</li></ul> 
     * @return CancelTopicAsyncTaskID <p>取消切换存储任务的id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取取消切换存储任务的id【Topics中的TopicAsyncTaskID字段】。</li></ul>
     */
    public String getCancelTopicAsyncTaskID() {
        return this.CancelTopicAsyncTaskID;
    }

    /**
     * Set <p>取消切换存储任务的id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取取消切换存储任务的id【Topics中的TopicAsyncTaskID字段】。</li></ul>
     * @param CancelTopicAsyncTaskID <p>取消切换存储任务的id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取取消切换存储任务的id【Topics中的TopicAsyncTaskID字段】。</li></ul>
     */
    public void setCancelTopicAsyncTaskID(String CancelTopicAsyncTaskID) {
        this.CancelTopicAsyncTaskID = CancelTopicAsyncTaskID;
    }

    /**
     * Get <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>只支持传入1：kms-cls 云产品秘钥加密</p> 
     * @return Encryption <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>只支持传入1：kms-cls 云产品秘钥加密</p>
     */
    public Long getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>只支持传入1：kms-cls 云产品秘钥加密</p>
     * @param Encryption <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>只支持传入1：kms-cls 云产品秘钥加密</p>
     */
    public void setEncryption(Long Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>开启记录公网来源ip和服务端接收时间</p> 
     * @return IsSourceFrom <p>开启记录公网来源ip和服务端接收时间</p>
     */
    public Boolean getIsSourceFrom() {
        return this.IsSourceFrom;
    }

    /**
     * Set <p>开启记录公网来源ip和服务端接收时间</p>
     * @param IsSourceFrom <p>开启记录公网来源ip和服务端接收时间</p>
     */
    public void setIsSourceFrom(Boolean IsSourceFrom) {
        this.IsSourceFrom = IsSourceFrom;
    }

    /**
     * Get <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul><p>默认值：0</p> 
     * @return BillingMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul><p>默认值：0</p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul><p>默认值：0</p>
     * @param BillingMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul><p>默认值：0</p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    public ModifyTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicRequest(ModifyTopicRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.AutoSplit != null) {
            this.AutoSplit = new Boolean(source.AutoSplit);
        }
        if (source.MaxSplitPartitions != null) {
            this.MaxSplitPartitions = new Long(source.MaxSplitPartitions);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.CancelTopicAsyncTaskID != null) {
            this.CancelTopicAsyncTaskID = new String(source.CancelTopicAsyncTaskID);
        }
        if (source.Encryption != null) {
            this.Encryption = new Long(source.Encryption);
        }
        if (source.IsSourceFrom != null) {
            this.IsSourceFrom = new Boolean(source.IsSourceFrom);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "CancelTopicAsyncTaskID", this.CancelTopicAsyncTaskID);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);

    }
}

