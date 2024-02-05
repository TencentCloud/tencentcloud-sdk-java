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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagePortraitRiskValueOutput extends AbstractModel {

    /**
    * 对应的IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 对应的IP 
     * @return UserIp 对应的IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 对应的IP
     * @param UserIp 对应的IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高 
     * @return Level 返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高
     * @param Level 返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public ManagePortraitRiskValueOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagePortraitRiskValueOutput(ManagePortraitRiskValueOutput source) {
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

