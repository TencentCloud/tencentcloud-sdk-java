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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportOpenApiRequest extends AbstractModel{

    /**
    * API所在的服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * openAPI正文内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Content格式，只能是YAML或者JSON，默认是YAML。
    */
    @SerializedName("EncodeType")
    @Expose
    private String EncodeType;

    /**
    * Content版本，默认是openAPI，目前只支持openAPI。
    */
    @SerializedName("ContentVersion")
    @Expose
    private String ContentVersion;

    /**
     * Get API所在的服务唯一ID。 
     * @return ServiceId API所在的服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set API所在的服务唯一ID。
     * @param ServiceId API所在的服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get openAPI正文内容。 
     * @return Content openAPI正文内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set openAPI正文内容。
     * @param Content openAPI正文内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Content格式，只能是YAML或者JSON，默认是YAML。 
     * @return EncodeType Content格式，只能是YAML或者JSON，默认是YAML。
     */
    public String getEncodeType() {
        return this.EncodeType;
    }

    /**
     * Set Content格式，只能是YAML或者JSON，默认是YAML。
     * @param EncodeType Content格式，只能是YAML或者JSON，默认是YAML。
     */
    public void setEncodeType(String EncodeType) {
        this.EncodeType = EncodeType;
    }

    /**
     * Get Content版本，默认是openAPI，目前只支持openAPI。 
     * @return ContentVersion Content版本，默认是openAPI，目前只支持openAPI。
     */
    public String getContentVersion() {
        return this.ContentVersion;
    }

    /**
     * Set Content版本，默认是openAPI，目前只支持openAPI。
     * @param ContentVersion Content版本，默认是openAPI，目前只支持openAPI。
     */
    public void setContentVersion(String ContentVersion) {
        this.ContentVersion = ContentVersion;
    }

    public ImportOpenApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportOpenApiRequest(ImportOpenApiRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.EncodeType != null) {
            this.EncodeType = new String(source.EncodeType);
        }
        if (source.ContentVersion != null) {
            this.ContentVersion = new String(source.ContentVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "EncodeType", this.EncodeType);
        this.setParamSimple(map, prefix + "ContentVersion", this.ContentVersion);

    }
}

