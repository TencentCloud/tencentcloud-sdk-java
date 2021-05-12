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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherMaterial extends AbstractModel{

    /**
    * 素材媒体文件的播放 URL 地址。
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
    * 云点播媒资 FileId。
    */
    @SerializedName("VodFileId")
    @Expose
    private String VodFileId;

    /**
     * Get 素材媒体文件的播放 URL 地址。 
     * @return MaterialUrl 素材媒体文件的播放 URL 地址。
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set 素材媒体文件的播放 URL 地址。
     * @param MaterialUrl 素材媒体文件的播放 URL 地址。
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    /**
     * Get 云点播媒资 FileId。 
     * @return VodFileId 云点播媒资 FileId。
     */
    public String getVodFileId() {
        return this.VodFileId;
    }

    /**
     * Set 云点播媒资 FileId。
     * @param VodFileId 云点播媒资 FileId。
     */
    public void setVodFileId(String VodFileId) {
        this.VodFileId = VodFileId;
    }

    public OtherMaterial() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherMaterial(OtherMaterial source) {
        if (source.MaterialUrl != null) {
            this.MaterialUrl = new String(source.MaterialUrl);
        }
        if (source.VodFileId != null) {
            this.VodFileId = new String(source.VodFileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);
        this.setParamSimple(map, prefix + "VodFileId", this.VodFileId);

    }
}

