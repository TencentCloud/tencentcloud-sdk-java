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

public class SpaceTypeListRes extends AbstractModel {

    /**
    * 空间分类列表
    */
    @SerializedName("SpaceTypeList")
    @Expose
    private SpaceType [] SpaceTypeList;

    /**
     * Get 空间分类列表 
     * @return SpaceTypeList 空间分类列表
     */
    public SpaceType [] getSpaceTypeList() {
        return this.SpaceTypeList;
    }

    /**
     * Set 空间分类列表
     * @param SpaceTypeList 空间分类列表
     */
    public void setSpaceTypeList(SpaceType [] SpaceTypeList) {
        this.SpaceTypeList = SpaceTypeList;
    }

    public SpaceTypeListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceTypeListRes(SpaceTypeListRes source) {
        if (source.SpaceTypeList != null) {
            this.SpaceTypeList = new SpaceType[source.SpaceTypeList.length];
            for (int i = 0; i < source.SpaceTypeList.length; i++) {
                this.SpaceTypeList[i] = new SpaceType(source.SpaceTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SpaceTypeList.", this.SpaceTypeList);

    }
}

