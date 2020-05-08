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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentTaxPaymentInfoRequest extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchNum", this.BatchNum);
        this.setParamSimple(map, prefix + "RawElectronicCertUrl", this.RawElectronicCertUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

