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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRequest extends AbstractModel {

    /**
    * 实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 密码，该字段为空时候则后端会默认生成。用户自定义密码时，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 64 个字符。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 备注，长度不超过128个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符 
     * @return Username 用户名，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
     * @param Username 用户名，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 密码，该字段为空时候则后端会默认生成。用户自定义密码时，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 64 个字符。 
     * @return Password 密码，该字段为空时候则后端会默认生成。用户自定义密码时，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 64 个字符。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，该字段为空时候则后端会默认生成。用户自定义密码时，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 64 个字符。
     * @param Password 密码，该字段为空时候则后端会默认生成。用户自定义密码时，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 64 个字符。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 备注，长度不超过128个字符。 
     * @return Remark 备注，长度不超过128个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，长度不超过128个字符。
     * @param Remark 备注，长度不超过128个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

