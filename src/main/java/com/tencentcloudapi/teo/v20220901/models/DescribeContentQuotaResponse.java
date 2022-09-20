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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContentQuotaResponse extends AbstractModel{

    /**
    * 刷新相关配额。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PurgeQuota")
    @Expose
    private Quota [] PurgeQuota;

    /**
    * 预热相关配额。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrefetchQuota")
    @Expose
    private Quota [] PrefetchQuota;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 刷新相关配额。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PurgeQuota 刷新相关配额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Quota [] getPurgeQuota() {
        return this.PurgeQuota;
    }

    /**
     * Set 刷新相关配额。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PurgeQuota 刷新相关配额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPurgeQuota(Quota [] PurgeQuota) {
        this.PurgeQuota = PurgeQuota;
    }

    /**
     * Get 预热相关配额。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrefetchQuota 预热相关配额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Quota [] getPrefetchQuota() {
        return this.PrefetchQuota;
    }

    /**
     * Set 预热相关配额。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrefetchQuota 预热相关配额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrefetchQuota(Quota [] PrefetchQuota) {
        this.PrefetchQuota = PrefetchQuota;
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

    public DescribeContentQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContentQuotaResponse(DescribeContentQuotaResponse source) {
        if (source.PurgeQuota != null) {
            this.PurgeQuota = new Quota[source.PurgeQuota.length];
            for (int i = 0; i < source.PurgeQuota.length; i++) {
                this.PurgeQuota[i] = new Quota(source.PurgeQuota[i]);
            }
        }
        if (source.PrefetchQuota != null) {
            this.PrefetchQuota = new Quota[source.PrefetchQuota.length];
            for (int i = 0; i < source.PrefetchQuota.length; i++) {
                this.PrefetchQuota[i] = new Quota(source.PrefetchQuota[i]);
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
        this.setParamArrayObj(map, prefix + "PurgeQuota.", this.PurgeQuota);
        this.setParamArrayObj(map, prefix + "PrefetchQuota.", this.PrefetchQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

