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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPARDBDataAssetDetailRequest extends AbstractModel{

    /**
    * DSPA实例Id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 合规组Id
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
     * Get DSPA实例Id 
     * @return DspaId DSPA实例Id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例Id
     * @param DspaId DSPA实例Id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 合规组Id 
     * @return ComplianceId 合规组Id
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组Id
     * @param ComplianceId 合规组Id
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    public DescribeDSPARDBDataAssetDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPARDBDataAssetDetailRequest(DescribeDSPARDBDataAssetDetailRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);

    }
}

