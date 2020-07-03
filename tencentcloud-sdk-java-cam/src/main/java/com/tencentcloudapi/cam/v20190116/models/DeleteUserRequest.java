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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUserRequest extends AbstractModel{

    /**
    * 子用户用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否强制删除该子用户，默认入参为0。0：若该用户存在未删除API密钥，则不删除用户；1：若该用户存在未删除API密钥，则先删除密钥后删除用户。删除密钥需要您拥有cam:DeleteApiKey权限，您将可以删除该用户下启用或禁用状态的所有密钥，无权限则删除密钥和用户失败
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get 子用户用户名 
     * @return Name 子用户用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子用户用户名
     * @param Name 子用户用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否强制删除该子用户，默认入参为0。0：若该用户存在未删除API密钥，则不删除用户；1：若该用户存在未删除API密钥，则先删除密钥后删除用户。删除密钥需要您拥有cam:DeleteApiKey权限，您将可以删除该用户下启用或禁用状态的所有密钥，无权限则删除密钥和用户失败 
     * @return Force 是否强制删除该子用户，默认入参为0。0：若该用户存在未删除API密钥，则不删除用户；1：若该用户存在未删除API密钥，则先删除密钥后删除用户。删除密钥需要您拥有cam:DeleteApiKey权限，您将可以删除该用户下启用或禁用状态的所有密钥，无权限则删除密钥和用户失败
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制删除该子用户，默认入参为0。0：若该用户存在未删除API密钥，则不删除用户；1：若该用户存在未删除API密钥，则先删除密钥后删除用户。删除密钥需要您拥有cam:DeleteApiKey权限，您将可以删除该用户下启用或禁用状态的所有密钥，无权限则删除密钥和用户失败
     * @param Force 是否强制删除该子用户，默认入参为0。0：若该用户存在未删除API密钥，则不删除用户；1：若该用户存在未删除API密钥，则先删除密钥后删除用户。删除密钥需要您拥有cam:DeleteApiKey权限，您将可以删除该用户下启用或禁用状态的所有密钥，无权限则删除密钥和用户失败
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

