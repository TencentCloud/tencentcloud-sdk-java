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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLineageRequest extends AbstractModel {

    /**
    * <p>实体唯一ID</p>
    */
    @SerializedName("ResourceUniqueId")
    @Expose
    private String ResourceUniqueId;

    /**
    * <p>实体类型 TABLE|METRIC|MODEL|SERVICE|COLUMN</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>血缘方向 INPUT｜OUTPUT</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>分页大小</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>来源：WEDATA|THIRD 默认WEDATA</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get <p>实体唯一ID</p> 
     * @return ResourceUniqueId <p>实体唯一ID</p>
     */
    public String getResourceUniqueId() {
        return this.ResourceUniqueId;
    }

    /**
     * Set <p>实体唯一ID</p>
     * @param ResourceUniqueId <p>实体唯一ID</p>
     */
    public void setResourceUniqueId(String ResourceUniqueId) {
        this.ResourceUniqueId = ResourceUniqueId;
    }

    /**
     * Get <p>实体类型 TABLE|METRIC|MODEL|SERVICE|COLUMN</p> 
     * @return ResourceType <p>实体类型 TABLE|METRIC|MODEL|SERVICE|COLUMN</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>实体类型 TABLE|METRIC|MODEL|SERVICE|COLUMN</p>
     * @param ResourceType <p>实体类型 TABLE|METRIC|MODEL|SERVICE|COLUMN</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>血缘方向 INPUT｜OUTPUT</p> 
     * @return Direction <p>血缘方向 INPUT｜OUTPUT</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>血缘方向 INPUT｜OUTPUT</p>
     * @param Direction <p>血缘方向 INPUT｜OUTPUT</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNumber <p>页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p>
     * @param PageNumber <p>页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>分页大小</p> 
     * @return PageSize <p>分页大小</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小</p>
     * @param PageSize <p>分页大小</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>来源：WEDATA|THIRD 默认WEDATA</p> 
     * @return Platform <p>来源：WEDATA|THIRD 默认WEDATA</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>来源：WEDATA|THIRD 默认WEDATA</p>
     * @param Platform <p>来源：WEDATA|THIRD 默认WEDATA</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public ListLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLineageRequest(ListLineageRequest source) {
        if (source.ResourceUniqueId != null) {
            this.ResourceUniqueId = new String(source.ResourceUniqueId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceUniqueId", this.ResourceUniqueId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

