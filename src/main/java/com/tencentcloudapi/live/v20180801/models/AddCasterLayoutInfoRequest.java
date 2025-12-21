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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCasterLayoutInfoRequest extends AbstractModel {

    /**
    * <p>导播台ID</p>
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * <p>导播台布局参数信息。</p>
    */
    @SerializedName("LayoutInfo")
    @Expose
    private CasterLayoutInfo LayoutInfo;

    /**
     * Get <p>导播台ID</p> 
     * @return CasterId <p>导播台ID</p>
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set <p>导播台ID</p>
     * @param CasterId <p>导播台ID</p>
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get <p>导播台布局参数信息。</p> 
     * @return LayoutInfo <p>导播台布局参数信息。</p>
     */
    public CasterLayoutInfo getLayoutInfo() {
        return this.LayoutInfo;
    }

    /**
     * Set <p>导播台布局参数信息。</p>
     * @param LayoutInfo <p>导播台布局参数信息。</p>
     */
    public void setLayoutInfo(CasterLayoutInfo LayoutInfo) {
        this.LayoutInfo = LayoutInfo;
    }

    public AddCasterLayoutInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCasterLayoutInfoRequest(AddCasterLayoutInfoRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.LayoutInfo != null) {
            this.LayoutInfo = new CasterLayoutInfo(source.LayoutInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamObj(map, prefix + "LayoutInfo.", this.LayoutInfo);

    }
}

