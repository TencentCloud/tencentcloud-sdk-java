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

public class DescribeFwEdgeIpsResponse extends AbstractModel {

    /**
    * <p>ip 开关列表</p>
    */
    @SerializedName("Data")
    @Expose
    private EdgeIpInfo [] Data;

    /**
    * <p>ip 开关列表个数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>地域列表</p>
    */
    @SerializedName("RegionLst")
    @Expose
    private String [] RegionLst;

    /**
    * <p>实例类型列表</p>
    */
    @SerializedName("InstanceTypeLst")
    @Expose
    private String [] InstanceTypeLst;

    /**
    * <p>串行模式开关个数</p>
    */
    @SerializedName("SerilCount")
    @Expose
    private Long SerilCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>ip 开关列表</p> 
     * @return Data <p>ip 开关列表</p>
     */
    public EdgeIpInfo [] getData() {
        return this.Data;
    }

    /**
     * Set <p>ip 开关列表</p>
     * @param Data <p>ip 开关列表</p>
     */
    public void setData(EdgeIpInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>ip 开关列表个数</p> 
     * @return Total <p>ip 开关列表个数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>ip 开关列表个数</p>
     * @param Total <p>ip 开关列表个数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>地域列表</p> 
     * @return RegionLst <p>地域列表</p>
     */
    public String [] getRegionLst() {
        return this.RegionLst;
    }

    /**
     * Set <p>地域列表</p>
     * @param RegionLst <p>地域列表</p>
     */
    public void setRegionLst(String [] RegionLst) {
        this.RegionLst = RegionLst;
    }

    /**
     * Get <p>实例类型列表</p> 
     * @return InstanceTypeLst <p>实例类型列表</p>
     */
    public String [] getInstanceTypeLst() {
        return this.InstanceTypeLst;
    }

    /**
     * Set <p>实例类型列表</p>
     * @param InstanceTypeLst <p>实例类型列表</p>
     */
    public void setInstanceTypeLst(String [] InstanceTypeLst) {
        this.InstanceTypeLst = InstanceTypeLst;
    }

    /**
     * Get <p>串行模式开关个数</p> 
     * @return SerilCount <p>串行模式开关个数</p>
     */
    public Long getSerilCount() {
        return this.SerilCount;
    }

    /**
     * Set <p>串行模式开关个数</p>
     * @param SerilCount <p>串行模式开关个数</p>
     */
    public void setSerilCount(Long SerilCount) {
        this.SerilCount = SerilCount;
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
        if (source.SerilCount != null) {
            this.SerilCount = new Long(source.SerilCount);
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
        this.setParamSimple(map, prefix + "SerilCount", this.SerilCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

