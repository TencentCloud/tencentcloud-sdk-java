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

public class ExternalMediaInfo extends AbstractModel{

    /**
    * 目前仅支持绑定 COS 桶的媒体，请填写存储对象 Key 值，例如：`example-folder/example.mp4`。
    */
    @SerializedName("MediaKey")
    @Expose
    private String MediaKey;

    /**
    * 该字段废弃，请勿使用。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 媒资挂载的存储 Id。
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
     * Get 目前仅支持绑定 COS 桶的媒体，请填写存储对象 Key 值，例如：`example-folder/example.mp4`。 
     * @return MediaKey 目前仅支持绑定 COS 桶的媒体，请填写存储对象 Key 值，例如：`example-folder/example.mp4`。
     */
    public String getMediaKey() {
        return this.MediaKey;
    }

    /**
     * Set 目前仅支持绑定 COS 桶的媒体，请填写存储对象 Key 值，例如：`example-folder/example.mp4`。
     * @param MediaKey 目前仅支持绑定 COS 桶的媒体，请填写存储对象 Key 值，例如：`example-folder/example.mp4`。
     */
    public void setMediaKey(String MediaKey) {
        this.MediaKey = MediaKey;
    }

    /**
     * Get 该字段废弃，请勿使用。 
     * @return Definition 该字段废弃，请勿使用。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 该字段废弃，请勿使用。
     * @param Definition 该字段废弃，请勿使用。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 媒资挂载的存储 Id。 
     * @return StorageId 媒资挂载的存储 Id。
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 媒资挂载的存储 Id。
     * @param StorageId 媒资挂载的存储 Id。
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    public ExternalMediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalMediaInfo(ExternalMediaInfo source) {
        if (source.MediaKey != null) {
            this.MediaKey = new String(source.MediaKey);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaKey", this.MediaKey);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);

    }
}

