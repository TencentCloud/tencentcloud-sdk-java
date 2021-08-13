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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwInfoCountResponse extends AbstractModel{

    /**
    * 返回参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 当前租户的nat实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatFwInsCount")
    @Expose
    private Long NatFwInsCount;

    /**
    * 当前租户接入子网个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetCount")
    @Expose
    private Long SubnetCount;

    /**
    * 打开开关个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenSwitchCount")
    @Expose
    private Long OpenSwitchCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnMsg 返回参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 返回参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnMsg 返回参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 当前租户的nat实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatFwInsCount 当前租户的nat实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNatFwInsCount() {
        return this.NatFwInsCount;
    }

    /**
     * Set 当前租户的nat实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatFwInsCount 当前租户的nat实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatFwInsCount(Long NatFwInsCount) {
        this.NatFwInsCount = NatFwInsCount;
    }

    /**
     * Get 当前租户接入子网个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetCount 当前租户接入子网个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubnetCount() {
        return this.SubnetCount;
    }

    /**
     * Set 当前租户接入子网个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetCount 当前租户接入子网个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetCount(Long SubnetCount) {
        this.SubnetCount = SubnetCount;
    }

    /**
     * Get 打开开关个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenSwitchCount 打开开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOpenSwitchCount() {
        return this.OpenSwitchCount;
    }

    /**
     * Set 打开开关个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenSwitchCount 打开开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenSwitchCount(Long OpenSwitchCount) {
        this.OpenSwitchCount = OpenSwitchCount;
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

    public DescribeNatFwInfoCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwInfoCountResponse(DescribeNatFwInfoCountResponse source) {
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.NatFwInsCount != null) {
            this.NatFwInsCount = new Long(source.NatFwInsCount);
        }
        if (source.SubnetCount != null) {
            this.SubnetCount = new Long(source.SubnetCount);
        }
        if (source.OpenSwitchCount != null) {
            this.OpenSwitchCount = new Long(source.OpenSwitchCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "NatFwInsCount", this.NatFwInsCount);
        this.setParamSimple(map, prefix + "SubnetCount", this.SubnetCount);
        this.setParamSimple(map, prefix + "OpenSwitchCount", this.OpenSwitchCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

