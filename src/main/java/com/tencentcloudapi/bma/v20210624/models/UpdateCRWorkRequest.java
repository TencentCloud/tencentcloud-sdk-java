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
    * 作品ID
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * 文件的扩展名，例如txt，docx
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 内容的base64编码
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 本次存证类型：0-不存证 1-存当前文件 2-存历史全量文件
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
     * Get 作品ID 
     * @return WorkId 作品ID
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 作品ID
     * @param WorkId 作品ID
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 文件的扩展名，例如txt，docx 
     * @return ContentType 文件的扩展名，例如txt，docx
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 文件的扩展名，例如txt，docx
     * @param ContentType 文件的扩展名，例如txt，docx
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 内容的base64编码 
     * @return Content 内容的base64编码
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容的base64编码
     * @param Content 内容的base64编码
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 本次存证类型：0-不存证 1-存当前文件 2-存历史全量文件 
     * @return CertType 本次存证类型：0-不存证 1-存当前文件 2-存历史全量文件
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 本次存证类型：0-不存证 1-存当前文件 2-存历史全量文件
     * @param CertType 本次存证类型：0-不存证 1-存当前文件 2-存历史全量文件
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

