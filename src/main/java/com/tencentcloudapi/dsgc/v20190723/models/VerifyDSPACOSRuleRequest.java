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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDSPACOSRuleRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 待验证COS规则
    */
    @SerializedName("COSRules")
    @Expose
    private ScanTaskCOSRules COSRules;

    /**
    * 待验证数据
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 待验证COS规则 
     * @return COSRules 待验证COS规则
     */
    public ScanTaskCOSRules getCOSRules() {
        return this.COSRules;
    }

    /**
     * Set 待验证COS规则
     * @param COSRules 待验证COS规则
     */
    public void setCOSRules(ScanTaskCOSRules COSRules) {
        this.COSRules = COSRules;
    }

    /**
     * Get 待验证数据 
     * @return Data 待验证数据
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 待验证数据
     * @param Data 待验证数据
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public VerifyDSPACOSRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDSPACOSRuleRequest(VerifyDSPACOSRuleRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.COSRules != null) {
            this.COSRules = new ScanTaskCOSRules(source.COSRules);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamObj(map, prefix + "COSRules.", this.COSRules);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

