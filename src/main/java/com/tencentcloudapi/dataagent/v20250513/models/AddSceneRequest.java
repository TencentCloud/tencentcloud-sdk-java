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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSceneRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 场景
    */
    @SerializedName("Scene")
    @Expose
    private Scene Scene;

    /**
    * 1仅自己使用，2指定用户，0全员
    */
    @SerializedName("UseScope")
    @Expose
    private Long UseScope;

    /**
    * 可使用用户列表
    */
    @SerializedName("AuthorityUins")
    @Expose
    private String [] AuthorityUins;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 场景 
     * @return Scene 场景
     */
    public Scene getScene() {
        return this.Scene;
    }

    /**
     * Set 场景
     * @param Scene 场景
     */
    public void setScene(Scene Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 1仅自己使用，2指定用户，0全员 
     * @return UseScope 1仅自己使用，2指定用户，0全员
     */
    public Long getUseScope() {
        return this.UseScope;
    }

    /**
     * Set 1仅自己使用，2指定用户，0全员
     * @param UseScope 1仅自己使用，2指定用户，0全员
     */
    public void setUseScope(Long UseScope) {
        this.UseScope = UseScope;
    }

    /**
     * Get 可使用用户列表 
     * @return AuthorityUins 可使用用户列表
     */
    public String [] getAuthorityUins() {
        return this.AuthorityUins;
    }

    /**
     * Set 可使用用户列表
     * @param AuthorityUins 可使用用户列表
     */
    public void setAuthorityUins(String [] AuthorityUins) {
        this.AuthorityUins = AuthorityUins;
    }

    public AddSceneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSceneRequest(AddSceneRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Scene != null) {
            this.Scene = new Scene(source.Scene);
        }
        if (source.UseScope != null) {
            this.UseScope = new Long(source.UseScope);
        }
        if (source.AuthorityUins != null) {
            this.AuthorityUins = new String[source.AuthorityUins.length];
            for (int i = 0; i < source.AuthorityUins.length; i++) {
                this.AuthorityUins[i] = new String(source.AuthorityUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "Scene.", this.Scene);
        this.setParamSimple(map, prefix + "UseScope", this.UseScope);
        this.setParamArraySimple(map, prefix + "AuthorityUins.", this.AuthorityUins);

    }
}

