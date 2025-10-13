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

public class ListColumnLineageRequest extends AbstractModel {

    /**
    * 表唯一ID
    */
    @SerializedName("TableUniqueId")
    @Expose
    private String TableUniqueId;

    /**
    * 血缘方向 INPUT｜OUTPUT
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 列名称
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 来源：WEDATA|THIRD 默认WEDATA
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get 表唯一ID 
     * @return TableUniqueId 表唯一ID
     */
    public String getTableUniqueId() {
        return this.TableUniqueId;
    }

    /**
     * Set 表唯一ID
     * @param TableUniqueId 表唯一ID
     */
    public void setTableUniqueId(String TableUniqueId) {
        this.TableUniqueId = TableUniqueId;
    }

    /**
     * Get 血缘方向 INPUT｜OUTPUT 
     * @return Direction 血缘方向 INPUT｜OUTPUT
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 血缘方向 INPUT｜OUTPUT
     * @param Direction 血缘方向 INPUT｜OUTPUT
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 列名称 
     * @return ColumnName 列名称
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 列名称
     * @param ColumnName 列名称
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 来源：WEDATA|THIRD 默认WEDATA 
     * @return Platform 来源：WEDATA|THIRD 默认WEDATA
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 来源：WEDATA|THIRD 默认WEDATA
     * @param Platform 来源：WEDATA|THIRD 默认WEDATA
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public ListColumnLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListColumnLineageRequest(ListColumnLineageRequest source) {
        if (source.TableUniqueId != null) {
            this.TableUniqueId = new String(source.TableUniqueId);
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
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableUniqueId", this.TableUniqueId);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

