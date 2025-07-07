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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalDiskType extends AbstractModel {

    /**
    * 本地磁盘类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 本地磁盘属性。
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * 本地磁盘最小值。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 本地磁盘最大值。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 购买时本地盘是否为必选。取值范围：<br><li>REQUIRED：表示必选</li><li>OPTIONAL：表示可选。</li>
    */
    @SerializedName("Required")
    @Expose
    private String Required;

    /**
     * Get 本地磁盘类型。 
     * @return Type 本地磁盘类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 本地磁盘类型。
     * @param Type 本地磁盘类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 本地磁盘属性。 
     * @return PartitionType 本地磁盘属性。
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set 本地磁盘属性。
     * @param PartitionType 本地磁盘属性。
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get 本地磁盘最小值。 
     * @return MinSize 本地磁盘最小值。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 本地磁盘最小值。
     * @param MinSize 本地磁盘最小值。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 本地磁盘最大值。 
     * @return MaxSize 本地磁盘最大值。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 本地磁盘最大值。
     * @param MaxSize 本地磁盘最大值。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 购买时本地盘是否为必选。取值范围：<br><li>REQUIRED：表示必选</li><li>OPTIONAL：表示可选。</li> 
     * @return Required 购买时本地盘是否为必选。取值范围：<br><li>REQUIRED：表示必选</li><li>OPTIONAL：表示可选。</li>
     */
    public String getRequired() {
        return this.Required;
    }

    /**
     * Set 购买时本地盘是否为必选。取值范围：<br><li>REQUIRED：表示必选</li><li>OPTIONAL：表示可选。</li>
     * @param Required 购买时本地盘是否为必选。取值范围：<br><li>REQUIRED：表示必选</li><li>OPTIONAL：表示可选。</li>
     */
    public void setRequired(String Required) {
        this.Required = Required;
    }

    public LocalDiskType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalDiskType(LocalDiskType source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PartitionType != null) {
            this.PartitionType = new String(source.PartitionType);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Required != null) {
            this.Required = new String(source.Required);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Required", this.Required);

    }
}

