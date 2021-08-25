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

public class DownloadReconciliationUrlRequest extends AbstractModel{

    /**
    * 平台应用ID
    */
    @SerializedName("MainAppId")
    @Expose
    private String MainAppId;

    /**
    * 平台代码
    */
    @SerializedName("AppCode")
    @Expose
    private String AppCode;

    /**
    * 账单日期，yyyy-MM-dd
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
    * 商户或者代理商ID
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
     * Get 平台应用ID 
     * @return MainAppId 平台应用ID
     */
    public String getMainAppId() {
        return this.MainAppId;
    }

    /**
     * Set 平台应用ID
     * @param MainAppId 平台应用ID
     */
    public void setMainAppId(String MainAppId) {
        this.MainAppId = MainAppId;
    }

    /**
     * Get 平台代码 
     * @return AppCode 平台代码
     */
    public String getAppCode() {
        return this.AppCode;
    }

    /**
     * Set 平台代码
     * @param AppCode 平台代码
     */
    public void setAppCode(String AppCode) {
        this.AppCode = AppCode;
    }

    /**
     * Get 账单日期，yyyy-MM-dd 
     * @return BillDate 账单日期，yyyy-MM-dd
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 账单日期，yyyy-MM-dd
     * @param BillDate 账单日期，yyyy-MM-dd
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    /**
     * Get 商户或者代理商ID 
     * @return SubAppId 商户或者代理商ID
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 商户或者代理商ID
     * @param SubAppId 商户或者代理商ID
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DownloadReconciliationUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadReconciliationUrlRequest(DownloadReconciliationUrlRequest source) {
        if (source.MainAppId != null) {
            this.MainAppId = new String(source.MainAppId);
        }
        if (source.AppCode != null) {
            this.AppCode = new String(source.AppCode);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainAppId", this.MainAppId);
        this.setParamSimple(map, prefix + "AppCode", this.AppCode);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

