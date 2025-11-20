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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSyncUserTaskRequest extends AbstractModel {

    /**
    * 同步用户类型, 1-同步ioa用户
    */
    @SerializedName("UserKind")
    @Expose
    private Long UserKind;

    /**
     * Get 同步用户类型, 1-同步ioa用户 
     * @return UserKind 同步用户类型, 1-同步ioa用户
     */
    public Long getUserKind() {
        return this.UserKind;
    }

    /**
     * Set 同步用户类型, 1-同步ioa用户
     * @param UserKind 同步用户类型, 1-同步ioa用户
     */
    public void setUserKind(Long UserKind) {
        this.UserKind = UserKind;
    }

    public CreateSyncUserTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSyncUserTaskRequest(CreateSyncUserTaskRequest source) {
        if (source.UserKind != null) {
            this.UserKind = new Long(source.UserKind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserKind", this.UserKind);

    }
}

