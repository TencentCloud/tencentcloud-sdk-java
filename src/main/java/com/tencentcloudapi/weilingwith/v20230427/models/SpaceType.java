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

public class SpaceType extends AbstractModel {

    /**
    * 空间分类编码
    */
    @SerializedName("SpaceTypeCode")
    @Expose
    private String SpaceTypeCode;

    /**
    * 空间分类名称
    */
    @SerializedName("SpaceTypeName")
    @Expose
    private String SpaceTypeName;

    /**
     * Get 空间分类编码 
     * @return SpaceTypeCode 空间分类编码
     */
    public String getSpaceTypeCode() {
        return this.SpaceTypeCode;
    }

    /**
     * Set 空间分类编码
     * @param SpaceTypeCode 空间分类编码
     */
    public void setSpaceTypeCode(String SpaceTypeCode) {
        this.SpaceTypeCode = SpaceTypeCode;
    }

    /**
     * Get 空间分类名称 
     * @return SpaceTypeName 空间分类名称
     */
    public String getSpaceTypeName() {
        return this.SpaceTypeName;
    }

    /**
     * Set 空间分类名称
     * @param SpaceTypeName 空间分类名称
     */
    public void setSpaceTypeName(String SpaceTypeName) {
        this.SpaceTypeName = SpaceTypeName;
    }

    public SpaceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceType(SpaceType source) {
        if (source.SpaceTypeCode != null) {
            this.SpaceTypeCode = new String(source.SpaceTypeCode);
        }
        if (source.SpaceTypeName != null) {
            this.SpaceTypeName = new String(source.SpaceTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceTypeCode", this.SpaceTypeCode);
        this.setParamSimple(map, prefix + "SpaceTypeName", this.SpaceTypeName);

    }
}

