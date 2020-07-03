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

public class AssumeRoleRequest extends AbstractModel{

    /**
    * 角色的资源描述。例如：qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 临时会话名称，由用户自定义名称
    */
    @SerializedName("RoleSessionName")
    @Expose
    private String RoleSessionName;

    /**
    * 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
    * 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照[云 API 规范](https://cloud.tencent.com/document/api/598/33159#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2)再 urlencode 一次）。
2、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
3、策略中不能包含 principal 元素。
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
     * Get 角色的资源描述。例如：qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName 
     * @return RoleArn 角色的资源描述。例如：qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色的资源描述。例如：qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
     * @param RoleArn 角色的资源描述。例如：qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 临时会话名称，由用户自定义名称 
     * @return RoleSessionName 临时会话名称，由用户自定义名称
     */
    public String getRoleSessionName() {
        return this.RoleSessionName;
    }

    /**
     * Set 临时会话名称，由用户自定义名称
     * @param RoleSessionName 临时会话名称，由用户自定义名称
     */
    public void setRoleSessionName(String RoleSessionName) {
        this.RoleSessionName = RoleSessionName;
    }

    /**
     * Get 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒 
     * @return DurationSeconds 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
     * @param DurationSeconds 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Get 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照[云 API 规范](https://cloud.tencent.com/document/api/598/33159#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2)再 urlencode 一次）。
2、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
3、策略中不能包含 principal 元素。 
     * @return Policy 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照[云 API 规范](https://cloud.tencent.com/document/api/598/33159#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2)再 urlencode 一次）。
2、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
3、策略中不能包含 principal 元素。
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照[云 API 规范](https://cloud.tencent.com/document/api/598/33159#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2)再 urlencode 一次）。
2、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
3、策略中不能包含 principal 元素。
     * @param Policy 策略描述
注意：
1、policy 需要做 urlencode（如果通过 GET 方法请求云 API，发送请求前，所有参数都需要按照[云 API 规范](https://cloud.tencent.com/document/api/598/33159#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2)再 urlencode 一次）。
2、策略语法参照[ CAM 策略语法](https://cloud.tencent.com/document/product/598/10603)。
3、策略中不能包含 principal 元素。
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RoleSessionName", this.RoleSessionName);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "Policy", this.Policy);

    }
}

