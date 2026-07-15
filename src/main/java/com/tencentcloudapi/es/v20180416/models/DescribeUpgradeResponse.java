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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradeResponse extends AbstractModel {

    /**
    * <p>可以升级到的大版本</p>
    */
    @SerializedName("EsVersions")
    @Expose
    private String [] EsVersions;

    /**
    * <p>可以升级到的商业特性</p>
    */
    @SerializedName("EsLicenses")
    @Expose
    private String [] EsLicenses;

    /**
    * <p>可以升级到的子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsSubProducts")
    @Expose
    private String [] EsSubProducts;

    /**
    * <p>可以升级到的商业特性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsRealLicenses")
    @Expose
    private String [] EsRealLicenses;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>可以升级到的大版本</p> 
     * @return EsVersions <p>可以升级到的大版本</p>
     */
    public String [] getEsVersions() {
        return this.EsVersions;
    }

    /**
     * Set <p>可以升级到的大版本</p>
     * @param EsVersions <p>可以升级到的大版本</p>
     */
    public void setEsVersions(String [] EsVersions) {
        this.EsVersions = EsVersions;
    }

    /**
     * Get <p>可以升级到的商业特性</p> 
     * @return EsLicenses <p>可以升级到的商业特性</p>
     */
    public String [] getEsLicenses() {
        return this.EsLicenses;
    }

    /**
     * Set <p>可以升级到的商业特性</p>
     * @param EsLicenses <p>可以升级到的商业特性</p>
     */
    public void setEsLicenses(String [] EsLicenses) {
        this.EsLicenses = EsLicenses;
    }

    /**
     * Get <p>可以升级到的子产品</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsSubProducts <p>可以升级到的子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEsSubProducts() {
        return this.EsSubProducts;
    }

    /**
     * Set <p>可以升级到的子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsSubProducts <p>可以升级到的子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsSubProducts(String [] EsSubProducts) {
        this.EsSubProducts = EsSubProducts;
    }

    /**
     * Get <p>可以升级到的商业特性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsRealLicenses <p>可以升级到的商业特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEsRealLicenses() {
        return this.EsRealLicenses;
    }

    /**
     * Set <p>可以升级到的商业特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsRealLicenses <p>可以升级到的商业特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsRealLicenses(String [] EsRealLicenses) {
        this.EsRealLicenses = EsRealLicenses;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUpgradeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeResponse(DescribeUpgradeResponse source) {
        if (source.EsVersions != null) {
            this.EsVersions = new String[source.EsVersions.length];
            for (int i = 0; i < source.EsVersions.length; i++) {
                this.EsVersions[i] = new String(source.EsVersions[i]);
            }
        }
        if (source.EsLicenses != null) {
            this.EsLicenses = new String[source.EsLicenses.length];
            for (int i = 0; i < source.EsLicenses.length; i++) {
                this.EsLicenses[i] = new String(source.EsLicenses[i]);
            }
        }
        if (source.EsSubProducts != null) {
            this.EsSubProducts = new String[source.EsSubProducts.length];
            for (int i = 0; i < source.EsSubProducts.length; i++) {
                this.EsSubProducts[i] = new String(source.EsSubProducts[i]);
            }
        }
        if (source.EsRealLicenses != null) {
            this.EsRealLicenses = new String[source.EsRealLicenses.length];
            for (int i = 0; i < source.EsRealLicenses.length; i++) {
                this.EsRealLicenses[i] = new String(source.EsRealLicenses[i]);
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
        this.setParamArraySimple(map, prefix + "EsVersions.", this.EsVersions);
        this.setParamArraySimple(map, prefix + "EsLicenses.", this.EsLicenses);
        this.setParamArraySimple(map, prefix + "EsSubProducts.", this.EsSubProducts);
        this.setParamArraySimple(map, prefix + "EsRealLicenses.", this.EsRealLicenses);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

