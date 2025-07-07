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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVcubeResourcesListRequest extends AbstractModel {

    /**
    * 查询资源页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页的数据量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 应用名称，模块查询
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 资源Id，资源包id或者license资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源Id、应用名称、包名
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 查询资源所属平台，web、mobile
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get 查询资源页码 
     * @return PageNumber 查询资源页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 查询资源页码
     * @param PageNumber 查询资源页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页的数据量 
     * @return PageSize 每页的数据量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页的数据量
     * @param PageSize 每页的数据量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 应用名称，模块查询 
     * @return AppName 应用名称，模块查询
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称，模块查询
     * @param AppName 应用名称，模块查询
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 资源Id，资源包id或者license资源id 
     * @return ResourceId 资源Id，资源包id或者license资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id，资源包id或者license资源id
     * @param ResourceId 资源Id，资源包id或者license资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源Id、应用名称、包名 
     * @return Word 资源Id、应用名称、包名
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 资源Id、应用名称、包名
     * @param Word 资源Id、应用名称、包名
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 查询资源所属平台，web、mobile 
     * @return Platform 查询资源所属平台，web、mobile
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 查询资源所属平台，web、mobile
     * @param Platform 查询资源所属平台，web、mobile
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public DescribeVcubeResourcesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVcubeResourcesListRequest(DescribeVcubeResourcesListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

