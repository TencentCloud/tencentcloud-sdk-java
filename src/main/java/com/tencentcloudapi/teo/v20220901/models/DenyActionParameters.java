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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DenyActionParameters extends AbstractModel {

    /**
    * 是否对来源 IP 延长封禁。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，对触发规则的客户端 IP 持续拦截。当启用该选项时，必须同时指定 BlockIpDuration 参数。
注意：该选项不可与 ReturnCustomPage 或 Stall 选项同时启用。
    */
    @SerializedName("BlockIp")
    @Expose
    private String BlockIp;

    /**
    * 当 BlockIP 为 on 时IP 的封禁时长。
    */
    @SerializedName("BlockIpDuration")
    @Expose
    private String BlockIpDuration;

    /**
    * 是否使用自定义页面。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，使用自定义页面内容拦截（响应）请求，当启用该选项时，必须同时指定 ResponseCode 和 ErrorPageId 参数。
注意：该选项不可与 BlockIp 或 Stall 选项同时启用。

    */
    @SerializedName("ReturnCustomPage")
    @Expose
    private String ReturnCustomPage;

    /**
    * 自定义页面的状态码。
    */
    @SerializedName("ResponseCode")
    @Expose
    private String ResponseCode;

    /**
    * 自定义页面的PageId。
    */
    @SerializedName("ErrorPageId")
    @Expose
    private String ErrorPageId;

    /**
    * 是否对请求来源挂起不予处理。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，不再响应当前连接会话内请求，且不会主动断开连接。用于爬虫对抗时，消耗客户端连接资源。
注意：该选项不可与 BlockIp 或 ReturnCustomPage 选项同时启用。
    */
    @SerializedName("Stall")
    @Expose
    private String Stall;

    /**
     * Get 是否对来源 IP 延长封禁。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，对触发规则的客户端 IP 持续拦截。当启用该选项时，必须同时指定 BlockIpDuration 参数。
注意：该选项不可与 ReturnCustomPage 或 Stall 选项同时启用。 
     * @return BlockIp 是否对来源 IP 延长封禁。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，对触发规则的客户端 IP 持续拦截。当启用该选项时，必须同时指定 BlockIpDuration 参数。
注意：该选项不可与 ReturnCustomPage 或 Stall 选项同时启用。
     */
    public String getBlockIp() {
        return this.BlockIp;
    }

    /**
     * Set 是否对来源 IP 延长封禁。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，对触发规则的客户端 IP 持续拦截。当启用该选项时，必须同时指定 BlockIpDuration 参数。
注意：该选项不可与 ReturnCustomPage 或 Stall 选项同时启用。
     * @param BlockIp 是否对来源 IP 延长封禁。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，对触发规则的客户端 IP 持续拦截。当启用该选项时，必须同时指定 BlockIpDuration 参数。
注意：该选项不可与 ReturnCustomPage 或 Stall 选项同时启用。
     */
    public void setBlockIp(String BlockIp) {
        this.BlockIp = BlockIp;
    }

    /**
     * Get 当 BlockIP 为 on 时IP 的封禁时长。 
     * @return BlockIpDuration 当 BlockIP 为 on 时IP 的封禁时长。
     */
    public String getBlockIpDuration() {
        return this.BlockIpDuration;
    }

    /**
     * Set 当 BlockIP 为 on 时IP 的封禁时长。
     * @param BlockIpDuration 当 BlockIP 为 on 时IP 的封禁时长。
     */
    public void setBlockIpDuration(String BlockIpDuration) {
        this.BlockIpDuration = BlockIpDuration;
    }

    /**
     * Get 是否使用自定义页面。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，使用自定义页面内容拦截（响应）请求，当启用该选项时，必须同时指定 ResponseCode 和 ErrorPageId 参数。
注意：该选项不可与 BlockIp 或 Stall 选项同时启用。
 
     * @return ReturnCustomPage 是否使用自定义页面。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，使用自定义页面内容拦截（响应）请求，当启用该选项时，必须同时指定 ResponseCode 和 ErrorPageId 参数。
注意：该选项不可与 BlockIp 或 Stall 选项同时启用。

     */
    public String getReturnCustomPage() {
        return this.ReturnCustomPage;
    }

    /**
     * Set 是否使用自定义页面。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，使用自定义页面内容拦截（响应）请求，当启用该选项时，必须同时指定 ResponseCode 和 ErrorPageId 参数。
注意：该选项不可与 BlockIp 或 Stall 选项同时启用。

     * @param ReturnCustomPage 是否使用自定义页面。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，使用自定义页面内容拦截（响应）请求，当启用该选项时，必须同时指定 ResponseCode 和 ErrorPageId 参数。
注意：该选项不可与 BlockIp 或 Stall 选项同时启用。

     */
    public void setReturnCustomPage(String ReturnCustomPage) {
        this.ReturnCustomPage = ReturnCustomPage;
    }

    /**
     * Get 自定义页面的状态码。 
     * @return ResponseCode 自定义页面的状态码。
     */
    public String getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set 自定义页面的状态码。
     * @param ResponseCode 自定义页面的状态码。
     */
    public void setResponseCode(String ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    /**
     * Get 自定义页面的PageId。 
     * @return ErrorPageId 自定义页面的PageId。
     */
    public String getErrorPageId() {
        return this.ErrorPageId;
    }

    /**
     * Set 自定义页面的PageId。
     * @param ErrorPageId 自定义页面的PageId。
     */
    public void setErrorPageId(String ErrorPageId) {
        this.ErrorPageId = ErrorPageId;
    }

    /**
     * Get 是否对请求来源挂起不予处理。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，不再响应当前连接会话内请求，且不会主动断开连接。用于爬虫对抗时，消耗客户端连接资源。
注意：该选项不可与 BlockIp 或 ReturnCustomPage 选项同时启用。 
     * @return Stall 是否对请求来源挂起不予处理。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，不再响应当前连接会话内请求，且不会主动断开连接。用于爬虫对抗时，消耗客户端连接资源。
注意：该选项不可与 BlockIp 或 ReturnCustomPage 选项同时启用。
     */
    public String getStall() {
        return this.Stall;
    }

    /**
     * Set 是否对请求来源挂起不予处理。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，不再响应当前连接会话内请求，且不会主动断开连接。用于爬虫对抗时，消耗客户端连接资源。
注意：该选项不可与 BlockIp 或 ReturnCustomPage 选项同时启用。
     * @param Stall 是否对请求来源挂起不予处理。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
启用后，不再响应当前连接会话内请求，且不会主动断开连接。用于爬虫对抗时，消耗客户端连接资源。
注意：该选项不可与 BlockIp 或 ReturnCustomPage 选项同时启用。
     */
    public void setStall(String Stall) {
        this.Stall = Stall;
    }

    public DenyActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DenyActionParameters(DenyActionParameters source) {
        if (source.BlockIp != null) {
            this.BlockIp = new String(source.BlockIp);
        }
        if (source.BlockIpDuration != null) {
            this.BlockIpDuration = new String(source.BlockIpDuration);
        }
        if (source.ReturnCustomPage != null) {
            this.ReturnCustomPage = new String(source.ReturnCustomPage);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new String(source.ResponseCode);
        }
        if (source.ErrorPageId != null) {
            this.ErrorPageId = new String(source.ErrorPageId);
        }
        if (source.Stall != null) {
            this.Stall = new String(source.Stall);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockIp", this.BlockIp);
        this.setParamSimple(map, prefix + "BlockIpDuration", this.BlockIpDuration);
        this.setParamSimple(map, prefix + "ReturnCustomPage", this.ReturnCustomPage);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamSimple(map, prefix + "ErrorPageId", this.ErrorPageId);
        this.setParamSimple(map, prefix + "Stall", this.Stall);

    }
}

