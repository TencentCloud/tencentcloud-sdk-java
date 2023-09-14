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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QpsData extends AbstractModel{

    /**
    * 弹性qps默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticBillingDefault")
    @Expose
    private Long ElasticBillingDefault;

    /**
    * 弹性qps最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticBillingMin")
    @Expose
    private Long ElasticBillingMin;

    /**
    * 弹性qps最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticBillingMax")
    @Expose
    private Long ElasticBillingMax;

    /**
    * 业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QPSExtendMax")
    @Expose
    private Long QPSExtendMax;

    /**
    * 海外业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QPSExtendIntlMax")
    @Expose
    private Long QPSExtendIntlMax;

    /**
     * Get 弹性qps默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticBillingDefault 弹性qps默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticBillingDefault() {
        return this.ElasticBillingDefault;
    }

    /**
     * Set 弹性qps默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticBillingDefault 弹性qps默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticBillingDefault(Long ElasticBillingDefault) {
        this.ElasticBillingDefault = ElasticBillingDefault;
    }

    /**
     * Get 弹性qps最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticBillingMin 弹性qps最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticBillingMin() {
        return this.ElasticBillingMin;
    }

    /**
     * Set 弹性qps最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticBillingMin 弹性qps最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticBillingMin(Long ElasticBillingMin) {
        this.ElasticBillingMin = ElasticBillingMin;
    }

    /**
     * Get 弹性qps最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticBillingMax 弹性qps最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticBillingMax() {
        return this.ElasticBillingMax;
    }

    /**
     * Set 弹性qps最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticBillingMax 弹性qps最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticBillingMax(Long ElasticBillingMax) {
        this.ElasticBillingMax = ElasticBillingMax;
    }

    /**
     * Get 业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QPSExtendMax 业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQPSExtendMax() {
        return this.QPSExtendMax;
    }

    /**
     * Set 业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
     * @param QPSExtendMax 业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQPSExtendMax(Long QPSExtendMax) {
        this.QPSExtendMax = QPSExtendMax;
    }

    /**
     * Get 海外业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QPSExtendIntlMax 海外业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQPSExtendIntlMax() {
        return this.QPSExtendIntlMax;
    }

    /**
     * Set 海外业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
     * @param QPSExtendIntlMax 海外业务扩展包最大qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQPSExtendIntlMax(Long QPSExtendIntlMax) {
        this.QPSExtendIntlMax = QPSExtendIntlMax;
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

    }
}

