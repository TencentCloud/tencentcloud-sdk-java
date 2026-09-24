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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirtualAccountsRequest extends AbstractModel {

    /**
    * <p>账户虚拟组Id(只支持32位)</p>
    */
    @SerializedName("VirtualGroupId")
    @Expose
    private Long VirtualGroupId;

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * <p>滤条件、分页参数</p><li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户名称过滤。</li><li>UserId - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户账号过滤。</li><li>Phone - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按电话过滤。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
     * Get <p>账户虚拟组Id(只支持32位)</p> 
     * @return VirtualGroupId <p>账户虚拟组Id(只支持32位)</p>
     */
    public Long getVirtualGroupId() {
        return this.VirtualGroupId;
    }

    /**
     * Set <p>账户虚拟组Id(只支持32位)</p>
     * @param VirtualGroupId <p>账户虚拟组Id(只支持32位)</p>
     */
    public void setVirtualGroupId(Long VirtualGroupId) {
        this.VirtualGroupId = VirtualGroupId;
    }

    /**
     * Get 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。 
     * @return DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     * @param DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    /**
     * Get <p>滤条件、分页参数</p><li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户名称过滤。</li><li>UserId - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户账号过滤。</li><li>Phone - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按电话过滤。</li> 
     * @return Condition <p>滤条件、分页参数</p><li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户名称过滤。</li><li>UserId - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户账号过滤。</li><li>Phone - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按电话过滤。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>滤条件、分页参数</p><li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户名称过滤。</li><li>UserId - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户账号过滤。</li><li>Phone - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按电话过滤。</li>
     * @param Condition <p>滤条件、分页参数</p><li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户名称过滤。</li><li>UserId - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按用户账号过滤。</li><li>Phone - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按电话过滤。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    public DescribeVirtualAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirtualAccountsRequest(DescribeVirtualAccountsRequest source) {
        if (source.VirtualGroupId != null) {
            this.VirtualGroupId = new Long(source.VirtualGroupId);
        }
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VirtualGroupId", this.VirtualGroupId);
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);

    }
}

