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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPermissionApplyOrdersRequest extends AbstractModel {

    /**
    * <p>空间 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>搜索字段</p><p>按用户名 / 用户 ID 搜索</p>
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * <p>状态值</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>每页条数</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>翻页游标</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get <p>空间 ID</p> 
     * @return ZoneId <p>空间 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>空间 ID</p>
     * @param ZoneId <p>空间 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>搜索字段</p><p>按用户名 / 用户 ID 搜索</p> 
     * @return SearchValue <p>搜索字段</p><p>按用户名 / 用户 ID 搜索</p>
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set <p>搜索字段</p><p>按用户名 / 用户 ID 搜索</p>
     * @param SearchValue <p>搜索字段</p><p>按用户名 / 用户 ID 搜索</p>
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get <p>状态值</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul> 
     * @return Status <p>状态值</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态值</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
     * @param Status <p>状态值</p><p>枚举值：</p><ul><li>1： 待审核</li><li>2： 已通过 - 同步中</li><li>3： 已通过 - 同步成功</li><li>4： 已通过 - 同步失败</li><li>5： 已拒绝</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>每页条数</p><p>取值范围：[1, 100]</p><p>默认值：10</p> 
     * @return MaxResults <p>每页条数</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>每页条数</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     * @param MaxResults <p>每页条数</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>翻页游标</p> 
     * @return NextToken <p>翻页游标</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>翻页游标</p>
     * @param NextToken <p>翻页游标</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public ListPermissionApplyOrdersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPermissionApplyOrdersRequest(ListPermissionApplyOrdersRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

