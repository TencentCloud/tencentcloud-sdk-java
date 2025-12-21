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

public class DeleteCasterLayoutInfoRequest extends AbstractModel {

    /**
    * <p>导播台ID。</p>
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * <p>要删除的布局Index。注：待删除的Index对应的布局需存在。</p>
    */
    @SerializedName("LayoutIndex")
    @Expose
    private Long LayoutIndex;

    /**
     * Get <p>导播台ID。</p> 
     * @return CasterId <p>导播台ID。</p>
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set <p>导播台ID。</p>
     * @param CasterId <p>导播台ID。</p>
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get <p>要删除的布局Index。注：待删除的Index对应的布局需存在。</p> 
     * @return LayoutIndex <p>要删除的布局Index。注：待删除的Index对应的布局需存在。</p>
     */
    public Long getLayoutIndex() {
        return this.LayoutIndex;
    }

    /**
     * Set <p>要删除的布局Index。注：待删除的Index对应的布局需存在。</p>
     * @param LayoutIndex <p>要删除的布局Index。注：待删除的Index对应的布局需存在。</p>
     */
    public void setLayoutIndex(Long LayoutIndex) {
        this.LayoutIndex = LayoutIndex;
    }

    public DeleteCasterLayoutInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCasterLayoutInfoRequest(DeleteCasterLayoutInfoRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.LayoutIndex != null) {
            this.LayoutIndex = new Long(source.LayoutIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "LayoutIndex", this.LayoutIndex);

    }
}

