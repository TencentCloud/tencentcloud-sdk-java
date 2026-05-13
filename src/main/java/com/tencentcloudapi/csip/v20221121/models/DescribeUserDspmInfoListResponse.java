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

public class DescribeUserDspmInfoListResponse extends AbstractModel {

    /**
    * 账号dspm信息列表
    */
    @SerializedName("List")
    @Expose
    private UserDspmInfo [] List;

    /**
    * 已勾选数据库资产总数
    */
    @SerializedName("SelectedAssetNum")
    @Expose
    private Long SelectedAssetNum;

    /**
    * 账号总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账号dspm信息列表 
     * @return List 账号dspm信息列表
     */
    public UserDspmInfo [] getList() {
        return this.List;
    }

    /**
     * Set 账号dspm信息列表
     * @param List 账号dspm信息列表
     */
    public void setList(UserDspmInfo [] List) {
        this.List = List;
    }

    /**
     * Get 已勾选数据库资产总数 
     * @return SelectedAssetNum 已勾选数据库资产总数
     */
    public Long getSelectedAssetNum() {
        return this.SelectedAssetNum;
    }

    /**
     * Set 已勾选数据库资产总数
     * @param SelectedAssetNum 已勾选数据库资产总数
     */
    public void setSelectedAssetNum(Long SelectedAssetNum) {
        this.SelectedAssetNum = SelectedAssetNum;
    }

    /**
     * Get 账号总数 
     * @return Count 账号总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 账号总数
     * @param Count 账号总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    public DescribeUserDspmInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserDspmInfoListResponse(DescribeUserDspmInfoListResponse source) {
        if (source.List != null) {
            this.List = new UserDspmInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new UserDspmInfo(source.List[i]);
            }
        }
        if (source.SelectedAssetNum != null) {
            this.SelectedAssetNum = new Long(source.SelectedAssetNum);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "SelectedAssetNum", this.SelectedAssetNum);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

