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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QpsData extends AbstractModel {

    /**
    * <p>弹性qps默认值</p>
    */
    @SerializedName("ElasticBillingDefault")
    @Expose
    private Long ElasticBillingDefault;

    /**
    * <p>弹性qps最小值</p>
    */
    @SerializedName("ElasticBillingMin")
    @Expose
    private Long ElasticBillingMin;

    /**
    * <p>弹性qps最大值</p>
    */
    @SerializedName("ElasticBillingMax")
    @Expose
    private Long ElasticBillingMax;

    /**
    * <p>业务扩展包最大qps</p>
    */
    @SerializedName("QPSExtendMax")
    @Expose
    private Long QPSExtendMax;

    /**
    * <p>境外业务扩展包最大qps</p>
    */
    @SerializedName("QPSExtendIntlMax")
    @Expose
    private Long QPSExtendIntlMax;

    /**
    * <p>预付费/后付费QPS扩容比</p>
    */
    @SerializedName("ElasticPrepaidRatio")
    @Expose
    private Float ElasticPrepaidRatio;

    /**
     * Get <p>弹性qps默认值</p> 
     * @return ElasticBillingDefault <p>弹性qps默认值</p>
     */
    public Long getElasticBillingDefault() {
        return this.ElasticBillingDefault;
    }

    /**
     * Set <p>弹性qps默认值</p>
     * @param ElasticBillingDefault <p>弹性qps默认值</p>
     */
    public void setElasticBillingDefault(Long ElasticBillingDefault) {
        this.ElasticBillingDefault = ElasticBillingDefault;
    }

    /**
     * Get <p>弹性qps最小值</p> 
     * @return ElasticBillingMin <p>弹性qps最小值</p>
     */
    public Long getElasticBillingMin() {
        return this.ElasticBillingMin;
    }

    /**
     * Set <p>弹性qps最小值</p>
     * @param ElasticBillingMin <p>弹性qps最小值</p>
     */
    public void setElasticBillingMin(Long ElasticBillingMin) {
        this.ElasticBillingMin = ElasticBillingMin;
    }

    /**
     * Get <p>弹性qps最大值</p> 
     * @return ElasticBillingMax <p>弹性qps最大值</p>
     */
    public Long getElasticBillingMax() {
        return this.ElasticBillingMax;
    }

    /**
     * Set <p>弹性qps最大值</p>
     * @param ElasticBillingMax <p>弹性qps最大值</p>
     */
    public void setElasticBillingMax(Long ElasticBillingMax) {
        this.ElasticBillingMax = ElasticBillingMax;
    }

    /**
     * Get <p>业务扩展包最大qps</p> 
     * @return QPSExtendMax <p>业务扩展包最大qps</p>
     */
    public Long getQPSExtendMax() {
        return this.QPSExtendMax;
    }

    /**
     * Set <p>业务扩展包最大qps</p>
     * @param QPSExtendMax <p>业务扩展包最大qps</p>
     */
    public void setQPSExtendMax(Long QPSExtendMax) {
        this.QPSExtendMax = QPSExtendMax;
    }

    /**
     * Get <p>境外业务扩展包最大qps</p> 
     * @return QPSExtendIntlMax <p>境外业务扩展包最大qps</p>
     */
    public Long getQPSExtendIntlMax() {
        return this.QPSExtendIntlMax;
    }

    /**
     * Set <p>境外业务扩展包最大qps</p>
     * @param QPSExtendIntlMax <p>境外业务扩展包最大qps</p>
     */
    public void setQPSExtendIntlMax(Long QPSExtendIntlMax) {
        this.QPSExtendIntlMax = QPSExtendIntlMax;
    }

    /**
     * Get <p>预付费/后付费QPS扩容比</p> 
     * @return ElasticPrepaidRatio <p>预付费/后付费QPS扩容比</p>
     */
    public Float getElasticPrepaidRatio() {
        return this.ElasticPrepaidRatio;
    }

    /**
     * Set <p>预付费/后付费QPS扩容比</p>
     * @param ElasticPrepaidRatio <p>预付费/后付费QPS扩容比</p>
     */
    public void setElasticPrepaidRatio(Float ElasticPrepaidRatio) {
        this.ElasticPrepaidRatio = ElasticPrepaidRatio;
    }

    public QpsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QpsData(QpsData source) {
        if (source.ElasticBillingDefault != null) {
            this.ElasticBillingDefault = new Long(source.ElasticBillingDefault);
        }
        if (source.ElasticBillingMin != null) {
            this.ElasticBillingMin = new Long(source.ElasticBillingMin);
        }
        if (source.ElasticBillingMax != null) {
            this.ElasticBillingMax = new Long(source.ElasticBillingMax);
        }
        if (source.QPSExtendMax != null) {
            this.QPSExtendMax = new Long(source.QPSExtendMax);
        }
        if (source.QPSExtendIntlMax != null) {
            this.QPSExtendIntlMax = new Long(source.QPSExtendIntlMax);
        }
        if (source.ElasticPrepaidRatio != null) {
            this.ElasticPrepaidRatio = new Float(source.ElasticPrepaidRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElasticBillingDefault", this.ElasticBillingDefault);
        this.setParamSimple(map, prefix + "ElasticBillingMin", this.ElasticBillingMin);
        this.setParamSimple(map, prefix + "ElasticBillingMax", this.ElasticBillingMax);
        this.setParamSimple(map, prefix + "QPSExtendMax", this.QPSExtendMax);
        this.setParamSimple(map, prefix + "QPSExtendIntlMax", this.QPSExtendIntlMax);
        this.setParamSimple(map, prefix + "ElasticPrepaidRatio", this.ElasticPrepaidRatio);

    }
}

