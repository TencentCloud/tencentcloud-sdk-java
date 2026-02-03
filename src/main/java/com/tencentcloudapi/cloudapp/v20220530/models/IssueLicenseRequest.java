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
package com.tencentcloudapi.cloudapp.v20220530.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IssueLicenseRequest extends AbstractModel {

    /**
    * <p>云应用实例 ID</p>
    */
    @SerializedName("CloudappId")
    @Expose
    private String CloudappId;

    /**
    * <p>云应用颁发的 License 授权 ID。系统中唯一，伙伴可通过 License 颁发的订阅接口中获取</p>
    */
    @SerializedName("LicenseId")
    @Expose
    private String LicenseId;

    /**
    * <p>License 的详细数据</p>
    */
    @SerializedName("LicenseData")
    @Expose
    private PartnerLicenseData LicenseData;

    /**
    * <p>License 的激活模式</p>枚举值：<ul><li> immediate ： 立即激活</li><li> scheduled： 指定时间激活</li></ul>
    */
    @SerializedName("ActivateMode")
    @Expose
    private String ActivateMode;

    /**
    * <p>激活时间，指定时间激活时需要传该字段</p>
    */
    @SerializedName("ActivateAt")
    @Expose
    private String ActivateAt;

    /**
     * Get <p>云应用实例 ID</p> 
     * @return CloudappId <p>云应用实例 ID</p>
     */
    public String getCloudappId() {
        return this.CloudappId;
    }

    /**
     * Set <p>云应用实例 ID</p>
     * @param CloudappId <p>云应用实例 ID</p>
     */
    public void setCloudappId(String CloudappId) {
        this.CloudappId = CloudappId;
    }

    /**
     * Get <p>云应用颁发的 License 授权 ID。系统中唯一，伙伴可通过 License 颁发的订阅接口中获取</p> 
     * @return LicenseId <p>云应用颁发的 License 授权 ID。系统中唯一，伙伴可通过 License 颁发的订阅接口中获取</p>
     */
    public String getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set <p>云应用颁发的 License 授权 ID。系统中唯一，伙伴可通过 License 颁发的订阅接口中获取</p>
     * @param LicenseId <p>云应用颁发的 License 授权 ID。系统中唯一，伙伴可通过 License 颁发的订阅接口中获取</p>
     */
    public void setLicenseId(String LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get <p>License 的详细数据</p> 
     * @return LicenseData <p>License 的详细数据</p>
     */
    public PartnerLicenseData getLicenseData() {
        return this.LicenseData;
    }

    /**
     * Set <p>License 的详细数据</p>
     * @param LicenseData <p>License 的详细数据</p>
     */
    public void setLicenseData(PartnerLicenseData LicenseData) {
        this.LicenseData = LicenseData;
    }

    /**
     * Get <p>License 的激活模式</p>枚举值：<ul><li> immediate ： 立即激活</li><li> scheduled： 指定时间激活</li></ul> 
     * @return ActivateMode <p>License 的激活模式</p>枚举值：<ul><li> immediate ： 立即激活</li><li> scheduled： 指定时间激活</li></ul>
     */
    public String getActivateMode() {
        return this.ActivateMode;
    }

    /**
     * Set <p>License 的激活模式</p>枚举值：<ul><li> immediate ： 立即激活</li><li> scheduled： 指定时间激活</li></ul>
     * @param ActivateMode <p>License 的激活模式</p>枚举值：<ul><li> immediate ： 立即激活</li><li> scheduled： 指定时间激活</li></ul>
     */
    public void setActivateMode(String ActivateMode) {
        this.ActivateMode = ActivateMode;
    }

    /**
     * Get <p>激活时间，指定时间激活时需要传该字段</p> 
     * @return ActivateAt <p>激活时间，指定时间激活时需要传该字段</p>
     */
    public String getActivateAt() {
        return this.ActivateAt;
    }

    /**
     * Set <p>激活时间，指定时间激活时需要传该字段</p>
     * @param ActivateAt <p>激活时间，指定时间激活时需要传该字段</p>
     */
    public void setActivateAt(String ActivateAt) {
        this.ActivateAt = ActivateAt;
    }

    public IssueLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IssueLicenseRequest(IssueLicenseRequest source) {
        if (source.CloudappId != null) {
            this.CloudappId = new String(source.CloudappId);
        }
        if (source.LicenseId != null) {
            this.LicenseId = new String(source.LicenseId);
        }
        if (source.LicenseData != null) {
            this.LicenseData = new PartnerLicenseData(source.LicenseData);
        }
        if (source.ActivateMode != null) {
            this.ActivateMode = new String(source.ActivateMode);
        }
        if (source.ActivateAt != null) {
            this.ActivateAt = new String(source.ActivateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudappId", this.CloudappId);
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamObj(map, prefix + "LicenseData.", this.LicenseData);
        this.setParamSimple(map, prefix + "ActivateMode", this.ActivateMode);
        this.setParamSimple(map, prefix + "ActivateAt", this.ActivateAt);

    }
}

