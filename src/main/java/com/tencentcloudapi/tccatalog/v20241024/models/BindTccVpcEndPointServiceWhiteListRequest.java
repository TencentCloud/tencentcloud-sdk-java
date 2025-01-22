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
package com.tencentcloudapi.tccatalog.v20241024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindTccVpcEndPointServiceWhiteListRequest extends AbstractModel {

    /**
    * 终端节点服务Id
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 需要开白的用户Uin
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 用户描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 终端节点服务Id 
     * @return EndPointServiceId 终端节点服务Id
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务Id
     * @param EndPointServiceId 终端节点服务Id
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 需要开白的用户Uin 
     * @return UserUin 需要开白的用户Uin
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 需要开白的用户Uin
     * @param UserUin 需要开白的用户Uin
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 用户描述 
     * @return Description 用户描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户描述
     * @param Description 用户描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public BindTccVpcEndPointServiceWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindTccVpcEndPointServiceWhiteListRequest(BindTccVpcEndPointServiceWhiteListRequest source) {
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

