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

public class SceneListRes extends AbstractModel {

    /**
    * 场景列表
    */
    @SerializedName("SceneList")
    @Expose
    private SceneInfo [] SceneList;

    /**
     * Get 场景列表 
     * @return SceneList 场景列表
     */
    public SceneInfo [] getSceneList() {
        return this.SceneList;
    }

    /**
     * Set 场景列表
     * @param SceneList 场景列表
     */
    public void setSceneList(SceneInfo [] SceneList) {
        this.SceneList = SceneList;
    }

    public SceneListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneListRes(SceneListRes source) {
        if (source.SceneList != null) {
            this.SceneList = new SceneInfo[source.SceneList.length];
            for (int i = 0; i < source.SceneList.length; i++) {
                this.SceneList[i] = new SceneInfo(source.SceneList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SceneList.", this.SceneList);

    }
}

