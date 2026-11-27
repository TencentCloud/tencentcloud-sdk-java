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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCageListRequest extends AbstractModel {

    /**
    * <p>金融围拢ID、或者独享集群ID</p>
    */
    @SerializedName("CageIds")
    @Expose
    private String [] CageIds;

    /**
    * <p>金融围拢名称/独享集群名称</p>
    */
    @SerializedName("CageName")
    @Expose
    private String CageName;

    /**
    * <p>本地专属集群所在可用用ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>查询本地专属集群列表LIMIT</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>金融围拢ID、或者独享集群ID</p> 
     * @return CageIds <p>金融围拢ID、或者独享集群ID</p>
     */
    public String [] getCageIds() {
        return this.CageIds;
    }

    /**
     * Set <p>金融围拢ID、或者独享集群ID</p>
     * @param CageIds <p>金融围拢ID、或者独享集群ID</p>
     */
    public void setCageIds(String [] CageIds) {
        this.CageIds = CageIds;
    }

    /**
     * Get <p>金融围拢名称/独享集群名称</p> 
     * @return CageName <p>金融围拢名称/独享集群名称</p>
     */
    public String getCageName() {
        return this.CageName;
    }

    /**
     * Set <p>金融围拢名称/独享集群名称</p>
     * @param CageName <p>金融围拢名称/独享集群名称</p>
     */
    public void setCageName(String CageName) {
        this.CageName = CageName;
    }

    /**
     * Get <p>本地专属集群所在可用用ID</p> 
     * @return ZoneId <p>本地专属集群所在可用用ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>本地专属集群所在可用用ID</p>
     * @param ZoneId <p>本地专属集群所在可用用ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>查询本地专属集群列表LIMIT</p> 
     * @return Limit <p>查询本地专属集群列表LIMIT</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询本地专属集群列表LIMIT</p>
     * @param Limit <p>查询本地专属集群列表LIMIT</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页</p> 
     * @return Offset <p>分页</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页</p>
     * @param Offset <p>分页</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCageListRequest(DescribeCageListRequest source) {
        if (source.CageIds != null) {
            this.CageIds = new String[source.CageIds.length];
            for (int i = 0; i < source.CageIds.length; i++) {
                this.CageIds[i] = new String(source.CageIds[i]);
            }
        }
        if (source.CageName != null) {
            this.CageName = new String(source.CageName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
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
        this.setParamArraySimple(map, prefix + "CageIds.", this.CageIds);
        this.setParamSimple(map, prefix + "CageName", this.CageName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

