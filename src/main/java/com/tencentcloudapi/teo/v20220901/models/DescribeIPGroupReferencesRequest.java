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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIPGroupReferencesRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>IP 组 ID。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>分页偏移量。</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页查询引用 IP 组的配置条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>IP 组 ID。</p> 
     * @return GroupId <p>IP 组 ID。</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>IP 组 ID。</p>
     * @param GroupId <p>IP 组 ID。</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>分页偏移量。</p><p>默认值：0</p> 
     * @return Offset <p>分页偏移量。</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量。</p><p>默认值：0</p>
     * @param Offset <p>分页偏移量。</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页查询引用 IP 组的配置条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p> 
     * @return Limit <p>分页查询引用 IP 组的配置条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询引用 IP 组的配置条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     * @param Limit <p>分页查询引用 IP 组的配置条数。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIPGroupReferencesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPGroupReferencesRequest(DescribeIPGroupReferencesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

