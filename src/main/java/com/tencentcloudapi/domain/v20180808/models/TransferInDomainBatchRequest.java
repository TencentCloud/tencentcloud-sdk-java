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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferInDomainBatchRequest extends AbstractModel{

    /**
    * 转入的域名名称数组。
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
     * Get 转入的域名名称数组。 
     * @return Domains 转入的域名名称数组。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 转入的域名名称数组。
     * @param Domains 转入的域名名称数组。
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
     * @return TemplateId 模板ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID。
     * @param TemplateId 模板ID。
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

    }
}

