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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoverBySnapshotTaskOutput extends AbstractModel {

    /**
    * 封面 URL。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
     * Get 封面 URL。 
     * @return CoverUrl 封面 URL。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 封面 URL。
     * @param CoverUrl 封面 URL。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    public CoverBySnapshotTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoverBySnapshotTaskOutput(CoverBySnapshotTaskOutput source) {
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);

    }
}

