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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BigKeyInfo  extends AbstractModel{

    /**
    * 所属的database
    */
    @SerializedName("DB")
    @Expose
    private Integer DB;

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
    private Integer Size;

    /**
    * 数据时间戳
    */
    @SerializedName("Updatetime")
    @Expose
    private Integer Updatetime;

    /**
     * 获取所属的database
     * @return DB 所属的database
     */
    public Integer getDB() {
        return this.DB;
    }

    /**
     * 设置所属的database
     * @param DB 所属的database
     */
    public void setDB(Integer DB) {
        this.DB = DB;
    }

    /**
     * 获取大Key
     * @return Key 大Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * 设置大Key
     * @param Key 大Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 获取类型
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取大小
     * @return Size 大小
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置大小
     * @param Size 大小
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 获取数据时间戳
     * @return Updatetime 数据时间戳
     */
    public Integer getUpdatetime() {
        return this.Updatetime;
    }

    /**
     * 设置数据时间戳
     * @param Updatetime 数据时间戳
     */
    public void setUpdatetime(Integer Updatetime) {
        this.Updatetime = Updatetime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Updatetime", this.Updatetime);

    }
}

