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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeSpec extends AbstractModel{

    /**
    * 规格名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 云盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get 规格名称 
     * @return SpecName 规格名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 规格名称
     * @param SpecName 规格名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 数量 
     * @return Count 数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量
     * @param Count 数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 云盘大小 
     * @return DiskSize 云盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云盘大小
     * @param DiskSize 云盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public NodeSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpec(NodeSpec source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

