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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePathRewritesWithDetailRespRequest extends AbstractModel {

    /**
    * 路径重写列表
    */
    @SerializedName("PathRewrites")
    @Expose
    private PathRewriteCreateObject [] PathRewrites;

    /**
     * Get 路径重写列表 
     * @return PathRewrites 路径重写列表
     */
    public PathRewriteCreateObject [] getPathRewrites() {
        return this.PathRewrites;
    }

    /**
     * Set 路径重写列表
     * @param PathRewrites 路径重写列表
     */
    public void setPathRewrites(PathRewriteCreateObject [] PathRewrites) {
        this.PathRewrites = PathRewrites;
    }

    public CreatePathRewritesWithDetailRespRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePathRewritesWithDetailRespRequest(CreatePathRewritesWithDetailRespRequest source) {
        if (source.PathRewrites != null) {
            this.PathRewrites = new PathRewriteCreateObject[source.PathRewrites.length];
            for (int i = 0; i < source.PathRewrites.length; i++) {
                this.PathRewrites[i] = new PathRewriteCreateObject(source.PathRewrites[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PathRewrites.", this.PathRewrites);

    }
}

