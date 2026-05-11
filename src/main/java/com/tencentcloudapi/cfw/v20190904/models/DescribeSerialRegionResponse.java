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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSerialRegionResponse extends AbstractModel {

    /**
    * 串行地域带宽分配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialRegionLst")
    @Expose
    private SerialRegionInfo [] SerialRegionLst;

    /**
    * 剩余可分配通用带宽 单位M
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnUsedWidth")
    @Expose
    private Long UnUsedWidth;

    /**
    * 可配置实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnUsedQuota")
    @Expose
    private Long UnUsedQuota;

    /**
    * 旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BypassWidth")
    @Expose
    private Long BypassWidth;

    /**
    * 赠送的旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendBypassWidth")
    @Expose
    private Long SendBypassWidth;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 串行地域带宽分配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialRegionLst 串行地域带宽分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SerialRegionInfo [] getSerialRegionLst() {
        return this.SerialRegionLst;
    }

    /**
     * Set 串行地域带宽分配
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialRegionLst 串行地域带宽分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialRegionLst(SerialRegionInfo [] SerialRegionLst) {
        this.SerialRegionLst = SerialRegionLst;
    }

    /**
     * Get 剩余可分配通用带宽 单位M
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnUsedWidth 剩余可分配通用带宽 单位M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnUsedWidth() {
        return this.UnUsedWidth;
    }

    /**
     * Set 剩余可分配通用带宽 单位M
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnUsedWidth 剩余可分配通用带宽 单位M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnUsedWidth(Long UnUsedWidth) {
        this.UnUsedWidth = UnUsedWidth;
    }

    /**
     * Get 可配置实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnUsedQuota 可配置实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnUsedQuota() {
        return this.UnUsedQuota;
    }

    /**
     * Set 可配置实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnUsedQuota 可配置实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnUsedQuota(Long UnUsedQuota) {
        this.UnUsedQuota = UnUsedQuota;
    }

    /**
     * Get 旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BypassWidth 旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBypassWidth() {
        return this.BypassWidth;
    }

    /**
     * Set 旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param BypassWidth 旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBypassWidth(Long BypassWidth) {
        this.BypassWidth = BypassWidth;
    }

    /**
     * Get 赠送的旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendBypassWidth 赠送的旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSendBypassWidth() {
        return this.SendBypassWidth;
    }

    /**
     * Set 赠送的旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendBypassWidth 赠送的旁路带宽数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendBypassWidth(Long SendBypassWidth) {
        this.SendBypassWidth = SendBypassWidth;
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

    public DescribeSerialRegionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSerialRegionResponse(DescribeSerialRegionResponse source) {
        if (source.SerialRegionLst != null) {
            this.SerialRegionLst = new SerialRegionInfo[source.SerialRegionLst.length];
            for (int i = 0; i < source.SerialRegionLst.length; i++) {
                this.SerialRegionLst[i] = new SerialRegionInfo(source.SerialRegionLst[i]);
            }
        }
        if (source.UnUsedWidth != null) {
            this.UnUsedWidth = new Long(source.UnUsedWidth);
        }
        if (source.UnUsedQuota != null) {
            this.UnUsedQuota = new Long(source.UnUsedQuota);
        }
        if (source.BypassWidth != null) {
            this.BypassWidth = new Long(source.BypassWidth);
        }
        if (source.SendBypassWidth != null) {
            this.SendBypassWidth = new Long(source.SendBypassWidth);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SerialRegionLst.", this.SerialRegionLst);
        this.setParamSimple(map, prefix + "UnUsedWidth", this.UnUsedWidth);
        this.setParamSimple(map, prefix + "UnUsedQuota", this.UnUsedQuota);
        this.setParamSimple(map, prefix + "BypassWidth", this.BypassWidth);
        this.setParamSimple(map, prefix + "SendBypassWidth", this.SendBypassWidth);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

