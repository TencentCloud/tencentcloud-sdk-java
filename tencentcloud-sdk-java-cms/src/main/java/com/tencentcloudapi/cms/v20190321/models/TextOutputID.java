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

public class TextOutputID extends AbstractModel{

    /**
    * 接入业务的唯一ID
    */
    @SerializedName("MsgID")
    @Expose
    private String MsgID;

    /**
    * 用户账号uin，对应请求协议里的Content.User.Uin。旁路结果有回带，串联结果无该字段
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get 接入业务的唯一ID 
     * @return MsgID 接入业务的唯一ID
     */
    public String getMsgID() {
        return this.MsgID;
    }

    /**
     * Set 接入业务的唯一ID
     * @param MsgID 接入业务的唯一ID
     */
    public void setMsgID(String MsgID) {
        this.MsgID = MsgID;
    }

    /**
     * Get 用户账号uin，对应请求协议里的Content.User.Uin。旁路结果有回带，串联结果无该字段 
     * @return Uin 用户账号uin，对应请求协议里的Content.User.Uin。旁路结果有回带，串联结果无该字段
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户账号uin，对应请求协议里的Content.User.Uin。旁路结果有回带，串联结果无该字段
     * @param Uin 用户账号uin，对应请求协议里的Content.User.Uin。旁路结果有回带，串联结果无该字段
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgID", this.MsgID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

