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

public class DescribeVasListRequest extends AbstractModel {

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
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 使用资源 ID 列表查询
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
    * 增值服务类型
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

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
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 使用资源 ID 列表查询 
     * @return ResourceIdList 使用资源 ID 列表查询
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set 使用资源 ID 列表查询
     * @param ResourceIdList 使用资源 ID 列表查询
     */
    public void setResourceIdList(String [] ResourceIdList) {
        this.ResourceIdList = ResourceIdList;
    }

    /**
     * Get 增值服务类型 
     * @return LimitType 增值服务类型
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set 增值服务类型
     * @param LimitType 增值服务类型
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    public DescribeVasListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVasListRequest(DescribeVasListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.ResourceIdList != null) {
            this.ResourceIdList = new String[source.ResourceIdList.length];
            for (int i = 0; i < source.ResourceIdList.length; i++) {
                this.ResourceIdList[i] = new String(source.ResourceIdList[i]);
            }
        }
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);

    }
}

