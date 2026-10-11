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

public class ExpandCapacityRequest extends AbstractModel {

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 新增扩容的系统容量(单位 GiB)
    */
    @SerializedName("ExpandedCapacity")
    @Expose
    private Long ExpandedCapacity;

    /**
    * 容量修改类型：add/sub
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * 是否是快速扩容,只针对部分model有效
    */
    @SerializedName("RapidExpansion")
    @Expose
    private Boolean RapidExpansion;

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 新增扩容的系统容量(单位 GiB) 
     * @return ExpandedCapacity 新增扩容的系统容量(单位 GiB)
     */
    public Long getExpandedCapacity() {
        return this.ExpandedCapacity;
    }

    /**
     * Set 新增扩容的系统容量(单位 GiB)
     * @param ExpandedCapacity 新增扩容的系统容量(单位 GiB)
     */
    public void setExpandedCapacity(Long ExpandedCapacity) {
        this.ExpandedCapacity = ExpandedCapacity;
    }

    /**
     * Get 容量修改类型：add/sub 
     * @return ModifyType 容量修改类型：add/sub
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 容量修改类型：add/sub
     * @param ModifyType 容量修改类型：add/sub
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 是否是快速扩容,只针对部分model有效 
     * @return RapidExpansion 是否是快速扩容,只针对部分model有效
     */
    public Boolean getRapidExpansion() {
        return this.RapidExpansion;
    }

    /**
     * Set 是否是快速扩容,只针对部分model有效
     * @param RapidExpansion 是否是快速扩容,只针对部分model有效
     */
    public void setRapidExpansion(Boolean RapidExpansion) {
        this.RapidExpansion = RapidExpansion;
    }

    public ExpandCapacityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpandCapacityRequest(ExpandCapacityRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.ExpandedCapacity != null) {
            this.ExpandedCapacity = new Long(source.ExpandedCapacity);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.RapidExpansion != null) {
            this.RapidExpansion = new Boolean(source.RapidExpansion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "ExpandedCapacity", this.ExpandedCapacity);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "RapidExpansion", this.RapidExpansion);

    }
}

