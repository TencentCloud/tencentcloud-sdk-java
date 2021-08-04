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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCvmQuotaResponse extends AbstractModel{

    /**
    * 后付费配额列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostPaidQuotaSet")
    @Expose
    private QuotaEntity [] PostPaidQuotaSet;

    /**
    * 竞价实例配额列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpotPaidQuotaSet")
    @Expose
    private QuotaEntity [] SpotPaidQuotaSet;

    /**
    * eks配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EksQuotaSet")
    @Expose
    private PodSaleSpec [] EksQuotaSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 后付费配额列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostPaidQuotaSet 后付费配额列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuotaEntity [] getPostPaidQuotaSet() {
        return this.PostPaidQuotaSet;
    }

    /**
     * Set 后付费配额列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostPaidQuotaSet 后付费配额列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostPaidQuotaSet(QuotaEntity [] PostPaidQuotaSet) {
        this.PostPaidQuotaSet = PostPaidQuotaSet;
    }

    /**
     * Get 竞价实例配额列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpotPaidQuotaSet 竞价实例配额列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuotaEntity [] getSpotPaidQuotaSet() {
        return this.SpotPaidQuotaSet;
    }

    /**
     * Set 竞价实例配额列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpotPaidQuotaSet 竞价实例配额列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpotPaidQuotaSet(QuotaEntity [] SpotPaidQuotaSet) {
        this.SpotPaidQuotaSet = SpotPaidQuotaSet;
    }

    /**
     * Get eks配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EksQuotaSet eks配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PodSaleSpec [] getEksQuotaSet() {
        return this.EksQuotaSet;
    }

    /**
     * Set eks配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param EksQuotaSet eks配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEksQuotaSet(PodSaleSpec [] EksQuotaSet) {
        this.EksQuotaSet = EksQuotaSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCvmQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCvmQuotaResponse(DescribeCvmQuotaResponse source) {
        if (source.PostPaidQuotaSet != null) {
            this.PostPaidQuotaSet = new QuotaEntity[source.PostPaidQuotaSet.length];
            for (int i = 0; i < source.PostPaidQuotaSet.length; i++) {
                this.PostPaidQuotaSet[i] = new QuotaEntity(source.PostPaidQuotaSet[i]);
            }
        }
        if (source.SpotPaidQuotaSet != null) {
            this.SpotPaidQuotaSet = new QuotaEntity[source.SpotPaidQuotaSet.length];
            for (int i = 0; i < source.SpotPaidQuotaSet.length; i++) {
                this.SpotPaidQuotaSet[i] = new QuotaEntity(source.SpotPaidQuotaSet[i]);
            }
        }
        if (source.EksQuotaSet != null) {
            this.EksQuotaSet = new PodSaleSpec[source.EksQuotaSet.length];
            for (int i = 0; i < source.EksQuotaSet.length; i++) {
                this.EksQuotaSet[i] = new PodSaleSpec(source.EksQuotaSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PostPaidQuotaSet.", this.PostPaidQuotaSet);
        this.setParamArrayObj(map, prefix + "SpotPaidQuotaSet.", this.SpotPaidQuotaSet);
        this.setParamArrayObj(map, prefix + "EksQuotaSet.", this.EksQuotaSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

