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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFilesRequest extends AbstractModel{

    /**
    * 项目 ID 数组
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 文件 ID 数组
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 20，最大为 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 文件种类，参数文件-1，协议文件-2，请求文件-3
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
     * Get 项目 ID 数组 
     * @return ProjectIds 项目 ID 数组
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目 ID 数组
     * @param ProjectIds 项目 ID 数组
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 文件 ID 数组 
     * @return FileIds 文件 ID 数组
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 文件 ID 数组
     * @param FileIds 文件 ID 数组
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 偏移量，默认为 0 
     * @return Offset 偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0
     * @param Offset 偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 20，最大为 100 
     * @return Limit 返回数量，默认为 20，最大为 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大为 100
     * @param Limit 返回数量，默认为 20，最大为 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 文件种类，参数文件-1，协议文件-2，请求文件-3 
     * @return Kind 文件种类，参数文件-1，协议文件-2，请求文件-3
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 文件种类，参数文件-1，协议文件-2，请求文件-3
     * @param Kind 文件种类，参数文件-1，协议文件-2，请求文件-3
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    public DescribeFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFilesRequest(DescribeFilesRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

