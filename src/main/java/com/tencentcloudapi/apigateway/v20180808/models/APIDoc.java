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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIDoc extends AbstractModel {

    /**
    * API文档ID
    */
    @SerializedName("ApiDocId")
    @Expose
    private String ApiDocId;

    /**
    * API文档名称
    */
    @SerializedName("ApiDocName")
    @Expose
    private String ApiDocName;

    /**
    * API文档构建状态
    */
    @SerializedName("ApiDocStatus")
    @Expose
    private String ApiDocStatus;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get API文档ID 
     * @return ApiDocId API文档ID
     */
    public String getApiDocId() {
        return this.ApiDocId;
    }

    /**
     * Set API文档ID
     * @param ApiDocId API文档ID
     */
    public void setApiDocId(String ApiDocId) {
        this.ApiDocId = ApiDocId;
    }

    /**
     * Get API文档名称 
     * @return ApiDocName API文档名称
     */
    public String getApiDocName() {
        return this.ApiDocName;
    }

    /**
     * Set API文档名称
     * @param ApiDocName API文档名称
     */
    public void setApiDocName(String ApiDocName) {
        this.ApiDocName = ApiDocName;
    }

    /**
     * Get API文档构建状态 
     * @return ApiDocStatus API文档构建状态
     */
    public String getApiDocStatus() {
        return this.ApiDocStatus;
    }

    /**
     * Set API文档构建状态
     * @param ApiDocStatus API文档构建状态
     */
    public void setApiDocStatus(String ApiDocStatus) {
        this.ApiDocStatus = ApiDocStatus;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public APIDoc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIDoc(APIDoc source) {
        if (source.ApiDocId != null) {
            this.ApiDocId = new String(source.ApiDocId);
        }
        if (source.ApiDocName != null) {
            this.ApiDocName = new String(source.ApiDocName);
        }
        if (source.ApiDocStatus != null) {
            this.ApiDocStatus = new String(source.ApiDocStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiDocId", this.ApiDocId);
        this.setParamSimple(map, prefix + "ApiDocName", this.ApiDocName);
        this.setParamSimple(map, prefix + "ApiDocStatus", this.ApiDocStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

