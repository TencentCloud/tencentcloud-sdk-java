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

public class DescribeModelServicesRequest extends AbstractModel {

    /**
    * <p>实例</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>分页参数</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>ID列表</p>
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
    * <p>排除的ID列表</p>
    */
    @SerializedName("NotIDs")
    @Expose
    private String [] NotIDs;

    /**
    * <p>状态：normal，disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>模型ID</p>
    */
    @SerializedName("ModelID")
    @Expose
    private String ModelID;

    /**
    * <p>排序</p>
    */
    @SerializedName("Sort")
    @Expose
    private DescribeModelServicesSort Sort;

    /**
    * <p>模型类型，OpenAI或Anthropic</p>
    */
    @SerializedName("ModelProtocol")
    @Expose
    private String ModelProtocol;

    /**
     * Get <p>实例</p> 
     * @return InstanceID <p>实例</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例</p>
     * @param InstanceID <p>实例</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>分页参数</p> 
     * @return Offset <p>分页参数</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页参数</p>
     * @param Offset <p>分页参数</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页限制</p> 
     * @return Limit <p>分页限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页限制</p>
     * @param Limit <p>分页限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>ID列表</p> 
     * @return IDs <p>ID列表</p>
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set <p>ID列表</p>
     * @param IDs <p>ID列表</p>
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get <p>排除的ID列表</p> 
     * @return NotIDs <p>排除的ID列表</p>
     */
    public String [] getNotIDs() {
        return this.NotIDs;
    }

    /**
     * Set <p>排除的ID列表</p>
     * @param NotIDs <p>排除的ID列表</p>
     */
    public void setNotIDs(String [] NotIDs) {
        this.NotIDs = NotIDs;
    }

    /**
     * Get <p>状态：normal，disabled</p> 
     * @return Status <p>状态：normal，disabled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：normal，disabled</p>
     * @param Status <p>状态：normal，disabled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>模型ID</p> 
     * @return ModelID <p>模型ID</p>
     */
    public String getModelID() {
        return this.ModelID;
    }

    /**
     * Set <p>模型ID</p>
     * @param ModelID <p>模型ID</p>
     */
    public void setModelID(String ModelID) {
        this.ModelID = ModelID;
    }

    /**
     * Get <p>排序</p> 
     * @return Sort <p>排序</p>
     */
    public DescribeModelServicesSort getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序</p>
     * @param Sort <p>排序</p>
     */
    public void setSort(DescribeModelServicesSort Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>模型类型，OpenAI或Anthropic</p> 
     * @return ModelProtocol <p>模型类型，OpenAI或Anthropic</p>
     */
    public String getModelProtocol() {
        return this.ModelProtocol;
    }

    /**
     * Set <p>模型类型，OpenAI或Anthropic</p>
     * @param ModelProtocol <p>模型类型，OpenAI或Anthropic</p>
     */
    public void setModelProtocol(String ModelProtocol) {
        this.ModelProtocol = ModelProtocol;
    }

    public DescribeModelServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelServicesRequest(DescribeModelServicesRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
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
        if (source.ModelID != null) {
            this.ModelID = new String(source.ModelID);
        }
        if (source.Sort != null) {
            this.Sort = new DescribeModelServicesSort(source.Sort);
        }
        if (source.ModelProtocol != null) {
            this.ModelProtocol = new String(source.ModelProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);
        this.setParamArraySimple(map, prefix + "NotIDs.", this.NotIDs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ModelID", this.ModelID);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "ModelProtocol", this.ModelProtocol);

    }
}

