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

public class DescribeNatFwSwitchResponse extends AbstractModel {

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * NAT边界防火墙开关列表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private NatSwitchListData [] Data;

    /**
    * 开关相关VPC列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcList")
    @Expose
    private CommonIdName [] VpcList;

    /**
    * 开关相关NAT列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatList")
    @Expose
    private CommonIdName [] NatList;

    /**
    * 开关相关ROUTE列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteList")
    @Expose
    private CommonIdName [] RouteList;

    /**
    * 开启开关个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnNum")
    @Expose
    private Long OnNum;

    /**
    * 关闭开关个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffNum")
    @Expose
    private Long OffNum;

    /**
    * 失败开关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailData")
    @Expose
    private CommonIdNameStatus [] FailData;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get NAT边界防火墙开关列表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data NAT边界防火墙开关列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NatSwitchListData [] getData() {
        return this.Data;
    }

    /**
     * Set NAT边界防火墙开关列表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data NAT边界防火墙开关列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(NatSwitchListData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 开关相关VPC列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcList 开关相关VPC列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonIdName [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 开关相关VPC列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcList 开关相关VPC列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcList(CommonIdName [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 开关相关NAT列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatList 开关相关NAT列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonIdName [] getNatList() {
        return this.NatList;
    }

    /**
     * Set 开关相关NAT列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatList 开关相关NAT列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatList(CommonIdName [] NatList) {
        this.NatList = NatList;
    }

    /**
     * Get 开关相关ROUTE列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteList 开关相关ROUTE列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonIdName [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set 开关相关ROUTE列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteList 开关相关ROUTE列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteList(CommonIdName [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get 开启开关个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnNum 开启开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOnNum() {
        return this.OnNum;
    }

    /**
     * Set 开启开关个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnNum 开启开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnNum(Long OnNum) {
        this.OnNum = OnNum;
    }

    /**
     * Get 关闭开关个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffNum 关闭开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffNum() {
        return this.OffNum;
    }

    /**
     * Set 关闭开关个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffNum 关闭开关个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffNum(Long OffNum) {
        this.OffNum = OffNum;
    }

    /**
     * Get 失败开关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailData 失败开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonIdNameStatus [] getFailData() {
        return this.FailData;
    }

    /**
     * Set 失败开关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailData 失败开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailData(CommonIdNameStatus [] FailData) {
        this.FailData = FailData;
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

    public DescribeNatFwSwitchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwSwitchResponse(DescribeNatFwSwitchResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new NatSwitchListData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new NatSwitchListData(source.Data[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new CommonIdName[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new CommonIdName(source.VpcList[i]);
            }
        }
        if (source.NatList != null) {
            this.NatList = new CommonIdName[source.NatList.length];
            for (int i = 0; i < source.NatList.length; i++) {
                this.NatList[i] = new CommonIdName(source.NatList[i]);
            }
        }
        if (source.RouteList != null) {
            this.RouteList = new CommonIdName[source.RouteList.length];
            for (int i = 0; i < source.RouteList.length; i++) {
                this.RouteList[i] = new CommonIdName(source.RouteList[i]);
            }
        }
        if (source.OnNum != null) {
            this.OnNum = new Long(source.OnNum);
        }
        if (source.OffNum != null) {
            this.OffNum = new Long(source.OffNum);
        }
        if (source.FailData != null) {
            this.FailData = new CommonIdNameStatus[source.FailData.length];
            for (int i = 0; i < source.FailData.length; i++) {
                this.FailData[i] = new CommonIdNameStatus(source.FailData[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "NatList.", this.NatList);
        this.setParamArrayObj(map, prefix + "RouteList.", this.RouteList);
        this.setParamSimple(map, prefix + "OnNum", this.OnNum);
        this.setParamSimple(map, prefix + "OffNum", this.OffNum);
        this.setParamArrayObj(map, prefix + "FailData.", this.FailData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

