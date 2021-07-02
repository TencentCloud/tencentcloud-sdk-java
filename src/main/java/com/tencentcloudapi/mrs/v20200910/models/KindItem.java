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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KindItem extends AbstractModel{

    /**
    * 等级，分为1，2，3级别，类型逐级细分
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 类型编号，对应唯一的类型编号
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 类型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 等级，分为1，2，3级别，类型逐级细分 
     * @return Level 等级，分为1，2，3级别，类型逐级细分
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 等级，分为1，2，3级别，类型逐级细分
     * @param Level 等级，分为1，2，3级别，类型逐级细分
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 类型编号，对应唯一的类型编号 
     * @return ID 类型编号，对应唯一的类型编号
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 类型编号，对应唯一的类型编号
     * @param ID 类型编号，对应唯一的类型编号
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 类型名称 
     * @return Name 类型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型名称
     * @param Name 类型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public KindItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KindItem(KindItem source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

