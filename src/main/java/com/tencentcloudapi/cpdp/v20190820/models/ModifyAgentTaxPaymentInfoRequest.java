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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentTaxPaymentInfoRequest extends AbstractModel {

    /**
    * 批次号
    */
    @SerializedName("BatchNum")
    @Expose
    private Long BatchNum;

    /**
    * 新源电子凭证地址
    */
    @SerializedName("RawElectronicCertUrl")
    @Expose
    private String RawElectronicCertUrl;

    /**
    * 新的文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 接入环境。沙箱环境填sandbox
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 批次号 
     * @return BatchNum 批次号
     */
    public Long getBatchNum() {
        return this.BatchNum;
    }

    /**
     * Set 批次号
     * @param BatchNum 批次号
     */
    public void setBatchNum(Long BatchNum) {
        this.BatchNum = BatchNum;
    }

    /**
     * Get 新源电子凭证地址 
     * @return RawElectronicCertUrl 新源电子凭证地址
     */
    public String getRawElectronicCertUrl() {
        return this.RawElectronicCertUrl;
    }

    /**
     * Set 新源电子凭证地址
     * @param RawElectronicCertUrl 新源电子凭证地址
     */
    public void setRawElectronicCertUrl(String RawElectronicCertUrl) {
        this.RawElectronicCertUrl = RawElectronicCertUrl;
    }

    /**
     * Get 新的文件名 
     * @return FileName 新的文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 新的文件名
     * @param FileName 新的文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox 
     * @return Profile 接入环境。沙箱环境填sandbox
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox
     * @param Profile 接入环境。沙箱环境填sandbox
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public ModifyAgentTaxPaymentInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentTaxPaymentInfoRequest(ModifyAgentTaxPaymentInfoRequest source) {
        if (source.BatchNum != null) {
            this.BatchNum = new Long(source.BatchNum);
        }
        if (source.RawElectronicCertUrl != null) {
            this.RawElectronicCertUrl = new String(source.RawElectronicCertUrl);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchNum", this.BatchNum);
        this.setParamSimple(map, prefix + "RawElectronicCertUrl", this.RawElectronicCertUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

