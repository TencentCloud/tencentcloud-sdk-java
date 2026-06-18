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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSSLStatusResponse extends AbstractModel {

    /**
    * <p>SSL启用状态</p><p>枚举值：</p><ul><li>Enabled： SSL已开启</li><li>Disabled： SSL已关闭</li><li>Enabling： SSL开启中</li><li>Disabling： SSL关闭中</li></ul>
    */
    @SerializedName("SSLStatus")
    @Expose
    private String SSLStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>SSL启用状态</p><p>枚举值：</p><ul><li>Enabled： SSL已开启</li><li>Disabled： SSL已关闭</li><li>Enabling： SSL开启中</li><li>Disabling： SSL关闭中</li></ul> 
     * @return SSLStatus <p>SSL启用状态</p><p>枚举值：</p><ul><li>Enabled： SSL已开启</li><li>Disabled： SSL已关闭</li><li>Enabling： SSL开启中</li><li>Disabling： SSL关闭中</li></ul>
     */
    public String getSSLStatus() {
        return this.SSLStatus;
    }

    /**
     * Set <p>SSL启用状态</p><p>枚举值：</p><ul><li>Enabled： SSL已开启</li><li>Disabled： SSL已关闭</li><li>Enabling： SSL开启中</li><li>Disabling： SSL关闭中</li></ul>
     * @param SSLStatus <p>SSL启用状态</p><p>枚举值：</p><ul><li>Enabled： SSL已开启</li><li>Disabled： SSL已关闭</li><li>Enabling： SSL开启中</li><li>Disabling： SSL关闭中</li></ul>
     */
    public void setSSLStatus(String SSLStatus) {
        this.SSLStatus = SSLStatus;
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

    public DescribeInstanceSSLStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSSLStatusResponse(DescribeInstanceSSLStatusResponse source) {
        if (source.SSLStatus != null) {
            this.SSLStatus = new String(source.SSLStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLStatus", this.SSLStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

