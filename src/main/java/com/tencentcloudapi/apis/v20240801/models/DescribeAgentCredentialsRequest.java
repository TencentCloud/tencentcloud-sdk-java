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

public class DescribeAgentCredentialsRequest extends AbstractModel {

    /**
    * <p>分页大小</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>notID列表</p>
    */
    @SerializedName("NotIDs")
    @Expose
    private String [] NotIDs;

    /**
    * <p>状态：normal正常状态，disabled下线状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>分页偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>服务ID数组</p>
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
    * <p>认证类型：sts，reqKey</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>排序</p>
    */
    @SerializedName("Sort")
    @Expose
    private DescribeAgentCredentialsSortDTO Sort;

    /**
     * Get <p>分页大小</p> 
     * @return Limit <p>分页大小</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小</p>
     * @param Limit <p>分页大小</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>notID列表</p> 
     * @return NotIDs <p>notID列表</p>
     */
    public String [] getNotIDs() {
        return this.NotIDs;
    }

    /**
     * Set <p>notID列表</p>
     * @param NotIDs <p>notID列表</p>
     */
    public void setNotIDs(String [] NotIDs) {
        this.NotIDs = NotIDs;
    }

    /**
     * Get <p>状态：normal正常状态，disabled下线状态</p> 
     * @return Status <p>状态：normal正常状态，disabled下线状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：normal正常状态，disabled下线状态</p>
     * @param Status <p>状态：normal正常状态，disabled下线状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>分页偏移量</p> 
     * @return Offset <p>分页偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量</p>
     * @param Offset <p>分页偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>关键词</p> 
     * @return Keyword <p>关键词</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键词</p>
     * @param Keyword <p>关键词</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>服务ID数组</p> 
     * @return IDs <p>服务ID数组</p>
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set <p>服务ID数组</p>
     * @param IDs <p>服务ID数组</p>
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get <p>认证类型：sts，reqKey</p> 
     * @return Type <p>认证类型：sts，reqKey</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>认证类型：sts，reqKey</p>
     * @param Type <p>认证类型：sts，reqKey</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>排序</p> 
     * @return Sort <p>排序</p>
     */
    public DescribeAgentCredentialsSortDTO getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序</p>
     * @param Sort <p>排序</p>
     */
    public void setSort(DescribeAgentCredentialsSortDTO Sort) {
        this.Sort = Sort;
    }

    public DescribeAgentCredentialsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentCredentialsRequest(DescribeAgentCredentialsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Sort != null) {
            this.Sort = new DescribeAgentCredentialsSortDTO(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArraySimple(map, prefix + "NotIDs.", this.NotIDs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

