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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpcEndPointServiceWhiteListRequest extends AbstractModel{

    /**
    * UIN。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 终端节点服务ID。
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 白名单描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get UIN。 
     * @return UserUin UIN。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set UIN。
     * @param UserUin UIN。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 终端节点服务ID。 
     * @return EndPointServiceId 终端节点服务ID。
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID。
     * @param EndPointServiceId 终端节点服务ID。
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 白名单描述。 
     * @return Description 白名单描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 白名单描述。
     * @param Description 白名单描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateVpcEndPointServiceWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcEndPointServiceWhiteListRequest(CreateVpcEndPointServiceWhiteListRequest source) {
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

