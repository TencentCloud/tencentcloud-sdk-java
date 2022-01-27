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

public class MaterialImportedEvent extends AbstractModel{

    /**
    * 导入的媒体信息列表。
    */
    @SerializedName("MediaInfoSet")
    @Expose
    private ImportMediaInfo [] MediaInfoSet;

    /**
    * 媒体归属。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 媒体分类路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
     * Get 导入的媒体信息列表。 
     * @return MediaInfoSet 导入的媒体信息列表。
     */
    public ImportMediaInfo [] getMediaInfoSet() {
        return this.MediaInfoSet;
    }

    /**
     * Set 导入的媒体信息列表。
     * @param MediaInfoSet 导入的媒体信息列表。
     */
    public void setMediaInfoSet(ImportMediaInfo [] MediaInfoSet) {
        this.MediaInfoSet = MediaInfoSet;
    }

    /**
     * Get 媒体归属。 
     * @return Owner 媒体归属。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 媒体归属。
     * @param Owner 媒体归属。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 媒体分类路径。 
     * @return ClassPath 媒体分类路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 媒体分类路径。
     * @param ClassPath 媒体分类路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    public MaterialImportedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialImportedEvent(MaterialImportedEvent source) {
        if (source.MediaInfoSet != null) {
            this.MediaInfoSet = new ImportMediaInfo[source.MediaInfoSet.length];
            for (int i = 0; i < source.MediaInfoSet.length; i++) {
                this.MediaInfoSet[i] = new ImportMediaInfo(source.MediaInfoSet[i]);
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
        this.setParamArrayObj(map, prefix + "MediaInfoSet.", this.MediaInfoSet);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);

    }
}

