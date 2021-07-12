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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInfoSearchCriteria extends AbstractModel{

    /**
    * 应用匹配搜索关键字，匹配范围包括：应用名称、应用ID。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 应用类型。ApplicationType的取值范围有：OAUTH2、JWT、CAS、SAML2、FORM、OIDC、APIGW。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
     * Get 应用匹配搜索关键字，匹配范围包括：应用名称、应用ID。 
     * @return Keyword 应用匹配搜索关键字，匹配范围包括：应用名称、应用ID。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 应用匹配搜索关键字，匹配范围包括：应用名称、应用ID。
     * @param Keyword 应用匹配搜索关键字，匹配范围包括：应用名称、应用ID。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 应用类型。ApplicationType的取值范围有：OAUTH2、JWT、CAS、SAML2、FORM、OIDC、APIGW。 
     * @return ApplicationType 应用类型。ApplicationType的取值范围有：OAUTH2、JWT、CAS、SAML2、FORM、OIDC、APIGW。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型。ApplicationType的取值范围有：OAUTH2、JWT、CAS、SAML2、FORM、OIDC、APIGW。
     * @param ApplicationType 应用类型。ApplicationType的取值范围有：OAUTH2、JWT、CAS、SAML2、FORM、OIDC、APIGW。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    public ApplicationInfoSearchCriteria() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInfoSearchCriteria(ApplicationInfoSearchCriteria source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);

    }
}

