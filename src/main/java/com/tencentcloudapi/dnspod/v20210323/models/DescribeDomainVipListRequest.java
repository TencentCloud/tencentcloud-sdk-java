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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainVipListRequest extends AbstractModel {

    /**
    * 偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数量，默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 通过关键字搜索域名关联的套餐，默认值为空，为空时不作为筛选条件。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 使用资源ID列表查询
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
    * 需要筛选的套餐版本
    */
    @SerializedName("GradeList")
    @Expose
    private String [] GradeList;

    /**
    * 是否只获取未绑定域名套餐
    */
    @SerializedName("GetUnbindResource")
    @Expose
    private Boolean GetUnbindResource;

    /**
     * Get 偏移量，默认值为0。 
     * @return Offset 偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0。
     * @param Offset 偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数量，默认值为20。 
     * @return Limit 限制数量，默认值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数量，默认值为20。
     * @param Limit 限制数量，默认值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 通过关键字搜索域名关联的套餐，默认值为空，为空时不作为筛选条件。 
     * @return Keyword 通过关键字搜索域名关联的套餐，默认值为空，为空时不作为筛选条件。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 通过关键字搜索域名关联的套餐，默认值为空，为空时不作为筛选条件。
     * @param Keyword 通过关键字搜索域名关联的套餐，默认值为空，为空时不作为筛选条件。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 使用资源ID列表查询 
     * @return ResourceIdList 使用资源ID列表查询
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set 使用资源ID列表查询
     * @param ResourceIdList 使用资源ID列表查询
     */
    public void setResourceIdList(String [] ResourceIdList) {
        this.ResourceIdList = ResourceIdList;
    }

    /**
     * Get 需要筛选的套餐版本 
     * @return GradeList 需要筛选的套餐版本
     */
    public String [] getGradeList() {
        return this.GradeList;
    }

    /**
     * Set 需要筛选的套餐版本
     * @param GradeList 需要筛选的套餐版本
     */
    public void setGradeList(String [] GradeList) {
        this.GradeList = GradeList;
    }

    /**
     * Get 是否只获取未绑定域名套餐 
     * @return GetUnbindResource 是否只获取未绑定域名套餐
     */
    public Boolean getGetUnbindResource() {
        return this.GetUnbindResource;
    }

    /**
     * Set 是否只获取未绑定域名套餐
     * @param GetUnbindResource 是否只获取未绑定域名套餐
     */
    public void setGetUnbindResource(Boolean GetUnbindResource) {
        this.GetUnbindResource = GetUnbindResource;
    }

    public DescribeDomainVipListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainVipListRequest(DescribeDomainVipListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ResourceIdList != null) {
            this.ResourceIdList = new String[source.ResourceIdList.length];
            for (int i = 0; i < source.ResourceIdList.length; i++) {
                this.ResourceIdList[i] = new String(source.ResourceIdList[i]);
            }
        }
        if (source.GradeList != null) {
            this.GradeList = new String[source.GradeList.length];
            for (int i = 0; i < source.GradeList.length; i++) {
                this.GradeList[i] = new String(source.GradeList[i]);
            }
        }
        if (source.GetUnbindResource != null) {
            this.GetUnbindResource = new Boolean(source.GetUnbindResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);
        this.setParamArraySimple(map, prefix + "GradeList.", this.GradeList);
        this.setParamSimple(map, prefix + "GetUnbindResource", this.GetUnbindResource);

    }
}

