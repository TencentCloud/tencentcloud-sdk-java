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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyConcurrentRequest extends AbstractModel{

    /**
    * 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 应用版本ID
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
     * Get 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变） 
     * @return UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     * @param UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户IP 
     * @return UserIp 用户IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户IP
     * @param UserIp 用户IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 应用版本ID 
     * @return ApplicationVersionId 应用版本ID
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set 应用版本ID
     * @param ApplicationVersionId 应用版本ID
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    public ApplyConcurrentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyConcurrentRequest(ApplyConcurrentRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);

    }
}

