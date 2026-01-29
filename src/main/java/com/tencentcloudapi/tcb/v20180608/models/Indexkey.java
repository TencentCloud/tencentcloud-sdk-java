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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Indexkey extends AbstractModel {

    /**
    * 键名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 方向：specify 1 for ascending or -1 for descending
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get 键名 
     * @return Name 键名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 键名
     * @param Name 键名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 方向：specify 1 for ascending or -1 for descending 
     * @return Direction 方向：specify 1 for ascending or -1 for descending
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向：specify 1 for ascending or -1 for descending
     * @param Direction 方向：specify 1 for ascending or -1 for descending
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public Indexkey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Indexkey(Indexkey source) {
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

