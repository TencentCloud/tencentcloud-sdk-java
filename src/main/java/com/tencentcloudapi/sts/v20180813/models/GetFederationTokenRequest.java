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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFederationTokenRequest extends AbstractModel {

    /**
    * 您可以自定义调用方英文名称，由字母组成。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 注意：
1、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
2、策略中不能包含 principal 元素。
3、该参数需要做urlencode，服务端会对该字段做urldecode， 并按处理后Policy授予临时访问凭证权限，请按规范传入参数。
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get 您可以自定义调用方英文名称，由字母组成。 
     * @return Name 您可以自定义调用方英文名称，由字母组成。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 您可以自定义调用方英文名称，由字母组成。
     * @param Name 您可以自定义调用方英文名称，由字母组成。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 注意：
1、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
2、策略中不能包含 principal 元素。
3、该参数需要做urlencode，服务端会对该字段做urldecode， 并按处理后Policy授予临时访问凭证权限，请按规范传入参数。 
     * @return Policy 注意：
1、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
2、策略中不能包含 principal 元素。
3、该参数需要做urlencode，服务端会对该字段做urldecode， 并按处理后Policy授予临时访问凭证权限，请按规范传入参数。
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 注意：
1、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
2、策略中不能包含 principal 元素。
3、该参数需要做urlencode，服务端会对该字段做urldecode， 并按处理后Policy授予临时访问凭证权限，请按规范传入参数。
     * @param Policy 注意：
1、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
2、策略中不能包含 principal 元素。
3、该参数需要做urlencode，服务端会对该字段做urldecode， 并按处理后Policy授予临时访问凭证权限，请按规范传入参数。
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。 
     * @return DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
     * @param DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，主账号最长可设定有效期为7200秒，子账号最长可设定有效期为129600秒。
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public GetFederationTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFederationTokenRequest(GetFederationTokenRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

