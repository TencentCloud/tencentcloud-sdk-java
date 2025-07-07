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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchScope extends AbstractModel {

    /**
    * 分类路径归属。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 按分类路径检索。 不填则默认按根分类路径检索。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
     * Get 分类路径归属。 
     * @return Owner 分类路径归属。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 分类路径归属。
     * @param Owner 分类路径归属。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 按分类路径检索。 不填则默认按根分类路径检索。 
     * @return ClassPath 按分类路径检索。 不填则默认按根分类路径检索。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 按分类路径检索。 不填则默认按根分类路径检索。
     * @param ClassPath 按分类路径检索。 不填则默认按根分类路径检索。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    public SearchScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchScope(SearchScope source) {
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);

    }
}

