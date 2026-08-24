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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySitePairAttributeRequest extends AbstractModel {

    /**
    * 要修改属性的容灾站点id
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 容灾站点名称
    */
    @SerializedName("SitePairName")
    @Expose
    private String SitePairName;

    /**
     * Get 要修改属性的容灾站点id 
     * @return SitePairId 要修改属性的容灾站点id
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 要修改属性的容灾站点id
     * @param SitePairId 要修改属性的容灾站点id
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 容灾站点名称 
     * @return SitePairName 容灾站点名称
     */
    public String getSitePairName() {
        return this.SitePairName;
    }

    /**
     * Set 容灾站点名称
     * @param SitePairName 容灾站点名称
     */
    public void setSitePairName(String SitePairName) {
        this.SitePairName = SitePairName;
    }

    public ModifySitePairAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySitePairAttributeRequest(ModifySitePairAttributeRequest source) {
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.SitePairName != null) {
            this.SitePairName = new String(source.SitePairName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "SitePairName", this.SitePairName);

    }
}

