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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisPreKeySpaceData extends AbstractModel{

    /**
    * 平均元素长度。
    */
    @SerializedName("AveElementSize")
    @Expose
    private Long AveElementSize;

    /**
    * 总占用内存（Byte）。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * key前缀。
    */
    @SerializedName("KeyPreIndex")
    @Expose
    private String KeyPreIndex;

    /**
    * 元素数量。
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * key个数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 最大元素长度。
    */
    @SerializedName("MaxElementSize")
    @Expose
    private Long MaxElementSize;

    /**
     * Get 平均元素长度。 
     * @return AveElementSize 平均元素长度。
     */
    public Long getAveElementSize() {
        return this.AveElementSize;
    }

    /**
     * Set 平均元素长度。
     * @param AveElementSize 平均元素长度。
     */
    public void setAveElementSize(Long AveElementSize) {
        this.AveElementSize = AveElementSize;
    }

    /**
     * Get 总占用内存（Byte）。 
     * @return Length 总占用内存（Byte）。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 总占用内存（Byte）。
     * @param Length 总占用内存（Byte）。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get key前缀。 
     * @return KeyPreIndex key前缀。
     */
    public String getKeyPreIndex() {
        return this.KeyPreIndex;
    }

    /**
     * Set key前缀。
     * @param KeyPreIndex key前缀。
     */
    public void setKeyPreIndex(String KeyPreIndex) {
        this.KeyPreIndex = KeyPreIndex;
    }

    /**
     * Get 元素数量。 
     * @return ItemCount 元素数量。
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set 元素数量。
     * @param ItemCount 元素数量。
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get key个数。 
     * @return Count key个数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set key个数。
     * @param Count key个数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 最大元素长度。 
     * @return MaxElementSize 最大元素长度。
     */
    public Long getMaxElementSize() {
        return this.MaxElementSize;
    }

    /**
     * Set 最大元素长度。
     * @param MaxElementSize 最大元素长度。
     */
    public void setMaxElementSize(Long MaxElementSize) {
        this.MaxElementSize = MaxElementSize;
    }

    public RedisPreKeySpaceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisPreKeySpaceData(RedisPreKeySpaceData source) {
        if (source.AveElementSize != null) {
            this.AveElementSize = new Long(source.AveElementSize);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.KeyPreIndex != null) {
            this.KeyPreIndex = new String(source.KeyPreIndex);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.MaxElementSize != null) {
            this.MaxElementSize = new Long(source.MaxElementSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AveElementSize", this.AveElementSize);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "KeyPreIndex", this.KeyPreIndex);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "MaxElementSize", this.MaxElementSize);

    }
}

