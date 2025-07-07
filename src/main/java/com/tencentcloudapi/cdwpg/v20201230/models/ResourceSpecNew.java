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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSpecNew extends AbstractModel {

    /**
    * 资源名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 资源数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 磁盘信息
    */
    @SerializedName("DiskSpec")
    @Expose
    private CBSSpec DiskSpec;

    /**
    * 资源类型，DATA
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 资源名称 
     * @return SpecName 资源名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 资源名称
     * @param SpecName 资源名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 资源数 
     * @return Count 资源数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 资源数
     * @param Count 资源数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 磁盘信息 
     * @return DiskSpec 磁盘信息
     */
    public CBSSpec getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set 磁盘信息
     * @param DiskSpec 磁盘信息
     */
    public void setDiskSpec(CBSSpec DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get 资源类型，DATA 
     * @return Type 资源类型，DATA
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源类型，DATA
     * @param Type 资源类型，DATA
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ResourceSpecNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpecNew(ResourceSpecNew source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new CBSSpec(source.DiskSpec);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "DiskSpec.", this.DiskSpec);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

