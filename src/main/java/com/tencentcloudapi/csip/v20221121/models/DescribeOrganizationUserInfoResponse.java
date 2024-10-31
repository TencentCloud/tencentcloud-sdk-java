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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationUserInfoResponse extends AbstractModel {

    /**
    * 总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 集团用户列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private OrganizationUserInfo [] Data;

    /**
    * 加入方式枚举
    */
    @SerializedName("JoinTypeLst")
    @Expose
    private FilterDataObject [] JoinTypeLst;

    /**
    * 云厂商枚举
    */
    @SerializedName("CloudTypeLst")
    @Expose
    private FilterDataObject [] CloudTypeLst;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 集团用户列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 集团用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrganizationUserInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 集团用户列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 集团用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(OrganizationUserInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 加入方式枚举 
     * @return JoinTypeLst 加入方式枚举
     */
    public FilterDataObject [] getJoinTypeLst() {
        return this.JoinTypeLst;
    }

    /**
     * Set 加入方式枚举
     * @param JoinTypeLst 加入方式枚举
     */
    public void setJoinTypeLst(FilterDataObject [] JoinTypeLst) {
        this.JoinTypeLst = JoinTypeLst;
    }

    /**
     * Get 云厂商枚举 
     * @return CloudTypeLst 云厂商枚举
     */
    public FilterDataObject [] getCloudTypeLst() {
        return this.CloudTypeLst;
    }

    /**
     * Set 云厂商枚举
     * @param CloudTypeLst 云厂商枚举
     */
    public void setCloudTypeLst(FilterDataObject [] CloudTypeLst) {
        this.CloudTypeLst = CloudTypeLst;
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

    public DescribeOrganizationUserInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationUserInfoResponse(DescribeOrganizationUserInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new OrganizationUserInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new OrganizationUserInfo(source.Data[i]);
            }
        }
        if (source.JoinTypeLst != null) {
            this.JoinTypeLst = new FilterDataObject[source.JoinTypeLst.length];
            for (int i = 0; i < source.JoinTypeLst.length; i++) {
                this.JoinTypeLst[i] = new FilterDataObject(source.JoinTypeLst[i]);
            }
        }
        if (source.CloudTypeLst != null) {
            this.CloudTypeLst = new FilterDataObject[source.CloudTypeLst.length];
            for (int i = 0; i < source.CloudTypeLst.length; i++) {
                this.CloudTypeLst[i] = new FilterDataObject(source.CloudTypeLst[i]);
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
        this.setParamArrayObj(map, prefix + "JoinTypeLst.", this.JoinTypeLst);
        this.setParamArrayObj(map, prefix + "CloudTypeLst.", this.CloudTypeLst);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

