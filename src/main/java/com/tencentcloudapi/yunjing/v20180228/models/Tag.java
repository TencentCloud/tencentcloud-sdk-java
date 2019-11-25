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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag  extends AbstractModel{

    /**
    * 标签ID
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 标签名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务器数
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
     * 获取标签ID
     * @return Id 标签ID
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置标签ID
     * @param Id 标签ID
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取标签名
     * @return Name 标签名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置标签名
     * @param Name 标签名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取服务器数
     * @return Count 服务器数
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置服务器数
     * @param Count 服务器数
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

