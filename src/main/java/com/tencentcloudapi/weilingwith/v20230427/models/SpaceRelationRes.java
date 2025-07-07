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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceRelationRes extends AbstractModel {

    /**
    * 空间层级关系
    */
    @SerializedName("SpaceRelation")
    @Expose
    private SpaceRelation SpaceRelation;

    /**
     * Get 空间层级关系 
     * @return SpaceRelation 空间层级关系
     */
    public SpaceRelation getSpaceRelation() {
        return this.SpaceRelation;
    }

    /**
     * Set 空间层级关系
     * @param SpaceRelation 空间层级关系
     */
    public void setSpaceRelation(SpaceRelation SpaceRelation) {
        this.SpaceRelation = SpaceRelation;
    }

    public SpaceRelationRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceRelationRes(SpaceRelationRes source) {
        if (source.SpaceRelation != null) {
            this.SpaceRelation = new SpaceRelation(source.SpaceRelation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SpaceRelation.", this.SpaceRelation);

    }
}

