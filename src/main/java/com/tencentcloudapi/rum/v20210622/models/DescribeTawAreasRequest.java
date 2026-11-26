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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTawAreasRequest extends AbstractModel {

    /**
    * <p>片区Id</p>
    */
    @SerializedName("AreaIds")
    @Expose
    private Long [] AreaIds;

    /**
    * <p>片区Key</p>
    */
    @SerializedName("AreaKeys")
    @Expose
    private String [] AreaKeys;

    /**
    * <p>分页Limit，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>片区状态(1=有效，2=无效)</p>
    */
    @SerializedName("AreaStatuses")
    @Expose
    private Long [] AreaStatuses;

    /**
    * <p>分页Offset，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>片区Id</p> 
     * @return AreaIds <p>片区Id</p>
     */
    public Long [] getAreaIds() {
        return this.AreaIds;
    }

    /**
     * Set <p>片区Id</p>
     * @param AreaIds <p>片区Id</p>
     */
    public void setAreaIds(Long [] AreaIds) {
        this.AreaIds = AreaIds;
    }

    /**
     * Get <p>片区Key</p> 
     * @return AreaKeys <p>片区Key</p>
     */
    public String [] getAreaKeys() {
        return this.AreaKeys;
    }

    /**
     * Set <p>片区Key</p>
     * @param AreaKeys <p>片区Key</p>
     */
    public void setAreaKeys(String [] AreaKeys) {
        this.AreaKeys = AreaKeys;
    }

    /**
     * Get <p>分页Limit，默认根据AreaKeys和AreaStatuses参数查询所有。</p> 
     * @return Limit <p>分页Limit，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页Limit，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
     * @param Limit <p>分页Limit，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>片区状态(1=有效，2=无效)</p> 
     * @return AreaStatuses <p>片区状态(1=有效，2=无效)</p>
     */
    public Long [] getAreaStatuses() {
        return this.AreaStatuses;
    }

    /**
     * Set <p>片区状态(1=有效，2=无效)</p>
     * @param AreaStatuses <p>片区状态(1=有效，2=无效)</p>
     */
    public void setAreaStatuses(Long [] AreaStatuses) {
        this.AreaStatuses = AreaStatuses;
    }

    /**
     * Get <p>分页Offset，默认根据AreaKeys和AreaStatuses参数查询所有。</p> 
     * @return Offset <p>分页Offset，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页Offset，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
     * @param Offset <p>分页Offset，默认根据AreaKeys和AreaStatuses参数查询所有。</p>
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

