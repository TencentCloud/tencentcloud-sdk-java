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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubUserInfoResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 子用户列表
    */
    @SerializedName("Data")
    @Expose
    private SubUserInfo [] Data;

    /**
    * 厂商枚举列表
    */
    @SerializedName("CloudTypeLst")
    @Expose
    private FilterDataObject [] CloudTypeLst;

    /**
    * 所属主账号appid枚举
    */
    @SerializedName("OwnerAppIDLst")
    @Expose
    private FilterDataObject [] OwnerAppIDLst;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 子用户列表 
     * @return Data 子用户列表
     */
    public SubUserInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 子用户列表
     * @param Data 子用户列表
     */
    public void setData(SubUserInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 厂商枚举列表 
     * @return CloudTypeLst 厂商枚举列表
     */
    public FilterDataObject [] getCloudTypeLst() {
        return this.CloudTypeLst;
    }

    /**
     * Set 厂商枚举列表
     * @param CloudTypeLst 厂商枚举列表
     */
    public void setCloudTypeLst(FilterDataObject [] CloudTypeLst) {
        this.CloudTypeLst = CloudTypeLst;
    }

    /**
     * Get 所属主账号appid枚举 
     * @return OwnerAppIDLst 所属主账号appid枚举
     */
    public FilterDataObject [] getOwnerAppIDLst() {
        return this.OwnerAppIDLst;
    }

    /**
     * Set 所属主账号appid枚举
     * @param OwnerAppIDLst 所属主账号appid枚举
     */
    public void setOwnerAppIDLst(FilterDataObject [] OwnerAppIDLst) {
        this.OwnerAppIDLst = OwnerAppIDLst;
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

    public DescribeSubUserInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubUserInfoResponse(DescribeSubUserInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new SubUserInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SubUserInfo(source.Data[i]);
            }
        }
        if (source.CloudTypeLst != null) {
            this.CloudTypeLst = new FilterDataObject[source.CloudTypeLst.length];
            for (int i = 0; i < source.CloudTypeLst.length; i++) {
                this.CloudTypeLst[i] = new FilterDataObject(source.CloudTypeLst[i]);
            }
        }
        if (source.OwnerAppIDLst != null) {
            this.OwnerAppIDLst = new FilterDataObject[source.OwnerAppIDLst.length];
            for (int i = 0; i < source.OwnerAppIDLst.length; i++) {
                this.OwnerAppIDLst[i] = new FilterDataObject(source.OwnerAppIDLst[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "CloudTypeLst.", this.CloudTypeLst);
        this.setParamArrayObj(map, prefix + "OwnerAppIDLst.", this.OwnerAppIDLst);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

