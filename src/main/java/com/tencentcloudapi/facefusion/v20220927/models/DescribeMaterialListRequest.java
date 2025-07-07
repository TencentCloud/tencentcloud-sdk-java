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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMaterialListRequest extends AbstractModel {

    /**
    * 活动Id
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 素材Id
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 每次拉取条数。
每次拉取素材最多可支持拉取20条素材信息，如果需要拉取全部素材信息，可以分多次请求拉取全部素材信息。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 活动Id 
     * @return ActivityId 活动Id
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动Id
     * @param ActivityId 活动Id
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 素材Id 
     * @return MaterialId 素材Id
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材Id
     * @param MaterialId 素材Id
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 每次拉取条数。
每次拉取素材最多可支持拉取20条素材信息，如果需要拉取全部素材信息，可以分多次请求拉取全部素材信息。 
     * @return Limit 每次拉取条数。
每次拉取素材最多可支持拉取20条素材信息，如果需要拉取全部素材信息，可以分多次请求拉取全部素材信息。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次拉取条数。
每次拉取素材最多可支持拉取20条素材信息，如果需要拉取全部素材信息，可以分多次请求拉取全部素材信息。
     * @param Limit 每次拉取条数。
每次拉取素材最多可支持拉取20条素材信息，如果需要拉取全部素材信息，可以分多次请求拉取全部素材信息。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeMaterialListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMaterialListRequest(DescribeMaterialListRequest source) {
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

