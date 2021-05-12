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
package com.tencentcloudapi.tms.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextLib extends AbstractModel{

    /**
    * 库id
    */
    @SerializedName("LibId")
    @Expose
    private Long LibId;

    /**
    * 库名
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
     * Get 库id 
     * @return LibId 库id
     */
    public Long getLibId() {
        return this.LibId;
    }

    /**
     * Set 库id
     * @param LibId 库id
     */
    public void setLibId(Long LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 库名 
     * @return LibName 库名
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 库名
     * @param LibName 库名
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    public TextLib() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextLib(TextLib source) {
        if (source.LibId != null) {
            this.LibId = new Long(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);

    }
}

