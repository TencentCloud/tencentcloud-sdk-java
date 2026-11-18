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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEnvAccessControlResponse extends AbstractModel {

    /**
    * <p>本次请求影响的权限数量</p>
    */
    @SerializedName("AffectedRows")
    @Expose
    private Long AffectedRows;

    /**
    * <p>修改之后，当前的生效的配置</p><p>SourceType = PUBLIC 表示公网链路访问配置<br>SourceType = VPC 表示 VPC 链路访问配置<br>SourceType = WOA 表示办公网链路访问配置</p>
    */
    @SerializedName("Current")
    @Expose
    private AccessSourceSetting [] Current;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>本次请求影响的权限数量</p> 
     * @return AffectedRows <p>本次请求影响的权限数量</p>
     */
    public Long getAffectedRows() {
        return this.AffectedRows;
    }

    /**
     * Set <p>本次请求影响的权限数量</p>
     * @param AffectedRows <p>本次请求影响的权限数量</p>
     */
    public void setAffectedRows(Long AffectedRows) {
        this.AffectedRows = AffectedRows;
    }

    /**
     * Get <p>修改之后，当前的生效的配置</p><p>SourceType = PUBLIC 表示公网链路访问配置<br>SourceType = VPC 表示 VPC 链路访问配置<br>SourceType = WOA 表示办公网链路访问配置</p> 
     * @return Current <p>修改之后，当前的生效的配置</p><p>SourceType = PUBLIC 表示公网链路访问配置<br>SourceType = VPC 表示 VPC 链路访问配置<br>SourceType = WOA 表示办公网链路访问配置</p>
     */
    public AccessSourceSetting [] getCurrent() {
        return this.Current;
    }

    /**
     * Set <p>修改之后，当前的生效的配置</p><p>SourceType = PUBLIC 表示公网链路访问配置<br>SourceType = VPC 表示 VPC 链路访问配置<br>SourceType = WOA 表示办公网链路访问配置</p>
     * @param Current <p>修改之后，当前的生效的配置</p><p>SourceType = PUBLIC 表示公网链路访问配置<br>SourceType = VPC 表示 VPC 链路访问配置<br>SourceType = WOA 表示办公网链路访问配置</p>
     */
    public void setCurrent(AccessSourceSetting [] Current) {
        this.Current = Current;
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

    public ModifyEnvAccessControlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvAccessControlResponse(ModifyEnvAccessControlResponse source) {
        if (source.AffectedRows != null) {
            this.AffectedRows = new Long(source.AffectedRows);
        }
        if (source.Current != null) {
            this.Current = new AccessSourceSetting[source.Current.length];
            for (int i = 0; i < source.Current.length; i++) {
                this.Current[i] = new AccessSourceSetting(source.Current[i]);
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
        this.setParamSimple(map, prefix + "AffectedRows", this.AffectedRows);
        this.setParamArrayObj(map, prefix + "Current.", this.Current);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

