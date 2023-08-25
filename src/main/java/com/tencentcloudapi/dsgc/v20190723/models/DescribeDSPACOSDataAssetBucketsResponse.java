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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPACOSDataAssetBucketsResponse extends AbstractModel{

    /**
    * COS对象存储敏感数据资产已扫描的桶集合。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Buckets")
    @Expose
    private String [] Buckets;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get COS对象存储敏感数据资产已扫描的桶集合。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Buckets COS对象存储敏感数据资产已扫描的桶集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBuckets() {
        return this.Buckets;
    }

    /**
     * Set COS对象存储敏感数据资产已扫描的桶集合。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Buckets COS对象存储敏感数据资产已扫描的桶集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuckets(String [] Buckets) {
        this.Buckets = Buckets;
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

    public DescribeDSPACOSDataAssetBucketsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPACOSDataAssetBucketsResponse(DescribeDSPACOSDataAssetBucketsResponse source) {
        if (source.Buckets != null) {
            this.Buckets = new String[source.Buckets.length];
            for (int i = 0; i < source.Buckets.length; i++) {
                this.Buckets[i] = new String(source.Buckets[i]);
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
        this.setParamArraySimple(map, prefix + "Buckets.", this.Buckets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

