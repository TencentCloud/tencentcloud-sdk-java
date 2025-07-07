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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongUpstreamList extends AbstractModel {

    /**
    * 无
    */
    @SerializedName("UpstreamList")
    @Expose
    private KongUpstreamPreview [] UpstreamList;

    /**
     * Get 无 
     * @return UpstreamList 无
     */
    public KongUpstreamPreview [] getUpstreamList() {
        return this.UpstreamList;
    }

    /**
     * Set 无
     * @param UpstreamList 无
     */
    public void setUpstreamList(KongUpstreamPreview [] UpstreamList) {
        this.UpstreamList = UpstreamList;
    }

    public KongUpstreamList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongUpstreamList(KongUpstreamList source) {
        if (source.UpstreamList != null) {
            this.UpstreamList = new KongUpstreamPreview[source.UpstreamList.length];
            for (int i = 0; i < source.UpstreamList.length; i++) {
                this.UpstreamList[i] = new KongUpstreamPreview(source.UpstreamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UpstreamList.", this.UpstreamList);

    }
}

