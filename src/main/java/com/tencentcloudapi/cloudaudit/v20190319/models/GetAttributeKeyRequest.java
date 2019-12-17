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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAttributeKeyRequest extends AbstractModel{

    /**
    * 网站类型，取值范围是zh和en。如果不传值默认zh
    */
    @SerializedName("WebsiteType")
    @Expose
    private String WebsiteType;

    /**
     * Get 网站类型，取值范围是zh和en。如果不传值默认zh 
     * @return WebsiteType 网站类型，取值范围是zh和en。如果不传值默认zh
     */
    public String getWebsiteType() {
        return this.WebsiteType;
    }

    /**
     * Set 网站类型，取值范围是zh和en。如果不传值默认zh
     * @param WebsiteType 网站类型，取值范围是zh和en。如果不传值默认zh
     */
    public void setWebsiteType(String WebsiteType) {
        this.WebsiteType = WebsiteType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebsiteType", this.WebsiteType);

    }
}

