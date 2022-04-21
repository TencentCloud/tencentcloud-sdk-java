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

public class RedisKeySpaceData extends AbstractModel{

    /**
    * key名。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * key类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * key编码方式。
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * key过期时间戳（毫秒），0代表未设置过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * key内存大小，单位Byte。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 元素个数。
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * 最大元素长度。
    */
    @SerializedName("MaxElementSize")
    @Expose
    private Long MaxElementSize;

    /**
     * Get key名。 
     * @return Key key名。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set key名。
     * @param Key key名。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get key类型。 
     * @return Type key类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set key类型。
     * @param Type key类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get key编码方式。 
     * @return Encoding key编码方式。
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set key编码方式。
     * @param Encoding key编码方式。
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get key过期时间戳（毫秒），0代表未设置过期时间。 
     * @return ExpireTime key过期时间戳（毫秒），0代表未设置过期时间。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set key过期时间戳（毫秒），0代表未设置过期时间。
     * @param ExpireTime key过期时间戳（毫秒），0代表未设置过期时间。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get key内存大小，单位Byte。 
     * @return Length key内存大小，单位Byte。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set key内存大小，单位Byte。
     * @param Length key内存大小，单位Byte。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 元素个数。 
     * @return ItemCount 元素个数。
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set 元素个数。
     * @param ItemCount 元素个数。
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
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

    public RedisKeySpaceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisKeySpaceData(RedisKeySpaceData source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.MaxElementSize != null) {
            this.MaxElementSize = new Long(source.MaxElementSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "MaxElementSize", this.MaxElementSize);

    }
}

