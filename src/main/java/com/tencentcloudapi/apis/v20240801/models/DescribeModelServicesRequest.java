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
    * 实例
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * ID列表
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
    * 排除的ID列表
    */
    @SerializedName("NotIDs")
    @Expose
    private String [] NotIDs;

    /**
    * 状态：normal，disabled
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
    * 模型ID
    */
    @SerializedName("ModelID")
    @Expose
    private String ModelID;

    /**
    * 排序
    */
    @SerializedName("Sort")
    @Expose
    private DescribeModelServicesSort Sort;

    /**
     * Get 实例 
     * @return InstanceID 实例
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例
     * @param InstanceID 实例
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页限制 
     * @return Limit 分页限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页限制
     * @param Limit 分页限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get ID列表 
     * @return IDs ID列表
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set ID列表
     * @param IDs ID列表
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get 排除的ID列表 
     * @return NotIDs 排除的ID列表
     */
    public String [] getNotIDs() {
        return this.NotIDs;
    }

    /**
     * Set 排除的ID列表
     * @param NotIDs 排除的ID列表
     */
    public void setNotIDs(String [] NotIDs) {
        this.NotIDs = NotIDs;
    }

    /**
     * Get 状态：normal，disabled 
     * @return Status 状态：normal，disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：normal，disabled
     * @param Status 状态：normal，disabled
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
     * Get 模型ID 
     * @return ModelID 模型ID
     */
    public String getModelID() {
        return this.ModelID;
    }

    /**
     * Set 模型ID
     * @param ModelID 模型ID
     */
    public void setModelID(String ModelID) {
        this.ModelID = ModelID;
    }

    /**
     * Get 排序 
     * @return Sort 排序
     */
    public DescribeModelServicesSort getSort() {
        return this.Sort;
    }

    /**
     * Set 排序
     * @param Sort 排序
     */
    public void setSort(DescribeModelServicesSort Sort) {
        this.Sort = Sort;
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

    }
}

