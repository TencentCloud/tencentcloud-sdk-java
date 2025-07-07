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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferInDomainBatchRequest extends AbstractModel {

    /**
    * 转入的域名名称数组。
一次提交不大于4000个
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 域名转移码数组。
    */
    @SerializedName("PassWords")
    @Expose
    private String [] PassWords;

    /**
    * 模板ID。 
可通过[DescribeTemplateList](https://cloud.tencent.com/document/api/242/48940)接口获取
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 付费模式 0手动在线付费，1使用余额付费。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 自动续费开关。有两个可选值：
0 表示关闭，不自动续费（默认值）
1 表示开启，将自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
    */
    @SerializedName("LockTransfer")
    @Expose
    private Boolean LockTransfer;

    /**
    * 是否开启更新锁：0=默认不开启，1=开启
    */
    @SerializedName("UpdateProhibition")
    @Expose
    private Long UpdateProhibition;

    /**
    * 是否开启转移锁：0=默认不开启，1=开启
    */
    @SerializedName("TransferProhibition")
    @Expose
    private Long TransferProhibition;

    /**
    * 渠道来源，pc/miniprogram/h5等
    */
    @SerializedName("ChannelFrom")
    @Expose
    private String ChannelFrom;

    /**
    * 订单来源，common正常/dianshi_active点石活动等
    */
    @SerializedName("OrderFrom")
    @Expose
    private String OrderFrom;

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
     * Get 转入的域名名称数组。
一次提交不大于4000个 
     * @return Domains 转入的域名名称数组。
一次提交不大于4000个
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 转入的域名名称数组。
一次提交不大于4000个
     * @param Domains 转入的域名名称数组。
一次提交不大于4000个
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 域名转移码数组。 
     * @return PassWords 域名转移码数组。
     */
    public String [] getPassWords() {
        return this.PassWords;
    }

    /**
     * Set 域名转移码数组。
     * @param PassWords 域名转移码数组。
     */
    public void setPassWords(String [] PassWords) {
        this.PassWords = PassWords;
    }

    /**
     * Get 模板ID。 
可通过[DescribeTemplateList](https://cloud.tencent.com/document/api/242/48940)接口获取 
     * @return TemplateId 模板ID。 
可通过[DescribeTemplateList](https://cloud.tencent.com/document/api/242/48940)接口获取
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID。 
可通过[DescribeTemplateList](https://cloud.tencent.com/document/api/242/48940)接口获取
     * @param TemplateId 模板ID。 
可通过[DescribeTemplateList](https://cloud.tencent.com/document/api/242/48940)接口获取
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 付费模式 0手动在线付费，1使用余额付费。 
     * @return PayMode 付费模式 0手动在线付费，1使用余额付费。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式 0手动在线付费，1使用余额付费。
     * @param PayMode 付费模式 0手动在线付费，1使用余额付费。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 自动续费开关。有两个可选值：
0 表示关闭，不自动续费（默认值）
1 表示开启，将自动续费 
     * @return AutoRenewFlag 自动续费开关。有两个可选值：
0 表示关闭，不自动续费（默认值）
1 表示开启，将自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费开关。有两个可选值：
0 表示关闭，不自动续费（默认值）
1 表示开启，将自动续费
     * @param AutoRenewFlag 自动续费开关。有两个可选值：
0 表示关闭，不自动续费（默认值）
1 表示开启，将自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true 
     * @return LockTransfer true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
     */
    public Boolean getLockTransfer() {
        return this.LockTransfer;
    }

    /**
     * Set true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
     * @param LockTransfer true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
     */
    public void setLockTransfer(Boolean LockTransfer) {
        this.LockTransfer = LockTransfer;
    }

    /**
     * Get 是否开启更新锁：0=默认不开启，1=开启 
     * @return UpdateProhibition 是否开启更新锁：0=默认不开启，1=开启
     */
    public Long getUpdateProhibition() {
        return this.UpdateProhibition;
    }

    /**
     * Set 是否开启更新锁：0=默认不开启，1=开启
     * @param UpdateProhibition 是否开启更新锁：0=默认不开启，1=开启
     */
    public void setUpdateProhibition(Long UpdateProhibition) {
        this.UpdateProhibition = UpdateProhibition;
    }

    /**
     * Get 是否开启转移锁：0=默认不开启，1=开启 
     * @return TransferProhibition 是否开启转移锁：0=默认不开启，1=开启
     */
    public Long getTransferProhibition() {
        return this.TransferProhibition;
    }

    /**
     * Set 是否开启转移锁：0=默认不开启，1=开启
     * @param TransferProhibition 是否开启转移锁：0=默认不开启，1=开启
     */
    public void setTransferProhibition(Long TransferProhibition) {
        this.TransferProhibition = TransferProhibition;
    }

    /**
     * Get 渠道来源，pc/miniprogram/h5等 
     * @return ChannelFrom 渠道来源，pc/miniprogram/h5等
     */
    public String getChannelFrom() {
        return this.ChannelFrom;
    }

    /**
     * Set 渠道来源，pc/miniprogram/h5等
     * @param ChannelFrom 渠道来源，pc/miniprogram/h5等
     */
    public void setChannelFrom(String ChannelFrom) {
        this.ChannelFrom = ChannelFrom;
    }

    /**
     * Get 订单来源，common正常/dianshi_active点石活动等 
     * @return OrderFrom 订单来源，common正常/dianshi_active点石活动等
     */
    public String getOrderFrom() {
        return this.OrderFrom;
    }

    /**
     * Set 订单来源，common正常/dianshi_active点石活动等
     * @param OrderFrom 订单来源，common正常/dianshi_active点石活动等
     */
    public void setOrderFrom(String OrderFrom) {
        this.OrderFrom = OrderFrom;
    }

    /**
     * Get 活动id 
     * @return ActivityId 活动id
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
     * @param ActivityId 活动id
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    public TransferInDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferInDomainBatchRequest(TransferInDomainBatchRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.PassWords != null) {
            this.PassWords = new String[source.PassWords.length];
            for (int i = 0; i < source.PassWords.length; i++) {
                this.PassWords[i] = new String(source.PassWords[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.LockTransfer != null) {
            this.LockTransfer = new Boolean(source.LockTransfer);
        }
        if (source.UpdateProhibition != null) {
            this.UpdateProhibition = new Long(source.UpdateProhibition);
        }
        if (source.TransferProhibition != null) {
            this.TransferProhibition = new Long(source.TransferProhibition);
        }
        if (source.ChannelFrom != null) {
            this.ChannelFrom = new String(source.ChannelFrom);
        }
        if (source.OrderFrom != null) {
            this.OrderFrom = new String(source.OrderFrom);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "PassWords.", this.PassWords);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "LockTransfer", this.LockTransfer);
        this.setParamSimple(map, prefix + "UpdateProhibition", this.UpdateProhibition);
        this.setParamSimple(map, prefix + "TransferProhibition", this.TransferProhibition);
        this.setParamSimple(map, prefix + "ChannelFrom", this.ChannelFrom);
        this.setParamSimple(map, prefix + "OrderFrom", this.OrderFrom);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);

    }
}

