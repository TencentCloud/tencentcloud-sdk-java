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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvoiceSealInfo extends AbstractModel {

    /**
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private String CompanySealMark;

    /**
    * 是否有监制印章（0：没有，1：有）
    */
    @SerializedName("SupervisionSealMark")
    @Expose
    private String SupervisionSealMark;

    /**
    * 公司印章信息
    */
    @SerializedName("CompanySealMarkInfo")
    @Expose
    private String [] CompanySealMarkInfo;

    /**
    * 监制印章信息
    */
    @SerializedName("SupervisionSealMarkInfo")
    @Expose
    private String [] SupervisionSealMarkInfo;

    /**
     * Get 是否有公司印章（0：没有，1：有） 
     * @return CompanySealMark 是否有公司印章（0：没有，1：有）
     */
    public String getCompanySealMark() {
        return this.CompanySealMark;
    }

    /**
     * Set 是否有公司印章（0：没有，1：有）
     * @param CompanySealMark 是否有公司印章（0：没有，1：有）
     */
    public void setCompanySealMark(String CompanySealMark) {
        this.CompanySealMark = CompanySealMark;
    }

    /**
     * Get 是否有监制印章（0：没有，1：有） 
     * @return SupervisionSealMark 是否有监制印章（0：没有，1：有）
     */
    public String getSupervisionSealMark() {
        return this.SupervisionSealMark;
    }

    /**
     * Set 是否有监制印章（0：没有，1：有）
     * @param SupervisionSealMark 是否有监制印章（0：没有，1：有）
     */
    public void setSupervisionSealMark(String SupervisionSealMark) {
        this.SupervisionSealMark = SupervisionSealMark;
    }

    /**
     * Get 公司印章信息 
     * @return CompanySealMarkInfo 公司印章信息
     */
    public String [] getCompanySealMarkInfo() {
        return this.CompanySealMarkInfo;
    }

    /**
     * Set 公司印章信息
     * @param CompanySealMarkInfo 公司印章信息
     */
    public void setCompanySealMarkInfo(String [] CompanySealMarkInfo) {
        this.CompanySealMarkInfo = CompanySealMarkInfo;
    }

    /**
     * Get 监制印章信息 
     * @return SupervisionSealMarkInfo 监制印章信息
     */
    public String [] getSupervisionSealMarkInfo() {
        return this.SupervisionSealMarkInfo;
    }

    /**
     * Set 监制印章信息
     * @param SupervisionSealMarkInfo 监制印章信息
     */
    public void setSupervisionSealMarkInfo(String [] SupervisionSealMarkInfo) {
        this.SupervisionSealMarkInfo = SupervisionSealMarkInfo;
    }

    public InvoiceSealInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvoiceSealInfo(InvoiceSealInfo source) {
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new String(source.CompanySealMark);
        }
        if (source.SupervisionSealMark != null) {
            this.SupervisionSealMark = new String(source.SupervisionSealMark);
        }
        if (source.CompanySealMarkInfo != null) {
            this.CompanySealMarkInfo = new String[source.CompanySealMarkInfo.length];
            for (int i = 0; i < source.CompanySealMarkInfo.length; i++) {
                this.CompanySealMarkInfo[i] = new String(source.CompanySealMarkInfo[i]);
            }
        }
        if (source.SupervisionSealMarkInfo != null) {
            this.SupervisionSealMarkInfo = new String[source.SupervisionSealMarkInfo.length];
            for (int i = 0; i < source.SupervisionSealMarkInfo.length; i++) {
                this.SupervisionSealMarkInfo[i] = new String(source.SupervisionSealMarkInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "SupervisionSealMark", this.SupervisionSealMark);
        this.setParamArraySimple(map, prefix + "CompanySealMarkInfo.", this.CompanySealMarkInfo);
        this.setParamArraySimple(map, prefix + "SupervisionSealMarkInfo.", this.SupervisionSealMarkInfo);

    }
}

