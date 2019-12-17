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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatBotRequest extends AbstractModel{

    /**
    * 用户请求的query
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 0: 通用闲聊, 1:儿童闲聊, 默认是通用闲聊
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 服务的id,  主要用于儿童闲聊接口，比如手Q的openid
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get 用户请求的query 
     * @return Query 用户请求的query
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 用户请求的query
     * @param Query 用户请求的query
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 0: 通用闲聊, 1:儿童闲聊, 默认是通用闲聊 
     * @return Flag 0: 通用闲聊, 1:儿童闲聊, 默认是通用闲聊
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 0: 通用闲聊, 1:儿童闲聊, 默认是通用闲聊
     * @param Flag 0: 通用闲聊, 1:儿童闲聊, 默认是通用闲聊
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 服务的id,  主要用于儿童闲聊接口，比如手Q的openid 
     * @return OpenId 服务的id,  主要用于儿童闲聊接口，比如手Q的openid
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 服务的id,  主要用于儿童闲聊接口，比如手Q的openid
     * @param OpenId 服务的id,  主要用于儿童闲聊接口，比如手Q的openid
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

