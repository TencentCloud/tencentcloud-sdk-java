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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemindEmailInfo extends AbstractModel {

    /**
    * <p>签署编号</p>
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * <p>指定邮箱地址，催办时使用此邮箱替代 DB 中存储的邮箱</p>
    */
    @SerializedName("ApproverEmail")
    @Expose
    private String ApproverEmail;

    /**
     * Get <p>签署编号</p> 
     * @return SignId <p>签署编号</p>
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set <p>签署编号</p>
     * @param SignId <p>签署编号</p>
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get <p>指定邮箱地址，催办时使用此邮箱替代 DB 中存储的邮箱</p> 
     * @return ApproverEmail <p>指定邮箱地址，催办时使用此邮箱替代 DB 中存储的邮箱</p>
     */
    public String getApproverEmail() {
        return this.ApproverEmail;
    }

    /**
     * Set <p>指定邮箱地址，催办时使用此邮箱替代 DB 中存储的邮箱</p>
     * @param ApproverEmail <p>指定邮箱地址，催办时使用此邮箱替代 DB 中存储的邮箱</p>
     */
    public void setApproverEmail(String ApproverEmail) {
        this.ApproverEmail = ApproverEmail;
    }

    public RemindEmailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemindEmailInfo(RemindEmailInfo source) {
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.ApproverEmail != null) {
            this.ApproverEmail = new String(source.ApproverEmail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "ApproverEmail", this.ApproverEmail);

    }
}

