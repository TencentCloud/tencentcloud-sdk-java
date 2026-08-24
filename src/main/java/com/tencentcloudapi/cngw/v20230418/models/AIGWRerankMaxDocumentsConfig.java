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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWRerankMaxDocumentsConfig extends AbstractModel {

    /**
    * <p>启用最大文档数限制</p>
    */
    @SerializedName("EnableMaxDocuments")
    @Expose
    private Boolean EnableMaxDocuments;

    /**
    * <p>Rerank场景最大文档数限制</p>
    */
    @SerializedName("MaxDocumentValue")
    @Expose
    private Long MaxDocumentValue;

    /**
     * Get <p>启用最大文档数限制</p> 
     * @return EnableMaxDocuments <p>启用最大文档数限制</p>
     */
    public Boolean getEnableMaxDocuments() {
        return this.EnableMaxDocuments;
    }

    /**
     * Set <p>启用最大文档数限制</p>
     * @param EnableMaxDocuments <p>启用最大文档数限制</p>
     */
    public void setEnableMaxDocuments(Boolean EnableMaxDocuments) {
        this.EnableMaxDocuments = EnableMaxDocuments;
    }

    /**
     * Get <p>Rerank场景最大文档数限制</p> 
     * @return MaxDocumentValue <p>Rerank场景最大文档数限制</p>
     */
    public Long getMaxDocumentValue() {
        return this.MaxDocumentValue;
    }

    /**
     * Set <p>Rerank场景最大文档数限制</p>
     * @param MaxDocumentValue <p>Rerank场景最大文档数限制</p>
     */
    public void setMaxDocumentValue(Long MaxDocumentValue) {
        this.MaxDocumentValue = MaxDocumentValue;
    }

    public AIGWRerankMaxDocumentsConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWRerankMaxDocumentsConfig(AIGWRerankMaxDocumentsConfig source) {
        if (source.EnableMaxDocuments != null) {
            this.EnableMaxDocuments = new Boolean(source.EnableMaxDocuments);
        }
        if (source.MaxDocumentValue != null) {
            this.MaxDocumentValue = new Long(source.MaxDocumentValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableMaxDocuments", this.EnableMaxDocuments);
        this.setParamSimple(map, prefix + "MaxDocumentValue", this.MaxDocumentValue);

    }
}

