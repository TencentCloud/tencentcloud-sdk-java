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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HPCDisk extends AbstractModel {

    /**
    * 硬盘ID。仅作为出参。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 硬盘大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 硬盘ID。仅作为出参。 
     * @return DiskId 硬盘ID。仅作为出参。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 硬盘ID。仅作为出参。
     * @param DiskId 硬盘ID。仅作为出参。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 硬盘大小 
     * @return Size 硬盘大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 硬盘大小
     * @param Size 硬盘大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public HPCDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HPCDisk(HPCDisk source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

