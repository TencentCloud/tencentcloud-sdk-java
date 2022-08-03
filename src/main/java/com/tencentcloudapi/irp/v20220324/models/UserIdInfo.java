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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserIdInfo extends AbstractModel{

    /**
    * 用户ID类型：
1 - qq
2 - qq_md5：md5后的qq
3 - imei：设备imei（安卓10之后不会再授权imei，安卓10之后的imei映射关系可能拿不到，故安卓10之后的设备建议用oaid）
4 - imei_md5：md5后的imei
5 - idfa: Apple 向用户设备随机分配的设备标识符
6 - idfa_md5：md5之后的idfa
7 - gdt_openid：广点通生成的openid
8 - oaid：安卓10之后一种非永久性设备标识符
9 - oaid_md5：md5后的oaid
10 - wx_openid：微信openid
11 - qq_openid：QQ的openid
12 - phone：电话号码
13 - phone_md5：md5后的电话号码
14 - phone_sha256：SHA256加密的手机号
15 - phone_sm3：国密SM3加密的手机号
1000 - 客户自定义id
    */
    @SerializedName("UserIdType")
    @Expose
    private Long UserIdType;

    /**
    * 用户id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 用户ID类型：
1 - qq
2 - qq_md5：md5后的qq
3 - imei：设备imei（安卓10之后不会再授权imei，安卓10之后的imei映射关系可能拿不到，故安卓10之后的设备建议用oaid）
4 - imei_md5：md5后的imei
5 - idfa: Apple 向用户设备随机分配的设备标识符
6 - idfa_md5：md5之后的idfa
7 - gdt_openid：广点通生成的openid
8 - oaid：安卓10之后一种非永久性设备标识符
9 - oaid_md5：md5后的oaid
10 - wx_openid：微信openid
11 - qq_openid：QQ的openid
12 - phone：电话号码
13 - phone_md5：md5后的电话号码
14 - phone_sha256：SHA256加密的手机号
15 - phone_sm3：国密SM3加密的手机号
1000 - 客户自定义id 
     * @return UserIdType 用户ID类型：
1 - qq
2 - qq_md5：md5后的qq
3 - imei：设备imei（安卓10之后不会再授权imei，安卓10之后的imei映射关系可能拿不到，故安卓10之后的设备建议用oaid）
4 - imei_md5：md5后的imei
5 - idfa: Apple 向用户设备随机分配的设备标识符
6 - idfa_md5：md5之后的idfa
7 - gdt_openid：广点通生成的openid
8 - oaid：安卓10之后一种非永久性设备标识符
9 - oaid_md5：md5后的oaid
10 - wx_openid：微信openid
11 - qq_openid：QQ的openid
12 - phone：电话号码
13 - phone_md5：md5后的电话号码
14 - phone_sha256：SHA256加密的手机号
15 - phone_sm3：国密SM3加密的手机号
1000 - 客户自定义id
     */
    public Long getUserIdType() {
        return this.UserIdType;
    }

    /**
     * Set 用户ID类型：
1 - qq
2 - qq_md5：md5后的qq
3 - imei：设备imei（安卓10之后不会再授权imei，安卓10之后的imei映射关系可能拿不到，故安卓10之后的设备建议用oaid）
4 - imei_md5：md5后的imei
5 - idfa: Apple 向用户设备随机分配的设备标识符
6 - idfa_md5：md5之后的idfa
7 - gdt_openid：广点通生成的openid
8 - oaid：安卓10之后一种非永久性设备标识符
9 - oaid_md5：md5后的oaid
10 - wx_openid：微信openid
11 - qq_openid：QQ的openid
12 - phone：电话号码
13 - phone_md5：md5后的电话号码
14 - phone_sha256：SHA256加密的手机号
15 - phone_sm3：国密SM3加密的手机号
1000 - 客户自定义id
     * @param UserIdType 用户ID类型：
1 - qq
2 - qq_md5：md5后的qq
3 - imei：设备imei（安卓10之后不会再授权imei，安卓10之后的imei映射关系可能拿不到，故安卓10之后的设备建议用oaid）
4 - imei_md5：md5后的imei
5 - idfa: Apple 向用户设备随机分配的设备标识符
6 - idfa_md5：md5之后的idfa
7 - gdt_openid：广点通生成的openid
8 - oaid：安卓10之后一种非永久性设备标识符
9 - oaid_md5：md5后的oaid
10 - wx_openid：微信openid
11 - qq_openid：QQ的openid
12 - phone：电话号码
13 - phone_md5：md5后的电话号码
14 - phone_sha256：SHA256加密的手机号
15 - phone_sm3：国密SM3加密的手机号
1000 - 客户自定义id
     */
    public void setUserIdType(Long UserIdType) {
        this.UserIdType = UserIdType;
    }

    /**
     * Get 用户id 
     * @return UserId 用户id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
     * @param UserId 用户id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public UserIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserIdInfo(UserIdInfo source) {
        if (source.UserIdType != null) {
            this.UserIdType = new Long(source.UserIdType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserIdType", this.UserIdType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

