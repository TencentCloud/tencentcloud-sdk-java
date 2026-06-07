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
    * <p>是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li></p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>开启范围 <li>0 自选主机</li> <li>1 全部主机</li></p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>正选主机配置数</p>
    */
    @SerializedName("IncludeHostCount")
    @Expose
    private Long IncludeHostCount;

    /**
    * <p>反选主机配置数</p>
    */
    @SerializedName("ExcludeHostCount")
    @Expose
    private Long ExcludeHostCount;

    /**
    * <p>正选quuid配置列表</p>
    */
    @SerializedName("IncludeQuuid")
    @Expose
    private String [] IncludeQuuid;

    /**
    * <p>反选quuid配置列表</p>
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
    * <p>已开启机器数</p>
    */
    @SerializedName("EnableCount")
    @Expose
    private Long EnableCount;

    /**
    * <p>未启机器数</p>
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
     * Get <p>是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li></p> 
     * @return Enable <p>是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li></p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li></p>
     * @param Enable <p>是否开启防卸载 <li>0 否</li> <li>1 是</li> <li>9 未设置,和0一样是未开启</li></p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>开启范围 <li>0 自选主机</li> <li>1 全部主机</li></p> 
     * @return Scope <p>开启范围 <li>0 自选主机</li> <li>1 全部主机</li></p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>开启范围 <li>0 自选主机</li> <li>1 全部主机</li></p>
     * @param Scope <p>开启范围 <li>0 自选主机</li> <li>1 全部主机</li></p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>正选主机配置数</p> 
     * @return IncludeHostCount <p>正选主机配置数</p>
     */
    public Long getIncludeHostCount() {
        return this.IncludeHostCount;
    }

    /**
     * Set <p>正选主机配置数</p>
     * @param IncludeHostCount <p>正选主机配置数</p>
     */
    public void setIncludeHostCount(Long IncludeHostCount) {
        this.IncludeHostCount = IncludeHostCount;
    }

    /**
     * Get <p>反选主机配置数</p> 
     * @return ExcludeHostCount <p>反选主机配置数</p>
     */
    public Long getExcludeHostCount() {
        return this.ExcludeHostCount;
    }

    /**
     * Set <p>反选主机配置数</p>
     * @param ExcludeHostCount <p>反选主机配置数</p>
     */
    public void setExcludeHostCount(Long ExcludeHostCount) {
        this.ExcludeHostCount = ExcludeHostCount;
    }

    /**
     * Get <p>正选quuid配置列表</p> 
     * @return IncludeQuuid <p>正选quuid配置列表</p>
     */
    public String [] getIncludeQuuid() {
        return this.IncludeQuuid;
    }

    /**
     * Set <p>正选quuid配置列表</p>
     * @param IncludeQuuid <p>正选quuid配置列表</p>
     */
    public void setIncludeQuuid(String [] IncludeQuuid) {
        this.IncludeQuuid = IncludeQuuid;
    }

    /**
     * Get <p>反选quuid配置列表</p> 
     * @return ExcludeQuuid <p>反选quuid配置列表</p>
     */
    public String [] getExcludeQuuid() {
        return this.ExcludeQuuid;
    }

    /**
     * Set <p>反选quuid配置列表</p>
     * @param ExcludeQuuid <p>反选quuid配置列表</p>
     */
    public void setExcludeQuuid(String [] ExcludeQuuid) {
        this.ExcludeQuuid = ExcludeQuuid;
    }

    /**
     * Get <p>已开启机器数</p> 
     * @return EnableCount <p>已开启机器数</p>
     */
    public Long getEnableCount() {
        return this.EnableCount;
    }

    /**
     * Set <p>已开启机器数</p>
     * @param EnableCount <p>已开启机器数</p>
     */
    public void setEnableCount(Long EnableCount) {
        this.EnableCount = EnableCount;
    }

    /**
     * Get <p>未启机器数</p> 
     * @return DisableCount <p>未启机器数</p>
     */
    public Long getDisableCount() {
        return this.DisableCount;
    }

    /**
     * Set <p>未启机器数</p>
     * @param DisableCount <p>未启机器数</p>
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

