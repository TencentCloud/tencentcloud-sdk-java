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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedirectConfig extends AbstractModel {

    /**
    * <p>重定向状态码</p><p>枚举值：</p><ul><li>301： 永久重定向</li><li>302： 临时重定向</li><li>303： 查看其他位置</li><li>307： 临时重定向（保留请求方法）</li><li>308： 永久重定向（保留请求方法）</li></ul>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>目标地址，填写为空表示关闭重定向。不支持路径填写。</p>
    */
    @SerializedName("TargetUrl")
    @Expose
    private String TargetUrl;

    /**
     * Get <p>重定向状态码</p><p>枚举值：</p><ul><li>301： 永久重定向</li><li>302： 临时重定向</li><li>303： 查看其他位置</li><li>307： 临时重定向（保留请求方法）</li><li>308： 永久重定向（保留请求方法）</li></ul> 
     * @return StatusCode <p>重定向状态码</p><p>枚举值：</p><ul><li>301： 永久重定向</li><li>302： 临时重定向</li><li>303： 查看其他位置</li><li>307： 临时重定向（保留请求方法）</li><li>308： 永久重定向（保留请求方法）</li></ul>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>重定向状态码</p><p>枚举值：</p><ul><li>301： 永久重定向</li><li>302： 临时重定向</li><li>303： 查看其他位置</li><li>307： 临时重定向（保留请求方法）</li><li>308： 永久重定向（保留请求方法）</li></ul>
     * @param StatusCode <p>重定向状态码</p><p>枚举值：</p><ul><li>301： 永久重定向</li><li>302： 临时重定向</li><li>303： 查看其他位置</li><li>307： 临时重定向（保留请求方法）</li><li>308： 永久重定向（保留请求方法）</li></ul>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>目标地址，填写为空表示关闭重定向。不支持路径填写。</p> 
     * @return TargetUrl <p>目标地址，填写为空表示关闭重定向。不支持路径填写。</p>
     */
    public String getTargetUrl() {
        return this.TargetUrl;
    }

    /**
     * Set <p>目标地址，填写为空表示关闭重定向。不支持路径填写。</p>
     * @param TargetUrl <p>目标地址，填写为空表示关闭重定向。不支持路径填写。</p>
     */
    public void setTargetUrl(String TargetUrl) {
        this.TargetUrl = TargetUrl;
    }

    public RedirectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedirectConfig(RedirectConfig source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.TargetUrl != null) {
            this.TargetUrl = new String(source.TargetUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "TargetUrl", this.TargetUrl);

    }
}

