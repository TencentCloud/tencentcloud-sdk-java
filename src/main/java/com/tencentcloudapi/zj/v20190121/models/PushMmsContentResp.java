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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushMmsContentResp extends AbstractModel{

    /**
    * 返回码：0-成功 其它-失败
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 返回信息
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 消息回执id
    */
    @SerializedName("MessageId")
    @Expose
    private Long MessageId;

    /**
     * Get 返回码：0-成功 其它-失败 
     * @return ReturnCode 返回码：0-成功 其它-失败
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 返回码：0-成功 其它-失败
     * @param ReturnCode 返回码：0-成功 其它-失败
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 返回信息 
     * @return ReturnMsg 返回信息
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 返回信息
     * @param ReturnMsg 返回信息
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 消息回执id 
     * @return MessageId 消息回执id
     */
    public Long getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 消息回执id
     * @param MessageId 消息回执id
     */
    public void setMessageId(Long MessageId) {
        this.MessageId = MessageId;
    }

    public PushMmsContentResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushMmsContentResp(PushMmsContentResp source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.MessageId != null) {
            this.MessageId = new Long(source.MessageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);

    }
}

