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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BigKeyInfo extends AbstractModel {

    /**
    * 所属的database
    */
    @SerializedName("DB")
    @Expose
    private Long DB;

    /**
    * 大Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 数据时间戳
    */
    @SerializedName("Updatetime")
    @Expose
    private Long Updatetime;

    /**
     * Get 所属的database 
     * @return DB 所属的database
     */
    public Long getDB() {
        return this.DB;
    }

    /**
     * Set 所属的database
     * @param DB 所属的database
     */
    public void setDB(Long DB) {
        this.DB = DB;
    }

    /**
     * Get 大Key 
     * @return Key 大Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 大Key
     * @param Key 大Key
     */
    public void setKey(String Key) {
        this.Key = Key;
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

    /**
     * Get 大小 
     * @return Size 大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 大小
     * @param Size 大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 数据时间戳 
     * @return Updatetime 数据时间戳
     */
    public Long getUpdatetime() {
        return this.Updatetime;
    }

    /**
     * Set 数据时间戳
     * @param Updatetime 数据时间戳
     */
    public void setUpdatetime(Long Updatetime) {
        this.Updatetime = Updatetime;
    }

    public BigKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BigKeyInfo(BigKeyInfo source) {
        if (source.DB != null) {
            this.DB = new Long(source.DB);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Updatetime != null) {
            this.Updatetime = new Long(source.Updatetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Updatetime", this.Updatetime);

    }
}

