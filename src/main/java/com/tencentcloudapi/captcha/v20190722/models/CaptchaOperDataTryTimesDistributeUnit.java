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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CaptchaOperDataTryTimesDistributeUnit extends AbstractModel{

    /**
    * 尝试次数
    */
    @SerializedName("TryCount")
    @Expose
    private Long TryCount;

    /**
    * 用户请求数量
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
     * Get 尝试次数 
     * @return TryCount 尝试次数
     */
    public Long getTryCount() {
        return this.TryCount;
    }

    /**
     * Set 尝试次数
     * @param TryCount 尝试次数
     */
    public void setTryCount(Long TryCount) {
        this.TryCount = TryCount;
    }

    /**
     * Get 用户请求数量 
     * @return UserCount 用户请求数量
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 用户请求数量
     * @param UserCount 用户请求数量
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TryCount", this.TryCount);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);

    }
}

