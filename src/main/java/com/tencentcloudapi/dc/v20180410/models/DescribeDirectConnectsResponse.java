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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDirectConnectsResponse extends AbstractModel{

    /**
    * 物理专线列表。
    */
    @SerializedName("DirectConnectSet")
    @Expose
    private DirectConnect [] DirectConnectSet;

    /**
    * 符合物理专线列表数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 用户名下物理专线是否都签署了用户协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllSignLaw")
    @Expose
    private Boolean AllSignLaw;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 物理专线列表。 
     * @return DirectConnectSet 物理专线列表。
     */
    public DirectConnect [] getDirectConnectSet() {
        return this.DirectConnectSet;
    }

    /**
     * Set 物理专线列表。
     * @param DirectConnectSet 物理专线列表。
     */
    public void setDirectConnectSet(DirectConnect [] DirectConnectSet) {
        this.DirectConnectSet = DirectConnectSet;
    }

    /**
     * Get 符合物理专线列表数量。 
     * @return TotalCount 符合物理专线列表数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合物理专线列表数量。
     * @param TotalCount 符合物理专线列表数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 用户名下物理专线是否都签署了用户协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllSignLaw 用户名下物理专线是否都签署了用户协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllSignLaw() {
        return this.AllSignLaw;
    }

    /**
     * Set 用户名下物理专线是否都签署了用户协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllSignLaw 用户名下物理专线是否都签署了用户协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllSignLaw(Boolean AllSignLaw) {
        this.AllSignLaw = AllSignLaw;
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

    public DescribeDirectConnectsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDirectConnectsResponse(DescribeDirectConnectsResponse source) {
        if (source.DirectConnectSet != null) {
            this.DirectConnectSet = new DirectConnect[source.DirectConnectSet.length];
            for (int i = 0; i < source.DirectConnectSet.length; i++) {
                this.DirectConnectSet[i] = new DirectConnect(source.DirectConnectSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AllSignLaw != null) {
            this.AllSignLaw = new Boolean(source.AllSignLaw);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DirectConnectSet.", this.DirectConnectSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AllSignLaw", this.AllSignLaw);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

