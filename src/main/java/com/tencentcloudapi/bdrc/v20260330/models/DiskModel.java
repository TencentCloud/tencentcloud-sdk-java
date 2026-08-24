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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskModel extends AbstractModel {

    /**
    * 云盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云盘大小（单位GB，范围 (0, 32000]）
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 是否随实例删除（仅 DataDisks 元素能传）
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
     * Get 云盘类型 
     * @return DiskType 云盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云盘类型
     * @param DiskType 云盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云盘大小（单位GB，范围 (0, 32000]） 
     * @return DiskSize 云盘大小（单位GB，范围 (0, 32000]）
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云盘大小（单位GB，范围 (0, 32000]）
     * @param DiskSize 云盘大小（单位GB，范围 (0, 32000]）
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 是否随实例删除（仅 DataDisks 元素能传） 
     * @return DeleteWithInstance 是否随实例删除（仅 DataDisks 元素能传）
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 是否随实例删除（仅 DataDisks 元素能传）
     * @param DeleteWithInstance 是否随实例删除（仅 DataDisks 元素能传）
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    public DiskModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskModel(DiskModel source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);

    }
}

