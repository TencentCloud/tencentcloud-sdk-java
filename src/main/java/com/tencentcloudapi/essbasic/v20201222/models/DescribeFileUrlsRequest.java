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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileUrlsRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 业务编号数组，如模板编号、文档编号、印章编号、流程编号、目录编号
    */
    @SerializedName("BusinessIds")
    @Expose
    private String [] BusinessIds;

    /**
    * 业务类型：
1. TEMPLATE - 模板
2. SEAL - 印章
3. FLOW - 流程
4.CATALOG - 目录
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 下载后的文件命名，只有FileType为“ZIP”时生效
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 单个业务ID多个资源情况下，指定资源起始偏移量
    */
    @SerializedName("ResourceOffset")
    @Expose
    private Long ResourceOffset;

    /**
    * 单个业务ID多个资源情况下，指定资源数量
    */
    @SerializedName("ResourceLimit")
    @Expose
    private Long ResourceLimit;

    /**
    * 文件类型，支持"JPG", "PDF","ZIP"等，默认为上传的文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 业务编号数组，如模板编号、文档编号、印章编号、流程编号、目录编号 
     * @return BusinessIds 业务编号数组，如模板编号、文档编号、印章编号、流程编号、目录编号
     */
    public String [] getBusinessIds() {
        return this.BusinessIds;
    }

    /**
     * Set 业务编号数组，如模板编号、文档编号、印章编号、流程编号、目录编号
     * @param BusinessIds 业务编号数组，如模板编号、文档编号、印章编号、流程编号、目录编号
     */
    public void setBusinessIds(String [] BusinessIds) {
        this.BusinessIds = BusinessIds;
    }

    /**
     * Get 业务类型：
1. TEMPLATE - 模板
2. SEAL - 印章
3. FLOW - 流程
4.CATALOG - 目录 
     * @return BusinessType 业务类型：
1. TEMPLATE - 模板
2. SEAL - 印章
3. FLOW - 流程
4.CATALOG - 目录
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 业务类型：
1. TEMPLATE - 模板
2. SEAL - 印章
3. FLOW - 流程
4.CATALOG - 目录
     * @param BusinessType 业务类型：
1. TEMPLATE - 模板
2. SEAL - 印章
3. FLOW - 流程
4.CATALOG - 目录
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 下载后的文件命名，只有FileType为“ZIP”时生效 
     * @return FileName 下载后的文件命名，只有FileType为“ZIP”时生效
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 下载后的文件命名，只有FileType为“ZIP”时生效
     * @param FileName 下载后的文件命名，只有FileType为“ZIP”时生效
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 单个业务ID多个资源情况下，指定资源起始偏移量 
     * @return ResourceOffset 单个业务ID多个资源情况下，指定资源起始偏移量
     */
    public Long getResourceOffset() {
        return this.ResourceOffset;
    }

    /**
     * Set 单个业务ID多个资源情况下，指定资源起始偏移量
     * @param ResourceOffset 单个业务ID多个资源情况下，指定资源起始偏移量
     */
    public void setResourceOffset(Long ResourceOffset) {
        this.ResourceOffset = ResourceOffset;
    }

    /**
     * Get 单个业务ID多个资源情况下，指定资源数量 
     * @return ResourceLimit 单个业务ID多个资源情况下，指定资源数量
     */
    public Long getResourceLimit() {
        return this.ResourceLimit;
    }

    /**
     * Set 单个业务ID多个资源情况下，指定资源数量
     * @param ResourceLimit 单个业务ID多个资源情况下，指定资源数量
     */
    public void setResourceLimit(Long ResourceLimit) {
        this.ResourceLimit = ResourceLimit;
    }

    /**
     * Get 文件类型，支持"JPG", "PDF","ZIP"等，默认为上传的文件类型 
     * @return FileType 文件类型，支持"JPG", "PDF","ZIP"等，默认为上传的文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，支持"JPG", "PDF","ZIP"等，默认为上传的文件类型
     * @param FileType 文件类型，支持"JPG", "PDF","ZIP"等，默认为上传的文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public DescribeFileUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileUrlsRequest(DescribeFileUrlsRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.BusinessIds != null) {
            this.BusinessIds = new String[source.BusinessIds.length];
            for (int i = 0; i < source.BusinessIds.length; i++) {
                this.BusinessIds[i] = new String(source.BusinessIds[i]);
            }
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ResourceOffset != null) {
            this.ResourceOffset = new Long(source.ResourceOffset);
        }
        if (source.ResourceLimit != null) {
            this.ResourceLimit = new Long(source.ResourceLimit);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamArraySimple(map, prefix + "BusinessIds.", this.BusinessIds);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ResourceOffset", this.ResourceOffset);
        this.setParamSimple(map, prefix + "ResourceLimit", this.ResourceLimit);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

