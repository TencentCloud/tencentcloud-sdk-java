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

public class VerifyBizLicenseEnterprise3Request extends AbstractModel {

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
    * <p>核验类型 </p><p>枚举值：</p><ul><li>ENT_2META： 企业名称 、统一社会信用代码</li><li>ENT_3META： 企业名称 、统一社会信用代码 、法人代表名称</li></ul>
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

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
     * Get <p>核验类型 </p><p>枚举值：</p><ul><li>ENT_2META： 企业名称 、统一社会信用代码</li><li>ENT_3META： 企业名称 、统一社会信用代码 、法人代表名称</li></ul> 
     * @return VerifyType <p>核验类型 </p><p>枚举值：</p><ul><li>ENT_2META： 企业名称 、统一社会信用代码</li><li>ENT_3META： 企业名称 、统一社会信用代码 、法人代表名称</li></ul>
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set <p>核验类型 </p><p>枚举值：</p><ul><li>ENT_2META： 企业名称 、统一社会信用代码</li><li>ENT_3META： 企业名称 、统一社会信用代码 、法人代表名称</li></ul>
     * @param VerifyType <p>核验类型 </p><p>枚举值：</p><ul><li>ENT_2META： 企业名称 、统一社会信用代码</li><li>ENT_3META： 企业名称 、统一社会信用代码 、法人代表名称</li></ul>
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public VerifyBizLicenseEnterprise3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyBizLicenseEnterprise3Request(VerifyBizLicenseEnterprise3Request source) {
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.EntName != null) {
            this.EntName = new String(source.EntName);
        }
        if (source.LrName != null) {
            this.LrName = new String(source.LrName);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "EntName", this.EntName);
        this.setParamSimple(map, prefix + "LrName", this.LrName);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

