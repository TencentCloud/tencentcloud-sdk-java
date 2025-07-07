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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMediaRequest extends AbstractModel {

    /**
    * 媒资文件在系统中的ID
    */
    @SerializedName("MediaId")
    @Expose
    private String MediaId;

    /**
     * Get 媒资文件在系统中的ID 
     * @return MediaId 媒资文件在系统中的ID
     */
    public String getMediaId() {
        return this.MediaId;
    }

    /**
     * Set 媒资文件在系统中的ID
     * @param MediaId 媒资文件在系统中的ID
     */
    public void setMediaId(String MediaId) {
        this.MediaId = MediaId;
    }

    public DeleteMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMediaRequest(DeleteMediaRequest source) {
        if (source.MediaId != null) {
            this.MediaId = new String(source.MediaId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);

    }
}

