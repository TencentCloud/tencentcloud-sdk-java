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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginTypeGlobalConfResponse extends AbstractModel {

    /**
    * 是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 开启范围 <li>0 自选主机</li> <li>1 全部主机</li>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 正选主机配置数
    */
    @SerializedName("IncludeHostCount")
    @Expose
    private Long IncludeHostCount;

    /**
    * 反选主机配置数
    */
    @SerializedName("ExcludeHostCount")
    @Expose
    private Long ExcludeHostCount;

    /**
    * 正选quuid配置列表
    */
    @SerializedName("IncludeQuuid")
    @Expose
    private String [] IncludeQuuid;

    /**
    * 反选quuid配置列表
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
    * 已开启机器数
    */
    @SerializedName("EnableCount")
    @Expose
    private Long EnableCount;

    /**
    * 未启机器数
    */
    @SerializedName("DisableCount")
    @Expose
    private Long DisableCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li> 
     * @return Enable 是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li>
     * @param Enable 是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 开启范围 <li>0 自选主机</li> <li>1 全部主机</li> 
     * @return Scope 开启范围 <li>0 自选主机</li> <li>1 全部主机</li>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 开启范围 <li>0 自选主机</li> <li>1 全部主机</li>
     * @param Scope 开启范围 <li>0 自选主机</li> <li>1 全部主机</li>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 正选主机配置数 
     * @return IncludeHostCount 正选主机配置数
     */
    public Long getIncludeHostCount() {
        return this.IncludeHostCount;
    }

    /**
     * Set 正选主机配置数
     * @param IncludeHostCount 正选主机配置数
     */
    public void setIncludeHostCount(Long IncludeHostCount) {
        this.IncludeHostCount = IncludeHostCount;
    }

    /**
     * Get 反选主机配置数 
     * @return ExcludeHostCount 反选主机配置数
     */
    public Long getExcludeHostCount() {
        return this.ExcludeHostCount;
    }

    /**
     * Set 反选主机配置数
     * @param ExcludeHostCount 反选主机配置数
     */
    public void setExcludeHostCount(Long ExcludeHostCount) {
        this.ExcludeHostCount = ExcludeHostCount;
    }

    /**
     * Get 正选quuid配置列表 
     * @return IncludeQuuid 正选quuid配置列表
     */
    public String [] getIncludeQuuid() {
        return this.IncludeQuuid;
    }

    /**
     * Set 正选quuid配置列表
     * @param IncludeQuuid 正选quuid配置列表
     */
    public void setIncludeQuuid(String [] IncludeQuuid) {
        this.IncludeQuuid = IncludeQuuid;
    }

    /**
     * Get 反选quuid配置列表 
     * @return ExcludeQuuid 反选quuid配置列表
     */
    public String [] getExcludeQuuid() {
        return this.ExcludeQuuid;
    }

    /**
     * Set 反选quuid配置列表
     * @param ExcludeQuuid 反选quuid配置列表
     */
    public void setExcludeQuuid(String [] ExcludeQuuid) {
        this.ExcludeQuuid = ExcludeQuuid;
    }

    /**
     * Get 已开启机器数 
     * @return EnableCount 已开启机器数
     */
    public Long getEnableCount() {
        return this.EnableCount;
    }

    /**
     * Set 已开启机器数
     * @param EnableCount 已开启机器数
     */
    public void setEnableCount(Long EnableCount) {
        this.EnableCount = EnableCount;
    }

    /**
     * Get 未启机器数 
     * @return DisableCount 未启机器数
     */
    public Long getDisableCount() {
        return this.DisableCount;
    }

    /**
     * Set 未启机器数
     * @param DisableCount 未启机器数
     */
    public void setDisableCount(Long DisableCount) {
        this.DisableCount = DisableCount;
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

    public DescribeLoginTypeGlobalConfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginTypeGlobalConfResponse(DescribeLoginTypeGlobalConfResponse source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.IncludeHostCount != null) {
            this.IncludeHostCount = new Long(source.IncludeHostCount);
        }
        if (source.ExcludeHostCount != null) {
            this.ExcludeHostCount = new Long(source.ExcludeHostCount);
        }
        if (source.IncludeQuuid != null) {
            this.IncludeQuuid = new String[source.IncludeQuuid.length];
            for (int i = 0; i < source.IncludeQuuid.length; i++) {
                this.IncludeQuuid[i] = new String(source.IncludeQuuid[i]);
            }
        }
        if (source.ExcludeQuuid != null) {
            this.ExcludeQuuid = new String[source.ExcludeQuuid.length];
            for (int i = 0; i < source.ExcludeQuuid.length; i++) {
                this.ExcludeQuuid[i] = new String(source.ExcludeQuuid[i]);
            }
        }
        if (source.EnableCount != null) {
            this.EnableCount = new Long(source.EnableCount);
        }
        if (source.DisableCount != null) {
            this.DisableCount = new Long(source.DisableCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "IncludeHostCount", this.IncludeHostCount);
        this.setParamSimple(map, prefix + "ExcludeHostCount", this.ExcludeHostCount);
        this.setParamArraySimple(map, prefix + "IncludeQuuid.", this.IncludeQuuid);
        this.setParamArraySimple(map, prefix + "ExcludeQuuid.", this.ExcludeQuuid);
        this.setParamSimple(map, prefix + "EnableCount", this.EnableCount);
        this.setParamSimple(map, prefix + "DisableCount", this.DisableCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

