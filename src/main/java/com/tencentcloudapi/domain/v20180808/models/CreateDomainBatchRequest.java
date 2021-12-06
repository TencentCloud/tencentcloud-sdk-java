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

public class CreateDomainBatchRequest extends AbstractModel{

    /**
    * 模板ID。详情请查看：[获取模板列表](https://cloud.tencent.com/document/product/242/48940)
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 购买域名的年限，可选值：[1-10]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 批量购买的域名,最多为4000个
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 付费模式 0手动在线付费，1使用余额付费，2使用特惠包
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
    * 使用的特惠包ID，PayMode为2时必填
    */
    @SerializedName("PackageResourceId")
    @Expose
    private String PackageResourceId;

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
     * Get 模板ID。详情请查看：[获取模板列表](https://cloud.tencent.com/document/product/242/48940) 
     * @return TemplateId 模板ID。详情请查看：[获取模板列表](https://cloud.tencent.com/document/product/242/48940)
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID。详情请查看：[获取模板列表](https://cloud.tencent.com/document/product/242/48940)
     * @param TemplateId 模板ID。详情请查看：[获取模板列表](https://cloud.tencent.com/document/product/242/48940)
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 购买域名的年限，可选值：[1-10] 
     * @return Period 购买域名的年限，可选值：[1-10]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买域名的年限，可选值：[1-10]
     * @param Period 购买域名的年限，可选值：[1-10]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 批量购买的域名,最多为4000个 
     * @return Domains 批量购买的域名,最多为4000个
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 批量购买的域名,最多为4000个
     * @param Domains 批量购买的域名,最多为4000个
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 付费模式 0手动在线付费，1使用余额付费，2使用特惠包 
     * @return PayMode 付费模式 0手动在线付费，1使用余额付费，2使用特惠包
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式 0手动在线付费，1使用余额付费，2使用特惠包
     * @param PayMode 付费模式 0手动在线付费，1使用余额付费，2使用特惠包
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
     * Get 使用的特惠包ID，PayMode为2时必填 
     * @return PackageResourceId 使用的特惠包ID，PayMode为2时必填
     */
    public String getPackageResourceId() {
        return this.PackageResourceId;
    }

    /**
     * Set 使用的特惠包ID，PayMode为2时必填
     * @param PackageResourceId 使用的特惠包ID，PayMode为2时必填
     */
    public void setPackageResourceId(String PackageResourceId) {
        this.PackageResourceId = PackageResourceId;
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

    public CreateDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainBatchRequest(CreateDomainBatchRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PackageResourceId != null) {
            this.PackageResourceId = new String(source.PackageResourceId);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PackageResourceId", this.PackageResourceId);
        this.setParamSimple(map, prefix + "UpdateProhibition", this.UpdateProhibition);
        this.setParamSimple(map, prefix + "TransferProhibition", this.TransferProhibition);

    }
}

