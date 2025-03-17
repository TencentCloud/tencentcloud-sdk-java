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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreAuditInfo extends AbstractModel {

    /**
    * 证书总年限
    */
    @SerializedName("TotalPeriod")
    @Expose
    private Long TotalPeriod;

    /**
    * 证书当前年限
    */
    @SerializedName("NowPeriod")
    @Expose
    private Long NowPeriod;

    /**
    * 证书预审核管理人ID
    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
     * Get 证书总年限 
     * @return TotalPeriod 证书总年限
     */
    public Long getTotalPeriod() {
        return this.TotalPeriod;
    }

    /**
     * Set 证书总年限
     * @param TotalPeriod 证书总年限
     */
    public void setTotalPeriod(Long TotalPeriod) {
        this.TotalPeriod = TotalPeriod;
    }

    /**
     * Get 证书当前年限 
     * @return NowPeriod 证书当前年限
     */
    public Long getNowPeriod() {
        return this.NowPeriod;
    }

    /**
     * Set 证书当前年限
     * @param NowPeriod 证书当前年限
     */
    public void setNowPeriod(Long NowPeriod) {
        this.NowPeriod = NowPeriod;
    }

    /**
     * Get 证书预审核管理人ID 
     * @return ManagerId 证书预审核管理人ID
     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 证书预审核管理人ID
     * @param ManagerId 证书预审核管理人ID
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    public PreAuditInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreAuditInfo(PreAuditInfo source) {
        if (source.TotalPeriod != null) {
            this.TotalPeriod = new Long(source.TotalPeriod);
        }
        if (source.NowPeriod != null) {
            this.NowPeriod = new Long(source.NowPeriod);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new String(source.ManagerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalPeriod", this.TotalPeriod);
        this.setParamSimple(map, prefix + "NowPeriod", this.NowPeriod);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);

    }
}

