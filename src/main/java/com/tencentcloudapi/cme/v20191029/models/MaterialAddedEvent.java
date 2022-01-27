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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialAddedEvent extends AbstractModel{

    /**
    * 添加的媒体 Id 列表。
    */
    @SerializedName("MaterialIdSet")
    @Expose
    private String [] MaterialIdSet;

    /**
    * 添加的媒体归属。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 添加的媒体分类路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
     * Get 添加的媒体 Id 列表。 
     * @return MaterialIdSet 添加的媒体 Id 列表。
     */
    public String [] getMaterialIdSet() {
        return this.MaterialIdSet;
    }

    /**
     * Set 添加的媒体 Id 列表。
     * @param MaterialIdSet 添加的媒体 Id 列表。
     */
    public void setMaterialIdSet(String [] MaterialIdSet) {
        this.MaterialIdSet = MaterialIdSet;
    }

    /**
     * Get 添加的媒体归属。 
     * @return Owner 添加的媒体归属。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 添加的媒体归属。
     * @param Owner 添加的媒体归属。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 添加的媒体分类路径。 
     * @return ClassPath 添加的媒体分类路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 添加的媒体分类路径。
     * @param ClassPath 添加的媒体分类路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    public MaterialAddedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialAddedEvent(MaterialAddedEvent source) {
        if (source.MaterialIdSet != null) {
            this.MaterialIdSet = new String[source.MaterialIdSet.length];
            for (int i = 0; i < source.MaterialIdSet.length; i++) {
                this.MaterialIdSet[i] = new String(source.MaterialIdSet[i]);
            }
        }
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
        this.setParamArraySimple(map, prefix + "MaterialIdSet.", this.MaterialIdSet);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);

    }
}

