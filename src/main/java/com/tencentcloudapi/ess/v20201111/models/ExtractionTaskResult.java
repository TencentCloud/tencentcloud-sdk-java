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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractionTaskResult extends AbstractModel {

    /**
    * 用于合同信息提取的资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 用于合同信息提取的资源名称。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 根据当前合同提取出的字段信息
    */
    @SerializedName("ExtractionFieldResults")
    @Expose
    private ExtractionFieldResult [] ExtractionFieldResults;

    /**
     * Get 用于合同信息提取的资源ID。 
     * @return ResourceId 用于合同信息提取的资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 用于合同信息提取的资源ID。
     * @param ResourceId 用于合同信息提取的资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 用于合同信息提取的资源名称。 
     * @return ResourceName 用于合同信息提取的资源名称。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 用于合同信息提取的资源名称。
     * @param ResourceName 用于合同信息提取的资源名称。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 根据当前合同提取出的字段信息 
     * @return ExtractionFieldResults 根据当前合同提取出的字段信息
     */
    public ExtractionFieldResult [] getExtractionFieldResults() {
        return this.ExtractionFieldResults;
    }

    /**
     * Set 根据当前合同提取出的字段信息
     * @param ExtractionFieldResults 根据当前合同提取出的字段信息
     */
    public void setExtractionFieldResults(ExtractionFieldResult [] ExtractionFieldResults) {
        this.ExtractionFieldResults = ExtractionFieldResults;
    }

    public ExtractionTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractionTaskResult(ExtractionTaskResult source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ExtractionFieldResults != null) {
            this.ExtractionFieldResults = new ExtractionFieldResult[source.ExtractionFieldResults.length];
            for (int i = 0; i < source.ExtractionFieldResults.length; i++) {
                this.ExtractionFieldResults[i] = new ExtractionFieldResult(source.ExtractionFieldResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamArrayObj(map, prefix + "ExtractionFieldResults.", this.ExtractionFieldResults);

    }
}

