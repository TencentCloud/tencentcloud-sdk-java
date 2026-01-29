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

public class MgoIndexKeys extends AbstractModel {

    /**
    * 无
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 无
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get 无 
     * @return Name 无
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 无
     * @param Name 无
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 无 
     * @return Direction 无
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 无
     * @param Direction 无
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public MgoIndexKeys() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MgoIndexKeys(MgoIndexKeys source) {
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

