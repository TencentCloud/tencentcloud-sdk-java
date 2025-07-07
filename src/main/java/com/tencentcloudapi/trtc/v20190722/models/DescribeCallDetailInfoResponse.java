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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallDetailInfoResponse extends AbstractModel {

    /**
    * 返回的用户总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 用户信息列表
    */
    @SerializedName("UserList")
    @Expose
    private UserInformation [] UserList;

    /**
    * 质量数据
    */
    @SerializedName("Data")
    @Expose
    private QualityData [] Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的用户总条数 
     * @return Total 返回的用户总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 返回的用户总条数
     * @param Total 返回的用户总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 用户信息列表 
     * @return UserList 用户信息列表
     */
    public UserInformation [] getUserList() {
        return this.UserList;
    }

    /**
     * Set 用户信息列表
     * @param UserList 用户信息列表
     */
    public void setUserList(UserInformation [] UserList) {
        this.UserList = UserList;
    }

    /**
     * Get 质量数据 
     * @return Data 质量数据
     */
    public QualityData [] getData() {
        return this.Data;
    }

    /**
     * Set 质量数据
     * @param Data 质量数据
     */
    public void setData(QualityData [] Data) {
        this.Data = Data;
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

    public DescribeCallDetailInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallDetailInfoResponse(DescribeCallDetailInfoResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.UserList != null) {
            this.UserList = new UserInformation[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new UserInformation(source.UserList[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new QualityData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new QualityData(source.Data[i]);
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
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

