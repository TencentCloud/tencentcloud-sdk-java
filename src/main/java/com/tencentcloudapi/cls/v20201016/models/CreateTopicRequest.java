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

public class CreateTopicRequest extends AbstractModel {

    /**
    * <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>主题名称<br>名称限制</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>主题分区个数。默认创建1个，最大支持创建10个分区。</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否开启自动分裂，默认值为true</p>
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * <p>开启自动分裂后，每个主题能够允许的最大分区数，默认值为50</p>
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>存储时间，单位天。</p><ul><li>日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li><li>指标主题：支持1至3600天，值为3640时代表永久保存。</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>主题描述</p>
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>0或者不传： 不加密<br>1：kms-cls 云产品密钥加密</p><p>支持地域：ap-beijing,ap-guangzhou,ap-shanghai,ap-singapore,ap-bangkok,ap-jakarta,eu-frankfurt,ap-seoul,ap-tokyo</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Long Encryption;

    /**
    * <p>主题类型</p><ul><li>0:日志主题，默认值</li><li>1:指标主题</li></ul>
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * <p>主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。</p><ul><li>用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符</li><li>尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。</li><li>如果指定该字段，需保证全地域唯一</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>免鉴权开关。 false：关闭； true：开启。默认为false。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。指标主题不支持该配置。</p>
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
    * <p>开启记录公网来源ip和服务端接收时间</p>
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
    * <p>计费模式</p><p>枚举值：</p><ul><li>0： 按功能项计费</li><li>1： 原始日志量计费</li></ul><p>默认值：0</p><p>通过接口调用时默认值为0，通过控制台调用时默认值为1</p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
     * Get <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul> 
     * @return LogsetId <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     * @param LogsetId <p>日志集ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>主题名称<br>名称限制</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul> 
     * @return TopicName <p>主题名称<br>名称限制</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>主题名称<br>名称限制</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     * @param TopicName <p>主题名称<br>名称限制</p><ul><li>不能为空字符串</li><li>不能包含字符&#39;|&#39;</li><li>不能使用以下名称[&quot;cls_service_log&quot;,&quot;loglistener_status&quot;,&quot;loglistener_alarm&quot;,&quot;loglistener_business&quot;,&quot;cls_service_metric&quot;]</li></ul>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>主题分区个数。默认创建1个，最大支持创建10个分区。</p> 
     * @return PartitionCount <p>主题分区个数。默认创建1个，最大支持创建10个分区。</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>主题分区个数。默认创建1个，最大支持创建10个分区。</p>
     * @param PartitionCount <p>主题分区个数。默认创建1个，最大支持创建10个分区。</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p> 
     * @return Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
     * @param Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否开启自动分裂，默认值为true</p> 
     * @return AutoSplit <p>是否开启自动分裂，默认值为true</p>
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set <p>是否开启自动分裂，默认值为true</p>
     * @param AutoSplit <p>是否开启自动分裂，默认值为true</p>
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get <p>开启自动分裂后，每个主题能够允许的最大分区数，默认值为50</p> 
     * @return MaxSplitPartitions <p>开启自动分裂后，每个主题能够允许的最大分区数，默认值为50</p>
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set <p>开启自动分裂后，每个主题能够允许的最大分区数，默认值为50</p>
     * @param MaxSplitPartitions <p>开启自动分裂后，每个主题能够允许的最大分区数，默认值为50</p>
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。</p> 
     * @return StorageType <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。</p>
     * @param StorageType <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>存储时间，单位天。</p><ul><li>日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li><li>指标主题：支持1至3600天，值为3640时代表永久保存。</li></ul> 
     * @return Period <p>存储时间，单位天。</p><ul><li>日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li><li>指标主题：支持1至3600天，值为3640时代表永久保存。</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>存储时间，单位天。</p><ul><li>日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li><li>指标主题：支持1至3600天，值为3640时代表永久保存。</li></ul>
     * @param Period <p>存储时间，单位天。</p><ul><li>日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li><li>指标主题：支持1至3600天，值为3640时代表永久保存。</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
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
     * Get <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p> 
     * @return HotPeriod <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
     * @param HotPeriod <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>0或者不传： 不加密<br>1：kms-cls 云产品密钥加密</p><p>支持地域：ap-beijing,ap-guangzhou,ap-shanghai,ap-singapore,ap-bangkok,ap-jakarta,eu-frankfurt,ap-seoul,ap-tokyo</p> 
     * @return Encryption <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>0或者不传： 不加密<br>1：kms-cls 云产品密钥加密</p><p>支持地域：ap-beijing,ap-guangzhou,ap-shanghai,ap-singapore,ap-bangkok,ap-jakarta,eu-frankfurt,ap-seoul,ap-tokyo</p>
     */
    public Long getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>0或者不传： 不加密<br>1：kms-cls 云产品密钥加密</p><p>支持地域：ap-beijing,ap-guangzhou,ap-shanghai,ap-singapore,ap-bangkok,ap-jakarta,eu-frankfurt,ap-seoul,ap-tokyo</p>
     * @param Encryption <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。<br>0或者不传： 不加密<br>1：kms-cls 云产品密钥加密</p><p>支持地域：ap-beijing,ap-guangzhou,ap-shanghai,ap-singapore,ap-bangkok,ap-jakarta,eu-frankfurt,ap-seoul,ap-tokyo</p>
     */
    public void setEncryption(Long Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>主题类型</p><ul><li>0:日志主题，默认值</li><li>1:指标主题</li></ul> 
     * @return BizType <p>主题类型</p><ul><li>0:日志主题，默认值</li><li>1:指标主题</li></ul>
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>主题类型</p><ul><li>0:日志主题，默认值</li><li>1:指标主题</li></ul>
     * @param BizType <p>主题类型</p><ul><li>0:日志主题，默认值</li><li>1:指标主题</li></ul>
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。</p><ul><li>用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符</li><li>尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。</li><li>如果指定该字段，需保证全地域唯一</li></ul> 
     * @return TopicId <p>主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。</p><ul><li>用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符</li><li>尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。</li><li>如果指定该字段，需保证全地域唯一</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。</p><ul><li>用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符</li><li>尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。</li><li>如果指定该字段，需保证全地域唯一</li></ul>
     * @param TopicId <p>主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。</p><ul><li>用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符</li><li>尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。</li><li>如果指定该字段，需保证全地域唯一</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>免鉴权开关。 false：关闭； true：开启。默认为false。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。指标主题不支持该配置。</p> 
     * @return IsWebTracking <p>免鉴权开关。 false：关闭； true：开启。默认为false。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。指标主题不支持该配置。</p>
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set <p>免鉴权开关。 false：关闭； true：开启。默认为false。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。指标主题不支持该配置。</p>
     * @param IsWebTracking <p>免鉴权开关。 false：关闭； true：开启。默认为false。<br>开启后将支持指定操作匿名访问该日志主题。详情请参见<a href="https://cloud.tencent.com/document/product/614/41035">日志主题</a>。指标主题不支持该配置。</p>
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
     * Get <p>计费模式</p><p>枚举值：</p><ul><li>0： 按功能项计费</li><li>1： 原始日志量计费</li></ul><p>默认值：0</p><p>通过接口调用时默认值为0，通过控制台调用时默认值为1</p> 
     * @return BillingMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 按功能项计费</li><li>1： 原始日志量计费</li></ul><p>默认值：0</p><p>通过接口调用时默认值为0，通过控制台调用时默认值为1</p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式</p><p>枚举值：</p><ul><li>0： 按功能项计费</li><li>1： 原始日志量计费</li></ul><p>默认值：0</p><p>通过接口调用时默认值为0，通过控制台调用时默认值为1</p>
     * @param BillingMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 按功能项计费</li><li>1： 原始日志量计费</li></ul><p>默认值：0</p><p>通过接口调用时默认值为0，通过控制台调用时默认值为1</p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
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
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.Encryption != null) {
            this.Encryption = new Long(source.Encryption);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
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
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);

    }
}

