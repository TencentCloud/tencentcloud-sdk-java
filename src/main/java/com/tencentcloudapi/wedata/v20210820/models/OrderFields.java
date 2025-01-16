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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderFields extends AbstractModel {

    /**
    * 字段
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 排序
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get 字段 
     * @return Name 字段
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段
     * @param Name 字段
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 排序 
     * @return Direction 排序
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 排序
     * @param Direction 排序
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public OrderFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderFields(OrderFields source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

