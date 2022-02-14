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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTawAreasRequest extends AbstractModel{

    /**
    * 片区Id
    */
    @SerializedName("AreaIds")
    @Expose
    private Long [] AreaIds;

    /**
    * 片区Key
    */
    @SerializedName("AreaKeys")
    @Expose
    private String [] AreaKeys;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 片区状态(1=有效，2=无效)
    */
    @SerializedName("AreaStatuses")
    @Expose
    private Long [] AreaStatuses;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 片区Id 
     * @return AreaIds 片区Id
     */
    public Long [] getAreaIds() {
        return this.AreaIds;
    }

    /**
     * Set 片区Id
     * @param AreaIds 片区Id
     */
    public void setAreaIds(Long [] AreaIds) {
        this.AreaIds = AreaIds;
    }

    /**
     * Get 片区Key 
     * @return AreaKeys 片区Key
     */
    public String [] getAreaKeys() {
        return this.AreaKeys;
    }

    /**
     * Set 片区Key
     * @param AreaKeys 片区Key
     */
    public void setAreaKeys(String [] AreaKeys) {
        this.AreaKeys = AreaKeys;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 片区状态(1=有效，2=无效) 
     * @return AreaStatuses 片区状态(1=有效，2=无效)
     */
    public Long [] getAreaStatuses() {
        return this.AreaStatuses;
    }

    /**
     * Set 片区状态(1=有效，2=无效)
     * @param AreaStatuses 片区状态(1=有效，2=无效)
     */
    public void setAreaStatuses(Long [] AreaStatuses) {
        this.AreaStatuses = AreaStatuses;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTawAreasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTawAreasRequest(DescribeTawAreasRequest source) {
        if (source.AreaIds != null) {
            this.AreaIds = new Long[source.AreaIds.length];
            for (int i = 0; i < source.AreaIds.length; i++) {
                this.AreaIds[i] = new Long(source.AreaIds[i]);
            }
        }
        if (source.AreaKeys != null) {
            this.AreaKeys = new String[source.AreaKeys.length];
            for (int i = 0; i < source.AreaKeys.length; i++) {
                this.AreaKeys[i] = new String(source.AreaKeys[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AreaStatuses != null) {
            this.AreaStatuses = new Long[source.AreaStatuses.length];
            for (int i = 0; i < source.AreaStatuses.length; i++) {
                this.AreaStatuses[i] = new Long(source.AreaStatuses[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AreaIds.", this.AreaIds);
        this.setParamArraySimple(map, prefix + "AreaKeys.", this.AreaKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "AreaStatuses.", this.AreaStatuses);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

