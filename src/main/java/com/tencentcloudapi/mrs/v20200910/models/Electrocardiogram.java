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

public class Electrocardiogram extends AbstractModel {

    /**
    * 心电图详情
    */
    @SerializedName("EcgDescription")
    @Expose
    private EcgDescription EcgDescription;

    /**
    * 心电图诊断
    */
    @SerializedName("EcgDiagnosis")
    @Expose
    private EcgDiagnosis EcgDiagnosis;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 心电图详情 
     * @return EcgDescription 心电图详情
     */
    public EcgDescription getEcgDescription() {
        return this.EcgDescription;
    }

    /**
     * Set 心电图详情
     * @param EcgDescription 心电图详情
     */
    public void setEcgDescription(EcgDescription EcgDescription) {
        this.EcgDescription = EcgDescription;
    }

    /**
     * Get 心电图诊断 
     * @return EcgDiagnosis 心电图诊断
     */
    public EcgDiagnosis getEcgDiagnosis() {
        return this.EcgDiagnosis;
    }

    /**
     * Set 心电图诊断
     * @param EcgDiagnosis 心电图诊断
     */
    public void setEcgDiagnosis(EcgDiagnosis EcgDiagnosis) {
        this.EcgDiagnosis = EcgDiagnosis;
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

    public Electrocardiogram() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Electrocardiogram(Electrocardiogram source) {
        if (source.EcgDescription != null) {
            this.EcgDescription = new EcgDescription(source.EcgDescription);
        }
        if (source.EcgDiagnosis != null) {
            this.EcgDiagnosis = new EcgDiagnosis(source.EcgDiagnosis);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EcgDescription.", this.EcgDescription);
        this.setParamObj(map, prefix + "EcgDiagnosis.", this.EcgDiagnosis);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

