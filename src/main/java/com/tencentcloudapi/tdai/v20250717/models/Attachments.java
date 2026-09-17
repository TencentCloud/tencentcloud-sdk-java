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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Attachments extends AbstractModel {

    /**
    * <p>cos key</p>
    */
    @SerializedName("CosKey")
    @Expose
    private String CosKey;

    /**
    * <p>图片类型</p>
    */
    @SerializedName("MimeType")
    @Expose
    private String MimeType;

    /**
     * Get <p>cos key</p> 
     * @return CosKey <p>cos key</p>
     */
    public String getCosKey() {
        return this.CosKey;
    }

    /**
     * Set <p>cos key</p>
     * @param CosKey <p>cos key</p>
     */
    public void setCosKey(String CosKey) {
        this.CosKey = CosKey;
    }

    /**
     * Get <p>图片类型</p> 
     * @return MimeType <p>图片类型</p>
     */
    public String getMimeType() {
        return this.MimeType;
    }

    /**
     * Set <p>图片类型</p>
     * @param MimeType <p>图片类型</p>
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    public Attachments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Attachments(Attachments source) {
        if (source.CosKey != null) {
            this.CosKey = new String(source.CosKey);
        }
        if (source.MimeType != null) {
            this.MimeType = new String(source.MimeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosKey", this.CosKey);
        this.setParamSimple(map, prefix + "MimeType", this.MimeType);

    }
}

