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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelAccessInfo extends AbstractModel {

    /**
    * 各站点的地域可用性列表。为空时表示未配置地域信息，模型不可用。
    */
    @SerializedName("ModelSiteRegions")
    @Expose
    private ModelSiteRegion [] ModelSiteRegions;

    /**
     * Get 各站点的地域可用性列表。为空时表示未配置地域信息，模型不可用。 
     * @return ModelSiteRegions 各站点的地域可用性列表。为空时表示未配置地域信息，模型不可用。
     */
    public ModelSiteRegion [] getModelSiteRegions() {
        return this.ModelSiteRegions;
    }

    /**
     * Set 各站点的地域可用性列表。为空时表示未配置地域信息，模型不可用。
     * @param ModelSiteRegions 各站点的地域可用性列表。为空时表示未配置地域信息，模型不可用。
     */
    public void setModelSiteRegions(ModelSiteRegion [] ModelSiteRegions) {
        this.ModelSiteRegions = ModelSiteRegions;
    }

    public ModelAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelAccessInfo(ModelAccessInfo source) {
        if (source.ModelSiteRegions != null) {
            this.ModelSiteRegions = new ModelSiteRegion[source.ModelSiteRegions.length];
            for (int i = 0; i < source.ModelSiteRegions.length; i++) {
                this.ModelSiteRegions[i] = new ModelSiteRegion(source.ModelSiteRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ModelSiteRegions.", this.ModelSiteRegions);

    }
}

