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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudMusicPurchasedRequest extends AbstractModel{

    /**
    * 授权项目Id
    */
    @SerializedName("AuthInfoId")
    @Expose
    private String AuthInfoId;

    /**
     * Get 授权项目Id 
     * @return AuthInfoId 授权项目Id
     */
    public String getAuthInfoId() {
        return this.AuthInfoId;
    }

    /**
     * Set 授权项目Id
     * @param AuthInfoId 授权项目Id
     */
    public void setAuthInfoId(String AuthInfoId) {
        this.AuthInfoId = AuthInfoId;
    }

    public DescribeCloudMusicPurchasedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudMusicPurchasedRequest(DescribeCloudMusicPurchasedRequest source) {
        if (source.AuthInfoId != null) {
            this.AuthInfoId = new String(source.AuthInfoId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthInfoId", this.AuthInfoId);

    }
}

