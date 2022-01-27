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

public class MaterialMovedEvent extends AbstractModel{

    /**
    * 要移动的媒体 Id 列表。
    */
    @SerializedName("MaterialIdSet")
    @Expose
    private String [] MaterialIdSet;

    /**
    * 源媒体归属。
    */
    @SerializedName("SourceOwner")
    @Expose
    private Entity SourceOwner;

    /**
    * 源媒体分类路径。
    */
    @SerializedName("SourceClassPath")
    @Expose
    private String SourceClassPath;

    /**
    * 目标媒体分类归属。
    */
    @SerializedName("DestinationOwner")
    @Expose
    private Entity DestinationOwner;

    /**
    * 目标媒体分类路径。
    */
    @SerializedName("DestinationClassPath")
    @Expose
    private String DestinationClassPath;

    /**
     * Get 要移动的媒体 Id 列表。 
     * @return MaterialIdSet 要移动的媒体 Id 列表。
     */
    public String [] getMaterialIdSet() {
        return this.MaterialIdSet;
    }

    /**
     * Set 要移动的媒体 Id 列表。
     * @param MaterialIdSet 要移动的媒体 Id 列表。
     */
    public void setMaterialIdSet(String [] MaterialIdSet) {
        this.MaterialIdSet = MaterialIdSet;
    }

    /**
     * Get 源媒体归属。 
     * @return SourceOwner 源媒体归属。
     */
    public Entity getSourceOwner() {
        return this.SourceOwner;
    }

    /**
     * Set 源媒体归属。
     * @param SourceOwner 源媒体归属。
     */
    public void setSourceOwner(Entity SourceOwner) {
        this.SourceOwner = SourceOwner;
    }

    /**
     * Get 源媒体分类路径。 
     * @return SourceClassPath 源媒体分类路径。
     */
    public String getSourceClassPath() {
        return this.SourceClassPath;
    }

    /**
     * Set 源媒体分类路径。
     * @param SourceClassPath 源媒体分类路径。
     */
    public void setSourceClassPath(String SourceClassPath) {
        this.SourceClassPath = SourceClassPath;
    }

    /**
     * Get 目标媒体分类归属。 
     * @return DestinationOwner 目标媒体分类归属。
     */
    public Entity getDestinationOwner() {
        return this.DestinationOwner;
    }

    /**
     * Set 目标媒体分类归属。
     * @param DestinationOwner 目标媒体分类归属。
     */
    public void setDestinationOwner(Entity DestinationOwner) {
        this.DestinationOwner = DestinationOwner;
    }

    /**
     * Get 目标媒体分类路径。 
     * @return DestinationClassPath 目标媒体分类路径。
     */
    public String getDestinationClassPath() {
        return this.DestinationClassPath;
    }

    /**
     * Set 目标媒体分类路径。
     * @param DestinationClassPath 目标媒体分类路径。
     */
    public void setDestinationClassPath(String DestinationClassPath) {
        this.DestinationClassPath = DestinationClassPath;
    }

    public MaterialMovedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialMovedEvent(MaterialMovedEvent source) {
        if (source.MaterialIdSet != null) {
            this.MaterialIdSet = new String[source.MaterialIdSet.length];
            for (int i = 0; i < source.MaterialIdSet.length; i++) {
                this.MaterialIdSet[i] = new String(source.MaterialIdSet[i]);
            }
        }
        if (source.SourceOwner != null) {
            this.SourceOwner = new Entity(source.SourceOwner);
        }
        if (source.SourceClassPath != null) {
            this.SourceClassPath = new String(source.SourceClassPath);
        }
        if (source.DestinationOwner != null) {
            this.DestinationOwner = new Entity(source.DestinationOwner);
        }
        if (source.DestinationClassPath != null) {
            this.DestinationClassPath = new String(source.DestinationClassPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MaterialIdSet.", this.MaterialIdSet);
        this.setParamObj(map, prefix + "SourceOwner.", this.SourceOwner);
        this.setParamSimple(map, prefix + "SourceClassPath", this.SourceClassPath);
        this.setParamObj(map, prefix + "DestinationOwner.", this.DestinationOwner);
        this.setParamSimple(map, prefix + "DestinationClassPath", this.DestinationClassPath);

    }
}

