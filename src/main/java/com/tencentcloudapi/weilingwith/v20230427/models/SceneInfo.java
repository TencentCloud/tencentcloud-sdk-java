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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneInfo extends AbstractModel {

    /**
    * 场景id
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 场景名称
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 场景版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 场景id 
     * @return SceneId 场景id
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景id
     * @param SceneId 场景id
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 场景名称 
     * @return SceneName 场景名称
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名称
     * @param SceneName 场景名称
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 场景版本 
     * @return Version 场景版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 场景版本
     * @param Version 场景版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public SceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneInfo(SceneInfo source) {
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

