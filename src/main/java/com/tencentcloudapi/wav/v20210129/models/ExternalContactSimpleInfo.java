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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalContactSimpleInfo extends AbstractModel{

    /**
    * 外部联系人的userId
    */
    @SerializedName("ExternalUserId")
    @Expose
    private String ExternalUserId;

    /**
    * 添加了此外部联系人的企业成员userId
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 外部联系人的userId 
     * @return ExternalUserId 外部联系人的userId
     */
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    /**
     * Set 外部联系人的userId
     * @param ExternalUserId 外部联系人的userId
     */
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    /**
     * Get 添加了此外部联系人的企业成员userId 
     * @return UserId 添加了此外部联系人的企业成员userId
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 添加了此外部联系人的企业成员userId
     * @param UserId 添加了此外部联系人的企业成员userId
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public ExternalContactSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalContactSimpleInfo(ExternalContactSimpleInfo source) {
        if (source.ExternalUserId != null) {
            this.ExternalUserId = new String(source.ExternalUserId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalUserId", this.ExternalUserId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

