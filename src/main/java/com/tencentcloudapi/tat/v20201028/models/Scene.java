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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scene extends AbstractModel {

    /**
    * 场景 ID 。
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 场景名称。
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 场景创建者。

- TAT：公共场景
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get 场景 ID 。 
     * @return SceneId 场景 ID 。
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景 ID 。
     * @param SceneId 场景 ID 。
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 场景名称。 
     * @return SceneName 场景名称。
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名称。
     * @param SceneName 场景名称。
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 场景创建者。

- TAT：公共场景 
     * @return CreatedBy 场景创建者。

- TAT：公共场景
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set 场景创建者。

- TAT：公共场景
     * @param CreatedBy 场景创建者。

- TAT：公共场景
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ 
     * @return CreatedTime 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
     * @param CreatedTime 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间。格式为：YYYY-MM-DDThh:mm:ssZ 
     * @return UpdatedTime 更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
     * @param UpdatedTime 更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
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
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

