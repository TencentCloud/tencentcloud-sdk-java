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

public class BigKeyTypeInfo  extends AbstractModel{

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数量
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
    * 大小
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;

    /**
    * 时间戳
    */
    @SerializedName("Updatetime")
    @Expose
    private Integer Updatetime;

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
     * 获取数量
     * @return Count 数量
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置数量
     * @param Count 数量
     */
    public void setCount(Integer Count) {
        this.Count = Count;
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
     * 获取时间戳
     * @return Updatetime 时间戳
     */
    public Integer getUpdatetime() {
        return this.Updatetime;
    }

    /**
     * 设置时间戳
     * @param Updatetime 时间戳
     */
    public void setUpdatetime(Integer Updatetime) {
        this.Updatetime = Updatetime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Updatetime", this.Updatetime);

    }
}

