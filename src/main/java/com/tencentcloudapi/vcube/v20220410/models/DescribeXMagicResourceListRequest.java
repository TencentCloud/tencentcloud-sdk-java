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

public class DescribeXMagicResourceListRequest extends AbstractModel {

    /**
    * 分页页码 第一页是0
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 关联的应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 优图资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 查询关键字，资源Id、应用名称、包名
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 平台信息，pc 或者 mobile
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 所属业务，xmagic：优图， avatar：虚拟人，不传查全部
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
     * Get 分页页码 第一页是0 
     * @return PageNumber 分页页码 第一页是0
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码 第一页是0
     * @param PageNumber 分页页码 第一页是0
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量 
     * @return PageSize 每页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
     * @param PageSize 每页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 关联的应用名称 
     * @return AppName 关联的应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 关联的应用名称
     * @param AppName 关联的应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 优图资源Id 
     * @return ResourceId 优图资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 优图资源Id
     * @param ResourceId 优图资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 查询关键字，资源Id、应用名称、包名 
     * @return Word 查询关键字，资源Id、应用名称、包名
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 查询关键字，资源Id、应用名称、包名
     * @param Word 查询关键字，资源Id、应用名称、包名
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 平台信息，pc 或者 mobile 
     * @return Platform 平台信息，pc 或者 mobile
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台信息，pc 或者 mobile
     * @param Platform 平台信息，pc 或者 mobile
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 所属业务，xmagic：优图， avatar：虚拟人，不传查全部 
     * @return BizType 所属业务，xmagic：优图， avatar：虚拟人，不传查全部
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 所属业务，xmagic：优图， avatar：虚拟人，不传查全部
     * @param BizType 所属业务，xmagic：优图， avatar：虚拟人，不传查全部
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    public DescribeXMagicResourceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeXMagicResourceListRequest(DescribeXMagicResourceListRequest source) {
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
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);

    }
}

