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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateActivityLicenseResponse extends AbstractModel {

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * app名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * ios包名
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 安卓包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 有效时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * license秘钥
    */
    @SerializedName("LicenseKey")
    @Expose
    private String LicenseKey;

    /**
    * license 授权文件下载链接
    */
    @SerializedName("LicenseUrl")
    @Expose
    private String LicenseUrl;

    /**
    * license剩余天数，最后一天以及过期显示0
    */
    @SerializedName("ResidueDay")
    @Expose
    private Long ResidueDay;

    /**
    * license剩余秒数
    */
    @SerializedName("Residue")
    @Expose
    private Long Residue;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get app名称 
     * @return AppName app名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app名称
     * @param AppName app名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get ios包名 
     * @return BundleId ios包名
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set ios包名
     * @param BundleId ios包名
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 安卓包名 
     * @return PackageName 安卓包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 安卓包名
     * @param PackageName 安卓包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 有效时长 
     * @return Duration 有效时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 有效时长
     * @param Duration 有效时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get license秘钥 
     * @return LicenseKey license秘钥
     */
    public String getLicenseKey() {
        return this.LicenseKey;
    }

    /**
     * Set license秘钥
     * @param LicenseKey license秘钥
     */
    public void setLicenseKey(String LicenseKey) {
        this.LicenseKey = LicenseKey;
    }

    /**
     * Get license 授权文件下载链接 
     * @return LicenseUrl license 授权文件下载链接
     */
    public String getLicenseUrl() {
        return this.LicenseUrl;
    }

    /**
     * Set license 授权文件下载链接
     * @param LicenseUrl license 授权文件下载链接
     */
    public void setLicenseUrl(String LicenseUrl) {
        this.LicenseUrl = LicenseUrl;
    }

    /**
     * Get license剩余天数，最后一天以及过期显示0 
     * @return ResidueDay license剩余天数，最后一天以及过期显示0
     */
    public Long getResidueDay() {
        return this.ResidueDay;
    }

    /**
     * Set license剩余天数，最后一天以及过期显示0
     * @param ResidueDay license剩余天数，最后一天以及过期显示0
     */
    public void setResidueDay(Long ResidueDay) {
        this.ResidueDay = ResidueDay;
    }

    /**
     * Get license剩余秒数 
     * @return Residue license剩余秒数
     */
    public Long getResidue() {
        return this.Residue;
    }

    /**
     * Set license剩余秒数
     * @param Residue license剩余秒数
     */
    public void setResidue(Long Residue) {
        this.Residue = Residue;
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

    public CreateActivityLicenseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateActivityLicenseResponse(CreateActivityLicenseResponse source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LicenseKey != null) {
            this.LicenseKey = new String(source.LicenseKey);
        }
        if (source.LicenseUrl != null) {
            this.LicenseUrl = new String(source.LicenseUrl);
        }
        if (source.ResidueDay != null) {
            this.ResidueDay = new Long(source.ResidueDay);
        }
        if (source.Residue != null) {
            this.Residue = new Long(source.Residue);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LicenseKey", this.LicenseKey);
        this.setParamSimple(map, prefix + "LicenseUrl", this.LicenseUrl);
        this.setParamSimple(map, prefix + "ResidueDay", this.ResidueDay);
        this.setParamSimple(map, prefix + "Residue", this.Residue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

