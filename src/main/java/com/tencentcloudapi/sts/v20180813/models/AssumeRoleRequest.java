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
    * 角色的资源描述，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
普通角色：
qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
服务角色：
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920、qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 临时会话名称，由用户自定义名称。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@_-。 正则为：[\w+=,.@_-]*
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
    * 角色外部ID，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@:/-。 正则为：[\w+=,.@:\/-]*
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * 会话标签列表。最多可以传递 50 个会话标签，不支持包含相同标签键。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 角色的资源描述，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
普通角色：
qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
服务角色：
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920、qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName 
     * @return RoleArn 角色的资源描述，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
普通角色：
qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
服务角色：
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920、qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色的资源描述，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
普通角色：
qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
服务角色：
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920、qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
     * @param RoleArn 角色的资源描述，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
普通角色：
qcs::cam::uin/12345678:role/4611686018427397919、qcs::cam::uin/12345678:roleName/testRoleName
服务角色：
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920、qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 临时会话名称，由用户自定义名称。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@_-。 正则为：[\w+=,.@_-]* 
     * @return RoleSessionName 临时会话名称，由用户自定义名称。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@_-。 正则为：[\w+=,.@_-]*
     */
    public String getRoleSessionName() {
        return this.RoleSessionName;
    }

    /**
     * Set 临时会话名称，由用户自定义名称。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@_-。 正则为：[\w+=,.@_-]*
     * @param RoleSessionName 临时会话名称，由用户自定义名称。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@_-。 正则为：[\w+=,.@_-]*
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
     * Get 角色外部ID，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@:/-。 正则为：[\w+=,.@:\/-]* 
     * @return ExternalId 角色外部ID，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@:/-。 正则为：[\w+=,.@:\/-]*
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set 角色外部ID，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@:/-。 正则为：[\w+=,.@:\/-]*
     * @param ExternalId 角色外部ID，可在[访问管理](https://console.cloud.tencent.com/cam/role)，点击角色名获取。
长度在2到128之间，可包含大小写字符，数字以及特殊字符：=,.@:/-。 正则为：[\w+=,.@:\/-]*
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get 会话标签列表。最多可以传递 50 个会话标签，不支持包含相同标签键。 
     * @return Tags 会话标签列表。最多可以传递 50 个会话标签，不支持包含相同标签键。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 会话标签列表。最多可以传递 50 个会话标签，不支持包含相同标签键。
     * @param Tags 会话标签列表。最多可以传递 50 个会话标签，不支持包含相同标签键。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public AssumeRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssumeRoleRequest(AssumeRoleRequest source) {
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.RoleSessionName != null) {
            this.RoleSessionName = new String(source.RoleSessionName);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RoleSessionName", this.RoleSessionName);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

