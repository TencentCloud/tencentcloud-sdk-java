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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncAndroidInstanceImage extends AbstractModel {

    /**
    * 镜像 ID
    */
    @SerializedName("AndroidInstanceImageId")
    @Expose
    private String AndroidInstanceImageId;

    /**
    * 镜像可用区
    */
    @SerializedName("AndroidInstanceImageZone")
    @Expose
    private String AndroidInstanceImageZone;

    /**
     * Get 镜像 ID 
     * @return AndroidInstanceImageId 镜像 ID
     */
    public String getAndroidInstanceImageId() {
        return this.AndroidInstanceImageId;
    }

    /**
     * Set 镜像 ID
     * @param AndroidInstanceImageId 镜像 ID
     */
    public void setAndroidInstanceImageId(String AndroidInstanceImageId) {
        this.AndroidInstanceImageId = AndroidInstanceImageId;
    }

    /**
     * Get 镜像可用区 
     * @return AndroidInstanceImageZone 镜像可用区
     */
    public String getAndroidInstanceImageZone() {
        return this.AndroidInstanceImageZone;
    }

    /**
     * Set 镜像可用区
     * @param AndroidInstanceImageZone 镜像可用区
     */
    public void setAndroidInstanceImageZone(String AndroidInstanceImageZone) {
        this.AndroidInstanceImageZone = AndroidInstanceImageZone;
    }

    public SyncAndroidInstanceImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncAndroidInstanceImage(SyncAndroidInstanceImage source) {
        if (source.AndroidInstanceImageId != null) {
            this.AndroidInstanceImageId = new String(source.AndroidInstanceImageId);
        }
        if (source.AndroidInstanceImageZone != null) {
            this.AndroidInstanceImageZone = new String(source.AndroidInstanceImageZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceImageId", this.AndroidInstanceImageId);
        this.setParamSimple(map, prefix + "AndroidInstanceImageZone", this.AndroidInstanceImageZone);

    }
}

