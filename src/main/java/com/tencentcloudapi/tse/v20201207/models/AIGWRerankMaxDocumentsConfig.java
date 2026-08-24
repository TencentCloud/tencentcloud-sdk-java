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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWRerankMaxDocumentsConfig extends AbstractModel {

    /**
    * <p>是否开启最大文档数限制</p><p>枚举值：</p><ul><li>true： 开启最大文档数限制</li><li>false： 关闭最大文档数限制</li></ul>
    */
    @SerializedName("EnableMaxDocuments")
    @Expose
    private Boolean EnableMaxDocuments;

    /**
    * <p>最大文档数限制</p><p>取值范围：[1, 5000]</p>
    */
    @SerializedName("MaxDocumentValue")
    @Expose
    private Long MaxDocumentValue;

    /**
     * Get <p>是否开启最大文档数限制</p><p>枚举值：</p><ul><li>true： 开启最大文档数限制</li><li>false： 关闭最大文档数限制</li></ul> 
     * @return EnableMaxDocuments <p>是否开启最大文档数限制</p><p>枚举值：</p><ul><li>true： 开启最大文档数限制</li><li>false： 关闭最大文档数限制</li></ul>
     */
    public Boolean getEnableMaxDocuments() {
        return this.EnableMaxDocuments;
    }

    /**
     * Set <p>是否开启最大文档数限制</p><p>枚举值：</p><ul><li>true： 开启最大文档数限制</li><li>false： 关闭最大文档数限制</li></ul>
     * @param EnableMaxDocuments <p>是否开启最大文档数限制</p><p>枚举值：</p><ul><li>true： 开启最大文档数限制</li><li>false： 关闭最大文档数限制</li></ul>
     */
    public void setEnableMaxDocuments(Boolean EnableMaxDocuments) {
        this.EnableMaxDocuments = EnableMaxDocuments;
    }

    /**
     * Get <p>最大文档数限制</p><p>取值范围：[1, 5000]</p> 
     * @return MaxDocumentValue <p>最大文档数限制</p><p>取值范围：[1, 5000]</p>
     */
    public Long getMaxDocumentValue() {
        return this.MaxDocumentValue;
    }

    /**
     * Set <p>最大文档数限制</p><p>取值范围：[1, 5000]</p>
     * @param MaxDocumentValue <p>最大文档数限制</p><p>取值范围：[1, 5000]</p>
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

