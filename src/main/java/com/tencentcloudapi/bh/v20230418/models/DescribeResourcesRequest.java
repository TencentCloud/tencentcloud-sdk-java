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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcesRequest extends AbstractModel {

    /**
    * <p>地域码, 如: ap-guangzhou</p>
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * <p>按照堡垒机开通的 VPC 实例ID查询</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * <p>每页条目数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移位置</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>地域码, 如: ap-guangzhou</p> 
     * @return ApCode <p>地域码, 如: ap-guangzhou</p>
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set <p>地域码, 如: ap-guangzhou</p>
     * @param ApCode <p>地域码, 如: ap-guangzhou</p>
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get <p>按照堡垒机开通的 VPC 实例ID查询</p> 
     * @return VpcId <p>按照堡垒机开通的 VPC 实例ID查询</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>按照堡垒机开通的 VPC 实例ID查询</p>
     * @param VpcId <p>按照堡垒机开通的 VPC 实例ID查询</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId</p> 
     * @return ResourceIds <p>资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId</p>
     * @param ResourceIds <p>资源ID集合，当传入ID集合时忽略 ApCode 和 VpcId</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>每页条目数量</p> 
     * @return Limit <p>每页条目数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条目数量</p>
     * @param Limit <p>每页条目数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移位置</p> 
     * @return Offset <p>分页偏移位置</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移位置</p>
     * @param Offset <p>分页偏移位置</p>
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

