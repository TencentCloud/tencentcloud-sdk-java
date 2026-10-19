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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveWorkflowDebugContextRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用变量列表</p>
    */
    @SerializedName("AppVariableValueList")
    @Expose
    private AppVariableValue [] AppVariableValueList;

    /**
    * <p>会话ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>自定义用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用变量列表</p> 
     * @return AppVariableValueList <p>应用变量列表</p>
     */
    public AppVariableValue [] getAppVariableValueList() {
        return this.AppVariableValueList;
    }

    /**
     * Set <p>应用变量列表</p>
     * @param AppVariableValueList <p>应用变量列表</p>
     */
    public void setAppVariableValueList(AppVariableValue [] AppVariableValueList) {
        this.AppVariableValueList = AppVariableValueList;
    }

    /**
     * Get <p>会话ID</p> 
     * @return SessionId <p>会话ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话ID</p>
     * @param SessionId <p>会话ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>自定义用户ID</p> 
     * @return UserId <p>自定义用户ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>自定义用户ID</p>
     * @param UserId <p>自定义用户ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public SaveWorkflowDebugContextRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveWorkflowDebugContextRequest(SaveWorkflowDebugContextRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppVariableValueList != null) {
            this.AppVariableValueList = new AppVariableValue[source.AppVariableValueList.length];
            for (int i = 0; i < source.AppVariableValueList.length; i++) {
                this.AppVariableValueList[i] = new AppVariableValue(source.AppVariableValueList[i]);
            }
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "AppVariableValueList.", this.AppVariableValueList);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

