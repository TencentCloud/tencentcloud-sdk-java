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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationRegionBlueprint extends AbstractModel {

    /**
    * 目标地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 目标地域镜像ID。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
     * Get 目标地域。 
     * @return Region 目标地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 目标地域。
     * @param Region 目标地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 目标地域镜像ID。 
     * @return BlueprintId 目标地域镜像ID。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 目标地域镜像ID。
     * @param BlueprintId 目标地域镜像ID。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    public DestinationRegionBlueprint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestinationRegionBlueprint(DestinationRegionBlueprint source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);

    }
}

