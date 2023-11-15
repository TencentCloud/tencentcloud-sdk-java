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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildingProfileRes extends AbstractModel {

    /**
    * 建筑概要信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildingProfile")
    @Expose
    private BuildingProfile BuildingProfile;

    /**
     * Get 建筑概要信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildingProfile 建筑概要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BuildingProfile getBuildingProfile() {
        return this.BuildingProfile;
    }

    /**
     * Set 建筑概要信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildingProfile 建筑概要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildingProfile(BuildingProfile BuildingProfile) {
        this.BuildingProfile = BuildingProfile;
    }

    public BuildingProfileRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildingProfileRes(BuildingProfileRes source) {
        if (source.BuildingProfile != null) {
            this.BuildingProfile = new BuildingProfile(source.BuildingProfile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BuildingProfile.", this.BuildingProfile);

    }
}

