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

public class ModifyTimerTaskRequest extends AbstractModel {

    /**
    * 空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 任务ID
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
    * 任务
    */
    @SerializedName("TimerTask")
    @Expose
    private TimerTask TimerTask;

    /**
    * 修改的内容
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
    * <p>主用户Uin</p>
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * <p>子用户Uin</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get 空间ID 
     * @return SpaceId 空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间ID
     * @param SpaceId 空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 任务ID 
     * @return TimerId 任务ID
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set 任务ID
     * @param TimerId 任务ID
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    /**
     * Get 任务 
     * @return TimerTask 任务
     */
    public TimerTask getTimerTask() {
        return this.TimerTask;
    }

    /**
     * Set 任务
     * @param TimerTask 任务
     */
    public void setTimerTask(TimerTask TimerTask) {
        this.TimerTask = TimerTask;
    }

    /**
     * Get 修改的内容 
     * @return UpdateMask 修改的内容
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set 修改的内容
     * @param UpdateMask 修改的内容
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    /**
     * Get <p>主用户Uin</p> 
     * @return LoginUin <p>主用户Uin</p>
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set <p>主用户Uin</p>
     * @param LoginUin <p>主用户Uin</p>
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get <p>子用户Uin</p> 
     * @return LoginSubAccountUin <p>子用户Uin</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>子用户Uin</p>
     * @param LoginSubAccountUin <p>子用户Uin</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public ModifyTimerTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTimerTaskRequest(ModifyTimerTaskRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
        }
        if (source.TimerTask != null) {
            this.TimerTask = new TimerTask(source.TimerTask);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);
        this.setParamObj(map, prefix + "TimerTask.", this.TimerTask);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

