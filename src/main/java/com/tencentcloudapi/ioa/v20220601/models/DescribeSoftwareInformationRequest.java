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

public class DescribeSoftwareInformationRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * <p>终端唯一标识Mid</p>
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * <p>过滤条件、分页参数</p><li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * <p>0:win 2:mac</p>
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

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
     * Get <p>终端唯一标识Mid</p> 
     * @return Mid <p>终端唯一标识Mid</p>
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set <p>终端唯一标识Mid</p>
     * @param Mid <p>终端唯一标识Mid</p>
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get <p>过滤条件、分页参数</p><li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li> 
     * @return Condition <p>过滤条件、分页参数</p><li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>过滤条件、分页参数</p><li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     * @param Condition <p>过滤条件、分页参数</p><li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>0:win 2:mac</p> 
     * @return OsType <p>0:win 2:mac</p>
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>0:win 2:mac</p>
     * @param OsType <p>0:win 2:mac</p>
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public DescribeSoftwareInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSoftwareInformationRequest(DescribeSoftwareInformationRequest source) {
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

