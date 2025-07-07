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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagCert extends AbstractModel {

    /**
    * 建议
    */
    @SerializedName("Advice")
    @Expose
    private Advice Advice;

    /**
    * 诊断
    */
    @SerializedName("Diagnosis")
    @Expose
    private DiagCertItem [] Diagnosis;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 建议 
     * @return Advice 建议
     */
    public Advice getAdvice() {
        return this.Advice;
    }

    /**
     * Set 建议
     * @param Advice 建议
     */
    public void setAdvice(Advice Advice) {
        this.Advice = Advice;
    }

    /**
     * Get 诊断 
     * @return Diagnosis 诊断
     */
    public DiagCertItem [] getDiagnosis() {
        return this.Diagnosis;
    }

    /**
     * Set 诊断
     * @param Diagnosis 诊断
     */
    public void setDiagnosis(DiagCertItem [] Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    /**
     * Get 数据在原PDF文件中的第几页 
     * @return Page 数据在原PDF文件中的第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
     * @param Page 数据在原PDF文件中的第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public DiagCert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagCert(DiagCert source) {
        if (source.Advice != null) {
            this.Advice = new Advice(source.Advice);
        }
        if (source.Diagnosis != null) {
            this.Diagnosis = new DiagCertItem[source.Diagnosis.length];
            for (int i = 0; i < source.Diagnosis.length; i++) {
                this.Diagnosis[i] = new DiagCertItem(source.Diagnosis[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Advice.", this.Advice);
        this.setParamArrayObj(map, prefix + "Diagnosis.", this.Diagnosis);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

