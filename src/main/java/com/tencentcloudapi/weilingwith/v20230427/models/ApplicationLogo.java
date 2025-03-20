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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationLogo extends AbstractModel {

    /**
    * logo图片对应的fileId
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * logo图片地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get logo图片对应的fileId 
     * @return FileId logo图片对应的fileId
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set logo图片对应的fileId
     * @param FileId logo图片对应的fileId
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get logo图片地址 
     * @return Url logo图片地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set logo图片地址
     * @param Url logo图片地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ApplicationLogo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationLogo(ApplicationLogo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

