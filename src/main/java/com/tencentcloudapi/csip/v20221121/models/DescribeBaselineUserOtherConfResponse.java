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

public class DescribeBaselineUserOtherConfResponse extends AbstractModel {

    /**
    * <p>当前账号的用户级基线配置。</p>
    */
    @SerializedName("UserConf")
    @Expose
    private BaselineUserOtherConf UserConf;

    /**
    * <p>是否来自同步</p>
    */
    @SerializedName("IsSync")
    @Expose
    private Boolean IsSync;

    /**
    * <p>同步的账号信息</p>
    */
    @SerializedName("AdminInfo")
    @Expose
    private AccountBriefInfo AdminInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>当前账号的用户级基线配置。</p> 
     * @return UserConf <p>当前账号的用户级基线配置。</p>
     */
    public BaselineUserOtherConf getUserConf() {
        return this.UserConf;
    }

    /**
     * Set <p>当前账号的用户级基线配置。</p>
     * @param UserConf <p>当前账号的用户级基线配置。</p>
     */
    public void setUserConf(BaselineUserOtherConf UserConf) {
        this.UserConf = UserConf;
    }

    /**
     * Get <p>是否来自同步</p> 
     * @return IsSync <p>是否来自同步</p>
     */
    public Boolean getIsSync() {
        return this.IsSync;
    }

    /**
     * Set <p>是否来自同步</p>
     * @param IsSync <p>是否来自同步</p>
     */
    public void setIsSync(Boolean IsSync) {
        this.IsSync = IsSync;
    }

    /**
     * Get <p>同步的账号信息</p> 
     * @return AdminInfo <p>同步的账号信息</p>
     */
    public AccountBriefInfo getAdminInfo() {
        return this.AdminInfo;
    }

    /**
     * Set <p>同步的账号信息</p>
     * @param AdminInfo <p>同步的账号信息</p>
     */
    public void setAdminInfo(AccountBriefInfo AdminInfo) {
        this.AdminInfo = AdminInfo;
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

    public DescribeBaselineUserOtherConfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineUserOtherConfResponse(DescribeBaselineUserOtherConfResponse source) {
        if (source.UserConf != null) {
            this.UserConf = new BaselineUserOtherConf(source.UserConf);
        }
        if (source.IsSync != null) {
            this.IsSync = new Boolean(source.IsSync);
        }
        if (source.AdminInfo != null) {
            this.AdminInfo = new AccountBriefInfo(source.AdminInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserConf.", this.UserConf);
        this.setParamSimple(map, prefix + "IsSync", this.IsSync);
        this.setParamObj(map, prefix + "AdminInfo.", this.AdminInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

