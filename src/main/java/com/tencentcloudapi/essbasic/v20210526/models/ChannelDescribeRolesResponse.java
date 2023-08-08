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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeRolesResponse extends AbstractModel{

    /**
    * 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定每页多少条数据，单页最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询角色的总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 角色信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelRoles")
    @Expose
    private ChannelRole [] ChannelRoles;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000 
     * @return Offset 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
     * @param Offset 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定每页多少条数据，单页最大200 
     * @return Limit 指定每页多少条数据，单页最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定每页多少条数据，单页最大200
     * @param Limit 指定每页多少条数据，单页最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询角色的总数量 
     * @return TotalCount 查询角色的总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询角色的总数量
     * @param TotalCount 查询角色的总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 角色信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelRoles 角色信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChannelRole [] getChannelRoles() {
        return this.ChannelRoles;
    }

    /**
     * Set 角色信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelRoles 角色信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelRoles(ChannelRole [] ChannelRoles) {
        this.ChannelRoles = ChannelRoles;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ChannelDescribeRolesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeRolesResponse(ChannelDescribeRolesResponse source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ChannelRoles != null) {
            this.ChannelRoles = new ChannelRole[source.ChannelRoles.length];
            for (int i = 0; i < source.ChannelRoles.length; i++) {
                this.ChannelRoles[i] = new ChannelRole(source.ChannelRoles[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ChannelRoles.", this.ChannelRoles);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

