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

public class VerifyBizLicenseEnterprise4Request extends AbstractModel {

    /**
    * <p>统一社会信用代码</p>
    */
    @SerializedName("CreditCode")
    @Expose
    private String CreditCode;

    /**
    * <p>企业名称</p>
    */
    @SerializedName("EntName")
    @Expose
    private String EntName;

    /**
    * <p>法人代表</p>
    */
    @SerializedName("LrName")
    @Expose
    private String LrName;

    /**
    * <p>注册登记证件号码</p>
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
     * Get <p>统一社会信用代码</p> 
     * @return CreditCode <p>统一社会信用代码</p>
     */
    public String getCreditCode() {
        return this.CreditCode;
    }

    /**
     * Set <p>统一社会信用代码</p>
     * @param CreditCode <p>统一社会信用代码</p>
     */
    public void setCreditCode(String CreditCode) {
        this.CreditCode = CreditCode;
    }

    /**
     * Get <p>企业名称</p> 
     * @return EntName <p>企业名称</p>
     */
    public String getEntName() {
        return this.EntName;
    }

    /**
     * Set <p>企业名称</p>
     * @param EntName <p>企业名称</p>
     */
    public void setEntName(String EntName) {
        this.EntName = EntName;
    }

    /**
     * Get <p>法人代表</p> 
     * @return LrName <p>法人代表</p>
     */
    public String getLrName() {
        return this.LrName;
    }

    /**
     * Set <p>法人代表</p>
     * @param LrName <p>法人代表</p>
     */
    public void setLrName(String LrName) {
        this.LrName = LrName;
    }

    /**
     * Get <p>注册登记证件号码</p> 
     * @return IdNum <p>注册登记证件号码</p>
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set <p>注册登记证件号码</p>
     * @param IdNum <p>注册登记证件号码</p>
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    public VerifyBizLicenseEnterprise4Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyBizLicenseEnterprise4Request(VerifyBizLicenseEnterprise4Request source) {
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.EntName != null) {
            this.EntName = new String(source.EntName);
        }
        if (source.LrName != null) {
            this.LrName = new String(source.LrName);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "EntName", this.EntName);
        this.setParamSimple(map, prefix + "LrName", this.LrName);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);

    }
}

