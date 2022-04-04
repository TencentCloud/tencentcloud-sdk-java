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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseUnion extends AbstractModel{

    /**
    * 许可证概览信息
    */
    @SerializedName("LicenseSummary")
    @Expose
    private LicenseSummary LicenseSummary;

    /**
    * 许可证详细信息
    */
    @SerializedName("LicenseDetail")
    @Expose
    private LicenseDetail LicenseDetail;

    /**
     * Get 许可证概览信息 
     * @return LicenseSummary 许可证概览信息
     */
    public LicenseSummary getLicenseSummary() {
        return this.LicenseSummary;
    }

    /**
     * Set 许可证概览信息
     * @param LicenseSummary 许可证概览信息
     */
    public void setLicenseSummary(LicenseSummary LicenseSummary) {
        this.LicenseSummary = LicenseSummary;
    }

    /**
     * Get 许可证详细信息 
     * @return LicenseDetail 许可证详细信息
     */
    public LicenseDetail getLicenseDetail() {
        return this.LicenseDetail;
    }

    /**
     * Set 许可证详细信息
     * @param LicenseDetail 许可证详细信息
     */
    public void setLicenseDetail(LicenseDetail LicenseDetail) {
        this.LicenseDetail = LicenseDetail;
    }

    public LicenseUnion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseUnion(LicenseUnion source) {
        if (source.LicenseSummary != null) {
            this.LicenseSummary = new LicenseSummary(source.LicenseSummary);
        }
        if (source.LicenseDetail != null) {
            this.LicenseDetail = new LicenseDetail(source.LicenseDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LicenseSummary.", this.LicenseSummary);
        this.setParamObj(map, prefix + "LicenseDetail.", this.LicenseDetail);

    }
}

