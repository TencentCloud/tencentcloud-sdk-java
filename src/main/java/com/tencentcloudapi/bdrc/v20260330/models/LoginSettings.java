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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSettings extends AbstractModel {

    /**
    * 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：Linux 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以"/"开头，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/。Windows 实例密码必须 12-30 位，不能以"/"开头且不包括用户名，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;' <>,.?/。若不指定该参数，则由系统随机生成密码，并通过站内信方式通知到用户。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 密钥ID列表。关联密钥后，就可以通过对应的私钥来访问实例；KeyId可通过接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) 获取，密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。当前仅支持购买的时候指定一个密钥。
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * 保持镜像的原始设置。该参数与 Password 或 KeyIds.N 不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为 TRUE。取值范围：TRUE（表示保持镜像的登录设置）/FALSE（表示不保持镜像的登录设置）。默认取值：FALSE。
    */
    @SerializedName("KeepImageLogin")
    @Expose
    private String KeepImageLogin;

    /**
     * Get 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：Linux 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以"/"开头，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/。Windows 实例密码必须 12-30 位，不能以"/"开头且不包括用户名，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;' <>,.?/。若不指定该参数，则由系统随机生成密码，并通过站内信方式通知到用户。 
     * @return Password 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：Linux 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以"/"开头，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/。Windows 实例密码必须 12-30 位，不能以"/"开头且不包括用户名，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;' <>,.?/。若不指定该参数，则由系统随机生成密码，并通过站内信方式通知到用户。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：Linux 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以"/"开头，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/。Windows 实例密码必须 12-30 位，不能以"/"开头且不包括用户名，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;' <>,.?/。若不指定该参数，则由系统随机生成密码，并通过站内信方式通知到用户。
     * @param Password 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：Linux 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以"/"开头，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;'<>,.?/。Windows 实例密码必须 12-30 位，不能以"/"开头且不包括用户名，至少包含以下字符中的三种不同字符，字符种类：小写字母 a-z、大写字母 A-Z、数字 0-9、特殊字符 ()`~!@#$%^&*-+=_|{}[]:;' <>,.?/。若不指定该参数，则由系统随机生成密码，并通过站内信方式通知到用户。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 密钥ID列表。关联密钥后，就可以通过对应的私钥来访问实例；KeyId可通过接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) 获取，密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。当前仅支持购买的时候指定一个密钥。 
     * @return KeyIds 密钥ID列表。关联密钥后，就可以通过对应的私钥来访问实例；KeyId可通过接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) 获取，密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。当前仅支持购买的时候指定一个密钥。
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set 密钥ID列表。关联密钥后，就可以通过对应的私钥来访问实例；KeyId可通过接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) 获取，密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。当前仅支持购买的时候指定一个密钥。
     * @param KeyIds 密钥ID列表。关联密钥后，就可以通过对应的私钥来访问实例；KeyId可通过接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) 获取，密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。当前仅支持购买的时候指定一个密钥。
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get 保持镜像的原始设置。该参数与 Password 或 KeyIds.N 不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为 TRUE。取值范围：TRUE（表示保持镜像的登录设置）/FALSE（表示不保持镜像的登录设置）。默认取值：FALSE。 
     * @return KeepImageLogin 保持镜像的原始设置。该参数与 Password 或 KeyIds.N 不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为 TRUE。取值范围：TRUE（表示保持镜像的登录设置）/FALSE（表示不保持镜像的登录设置）。默认取值：FALSE。
     */
    public String getKeepImageLogin() {
        return this.KeepImageLogin;
    }

    /**
     * Set 保持镜像的原始设置。该参数与 Password 或 KeyIds.N 不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为 TRUE。取值范围：TRUE（表示保持镜像的登录设置）/FALSE（表示不保持镜像的登录设置）。默认取值：FALSE。
     * @param KeepImageLogin 保持镜像的原始设置。该参数与 Password 或 KeyIds.N 不能同时指定。只有使用自定义镜像、共享镜像或外部导入镜像创建实例时才能指定该参数为 TRUE。取值范围：TRUE（表示保持镜像的登录设置）/FALSE（表示不保持镜像的登录设置）。默认取值：FALSE。
     */
    public void setKeepImageLogin(String KeepImageLogin) {
        this.KeepImageLogin = KeepImageLogin;
    }

    public LoginSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginSettings(LoginSettings source) {
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.KeepImageLogin != null) {
            this.KeepImageLogin = new String(source.KeepImageLogin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "KeepImageLogin", this.KeepImageLogin);

    }
}

