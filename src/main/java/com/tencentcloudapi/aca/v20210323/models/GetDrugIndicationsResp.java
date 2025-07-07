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

public class GetDrugIndicationsResp extends AbstractModel {

    /**
    * 适应症
    */
    @SerializedName("Indications")
    @Expose
    private String [] Indications;

    /**
    * 药品说明
    */
    @SerializedName("DocInfos")
    @Expose
    private DocInfo [] DocInfos;

    /**
     * Get 适应症 
     * @return Indications 适应症
     */
    public String [] getIndications() {
        return this.Indications;
    }

    /**
     * Set 适应症
     * @param Indications 适应症
     */
    public void setIndications(String [] Indications) {
        this.Indications = Indications;
    }

    /**
     * Get 药品说明 
     * @return DocInfos 药品说明
     */
    public DocInfo [] getDocInfos() {
        return this.DocInfos;
    }

    /**
     * Set 药品说明
     * @param DocInfos 药品说明
     */
    public void setDocInfos(DocInfo [] DocInfos) {
        this.DocInfos = DocInfos;
    }

    public GetDrugIndicationsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDrugIndicationsResp(GetDrugIndicationsResp source) {
        if (source.Indications != null) {
            this.Indications = new String[source.Indications.length];
            for (int i = 0; i < source.Indications.length; i++) {
                this.Indications[i] = new String(source.Indications[i]);
            }
        }
        if (source.DocInfos != null) {
            this.DocInfos = new DocInfo[source.DocInfos.length];
            for (int i = 0; i < source.DocInfos.length; i++) {
                this.DocInfos[i] = new DocInfo(source.DocInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Indications.", this.Indications);
        this.setParamArrayObj(map, prefix + "DocInfos.", this.DocInfos);

    }
}

