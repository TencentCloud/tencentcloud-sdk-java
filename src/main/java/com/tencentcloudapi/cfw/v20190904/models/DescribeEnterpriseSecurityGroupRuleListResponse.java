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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnterpriseSecurityGroupRuleListResponse extends AbstractModel {

    /**
    * 查询结果总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 规则总数
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * 规则列表
    */
    @SerializedName("Data")
    @Expose
    private EnterpriseSecurityGroupRuleRuleInfo [] Data;

    /**
    * 规则列表整体启用状态 
取值范围 0/1/2
0.表示没有启用的(可以批量启用)  
1.表示没有禁用的(可以批量禁用)    
2 表示混合情况（不可批量操作）
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询结果总数 
     * @return Total 查询结果总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询结果总数
     * @param Total 查询结果总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 规则总数 
     * @return AllTotal 规则总数
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set 规则总数
     * @param AllTotal 规则总数
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get 规则列表 
     * @return Data 规则列表
     */
    public EnterpriseSecurityGroupRuleRuleInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 规则列表
     * @param Data 规则列表
     */
    public void setData(EnterpriseSecurityGroupRuleRuleInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 规则列表整体启用状态 
取值范围 0/1/2
0.表示没有启用的(可以批量启用)  
1.表示没有禁用的(可以批量禁用)    
2 表示混合情况（不可批量操作） 
     * @return Enable 规则列表整体启用状态 
取值范围 0/1/2
0.表示没有启用的(可以批量启用)  
1.表示没有禁用的(可以批量禁用)    
2 表示混合情况（不可批量操作）
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则列表整体启用状态 
取值范围 0/1/2
0.表示没有启用的(可以批量启用)  
1.表示没有禁用的(可以批量禁用)    
2 表示混合情况（不可批量操作）
     * @param Enable 规则列表整体启用状态 
取值范围 0/1/2
0.表示没有启用的(可以批量启用)  
1.表示没有禁用的(可以批量禁用)    
2 表示混合情况（不可批量操作）
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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

    public DescribeEnterpriseSecurityGroupRuleListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnterpriseSecurityGroupRuleListResponse(DescribeEnterpriseSecurityGroupRuleListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.Data != null) {
            this.Data = new EnterpriseSecurityGroupRuleRuleInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new EnterpriseSecurityGroupRuleRuleInfo(source.Data[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
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
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

