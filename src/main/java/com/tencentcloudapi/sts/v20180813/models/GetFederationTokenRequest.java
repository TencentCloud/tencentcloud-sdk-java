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
    * 联合身份用户昵称
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
    * 指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Integer DurationSeconds;

    /**
    * 兼容uin名单
    */
    @SerializedName("OpenUin")
    @Expose
    private Integer OpenUin;

    /**
    * 兼容OwnerUin名单
    */
    @SerializedName("OpenOwnerUin")
    @Expose
    private Integer OpenOwnerUin;

    /**
    * ua
    */
    @SerializedName("Ua")
    @Expose
    private String Ua;

    /**
    * mfa
    */
    @SerializedName("Mfa")
    @Expose
    private Integer Mfa;

    /**
    * interfaceName
    */
    @SerializedName("InterfaceName")
    @Expose
    private String InterfaceName;

    /**
    * extraInfo
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * thUin
    */
    @SerializedName("ThUin")
    @Expose
    private Integer ThUin;

    /**
    * thOwnerUin
    */
    @SerializedName("ThOwnerUin")
    @Expose
    private Integer ThOwnerUin;

    /**
    * codeMode
    */
    @SerializedName("CodeMode")
    @Expose
    private String CodeMode;

    /**
     * 获取联合身份用户昵称
     * @return Name 联合身份用户昵称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置联合身份用户昵称
     * @param Name 联合身份用户昵称
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
     * 获取指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒
     * @return DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒
     */
    public Integer getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * 设置指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒
     * @param DurationSeconds 指定临时证书的有效期，单位：秒，默认1800秒，最长可设定有效期为7200秒
     */
    public void setDurationSeconds(Integer DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * 获取兼容uin名单
     * @return OpenUin 兼容uin名单
     */
    public Integer getOpenUin() {
        return this.OpenUin;
    }

    /**
     * 设置兼容uin名单
     * @param OpenUin 兼容uin名单
     */
    public void setOpenUin(Integer OpenUin) {
        this.OpenUin = OpenUin;
    }

    /**
     * 获取兼容OwnerUin名单
     * @return OpenOwnerUin 兼容OwnerUin名单
     */
    public Integer getOpenOwnerUin() {
        return this.OpenOwnerUin;
    }

    /**
     * 设置兼容OwnerUin名单
     * @param OpenOwnerUin 兼容OwnerUin名单
     */
    public void setOpenOwnerUin(Integer OpenOwnerUin) {
        this.OpenOwnerUin = OpenOwnerUin;
    }

    /**
     * 获取ua
     * @return Ua ua
     */
    public String getUa() {
        return this.Ua;
    }

    /**
     * 设置ua
     * @param Ua ua
     */
    public void setUa(String Ua) {
        this.Ua = Ua;
    }

    /**
     * 获取mfa
     * @return Mfa mfa
     */
    public Integer getMfa() {
        return this.Mfa;
    }

    /**
     * 设置mfa
     * @param Mfa mfa
     */
    public void setMfa(Integer Mfa) {
        this.Mfa = Mfa;
    }

    /**
     * 获取interfaceName
     * @return InterfaceName interfaceName
     */
    public String getInterfaceName() {
        return this.InterfaceName;
    }

    /**
     * 设置interfaceName
     * @param InterfaceName interfaceName
     */
    public void setInterfaceName(String InterfaceName) {
        this.InterfaceName = InterfaceName;
    }

    /**
     * 获取extraInfo
     * @return ExtraInfo extraInfo
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * 设置extraInfo
     * @param ExtraInfo extraInfo
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * 获取thUin
     * @return ThUin thUin
     */
    public Integer getThUin() {
        return this.ThUin;
    }

    /**
     * 设置thUin
     * @param ThUin thUin
     */
    public void setThUin(Integer ThUin) {
        this.ThUin = ThUin;
    }

    /**
     * 获取thOwnerUin
     * @return ThOwnerUin thOwnerUin
     */
    public Integer getThOwnerUin() {
        return this.ThOwnerUin;
    }

    /**
     * 设置thOwnerUin
     * @param ThOwnerUin thOwnerUin
     */
    public void setThOwnerUin(Integer ThOwnerUin) {
        this.ThOwnerUin = ThOwnerUin;
    }

    /**
     * 获取codeMode
     * @return CodeMode codeMode
     */
    public String getCodeMode() {
        return this.CodeMode;
    }

    /**
     * 设置codeMode
     * @param CodeMode codeMode
     */
    public void setCodeMode(String CodeMode) {
        this.CodeMode = CodeMode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "OpenUin", this.OpenUin);
        this.setParamSimple(map, prefix + "OpenOwnerUin", this.OpenOwnerUin);
        this.setParamSimple(map, prefix + "Ua", this.Ua);
        this.setParamSimple(map, prefix + "Mfa", this.Mfa);
        this.setParamSimple(map, prefix + "InterfaceName", this.InterfaceName);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ThUin", this.ThUin);
        this.setParamSimple(map, prefix + "ThOwnerUin", this.ThOwnerUin);
        this.setParamSimple(map, prefix + "CodeMode", this.CodeMode);

    }
}

