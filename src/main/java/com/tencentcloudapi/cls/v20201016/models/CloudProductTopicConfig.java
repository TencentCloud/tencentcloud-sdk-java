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

public class CloudProductTopicConfig extends AbstractModel {

    /**
    * <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。</p><p>枚举值：</p><ul><li>0： 不加密</li><li>1： kms-cls 云产品密钥加密</li></ul><p>默认值：0</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Long Encryption;

    /**
    * <p>主题分区个数。默认创建1个，最大支持创建10个分区。</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>是否开启自动分裂，默认值为true</p>
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * <p>开启自动分裂后，每个主题能够允许的最大分区数</p><p>默认值：50</p>
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）。指标主题不支持该配置。</p><p>默认值：hot</p>
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
    * <p>0：日志主题关闭日志沉降。<br>非0：日志主题开启日志沉降后标准存储的天数，HotPeriod需要大于等于7，且小于Period。<br>仅在StorageType为 hot 时生效，指标主题不支持该配置。</p>
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>主题描述</p>
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * <p>开启记录公网来源ip和服务端接收时间</p>
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
    * <p>免鉴权开关。 false：关闭； true：开启。默认为false。 开启后将支持指定操作匿名访问该日志主题。</p>
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * <p>用户自定义 KMS 密钥信息；为空则使用默认密钥（别名 KMS-CLS）<br>当参数 Encryption为 1 时有效。</p>
    */
    @SerializedName("CustomKmsInfo")
    @Expose
    private CustomKmsInfo CustomKmsInfo;

    /**
    * <p>主题自定义ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。</p><ul><li>用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符</li><li>尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。</li><li>如果指定该字段，需保证全地域唯一</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。</p><p>枚举值：</p><ul><li>0： 不加密</li><li>1： kms-cls 云产品密钥加密</li></ul><p>默认值：0</p> 
     * @return Encryption <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。</p><p>枚举值：</p><ul><li>0： 不加密</li><li>1： kms-cls 云产品密钥加密</li></ul><p>默认值：0</p>
     */
    public Long getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。</p><p>枚举值：</p><ul><li>0： 不加密</li><li>1： kms-cls 云产品密钥加密</li></ul><p>默认值：0</p>
     * @param Encryption <p>加密相关参数。 支持加密地域并且开白用户可以传此参数，其他场景不能传递该参数。</p><p>枚举值：</p><ul><li>0： 不加密</li><li>1： kms-cls 云产品密钥加密</li></ul><p>默认值：0</p>
     */
    public void setEncryption(Long Encryption) {
        this.Encryption = Encryption;
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
     * Get <p>开启自动分裂后，每个主题能够允许的最大分区数</p><p>默认值：50</p> 
     * @return MaxSplitPartitions <p>开启自动分裂后，每个主题能够允许的最大分区数</p><p>默认值：50</p>
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set <p>开启自动分裂后，每个主题能够允许的最大分区数</p><p>默认值：50</p>
     * @param MaxSplitPartitions <p>开启自动分裂后，每个主题能够允许的最大分区数</p><p>默认值：50</p>
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）。指标主题不支持该配置。</p><p>默认值：hot</p> 
     * @return StorageType <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）。指标主题不支持该配置。</p><p>默认值：hot</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）。指标主题不支持该配置。</p><p>默认值：hot</p>
     * @param StorageType <p>日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）。指标主题不支持该配置。</p><p>默认值：hot</p>
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
     * Get <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul> 
     * @return BillingMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     * @param BillingMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 按使用功能计费</li><li>1： 按原始日志量计费（目前仅面向少部分客户支持）</li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
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
     * Get <p>免鉴权开关。 false：关闭； true：开启。默认为false。 开启后将支持指定操作匿名访问该日志主题。</p> 
     * @return IsWebTracking <p>免鉴权开关。 false：关闭； true：开启。默认为false。 开启后将支持指定操作匿名访问该日志主题。</p>
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set <p>免鉴权开关。 false：关闭； true：开启。默认为false。 开启后将支持指定操作匿名访问该日志主题。</p>
     * @param IsWebTracking <p>免鉴权开关。 false：关闭； true：开启。默认为false。 开启后将支持指定操作匿名访问该日志主题。</p>
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get <p>用户自定义 KMS 密钥信息；为空则使用默认密钥（别名 KMS-CLS）<br>当参数 Encryption为 1 时有效。</p> 
     * @return CustomKmsInfo <p>用户自定义 KMS 密钥信息；为空则使用默认密钥（别名 KMS-CLS）<br>当参数 Encryption为 1 时有效。</p>
     */
    public CustomKmsInfo getCustomKmsInfo() {
        return this.CustomKmsInfo;
    }

    /**
     * Set <p>用户自定义 KMS 密钥信息；为空则使用默认密钥（别名 KMS-CLS）<br>当参数 Encryption为 1 时有效。</p>
     * @param CustomKmsInfo <p>用户自定义 KMS 密钥信息；为空则使用默认密钥（别名 KMS-CLS）<br>当参数 Encryption为 1 时有效。</p>
     */
    public void setCustomKmsInfo(CustomKmsInfo CustomKmsInfo) {
        this.CustomKmsInfo = CustomKmsInfo;
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

    public CloudProductTopicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudProductTopicConfig(CloudProductTopicConfig source) {
        if (source.Encryption != null) {
            this.Encryption = new Long(source.Encryption);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
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
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.IsSourceFrom != null) {
            this.IsSourceFrom = new Boolean(source.IsSourceFrom);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.CustomKmsInfo != null) {
            this.CustomKmsInfo = new CustomKmsInfo(source.CustomKmsInfo);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "CustomKmsInfo.", this.CustomKmsInfo);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

