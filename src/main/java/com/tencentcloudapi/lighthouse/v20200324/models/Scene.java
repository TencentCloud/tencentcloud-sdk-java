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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scene extends AbstractModel{

    /**
    * 使用场景Id
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 使用场景展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 使用场景描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 使用场景Id 
     * @return SceneId 使用场景Id
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 使用场景Id
     * @param SceneId 使用场景Id
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 使用场景展示名称 
     * @return DisplayName 使用场景展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 使用场景展示名称
     * @param DisplayName 使用场景展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 使用场景描述 
     * @return Description 使用场景描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 使用场景描述
     * @param Description 使用场景描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Scene() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Scene(Scene source) {
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

