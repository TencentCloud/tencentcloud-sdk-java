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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFwEdgeIpsResponse extends AbstractModel {

    /**
    * ip 开关列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private EdgeIpInfo [] Data;

    /**
    * ip 开关列表个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 地域列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionLst")
    @Expose
    private String [] RegionLst;

    /**
    * 实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypeLst")
    @Expose
    private String [] InstanceTypeLst;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ip 开关列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data ip 开关列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeIpInfo [] getData() {
        return this.Data;
    }

    /**
     * Set ip 开关列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data ip 开关列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(EdgeIpInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get ip 开关列表个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total ip 开关列表个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set ip 开关列表个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total ip 开关列表个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 地域列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionLst 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegionLst() {
        return this.RegionLst;
    }

    /**
     * Set 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionLst 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionLst(String [] RegionLst) {
        this.RegionLst = RegionLst;
    }

    /**
     * Get 实例类型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypeLst 实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceTypeLst() {
        return this.InstanceTypeLst;
    }

    /**
     * Set 实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypeLst 实例类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypeLst(String [] InstanceTypeLst) {
        this.InstanceTypeLst = InstanceTypeLst;
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

    public DescribeFwEdgeIpsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFwEdgeIpsResponse(DescribeFwEdgeIpsResponse source) {
        if (source.Data != null) {
            this.Data = new EdgeIpInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new EdgeIpInfo(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RegionLst != null) {
            this.RegionLst = new String[source.RegionLst.length];
            for (int i = 0; i < source.RegionLst.length; i++) {
                this.RegionLst[i] = new String(source.RegionLst[i]);
            }
        }
        if (source.InstanceTypeLst != null) {
            this.InstanceTypeLst = new String[source.InstanceTypeLst.length];
            for (int i = 0; i < source.InstanceTypeLst.length; i++) {
                this.InstanceTypeLst[i] = new String(source.InstanceTypeLst[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArraySimple(map, prefix + "RegionLst.", this.RegionLst);
        this.setParamArraySimple(map, prefix + "InstanceTypeLst.", this.InstanceTypeLst);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

