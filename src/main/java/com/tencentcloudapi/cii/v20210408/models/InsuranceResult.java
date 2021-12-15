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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InsuranceResult extends AbstractModel{

    /**
    * 险种:CriticalDiseaseInsurance(重疾险);LifeInsurance(寿险);AccidentInsurance(意外险);MedicalInsurance(医疗险)
    */
    @SerializedName("InsuranceType")
    @Expose
    private String InsuranceType;

    /**
    * 对应险种的机器核保结果
    */
    @SerializedName("Result")
    @Expose
    private MachinePredict [] Result;

    /**
     * Get 险种:CriticalDiseaseInsurance(重疾险);LifeInsurance(寿险);AccidentInsurance(意外险);MedicalInsurance(医疗险) 
     * @return InsuranceType 险种:CriticalDiseaseInsurance(重疾险);LifeInsurance(寿险);AccidentInsurance(意外险);MedicalInsurance(医疗险)
     */
    public String getInsuranceType() {
        return this.InsuranceType;
    }

    /**
     * Set 险种:CriticalDiseaseInsurance(重疾险);LifeInsurance(寿险);AccidentInsurance(意外险);MedicalInsurance(医疗险)
     * @param InsuranceType 险种:CriticalDiseaseInsurance(重疾险);LifeInsurance(寿险);AccidentInsurance(意外险);MedicalInsurance(医疗险)
     */
    public void setInsuranceType(String InsuranceType) {
        this.InsuranceType = InsuranceType;
    }

    /**
     * Get 对应险种的机器核保结果 
     * @return Result 对应险种的机器核保结果
     */
    public MachinePredict [] getResult() {
        return this.Result;
    }

    /**
     * Set 对应险种的机器核保结果
     * @param Result 对应险种的机器核保结果
     */
    public void setResult(MachinePredict [] Result) {
        this.Result = Result;
    }

    public InsuranceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsuranceResult(InsuranceResult source) {
        if (source.InsuranceType != null) {
            this.InsuranceType = new String(source.InsuranceType);
        }
        if (source.Result != null) {
            this.Result = new MachinePredict[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new MachinePredict(source.Result[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InsuranceType", this.InsuranceType);
        this.setParamArrayObj(map, prefix + "Result.", this.Result);

    }
}

