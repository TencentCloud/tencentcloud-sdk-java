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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCateTreeRequest extends AbstractModel{

    /**
    * 分类ID
    */
    @SerializedName("CateId")
    @Expose
    private Long CateId;

    /**
     * Get 分类ID 
     * @return CateId 分类ID
     */
    public Long getCateId() {
        return this.CateId;
    }

    /**
     * Set 分类ID
     * @param CateId 分类ID
     */
    public void setCateId(Long CateId) {
        this.CateId = CateId;
    }

    public GetCateTreeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCateTreeRequest(GetCateTreeRequest source) {
        if (source.CateId != null) {
            this.CateId = new Long(source.CateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CateId", this.CateId);

    }
}

