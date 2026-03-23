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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentAppsRequest extends AbstractModel {

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 服务ID数组
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * notID列表
    */
    @SerializedName("NotIDs")
    @Expose
    private String [] NotIDs;

    /**
    * 状态：normal正常状态，disabled下线状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 认证类型：apiKey，secretKey
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 排序
    */
    @SerializedName("Sort")
    @Expose
    private DescribeAgentAppsSortDTO Sort;

    /**
    * 凭据ID
    */
    @SerializedName("AgentCredentialID")
    @Expose
    private String AgentCredentialID;

    /**
     * Get 分页大小 
     * @return Limit 分页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 服务ID数组 
     * @return IDs 服务ID数组
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set 服务ID数组
     * @param IDs 服务ID数组
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get notID列表 
     * @return NotIDs notID列表
     */
    public String [] getNotIDs() {
        return this.NotIDs;
    }

    /**
     * Set notID列表
     * @param NotIDs notID列表
     */
    public void setNotIDs(String [] NotIDs) {
        this.NotIDs = NotIDs;
    }

    /**
     * Get 状态：normal正常状态，disabled下线状态 
     * @return Status 状态：normal正常状态，disabled下线状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：normal正常状态，disabled下线状态
     * @param Status 状态：normal正常状态，disabled下线状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 关键词 
     * @return Keyword 关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词
     * @param Keyword 关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 认证类型：apiKey，secretKey 
     * @return AuthType 认证类型：apiKey，secretKey
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证类型：apiKey，secretKey
     * @param AuthType 认证类型：apiKey，secretKey
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 排序 
     * @return Sort 排序
     */
    public DescribeAgentAppsSortDTO getSort() {
        return this.Sort;
    }

    /**
     * Set 排序
     * @param Sort 排序
     */
    public void setSort(DescribeAgentAppsSortDTO Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 凭据ID 
     * @return AgentCredentialID 凭据ID
     */
    public String getAgentCredentialID() {
        return this.AgentCredentialID;
    }

    /**
     * Set 凭据ID
     * @param AgentCredentialID 凭据ID
     */
    public void setAgentCredentialID(String AgentCredentialID) {
        this.AgentCredentialID = AgentCredentialID;
    }

    public DescribeAgentAppsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentAppsRequest(DescribeAgentAppsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.NotIDs != null) {
            this.NotIDs = new String[source.NotIDs.length];
            for (int i = 0; i < source.NotIDs.length; i++) {
                this.NotIDs[i] = new String(source.NotIDs[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.Sort != null) {
            this.Sort = new DescribeAgentAppsSortDTO(source.Sort);
        }
        if (source.AgentCredentialID != null) {
            this.AgentCredentialID = new String(source.AgentCredentialID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArraySimple(map, prefix + "NotIDs.", this.NotIDs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "AgentCredentialID", this.AgentCredentialID);

    }
}

