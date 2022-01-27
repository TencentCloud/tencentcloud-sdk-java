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

public class ClassMovedEvent extends AbstractModel{

    /**
    * 源分类归属。
    */
    @SerializedName("SourceOwner")
    @Expose
    private Entity SourceOwner;

    /**
    * 源分类路径列表。
    */
    @SerializedName("SourceClassPathSet")
    @Expose
    private String [] SourceClassPathSet;

    /**
    * 目标分类归属。
    */
    @SerializedName("DestinationOwner")
    @Expose
    private Entity DestinationOwner;

    /**
    * 目标分类归属。
    */
    @SerializedName("DestinationClassPath")
    @Expose
    private String DestinationClassPath;

    /**
     * Get 源分类归属。 
     * @return SourceOwner 源分类归属。
     */
    public Entity getSourceOwner() {
        return this.SourceOwner;
    }

    /**
     * Set 源分类归属。
     * @param SourceOwner 源分类归属。
     */
    public void setSourceOwner(Entity SourceOwner) {
        this.SourceOwner = SourceOwner;
    }

    /**
     * Get 源分类路径列表。 
     * @return SourceClassPathSet 源分类路径列表。
     */
    public String [] getSourceClassPathSet() {
        return this.SourceClassPathSet;
    }

    /**
     * Set 源分类路径列表。
     * @param SourceClassPathSet 源分类路径列表。
     */
    public void setSourceClassPathSet(String [] SourceClassPathSet) {
        this.SourceClassPathSet = SourceClassPathSet;
    }

    /**
     * Get 目标分类归属。 
     * @return DestinationOwner 目标分类归属。
     */
    public Entity getDestinationOwner() {
        return this.DestinationOwner;
    }

    /**
     * Set 目标分类归属。
     * @param DestinationOwner 目标分类归属。
     */
    public void setDestinationOwner(Entity DestinationOwner) {
        this.DestinationOwner = DestinationOwner;
    }

    /**
     * Get 目标分类归属。 
     * @return DestinationClassPath 目标分类归属。
     */
    public String getDestinationClassPath() {
        return this.DestinationClassPath;
    }

    /**
     * Set 目标分类归属。
     * @param DestinationClassPath 目标分类归属。
     */
    public void setDestinationClassPath(String DestinationClassPath) {
        this.DestinationClassPath = DestinationClassPath;
    }

    public ClassMovedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassMovedEvent(ClassMovedEvent source) {
        if (source.SourceOwner != null) {
            this.SourceOwner = new Entity(source.SourceOwner);
        }
        if (source.SourceClassPathSet != null) {
            this.SourceClassPathSet = new String[source.SourceClassPathSet.length];
            for (int i = 0; i < source.SourceClassPathSet.length; i++) {
                this.SourceClassPathSet[i] = new String(source.SourceClassPathSet[i]);
            }
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
        this.setParamObj(map, prefix + "SourceOwner.", this.SourceOwner);
        this.setParamArraySimple(map, prefix + "SourceClassPathSet.", this.SourceClassPathSet);
        this.setParamObj(map, prefix + "DestinationOwner.", this.DestinationOwner);
        this.setParamSimple(map, prefix + "DestinationClassPath", this.DestinationClassPath);

    }
}

