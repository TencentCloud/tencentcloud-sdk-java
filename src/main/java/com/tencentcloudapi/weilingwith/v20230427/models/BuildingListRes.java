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

public class BuildingListRes extends AbstractModel {

    /**
    * 建筑列表
    */
    @SerializedName("BuildingProfileList")
    @Expose
    private BuildingProfile [] BuildingProfileList;

    /**
     * Get 建筑列表 
     * @return BuildingProfileList 建筑列表
     */
    public BuildingProfile [] getBuildingProfileList() {
        return this.BuildingProfileList;
    }

    /**
     * Set 建筑列表
     * @param BuildingProfileList 建筑列表
     */
    public void setBuildingProfileList(BuildingProfile [] BuildingProfileList) {
        this.BuildingProfileList = BuildingProfileList;
    }

    public BuildingListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildingListRes(BuildingListRes source) {
        if (source.BuildingProfileList != null) {
            this.BuildingProfileList = new BuildingProfile[source.BuildingProfileList.length];
            for (int i = 0; i < source.BuildingProfileList.length; i++) {
                this.BuildingProfileList[i] = new BuildingProfile(source.BuildingProfileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BuildingProfileList.", this.BuildingProfileList);

    }
}

