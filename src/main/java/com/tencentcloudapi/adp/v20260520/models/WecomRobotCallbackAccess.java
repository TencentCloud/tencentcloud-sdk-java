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

public class WecomRobotCallbackAccess extends AbstractModel {

    /**
    * <p>回调配置</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackConfig Callback;

    /**
    * <p>机器人名称</p>
    */
    @SerializedName("RobotName")
    @Expose
    private String RobotName;

    /**
    * <p>企微企业ID</p>
    */
    @SerializedName("WecomCorpId")
    @Expose
    private String WecomCorpId;

    /**
    * <p>企微机器人ID</p>
    */
    @SerializedName("WecomRobotId")
    @Expose
    private String WecomRobotId;

    /**
     * Get <p>回调配置</p> 
     * @return Callback <p>回调配置</p>
     */
    public CallbackConfig getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>回调配置</p>
     * @param Callback <p>回调配置</p>
     */
    public void setCallback(CallbackConfig Callback) {
        this.Callback = Callback;
    }

    /**
     * Get <p>机器人名称</p> 
     * @return RobotName <p>机器人名称</p>
     */
    public String getRobotName() {
        return this.RobotName;
    }

    /**
     * Set <p>机器人名称</p>
     * @param RobotName <p>机器人名称</p>
     */
    public void setRobotName(String RobotName) {
        this.RobotName = RobotName;
    }

    /**
     * Get <p>企微企业ID</p> 
     * @return WecomCorpId <p>企微企业ID</p>
     */
    public String getWecomCorpId() {
        return this.WecomCorpId;
    }

    /**
     * Set <p>企微企业ID</p>
     * @param WecomCorpId <p>企微企业ID</p>
     */
    public void setWecomCorpId(String WecomCorpId) {
        this.WecomCorpId = WecomCorpId;
    }

    /**
     * Get <p>企微机器人ID</p> 
     * @return WecomRobotId <p>企微机器人ID</p>
     */
    public String getWecomRobotId() {
        return this.WecomRobotId;
    }

    /**
     * Set <p>企微机器人ID</p>
     * @param WecomRobotId <p>企微机器人ID</p>
     */
    public void setWecomRobotId(String WecomRobotId) {
        this.WecomRobotId = WecomRobotId;
    }

    public WecomRobotCallbackAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WecomRobotCallbackAccess(WecomRobotCallbackAccess source) {
        if (source.Callback != null) {
            this.Callback = new CallbackConfig(source.Callback);
        }
        if (source.RobotName != null) {
            this.RobotName = new String(source.RobotName);
        }
        if (source.WecomCorpId != null) {
            this.WecomCorpId = new String(source.WecomCorpId);
        }
        if (source.WecomRobotId != null) {
            this.WecomRobotId = new String(source.WecomRobotId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamSimple(map, prefix + "RobotName", this.RobotName);
        this.setParamSimple(map, prefix + "WecomCorpId", this.WecomCorpId);
        this.setParamSimple(map, prefix + "WecomRobotId", this.WecomRobotId);

    }
}

