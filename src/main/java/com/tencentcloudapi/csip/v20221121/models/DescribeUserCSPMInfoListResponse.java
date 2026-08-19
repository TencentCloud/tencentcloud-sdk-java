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

public class DescribeUserCSPMInfoListResponse extends AbstractModel {

    /**
    * 账号CSPM列表
    */
    @SerializedName("List")
    @Expose
    private UserCSPMInfo [] List;

    /**
    * 已勾选账号CSPM配额总数
    */
    @SerializedName("SelectedCSPMNum")
    @Expose
    private Long SelectedCSPMNum;

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
     * Get 账号CSPM列表 
     * @return List 账号CSPM列表
     */
    public UserCSPMInfo [] getList() {
        return this.List;
    }

    /**
     * Set 账号CSPM列表
     * @param List 账号CSPM列表
     */
    public void setList(UserCSPMInfo [] List) {
        this.List = List;
    }

    /**
     * Get 已勾选账号CSPM配额总数 
     * @return SelectedCSPMNum 已勾选账号CSPM配额总数
     */
    public Long getSelectedCSPMNum() {
        return this.SelectedCSPMNum;
    }

    /**
     * Set 已勾选账号CSPM配额总数
     * @param SelectedCSPMNum 已勾选账号CSPM配额总数
     */
    public void setSelectedCSPMNum(Long SelectedCSPMNum) {
        this.SelectedCSPMNum = SelectedCSPMNum;
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

    public DescribeUserCSPMInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserCSPMInfoListResponse(DescribeUserCSPMInfoListResponse source) {
        if (source.List != null) {
            this.List = new UserCSPMInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new UserCSPMInfo(source.List[i]);
            }
        }
        if (source.SelectedCSPMNum != null) {
            this.SelectedCSPMNum = new Long(source.SelectedCSPMNum);
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
        this.setParamSimple(map, prefix + "SelectedCSPMNum", this.SelectedCSPMNum);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

