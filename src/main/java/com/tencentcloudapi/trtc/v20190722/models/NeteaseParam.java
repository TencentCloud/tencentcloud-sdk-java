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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NeteaseParam extends AbstractModel {

    /**
    * <p>网易云信应用 AppKey</p><p>登陆云信侧控制台或联系云信获取</p>
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * <p>频道名。</p><p>非空字符串,需要和生成token使用的Channel完全一致。</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>用于拉流端进房安全签名</p><p>生成方式详见文档：https://doc.yunxin.163.com/nertc/server-apis/TcxNDAxMTI?platform=server#%E8%8E%B7%E5%8F%96-token，每次请求审核需要重新生成新的token。</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>分配进房拉流的用户ID。</p><p>和生成Token时所用 Uid 完全一致。</p>
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
     * Get <p>网易云信应用 AppKey</p><p>登陆云信侧控制台或联系云信获取</p> 
     * @return AppKey <p>网易云信应用 AppKey</p><p>登陆云信侧控制台或联系云信获取</p>
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set <p>网易云信应用 AppKey</p><p>登陆云信侧控制台或联系云信获取</p>
     * @param AppKey <p>网易云信应用 AppKey</p><p>登陆云信侧控制台或联系云信获取</p>
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get <p>频道名。</p><p>非空字符串,需要和生成token使用的Channel完全一致。</p> 
     * @return Channel <p>频道名。</p><p>非空字符串,需要和生成token使用的Channel完全一致。</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>频道名。</p><p>非空字符串,需要和生成token使用的Channel完全一致。</p>
     * @param Channel <p>频道名。</p><p>非空字符串,需要和生成token使用的Channel完全一致。</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>用于拉流端进房安全签名</p><p>生成方式详见文档：https://doc.yunxin.163.com/nertc/server-apis/TcxNDAxMTI?platform=server#%E8%8E%B7%E5%8F%96-token，每次请求审核需要重新生成新的token。</p> 
     * @return Token <p>用于拉流端进房安全签名</p><p>生成方式详见文档：https://doc.yunxin.163.com/nertc/server-apis/TcxNDAxMTI?platform=server#%E8%8E%B7%E5%8F%96-token，每次请求审核需要重新生成新的token。</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>用于拉流端进房安全签名</p><p>生成方式详见文档：https://doc.yunxin.163.com/nertc/server-apis/TcxNDAxMTI?platform=server#%E8%8E%B7%E5%8F%96-token，每次请求审核需要重新生成新的token。</p>
     * @param Token <p>用于拉流端进房安全签名</p><p>生成方式详见文档：https://doc.yunxin.163.com/nertc/server-apis/TcxNDAxMTI?platform=server#%E8%8E%B7%E5%8F%96-token，每次请求审核需要重新生成新的token。</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>分配进房拉流的用户ID。</p><p>和生成Token时所用 Uid 完全一致。</p> 
     * @return Uid <p>分配进房拉流的用户ID。</p><p>和生成Token时所用 Uid 完全一致。</p>
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set <p>分配进房拉流的用户ID。</p><p>和生成Token时所用 Uid 完全一致。</p>
     * @param Uid <p>分配进房拉流的用户ID。</p><p>和生成Token时所用 Uid 完全一致。</p>
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    public NeteaseParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NeteaseParam(NeteaseParam source) {
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Uid", this.Uid);

    }
}

