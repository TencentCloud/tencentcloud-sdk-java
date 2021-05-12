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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBlackListRequest extends AbstractModel{

    /**
    * 需要清除的黑名单邮箱列表，数组长度至少为1
    */
    @SerializedName("EmailAddressList")
    @Expose
    private String [] EmailAddressList;

    /**
     * Get 需要清除的黑名单邮箱列表，数组长度至少为1 
     * @return EmailAddressList 需要清除的黑名单邮箱列表，数组长度至少为1
     */
    public String [] getEmailAddressList() {
        return this.EmailAddressList;
    }

    /**
     * Set 需要清除的黑名单邮箱列表，数组长度至少为1
     * @param EmailAddressList 需要清除的黑名单邮箱列表，数组长度至少为1
     */
    public void setEmailAddressList(String [] EmailAddressList) {
        this.EmailAddressList = EmailAddressList;
    }

    public DeleteBlackListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBlackListRequest(DeleteBlackListRequest source) {
        if (source.EmailAddressList != null) {
            this.EmailAddressList = new String[source.EmailAddressList.length];
            for (int i = 0; i < source.EmailAddressList.length; i++) {
                this.EmailAddressList[i] = new String(source.EmailAddressList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EmailAddressList.", this.EmailAddressList);

    }
}

