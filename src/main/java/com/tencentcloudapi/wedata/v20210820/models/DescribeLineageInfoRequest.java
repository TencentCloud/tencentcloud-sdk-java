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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLineageInfoRequest extends AbstractModel {

    /**
    * 实体原始唯一ID
    */
    @SerializedName("ResourceOriId")
    @Expose
    private String ResourceOriId;

    /**
    * 实体类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 血缘唯一ID
    */
    @SerializedName("QualifiedId")
    @Expose
    private String QualifiedId;

    /**
    * 查询方向
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 查询入度
    */
    @SerializedName("InputDepth")
    @Expose
    private Long InputDepth;

    /**
    * 查询出度
    */
    @SerializedName("OutputDepth")
    @Expose
    private Long OutputDepth;

    /**
    * 数据来源
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 血缘类型（分页使用）
    */
    @SerializedName("LineageType")
    @Expose
    private String LineageType;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 实体原始唯一ID 
     * @return ResourceOriId 实体原始唯一ID
     */
    public String getResourceOriId() {
        return this.ResourceOriId;
    }

    /**
     * Set 实体原始唯一ID
     * @param ResourceOriId 实体原始唯一ID
     */
    public void setResourceOriId(String ResourceOriId) {
        this.ResourceOriId = ResourceOriId;
    }

    /**
     * Get 实体类型 
     * @return ResourceType 实体类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 实体类型
     * @param ResourceType 实体类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 血缘唯一ID 
     * @return QualifiedId 血缘唯一ID
     */
    public String getQualifiedId() {
        return this.QualifiedId;
    }

    /**
     * Set 血缘唯一ID
     * @param QualifiedId 血缘唯一ID
     */
    public void setQualifiedId(String QualifiedId) {
        this.QualifiedId = QualifiedId;
    }

    /**
     * Get 查询方向 
     * @return Direction 查询方向
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 查询方向
     * @param Direction 查询方向
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 查询入度 
     * @return InputDepth 查询入度
     */
    public Long getInputDepth() {
        return this.InputDepth;
    }

    /**
     * Set 查询入度
     * @param InputDepth 查询入度
     */
    public void setInputDepth(Long InputDepth) {
        this.InputDepth = InputDepth;
    }

    /**
     * Get 查询出度 
     * @return OutputDepth 查询出度
     */
    public Long getOutputDepth() {
        return this.OutputDepth;
    }

    /**
     * Set 查询出度
     * @param OutputDepth 查询出度
     */
    public void setOutputDepth(Long OutputDepth) {
        this.OutputDepth = OutputDepth;
    }

    /**
     * Get 数据来源 
     * @return Platform 数据来源
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 数据来源
     * @param Platform 数据来源
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 血缘类型（分页使用） 
     * @return LineageType 血缘类型（分页使用）
     */
    public String getLineageType() {
        return this.LineageType;
    }

    /**
     * Set 血缘类型（分页使用）
     * @param LineageType 血缘类型（分页使用）
     */
    public void setLineageType(String LineageType) {
        this.LineageType = LineageType;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeLineageInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLineageInfoRequest(DescribeLineageInfoRequest source) {
        if (source.ResourceOriId != null) {
            this.ResourceOriId = new String(source.ResourceOriId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.QualifiedId != null) {
            this.QualifiedId = new String(source.QualifiedId);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.InputDepth != null) {
            this.InputDepth = new Long(source.InputDepth);
        }
        if (source.OutputDepth != null) {
            this.OutputDepth = new Long(source.OutputDepth);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.LineageType != null) {
            this.LineageType = new String(source.LineageType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceOriId", this.ResourceOriId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "QualifiedId", this.QualifiedId);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "InputDepth", this.InputDepth);
        this.setParamSimple(map, prefix + "OutputDepth", this.OutputDepth);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "LineageType", this.LineageType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

