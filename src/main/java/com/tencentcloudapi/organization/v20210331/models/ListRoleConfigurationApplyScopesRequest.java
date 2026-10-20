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

public class ListRoleConfigurationApplyScopesRequest extends AbstractModel {

    /**
    * <p>空间 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>身份 ID</p>
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * <p>目标账号 UIN</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

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
     * Get <p>身份 ID</p> 
     * @return PrincipalId <p>身份 ID</p>
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set <p>身份 ID</p>
     * @param PrincipalId <p>身份 ID</p>
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul> 
     * @return PrincipalType <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
     * @param PrincipalType <p>身份类型</p><p>枚举值：</p><ul><li>User： 用户</li><li>Group： 用户组</li></ul>
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    /**
     * Get <p>目标账号 UIN</p> 
     * @return TargetUin <p>目标账号 UIN</p>
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>目标账号 UIN</p>
     * @param TargetUin <p>目标账号 UIN</p>
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filter <p>过滤条件</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filter <p>过滤条件</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
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

    public ListRoleConfigurationApplyScopesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRoleConfigurationApplyScopesRequest(ListRoleConfigurationApplyScopesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
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
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

