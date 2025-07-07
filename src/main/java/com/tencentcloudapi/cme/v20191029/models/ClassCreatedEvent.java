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

public class ClassCreatedEvent extends AbstractModel {

    /**
    * 分类归属。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 分类路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
     * Get 分类归属。 
     * @return Owner 分类归属。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 分类归属。
     * @param Owner 分类归属。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 分类路径。 
     * @return ClassPath 分类路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 分类路径。
     * @param ClassPath 分类路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    public ClassCreatedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassCreatedEvent(ClassCreatedEvent source) {
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

