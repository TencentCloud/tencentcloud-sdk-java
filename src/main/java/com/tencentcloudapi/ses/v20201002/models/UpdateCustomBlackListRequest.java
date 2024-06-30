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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCustomBlackListRequest extends AbstractModel {

    /**
    * 需要更改的黑名单id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 修改后的邮件地址
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 过期时间，为空则表示永久有效
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
     * Get 需要更改的黑名单id 
     * @return Id 需要更改的黑名单id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 需要更改的黑名单id
     * @param Id 需要更改的黑名单id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 修改后的邮件地址 
     * @return Email 修改后的邮件地址
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 修改后的邮件地址
     * @param Email 修改后的邮件地址
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 过期时间，为空则表示永久有效 
     * @return ExpireDate 过期时间，为空则表示永久有效
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set 过期时间，为空则表示永久有效
     * @param ExpireDate 过期时间，为空则表示永久有效
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public UpdateCustomBlackListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCustomBlackListRequest(UpdateCustomBlackListRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);

    }
}

