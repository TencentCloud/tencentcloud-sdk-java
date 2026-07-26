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

public class MarkTimerTaskRunLogReadRequest extends AbstractModel {

    /**
    * 实例列表
    */
    @SerializedName("FireInstanceIdList")
    @Expose
    private String [] FireInstanceIdList;

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
    * 主用户
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 子用户
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get 实例列表 
     * @return FireInstanceIdList 实例列表
     */
    public String [] getFireInstanceIdList() {
        return this.FireInstanceIdList;
    }

    /**
     * Set 实例列表
     * @param FireInstanceIdList 实例列表
     */
    public void setFireInstanceIdList(String [] FireInstanceIdList) {
        this.FireInstanceIdList = FireInstanceIdList;
    }

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
     * Get 主用户 
     * @return LoginUin 主用户
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 主用户
     * @param LoginUin 主用户
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get 子用户 
     * @return LoginSubAccountUin 子用户
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 子用户
     * @param LoginSubAccountUin 子用户
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public MarkTimerTaskRunLogReadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MarkTimerTaskRunLogReadRequest(MarkTimerTaskRunLogReadRequest source) {
        if (source.FireInstanceIdList != null) {
            this.FireInstanceIdList = new String[source.FireInstanceIdList.length];
            for (int i = 0; i < source.FireInstanceIdList.length; i++) {
                this.FireInstanceIdList[i] = new String(source.FireInstanceIdList[i]);
            }
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
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
        this.setParamArraySimple(map, prefix + "FireInstanceIdList.", this.FireInstanceIdList);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

