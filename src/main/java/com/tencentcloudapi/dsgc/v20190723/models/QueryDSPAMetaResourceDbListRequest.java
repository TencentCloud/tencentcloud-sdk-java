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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDSPAMetaResourceDbListRequest extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 数据库实例ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 数据库实例所在地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 数据库实例类型。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 数据库实例ID。 
     * @return ResourceId 数据库实例ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 数据库实例ID。
     * @param ResourceId 数据库实例ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 数据库实例所在地域。 
     * @return ResourceRegion 数据库实例所在地域。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 数据库实例所在地域。
     * @param ResourceRegion 数据库实例所在地域。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 数据库实例类型。 
     * @return MetaType 数据库实例类型。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 数据库实例类型。
     * @param MetaType 数据库实例类型。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    public QueryDSPAMetaResourceDbListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDSPAMetaResourceDbListRequest(QueryDSPAMetaResourceDbListRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);

    }
}

