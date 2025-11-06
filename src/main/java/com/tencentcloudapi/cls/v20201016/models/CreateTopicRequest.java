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
    * 日志集ID
- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 主题名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 不能使用以下名称["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]

    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题分区个数。默认创建1个，最大支持创建10个分区。
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否开启自动分裂，默认值为true
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 存储时间，单位天。
- 日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。
- 日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。
- 指标主题：支持1至3600天，值为3640时代表永久保存。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 主题描述
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * 0：日志主题关闭日志沉降。
非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。
仅在StorageType为 hot 时生效，指标主题不支持该配置。
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * 主题类型
- 0:日志主题，默认值
- 1:指标主题
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * 主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。
- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 免鉴权开关。 false：关闭； true：开启。默认为false。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。指标主题不支持该配置。
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * 主题扩展信息
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

    /**
    * 开启记录公网来源ip和服务端接收时间
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
     * Get 日志集ID
- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。 
     * @return LogsetId 日志集ID
- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     * @param LogsetId 日志集ID
- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 主题名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 不能使用以下名称["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]
 
     * @return TopicName 主题名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 不能使用以下名称["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]

     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 不能使用以下名称["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]

     * @param TopicName 主题名称
名称限制
- 不能为空字符串
- 不能包含字符'|'
- 不能使用以下名称["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]

     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题分区个数。默认创建1个，最大支持创建10个分区。 
     * @return PartitionCount 主题分区个数。默认创建1个，最大支持创建10个分区。
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 主题分区个数。默认创建1个，最大支持创建10个分区。
     * @param PartitionCount 主题分区个数。默认创建1个，最大支持创建10个分区。
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。 
     * @return Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     * @param Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启自动分裂，默认值为true 
     * @return AutoSplit 是否开启自动分裂，默认值为true
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set 是否开启自动分裂，默认值为true
     * @param AutoSplit 是否开启自动分裂，默认值为true
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50 
     * @return MaxSplitPartitions 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
     * @param MaxSplitPartitions 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。 
     * @return StorageType 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。
     * @param StorageType 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。指标主题不支持该配置。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 存储时间，单位天。
- 日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。
- 日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。
- 指标主题：支持1至3600天，值为3640时代表永久保存。 
     * @return Period 存储时间，单位天。
- 日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。
- 日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。
- 指标主题：支持1至3600天，值为3640时代表永久保存。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 存储时间，单位天。
- 日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。
- 日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。
- 指标主题：支持1至3600天，值为3640时代表永久保存。
     * @param Period 存储时间，单位天。
- 日志主题：日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。
- 日志主题：日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。
- 指标主题：支持1至3600天，值为3640时代表永久保存。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 主题描述 
     * @return Describes 主题描述
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set 主题描述
     * @param Describes 主题描述
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get 0：日志主题关闭日志沉降。
非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。
仅在StorageType为 hot 时生效，指标主题不支持该配置。 
     * @return HotPeriod 0：日志主题关闭日志沉降。
非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。
仅在StorageType为 hot 时生效，指标主题不支持该配置。
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set 0：日志主题关闭日志沉降。
非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。
仅在StorageType为 hot 时生效，指标主题不支持该配置。
     * @param HotPeriod 0：日志主题关闭日志沉降。
非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。
仅在StorageType为 hot 时生效，指标主题不支持该配置。
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get 主题类型
- 0:日志主题，默认值
- 1:指标主题 
     * @return BizType 主题类型
- 0:日志主题，默认值
- 1:指标主题
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 主题类型
- 0:日志主题，默认值
- 1:指标主题
     * @param BizType 主题类型
- 0:日志主题，默认值
- 1:指标主题
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。
- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一 
     * @return TopicId 主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。
- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。
- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
     * @param TopicId 主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。
- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 免鉴权开关。 false：关闭； true：开启。默认为false。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。指标主题不支持该配置。 
     * @return IsWebTracking 免鉴权开关。 false：关闭； true：开启。默认为false。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。指标主题不支持该配置。
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set 免鉴权开关。 false：关闭； true：开启。默认为false。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。指标主题不支持该配置。
     * @param IsWebTracking 免鉴权开关。 false：关闭； true：开启。默认为false。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。指标主题不支持该配置。
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get 主题扩展信息 
     * @return Extends 主题扩展信息
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set 主题扩展信息
     * @param Extends 主题扩展信息
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
    }

    /**
     * Get 开启记录公网来源ip和服务端接收时间 
     * @return IsSourceFrom 开启记录公网来源ip和服务端接收时间
     */
    public Boolean getIsSourceFrom() {
        return this.IsSourceFrom;
    }

    /**
     * Set 开启记录公网来源ip和服务端接收时间
     * @param IsSourceFrom 开启记录公网来源ip和服务端接收时间
     */
    public void setIsSourceFrom(Boolean IsSourceFrom) {
        this.IsSourceFrom = IsSourceFrom;
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);

    }
}

