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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebSearchOptions extends AbstractModel {

    /**
    * 表示用户注入的知识信息
    */
    @SerializedName("Knowledge")
    @Expose
    private Knowledge [] Knowledge;

    /**
    * 用户位置详细信息
    */
    @SerializedName("UserLocation")
    @Expose
    private UserLocation UserLocation;

    /**
    * 打开开关，会返回搜索状态
    */
    @SerializedName("Processes")
    @Expose
    private Boolean Processes;

    /**
     * Get 表示用户注入的知识信息 
     * @return Knowledge 表示用户注入的知识信息
     */
    public Knowledge [] getKnowledge() {
        return this.Knowledge;
    }

    /**
     * Set 表示用户注入的知识信息
     * @param Knowledge 表示用户注入的知识信息
     */
    public void setKnowledge(Knowledge [] Knowledge) {
        this.Knowledge = Knowledge;
    }

    /**
     * Get 用户位置详细信息 
     * @return UserLocation 用户位置详细信息
     */
    public UserLocation getUserLocation() {
        return this.UserLocation;
    }

    /**
     * Set 用户位置详细信息
     * @param UserLocation 用户位置详细信息
     */
    public void setUserLocation(UserLocation UserLocation) {
        this.UserLocation = UserLocation;
    }

    /**
     * Get 打开开关，会返回搜索状态 
     * @return Processes 打开开关，会返回搜索状态
     */
    public Boolean getProcesses() {
        return this.Processes;
    }

    /**
     * Set 打开开关，会返回搜索状态
     * @param Processes 打开开关，会返回搜索状态
     */
    public void setProcesses(Boolean Processes) {
        this.Processes = Processes;
    }

    public WebSearchOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSearchOptions(WebSearchOptions source) {
        if (source.Knowledge != null) {
            this.Knowledge = new Knowledge[source.Knowledge.length];
            for (int i = 0; i < source.Knowledge.length; i++) {
                this.Knowledge[i] = new Knowledge(source.Knowledge[i]);
            }
        }
        if (source.UserLocation != null) {
            this.UserLocation = new UserLocation(source.UserLocation);
        }
        if (source.Processes != null) {
            this.Processes = new Boolean(source.Processes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Knowledge.", this.Knowledge);
        this.setParamObj(map, prefix + "UserLocation.", this.UserLocation);
        this.setParamSimple(map, prefix + "Processes", this.Processes);

    }
}

