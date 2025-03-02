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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncFailReason extends AbstractModel {

    /**
    * 企业员工标识(即OpenId)
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 新增员工或者员工离职失败原因, 可能存证ID不符合规范、证件号码不合法等原因
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 企业员工标识(即OpenId) 
     * @return Id 企业员工标识(即OpenId)
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 企业员工标识(即OpenId)
     * @param Id 企业员工标识(即OpenId)
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 新增员工或者员工离职失败原因, 可能存证ID不符合规范、证件号码不合法等原因 
     * @return Message 新增员工或者员工离职失败原因, 可能存证ID不符合规范、证件号码不合法等原因
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 新增员工或者员工离职失败原因, 可能存证ID不符合规范、证件号码不合法等原因
     * @param Message 新增员工或者员工离职失败原因, 可能存证ID不符合规范、证件号码不合法等原因
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SyncFailReason() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncFailReason(SyncFailReason source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

