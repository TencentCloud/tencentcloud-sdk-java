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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcesRequest extends AbstractModel {

    /**
    * 地域码, 如: ap-guangzhou
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * 按照堡垒机开通的 VPC 实例ID查询
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 每页条目数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 地域码, 如: ap-guangzhou 
     * @return ApCode 地域码, 如: ap-guangzhou
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set 地域码, 如: ap-guangzhou
     * @param ApCode 地域码, 如: ap-guangzhou
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get 按照堡垒机开通的 VPC 实例ID查询 
     * @return VpcId 按照堡垒机开通的 VPC 实例ID查询
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 按照堡垒机开通的 VPC 实例ID查询
     * @param VpcId 按照堡垒机开通的 VPC 实例ID查询
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId 
     * @return ResourceIds 资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId
     * @param ResourceIds 资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 每页条目数量 
     * @return Limit 每页条目数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量
     * @param Limit 每页条目数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移位置 
     * @return Offset 分页偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置
     * @param Offset 分页偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcesRequest(DescribeResourcesRequest source) {
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
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
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

