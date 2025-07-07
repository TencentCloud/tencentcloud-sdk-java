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

public class DrugList extends AbstractModel {

    /**
    * 药品ID
    */
    @SerializedName("DrugId")
    @Expose
    private String DrugId;

    /**
    * 药品名称
    */
    @SerializedName("DrugName")
    @Expose
    private String DrugName;

    /**
    * 文档地址
    */
    @SerializedName("DocUrl")
    @Expose
    private String DocUrl;

    /**
    * 是否找到
    */
    @SerializedName("NotFound")
    @Expose
    private Boolean NotFound;

    /**
     * Get 药品ID 
     * @return DrugId 药品ID
     */
    public String getDrugId() {
        return this.DrugId;
    }

    /**
     * Set 药品ID
     * @param DrugId 药品ID
     */
    public void setDrugId(String DrugId) {
        this.DrugId = DrugId;
    }

    /**
     * Get 药品名称 
     * @return DrugName 药品名称
     */
    public String getDrugName() {
        return this.DrugName;
    }

    /**
     * Set 药品名称
     * @param DrugName 药品名称
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * Get 文档地址 
     * @return DocUrl 文档地址
     */
    public String getDocUrl() {
        return this.DocUrl;
    }

    /**
     * Set 文档地址
     * @param DocUrl 文档地址
     */
    public void setDocUrl(String DocUrl) {
        this.DocUrl = DocUrl;
    }

    /**
     * Get 是否找到 
     * @return NotFound 是否找到
     */
    public Boolean getNotFound() {
        return this.NotFound;
    }

    /**
     * Set 是否找到
     * @param NotFound 是否找到
     */
    public void setNotFound(Boolean NotFound) {
        this.NotFound = NotFound;
    }

    public DrugList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrugList(DrugList source) {
        if (source.DrugId != null) {
            this.DrugId = new String(source.DrugId);
        }
        if (source.DrugName != null) {
            this.DrugName = new String(source.DrugName);
        }
        if (source.DocUrl != null) {
            this.DocUrl = new String(source.DocUrl);
        }
        if (source.NotFound != null) {
            this.NotFound = new Boolean(source.NotFound);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugId", this.DrugId);
        this.setParamSimple(map, prefix + "DrugName", this.DrugName);
        this.setParamSimple(map, prefix + "DocUrl", this.DocUrl);
        this.setParamSimple(map, prefix + "NotFound", this.NotFound);

    }
}

