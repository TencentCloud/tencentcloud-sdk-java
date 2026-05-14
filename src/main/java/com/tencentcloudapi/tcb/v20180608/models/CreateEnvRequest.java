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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnvRequest extends AbstractModel {

    /**
    * <p>环境别名。</p><h3 id=".E6.A0.BC.E5.BC.8F.E8.A6.81.E6.B1.82">格式要求</h3><ul><li>可选字符： 小写字母(a~z)、数字、减号(-)</li><li>不能以 减号(-) 开头或结尾</li><li>不能有连个连续的 减号(-)</li><li>长度不超过20位<br>示例值：cloud</li></ul>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>云开发环境套餐Id。<br>对于云开发环境套餐，可通过 <a href="https://cloud.tencent.com/document/product/876/78167">DescribeBaasPackageList</a> 接口获取，对应其出参的PackageName。</p>
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * <p>资源类型。代表新购环境时需要发货哪些资源。<br>可取值以及含义：</p><ul><li>flexdb : 表示文档型数据库</li><li>storage : 表示云存储</li><li>function : 表示云函数</li><li>postgresql：表示postgresql数据库</li></ul><p><strong>该字段不可为空</strong></p>
    */
    @SerializedName("Resources")
    @Expose
    private String [] Resources;

    /**
    * <p>购买实例的时长，单位：月。取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24。<br>默认值为1，即1个月。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>是否自动选择代金券支付。</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * <p>环境标签。<br>可取值通过接口 <a href="https://cloud.tencent.com/document/product/651/35316">tag:DescribeTags</a> 可获取到。<br>不传或为空则默认不打任何标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>自动续费标识。取值范围：</p><ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（需要手动续费，可通过接口 <a href="https://cloud.tencent.com/document/product/876/128590">RenewEnv</a> 来续费）</li></ul><p>默认取值：NOTIFY_AND_MANUAL_RENEW。<br>若该参数指定为NOTIFY_AND_AUTO_RENEW（即：自动续费），在账户余额充足的情况下，实例到期后将按月自动续费；但如果账户余额不足，将无法自动续费。请留意腾讯云短信和邮件通知。</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>云存储外部存储源。<br>表示该环境下不再自动分配云存储cos桶，而是由指定的bucket作为该环境的云存储介质。</p><p>仅当 Resources 中包含storage时有效。</p>
    */
    @SerializedName("ExternalStorage")
    @Expose
    private ExternalStorage ExternalStorage;

    /**
    * <p>开启或关闭 超限转按量。 可取值： TRUE/FALSE （字符串类型） 非法制、不传、为空 则不变更该字段。</p>
    */
    @SerializedName("EnableOverrun")
    @Expose
    private String EnableOverrun;

    /**
     * Get <p>环境别名。</p><h3 id=".E6.A0.BC.E5.BC.8F.E8.A6.81.E6.B1.82">格式要求</h3><ul><li>可选字符： 小写字母(a~z)、数字、减号(-)</li><li>不能以 减号(-) 开头或结尾</li><li>不能有连个连续的 减号(-)</li><li>长度不超过20位<br>示例值：cloud</li></ul> 
     * @return Alias <p>环境别名。</p><h3 id=".E6.A0.BC.E5.BC.8F.E8.A6.81.E6.B1.82">格式要求</h3><ul><li>可选字符： 小写字母(a~z)、数字、减号(-)</li><li>不能以 减号(-) 开头或结尾</li><li>不能有连个连续的 减号(-)</li><li>长度不超过20位<br>示例值：cloud</li></ul>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>环境别名。</p><h3 id=".E6.A0.BC.E5.BC.8F.E8.A6.81.E6.B1.82">格式要求</h3><ul><li>可选字符： 小写字母(a~z)、数字、减号(-)</li><li>不能以 减号(-) 开头或结尾</li><li>不能有连个连续的 减号(-)</li><li>长度不超过20位<br>示例值：cloud</li></ul>
     * @param Alias <p>环境别名。</p><h3 id=".E6.A0.BC.E5.BC.8F.E8.A6.81.E6.B1.82">格式要求</h3><ul><li>可选字符： 小写字母(a~z)、数字、减号(-)</li><li>不能以 减号(-) 开头或结尾</li><li>不能有连个连续的 减号(-)</li><li>长度不超过20位<br>示例值：cloud</li></ul>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>云开发环境套餐Id。<br>对于云开发环境套餐，可通过 <a href="https://cloud.tencent.com/document/product/876/78167">DescribeBaasPackageList</a> 接口获取，对应其出参的PackageName。</p> 
     * @return PackageId <p>云开发环境套餐Id。<br>对于云开发环境套餐，可通过 <a href="https://cloud.tencent.com/document/product/876/78167">DescribeBaasPackageList</a> 接口获取，对应其出参的PackageName。</p>
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>云开发环境套餐Id。<br>对于云开发环境套餐，可通过 <a href="https://cloud.tencent.com/document/product/876/78167">DescribeBaasPackageList</a> 接口获取，对应其出参的PackageName。</p>
     * @param PackageId <p>云开发环境套餐Id。<br>对于云开发环境套餐，可通过 <a href="https://cloud.tencent.com/document/product/876/78167">DescribeBaasPackageList</a> 接口获取，对应其出参的PackageName。</p>
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get <p>资源类型。代表新购环境时需要发货哪些资源。<br>可取值以及含义：</p><ul><li>flexdb : 表示文档型数据库</li><li>storage : 表示云存储</li><li>function : 表示云函数</li><li>postgresql：表示postgresql数据库</li></ul><p><strong>该字段不可为空</strong></p> 
     * @return Resources <p>资源类型。代表新购环境时需要发货哪些资源。<br>可取值以及含义：</p><ul><li>flexdb : 表示文档型数据库</li><li>storage : 表示云存储</li><li>function : 表示云函数</li><li>postgresql：表示postgresql数据库</li></ul><p><strong>该字段不可为空</strong></p>
     */
    public String [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源类型。代表新购环境时需要发货哪些资源。<br>可取值以及含义：</p><ul><li>flexdb : 表示文档型数据库</li><li>storage : 表示云存储</li><li>function : 表示云函数</li><li>postgresql：表示postgresql数据库</li></ul><p><strong>该字段不可为空</strong></p>
     * @param Resources <p>资源类型。代表新购环境时需要发货哪些资源。<br>可取值以及含义：</p><ul><li>flexdb : 表示文档型数据库</li><li>storage : 表示云存储</li><li>function : 表示云函数</li><li>postgresql：表示postgresql数据库</li></ul><p><strong>该字段不可为空</strong></p>
     */
    public void setResources(String [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>购买实例的时长，单位：月。取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24。<br>默认值为1，即1个月。</p> 
     * @return Period <p>购买实例的时长，单位：月。取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24。<br>默认值为1，即1个月。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买实例的时长，单位：月。取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24。<br>默认值为1，即1个月。</p>
     * @param Period <p>购买实例的时长，单位：月。取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24。<br>默认值为1，即1个月。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>是否自动选择代金券支付。</p> 
     * @return AutoVoucher <p>是否自动选择代金券支付。</p>
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券支付。</p>
     * @param AutoVoucher <p>是否自动选择代金券支付。</p>
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>环境标签。<br>可取值通过接口 <a href="https://cloud.tencent.com/document/product/651/35316">tag:DescribeTags</a> 可获取到。<br>不传或为空则默认不打任何标签。</p> 
     * @return Tags <p>环境标签。<br>可取值通过接口 <a href="https://cloud.tencent.com/document/product/651/35316">tag:DescribeTags</a> 可获取到。<br>不传或为空则默认不打任何标签。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>环境标签。<br>可取值通过接口 <a href="https://cloud.tencent.com/document/product/651/35316">tag:DescribeTags</a> 可获取到。<br>不传或为空则默认不打任何标签。</p>
     * @param Tags <p>环境标签。<br>可取值通过接口 <a href="https://cloud.tencent.com/document/product/651/35316">tag:DescribeTags</a> 可获取到。<br>不传或为空则默认不打任何标签。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>自动续费标识。取值范围：</p><ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（需要手动续费，可通过接口 <a href="https://cloud.tencent.com/document/product/876/128590">RenewEnv</a> 来续费）</li></ul><p>默认取值：NOTIFY_AND_MANUAL_RENEW。<br>若该参数指定为NOTIFY_AND_AUTO_RENEW（即：自动续费），在账户余额充足的情况下，实例到期后将按月自动续费；但如果账户余额不足，将无法自动续费。请留意腾讯云短信和邮件通知。</p> 
     * @return RenewFlag <p>自动续费标识。取值范围：</p><ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（需要手动续费，可通过接口 <a href="https://cloud.tencent.com/document/product/876/128590">RenewEnv</a> 来续费）</li></ul><p>默认取值：NOTIFY_AND_MANUAL_RENEW。<br>若该参数指定为NOTIFY_AND_AUTO_RENEW（即：自动续费），在账户余额充足的情况下，实例到期后将按月自动续费；但如果账户余额不足，将无法自动续费。请留意腾讯云短信和邮件通知。</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识。取值范围：</p><ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（需要手动续费，可通过接口 <a href="https://cloud.tencent.com/document/product/876/128590">RenewEnv</a> 来续费）</li></ul><p>默认取值：NOTIFY_AND_MANUAL_RENEW。<br>若该参数指定为NOTIFY_AND_AUTO_RENEW（即：自动续费），在账户余额充足的情况下，实例到期后将按月自动续费；但如果账户余额不足，将无法自动续费。请留意腾讯云短信和邮件通知。</p>
     * @param RenewFlag <p>自动续费标识。取值范围：</p><ul><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费（需要手动续费，可通过接口 <a href="https://cloud.tencent.com/document/product/876/128590">RenewEnv</a> 来续费）</li></ul><p>默认取值：NOTIFY_AND_MANUAL_RENEW。<br>若该参数指定为NOTIFY_AND_AUTO_RENEW（即：自动续费），在账户余额充足的情况下，实例到期后将按月自动续费；但如果账户余额不足，将无法自动续费。请留意腾讯云短信和邮件通知。</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>云存储外部存储源。<br>表示该环境下不再自动分配云存储cos桶，而是由指定的bucket作为该环境的云存储介质。</p><p>仅当 Resources 中包含storage时有效。</p> 
     * @return ExternalStorage <p>云存储外部存储源。<br>表示该环境下不再自动分配云存储cos桶，而是由指定的bucket作为该环境的云存储介质。</p><p>仅当 Resources 中包含storage时有效。</p>
     */
    public ExternalStorage getExternalStorage() {
        return this.ExternalStorage;
    }

    /**
     * Set <p>云存储外部存储源。<br>表示该环境下不再自动分配云存储cos桶，而是由指定的bucket作为该环境的云存储介质。</p><p>仅当 Resources 中包含storage时有效。</p>
     * @param ExternalStorage <p>云存储外部存储源。<br>表示该环境下不再自动分配云存储cos桶，而是由指定的bucket作为该环境的云存储介质。</p><p>仅当 Resources 中包含storage时有效。</p>
     */
    public void setExternalStorage(ExternalStorage ExternalStorage) {
        this.ExternalStorage = ExternalStorage;
    }

    /**
     * Get <p>开启或关闭 超限转按量。 可取值： TRUE/FALSE （字符串类型） 非法制、不传、为空 则不变更该字段。</p> 
     * @return EnableOverrun <p>开启或关闭 超限转按量。 可取值： TRUE/FALSE （字符串类型） 非法制、不传、为空 则不变更该字段。</p>
     */
    public String getEnableOverrun() {
        return this.EnableOverrun;
    }

    /**
     * Set <p>开启或关闭 超限转按量。 可取值： TRUE/FALSE （字符串类型） 非法制、不传、为空 则不变更该字段。</p>
     * @param EnableOverrun <p>开启或关闭 超限转按量。 可取值： TRUE/FALSE （字符串类型） 非法制、不传、为空 则不变更该字段。</p>
     */
    public void setEnableOverrun(String EnableOverrun) {
        this.EnableOverrun = EnableOverrun;
    }

    public CreateEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnvRequest(CreateEnvRequest source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.Resources != null) {
            this.Resources = new String[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new String(source.Resources[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ExternalStorage != null) {
            this.ExternalStorage = new ExternalStorage(source.ExternalStorage);
        }
        if (source.EnableOverrun != null) {
            this.EnableOverrun = new String(source.EnableOverrun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamArraySimple(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "ExternalStorage.", this.ExternalStorage);
        this.setParamSimple(map, prefix + "EnableOverrun", this.EnableOverrun);

    }
}

