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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWafAutoDenyRulesResponse extends AbstractModel {

    /**
    * 攻击次数阈值
    */
    @SerializedName("AttackThreshold")
    @Expose
    private Long AttackThreshold;

    /**
    * 攻击时间阈值
    */
    @SerializedName("TimeThreshold")
    @Expose
    private Long TimeThreshold;

    /**
    * 自动封禁时间
    */
    @SerializedName("DenyTimeThreshold")
    @Expose
    private Long DenyTimeThreshold;

    /**
    * 自动封禁状态
    */
    @SerializedName("DefenseStatus")
    @Expose
    private Long DefenseStatus;

    /**
    * 数据来源Source字段 custom-自定义(默认)、batch-domain-批量域名

    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 重保护网域名状态
    */
    @SerializedName("HWState")
    @Expose
    private Long HWState;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 攻击次数阈值 
     * @return AttackThreshold 攻击次数阈值
     */
    public Long getAttackThreshold() {
        return this.AttackThreshold;
    }

    /**
     * Set 攻击次数阈值
     * @param AttackThreshold 攻击次数阈值
     */
    public void setAttackThreshold(Long AttackThreshold) {
        this.AttackThreshold = AttackThreshold;
    }

    /**
     * Get 攻击时间阈值 
     * @return TimeThreshold 攻击时间阈值
     */
    public Long getTimeThreshold() {
        return this.TimeThreshold;
    }

    /**
     * Set 攻击时间阈值
     * @param TimeThreshold 攻击时间阈值
     */
    public void setTimeThreshold(Long TimeThreshold) {
        this.TimeThreshold = TimeThreshold;
    }

    /**
     * Get 自动封禁时间 
     * @return DenyTimeThreshold 自动封禁时间
     */
    public Long getDenyTimeThreshold() {
        return this.DenyTimeThreshold;
    }

    /**
     * Set 自动封禁时间
     * @param DenyTimeThreshold 自动封禁时间
     */
    public void setDenyTimeThreshold(Long DenyTimeThreshold) {
        this.DenyTimeThreshold = DenyTimeThreshold;
    }

    /**
     * Get 自动封禁状态 
     * @return DefenseStatus 自动封禁状态
     */
    public Long getDefenseStatus() {
        return this.DefenseStatus;
    }

    /**
     * Set 自动封禁状态
     * @param DefenseStatus 自动封禁状态
     */
    public void setDefenseStatus(Long DefenseStatus) {
        this.DefenseStatus = DefenseStatus;
    }

    /**
     * Get 数据来源Source字段 custom-自定义(默认)、batch-domain-批量域名
 
     * @return Source 数据来源Source字段 custom-自定义(默认)、batch-domain-批量域名

     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 数据来源Source字段 custom-自定义(默认)、batch-domain-批量域名

     * @param Source 数据来源Source字段 custom-自定义(默认)、batch-domain-批量域名

     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 重保护网域名状态 
     * @return HWState 重保护网域名状态
     */
    public Long getHWState() {
        return this.HWState;
    }

    /**
     * Set 重保护网域名状态
     * @param HWState 重保护网域名状态
     */
    public void setHWState(Long HWState) {
        this.HWState = HWState;
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

    public DescribeWafAutoDenyRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWafAutoDenyRulesResponse(DescribeWafAutoDenyRulesResponse source) {
        if (source.AttackThreshold != null) {
            this.AttackThreshold = new Long(source.AttackThreshold);
        }
        if (source.TimeThreshold != null) {
            this.TimeThreshold = new Long(source.TimeThreshold);
        }
        if (source.DenyTimeThreshold != null) {
            this.DenyTimeThreshold = new Long(source.DenyTimeThreshold);
        }
        if (source.DefenseStatus != null) {
            this.DefenseStatus = new Long(source.DefenseStatus);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.HWState != null) {
            this.HWState = new Long(source.HWState);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackThreshold", this.AttackThreshold);
        this.setParamSimple(map, prefix + "TimeThreshold", this.TimeThreshold);
        this.setParamSimple(map, prefix + "DenyTimeThreshold", this.DenyTimeThreshold);
        this.setParamSimple(map, prefix + "DefenseStatus", this.DefenseStatus);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "HWState", this.HWState);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

