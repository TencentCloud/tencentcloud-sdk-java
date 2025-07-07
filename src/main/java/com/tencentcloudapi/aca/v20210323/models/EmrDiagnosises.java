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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrDiagnosises extends AbstractModel {

    /**
    * 诊断名称
    */
    @SerializedName("DiagnosisName")
    @Expose
    private String DiagnosisName;

    /**
    * ICD代码
    */
    @SerializedName("IcdCode")
    @Expose
    private String IcdCode;

    /**
     * Get 诊断名称 
     * @return DiagnosisName 诊断名称
     */
    public String getDiagnosisName() {
        return this.DiagnosisName;
    }

    /**
     * Set 诊断名称
     * @param DiagnosisName 诊断名称
     */
    public void setDiagnosisName(String DiagnosisName) {
        this.DiagnosisName = DiagnosisName;
    }

    /**
     * Get ICD代码 
     * @return IcdCode ICD代码
     */
    public String getIcdCode() {
        return this.IcdCode;
    }

    /**
     * Set ICD代码
     * @param IcdCode ICD代码
     */
    public void setIcdCode(String IcdCode) {
        this.IcdCode = IcdCode;
    }

    public EmrDiagnosises() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrDiagnosises(EmrDiagnosises source) {
        if (source.DiagnosisName != null) {
            this.DiagnosisName = new String(source.DiagnosisName);
        }
        if (source.IcdCode != null) {
            this.IcdCode = new String(source.IcdCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagnosisName", this.DiagnosisName);
        this.setParamSimple(map, prefix + "IcdCode", this.IcdCode);

    }
}

