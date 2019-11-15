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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFederationTokenRequest  extends AbstractModel{

    /**
    * 调用方英文名称，由字母组成。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照云 API 规范再 urlencode 一次）。
2、策略语法参照 CAM 策略语法。
3、策略中不能包含 principal 元素。
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒。
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Integer DurationSeconds;

    /**
     * 获取调用方英文名称，由字母组成。
     * @return Name 调用方英文名称，由字母组成。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置调用方英文名称，由字母组成。
     * @param Name 调用方英文名称，由字母组成。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照云 API 规范再 urlencode 一次）。
2、策略语法参照 CAM 策略语法。
3、策略中不能包含 principal 元素。
     * @return Policy 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照云 API 规范再 urlencode 一次）。
2、策略语法参照 CAM 策略语法。
3、策略中不能包含 principal 元素。
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * 设置策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照云 API 规范再 urlencode 一次）。
2、策略语法参照 CAM 策略语法。
3、策略中不能包含 principal 元素。
     * @param Policy 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照云 API 规范再 urlencode 一次）。
2、策略语法参照 CAM 策略语法。
3、策略中不能包含 principal 元素。
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * 获取指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒。
     * @return DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒。
     */
    public Integer getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * 设置指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒。
     * @param DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒。
     */
    public void setDurationSeconds(Integer DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

