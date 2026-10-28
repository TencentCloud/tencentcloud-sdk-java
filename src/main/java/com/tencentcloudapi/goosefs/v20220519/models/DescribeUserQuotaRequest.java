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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserQuotaRequest extends AbstractModel {

    /**
    * <p>文件系统id</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>QuotaId列表</p>
    */
    @SerializedName("QuotaIds")
    @Expose
    private String [] QuotaIds;

    /**
    * <p>配额类型</p>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>配额对象名称列表</p>
    */
    @SerializedName("QuotaObjectNames")
    @Expose
    private String [] QuotaObjectNames;

    /**
     * Get <p>文件系统id</p> 
     * @return FileSystemId <p>文件系统id</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统id</p>
     * @param FileSystemId <p>文件系统id</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>QuotaId列表</p> 
     * @return QuotaIds <p>QuotaId列表</p>
     */
    public String [] getQuotaIds() {
        return this.QuotaIds;
    }

    /**
     * Set <p>QuotaId列表</p>
     * @param QuotaIds <p>QuotaId列表</p>
     */
    public void setQuotaIds(String [] QuotaIds) {
        this.QuotaIds = QuotaIds;
    }

    /**
     * Get <p>配额类型</p> 
     * @return QuotaType <p>配额类型</p>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>配额类型</p>
     * @param QuotaType <p>配额类型</p>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>配额对象名称列表</p> 
     * @return QuotaObjectNames <p>配额对象名称列表</p>
     */
    public String [] getQuotaObjectNames() {
        return this.QuotaObjectNames;
    }

    /**
     * Set <p>配额对象名称列表</p>
     * @param QuotaObjectNames <p>配额对象名称列表</p>
     */
    public void setQuotaObjectNames(String [] QuotaObjectNames) {
        this.QuotaObjectNames = QuotaObjectNames;
    }

    public DescribeUserQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserQuotaRequest(DescribeUserQuotaRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.QuotaIds != null) {
            this.QuotaIds = new String[source.QuotaIds.length];
            for (int i = 0; i < source.QuotaIds.length; i++) {
                this.QuotaIds[i] = new String(source.QuotaIds[i]);
            }
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaObjectNames != null) {
            this.QuotaObjectNames = new String[source.QuotaObjectNames.length];
            for (int i = 0; i < source.QuotaObjectNames.length; i++) {
                this.QuotaObjectNames[i] = new String(source.QuotaObjectNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamArraySimple(map, prefix + "QuotaIds.", this.QuotaIds);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamArraySimple(map, prefix + "QuotaObjectNames.", this.QuotaObjectNames);

    }
}

