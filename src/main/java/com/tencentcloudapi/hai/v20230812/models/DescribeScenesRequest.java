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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScenesRequest extends AbstractModel {

    /**
    * ["sc-abcdefgh"]
    */
    @SerializedName("SceneIds")
    @Expose
    private String [] SceneIds;

    /**
     * Get ["sc-abcdefgh"] 
     * @return SceneIds ["sc-abcdefgh"]
     */
    public String [] getSceneIds() {
        return this.SceneIds;
    }

    /**
     * Set ["sc-abcdefgh"]
     * @param SceneIds ["sc-abcdefgh"]
     */
    public void setSceneIds(String [] SceneIds) {
        this.SceneIds = SceneIds;
    }

    public DescribeScenesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScenesRequest(DescribeScenesRequest source) {
        if (source.SceneIds != null) {
            this.SceneIds = new String[source.SceneIds.length];
            for (int i = 0; i < source.SceneIds.length; i++) {
                this.SceneIds[i] = new String(source.SceneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SceneIds.", this.SceneIds);

    }
}

