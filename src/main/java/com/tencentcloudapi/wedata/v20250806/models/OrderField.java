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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderField extends AbstractModel {

    /**
    * <p>排序字段名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>排序方向：ASC|DESC</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get <p>排序字段名称</p> 
     * @return Name <p>排序字段名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>排序字段名称</p>
     * @param Name <p>排序字段名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>排序方向：ASC|DESC</p> 
     * @return Direction <p>排序方向：ASC|DESC</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>排序方向：ASC|DESC</p>
     * @param Direction <p>排序方向：ASC|DESC</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public OrderField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderField(OrderField source) {
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

