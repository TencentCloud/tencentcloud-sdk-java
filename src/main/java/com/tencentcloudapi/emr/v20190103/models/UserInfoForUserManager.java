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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfoForUserManager extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户所属的组
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 密码
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * 备注
    */
    @SerializedName("ReMark")
    @Expose
    private String ReMark;

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户所属的组 
     * @return UserGroup 用户所属的组
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户所属的组
     * @param UserGroup 用户所属的组
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get 密码 
     * @return PassWord 密码
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set 密码
     * @param PassWord 密码
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get 备注 
     * @return ReMark 备注
     */
    public String getReMark() {
        return this.ReMark;
    }

    /**
     * Set 备注
     * @param ReMark 备注
     */
    public void setReMark(String ReMark) {
        this.ReMark = ReMark;
    }

    public UserInfoForUserManager() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfoForUserManager(UserInfoForUserManager source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.ReMark != null) {
            this.ReMark = new String(source.ReMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "ReMark", this.ReMark);

    }
}

