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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataFlowRequest extends AbstractModel {

    /**
    * 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 数据流动 ID ，由创建数据流动返回
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * 每次查询返回值个数，默认20；最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 文件系统版本；版本号：v1.5，v3.0，v3.1，v4.0
    */
    @SerializedName("CfsVersion")
    @Expose
    private String CfsVersion;

    /**
     * Get 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取 
     * @return FileSystemId 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     * @param FileSystemId 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 数据流动 ID ，由创建数据流动返回 
     * @return DataFlowId 数据流动 ID ，由创建数据流动返回
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set 数据流动 ID ，由创建数据流动返回
     * @param DataFlowId 数据流动 ID ，由创建数据流动返回
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get 每次查询返回值个数，默认20；最大100 
     * @return Limit 每次查询返回值个数，默认20；最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次查询返回值个数，默认20；最大100
     * @param Limit 每次查询返回值个数，默认20；最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 文件系统版本；版本号：v1.5，v3.0，v3.1，v4.0 
     * @return CfsVersion 文件系统版本；版本号：v1.5，v3.0，v3.1，v4.0
     */
    public String getCfsVersion() {
        return this.CfsVersion;
    }

    /**
     * Set 文件系统版本；版本号：v1.5，v3.0，v3.1，v4.0
     * @param CfsVersion 文件系统版本；版本号：v1.5，v3.0，v3.1，v4.0
     */
    public void setCfsVersion(String CfsVersion) {
        this.CfsVersion = CfsVersion;
    }

    public DescribeDataFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataFlowRequest(DescribeDataFlowRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CfsVersion != null) {
            this.CfsVersion = new String(source.CfsVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CfsVersion", this.CfsVersion);

    }
}

