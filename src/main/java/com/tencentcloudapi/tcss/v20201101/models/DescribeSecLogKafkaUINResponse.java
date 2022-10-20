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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogKafkaUINResponse extends AbstractModel{

    /**
    * 目标UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstUIN")
    @Expose
    private String DstUIN;

    /**
    * 授权状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 目标UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstUIN 目标UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstUIN() {
        return this.DstUIN;
    }

    /**
     * Set 目标UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstUIN 目标UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstUIN(String DstUIN) {
        this.DstUIN = DstUIN;
    }

    /**
     * Get 授权状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 授权状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 授权状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 授权状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
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

    public DescribeSecLogKafkaUINResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogKafkaUINResponse(DescribeSecLogKafkaUINResponse source) {
        if (source.DstUIN != null) {
            this.DstUIN = new String(source.DstUIN);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DstUIN", this.DstUIN);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

