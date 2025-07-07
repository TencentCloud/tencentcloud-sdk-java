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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionInfo extends AbstractModel {

    /**
    * 分区名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分区大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 分区名称 
     * @return Name 分区名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分区名称
     * @param Name 分区名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分区大小 
     * @return Size 分区大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 分区大小
     * @param Size 分区大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public PartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionInfo(PartitionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

