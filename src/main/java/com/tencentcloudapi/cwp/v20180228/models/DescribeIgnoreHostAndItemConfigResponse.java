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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIgnoreHostAndItemConfigResponse extends AbstractModel{

    /**
    * 受影响检测项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemSet")
    @Expose
    private BaselineItemInfo [] ItemSet;

    /**
    * 受影响主机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostSet")
    @Expose
    private BaselineHost [] HostSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 受影响检测项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemSet 受影响检测项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineItemInfo [] getItemSet() {
        return this.ItemSet;
    }

    /**
     * Set 受影响检测项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemSet 受影响检测项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemSet(BaselineItemInfo [] ItemSet) {
        this.ItemSet = ItemSet;
    }

    /**
     * Get 受影响主机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostSet 受影响主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineHost [] getHostSet() {
        return this.HostSet;
    }

    /**
     * Set 受影响主机
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostSet 受影响主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostSet(BaselineHost [] HostSet) {
        this.HostSet = HostSet;
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

    public DescribeIgnoreHostAndItemConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIgnoreHostAndItemConfigResponse(DescribeIgnoreHostAndItemConfigResponse source) {
        if (source.ItemSet != null) {
            this.ItemSet = new BaselineItemInfo[source.ItemSet.length];
            for (int i = 0; i < source.ItemSet.length; i++) {
                this.ItemSet[i] = new BaselineItemInfo(source.ItemSet[i]);
            }
        }
        if (source.HostSet != null) {
            this.HostSet = new BaselineHost[source.HostSet.length];
            for (int i = 0; i < source.HostSet.length; i++) {
                this.HostSet[i] = new BaselineHost(source.HostSet[i]);
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
        this.setParamArrayObj(map, prefix + "ItemSet.", this.ItemSet);
        this.setParamArrayObj(map, prefix + "HostSet.", this.HostSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

