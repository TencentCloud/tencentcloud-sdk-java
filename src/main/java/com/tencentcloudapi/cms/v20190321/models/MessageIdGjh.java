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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageIdGjh extends AbstractModel{

    /**
    * 消息Id，异步是回传改值
    */
    @SerializedName("StrMsgID")
    @Expose
    private String StrMsgID;

    /**
     * Get 消息Id，异步是回传改值 
     * @return StrMsgID 消息Id，异步是回传改值
     */
    public String getStrMsgID() {
        return this.StrMsgID;
    }

    /**
     * Set 消息Id，异步是回传改值
     * @param StrMsgID 消息Id，异步是回传改值
     */
    public void setStrMsgID(String StrMsgID) {
        this.StrMsgID = StrMsgID;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrMsgID", this.StrMsgID);

    }
}

