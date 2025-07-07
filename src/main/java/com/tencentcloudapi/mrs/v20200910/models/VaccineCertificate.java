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

public class VaccineCertificate extends AbstractModel {

    /**
    * 免疫接种列表
    */
    @SerializedName("VaccineList")
    @Expose
    private Vaccination [] VaccineList;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 免疫接种列表 
     * @return VaccineList 免疫接种列表
     */
    public Vaccination [] getVaccineList() {
        return this.VaccineList;
    }

    /**
     * Set 免疫接种列表
     * @param VaccineList 免疫接种列表
     */
    public void setVaccineList(Vaccination [] VaccineList) {
        this.VaccineList = VaccineList;
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

    public VaccineCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VaccineCertificate(VaccineCertificate source) {
        if (source.VaccineList != null) {
            this.VaccineList = new Vaccination[source.VaccineList.length];
            for (int i = 0; i < source.VaccineList.length; i++) {
                this.VaccineList[i] = new Vaccination(source.VaccineList[i]);
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
        this.setParamArrayObj(map, prefix + "VaccineList.", this.VaccineList);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

