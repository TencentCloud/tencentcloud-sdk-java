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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAndroidInstanceImagesRequest extends AbstractModel {

    /**
    * 镜像 ID 列表
    */
    @SerializedName("AndroidInstanceImageIds")
    @Expose
    private String [] AndroidInstanceImageIds;

    /**
     * Get 镜像 ID 列表 
     * @return AndroidInstanceImageIds 镜像 ID 列表
     */
    public String [] getAndroidInstanceImageIds() {
        return this.AndroidInstanceImageIds;
    }

    /**
     * Set 镜像 ID 列表
     * @param AndroidInstanceImageIds 镜像 ID 列表
     */
    public void setAndroidInstanceImageIds(String [] AndroidInstanceImageIds) {
        this.AndroidInstanceImageIds = AndroidInstanceImageIds;
    }

    public DeleteAndroidInstanceImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAndroidInstanceImagesRequest(DeleteAndroidInstanceImagesRequest source) {
        if (source.AndroidInstanceImageIds != null) {
            this.AndroidInstanceImageIds = new String[source.AndroidInstanceImageIds.length];
            for (int i = 0; i < source.AndroidInstanceImageIds.length; i++) {
                this.AndroidInstanceImageIds[i] = new String(source.AndroidInstanceImageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceImageIds.", this.AndroidInstanceImageIds);

    }
}

