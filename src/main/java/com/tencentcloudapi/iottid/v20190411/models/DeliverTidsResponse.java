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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverTidsResponse extends AbstractModel {

    /**
    * 空发的TID信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TidSet")
    @Expose
    private TidKeysInfo [] TidSet;

    /**
    * 产品公钥
    */
    @SerializedName("ProductKey")
    @Expose
    private String ProductKey;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 空发的TID信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TidSet 空发的TID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TidKeysInfo [] getTidSet() {
        return this.TidSet;
    }

    /**
     * Set 空发的TID信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TidSet 空发的TID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTidSet(TidKeysInfo [] TidSet) {
        this.TidSet = TidSet;
    }

    /**
     * Get 产品公钥 
     * @return ProductKey 产品公钥
     */
    public String getProductKey() {
        return this.ProductKey;
    }

    /**
     * Set 产品公钥
     * @param ProductKey 产品公钥
     */
    public void setProductKey(String ProductKey) {
        this.ProductKey = ProductKey;
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

    public DeliverTidsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverTidsResponse(DeliverTidsResponse source) {
        if (source.TidSet != null) {
            this.TidSet = new TidKeysInfo[source.TidSet.length];
            for (int i = 0; i < source.TidSet.length; i++) {
                this.TidSet[i] = new TidKeysInfo(source.TidSet[i]);
            }
        }
        if (source.ProductKey != null) {
            this.ProductKey = new String(source.ProductKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TidSet.", this.TidSet);
        this.setParamSimple(map, prefix + "ProductKey", this.ProductKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

