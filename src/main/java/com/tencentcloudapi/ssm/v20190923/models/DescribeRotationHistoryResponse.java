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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRotationHistoryResponse extends AbstractModel {

    /**
    * <p>版本号列表</p>
    */
    @SerializedName("VersionIDs")
    @Expose
    private String [] VersionIDs;

    /**
    * <p>版本号个数，可以给用户展示的版本号个数上限为10个。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>凭据对应账号相关信息</p>
    */
    @SerializedName("AccountInfoList")
    @Expose
    private SecretAccountInfo [] AccountInfoList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>版本号列表</p> 
     * @return VersionIDs <p>版本号列表</p>
     */
    public String [] getVersionIDs() {
        return this.VersionIDs;
    }

    /**
     * Set <p>版本号列表</p>
     * @param VersionIDs <p>版本号列表</p>
     */
    public void setVersionIDs(String [] VersionIDs) {
        this.VersionIDs = VersionIDs;
    }

    /**
     * Get <p>版本号个数，可以给用户展示的版本号个数上限为10个。</p> 
     * @return TotalCount <p>版本号个数，可以给用户展示的版本号个数上限为10个。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>版本号个数，可以给用户展示的版本号个数上限为10个。</p>
     * @param TotalCount <p>版本号个数，可以给用户展示的版本号个数上限为10个。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>凭据对应账号相关信息</p> 
     * @return AccountInfoList <p>凭据对应账号相关信息</p>
     */
    public SecretAccountInfo [] getAccountInfoList() {
        return this.AccountInfoList;
    }

    /**
     * Set <p>凭据对应账号相关信息</p>
     * @param AccountInfoList <p>凭据对应账号相关信息</p>
     */
    public void setAccountInfoList(SecretAccountInfo [] AccountInfoList) {
        this.AccountInfoList = AccountInfoList;
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

    public DescribeRotationHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRotationHistoryResponse(DescribeRotationHistoryResponse source) {
        if (source.VersionIDs != null) {
            this.VersionIDs = new String[source.VersionIDs.length];
            for (int i = 0; i < source.VersionIDs.length; i++) {
                this.VersionIDs[i] = new String(source.VersionIDs[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccountInfoList != null) {
            this.AccountInfoList = new SecretAccountInfo[source.AccountInfoList.length];
            for (int i = 0; i < source.AccountInfoList.length; i++) {
                this.AccountInfoList[i] = new SecretAccountInfo(source.AccountInfoList[i]);
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
        this.setParamArraySimple(map, prefix + "VersionIDs.", this.VersionIDs);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AccountInfoList.", this.AccountInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

