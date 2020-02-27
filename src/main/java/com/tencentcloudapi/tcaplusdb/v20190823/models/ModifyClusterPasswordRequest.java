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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterPasswordRequest extends AbstractModel{

    /**
    * 需要修改密码的集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群旧密码
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
    * 集群旧密码预期失效时间
    */
    @SerializedName("OldPasswordExpireTime")
    @Expose
    private String OldPasswordExpireTime;

    /**
    * 集群新密码，密码必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
    * 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 需要修改密码的集群ID 
     * @return ClusterId 需要修改密码的集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 需要修改密码的集群ID
     * @param ClusterId 需要修改密码的集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群旧密码 
     * @return OldPassword 集群旧密码
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * Set 集群旧密码
     * @param OldPassword 集群旧密码
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    /**
     * Get 集群旧密码预期失效时间 
     * @return OldPasswordExpireTime 集群旧密码预期失效时间
     */
    public String getOldPasswordExpireTime() {
        return this.OldPasswordExpireTime;
    }

    /**
     * Set 集群旧密码预期失效时间
     * @param OldPasswordExpireTime 集群旧密码预期失效时间
     */
    public void setOldPasswordExpireTime(String OldPasswordExpireTime) {
        this.OldPasswordExpireTime = OldPasswordExpireTime;
    }

    /**
     * Get 集群新密码，密码必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母 
     * @return NewPassword 集群新密码，密码必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set 集群新密码，密码必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
     * @param NewPassword 集群新密码，密码必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     * Get 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式 
     * @return Mode 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
     * @param Mode 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);
        this.setParamSimple(map, prefix + "OldPasswordExpireTime", this.OldPasswordExpireTime);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

