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

public class UploadTaxPaymentRequest extends AbstractModel{

    /**
    * 平台渠道
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 完税ID
    */
    @SerializedName("TaxId")
    @Expose
    private String TaxId;

    /**
    * 完税列表下载地址
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
     * Get 平台渠道 
     * @return Channel 平台渠道
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 平台渠道
     * @param Channel 平台渠道
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 完税ID 
     * @return TaxId 完税ID
     */
    public String getTaxId() {
        return this.TaxId;
    }

    /**
     * Set 完税ID
     * @param TaxId 完税ID
     */
    public void setTaxId(String TaxId) {
        this.TaxId = TaxId;
    }

    /**
     * Get 完税列表下载地址 
     * @return FileUrl 完税列表下载地址
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 完税列表下载地址
     * @param FileUrl 完税列表下载地址
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    public UploadTaxPaymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadTaxPaymentRequest(UploadTaxPaymentRequest source) {
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
        if (source.TaxId != null) {
            this.TaxId = new String(source.TaxId);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "TaxId", this.TaxId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);

    }
}

