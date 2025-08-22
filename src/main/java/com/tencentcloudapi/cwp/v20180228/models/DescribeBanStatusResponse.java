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

public class DescribeBanStatusResponse extends AbstractModel {

    /**
    * (已废弃) 阻断开关状态: 0 -- 关闭  1 -- 高级阻断 2 -- 基础阻断(只阻断情报库黑ip)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否弹窗提示信息 false: 关闭，true: 开启
    */
    @SerializedName("ShowTips")
    @Expose
    private Boolean ShowTips;

    /**
    * 是否开启智能过白模式
    */
    @SerializedName("OpenSmartMode")
    @Expose
    private Boolean OpenSmartMode;

    /**
    * 是否开启情报IP阻断
    */
    @SerializedName("BanBlackIp")
    @Expose
    private Boolean BanBlackIp;

    /**
    * 是否开启漏洞IP阻断
    */
    @SerializedName("BanVulIp")
    @Expose
    private Boolean BanVulIp;

    /**
    * 是否开启规则阻断
    */
    @SerializedName("BanByRule")
    @Expose
    private Boolean BanByRule;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get (已废弃) 阻断开关状态: 0 -- 关闭  1 -- 高级阻断 2 -- 基础阻断(只阻断情报库黑ip) 
     * @return Status (已废弃) 阻断开关状态: 0 -- 关闭  1 -- 高级阻断 2 -- 基础阻断(只阻断情报库黑ip)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set (已废弃) 阻断开关状态: 0 -- 关闭  1 -- 高级阻断 2 -- 基础阻断(只阻断情报库黑ip)
     * @param Status (已废弃) 阻断开关状态: 0 -- 关闭  1 -- 高级阻断 2 -- 基础阻断(只阻断情报库黑ip)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否弹窗提示信息 false: 关闭，true: 开启 
     * @return ShowTips 是否弹窗提示信息 false: 关闭，true: 开启
     */
    public Boolean getShowTips() {
        return this.ShowTips;
    }

    /**
     * Set 是否弹窗提示信息 false: 关闭，true: 开启
     * @param ShowTips 是否弹窗提示信息 false: 关闭，true: 开启
     */
    public void setShowTips(Boolean ShowTips) {
        this.ShowTips = ShowTips;
    }

    /**
     * Get 是否开启智能过白模式 
     * @return OpenSmartMode 是否开启智能过白模式
     */
    public Boolean getOpenSmartMode() {
        return this.OpenSmartMode;
    }

    /**
     * Set 是否开启智能过白模式
     * @param OpenSmartMode 是否开启智能过白模式
     */
    public void setOpenSmartMode(Boolean OpenSmartMode) {
        this.OpenSmartMode = OpenSmartMode;
    }

    /**
     * Get 是否开启情报IP阻断 
     * @return BanBlackIp 是否开启情报IP阻断
     */
    public Boolean getBanBlackIp() {
        return this.BanBlackIp;
    }

    /**
     * Set 是否开启情报IP阻断
     * @param BanBlackIp 是否开启情报IP阻断
     */
    public void setBanBlackIp(Boolean BanBlackIp) {
        this.BanBlackIp = BanBlackIp;
    }

    /**
     * Get 是否开启漏洞IP阻断 
     * @return BanVulIp 是否开启漏洞IP阻断
     */
    public Boolean getBanVulIp() {
        return this.BanVulIp;
    }

    /**
     * Set 是否开启漏洞IP阻断
     * @param BanVulIp 是否开启漏洞IP阻断
     */
    public void setBanVulIp(Boolean BanVulIp) {
        this.BanVulIp = BanVulIp;
    }

    /**
     * Get 是否开启规则阻断 
     * @return BanByRule 是否开启规则阻断
     */
    public Boolean getBanByRule() {
        return this.BanByRule;
    }

    /**
     * Set 是否开启规则阻断
     * @param BanByRule 是否开启规则阻断
     */
    public void setBanByRule(Boolean BanByRule) {
        this.BanByRule = BanByRule;
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

    public DescribeBanStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBanStatusResponse(DescribeBanStatusResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ShowTips != null) {
            this.ShowTips = new Boolean(source.ShowTips);
        }
        if (source.OpenSmartMode != null) {
            this.OpenSmartMode = new Boolean(source.OpenSmartMode);
        }
        if (source.BanBlackIp != null) {
            this.BanBlackIp = new Boolean(source.BanBlackIp);
        }
        if (source.BanVulIp != null) {
            this.BanVulIp = new Boolean(source.BanVulIp);
        }
        if (source.BanByRule != null) {
            this.BanByRule = new Boolean(source.BanByRule);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ShowTips", this.ShowTips);
        this.setParamSimple(map, prefix + "OpenSmartMode", this.OpenSmartMode);
        this.setParamSimple(map, prefix + "BanBlackIp", this.BanBlackIp);
        this.setParamSimple(map, prefix + "BanVulIp", this.BanVulIp);
        this.setParamSimple(map, prefix + "BanByRule", this.BanByRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

