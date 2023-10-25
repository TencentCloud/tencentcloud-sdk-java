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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWhiteListOrderRequest extends AbstractModel {

    /**
    * 授权类型
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 授权数量,最小为1 最大99999
    */
    @SerializedName("LicenseNum")
    @Expose
    private Long LicenseNum;

    /**
    * 到期时间,最小为1
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 规则名称,大资产中心:asset_center
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 订单类型, 1 试用 2 赠送 3 体验 4 SSL-证书赠送 5 cvm赠送
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 地域, 1 广州 9新加坡, 默认为 1. 非必要情况不要选9
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 额外参数,json字符串,包含ResourceId 资源ID,LicenseType 授权类型
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
     * Get 授权类型 
     * @return LicenseType 授权类型
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型
     * @param LicenseType 授权类型
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 授权数量,最小为1 最大99999 
     * @return LicenseNum 授权数量,最小为1 最大99999
     */
    public Long getLicenseNum() {
        return this.LicenseNum;
    }

    /**
     * Set 授权数量,最小为1 最大99999
     * @param LicenseNum 授权数量,最小为1 最大99999
     */
    public void setLicenseNum(Long LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * Get 到期时间,最小为1 
     * @return Deadline 到期时间,最小为1
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 到期时间,最小为1
     * @param Deadline 到期时间,最小为1
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 规则名称,大资产中心:asset_center 
     * @return RuleName 规则名称,大资产中心:asset_center
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称,大资产中心:asset_center
     * @param RuleName 规则名称,大资产中心:asset_center
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 订单类型, 1 试用 2 赠送 3 体验 4 SSL-证书赠送 5 cvm赠送 
     * @return SourceType 订单类型, 1 试用 2 赠送 3 体验 4 SSL-证书赠送 5 cvm赠送
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 订单类型, 1 试用 2 赠送 3 体验 4 SSL-证书赠送 5 cvm赠送
     * @param SourceType 订单类型, 1 试用 2 赠送 3 体验 4 SSL-证书赠送 5 cvm赠送
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 地域, 1 广州 9新加坡, 默认为 1. 非必要情况不要选9 
     * @return RegionId 地域, 1 广州 9新加坡, 默认为 1. 非必要情况不要选9
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域, 1 广州 9新加坡, 默认为 1. 非必要情况不要选9
     * @param RegionId 地域, 1 广州 9新加坡, 默认为 1. 非必要情况不要选9
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 额外参数,json字符串,包含ResourceId 资源ID,LicenseType 授权类型 
     * @return ExtraParam 额外参数,json字符串,包含ResourceId 资源ID,LicenseType 授权类型
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 额外参数,json字符串,包含ResourceId 资源ID,LicenseType 授权类型
     * @param ExtraParam 额外参数,json字符串,包含ResourceId 资源ID,LicenseType 授权类型
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    public CreateWhiteListOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhiteListOrderRequest(CreateWhiteListOrderRequest source) {
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.LicenseNum != null) {
            this.LicenseNum = new Long(source.LicenseNum);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseNum", this.LicenseNum);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);

    }
}

