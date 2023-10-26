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

public class VersionWhiteConfig extends AbstractModel {

    /**
    * 到期天数
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 授权数量
    */
    @SerializedName("LicenseNum")
    @Expose
    private Long LicenseNum;

    /**
    * 是否可申请
    */
    @SerializedName("IsApplyFor")
    @Expose
    private Boolean IsApplyFor;

    /**
    * 类型
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get 到期天数 
     * @return Deadline 到期天数
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 到期天数
     * @param Deadline 到期天数
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 授权数量 
     * @return LicenseNum 授权数量
     */
    public Long getLicenseNum() {
        return this.LicenseNum;
    }

    /**
     * Set 授权数量
     * @param LicenseNum 授权数量
     */
    public void setLicenseNum(Long LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * Get 是否可申请 
     * @return IsApplyFor 是否可申请
     */
    public Boolean getIsApplyFor() {
        return this.IsApplyFor;
    }

    /**
     * Set 是否可申请
     * @param IsApplyFor 是否可申请
     */
    public void setIsApplyFor(Boolean IsApplyFor) {
        this.IsApplyFor = IsApplyFor;
    }

    /**
     * Get 类型 
     * @return SourceType 类型
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 类型
     * @param SourceType 类型
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public VersionWhiteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionWhiteConfig(VersionWhiteConfig source) {
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.LicenseNum != null) {
            this.LicenseNum = new Long(source.LicenseNum);
        }
        if (source.IsApplyFor != null) {
            this.IsApplyFor = new Boolean(source.IsApplyFor);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "LicenseNum", this.LicenseNum);
        this.setParamSimple(map, prefix + "IsApplyFor", this.IsApplyFor);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

