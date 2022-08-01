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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCRWorkRequest extends AbstractModel{

    /**
    * xx
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * xx
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * xx
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * xx
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
     * Get xx 
     * @return WorkId xx
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set xx
     * @param WorkId xx
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get xx 
     * @return ContentType xx
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set xx
     * @param ContentType xx
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get xx 
     * @return Content xx
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set xx
     * @param Content xx
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get xx 
     * @return CertType xx
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set xx
     * @param CertType xx
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    public UpdateCRWorkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCRWorkRequest(UpdateCRWorkRequest source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CertType", this.CertType);

    }
}

