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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePathRewritesRequest extends AbstractModel{

    /**
    * 路径重写规则IDs
    */
    @SerializedName("PathRewriteIds")
    @Expose
    private String [] PathRewriteIds;

    /**
     * Get 路径重写规则IDs 
     * @return PathRewriteIds 路径重写规则IDs
     */
    public String [] getPathRewriteIds() {
        return this.PathRewriteIds;
    }

    /**
     * Set 路径重写规则IDs
     * @param PathRewriteIds 路径重写规则IDs
     */
    public void setPathRewriteIds(String [] PathRewriteIds) {
        this.PathRewriteIds = PathRewriteIds;
    }

    public DeletePathRewritesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePathRewritesRequest(DeletePathRewritesRequest source) {
        if (source.PathRewriteIds != null) {
            this.PathRewriteIds = new String[source.PathRewriteIds.length];
            for (int i = 0; i < source.PathRewriteIds.length; i++) {
                this.PathRewriteIds[i] = new String(source.PathRewriteIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PathRewriteIds.", this.PathRewriteIds);

    }
}

