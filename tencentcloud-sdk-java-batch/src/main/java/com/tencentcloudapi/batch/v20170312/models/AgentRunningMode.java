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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentRunningMode extends AbstractModel{

    /**
    * 场景类型，支持WINDOWS
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 运行Agent的User
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 运行Agent的Session
    */
    @SerializedName("Session")
    @Expose
    private String Session;

    /**
     * Get 场景类型，支持WINDOWS 
     * @return Scene 场景类型，支持WINDOWS
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景类型，支持WINDOWS
     * @param Scene 场景类型，支持WINDOWS
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 运行Agent的User 
     * @return User 运行Agent的User
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 运行Agent的User
     * @param User 运行Agent的User
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 运行Agent的Session 
     * @return Session 运行Agent的Session
     */
    public String getSession() {
        return this.Session;
    }

    /**
     * Set 运行Agent的Session
     * @param Session 运行Agent的Session
     */
    public void setSession(String Session) {
        this.Session = Session;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Session", this.Session);

    }
}

